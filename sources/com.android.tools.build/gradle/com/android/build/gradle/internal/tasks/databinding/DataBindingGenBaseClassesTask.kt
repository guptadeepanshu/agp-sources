/*
 * Copyright (C) 2017 The Android Open Source Project
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

package com.android.build.gradle.internal.tasks.databinding

import android.databinding.tool.BaseDataBinder
import android.databinding.tool.DataBindingBuilder
import android.databinding.tool.processing.ScopedException
import android.databinding.tool.store.LayoutInfoInput
import android.databinding.tool.util.L
import com.android.build.gradle.internal.component.ComponentCreationConfig
import com.android.build.gradle.internal.component.DeviceTestCreationConfig
import com.android.build.gradle.internal.publishing.AndroidArtifacts
import com.android.build.gradle.internal.scope.InternalArtifactType
import com.android.build.gradle.internal.services.SymbolTableBuildService
import com.android.build.gradle.internal.services.getBuildService
import com.android.build.gradle.internal.tasks.BuildAnalyzer
import com.android.build.gradle.internal.tasks.NewIncrementalTask
import com.android.build.gradle.internal.tasks.factory.VariantTaskCreationAction
import com.android.build.gradle.internal.utils.fromDisallowChanges
import com.android.build.gradle.internal.utils.setDisallowChanges
import com.android.build.gradle.options.BooleanOption
import com.android.buildanalyzer.common.TaskCategory
import com.android.ide.common.symbols.SymbolIo
import com.android.ide.common.symbols.SymbolTable
import com.android.resources.ResourceType
import com.android.utils.FileUtils
import org.apache.log4j.Logger
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.CacheableTask
import org.gradle.api.tasks.Classpath
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskProvider
import org.gradle.work.ChangeType
import org.gradle.work.Incremental
import org.gradle.work.InputChanges
import java.io.File
import java.io.Serializable
import javax.inject.Inject
import javax.tools.Diagnostic

/**
 * Generates base classes from data binding info files.
 *
 * This class takes the output of XML processor which generates binding info files (binding
 * information in layout files). Then it generates base classes which are the classes accessed
 * by the user code.
 *
 * Generating these classes in gradle instead of annotation processor avoids showing too many
 * errors to the user if the compilation fails before annotation processor output classes are
 * compiled.
 */
@CacheableTask
@BuildAnalyzer(primaryTaskCategory = TaskCategory.DATA_BINDING, secondaryTaskCategories = [TaskCategory.SOURCE_GENERATION])
abstract class DataBindingGenBaseClassesTask : NewIncrementalTask() {
    // where xml info files are
    @get:InputFiles
    @get:Incremental
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val layoutInfoDirectory: DirectoryProperty

    // the package name for the module / app
    @get:Input
    abstract val namespace: Property<String>

    // list of artifacts from dependencies
    @get:InputFiles
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val dependencyClassLogDirectories: ConfigurableFileCollection

    @get:InputFiles
    @get:Optional
    @get:Classpath
    abstract val dependenciesFileCollection: ConfigurableFileCollection

    // Package-aware R.txt file for the given module. Instead of actual package it will contain the
    // keyword "local". Additionally, first line is a comment. For generating references to this
    // local R the default package of this module
    // should be used.
    // See [com.android.ide.common.symbols.SymbolIo] for read/write instructions.
    @get:InputFile
    @get:Optional
    @get:PathSensitive(PathSensitivity.NONE)
    abstract val localResourcesFile: RegularFileProperty

    @get:Internal
    abstract val symbolTableBuildService: Property<SymbolTableBuildService>

    // list of v1 artifacts from dependencies
    @get:Optional
    @get:InputFiles
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val v1Artifacts: DirectoryProperty

    // where to keep the log of the task
    @get:OutputDirectory lateinit var logOutFolder: File
        private set
    // where to write the new files
    @get:OutputDirectory abstract val sourceOutFolder: DirectoryProperty
    @get:OutputDirectory abstract val classInfoBundleDir: DirectoryProperty

    @get:Input
    var useAndroidX: Boolean = false
        private set
    @get:Internal
    var encodeErrors: Boolean = false
        private set
    @get:Input
    var enableViewBinding: Boolean = false
        private set
    @get:Input
    var enableDataBinding: Boolean = false
        private set
    @get:Input
    var enableRPackageLookup: Boolean = false
        private set

