/*
 * Copyright (C) 2016 The Android Open Source Project
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

package com.android.sdklib.repository.legacy.descriptors;

import com.android.annotations.NonNull;
import com.android.annotations.Nullable;
import com.android.repository.Revision;
import com.android.repository.Revision.PreviewComparison;
import com.android.repository.api.License;
import com.android.repository.api.RepoManager;
import com.android.sdklib.AndroidTargetHash;
import com.android.sdklib.AndroidVersion;
import com.android.sdklib.SystemImageTags;
import com.android.sdklib.repository.AndroidSdkHandler;
import com.android.sdklib.repository.IdDisplay;
import com.google.common.annotations.VisibleForTesting;
import java.nio.file.Path;
import java.util.Locale;

/**
 * {@link PkgDesc} keeps information on individual SDK packages
 * (both local or remote packages definitions.)
 * <br>
 * Packages have different attributes depending on their type.
 * <p>
 * To create a new {@link PkgDesc}, use one of the package-specific constructors
 * provided here.
 * <p>
 * To query packages capabilities, rely on {@link #getType()} and the {@code PkgDesc.hasXxx()}
 * methods provided in the base {@link PkgDesc}.
 *
 * @deprecated This is part of the old SDK manager framework. Use
 * {@link AndroidSdkHandler}/{@link RepoManager} and associated classes instead.
 */
@Deprecated
public class PkgDesc implements IPkgDesc {
    static final String PREVIEW_SUFFIX = "-preview";
    private final PkgType mType;
    private final Revision mRevision;
    private final AndroidVersion mAndroidVersion;
    private final String mPath;
    private final IdDisplay mTag;
    private final IdDisplay mVendor;
    private final Revision mMinToolsRev;
    private final Revision mMinPlatformToolsRev;
    private final IIsUpdateFor mCustomIsUpdateFor;
    private final IGetPath mCustomPath;

    private final License mLicense;
    private final String mListDisplay;
    private final String mDescriptionShort;
    private final String mDescriptionUrl;
    private final boolean mIsObsolete;
    private final IdDisplay mName;

    protected PkgDesc(@NonNull PkgType type,
                      @Nullable License license,
                      @Nullable String listDisplay,
                      @Nullable String descriptionShort,
                      @Nullable String descriptionUrl,
                      boolean isObsolete,
                      @Nullable Revision revision,
                      @Nullable AndroidVersion androidVersion,
                      @Nullable String path,
                      @Nullable IdDisplay tag,
                      @Nullable IdDisplay vendor,
                      @Nullable Revision minToolsRev,
                      @Nullable Revision minPlatformToolsRev,
                      @Nullable IIsUpdateFor customIsUpdateFor,
                      @Nullable IGetPath customPath,
                      @Nullable IdDisplay name) {
        mType = type;
        mIsObsolete = isObsolete;
        mLicense = license;
        mListDisplay = listDisplay;
        mDescriptionShort = descriptionShort;
        mDescriptionUrl = descriptionUrl;
        mRevision = revision;
        mAndroidVersion = androidVersion;
        mPath = path;
        mTag = tag;
        mVendor = vendor;
        mMinToolsRev = minToolsRev;
        mMinPlatformToolsRev = minPlatformToolsRev;
        mCustomIsUpdateFor = customIsUpdateFor;
        mCustomPath = customPath;
        mName = name;
    }

    @NonNull
    @Override
    public PkgType getType() {
        return mType;
    }

    @Override
    @Nullable
    public String getListDisplay() {
        return mListDisplay;
    }

    @Override
    @Nullable
    public IdDisplay getName() {
        return mName;
    }

    @Override
    @Nullable
    public String getDescriptionShort() {
        return mDescriptionShort;
    }

    @Override
    @Nullable
    public String getDescriptionUrl() {
        return mDescriptionUrl;
    }

    @Override
    @Nullable
    public License getLicense() {
        return mLicense;
    }

    @Override
    public boolean isObsolete() {
        return mIsObsolete;
    }

    @Override
    public final boolean hasAndroidVersion() {
        return getType().hasAndroidVersion();
    }

    @Override
    public final boolean hasPath() {
        return getType().hasPath() && getPath() != null;
    }

    @Override
    public final boolean hasTag() {
        return getType().hasTag();
    }

    @Override
    public boolean hasVendor() {
        return getType().hasVendor();
    }

    public boolean hasName() {
        return getType().hasName();
    }

    @Override
    public final boolean hasMinToolsRev() {
        return getType().hasMinToolsRev();
    }

