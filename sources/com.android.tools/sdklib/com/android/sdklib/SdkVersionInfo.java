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
package com.android.sdklib;

import com.android.annotations.NonNull;
import com.android.annotations.Nullable;

import com.google.common.base.Strings;

import java.util.Locale;

/** Information about available SDK Versions */
public class SdkVersionInfo {
    /**
     * The highest known API level. Note that the tools may also look at the installed platforms to
     * see if they can find more recently released platforms, e.g. when the tools have not yet been
     * updated for a new release. This number is used as a baseline and any more recent platforms
     * found can be used to increase the highest known number.
     */
    public static final int HIGHEST_KNOWN_API = 36;

    /**
     * Like {@link #HIGHEST_KNOWN_API} but does not include preview platforms.
     *
     * <p>Make sure to keep this in sync with the value in TestUtils.
     */
    public static final int HIGHEST_KNOWN_STABLE_API = 36;

    /**
     * The highest supported version of the Android platform (as an API level) that this version of
     * the tools generally works with.
     *
     * <p>The intent is that this will be used to alert users that the version of the IDE they're
     * using is too old to support a recently added platform and to encourage them to update.
     *
     * <p>For example, let's say Studio Dolphin has set this constant to Tiramisu/33. And let's say
     * next year, some user is still using Dolphin and downloads the U/API 34 SDK. Dolphin should
     * alert the user that the SDK they're using is not fully supported by the current version and
     * that they should download. This isn't just about downloading SDKs; we may also warn when you
     * load a project specifying a compileSdkVersion that's outside of the supported range, or even
     * try to run/profile/debug on a device more recent than the known maximum supported version.
     *
     * <p>Generally we shouldn't <i>prevent</i> the user from proceeding; the intent is to make the
     * user <b>aware</b> that the SDK may not work correctly without a newer version of the tools.
     */
    public static final int HIGHEST_SUPPORTED_API = 36; // b/230535497; this is not yet enforced

    /**
     * The lowest active API level in the ecosystem. This number will change over time as the
     * distribution of older platforms decreases.
     */
    public static final int LOWEST_ACTIVE_API = 16;

    /**
     * The default minSdkVersion to use for new projects and modules.
     * This number is going to be at least {@link #LOWEST_ACTIVE_API}, but can
     * often be higher; {@link #LOWEST_ACTIVE_API} is the minimum <b>supported</b>
     * API level, whereas this constant is the <b>recommended</b> minSdkVersion.
     */
    public static final int RECOMMENDED_MIN_SDK_VERSION = 24;

    /**
     * The highest known API level for Wearables. Note the tools at the downloadable system images
     * for wearables to see if there are more recent versions.
     */
    public static final int HIGHEST_KNOWN_API_WEAR = 36;

    /**
     * The lowest active api for wearables. This number will change over time as the distribution of
     * older platforms decreases.
     */
    public static final int LOWEST_ACTIVE_API_WEAR = 28;

    /**
     * The highest known API level for desktop. Note the tools at the
     * downloadable system images for desktop to see if there are more recent
     * versions.
     */
    public static final int HIGHEST_KNOWN_API_DESKTOP = 32;

    /**
     * The highest known API level for Android TV. Note the tools at the
     * downloadable system images for TV to see if there are more recent
     * versions.
     */
    public static final int HIGHEST_KNOWN_API_TV = 34;

    /**
     * The highest known API level for Android Auto. To find out if this value needs to be updated,
     * check the downloadable system images for Auto to see if there are more recent versions.
     */
    public static final int HIGHEST_KNOWN_API_AUTO = 34;

    /**
     * The lowest active api for TV. This number will change over time
     * as the distribution of older platforms decreases.
     */
    public static final int LOWEST_ACTIVE_API_TV = 21;

    /**
     * The highest known API level for XR.
     */
    public static final int HIGHEST_KNOWN_API_XR = 34;

    /**
     * The lowest active API for XR, minimum required by libraries.
     */
    public static final int LOWEST_ACTIVE_API_XR = 30;

    /**
     * The lowest api level we can accept for compileSdkVersion for
     * a new project. Make sure design and appcompat is supported.
     */
    public static final int LOWEST_COMPILE_SDK_VERSION = 22;

    /**
     * The lowest api level where profile guided optimization is on. On api 21 - 23 apps are fully
     * AOT compiled.
     */
    public static final int LOWEST_PROFILE_GUIDED_OPTIMIZATIONS_SDK_VERSION = 24;

