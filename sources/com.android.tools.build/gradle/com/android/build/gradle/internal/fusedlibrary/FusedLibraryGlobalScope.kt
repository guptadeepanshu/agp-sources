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

package com.android.build.gradle.internal.fusedlibrary

import com.android.build.api.artifact.impl.ArtifactsImpl
import com.android.build.api.dsl.FusedLibraryExtension
import com.android.build.gradle.internal.dependency.PluginConfigurations
import com.android.build.gradle.internal.dsl.AarMetadataImpl
import com.android.build.gradle.internal.services.TaskCreationServices
import org.gradle.api.file.FileCollection
import org.gradle.api.file.ProjectLayout
import org.gradle.api.provider.MapProperty

interface FusedLibraryGlobalScope {
    val aarMetadata: AarMetadataImpl
    val artifacts: ArtifactsImpl
    val experimentalProperties: MapProperty<String, Any>
    val extension: FusedLibraryExtension
    val manifestPlaceholders: MutableMap<String, String>
    val minSdk: Int
    val namespace: String
    val projectLayout: ProjectLayout
    val services: TaskCreationServices
    val dependencies: FusedLibraryDependencies
    val incomingConfigurations: PluginConfigurations
    fun getLocalJars(): FileCollection
}
