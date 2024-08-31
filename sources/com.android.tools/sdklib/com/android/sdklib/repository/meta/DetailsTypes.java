/*
 * Copyright (C) 2015 The Android Open Source Project
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

package com.android.sdklib.repository.meta;

import static com.android.sdklib.AndroidVersionUtils.getFullApiName;
import static com.android.sdklib.SystemImageTags.DEFAULT_TAG;

import com.android.SdkConstants;
import com.android.annotations.NonNull;
import com.android.annotations.Nullable;
import com.android.repository.Revision;
import com.android.repository.api.RepoPackage;
import com.android.repository.impl.meta.PackageDisplayNameQualifier;
import com.android.repository.impl.meta.TypeDetails;
import com.android.sdklib.AndroidVersion;
import com.android.sdklib.OptionalLibrary;
import com.android.sdklib.SystemImageTags;
import com.android.sdklib.devices.Abi;
import com.android.sdklib.repository.IdDisplay;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Container for the subclasses of {@link TypeDetails} used by the android SDK.
 * Concrete classes are generated by xjc.
 */
public final class DetailsTypes {

    private DetailsTypes() {
    }

    /** Common methods shared by all android version-specific details types. */
    public interface ApiDetailsType extends PackageDisplayNameQualifier {

        /**
         * Convenience method to create an {@link AndroidVersion} with the information from the given
         * {@link ApiDetailsType}.
         */
        @NonNull
        default AndroidVersion getAndroidVersion() {
            return new AndroidVersion(
                    getApiLevel(), getCodename(), getExtensionLevel(), isBaseExtension());
        }

        /** Sets the api level this package corresponds to. */
        default void setApiLevel(int apiLevel) {
            // Implementation for schema v3 and above.
            if (isBaseExtension()) {
                setApiLevelString(String.valueOf(apiLevel));
            }
            else {
                setApiLevelString(apiLevel + "x");
            }
        }

        /**
         * Gets the api level of this package.
         */
        default int getApiLevel() {
            // Implementation for schema v3 and above.
            return getApiLevelInt(getApiLevelString());
        }

        /**
         * Only to be used for schema v3 and above.Returns the contents of the api-level tag. This
         * is an int if it is the base SDK, or an int followed by an 'x' character if the sdk
         * contains extensions eg. "32x".
         */
        default String getApiLevelString() {
            // Overridden by v3 and shouldn't be used otherwise
            throw new UnsupportedOperationException();
        }

        /**
         * @Deprecated Use {@link #setApiLevel(int)} instead.
         */
        default void setApiLevelString(String apiLevelString) {
            // Overridden by v3 and shouldn't be used otherwise
            throw new UnsupportedOperationException();
        }

        /**
         * Returns whether the package is the base sdk for this api level.
         */
        default boolean isBaseExtension() {
            // Implementation for schema v1 and v2.
            return true;
        }

        /**
         * Sets whether the package is the base sdk for this api level.
         */
        default void setBaseExtension(boolean isBaseExtension) {
            // Overridden by v3 and shouldn't be used otherwise.
            throw new UnsupportedOperationException();
        }

        /**
         * Gets the extension level of this package.
         */
        @Nullable
        default Integer getExtensionLevel() {
            // Implementation for schema v1 and v2.
            return null;
        }

        /**
         * Sets the extension level of this package.
         */
        default void setExtensionLevel(Integer extensionLevel) {
            // Overridden by v3 and shouldn't be used otherwise
            throw new UnsupportedOperationException();
        }

        /**
         * If this is a preview release the api is identified by a codename in addition to the api
         * level. In this case {@code codename} should be non-null.
         */
        void setCodename(@Nullable String codename);

        /**
         * Gets the codename of this release. Should be {@code null} for regular releases, and non-
         * null for preview releases.
         */
        String getCodename();

        @Override
        @NonNull
        default String getQualifierTemplate() {
            return " (revision {0})";
        }

