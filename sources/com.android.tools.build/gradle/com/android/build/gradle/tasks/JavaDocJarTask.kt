/*
 * Copyright (C) 2021 The Android Open Source Project
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
import com.android.build.gradle.internal.component.ComponentCreationConfig
import com.android.build.gradle.internal.scope.InternalArtifactType
import com.android.build.gradle.internal.scope.getOutputPath
import com.android.build.gradle.internal.tasks.VariantAwareTask
import com.android.build.gradle.internal.tasks.factory.VariantTaskCreationAction
import org.gradle.api.attributes.DocsType
import org.gradle.api.file.DuplicatesStrategy
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.TaskProvider
import org.gradle.api.tasks.bundling.Jar
import org.gradle.work.DisableCachingByDefault

/**
 * Package Java docs generated by [JavaDocGenerationTask] into a jar for maven publishing.
 */
@DisableCachingByDefault
abstract class JavaDocJarTask : Jar(), VariantAwareTask {

    @Internal
    override lateinit var variantName: String

    class CreationAction(
        creationConfig: ComponentCreationConfig
    ) : VariantTaskCreationAction<JavaDocJarTask, ComponentCreationConfig>(
        creationConfig
    ) {
        override val type: Class<JavaDocJarTask>
            get() = JavaDocJarTask::class.java

        override val name: String
            get() = computeTaskName("javaDoc", "Jar")

        override fun handleProvider(taskProvider: TaskProvider<JavaDocJarTask>) {
            super.handleProvider(taskProvider)

            val propertyProvider = { task: JavaDocJarTask ->
                val property = task.project.objects.fileProperty()
                property.set(task.archiveFile)
                property
            }
            creationConfig.artifacts.setInitialProvider(taskProvider, propertyProvider)
                .on(InternalArtifactType.JAVA_DOC_JAR)
        }

        override fun configure(task: JavaDocJarTask) {
            super.configure(task)

            task.duplicatesStrategy = DuplicatesStrategy.FAIL
            task.isReproducibleFileOrder = true
            task.isPreserveFileTimestamps = false

            task.from(creationConfig.artifacts.get(InternalArtifactType.JAVA_DOC_DIR))

            val outputFile =
                InternalArtifactType.JAVA_DOC_JAR
                    .getOutputPath(
                        creationConfig.artifacts.buildDirectory,
                        creationConfig.name,
                        "${creationConfig.name}-${DocsType.JAVADOC}.jar"
                    )

            task.archiveFileName.set(outputFile.name)
            task.destinationDirectory.set(outputFile.parentFile)
            task.archiveExtension.set(SdkConstants.EXT_JAR)
        }
    }
}
