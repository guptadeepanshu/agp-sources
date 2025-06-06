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

package com.android.build.gradle.tasks;

import com.android.annotations.NonNull;
import com.android.build.gradle.internal.component.TestVariantCreationConfig;
import com.android.build.gradle.internal.publishing.AndroidArtifacts;
import com.android.build.gradle.internal.tasks.BuildAnalyzer;
import com.android.build.gradle.internal.tasks.NonIncrementalTask;
import com.android.build.gradle.internal.tasks.factory.VariantTaskCreationAction;
import com.android.buildanalyzer.common.TaskCategory;
import java.io.File;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.PathSensitive;
import org.gradle.api.tasks.PathSensitivity;
import org.gradle.work.DisableCachingByDefault;

/** Task to check if Proguard needs to be enabled for test plugin. */
@DisableCachingByDefault
@BuildAnalyzer(primaryTaskCategory = TaskCategory.VERIFICATION)
public abstract class CheckTestedAppObfuscation extends NonIncrementalTask {
    FileCollection mappingFile;

    @InputFiles
    @PathSensitive(PathSensitivity.RELATIVE)
    public FileCollection getMappingFile() {
        return mappingFile;
    }

    /** Dummy output to allow up-to-date check */
    @SuppressWarnings("MethodMayBeStatic")
    @OutputFile
    @Optional
    public File getDummyOutput() {
        return null;
    }

    @Override
    protected void doTaskAction() {
        if (!mappingFile.isEmpty()) {
            throw new RuntimeException(
                    "Mapping file found in tested application: " + mappingFile.getFiles().iterator().next().getPath() + "\n" +
                    "This means that the tested application has shrinking enabled.\n" +
                    "For the test to work correctly, please enable shrinking in this test project as well (see https://developer.android.com/studio/build/shrink-code)."
            );
        }
    }

    public static class CreationAction
            extends VariantTaskCreationAction<
                    CheckTestedAppObfuscation, TestVariantCreationConfig> {

        public CreationAction(@NonNull TestVariantCreationConfig creationConfig) {
            super(creationConfig);
        }

        @NonNull
        @Override
        public String getName() {
            return computeTaskName("checkTestedAppObfuscation");
        }

        @NonNull
        @Override
        public Class<CheckTestedAppObfuscation> getType() {
            return CheckTestedAppObfuscation.class;
        }

        @Override
        public void configure(
                @NonNull CheckTestedAppObfuscation task) {
            super.configure(task);

            task.mappingFile =
                    creationConfig
                            .getVariantDependencies()
                            .getArtifactFileCollection(
                                    AndroidArtifacts.ConsumedConfigType.COMPILE_CLASSPATH,
                                    AndroidArtifacts.ArtifactScope.ALL,
                                    AndroidArtifacts.ArtifactType.APK_MAPPING);
        }
    }
}
