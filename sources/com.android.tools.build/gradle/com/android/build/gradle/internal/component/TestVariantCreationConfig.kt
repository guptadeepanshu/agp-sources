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

package com.android.build.gradle.internal.component

import com.android.build.api.variant.impl.BuiltArtifactsLoaderImpl
import org.gradle.api.file.Directory
import org.gradle.api.provider.Provider

/**
 * Internal CreationConfig for test modules
 */
interface TestVariantCreationConfig: VariantCreationConfig, TestCreationConfig, InstrumentedTestCreationConfig {

    /**
     * Provide access to the tested APKs, this is a [Directory] that can contain multiple APKs,
     * therefore a [BuiltArtifactsLoaderImpl] must be used to load the metadata associated with
     * each APK.
     */
    val testedApks: Provider<Directory>

    /**
     * Provide access to the privacy sandbox Sdk APKs, this is a [Directory] that can contain multiple APKs,
     * therefore a [BuiltArtifactsLoaderImpl] must be used to load the metadata associated with
     * each APK.
     */
    val privacySandboxCompatApks: Provider<Directory>?

    val usesSdkLibrarySplitForLocalDeployment: Provider<Directory>?

    val privacySandboxEnabled: Boolean
}