    @Override
    public final boolean hasMinPlatformToolsRev() {
        return getType().hasMinPlatformToolsRev();
    }

    @NonNull
    @Override
    public final Revision getRevision() {
        return mRevision;
    }

    @Nullable
    @Override
    public AndroidVersion getAndroidVersion() {
        return mAndroidVersion;
    }

    @Override
    public boolean isPreview() {
        return getRevision().isPreview();
    }

    @Nullable
    @Override
    public String getPath() {
        if (mCustomPath != null) {
            return mCustomPath.getPath(this);
        } else {
            return mPath;
        }
    }

    @Nullable
    @Override
    public IdDisplay getTag() {
        return mTag;
    }

    @Nullable
    @Override
    public IdDisplay getVendor() {
        return mVendor;
    }

    @Nullable
    @Override
    public Revision getMinToolsRev() {
        return mMinToolsRev;
    }

    @Nullable
    @Override
    public Revision getMinPlatformToolsRev() {
        return mMinPlatformToolsRev;
    }

    @Override
    public String getInstallId() {
        String id = getBaseInstallId();
        if (getRevision().isPreview()) {
            return id + PREVIEW_SUFFIX;
        }
        return id;
    }

    @Override
    public String getBaseInstallId() {
        StringBuilder sb = new StringBuilder();

        /* iid patterns:
        tools, platform-tools => FOLDER
        build-tools => FOLDER-REV
        doc, sample, source => ENUM-API
        extra => ENUM-VENDOR.id-PATH
        platform => android-API
        add-on => addon-NAME.id-VENDOR.id-API
        platform sys-img => sys-img-ABI-TAG|android-API
        add-on sys-img => sys-img-ABI-addon-NAME.id-VENDOR.id-API
        */

        switch (mType) {
        case PKG_TOOLS:
        case PKG_PLATFORM_TOOLS:
            sb.append(mType.getFolderName());
            break;

        case PKG_LLDB:
            Revision rev = getRevision();
            sb.append(mType.getFolderName()).append('-');
            sb.append(rev.getMajor());
            sb.append('.');
            sb.append(rev.getMinor());
            break;
        case PKG_BUILD_TOOLS:
            sb.append(mType.getFolderName()).append('-');
            // Add version number without the preview revision number. This is to make preview
            // packages be updatable to the next revision.
            int[] version = getRevision().toIntArray(false);
            for (int i = 0; i < version.length; i++) {
                sb.append(version[i]);
                if (i != version.length - 1) {
                    sb.append('.');
                }
            }
            break;

        case PKG_DOC:
            sb.append("doc");
            break;

        case PKG_SAMPLE:
        case PKG_SOURCE:
            sb.append(mType.toString().toLowerCase(Locale.US).replace("pkg_", ""));
            sb.append('-').append(getAndroidVersion().getApiString());
            break;

        case PKG_EXTRA:
            sb.append("extra-")
              .append(getVendor().getId())
              .append('-')
              .append(getPath());
            break;

        case PKG_PLATFORM:
            sb.append(AndroidTargetHash.PLATFORM_HASH_PREFIX)
                    .append(getAndroidVersion().getApiString());
            break;

        case PKG_ADDON:
            sb.append("addon-")
              .append(getName().getId())
              .append('-')
              .append(getVendor().getId())
              .append('-')
              .append(getAndroidVersion().getApiString());
            break;

        case PKG_SYS_IMAGE:
                sb.append("sys-img-")
                        .append(getPath()) // path==ABI for sys-img
                        .append('-')
                        .append(
                                SystemImageTags.DEFAULT_TAG.equals(getTag())
                                        ? "android"
                                        : getTag().getId())
                        .append('-')
                        .append(getAndroidVersion().getApiString());
            break;

        case PKG_ADDON_SYS_IMAGE:
                sb.append("sys-img-")
                        .append(getPath()) // path==ABI for sys-img
                        .append("-addon-")
                        .append(
                                SystemImageTags.DEFAULT_TAG.equals(getTag())
                                        ? "android"
                                        : getTag().getId())
                        .append('-')
                        .append(getVendor().getId())
                        .append('-')
                        .append(getAndroidVersion().getApiString());
            break;

        case PKG_NDK:
            sb.append("ndk");
            break;

        default:
            throw new IllegalArgumentException("IID not defined for type " + mType.toString());
        }

        return sanitize(sb.toString());
    }