    /**
     * Build.VERSION_CODES.CUR_DEVELOPMENT; set for platforms in
     * development before preview
     */
    public static final int CUR_DEVELOPMENT = 10000;

    /**
     * Returns the Android release name corresponding to the given API level.
     *
     * <p>Do <b>not</b> use to construct an Android version string. See {@link AndroidVersionUtils} instead.
     *
     * <p>If the corresponding Android version has not yet been released, returns null.
     *
     * @param api the API level
     * @return the release name or null if it's not known
     * @see SdkVersionInfo#HIGHEST_KNOWN_STABLE_API
     */
    @Nullable
    public static String getReleaseVersionString(int api) {
        switch (api) {
            case 1:  return "1.0";
            case 2:  return "1.1";
            case 3:  return "1.5";
            case 4:  return "1.6";
            case 5:  return "2.0";
            case 6:  return "2.0.1";
            case 7:  return "2.1";
            case 8:  return "2.2";
            case 9:  return "2.3";
            case 10: return "2.3.3";
            case 11: return "3.0";
            case 12: return "3.1";
            case 13: return "3.2";
            case 14: return "4.0";
            case 15: return "4.0.3";
            case 16: return "4.1";
            case 17: return "4.2";
            case 18: return "4.3";
            case 19: return "4.4";
            case 20: return "4.4W";
            case 21: return "5.0";
            case 22: return "5.1";
            case 23: return "6.0";
            case 24: return "7.0";
            case 25: return "7.1.1";
            case 26: return "8.0";
            case 27: return "8.1";
            case 28: return "9.0";
            case 29: return "10.0";
            case 30: return "11.0";
            case 31: return "12.0";
            case 32: return "12L";
            case 33:
                return "13.0";
            case 34:
                return "14.0";
            case 35:
                return "15.0";
            case 36:
                return "16.0";
                // If you add more versions here, also update #HIGHEST_KNOWN_STABLE_API
            default:
                return null;
        }
    }

    /**
     * Returns the Android release name corresponding to the given API level.
     *
     * <p>Do <b>not</b> use to construct an Android version string. See {@link AndroidVersionUtils} instead.
     *
     * <p>If the corresponding Android version has not yet been released, returns the codename. This
     * matches how the SDK describes itself, e.g. S (stable) is
     *
     * <pre>Pkg.Desc=Android SDK Platform 12</pre>
     *
     * and T (preview) is
     *
     * <pre>Pkg.Desc=Android SDK Platform Tiramisu</pre>
     */
    public static String getVersionString(int api) {
        String releaseVersion = getReleaseVersionString(api);
        return releaseVersion != null ? releaseVersion : getCodeName(api);
    }

    /**
     * Returns the known codename for a given API level
     *
     * <p>DO NOTE USE TO CONSTRUCTION YOUR OWN ANDROID VERSION STRING. See {@link
     * AndroidVersionUtils} instead.
     *
     * @param api the API level
     * @return the codename or null if it's not known
     * @see SdkVersionInfo#HIGHEST_KNOWN_API
     */
    @Nullable
    public static String getCodeName(int api) {
        switch (api) {
            case 1:
            case 2:
                return null;
            case 3:
                return "Cupcake";
            case 4:
                return "Donut";
            case 5:
            case 6:
            case 7:
                return "Eclair";
            case 8:
                return "Froyo";
            case 9:
            case 10:
                return "Gingerbread";
            case 11:
            case 12:
            case 13:
                return "Honeycomb";
            case 14:
            case 15:
                return "IceCreamSandwich";
            case 16:
            case 17:
            case 18:
                return "Jelly Bean";
            case 19:
                return "KitKat";
            case 20:
                return "KitKat Wear";
            case 21:
            case 22:
                return "Lollipop";
            case 23:
                return "Marshmallow";
            case 24:
            case 25:
                return "Nougat";
            case 26:
            case 27:
                return "Oreo";
            case 28:
                return "Pie";
            case 29:
                return "Q";
            case 30:
                return "R";
            case 31:
                return "S";
            case 32:
                return "Sv2";
            case 33:
                return "Tiramisu";
            case 34:
                return "UpsideDownCake";
            case 35:
                return "VanillaIceCream";
            case 36:
                return "Baklava";
                // If you add more versions here, also update #getBuildCode and
                // #HIGHEST_KNOWN_API
            default:
                return null;
        }
    }

