/*
 * Copyright (C) 2022 The Android Open Source Project
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
package com.android.build.gradle.internal.tasks

import com.android.SdkConstants.EXT_ASB
import com.android.SdkConstants.DOT_ASB
import com.android.SdkConstants.DOT_APKS
import com.android.apksig.apk.ApkUtils
import com.android.build.api.variant.impl.BuiltArtifactImpl
import com.android.build.api.variant.impl.BuiltArtifactsImpl
import com.android.build.gradle.internal.dependency.GenericTransformParameters
import com.android.build.gradle.internal.profile.AnalyticsService
import com.android.build.gradle.internal.scope.InternalArtifactType
import com.android.build.gradle.internal.services.Aapt2Input
import com.android.build.gradle.internal.services.getAapt2Executable
import com.android.build.gradle.internal.signing.SigningConfigData
import com.android.build.gradle.internal.tasks.Workers.withThreads
import com.android.ide.common.workers.ExecutorServiceAdapter
import com.android.tools.build.bundletool.androidtools.Aapt2Command
import com.android.tools.build.bundletool.commands.BuildSdkApksCommand
import com.android.utils.FileUtils
import com.android.utils.PathUtils
import com.android.zipflinger.ZipArchive
import com.google.common.util.concurrent.MoreExecutors
import org.gradle.api.artifacts.transform.CacheableTransform
import org.gradle.api.artifacts.transform.InputArtifact
import org.gradle.api.artifacts.transform.TransformAction
import org.gradle.api.artifacts.transform.TransformOutputs
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.FileSystemLocation
import org.gradle.api.provider.Property
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.Nested
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import java.io.File
import java.nio.file.Files
import java.util.concurrent.ForkJoinPool
import kotlin.io.path.nameWithoutExtension

/**
 * Transform for generating extracted privacy sandbox APKs signed with the debug key.
 */
@CacheableTransform
abstract class AsarToExtractedApksTransform: TransformAction<AsarToExtractedApksTransform.AsarToExtractedApksTransformParameters> {

    interface AsarToExtractedApksTransformParameters : GenericTransformParameters {
        @get:Nested
        val aapt2: Aapt2Input

        @get:Nested
        val signingConfigData: Property<SigningConfigData>

        @get:InputFiles
        @get:PathSensitive(PathSensitivity.NONE)
        val signingConfigValidationResultDir: DirectoryProperty

        @get:Internal
        val analyticsService: Property<AnalyticsService>

        @get:Internal
        val workerFacade: ExecutorServiceAdapter
            get() = withThreads("AsarToExtractedApksTransform", analyticsService.get())
    }

    @PathSensitive(PathSensitivity.NAME_ONLY)
    @InputArtifact
    abstract fun getInputArtifact(): Provider<FileSystemLocation>

    override fun transform(outputs: TransformOutputs) {
        val inputFile = getInputArtifact().get().asFile.toPath()
        val outputDir = outputs.dir(inputFile.nameWithoutExtension).toPath()
        var sdkApksFile = outputDir.resolve(inputFile.nameWithoutExtension + DOT_APKS)
        val tempDir = Files.createTempDirectory(EXT_ASB)
        try {
            // Workaround for lack of asar to apks support (b/235469089)
            val renamedInputFile = tempDir.resolve(inputFile.fileName.toString().substringBeforeLast('.') + DOT_ASB)
            FileUtils.copyFile(inputFile, renamedInputFile)
            val aapt2Executable = parameters.aapt2.getAapt2Executable().toFile().toPath()
            val signingConfigData = parameters.signingConfigData.get()

            val command = BuildSdkApksCommand.builder()
                    .setExecutorService(MoreExecutors.listeningDecorator(parameters.workerFacade.executor))
                    .setSdkBundlePath(renamedInputFile)
                    .setOutputFile(sdkApksFile)
                    .setAapt2Command(Aapt2Command.createFromExecutablePath(aapt2Executable))
                    .setSigningConfiguration(signingConfigData)
                    .setVersionCode(1) //TODO(b/235469089): What should this be?
                    .setMinSdkVersion(33)
            command.build().execute()
            val outputFile = outputDir.resolve("standalone.apk")
            ZipArchive(sdkApksFile).use { sdkApks ->
                sdkApks.getInputStream("standalones/standalone.apk").use { inputStream ->
                    Files.copy(inputStream, outputFile)
                    ZipArchive(outputFile).use { apk ->
                        BuiltArtifactsImpl(
                            artifactType = InternalArtifactType.EXTRACTED_APKS_FROM_PRIVACY_SANDBOX_SDKs,
                            applicationId = ApkUtils.getPackageNameFromBinaryAndroidManifest(apk.getContent("AndroidManifest.xml")),
                            variantName = "",
                            elements = listOf(
                                BuiltArtifactImpl.make(
                                    outputFile = outputFile.toString(),
                                )
                            )
                        ).saveToDirectory(outputDir.toFile())
                    }
                }
            }
        } finally {
            PathUtils.deleteRecursivelyIfExists(tempDir)
        }
    }
}