    @NonNull
    @Override
    public Path getCanonicalInstallFolder(@NonNull Path sdkLocation) {
        Path f = sdkLocation.resolve(mType.getFolderName());

        /* folder patterns:
        tools, platform-tools, doc => FOLDER
        build-tools, add-on => FOLDER/IID
        platform, sample, source => FOLDER/android-API
        platform sys-img => FOLDER/android-API/TAG/ABI
        add-on sys-img => FOLDER/addon-NAME.id-VENDOR.id-API/ABI
        extra => FOLDER/VENDOR.id/PATH
        */

        switch (mType) {
        case PKG_TOOLS:
        case PKG_PLATFORM_TOOLS:
        case PKG_DOC:
            // no-op, top-folder is all what is needed here
            break;

        case PKG_BUILD_TOOLS:
        case PKG_ADDON:
                f = f.resolve(getInstallId());
            break;

        case PKG_PLATFORM:
        case PKG_SAMPLE:
        case PKG_SOURCE:
                f =
                        f.resolve(
                                AndroidTargetHash.PLATFORM_HASH_PREFIX
                                        + sanitize(getAndroidVersion().getApiString()));
            break;

        case PKG_SYS_IMAGE:
                f =
                        f.resolve(
                                        AndroidTargetHash.PLATFORM_HASH_PREFIX
                                                + sanitize(getAndroidVersion().getApiString()))
                                .resolve(
                                        sanitize(
                                                SystemImageTags.DEFAULT_TAG.equals(getTag())
                                                        ? "android"
                                                        : getTag().getId()))
                                .resolve(sanitize(getPath())); // path==abi
            break;

        case PKG_ADDON_SYS_IMAGE:
                String name =
                        "addon-"
                                + (SystemImageTags.DEFAULT_TAG.equals(getTag())
                                        ? "android"
                                        : getTag().getId())
                                + '-'
                                + getVendor().getId()
                                + '-'
                                + getAndroidVersion().getApiString();
                f = f.resolve(sanitize(name)).resolve(sanitize(getPath())); // path==abi
          break;

        case PKG_EXTRA:
                f = f.resolve(sanitize(getVendor().getId())).resolve(sanitize(getPath()));
            break;

        default:
            throw new IllegalArgumentException(
                    "CanonicalFolder not defined for type " + mType.toString());
        }

        return f;
    }

    //---- Updating ----

    /**
     * Computes the most general case of {@link #isUpdateFor(IPkgDesc)}.
     * Individual package types use this and complement with their own specific cases
     * as needed.
     *
     * @param existingDesc A non-null package descriptor to compare with.
     * @return True if this package descriptor would generally update the given one.
     */
    @Override
    public boolean isUpdateFor(@NonNull IPkgDesc existingDesc) {
        return isUpdateFor(existingDesc, PreviewComparison.COMPARE_NUMBER);
    }

    @Override
    public boolean isUpdateFor(@NonNull IPkgDesc existingDesc,
            @NonNull PreviewComparison previewComparison) {
        if (mCustomIsUpdateFor != null) {
            return mCustomIsUpdateFor.isUpdateFor(this, existingDesc);
        } else {
            return isGenericUpdateFor(existingDesc, previewComparison);
        }
    }

    /**
     * Computes the most general case of {@link #isUpdateFor(IPkgDesc)}.
     * Individual package types use this and complement with their own specific cases
     * as needed.
     *
     * @param existingDesc A non-null package descriptor to compare with.
     * @param previewComparison The type of preview comparison to do.
     * @return True if this package descriptor would generally update the given one.
     */
    private boolean isGenericUpdateFor(@NonNull IPkgDesc existingDesc,
                                       PreviewComparison previewComparison) {

        if (existingDesc == null || !getType().equals(existingDesc.getType())) {
            return false;
        }
        if (!getType().equals(PkgType.PKG_EXTRA) &&
                !existingDesc.getBaseInstallId().equals(getBaseInstallId())) {
            return false;
        }
        // Packages that have an Android version can generally only be updated
        // for the same Android version (otherwise it's a new artifact.)
        if (hasAndroidVersion() && !getAndroidVersion().equals(existingDesc.getAndroidVersion())) {
            return false;
        }

        // Packages that have a vendor id need the same vendor id on both sides
        if (hasVendor() && !getVendor().equals(existingDesc.getVendor())) {
            return false;
        }

        // Packages that have a tag id need the same tag id on both sides
        if (hasTag() && !getTag().getId().equals(existingDesc.getTag().getId())) {
            return false;
        }

        // Packages that have a path can generally only be updated if both use the same path
        if (hasPath()) {
            if (this instanceof IPkgDescExtra) {
                // Extra package handle paths differently, they need to use the old_path
                // to allow upgrade compatibility.
                if (!PkgDescExtra.compatibleVendorAndPath((IPkgDescExtra) this,
                                                          (IPkgDescExtra) existingDesc)) {
                    return false;
                }
            } else if (!getPath().equals(existingDesc.getPath())) {
                return false;
            }
        }

        // Packages that have a full revision are generally updates if it increases
        // but keeps the same kind of preview (e.g. previews are only updates by previews.)
        if (previewComparison == PreviewComparison.IGNORE
                        || existingDesc.isPreview() == isPreview()) {
            // If both packages match in their preview type (both previews or both not previews)
            // then is the RC/preview number an update?
            return getRevision().compareTo(existingDesc.getRevision(),
                                               PreviewComparison.COMPARE_NUMBER) > 0;
        }

        return false;
    }