    /**
     * Returns the applicable build code (for
     * {@code android.os.Build.VERSION_CODES}) for the corresponding API level,
     * or null if it's unknown. The highest number (inclusive) that is supported
     * is {@link SdkVersionInfo#HIGHEST_KNOWN_API}.
     *
     * @param api the API level to look up a version code for
     * @return the corresponding build code field name, or null
     */
    @Nullable
    public static String getBuildCode(int api) {
        // See http://developer.android.com/reference/android/os/Build.VERSION_CODES.html
        switch (api) {
            case 1:  return "BASE";
            case 2:  return "BASE_1_1";
            case 3:  return "CUPCAKE";
            case 4:  return "DONUT";
            case 5:  return "ECLAIR";
            case 6:  return "ECLAIR_0_1";
            case 7:  return "ECLAIR_MR1";
            case 8:  return "FROYO";
            case 9:  return "GINGERBREAD";
            case 10: return "GINGERBREAD_MR1";
            case 11: return "HONEYCOMB";
            case 12: return "HONEYCOMB_MR1";
            case 13: return "HONEYCOMB_MR2";
            case 14: return "ICE_CREAM_SANDWICH";
            case 15: return "ICE_CREAM_SANDWICH_MR1";
            case 16: return "JELLY_BEAN";
            case 17: return "JELLY_BEAN_MR1";
            case 18: return "JELLY_BEAN_MR2";
            case 19: return "KITKAT";
            case 20: return "KITKAT_WATCH";
            case 21: return "LOLLIPOP";
            case 22: return "LOLLIPOP_MR1";
            case 23: return "M";
            case 24: return "N";
            case 25: return "N_MR1";
            case 26: return "O";
            case 27: return "O_MR1";
            case 28: return "P";
            case 29: return "Q";
            case 30: return "R";
            case 31: return "S";
            case 32: return "S_V2";
            case 33:
                return "TIRAMISU";
            case 34:
                return "UPSIDE_DOWN_CAKE";
            case 35:
                return "VANILLA_ICE_CREAM";
            case 36:
                return "BAKLAVA";
                // If you add more versions here, also update #getCodeName and
                // #HIGHEST_KNOWN_API
        }

        return null;
    }

    @Nullable
    public static String getBuildCode(int api, int minor) {
        // See http://developer.android.com/reference/android/os/Build.VERSION_CODES_FULL.html
        switch (api) {
            // TODO: Add well known constants as they appear here
            default: {
                String codeName = getBuildCode(api);
                if (codeName != null) {
                    return codeName + '_' + minor;
                }
            }
        }

        return null;
    }

    /**
     * Returns the API level of the given build code (e.g. JELLY_BEAN_MR1 ⇒ 17), or -1 if not
     * recognized
     *
     * @param buildCode         the build code name (not case sensitive)
     * @param recognizeUnknowns if true, treat an unrecognized code name as a newly released
     *                          platform the tools are not yet aware of, and set its API level to
     *                          some higher number than all the currently known API versions
     * @return the API level, or -1 if not recognized (unless recognizeUnknowns is true, in which
     * {@link #HIGHEST_KNOWN_API} plus one is returned
     */
    public static int getApiByBuildCode(@NonNull String buildCode, boolean recognizeUnknowns) {
        for (int api = 1; api <= HIGHEST_KNOWN_API; api++) {
            String code = getBuildCode(api);
            if (code != null && code.equalsIgnoreCase(buildCode)) {
                return api;
            }
        }

        if (buildCode.equalsIgnoreCase("L")) {
            return 21; // For now the Build class also provides this as an alias to Lollipop
        }
        return recognizeUnknowns ? HIGHEST_KNOWN_API + 1 : -1;
    }

    /**
     * Returns the API level of the given preview code name (e.g. JellyBeanMR2 ⇒ 17), or -1 if not
     * recognized
     *
     * @param previewName       the preview name (not case sensitive)
     * @param recognizeUnknowns if true, treat an unrecognized code name as a newly released
     *                          platform the tools are not yet aware of, and set its API level to
     *                          some higher number than all the currently known API versions
     * @return the API level, or -1 if not recognized (unless recognizeUnknowns is true, in which
     * {@link #HIGHEST_KNOWN_API} plus one is returned
     */
    public static int getApiByPreviewName(@NonNull String previewName, boolean recognizeUnknowns) {
        // JellyBean => JELLY_BEAN
        String codeName = previewName.contains("_") ? previewName :
                camelCaseToUnderlines(previewName).toUpperCase(Locale.US);

        // The build code is KITKAT, not KIT_KAT as may be inferred from "KitKat":
        if (codeName.contains("KIT_KAT")) {
            codeName = codeName.replace("KIT_KAT", "KITKAT");
        }

        int code = getApiByBuildCode(codeName, false);
        if (code == -1) {
            for (int api = 1; api <= HIGHEST_KNOWN_API; api++) {
                String c = getCodeName(api);
                if (c != null && (c.equalsIgnoreCase(codeName) || c.equalsIgnoreCase(previewName))) {
                    return api;
                }
            }
            if (previewName.equalsIgnoreCase("KeyLimePie")) {
                return 19;
            }

            if (recognizeUnknowns) {
                code = getApiByBuildCode(codeName, true);
            }

        }
        return code;
    }

