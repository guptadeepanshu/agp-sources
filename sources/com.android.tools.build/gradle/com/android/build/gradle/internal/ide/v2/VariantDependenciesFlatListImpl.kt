/*
 * Copyright (C) 2023 The Android Open Source Project
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

package com.android.build.gradle.internal.ide.v2

import com.android.builder.model.v2.ide.ArtifactDependenciesFlatList
import com.android.builder.model.v2.ide.Library
import com.android.builder.model.v2.models.VariantDependenciesFlatList
import java.io.Serializable

data class VariantDependenciesFlatListImpl(
    override val name: String,
    override val mainArtifact: ArtifactDependenciesFlatList,
    override val deviceTestArtifacts: Map<String, ArtifactDependenciesFlatList>,
    override val hostTestArtifacts: Map<String, ArtifactDependenciesFlatList>,
    override val testFixturesArtifact: ArtifactDependenciesFlatList?,
    override val libraries: Map<String, Library>
) : VariantDependenciesFlatList, Serializable {

    companion object {
        @JvmStatic
        private val serialVersionUID: Long = 1L
    }
}
