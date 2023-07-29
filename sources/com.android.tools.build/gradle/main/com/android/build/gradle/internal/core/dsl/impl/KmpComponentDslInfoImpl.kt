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

package com.android.build.gradle.internal.core.dsl.impl

import com.android.build.api.variant.impl.MutableAndroidVersion
import com.android.build.gradle.api.JavaCompileOptions
import com.android.build.gradle.internal.core.dsl.KmpComponentDslInfo
import com.android.build.gradle.internal.dsl.KotlinMultiplatformAndroidExtension
import com.android.build.gradle.internal.dsl.KotlinMultiplatformAndroidExtensionImpl
import com.android.build.gradle.internal.services.VariantServices
import com.android.builder.core.AbstractProductFlavor
import org.gradle.api.provider.Property

abstract class KmpComponentDslInfoImpl(
    protected val extension: KotlinMultiplatformAndroidExtension,
    protected val services: VariantServices
): KmpComponentDslInfo {

    override val minSdkVersion: MutableAndroidVersion
        get() = (extension as KotlinMultiplatformAndroidExtensionImpl).minSdkVersion

    override val applicationId: Property<String> by lazy {
        services.newPropertyBackingDeprecatedApi(
            String::class.java,
            namespace
        )
    }

    override val missingDimensionStrategies: Map<String, AbstractProductFlavor.DimensionRequest>
        get() = extension.productFlavorsMatching.mapValues {
            AbstractProductFlavor.DimensionRequest(
                requested = it.key,
                fallbacks = it.value.toList()
            )
        }

    override val buildTypeMatchingFallbacks: List<String>
        get() = extension.buildTypeMatching.toList()
}