        static int getApiLevelInt(String apiLevel) {
            if (apiLevel == null) {
                return 0;
            }
            try {
                if (apiLevel.endsWith("x")) {
                    return Integer.parseInt(apiLevel.substring(0, apiLevel.length() - 1));
                }
                else {
                    return Integer.parseInt(apiLevel);
                }
            }
            catch (NumberFormatException exception) {
                return 0;
            }
        }

        @NonNull
        List<String> getAbis();

        @NonNull
        List<String> getTranslatedAbis();
    }

    /**
     * A package for Android platform source code
     *
     * <p>TODO: delete this and make ApiDetails concrete in the schema
     */
    @XmlTransient
    public interface SourceDetailsType extends ApiDetailsType {
        /**
         * @throws UnsupportedOperationException always. Source code will never run binaries and
         *     thus have no ABIS.
         */
        @NonNull
        @Override
        default List<String> getAbis() {
            throw new UnsupportedOperationException();
        }

        /**
         * @throws UnsupportedOperationException always. Source code will never run binaries and
         *     thus have no ABIS.
         */
        @NonNull
        @Override
        default List<String> getTranslatedAbis() {
            throw new UnsupportedOperationException();
        }
    }

    /**
     * Details type for platform packages. Contains info on the layout lib version provided.
     */
    @XmlTransient
    public interface PlatformDetailsType extends ApiDetailsType {

        void setLayoutlib(@NonNull LayoutlibType layoutLib);

        @NonNull
        LayoutlibType getLayoutlib();

        /**
         * Parent class for xjc-generated classes containing info on the layout lib version.
         */
        @XmlTransient
        abstract class LayoutlibType {

            /**
             * Sets the layout lib api level.
             */
            public abstract void setApi(int api);

            /**
             * Gets the layout lib api level.
             */
            public abstract int getApi();
        }

        // TODO: http://b/338068018 - We stopped shipping system images in platforms after API 13.
        //      Delete this override when we stop supporting API 13.
        /** @return the native ABIs supported by the system image in the platform */
        @NonNull
        @Override
        default List<String> getAbis() {
            return Collections.singletonList(Abi.ARMEABI.toString());
        }

        @NonNull
        @Override
        default List<String> getTranslatedAbis() {
            return Collections.emptyList();
        }
    }

    /** Details type for extra packages. Includes a {@link IdDisplay} for the vendor. */
    @XmlTransient
    public interface ExtraDetailsType {

        /**
         * Sets the vendor for this package.
         */
        void setVendor(@NonNull IdDisplay vendor);

        /**
         * Gets the vendor for this package.
         */
        @NonNull
        IdDisplay getVendor();
    }

    /**
     * Details type for addon packages. Includes a {@link IdDisplay} for the vendor.
     */
    @XmlTransient
    public interface AddonDetailsType extends ApiDetailsType {

        void setVendor(@NonNull IdDisplay vendor);

        @NonNull
        IdDisplay getVendor();

        /** Gets the {@link OptionalLibrary}s provided by this package. */
        @Nullable
        Libraries getLibraries();

        /** Gets the {@link OptionalLibrary}s provided by this package. */
        void setLibraries(@Nullable Libraries libraries);

        /**
         * Sets the tag for this package. Used to match addon packages with corresponding system
         * images.
         */
        void setTag(@NonNull IdDisplay tag);

        /**
         * Gets the tag for this package. Used to match addon packages with corresponding system
         * images.
         */
        @NonNull
        IdDisplay getTag();

        /**
         * Gets the default skin included in this package.
         */
        @Nullable
        String getDefaultSkin();

        /**
         * List of all {@link Library}s included in this package.
         */
        abstract class Libraries {

            @NonNull
            public abstract List<Library> getLibrary();
        }

        @NonNull
        @Override
        default List<String> getAbis() {
            Object abi =
                    getTag().equals(SystemImageTags.GOOGLE_APIS_X86_TAG) ? Abi.X86 : Abi.ARMEABI;

            return Collections.singletonList(abi.toString());
        }

