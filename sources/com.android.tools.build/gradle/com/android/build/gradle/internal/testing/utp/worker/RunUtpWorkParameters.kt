/*
 * Copyright (C) 2021 The Android Open Source Project
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

package com.android.build.gradle.internal.testing.utp.worker

import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.RegularFileProperty
import org.gradle.workers.WorkParameters

/**
 * Parameters of [RunUtpWorkAction].
 */
interface RunUtpWorkParameters : WorkParameters {
    // Java executable to run JAVA commands
    val jvm: RegularFileProperty

    // A UTP launcher jar file to run.
    val launcherJar: ConfigurableFileCollection

    // A UTP core jar file.
    val coreJar: ConfigurableFileCollection

    // A UTP runner config binary proto file to be passed into the launcher.
    val runnerConfig: RegularFileProperty

    // A UTP server config binary proto file to be passed into the launcher.
    val serverConfig: RegularFileProperty

    // A Java logging properties file to be loaded to run a UTP java process.
    val loggingProperties: RegularFileProperty
}
