/*
 * Copyright (C) 2013 The Android Open Source Project
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

package com.android.builder.internal;

import com.android.SdkConstants;
import com.android.annotations.NonNull;
import com.android.annotations.Nullable;
import com.android.sdklib.AndroidVersion;
import com.android.sdklib.BuildToolInfo;
import com.android.sdklib.IAndroidTarget;
import com.android.sdklib.OptionalLibrary;
import com.android.utils.SparseArray;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Fake IAndroidTarget used for SDK prebuilts in the Android source tree.
 */
public class FakeAndroidTarget implements IAndroidTarget {
    private final Path mSdkLocation;
    private final SparseArray<Path> mPaths = new SparseArray<>();
    private final List<String> mBootClasspath = Lists.newArrayListWithExpectedSize(2);
    private final int mApiLevel;

    public FakeAndroidTarget(String sdkLocation, String target) {
        mSdkLocation = Paths.get(sdkLocation);
        mApiLevel = getApiLevel(target);

        if ("unstubbed".equals(target)) {
            mBootClasspath.add(mSdkLocation +
                    "/out/target/common/obj/JAVA_LIBRARIES/framework_intermediates/classes.jar");
            mBootClasspath.add(mSdkLocation +
                    "/out/target/common/obj/JAVA_LIBRARIES/core_intermediates/classes.jar");

            // pre-build the path to the platform components
            mPaths.put(
                    ANDROID_JAR,
                    mSdkLocation
                            .resolve("prebuilts/sdk/current")
                            .resolve(SdkConstants.FN_FRAMEWORK_LIBRARY));
            mPaths.put(
                    ANDROID_AIDL,
                    mSdkLocation
                            .resolve("prebuilts/sdk/renderscript")
                            .resolve(SdkConstants.FN_FRAMEWORK_AIDL));
        } else {
            Path apiPrebuilts;

            if ("current".equals(target)) {
                apiPrebuilts = mSdkLocation.resolve("prebuilts/sdk/current/");
            } else {
                apiPrebuilts =
                        mSdkLocation.resolve("prebuilts/sdk").resolve(Integer.toString(mApiLevel));
            }

            // pre-build the path to the platform components
            mBootClasspath.add(apiPrebuilts + SdkConstants.FN_FRAMEWORK_LIBRARY);
            mPaths.put(ANDROID_JAR, apiPrebuilts.resolve(SdkConstants.FN_FRAMEWORK_LIBRARY));
            mPaths.put(ANDROID_AIDL, apiPrebuilts.resolve(SdkConstants.FN_FRAMEWORK_AIDL));
        }
    }

    private int getApiLevel(String target) {
        if (target.startsWith("android-")) {
            return Integer.parseInt(target.substring("android-".length()));
        }

        // We don't actually know the API level at this point since the mode is "current"
        // or "unstubbed". This API is only called to check if annotations.jar needs to be
        // added to the classpath, so by putting a large value we make sure annotations.jar
        // isn't used.
        return 99;
    }

    @NonNull
    @Override
    public Path getPath(int pathId) {
        return mPaths.get(pathId);
    }

    @Override
    public BuildToolInfo getBuildToolInfo() {
        // this is not used internally since we properly query for the right Build Tools from
        // the SdkManager.
        return null;
    }

    @Override @NonNull
    public List<String> getBootClasspath() {
        return mBootClasspath;
    }

    @NonNull
    @Override
    public String getLocation() {
        return mSdkLocation.toString();
    }

    @Override
    public String getVendor() {
        return "android";
    }

    @Override
    public String getName() {
        return "android";
    }

    @Override
    public String getFullName() {
        return "android";
    }

    @Override
    public String getClasspathName() {
        return "android";
    }

    @Override
    public String getShortClasspathName() {
        return "android";
    }

    @NonNull
    @Override
    public AndroidVersion getVersion() {
        return new AndroidVersion(mApiLevel, null);
    }

    @Override
    public String getVersionName() {
        return "Android API level " + mApiLevel;
    }

    @Override
    public int getRevision() {
        return 1;
    }

    @Override
    public boolean isPlatform() {
        return true;
    }

    @Override
    public IAndroidTarget getParent() {
        return null;
    }

    @Override
    public boolean hasRenderingLibrary() {
        return false;
    }

    @NonNull
    @Override
    public List<Path> getSkins() {
        return Collections.emptyList();
    }

    @Nullable
    @Override
    public Path getDefaultSkin() {
        return null;
    }

    @NonNull
    @Override
    public List<OptionalLibrary> getAdditionalLibraries() {
        return ImmutableList.of();
    }

    @NonNull
    @Override
    public List<OptionalLibrary> getOptionalLibraries() {
        return ImmutableList.of();
    }

    @Override
    public String[] getPlatformLibraries() {
        return new String[0];
    }

    @Override
    public String getProperty(String name) {
        return null;
    }

    @Override
    public Map<String, String> getProperties() {
        return null;
    }

    @Override
    public boolean canRunOn(IAndroidTarget target) {
        return false;
    }

    @Override
    public String hashString() {
        return "android-" + mApiLevel;
    }

    @Override
    public int compareTo(IAndroidTarget iAndroidTarget) {
        FakeAndroidTarget that = (FakeAndroidTarget) iAndroidTarget;
        return mSdkLocation.compareTo(that.mSdkLocation);
    }
}
