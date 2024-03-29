/*
 * Copyright (C) 2007 The Android Open Source Project
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

package com.android.ide.common.resources.configuration;

import com.android.annotations.NonNull;
import com.android.annotations.Nullable;
import com.android.resources.Density;

/** Resource Qualifier for Screen Pixel Density. */
public final class DensityQualifier extends ResourceQualifier {

    public static final String NAME = "Density";

    /**
     * The qualifier to be used for configurables when there is no qualifier present. This should
     * not be used for the reference configuration.
     */
    private static final DensityQualifier NULL_QUALIFIER = new DensityQualifier(true);

    /** null iff <code>this == {@link #NULL_QUALIFIER}</code> */
    @Nullable private final Density mValue;

    /** The dpi value of the density. */
    private final int mDpi;

    public DensityQualifier() {
        this(Density.MEDIUM);
    }

    public DensityQualifier(@NonNull Density value) {
        // value is marked as NonNull so that no usages from outside this method use a null value.
        mValue = value;
        mDpi = value.getDpiValue();
    }

    private DensityQualifier(@SuppressWarnings("UnusedParameters") boolean ignored) {
        mValue = null;
        mDpi = 0;
    }

    // Not marking as NonNull or Nullable because it can technically return null (for
    // NULL_QUALIFIER) but usually won't. So, no need to keep checking for null.
    @SuppressWarnings("NullableProblem")
    public Density getValue() {
        return mValue;
    }

    public int getDpiValue() {
        return mDpi;
    }

    @Override
    public boolean hasFakeValue() {
        return false;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String getShortName() {
        return NAME;
    }

    @Override
    public String getFolderSegment() {
        if (mValue != null) {
            return mValue.getResourceValue();
        } else if (mDpi > 0) {
            return mDpi + "dpi";
        }
        return ""; //$NON-NLS-1$
    }

    @Override
    public String getShortDisplayValue() {
        if (mValue != null) {
            return mValue.getShortDisplayValue();
        } else if (mDpi > 0) {
            return mDpi + "dpi";
        }
        return ""; //$NON-NLS-1$
    }

    @Override
    public String getLongDisplayValue() {
        if (mValue != null) {
            return mValue.getLongDisplayValue();
        } else if (mDpi > 0) {
            return mDpi + "dpi";
        }
        return ""; //$NON-NLS-1$
    }

    @Override
    public boolean equals(Object qualifier) {
        return qualifier != null
                && qualifier.getClass() == DensityQualifier.class
                && mValue == ((DensityQualifier) qualifier).mValue
                && mDpi == ((DensityQualifier) qualifier).mDpi;
    }

    @Override
    public int hashCode() {
        if (mValue != null) {
            return mValue.hashCode();
        }
        return mDpi;
    }

    @Override
    public int since() {
        return 4;
    }

    @Override
    public boolean checkAndSet(String value, FolderConfiguration config) {
        Density density = Density.create(value);
        if (density != null) {
            config.setDensityQualifier(new DensityQualifier(density));
            return true;
        }
        return false;
    }

    @Override
    public boolean isValid() {
        return this != NULL_QUALIFIER;
    }

    @Override
    public DensityQualifier getNullQualifier() {
        return NULL_QUALIFIER;
    }

    @Override
    public boolean isMatchFor(ResourceQualifier qualifier) {
        // as long as there's a density qualifier, it's always a match.
        // The best match will be found later.
        return qualifier instanceof DensityQualifier;
    }

    @Override
    public boolean isBetterMatchThan(@Nullable ResourceQualifier compareTo,
            @NonNull ResourceQualifier reference) {
        if (compareTo == null) {
            return true;
        }

        Density other = ((DensityQualifier) compareTo).mValue;
        Density required = ((DensityQualifier) reference).mValue;
        assert required != null
                : "NULL_QUALIFIER Density Qualifier shouldn't be part of the reference";
        Density value = mValue;
        if (value == other) {
            return false;
        }

        value = value == null ? Density.MEDIUM : value;
        other = other == null ? Density.MEDIUM : other;

        // Always prefer ANYDPI
        if (value == Density.ANYDPI) {
            return true;
        }
        if (other == Density.ANYDPI) {
            return false;
        }
        if (required == Density.ANYDPI || required == Density.NODPI) {
            // Not sure when this would happen, but that's what is there in
            // ResourceTypes.cpp in the method ResTable_config::isBetterThan
            required = Density.MEDIUM;
        }
        int requiredDensity = required.getDpiValue();

        // DENSITY_ANY is now dealt with. We should look to pick a density bucket and potentially
        // scale it. Any density is potentially useful because the system will scale it.  Scaling
        // down is generally better than scaling up.
        int high = value.getDpiValue();
        int low = other.getDpiValue();
        boolean bImBigger = true;
        if (low > high) {
            int temp = high;
            high = low;
            low = temp;
            bImBigger = false;
        } else if (low == high && low == Density.MEDIUM.getDpiValue()) {
            // This if branch is not present in the platform's code. However, it's necessary to
            // remove uncertainty in which configuration is chosen in case of no qualifier vs mdpi

            // mdpi is preferred to no qualifier on devices with resolution >= Medium. For ldpi,
            // no qualifier is preferred to mdpi.
            return requiredDensity >= Density.MEDIUM.getDpiValue() ^ this == NULL_QUALIFIER;
        }
        if (requiredDensity > high) {
            // reference higher than both, return the higher.
            return bImBigger;
        }
        if (low >= requiredDensity) {
            // reference lower than both, return lower;
            return !bImBigger;
        }
        // saying that scaling down is 2x better than up
        if (((2 * low) - requiredDensity) * high > requiredDensity * requiredDensity) {
            return !bImBigger;
        } else {
            return bImBigger;
        }
    }
}
