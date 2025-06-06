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

package com.android.build.api.dsl

import org.gradle.api.tasks.testing.Test

/** Options for controlling unit tests execution. */
interface UnitTestOptions {
    /**
     * Whether unmocked methods from android.jar should throw exceptions or return default
     * values (i.e. zero or null).
     *
     * See [Test Your App](https://developer.android.com/studio/test/index.html) for details.
     *
     * since 1.1.0
     */
    var isReturnDefaultValues: Boolean

    /**
     * Enables unit tests to use Android resources, assets, and manifests.
     *
     * If you set this property to <code>true</code>, the plugin performs resource, asset,
     * and manifest merging before running your unit tests. Your tests can then inspect a file
     * called `com/android/tools/test_config.properties` on the classpath, which is a Java
     * properties file with the following keys:
     *
     * `android_resource_apk`: the path to the APK-like zip file containing merged resources, which
     * includes all the resources from the current subproject and all its dependencies.
     *
     * `android_merged_assets`: the path to the directory containing merged assets. The merged
     * assets directory contains assets from the current subproject and it dependencies.
     *
     * `android_merged_manifest`: the path to the merged manifest file. Only app subprojects have
     * the manifest merged from their dependencies. Library subprojects do not include manifest
     * components from their dependencies.
     *
     * `android_custom_package`: the package name (namespace) of the final R class.
     *
     * Note that the paths above are relative paths (relative to the current project directory, not
     * the root project directory).
     *
     * since 3.0.0
     */
    var isIncludeAndroidResources: Boolean

    /**
     * Configures all unit testing tasks.
     *
     * See [Test] for available options.
     *
     * Inside the closure you can check the name of the task to configure only some test tasks, e.g.
     *
     * ```
     * android {
     *     testOptions {
     *         unitTests.all {
     *             if (it.name == 'testDebug') {
     *                 systemProperty 'debug', 'true'
     *             }
     *         }
     *     }
     * }
     * ```
     *
     * since 1.2.0
     */
    fun all(configAction: (Test) -> Unit)
}