        @NonNull
        @Override
        default List<String> getTranslatedAbis() {
            return Collections.emptyList();
        }
    }

    /**
     * Details type for system images packages. Includes information on the abi (architecture), tag
     * (device type), and vendor.
     */
    @XmlTransient
    public interface SysImgDetailsType extends ApiDetailsType {

        /**
         * @deprecated This is only supported in pre-v4. Set the results from {@link #getAbis()}
         *     instead. Sets the abi type (x86, armeabi-v7a, etc.) for this package.
         */
        default void setAbi(@NonNull String abi) {
            List<String> abis = getAbis();
            abis.clear();
            abis.add(abi);
        }

        /**
         * @deprecated This is only supported in pre-v4. Call to {@link #isValidAbis(String)}
         *     instead. Checks whether {@code value} is a valid abi type.
         */
        default boolean isValidAbi(@Nullable String value) {
            return isValidAbis(value);
        }

        /**
         * @deprecated This is only supported in pre-v4. Call to {@link #getAbis()} instead.
         *     <p>Gets the abi type (x86, armeabi-v7a, etc.) for this package.
         */
        @NonNull
        default String getAbi() {
            // Default implementation supports v4+, since v1-v3 will have this method overridden.
            return getAbis().get(0);
        }

        /**
         * Gets the list of natively-supported abi types (x86, armeabi-v7a, etc.) for this package.
         * Must include the result {@link #getAbi()} as the first item in the returned list.
         */
        @NonNull
        @Override
        default List<String> getAbis() {
            // Default implementation supports pre-v4. Any version should either override #getAbi
            // or #getNativeAbis, so there should be no circular calls.
            return Collections.singletonList(getAbi());
        }

        default boolean isValidAbis(String value) {
            return ((value != null)
                    && (value.matches(
                            Arrays.stream(Abi.values())
                                    .map(Abi::toString)
                                    .collect(Collectors.joining("|")))));
        }

        /**
         * Gets the list of translated abi types (x86, armeabi-v7a, etc.) for this package. Must not
         * include anything in {@link #getAbis()}.
         */
        @NonNull
        @Override
        default List<String> getTranslatedAbis() {
            return Collections.emptyList();
        }

        default boolean isValidTranslatedAbis(String value) {
            return ((value == null)
                    || (value.matches(
                            "armeabi|armeabi-v7a|arm64-v8a|x86|x86_64|mips|mips64|riscv64")));
        }

        default List<IdDisplay> getTags() {
            // Implementation for v1

            return new AbstractList<IdDisplay>() {
                @Override
                public int size() {
                    return DEFAULT_TAG.equals(getTag()) ? 0 : 1;
                }

                @Override
                public IdDisplay get(int index) {
                    return getTag();
                }

                @Override
                public void add(int index, IdDisplay element) {
                    if (index == 0 && size() == 0) {
                        setTag(element);
                    } else {
                        throw new IllegalArgumentException("Only one element can be added");
                    }
                }

                @Override
                public IdDisplay set(int index, IdDisplay element) {
                    if (index == 0 && size() == 1) {
                        IdDisplay oldValue = getTag();
                        setTag(element);
                        return oldValue;
                    } else {
                        throw new IndexOutOfBoundsException();
                    }
                }

                @Override
                public boolean isEmpty() {
                    return DEFAULT_TAG.equals(getTag());
                }
            };
        }

        /**
         * Gets the tag for this package. Used to match addon packages with corresponding system
         * images.
         *
         * @deprecated This is only supported in v1. Use {@link #getTags()} instead.
         */
        @Nullable
        default IdDisplay getTag() {
            // This should be overridden in v1 and shouldn't be called after that
            throw new UnsupportedOperationException();
        }

        /** @deprecated This is only supported in v1. Add to {@link #getTags()} instead. */
        default void setTag(@Nullable IdDisplay tag) {
            // This should be overridden in v1 and shouldn't be called after that
            throw new UnsupportedOperationException();
        }