    /**
     * Converts a CamelCase word into an underlined_word
     *
     * @param string the CamelCase version of the word
     * @return the underlined version of the word
     */
    @NonNull
    public static String camelCaseToUnderlines(@NonNull String string) {
        if (string.isEmpty()) {
            return string;
        }

        StringBuilder sb = new StringBuilder(2 * string.length());
        int n = string.length();
        boolean lastWasUpperCase = Character.isUpperCase(string.charAt(0));
        for (int i = 0; i < n; i++) {
            char c = string.charAt(i);
            boolean isUpperCase = Character.isUpperCase(c);
            if (isUpperCase && !lastWasUpperCase) {
                sb.append('_');
            }
            lastWasUpperCase = isUpperCase;
            c = Character.toLowerCase(c);
            sb.append(c);
        }

        return sb.toString();
    }

    /**
     * Converts an underlined_word into a CamelCase word
     *
     * @param string the underlined word to convert
     * @return the CamelCase version of the word
     */
    @NonNull
    public static String underlinesToCamelCase(@NonNull String string) {
        StringBuilder sb = new StringBuilder(string.length());
        int n = string.length();

        int i = 0;
        @SuppressWarnings("SpellCheckingInspection")
        boolean upcaseNext = true;
        for (; i < n; i++) {
            char c = string.charAt(i);
            if (c == '_') {
                upcaseNext = true;
            } else {
                if (upcaseNext) {
                    c = Character.toUpperCase(c);
                }
                upcaseNext = false;
                sb.append(c);
            }
        }

        return sb.toString();
    }

    /**
     * Returns the {@link AndroidVersion} for a given version string, which is typically an API
     * level number, but can also be a codename for a <b>preview</b> platform. Note: This should
     * <b>not</b> be used to look up version names for build codes; for that, use {@link
     * #getApiByBuildCode(String, boolean)}. The primary difference between this method is that
     * {@link #getApiByBuildCode(String, boolean)} will return the final API number for a platform
     * (e.g. for "KITKAT" it will return 19) whereas this method will return the API number for the
     * codename as a preview platform (e.g. 18).
     *
     * @param apiOrPreviewName the version string
     * @param targets          an optional array of installed targets, if available. If the version
     *                         string corresponds to a code name, this is used to search for a
     *                         corresponding API level.
     * @return an {@link AndroidVersion}, or null if the version could not be
     * determined (e.g. an empty or invalid API number or an unknown code name)
     */
    @Nullable
    public static AndroidVersion getVersion(
            @Nullable String apiOrPreviewName,
            @Nullable IAndroidTarget[] targets) {
        if (Strings.isNullOrEmpty(apiOrPreviewName)) {
            return null;
        }

        if (Character.isDigit(apiOrPreviewName.charAt(0))) {
            try {
                return AndroidVersion.fromString(apiOrPreviewName);
            } catch (IllegalArgumentException e) {
                // Invalid version string
                return null;
            }
        }

        // Codename
        if (targets != null) {
            for (int i = targets.length - 1; i >= 0; i--) {
                IAndroidTarget target = targets[i];
                if (target.isPlatform()) {
                    AndroidVersion version = target.getVersion();
                    if (version.isPreview() && apiOrPreviewName.equalsIgnoreCase(version.getCodename())) {
                        return new AndroidVersion(version.getApiLevel(), version.getCodename());
                    }
                }
            }
        }

        int api = getApiByPreviewName(apiOrPreviewName, false);
        if (api != -1) {
            return new AndroidVersion(api - 1, apiOrPreviewName);
        }

        // Must be a future SDK platform
        return new AndroidVersion(HIGHEST_KNOWN_API, apiOrPreviewName);
    }
}
