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

package com.android.build.api.component.analytics

import com.android.build.api.component.UnitTest
import com.android.build.api.variant.HostTest
import com.android.tools.build.gradle.internal.profile.VariantPropertiesMethodType
import com.google.wireless.android.sdk.stats.GradleBuildVariant
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.MapProperty
import org.gradle.api.tasks.testing.Test
import javax.inject.Inject

open class AnalyticsEnabledHostTest @Inject constructor(
    override val delegate: HostTest,
    stats: GradleBuildVariant.Builder,
    objectFactory: ObjectFactory
) : AnalyticsEnabledTestComponent(delegate, stats, objectFactory), UnitTest, HostTest {
    override val manifestPlaceholders: MapProperty<String, String>
        get() {
            stats.variantApiAccessBuilder.addVariantPropertiesAccessBuilder().type =
                VariantPropertiesMethodType.MANIFEST_PLACEHOLDERS_VALUE
            return delegate.manifestPlaceholders
        }

    override fun configureTestTask(action: (Test) -> Unit) {
        stats.variantApiAccessBuilder.addVariantPropertiesAccessBuilder().type =
            VariantPropertiesMethodType.CONFIGURE_TEST_TASK_VALUE
        delegate.configureTestTask(action)
    }

    override val codeCoverageEnabled: Boolean
        get() {
            stats.variantApiAccessBuilder.addVariantPropertiesAccessBuilder().type =
                VariantPropertiesMethodType.HOST_TEST_CODE_COVERAGE_ENABLED_VALUE
            return delegate.codeCoverageEnabled
        }

}
