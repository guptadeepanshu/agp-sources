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
package com.android.sdklib;

import com.android.sdklib.repository.IdDisplay;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class SystemImageTags {
    /** Tag to apply to system images if none other is specified. */
    public static final IdDisplay DEFAULT_TAG = IdDisplay.create("default", "Default");

    /** Tag to apply to system images for wearables. */
    public static final IdDisplay WEAR_TAG = IdDisplay.create("android-wear", "Wear OS");

    /** Tag to apply to system images for Desktop. */
    public static final IdDisplay DESKTOP_TAG = IdDisplay.create("android-desktop", "Desktop");

    /** Tag to apply to system images for Android TV. */
    public static final IdDisplay ANDROID_TV_TAG = IdDisplay.create("android-tv", "Android TV");

    /** Tag to apply to system images for Google TV. */
    public static final IdDisplay GOOGLE_TV_TAG = IdDisplay.create("google-tv", "Google TV");

    /** Tag to apply to system images for Android Automotive. */
    public static final IdDisplay AUTOMOTIVE_TAG =
            IdDisplay.create("android-automotive", "Android Automotive");

    /** Tag to apply to system images for Android Automotive that have Google Play Store. */
    public static final IdDisplay AUTOMOTIVE_PLAY_STORE_TAG =
            IdDisplay.create("android-automotive-playstore", "Android Automotive with Google Play");

    /** Tag to apply to system images for Chrome OS device. */
    public static final IdDisplay CHROMEOS_TAG = IdDisplay.create("chromeos", "Chrome OS Device");

    /**
     * Tag to apply to system images that include Google APIs. Note that {@link #PLAY_STORE_TAG},
     * {@link #WEAR_TAG}, and {@link #ANDROID_TV_TAG} each imply the presence of Google APIs. In
     * addition, there is one system image that uses {@link #GOOGLE_APIS_X86_TAG}.
     */
    public static final IdDisplay GOOGLE_APIS_TAG = IdDisplay.create("google_apis", "Google APIs");

    /** Tag to apply to system images that have Google Play Store. */
    public static final IdDisplay PLAY_STORE_TAG =
            IdDisplay.create("google_apis_playstore", "Google Play");

    /**
     * Tag to apply to system images specifically for tablets. (Tablets may also use non-tablet
     * images.)
     */
    public static final IdDisplay TABLET_TAG = IdDisplay.create("tablet", "Tablet");

    /**
     * A separate tag to apply to system images that include Google APIs on x86 systems. Note this
     * tag was only used for api 19 and has not been used since.
     */
    public static final IdDisplay GOOGLE_APIS_X86_TAG =
            IdDisplay.create("google_apis_x86", "Google APIs x86");

    public static final Set<IdDisplay> TAGS_WITH_GOOGLE_API =
            ImmutableSet.of(
                    GOOGLE_APIS_TAG,
                    GOOGLE_APIS_X86_TAG,
                    PLAY_STORE_TAG,
                    ANDROID_TV_TAG,
                    GOOGLE_TV_TAG,
                    WEAR_TAG,
                    DESKTOP_TAG,
                    CHROMEOS_TAG,
                    AUTOMOTIVE_TAG,
                    AUTOMOTIVE_PLAY_STORE_TAG);
}