    override fun doTaskAction(inputChanges: InputChanges) {
        // TODO figure out why worker execution makes the task flake.
        // Some files cannot be accessed even though they show up when directory listing is
        // invoked.
        // b/69652332
        val args = buildInputArgs(inputChanges)
        CodeGenerator(
            args,
            sourceOutFolder.get().asFile,
            Logger.getLogger(DataBindingGenBaseClassesTask::class.java),
            encodeErrors,
            getRPackageProvider()).run()
    }

    private fun collectResources(): List<SymbolTable> {

        // TODO: maybe filter by ResourceType.ID
        val depSymbolTables: List<SymbolTable> =
                symbolTableBuildService.get().loadClasspath(dependenciesFileCollection.files)
        val localTable = when (val localR = localResourcesFile.orNull) {
            null -> SymbolTable.EMPTY
            else -> SymbolIo.readRDef(localR.asFile.toPath()).rename("")
        }
        return listOf(localTable).plus(depSymbolTables)
    }

    private fun getRPackageProvider(): ((String, String) -> String)? {
        if (!enableRPackageLookup) {
            return null
        }
        val symbolTables: List<SymbolTable> =  collectResources()
        val getRPackage: (String, String) -> String = fun(type: String, name: String): String {
            symbolTables.forEach {
                if (it.containsSymbol(ResourceType.fromXmlTagName(type)!!, name)) {
                    return it.tablePackage
                }
            }
            error("Cannot find resource: $type $name")
        }
        return getRPackage
    }

    private fun buildInputArgs(inputs: InputChanges): LayoutInfoInput.Args {
        val outOfDate = ArrayList<File>()
        val removed = ArrayList<File>()
        val layoutInfoDir = layoutInfoDirectory.get().asFile

        // if dependency added/removed a file, it is handled by the LayoutInfoInput class
        if (inputs.isIncremental) {
            inputs.getFileChanges(layoutInfoDirectory).forEach { change ->
                if (change.normalizedPath.endsWith(".xml")) {
                    if (change.changeType == ChangeType.REMOVED) {
                        removed.add(change.file)
                    } else {
                        outOfDate.add(change.file)
                    }
                }
            }
        } else {
            FileUtils.cleanOutputDir(logOutFolder)
            FileUtils.cleanOutputDir(sourceOutFolder.get().asFile)
        }
        return LayoutInfoInput.Args(
                outOfDate = outOfDate,
                removed = removed,
                infoFolder = layoutInfoDir,
                dependencyClassesFolders = dependencyClassLogDirectories.files.toList(),
                logFolder = logOutFolder,
                incremental = inputs.isIncremental,
                packageName = namespace.get(),
                artifactFolder = classInfoBundleDir.get().asFile,
                v1ArtifactsFolder = v1Artifacts.orNull?.asFile,
                useAndroidX = useAndroidX,
                enableViewBinding = enableViewBinding,
                enableDataBinding = enableDataBinding
        )
    }

