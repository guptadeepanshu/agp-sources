/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.build.gradle.tasks

import com.android.SdkConstants
import com.android.build.api.artifact.ArtifactTransformationRequest
import com.android.build.api.variant.BuiltArtifact
import com.android.build.api.variant.impl.dirName
import com.android.build.gradle.internal.component.ApkCreationConfig
import com.android.build.gradle.internal.scope.InternalArtifactType
import com.android.build.gradle.internal.tasks.BuildAnalyzer
import com.android.build.gradle.internal.tasks.NonIncrementalTask
import com.android.build.gradle.internal.tasks.factory.VariantTaskCreationAction
import com.android.build.gradle.internal.utils.setDisallowChanges
import com.android.build.gradle.internal.workeractions.DecoratedWorkParameters
import com.android.build.gradle.internal.workeractions.WorkActionAdapter
import com.android.buildanalyzer.common.TaskCategory
import com.android.manifmerger.ManifestMerger2
import com.android.manifmerger.ManifestUtils
import com.android.manifmerger.XmlDocument
import com.android.utils.FileUtils
import com.android.utils.PositionXmlParser
import org.gradle.api.file.Directory
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.CacheableTask
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.TaskProvider
import org.gradle.workers.WorkerExecutor
import org.w3c.dom.Document
import java.io.BufferedInputStream
import java.io.File
import java.io.FileInputStream
import javax.inject.Inject

@CacheableTask
@BuildAnalyzer(primaryTaskCategory = TaskCategory.MANIFEST)
abstract class ProcessManifestForInstantAppTask @Inject constructor(
    @get:Internal
    val workers: WorkerExecutor
): NonIncrementalTask() {

    @get:OutputDirectory
    abstract val instantAppManifests: DirectoryProperty

    @get:InputFiles
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val mergedManifests: DirectoryProperty

    @get:Internal
    abstract val transformationRequest: Property<ArtifactTransformationRequest<ProcessManifestForInstantAppTask>>

    override fun doTaskAction() {

        transformationRequest.get().submit(this,
            workers.noIsolation(),
            WorkItem::class.java)
        { builtArtifact: BuiltArtifact, directory: Directory, parameters: WorkItemParameters ->
            parameters.inputXmlFile.set(File(builtArtifact.outputFile))
            parameters.outputXmlFile.set(
                FileUtils.join(
                    directory.asFile,
                    builtArtifact.dirName(),
                    SdkConstants.ANDROID_MANIFEST_XML))
            parameters.outputXmlFile.get().asFile
        }
    }

    interface WorkItemParameters: DecoratedWorkParameters {
        val inputXmlFile: RegularFileProperty
        val outputXmlFile: RegularFileProperty
    }

    abstract class WorkItem@Inject constructor(private val parameters: WorkItemParameters)
        : WorkActionAdapter<WorkItemParameters> {

        override fun getParameters(): WorkItemParameters = parameters

        override fun doExecute() {
            val xmlDocument = BufferedInputStream(
                FileInputStream(
                    parameters.inputXmlFile.get().asFile)
            ).use {
                PositionXmlParser.parse(it)
            }
            setTargetSandboxVersionAttribute(xmlDocument)
            parameters.outputXmlFile.get().asFile.writeText(
                XmlDocument.prettyPrint(xmlDocument))
        }

        /**
         * Set "android:targetSandboxVersion" attribute for the manifest element.
         *
         * @param document the document whose attributes will be modified
         * @return the previous value of the targetSandboxVersion attribute or null if
         * targetSandboxVersion was not set.
         */
        private fun setTargetSandboxVersionAttribute(
            document: Document
        ): String? {
            return ManifestUtils.setManifestAndroidAttribute(
                document, SdkConstants.ATTR_TARGET_SANDBOX_VERSION, "2"
            )
        }
    }

    class CreationAction(creationConfig: ApkCreationConfig) :
        VariantTaskCreationAction<ProcessManifestForInstantAppTask, ApkCreationConfig>(
            creationConfig = creationConfig
        ) {
        override val name: String
            get() = computeTaskName("process", "ManifestForInstantApp")
        override val type: Class<ProcessManifestForInstantAppTask>
            get() = ProcessManifestForInstantAppTask::class.java

        private lateinit var transformationRequest: ArtifactTransformationRequest<ProcessManifestForInstantAppTask>

        override fun handleProvider(taskProvider: TaskProvider<ProcessManifestForInstantAppTask>) {
            super.handleProvider(taskProvider)
            transformationRequest = creationConfig.artifacts.use(taskProvider)
                .wiredWithDirectories(
                    ProcessManifestForInstantAppTask::mergedManifests,
                    ProcessManifestForInstantAppTask::instantAppManifests)
                .toTransformMany(
                    InternalArtifactType.MERGED_MANIFESTS,
                    InternalArtifactType.INSTANT_APP_MANIFEST)
        }

        override fun configure(task: ProcessManifestForInstantAppTask) {
            super.configure(task)
            task.transformationRequest.setDisallowChanges(transformationRequest)
        }
    }
}
