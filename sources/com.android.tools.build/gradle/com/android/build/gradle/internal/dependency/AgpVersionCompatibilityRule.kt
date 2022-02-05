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

package com.android.build.gradle.internal.dependency

import com.android.build.api.attributes.AgpVersionAttr
import org.gradle.api.attributes.AttributeCompatibilityRule
import org.gradle.api.attributes.CompatibilityCheckDetails
import java.lang.RuntimeException

class AgpVersionCompatibilityRule : AttributeCompatibilityRule<AgpVersionAttr> {

    override fun execute(details: CompatibilityCheckDetails<AgpVersionAttr>) {
        val producerValue = details.producerValue
        val consumerValue = details.consumerValue
        if (producerValue == consumerValue) {
            details.compatible()
        } else {
            throw RuntimeException("Using multiple versions of the Android Gradle plugin" +
                    "($producerValue, $consumerValue) in the same build is not allowed.")
        }
    }
}
