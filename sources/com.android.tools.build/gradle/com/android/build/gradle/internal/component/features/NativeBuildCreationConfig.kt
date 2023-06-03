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

package com.android.build.gradle.internal.component.features

import com.android.build.api.variant.ExternalNativeBuild
import com.android.build.gradle.internal.core.MergedNdkConfig
import com.android.build.gradle.internal.dsl.NdkOptions

/**
 * Creation config for components that support native build.
 *
 * To use this in a task that requires native build support, access the nullable property on the
 * component
 * [com.android.build.gradle.internal.component.VariantCreationConfig.nativeBuildCreationConfig].
 */
interface NativeBuildCreationConfig {
    val supportedAbis: Set<String>

    val ndkConfig: MergedNdkConfig

    val isJniDebuggable: Boolean

    val externalNativeBuild: ExternalNativeBuild?

    val nativeDebugSymbolLevel: NdkOptions.DebugSymbolLevel

    val externalNativeExperimentalProperties: Map<String, Any>
}