    //---- Ordering ----

    /**
     * Compares this descriptor to another one.
     * All fields must match for equality.
     * <p>
     * This is must not be used an indication that a package is a suitable update for another one.
     * The comparison order is however suitable for sorting packages for display purposes.
     */
    @Override
    public int compareTo(@NonNull IPkgDesc o) {
        int t1 = getType().getIntValue();
        int t2 = o.getType().getIntValue();
        if (t1 != t2) {
            return t1 - t2;
        }

        if (hasAndroidVersion() && o.hasAndroidVersion()) {
            t1 = getAndroidVersion().compareTo(o.getAndroidVersion());
            if (t1 != 0) {
                return t1;
            }
        }

        if (hasVendor() && o.hasVendor()) {
            t1 = getVendor().compareTo(o.getVendor());
            if (t1 != 0) {
                return t1;
            }
        }

        if (hasTag() && o.hasTag()) {
            t1 = getTag().compareTo(o.getTag());
            if (t1 != 0) {
                return t1;
            }
        }

        if (hasPath() && o.hasPath()) {
            t1 = getPath().compareTo(o.getPath());
            if (t1 != 0) {
                return t1;
            }
        }

        t1 = getRevision().compareTo(o.getRevision());
        if (t1 != 0) {
            return t1;
        }

        if (hasMinToolsRev() && o.hasMinToolsRev()) {
            t1 = getMinToolsRev().compareTo(o.getMinToolsRev());
            if (t1 != 0) {
                return t1;
            }
        }

        if (hasMinPlatformToolsRev() && o.hasMinPlatformToolsRev()) {
            t1 = getMinPlatformToolsRev().compareTo(o.getMinPlatformToolsRev());
            if (t1 != 0) {
                return t1;
            }
        }

        return 0;
    }

    // --- display description ----

    @NonNull
    @Override
    public String getListDescription() {
        if (mListDisplay != null && !mListDisplay.isEmpty()) {
            return mListDisplay;
        }

        return patternReplaceImpl(getType().getListDisplayPattern());
    }

    @VisibleForTesting
    protected String patternReplaceImpl(String result) {
        // Flags for list description pattern string, used in PkgType:
        //      $MAJ  $FULL  $API  $PATH  $TAG  $VEND  $NAME (for extras)

        result = result
                .replace("$MAJ", getRevision().toShortString());
        result = result
                .replace("$FULL", getRevision().toShortString());
        result = result
                .replace("$API", hasAndroidVersion() ? getAndroidVersion().getApiString() : "");
        result = result.replace("$PATH", hasPath() ? getPath() : "");
        result =
                result.replace(
                        "$TAG",
                        hasTag() && !getTag().equals(SystemImageTags.DEFAULT_TAG)
                                ? getTag().getDisplay()
                                : "");
        result = result.replace("$VEND",  hasVendor() ? getVendor().getDisplay() : "");
        String name = "";
        if (hasName()) {
            name = getName().getDisplay();
            if (name == null) {
                name = "";
            }
        }
        result = result.replace("$NAME", name);

        // Evaluate replacements.
        // {|choice1|choice2|...|choiceN|} gets replaced by the first non-empty choice.
        for (int start = result.indexOf("{|");
                start >= 0;
                start = result.indexOf("{|")) {
            int end = result.indexOf('}', start);
            int last = start + 1;
            for (int pipe = result.indexOf('|', last+1);
                    pipe > start;
                    last = pipe, pipe = result.indexOf('|', last+1)) {
                if (pipe - last > 1) {
                    result = result.substring(0, start) +
                             result.substring(last+1, pipe) +
                             result.substring(end+1);
                    break;
                }
            }
        }

        // Evaluate conditions.
        // {?value>1:text to use} -- uses the text if value is greater than 1.
        // Simplification: this is our only test right now so hard-code it instead of
        // using a generic expression evaluation.
        for (int start = result.indexOf("{?");
                start >= 0;
                start = result.indexOf("{?")) {
            int end = result.indexOf('}', start);
            int op = result.indexOf(">1:");
            if (op > start) {
                String value = "";
                try {
                    Revision i = Revision.parseRevision(result.substring(start+2, op));
                    if (i.compareTo(new Revision(1)) > 0) {
                        value = result.substring(op+3, end);
                    }
                } catch (NumberFormatException e) {
                    value = "ERROR " + e.getMessage() + " in " + result.substring(start, end+1);
                }
                result = result.substring(0, start) +
                         value +
                         result.substring(end+1);
            }
        }


        return result;
    }

