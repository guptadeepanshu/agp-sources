/*
 * Copyright (C) 2019 The Android Open Source Project
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

package com.android.builder.packaging;

import com.android.SdkConstants;
import com.android.annotations.NonNull;
import com.android.annotations.Nullable;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public interface JarCreator extends Closeable {

    Predicate<String> CLASSES_ONLY = archivePath -> archivePath.endsWith(SdkConstants.DOT_CLASS);
    Predicate<String> EXCLUDE_CLASSES =
            archivePath -> !archivePath.endsWith(SdkConstants.DOT_CLASS);

    /**
     * A filter that keeps everything but ignores duplicate resources.
     *
     * <p>Stateful, hence a factory method rather than an instance.
     */
    static Predicate<String> allIgnoringDuplicateResources() {
        // Keep track of resources to avoid failing on collisions.
        Set<String> resources = new HashSet<>();
        return archivePath ->
                archivePath.endsWith(SdkConstants.DOT_CLASS) || resources.add(archivePath);
    }

    interface Transformer {
        /**
         * Transforms the given file.
         *
         * @param entryPath the path within the jar file
         * @param input an input stream of the contents of the file
         * @return a new input stream if the file is transformed in some way, the same input stream
         *     if the file is to be kept as is and null if the file should not be packaged.
         */
        @Nullable
        InputStream filter(@NonNull String entryPath, @NonNull InputStream input);
    }

    interface Relocator {
        @NonNull
        String relocate(@NonNull String entryPath);
    }

    void addDirectory(@NonNull Path directory) throws IOException;

    void addDirectory(
            @NonNull Path directory,
            @Nullable Predicate<String> filterOverride,
            @Nullable Transformer transformer)
            throws IOException;

    void addDirectory(
            @NonNull Path directory,
            @Nullable Predicate<String> filterOverride,
            @Nullable Transformer transformer,
            @NonNull Relocator relocator)
            throws IOException;

    void addJar(@NonNull Path file) throws IOException;

    void addJar(@NonNull InputStream file) throws IOException;

    void addJar(
            @NonNull Path file,
            @Nullable Predicate<String> filterOverride,
            @Nullable Relocator relocator)
            throws IOException;

    void addFile(@NonNull String entryPath, @NonNull Path file) throws IOException;

    void addEntry(@NonNull String entryPath, @NonNull InputStream input) throws IOException;

    void setCompressionLevel(int level);

    void setManifestProperties(Map<String, String> properties) throws IOException;
}