    class CreationAction(creationConfig: ComponentCreationConfig) :
        VariantTaskCreationAction<DataBindingGenBaseClassesTask, ComponentCreationConfig>(
            creationConfig
        ) {

        override val name: String
            get() = computeTaskName("dataBindingGenBaseClasses")
        override val type: Class<DataBindingGenBaseClassesTask>
            get() = DataBindingGenBaseClassesTask::class.java

        override fun handleProvider(
            taskProvider: TaskProvider<DataBindingGenBaseClassesTask>
        ) {
            super.handleProvider(taskProvider)
            creationConfig.artifacts.setInitialProvider(
                taskProvider,
                DataBindingGenBaseClassesTask::classInfoBundleDir
            ).withName("out").on(InternalArtifactType.DATA_BINDING_BASE_CLASS_LOG_ARTIFACT)
            creationConfig.artifacts.setInitialProvider(
                taskProvider,
                DataBindingGenBaseClassesTask::sourceOutFolder
            ).withName("out").on(InternalArtifactType.DATA_BINDING_BASE_CLASS_SOURCE_OUT)
        }

        override fun configure(
            task: DataBindingGenBaseClassesTask
        ) {
            super.configure(task)
            val artifacts = creationConfig.artifacts

            creationConfig.artifacts.setTaskInputToFinalProduct(
                DataBindingCompilerArguments.getLayoutInfoArtifactType(creationConfig),
                task.layoutInfoDirectory)

            task.namespace.setDisallowChanges(creationConfig.namespace)

            task.dependencyClassLogDirectories.fromDisallowChanges(
                    creationConfig.variantDependencies.getArtifactFileCollection(
                        AndroidArtifacts.ConsumedConfigType.COMPILE_CLASSPATH,
                        AndroidArtifacts.ArtifactScope.ALL,
                        AndroidArtifacts.ArtifactType.DATA_BINDING_BASE_CLASS_LOG_ARTIFACT
                    )
            )

            artifacts.setTaskInputToFinalProduct(
                    InternalArtifactType.DATA_BINDING_DEPENDENCY_ARTIFACTS, task.v1Artifacts)
            task.logOutFolder = creationConfig.paths.getIncrementalDir(task.name)
            task.useAndroidX = creationConfig.services.projectOptions[BooleanOption.USE_ANDROID_X]
            // needed to decide whether data binding should encode errors or not
            task.encodeErrors = creationConfig.services
                .projectOptions[BooleanOption.IDE_INVOKED_FROM_IDE]
            task.enableViewBinding = creationConfig.buildFeatures.viewBinding
            task.enableDataBinding = creationConfig.buildFeatures.dataBinding

            val isNonTransitiveR =
                    creationConfig.services.projectOptions[BooleanOption.NON_TRANSITIVE_R_CLASS]

            // TODO(b/138780301): Since we do not generate compile time R class in android tests,
            //  we don't want to perform symbol lookups to determine R package of resources during
            //  view binding.
            task.enableRPackageLookup = creationConfig !is DeviceTestCreationConfig
                    && isNonTransitiveR

            if (task.enableRPackageLookup) {
                artifacts.setTaskInputToFinalProduct(
                        InternalArtifactType.LOCAL_ONLY_SYMBOL_LIST,
                        task.localResourcesFile
                )

                task.dependenciesFileCollection.from(
                    creationConfig
                        .variantDependencies.getArtifactFileCollection(
                            AndroidArtifacts.ConsumedConfigType.COMPILE_CLASSPATH,
                            AndroidArtifacts.ArtifactScope.ALL,
                            AndroidArtifacts.ArtifactType.APP_SYMBOL_LIST_FOR_DATA_BINDING
                        )
                )

                task.dependenciesFileCollection.fromDisallowChanges(
                    creationConfig
                        .variantDependencies.getArtifactFileCollection(
                            AndroidArtifacts.ConsumedConfigType.RUNTIME_CLASSPATH,
                            AndroidArtifacts.ArtifactScope.ALL,
                            AndroidArtifacts.ArtifactType.SYMBOL_LIST_WITH_PACKAGE_NAME
                        )
                )

                task.symbolTableBuildService.set(
                        getBuildService(creationConfig.services.buildServiceRegistry))
            }
        }
    }

    class CodeGenerator @Inject constructor(
        val args: LayoutInfoInput.Args,
        private val sourceOutFolder: File,
        private val logger: Logger,
        private val encodeErrors: Boolean,
        private val getRPackage: ((String, String) -> (String))?
    ) : Runnable, Serializable {
        override fun run() {
            try {
                initLogger()
                BaseDataBinder(
                        LayoutInfoInput(args),
                        getRPackage)
                    .generateAll(DataBindingBuilder.GradleFileWriter(sourceOutFolder.absolutePath))
            } finally {
                clearLogger()
            }
        }

        private fun initLogger() {
            ScopedException.encodeOutput(encodeErrors)
            L.setClient { kind, message, _ ->
                printMessage(kind, message)
            }
        }

        private fun printMessage(kind: Diagnostic.Kind, message: String) {
            when(kind) {
                Diagnostic.Kind.ERROR -> logger.error(message)
                Diagnostic.Kind.WARNING -> logger.warn(message)
                else -> logger.info(message)
            }
        }

        private fun clearLogger() {
            L.setClient(null)
        }
    }
}