    /** String representation for debugging purposes. */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("<PkgDesc");                                                 //NON-NLS-1$

        builder.append(" Type=");                                                   //NON-NLS-1$
        builder.append(getType().toString()
                                .toLowerCase(Locale.US)
                                .replace("pkg_", ""));                 //NON-NLS-1$ //NON-NLS-2$

        if (hasAndroidVersion()) {
            builder.append(" Android=").append(getAndroidVersion());                //NON-NLS-1$
        }

        if (hasVendor()) {
            builder.append(" Vendor=").append(getVendor().toString());              //NON-NLS-1$
        }

        if (hasTag()) {
            builder.append(" Tag=").append(getTag());                               //NON-NLS-1$
        }

        if (hasPath()) {
            builder.append(" Path=").append(getPath());                             //NON-NLS-1$
        }

        builder.append(" Rev=").append(getRevision());                //NON-NLS-1$

        if (hasMinToolsRev()) {
            builder.append(" MinToolsRev=").append(getMinToolsRev());               //NON-NLS-1$
        }

        if (hasMinPlatformToolsRev()) {
            builder.append(" MinPlatToolsRev=").append(getMinPlatformToolsRev());   //NON-NLS-1$
        }

        if (mListDisplay != null) {
            builder.append(" ListDisp=").append(mListDisplay);                      //NON-NLS-1$
        }

        if (mDescriptionShort != null) {
            builder.append(" DescShort=").append(mDescriptionShort);                //NON-NLS-1$
        }

        if (mDescriptionUrl != null) {
            builder.append(" DescUrl=").append(mDescriptionUrl);                    //NON-NLS-1$
        }

        if (mLicense != null) {
            builder.append(" License['").append(mLicense.getId())           //NON-NLS-1$
                    .append("]=")                                                    //NON-NLS-1$
                    .append(mLicense.getValue().length()).append(" chars");        //NON-NLS-1$
        }

        if (isObsolete()) {
            builder.append(" Obsolete=yes");                                        //NON-NLS-1$
        }

