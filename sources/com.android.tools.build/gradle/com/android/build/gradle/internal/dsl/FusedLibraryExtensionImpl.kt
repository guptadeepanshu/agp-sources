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

package com.android.build.gradle.internal.dsl

import com.android.build.api.dsl.FusedLibraryExtension
import com.android.build.api.variant.AndroidVersion
import com.android.build.api.variant.impl.AndroidVersionImpl
import com.android.build.gradle.internal.services.DslServices
import javax.inject.Inject

abstract class FusedLibraryExtensionImpl @Inject constructor(
    val dslServices: DslServices,
): FusedLibraryExtension{

    abstract override var namespace: String?

    abstract override var minSdk: Int?

    abstract override val manifestPlaceholders: MutableMap<String, String>

    abstract override val experimentalProperties: MutableMap<String, Any>
}
