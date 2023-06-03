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

package com.android.build.api.artifact.impl

import com.android.build.api.variant.ScopedArtifacts

/**
 * [ScopedArtifacts] that are private to the AGP.
 */
interface InternalScopedArtifacts: ScopedArtifacts {

    /**
     * AGP Private scopes.
     */
    enum class InternalScope {
        SUB_PROJECT,
        EXTERNAL_LIBS,
        LOCAL_DEPS,
        FEATURES,
        PROVIDED,
        TESTED_CODE,
    }
}
