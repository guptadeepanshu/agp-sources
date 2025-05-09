/*
 * Copyright (C) 2019 The Android Open Source Project
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
package com.android.build.api.variant

/**
 * Model for dynamic feature components that only contains build-time properties.
 *
 * See [Component] and [Variant] for more information.
 */
@Suppress("DEPRECATION")
interface DynamicFeatureVariant : Variant,
    GeneratesApk,
    HasDeviceTests,
    HasAndroidTest,
    HasUnitTest,
    HasTestFixtures {

    /**
     * Variant's packagingOptions, initialized by the corresponding global DSL element.
     */
    override val packaging: TestedApkPackaging
}
