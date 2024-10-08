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

package com.android.build.api.dsl

import org.gradle.declarative.dsl.model.annotations.Restricted

/**
 * Shared properties between [ApplicationProductFlavor] and [ApplicationDefaultConfig]
 *
 * See [ProductFlavor] and [DefaultConfig] for more information.
 */
interface ApplicationBaseFlavor :
    BaseFlavor,
    ApplicationVariantDimension {
    /**
     * The application ID.
     *
     * See [Set the Application ID](https://developer.android.com/studio/build/application-id.html)
     */
    @get:Restricted
    var applicationId: String?

    /**
     * Version code.
     *
     * See [Versioning Your Application](http://developer.android.com/tools/publishing/versioning.html)
     */
    @get:Restricted
    var versionCode: Int?

    /**
     * Version name.
     *
     * See [Versioning Your Application](http://developer.android.com/tools/publishing/versioning.html)
     */
    @get:Restricted
    var versionName: String?

    /**
     * The target SDK version.
     * Setting this it will override previous calls of [targetSdk] and [targetSdkPreview] setters.
     * Only one of [targetSdk] and [targetSdkPreview] should be set.
     *
     * See [uses-sdk element documentation](http://developer.android.com/guide/topics/manifest/uses-sdk-element.html).
     */
    @get:Restricted
    var targetSdk: Int?

    @Deprecated("Replaced by targetSdk property")
    fun targetSdkVersion(targetSdkVersion: Int)

    /**
     * The target SDK version.
     * Setting this it will override previous calls of [targetSdk] and [targetSdkPreview] setters.
     * Only one of [targetSdk] and [targetSdkPreview] should be set.
     *
     * See [uses-sdk element documentation](http://developer.android.com/guide/topics/manifest/uses-sdk-element.html).
     */
    @get:Restricted
    var targetSdkPreview: String?

    @Deprecated("Replaced by targetSdkPreview property")
    fun setTargetSdkVersion(targetSdkVersion: String?)

    @Deprecated("Replaced by targetSdkPreview property")
    fun targetSdkVersion(targetSdkVersion: String?)

    /**
     * The maxSdkVersion, or null if not specified. This is only the value set on this produce
     * flavor.
     *
     * See [uses-sdk element documentation](http://developer.android.com/guide/topics/manifest/uses-sdk-element.html).
     */
    @get:Restricted
    var maxSdk: Int?

    @Deprecated("Replaced by maxSdk property")
    fun maxSdkVersion(maxSdkVersion: Int)
}