        /**
         * Sets the vendor of this package.
         */
        void setVendor(@Nullable IdDisplay vendor);

        /**
         * Gets the vendor of this package.
         */
        @Nullable
        IdDisplay getVendor();

        @Override
        @NonNull
        default String getQualifierTemplate() {
            return " " + getFullApiName(getAndroidVersion()) + " (revision {0})";
        }
    }

    /**
     * Details type for packages that will be installed as maven artifacts in our local maven
     * repository.
     */
    @XmlTransient
    @Deprecated // we no longer publish maven sdk components
    public interface MavenType {}

    /** Gets the path/unique id for the platform of the given {@link AndroidVersion}. */
    @NonNull
    public static String getPlatformPath(@NonNull AndroidVersion version) {
        if (version.isBaseExtension()) {
            return SdkConstants.FD_PLATFORMS
                    + RepoPackage.PATH_SEPARATOR
                    + "android-"
                    + version.getApiString();
        } else {
            return SdkConstants.FD_PLATFORMS
                    + RepoPackage.PATH_SEPARATOR
                    + "android-"
                    + version.getApiString()
                    + "-ext"
                    + version.getExtensionLevel();
        }
    }

    /** Gets the path/unique id for the sources of the given {@link AndroidVersion}. */
    @NonNull
    public static String getSourcesPath(@NonNull AndroidVersion version) {
        if (version.isBaseExtension()) {
            return SdkConstants.FD_PKG_SOURCES
                    + RepoPackage.PATH_SEPARATOR
                    + "android-"
                    + version.getApiString();
        } else {
            return SdkConstants.FD_PKG_SOURCES
                    + RepoPackage.PATH_SEPARATOR
                    + "android-"
                    + version.getApiString()
                    + "-ext"
                    + version.getExtensionLevel();
        }
    }

    /**
     * Gets the path/unique id for the LLDB of the given {@link Revision}.
     *
     * <p>TODO: consider moving to an LLDB-specific place.
     */
    @NonNull
    public static String getLldbPath(@NonNull Revision revision) {
        return SdkConstants.FD_LLDB + RepoPackage.PATH_SEPARATOR + revision.getMajor() + "."
               + revision.getMinor();
    }

    /**
     * Gets the default path/unique id for the given addon
     */
    public static String getAddonPath(IdDisplay vendor, AndroidVersion version, IdDisplay name) {
        StringBuilder pathBuilder =
                new StringBuilder()
                        .append(SdkConstants.FD_ADDONS)
                        .append(RepoPackage.PATH_SEPARATOR)
                        .append("addon-")
                        .append(name.getId())
                        .append("-")
                        .append(vendor.getId())
                        .append("-")
                        .append(version.getApiString());
        if (!version.isBaseExtension()) {
            pathBuilder.append("-ext").append(version.getExtensionLevel());
        }
        return pathBuilder.toString();
    }

    /**
     * Gets the default path/unique id for the given system image
     */
    public static String getSysImgPath(IdDisplay vendor, AndroidVersion version, IdDisplay name,
            String abi) {
        StringBuilder pathBuilder =
                new StringBuilder()
                        .append(SdkConstants.FD_SYSTEM_IMAGES)
                        .append(RepoPackage.PATH_SEPARATOR)
                        .append("android-")
                        .append(version.getApiString());
        if (!version.isBaseExtension()) {
            pathBuilder.append("-ext").append(version.getExtensionLevel());
        }
        return pathBuilder
                .append(RepoPackage.PATH_SEPARATOR)
                .append(name.getId())
                .append(RepoPackage.PATH_SEPARATOR)
                .append(abi)
                .toString();
    }

    /**
     * Gets the default path/unique id for the given build tools
     */
    public static String getBuildToolsPath(Revision revision) {
        return SdkConstants.FD_BUILD_TOOLS + RepoPackage.PATH_SEPARATOR + revision.toString("-");
    }
}
