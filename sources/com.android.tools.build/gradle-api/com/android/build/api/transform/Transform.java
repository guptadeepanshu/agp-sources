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

package com.android.build.api.transform;

import com.android.annotations.NonNull;
import com.android.annotations.Nullable;
import com.android.build.api.transform.QualifiedContent.ContentType;
import com.android.build.api.transform.QualifiedContent.Scope;
import com.android.build.api.variant.VariantInfo;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

import org.gradle.api.Incubating;
import org.gradle.api.file.Directory;
import org.gradle.api.file.RegularFile;
import org.gradle.api.provider.Property;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * A Transform that processes intermediary build artifacts.
 *
 * <p>This API is deprecated and is planned to be removed in Android Gradle plugin 9.0.
 *
 * <p>There is no single replacement. For more information about how to migrate, see <a
 * href="https://developer.android.com/studio/releases/gradle-plugin-roadmap">
 * https://developer.android.com/studio/releases/gradle-plugin-roadmap </a>.
 *
 * <p>For each added transform, a new task is created. The action of adding a transform takes care
 * of handling dependencies between the tasks. This is done based on what the transform processes.
 * The output of the transform becomes consumable by other transforms and these tasks get
 * automatically linked together.
 *
 * <p>The Transform indicates what it applies to (content, scope) and what it generates (content).
 *
 * <p>A transform receives input as a collection {@link TransformInput}, which is composed of {@link
 * JarInput}s and {@link DirectoryInput}s. Both provide information about the {@link Scope}s and
 * {@link ContentType}s associated with their particular content.
 *
 * <p>The output is handled by {@link TransformOutputProvider} which allows creating new
 * self-contained content, each associated with their own Scopes and Content Types. The content
 * handled by TransformInput/Output is managed by the transform system, and their location is not
 * configurable.
 *
 * <p>It is best practice to write into as many outputs as Jar/Folder Inputs have been received by
 * the transform. Combining all the inputs into a single output prevents downstream transform from
 * processing limited scopes.
 *
 * <p>While it's possible to differentiate different Content Types by file extension, it's not
 * possible to do so for Scopes. Therefore if a transform request a Scope but the only available
 * Output contains more than the requested Scope, the build will fail.<br>
 * If a transform request a single content type but the only available content includes more than
 * the requested type, the input file/folder will contain all the files of all the types, but the
 * transform should only read, process and output the type(s) it requested.
 *
 * <p>Additionally, a transform can indicate secondary inputs/outputs. These are not handled by
 * upstream or downstream transforms, and are not restricted by type handled by transform. They can
 * be anything.
 *
 * <p>It's up to each transform to manage where these files are, and to make sure that these files
 * are generated before the transform is called. This is done through additional parameters when
 * register the transform.
 *
 * <p>These secondary inputs/outputs allow a transform to read but not process any content. This can
 * be achieved by having {@link #getScopes()} return an empty list and use {@link
 * #getReferencedScopes()} to indicate what to read instead.
 *
 * @deprecated This API is planned to be removed in Android Gradle Plugin 9.0.
 */
@SuppressWarnings("MethodMayBeStatic")
@Deprecated // b/368426481
public abstract class Transform {

    /**
     * Returns the unique name of the transform.
     *
     * <p>This is associated with the type of work that the transform does. It does not have to be
     * unique per variant.
     */
    @NonNull
    public abstract String getName();

    /**
     * Whether this transform should be applied to a given variant.
     *
     * <p>since 3.4
     *
     * @return true if the transform should be applied to a given variant, false otherwise.
     * @param variant information about the current variant.
     */
    @Incubating
    public boolean applyToVariant(@NonNull VariantInfo variant) {
        return true;
    }

    /**
     * Returns the type(s) of data that is consumed by the Transform. This may be more than
     * one type.
     *
     * <strong>This must be of type {@link QualifiedContent.DefaultContentType}</strong>
     */
    @NonNull
    public abstract Set<ContentType> getInputTypes();

    /**
     * Returns the type(s) of data that is generated by the Transform. This may be more than
     * one type.
     *
     * <p>The default implementation returns {@link #getInputTypes()}.
     *
     * <p><strong>This must be of type {@link QualifiedContent.DefaultContentType}</strong>
     */
    @NonNull
    public Set<ContentType> getOutputTypes() {
        return getInputTypes();
    }

    /**
     * Returns the scope(s) of the Transform. This indicates which scopes the transform consumes.
     */
    @NonNull
    public abstract Set<? super Scope> getScopes();

    /**
     * Returns the referenced scope(s) for the Transform. These scopes are not consumed by
     * the Transform. They are provided as inputs, but are still available as inputs for
     * other Transforms to consume.
     *
     * <p>The default implementation returns an empty Set.
     */
    @NonNull
    public Set<? super Scope> getReferencedScopes() {
        return ImmutableSet.of();
    }

    /**
     * Returns a list of additional file(s) that this Transform needs to run. Preferably, use
     * {@link #getSecondaryFiles()} API which allow eah secondary file to indicate if changes
     * can be handled incrementally or not. This API will treat all additional file change as
     * a non incremental event.
     *
     * <p>Changes to files returned in this list will trigger a new execution of the Transform
     * even if the qualified-content inputs haven't been touched.
     *
     * <p>Any changes to these files will trigger a non incremental execution.
     *
     * <p>The default implementation returns an empty collection.
     *
     * @deprecated replaced by {@link #getSecondaryFiles()}
     */
    @Deprecated
    @NonNull
    public Collection<File> getSecondaryFileInputs() {
        return ImmutableList.of();
    }

    /**
     * Returns a list of additional file(s) that this Transform needs to run.
     *
     * <p>Changes to files returned in this list will trigger a new execution of the Transform
     * even if the qualified-content inputs haven't been touched.
     *
     * <p>Each secondary input has the ability to be declared as necessitating a non incremental
     * execution in case of change. This Transform can therefore declare which secondary file
     * changes it supports in incremental mode.
     *
     * <p>The default implementation returns an empty collection.
     */
    @NonNull
    public Collection<SecondaryFile> getSecondaryFiles() {
        return ImmutableList.of();
    }

    /**
     * Returns a list of additional (out of streams) file(s) that this Transform creates.
     *
     * <p>These File instances can only represent files, not directories. For directories, use
     * {@link #getSecondaryDirectoryOutputs()}
     *
     *
     * <p>Changes to files returned in this list will trigger a new execution of the Transform
     * even if the qualified-content inputs haven't been touched.
     *
     * <p>Changes to these output files force a non incremental execution.
     *
     * <p>The default implementation returns an empty collection.
     */
    @NonNull
    public Collection<File> getSecondaryFileOutputs() {
        return ImmutableList.of();
    }

    /**
     * Returns a list of additional (out of streams) directory(ies) that this Transform creates.
     *
     * <p>These File instances can only represent directories. For files, use
     * {@link #getSecondaryFileOutputs()}
     *
     * <p>Changes to directories returned in this list will trigger a new execution of the Transform
     * even if the qualified-content inputs haven't been touched.
     *
     * <p>Changes to these output directories force a non incremental execution.
     *
     * <p>The default implementation returns an empty collection.
     */
    @NonNull
    public Collection<File> getSecondaryDirectoryOutputs() {
        return ImmutableList.of();
    }

    /**
     * Returns a map of non-file input parameters using a unique identifier as the map key.
     *
     * <p>Changes to values returned in this map will trigger a new execution of the Transform
     * even if the content inputs haven't been touched.
     *
     * <p>Changes to these values force a non incremental execution.
     *
     * <p>The default implementation returns an empty Map.
     */
    @NonNull
    public Map<String, Object> getParameterInputs() {
        return ImmutableMap.of();
    }

    /**
     * Returns whether the Transform can perform incremental work.
     *
     * <p>If it does, then the TransformInput may contain a list of changed/removed/added files, unless
     * something else triggers a non incremental run.
     */
    public abstract boolean isIncremental();

    /**
     * For Transforms that produce an output available though the [BuildArtifactsHolder] provider
     * based interfaces should indicate the output directory of the produced artifact
     *
     * @param directory
     */
    public void setOutputDirectory(@NonNull Property<Directory> directory) {}

    public void setOutputFile(@NonNull Property<RegularFile> file) {}

    /**
     * @deprecated replaced by {@link #transform(TransformInvocation)}.
     */
    @Deprecated
    @SuppressWarnings("UnusedParameters")
    public void transform(
            @NonNull Context context,
            @NonNull Collection<TransformInput> inputs,
            @NonNull Collection<TransformInput> referencedInputs,
            @Nullable TransformOutputProvider outputProvider,
            boolean isIncremental) throws IOException, TransformException, InterruptedException {
    }

    /**
     * Executes the Transform.
     *
     * <p>The inputs are packaged as an instance of {@link TransformInvocation}
     * <ul>
     *     <li>The <var>inputs</var> collection of {@link TransformInput}. These are the inputs
     *     that are consumed by this Transform. A transformed version of these inputs must
     *     be written into the output. What is received is controlled through
     *     {@link #getInputTypes()}, and {@link #getScopes()}.</li>
     *     <li>The <var>referencedInputs</var> collection of {@link TransformInput}. This is
     *     for reference only and should be not be transformed. What is received is controlled
     *     through {@link #getReferencedScopes()}.</li>
     * </ul>
     *
     * A transform that does not want to consume anything but instead just wants to see the content
     * of some inputs should return an empty set in {@link #getScopes()}, and what it wants to
     * see in {@link #getReferencedScopes()}.
     *
     * <p>Even though a transform's {@link Transform#isIncremental()} returns true, this method may
     * be receive <code>false</code> in <var>isIncremental</var>. This can be due to
     * <ul>
     *     <li>a change in secondary files ({@link #getSecondaryFiles()},
     *     {@link #getSecondaryFileOutputs()}, {@link #getSecondaryDirectoryOutputs()})</li>
     *     <li>a change to a non file input ({@link #getParameterInputs()})</li>
     *     <li>an unexpected change to the output files/directories. This should not happen unless
     *     tasks are improperly configured and clobber each other's output.</li>
     *     <li>a file deletion that the transform mechanism could not match to a previous input.
     *     This should not happen in most case, except in some cases where dependencies have
     *     changed.</li>
     * </ul>
     * In such an event, when <var>isIncremental</var> is false, the inputs will not have any
     * incremental change information:
     * <ul>
     *     <li>{@link JarInput#getStatus()} will return {@link Status#NOTCHANGED} even though
     *     the file may be added/changed.</li>
     *     <li>{@link DirectoryInput#getChangedFiles()} will return an empty map even though
     *     some files may be added/changed.</li>
     * </ul>
     *
     * @param transformInvocation the invocation object containing the transform inputs.
     * @throws IOException if an IO error occurs.
     * @throws InterruptedException
     * @throws TransformException Generic exception encapsulating the cause.
     */
    public void transform(@NonNull TransformInvocation transformInvocation)
            throws TransformException, InterruptedException, IOException {
        // Just delegate to old method, for code that uses the old API.
        //noinspection deprecation
        transform(transformInvocation.getContext(), transformInvocation.getInputs(),
                transformInvocation.getReferencedInputs(),
                transformInvocation.getOutputProvider(),
                transformInvocation.isIncremental());
    }

    /**
     * Returns if this transform's outputs should be cached. Please read {@link
     * org.gradle.api.tasks.CacheableTask} Javadoc if you would like to make your transform
     * cacheable.
     */
    public boolean isCacheable() {
        return false;
    }
}
