/*
 * Copyright (C) 2012 The Android Open Source Project
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

package com.android.build.gradle.internal.dsl;

import com.android.annotations.NonNull;
import com.android.annotations.Nullable;
import com.android.build.gradle.internal.LoggerWrapper;
import com.android.build.gradle.internal.services.DslServices;
import com.android.build.gradle.options.BooleanOption;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/** DSL object for configuring aapt options. */
public abstract class AaptOptions implements com.android.build.api.dsl.AaptOptions, com.android.build.api.dsl.AndroidResources {

    @Inject
    public AaptOptions(DslServices dslServices) {
        this.setNamespaced(dslServices.getProjectOptions().get(BooleanOption.ENABLE_RESOURCE_NAMESPACING_DEFAULT));
    }

    // Use an internal type to keep the logging for now
    protected abstract List<String> getInternalNoCompressList();

    public void setIgnoreAssets(@Nullable String ignoreAssetsPattern) {
        setIgnoreAssetsPattern(ignoreAssetsPattern);
    }

    /**
     * Pattern describing assets to be ignore.
     *
     * <p>See <code>aapt --help</code>
     */
    public String getIgnoreAssets() {
        return getIgnoreAssetsPattern();
    }

    @Override
    public void setIgnoreAssetsPattern(@Nullable String ignoreAssetsPattern) {
        Collection<String> ignoreAssetsPatterns = getIgnoreAssetsPatterns();
        ignoreAssetsPatterns.clear();
        if (ignoreAssetsPattern != null) {
            ignoreAssetsPatterns.addAll(Splitter.on(':').splitToList(ignoreAssetsPattern));
        }
    }

    @Override
    @Nullable
    public String getIgnoreAssetsPattern() {
        Collection<String> ignoreAssetsPatterns = getIgnoreAssetsPatterns();
        if (ignoreAssetsPatterns.isEmpty()) {
            return null;
        }
        return Joiner.on(':').join(ignoreAssetsPatterns);
    }

    protected abstract List<String> getInternalIgnoreAssetsPatterns();

    @NotNull
    @Override
    public Collection<String> getIgnoreAssetsPatterns() {
        return getInternalIgnoreAssetsPatterns();
    }

    public void setNoCompress(String noCompress) {
        setNoCompress(Collections.singletonList(noCompress));
    }

    public void setNoCompress(Iterable<String> noCompress) {
        setNoCompress(Iterables.toArray(noCompress, String.class));
    }

    public void setNoCompress(String... noCompress) {
        getInternalNoCompressList().clear();
        noCompress(noCompress);
    }

    @NonNull
    @Override
    public Collection<String> getNoCompress() {
        return getInternalNoCompressList();
    }

    /**
     * @deprecated New cruncher always enbled by default. This api is deprecated and will be removed
     *     in 9.0
     */
    @SuppressWarnings("MethodMayBeStatic")
    @Deprecated
    public void useNewCruncher(boolean value) {
        LoggerWrapper.getLogger(AaptOptions.class).warning("useNewCruncher has been deprecated. "
                + "It will be removed in a future version of the gradle plugin. New cruncher is "
                + "now always enabled.");
    }

    /**
     * @deprecated New cruncher always enbled by default. This api is deprecated and will be removed
     *     in 9.0
     */
    @SuppressWarnings("MethodMayBeStatic")
    @Deprecated
    public void setUseNewCruncher(boolean value) {
        LoggerWrapper.getLogger(AaptOptions.class).warning("useNewCruncher has been deprecated. "
                + "It will be removed in a future version of the gradle plugin. New cruncher is "
                + "now always enabled.");
    }

    public void setCruncherEnabled(boolean value) {
        setCruncherEnabledOverride(value);
    }

    /**
     * Whether to crunch PNGs.
     *
     * <p>This will reduce the size of the APK if PNGs resources are not already optimally
     * compressed, at the cost of extra time to build.
     *
     * <p>PNG crunching is enabled by default in the release build type and disabled by default in
     * the debug build type.
     *
     * <p>This is replaced by {@link BuildType#isCrunchPngs()}.
     */
    @Deprecated
    public boolean getCruncherEnabled() {
        // Simulate true if unset. This is not really correct, but changing it to be a tri-state
        // nullable Boolean is potentially a breaking change if the getter was being used by build
        // scripts or third party plugins.
        Boolean cruncherEnabled = getCruncherEnabledOverride();
        return cruncherEnabled == null ? true : cruncherEnabled;
    }

    public abstract Boolean getCruncherEnabledOverride();

    protected abstract void setCruncherEnabledOverride(Boolean value);

    /**
     * Whether to use the new cruncher.
     */
    public boolean getUseNewCruncher() {
        return true;
    }

    public void failOnMissingConfigEntry(boolean value) {
        setFailOnMissingConfigEntry(value);
    }

    @Override
    public abstract void setFailOnMissingConfigEntry(boolean value);

    @Override
    public abstract boolean getFailOnMissingConfigEntry();

    // -- DSL Methods. TODO remove once the instantiator does what I expect it to do.

    @Override
    public void noCompress(@NonNull String noCompress) {
        getNoCompress().add(noCompress);
    }

    @Override
    public void noCompress(@NonNull String... noCompress) {
        for (String p : noCompress) {
            if (p.equals("\"\"")) {
                LoggerWrapper.getLogger(AaptOptions.class).warning("noCompress pattern '\"\"' "
                        + "no longer matches every file. It now matches exactly two double quote "
                        + "characters. Please use '' instead.");
            }
        }
        Collections.addAll(getNoCompress(), noCompress);
    }

    @Override
    public void additionalParameters(@NonNull String param) {
        getAdditionalParameters().add(param);
    }

    @Override
    public void additionalParameters(@NonNull String... params) {
        Collections.addAll(getAdditionalParameters(), params);
    }

    public abstract void setAdditionalParameters(@NonNull List<String> parameters);

    @Override
    @NonNull
    public abstract List<String> getAdditionalParameters();

    /** @deprecated This api is deprecated and will be removed in 9.0 */
    @Deprecated
    public abstract void setCruncherProcesses(int cruncherProcesses);

    /** @deprecated This api is deprecated and will be removed in 9.0 */
    @Deprecated
    public abstract int getCruncherProcesses();

    @Override
    public abstract boolean getNamespaced();

    @Override
    public abstract void setNamespaced(boolean namespaced);

    public void namespaced(boolean namespaced) {
        setNamespaced(namespaced);
    }
}
