/*
 * Copyright (C) 2024 The Android Open Source Project
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
import org.gradle.api.Incubating

/**
 * DSL object for configuring the App Bundle AI model version targeting
 *
 * This is accessed via [Bundle.aiModelVersion]
 */
@Incubating
interface BundleAiModelVersion {

    @get:Incubating
    @set:Incubating
    var enableSplit: Boolean?

    /**
     * Specifies the default AI model version value for the bundle. Used for filtering splits for
     * standalone, system and universal APKs.
     */
    @get:Incubating
    @set:Incubating
    var defaultVersion: String?
}