        builder.append('>');
        return builder.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (hasAndroidVersion() ? getAndroidVersion().hashCode() : 0);
        result = prime * result + (hasVendor()         ? getVendor()      .hashCode() : 0);
        result = prime * result + (hasTag()            ? getTag()           .hashCode() : 0);
        result = prime * result + (hasPath()           ? getPath()          .hashCode() : 0);
        result = prime * result + (getRevision() .hashCode());
        result = prime * result + (hasMinToolsRev()    ? getMinToolsRev()   .hashCode() : 0);
        result = prime * result + (hasMinPlatformToolsRev() ?
                                                         getMinPlatformToolsRev().hashCode() : 0);

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof IPkgDesc)) return false;
        IPkgDesc rhs = (IPkgDesc) obj;

        if (hasAndroidVersion() != rhs.hasAndroidVersion()) {
            return false;
        }
        if (hasAndroidVersion() && !getAndroidVersion().equals(rhs.getAndroidVersion())) {
            return false;
        }

        if (hasTag() != rhs.hasTag()) {
            return false;
        }
        if (hasTag() && !getTag().equals(rhs.getTag())) {
            return false;
        }

        if (hasPath() != rhs.hasPath()) {
            return false;
        }
        if (hasPath() && !getPath().equals(rhs.getPath())) {
            return false;
        }

        if (!getRevision().equals(rhs.getRevision())) {
            return false;
        }

        if (hasMinToolsRev() != rhs.hasMinToolsRev()) {
            return false;
        }
        if (hasMinToolsRev() && !getMinToolsRev().equals(rhs.getMinToolsRev())) {
            return false;
        }

        if (hasMinPlatformToolsRev() != rhs.hasMinPlatformToolsRev()) {
            return false;
        }
        if (hasMinPlatformToolsRev() &&
                !getMinPlatformToolsRev().equals(rhs.getMinPlatformToolsRev())) {
            return false;
        }

        return true;
    }


    // ---- Constructors -----

    public interface IIsUpdateFor {
        boolean isUpdateFor(@NonNull PkgDesc thisPkgDesc, @NonNull IPkgDesc existingDesc);
    }

    public interface IGetPath {
        String getPath(@NonNull PkgDesc thisPkgDesc);
    }

    public static class Builder {
        private final PkgType mType;
        private Revision mRevision;
        private AndroidVersion mAndroidVersion;
        private String mPath;
        private IdDisplay mTag;
        private IdDisplay mVendor;
        private Revision mMinToolsRev;
        private Revision mMinPlatformToolsRev;
        private IIsUpdateFor mCustomIsUpdateFor;
        private IGetPath mCustomPath;
        private String[] mOldPaths;
        private String mNameDisplay;
        private IdDisplay mNameIdDisplay;

        private License mLicense;
        private String mListDisplay;
        private String mDescriptionShort;
        private String mDescriptionUrl;
        private boolean mIsObsolete;


        private Builder(PkgType type) {
            mType = type;
        }

        /**
         * Creates a new tool package descriptor.
         *
         * @param revision The revision of the tool package.
         * @param minPlatformToolsRev The {@code min-platform-tools-rev}.
         *          Use {@link Revision#NOT_SPECIFIED} to indicate there is no requirement.
         * @return A {@link PkgDesc} describing this tool package.
         */
        @NonNull
        public static Builder newTool(@NonNull Revision revision,
                                      @NonNull Revision minPlatformToolsRev) {
            Builder p = new Builder(PkgType.PKG_TOOLS);
            p.mRevision = revision;
            p.mMinPlatformToolsRev = minPlatformToolsRev;
            return p;
        }

        /**
         * Creates a new platform-tool package descriptor.
         *
         * @param revision The revision of the platform-tool package.
         * @return A {@link PkgDesc} describing this platform-tool package.
         */
        @NonNull
        public static Builder newPlatformTool(@NonNull Revision revision) {
            Builder p = new Builder(PkgType.PKG_PLATFORM_TOOLS);
            p.mRevision = revision;
            return p;
        }

        /**
         * Creates a new build-tool package descriptor.
         *
         * @param revision The revision of the build-tool package.
         * @return A {@link PkgDesc} describing this build-tool package.
         */
        @NonNull
        public static Builder newBuildTool(@NonNull Revision revision) {
            Builder p = new Builder(PkgType.PKG_BUILD_TOOLS);
            p.mRevision = revision;
            p.mCustomIsUpdateFor = new IIsUpdateFor() {
                @Override
                public boolean isUpdateFor(PkgDesc thisPkgDesc, IPkgDesc existingDesc) {
                    // Generic test checks that the preview type is the same (both previews or not).
                    // Build tool is different in that the full revision must be an exact match
                    // and not an increase.
                    return thisPkgDesc
                            .isGenericUpdateFor(existingDesc, PreviewComparison.COMPARE_NUMBER) &&
                            thisPkgDesc.getRevision().compareTo(
                                    existingDesc.getRevision(),
                                    PreviewComparison.COMPARE_TYPE) == 0;
                }
            };
            return p;
        }

        /**
         * Creates a new doc package descriptor.
         *
         * @param revision The revision of the doc package.
         * @return A {@link PkgDesc} describing this doc package.
         */
        @NonNull
        public static Builder newDoc(@NonNull AndroidVersion version,
                                     @NonNull Revision revision) {
            Builder p = new Builder(PkgType.PKG_DOC);
            p.mAndroidVersion = version;
            p.mRevision = revision;
            p.mCustomIsUpdateFor = new IIsUpdateFor() {
                @Override
                public boolean isUpdateFor(PkgDesc thisPkgDesc, IPkgDesc existingDesc) {
                    if (existingDesc == null ||
                            !thisPkgDesc.getType().equals(existingDesc.getType())) {
                        return false;
                    }

                    // This package is unique in the SDK. It's an update if the API is newer
                    // or the revision is newer for the same API.
                    int diff = thisPkgDesc.getAndroidVersion().compareTo(
                              existingDesc.getAndroidVersion());
                    return diff > 0 ||
                           (diff == 0 && thisPkgDesc.getRevision().compareTo(
                                        existingDesc.getRevision()) > 0);
                }
            };
            return p;
        }

        /**
         * Creates a new extra package descriptor.
         *
         * @param vendor The vendor id string of the extra package.
         * @param path The path id string of the extra package.
         * @param displayName The display name. If missing, caller should build one using the path.
         * @param oldPaths An optional list of older paths for this extra package.
         * @param revision The revision of the extra package.
         * @return A {@link PkgDesc} describing this extra package.
         */
        @NonNull
        public static Builder newExtra(@NonNull  IdDisplay vendor,
                                       @NonNull  String path,
                                       @Nullable  String displayName,
                                       @Nullable String[] oldPaths,
                                       @NonNull  Revision revision) {
            Builder p = new Builder(PkgType.PKG_EXTRA);
            p.mRevision = revision;
            p.mVendor = vendor;
            p.mPath = path;
            p.mNameDisplay = displayName;
            p.mOldPaths = oldPaths;
            return p;
        }

        /**
         * Creates a new platform package descriptor.
         *
         * @param version The android version of the platform package.
         * @param revision The revision of the extra package.
         * @param minToolsRev An optional {@code min-tools-rev}.
         *                    Use {@link Revision#NOT_SPECIFIED} to indicate
         *                    there is no requirement.
         * @return A {@link PkgDesc} describing this platform package.
         */
        @NonNull
        public static Builder newPlatform(@NonNull AndroidVersion version,
                                          @NonNull Revision revision,
                                          @NonNull Revision minToolsRev) {
            Builder p = new Builder(PkgType.PKG_PLATFORM);
            p.mAndroidVersion = version;
            p.mRevision = revision;
            p.mMinToolsRev = minToolsRev;
            p.mCustomPath = new IGetPath() {
                @Override
                public String getPath(PkgDesc thisPkgDesc) {
                    /** The "path" of a Platform is its Target Hash. */
                    return AndroidTargetHash.getPlatformHashString(thisPkgDesc.getAndroidVersion());
                }
            };
            return p;
        }

        /**
         * Create a new add-on package descriptor.
         * <p>
         * The vendor id and the name id provided are used to compute the add-on's
         * target hash.
         *
         * @param version The android version of the add-on package.
         * @param revision The revision of the add-on package.
         * @param addonVendor The vendor id/display of the add-on package.
         * @param addonName The name id/display of the add-on package.
         * @return A {@link PkgDesc} describing this add-on package.
         */
        @NonNull
        public static Builder newAddon(@NonNull AndroidVersion version,
                                       @NonNull Revision revision,
                                       @NonNull IdDisplay addonVendor,
                                       @NonNull IdDisplay addonName) {
            Builder p = new Builder(PkgType.PKG_ADDON);
            p.mAndroidVersion = version;
            p.mRevision = revision;
            p.mVendor         = addonVendor;
            p.mNameIdDisplay  = addonName;
            p.mPath = AndroidTargetHash.getAddonHashString(addonVendor.getDisplay(),
                    addonName.getDisplay(),
                    version);
            return p;
        }

        /**
         * Create a new platform system-image package descriptor.
         * <p>
         * For system-images, {@link PkgDesc#getPath()} returns the ABI.
         *
         * @param version The android version of the system-image package.
         * @param tag The tag of the system-image package.
         * @param abi The ABI of the system-image package.
         * @param revision The revision of the system-image package.
         * @return A {@link PkgDesc} describing this system-image package.
         */
        @NonNull
        public static Builder newSysImg(@NonNull AndroidVersion version,
                                        @NonNull IdDisplay tag,
                                        @NonNull String abi,
                                        @NonNull Revision revision) {
            Builder p = new Builder(PkgType.PKG_SYS_IMAGE);
            p.mAndroidVersion = version;
            p.mRevision = revision;
            p.mTag            = tag;
            p.mPath           = abi;
            p.mVendor         = null;
            return p;
        }

        /**
         * Create a new add-on system-image package descriptor.
         * <p>
         * For system-images, {@link PkgDesc#getPath()} returns the ABI.
         *
         * @param version The android version of the system-image package.
         * @param addonVendor The vendor id/display of an associated add-on.
         * @param addonName The tag of the system-image package is the add-on name.
         * @param abi The ABI of the system-image package.
         * @param revision The revision of the system-image package.
         * @return A {@link PkgDesc} describing this system-image package.
         */
        @NonNull
        public static Builder newAddonSysImg(@NonNull AndroidVersion version,
                                        @NonNull IdDisplay addonVendor,
                                        @NonNull IdDisplay addonName,
                                        @NonNull String abi,
                                        @NonNull Revision revision) {
            Builder p = new Builder(PkgType.PKG_ADDON_SYS_IMAGE);
            p.mAndroidVersion = version;
            p.mRevision = revision;
            p.mTag            = addonName;
            p.mPath           = abi;
            p.mVendor         = addonVendor;
            return p;
        }

        /**
         * Create a new source package descriptor.
         *
         * @param version The android version of the source package.
         * @param revision The revision of the source package.
         * @return A {@link PkgDesc} describing this source package.
         */
        @NonNull
        public static Builder newSource(@NonNull AndroidVersion version,
                                        @NonNull Revision revision) {
            Builder p = new Builder(PkgType.PKG_SOURCE);
            p.mAndroidVersion = version;
            p.mRevision = revision;
            return p;
        }

        /**
         * Create a new sample package descriptor.
         *
         * @param version The android version of the sample package.
         * @param revision The revision of the sample package.
         * @param minToolsRev An optional {@code min-tools-rev}.
         *                    Use {@link Revision#NOT_SPECIFIED} to indicate
         *                    there is no requirement.
         * @return A {@link PkgDesc} describing this sample package.
         */
        @NonNull
        public static Builder newSample(@NonNull AndroidVersion version,
                                        @NonNull Revision revision,
                                        @NonNull Revision minToolsRev) {
            Builder p = new Builder(PkgType.PKG_SAMPLE);
            p.mAndroidVersion = version;
            p.mRevision = revision;
            p.mMinToolsRev    = minToolsRev;
            return p;
        }

        /**
         * Creates a new NDK package descriptor.
         *
         * @param revision The revision of the NDK package.
         * @return A {@link PkgDesc} describing this NDK package.
         */
        @NonNull
        public static Builder newNdk(@NonNull Revision revision) {
            Builder p = new Builder(PkgType.PKG_NDK);
            p.mRevision = revision;
            return p;
        }

        /**
         * Creates a new LLDB package descriptor.
         *
         * @param revision The revision of the LLDB package.
         * @return A {@link PkgDesc} describing this LLDB package.
         */
        @NonNull
        public static Builder newLLDB(@NonNull Revision revision) {
            Builder p = new Builder(PkgType.PKG_LLDB);
            p.mRevision = revision;
            return p;
        }

        public Builder setLicense(@Nullable License license) {
            mLicense = license;
            return this;
        }

        public Builder setListDisplay(@Nullable String text) {
            mListDisplay = text;
            return this;
        }

        public Builder setDescriptionShort(@Nullable String text) {
            mDescriptionShort = text;
            return this;
        }

        public Builder setDescriptionUrl(@Nullable String text) {
            mDescriptionUrl = text;
            return this;
        }

        public Builder setIsObsolete(boolean isObsolete) {
            mIsObsolete = isObsolete;
            return this;
        }

        public IPkgDesc create() {

            if (mType == PkgType.PKG_EXTRA) {
                return new PkgDescExtra(
                    mType,
                    mLicense,
                    mListDisplay,
                    mDescriptionShort,
                    mDescriptionUrl,
                    mIsObsolete,
                    mRevision,
                    mAndroidVersion,
                    mPath,
                    mTag,
                    mVendor,
                    mMinToolsRev,
                    mMinPlatformToolsRev,
                    mNameDisplay,
                    mOldPaths);
            }

            return new PkgDesc(
                    mType,
                    mLicense,
                    mListDisplay,
                    mDescriptionShort,
                    mDescriptionUrl,
                    mIsObsolete,
                    mRevision,
                    mAndroidVersion,
                    mPath,
                    mTag,
                    mVendor,
                    mMinToolsRev,
                    mMinPlatformToolsRev,
                    mCustomIsUpdateFor,
                    mCustomPath,
                    mNameIdDisplay);
        }
    }

    // ---- Helpers -----

    @NonNull
    private static String sanitize(@NonNull String str) {
        str = str.toLowerCase(Locale.US).replaceAll("[^a-z0-9_.-]+", "_").replaceAll("_+", "_");
        return str;
    }
}

