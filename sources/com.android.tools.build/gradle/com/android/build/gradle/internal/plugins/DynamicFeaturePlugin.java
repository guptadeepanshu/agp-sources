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

package com.android.build.gradle.internal.plugins;

import com.android.AndroidProjectTypes;
import com.android.annotations.NonNull;
import com.android.build.api.component.impl.TestComponentImpl;
import com.android.build.api.component.impl.TestFixturesImpl;
import com.android.build.api.dsl.SdkComponents;
import com.android.build.api.extension.impl.DynamicFeatureAndroidComponentsExtensionImpl;
import com.android.build.api.extension.impl.VariantApiOperationsRegistrar;
import com.android.build.api.variant.AndroidComponentsExtension;
import com.android.build.api.variant.DynamicFeatureAndroidComponentsExtension;
import com.android.build.api.variant.DynamicFeatureVariant;
import com.android.build.api.variant.DynamicFeatureVariantBuilder;
import com.android.build.api.variant.impl.DynamicFeatureVariantBuilderImpl;
import com.android.build.api.variant.impl.DynamicFeatureVariantImpl;
import com.android.build.gradle.BaseExtension;
import com.android.build.gradle.api.BaseVariantOutput;
import com.android.build.gradle.internal.ExtraModelInfo;
import com.android.build.gradle.internal.dsl.BuildType;
import com.android.build.gradle.internal.dsl.DefaultConfig;
import com.android.build.gradle.internal.dsl.DynamicFeatureExtension;
import com.android.build.gradle.internal.dsl.DynamicFeatureExtensionImpl;
import com.android.build.gradle.internal.dsl.ProductFlavor;
import com.android.build.gradle.internal.dsl.SdkComponentsImpl;
import com.android.build.gradle.internal.dsl.SigningConfig;
import com.android.build.gradle.internal.services.DslServices;
import com.android.build.gradle.internal.services.ProjectServices;
import com.android.build.gradle.internal.services.VersionedSdkLoaderService;
import com.android.build.gradle.internal.tasks.DynamicFeatureTaskManager;
import com.android.build.gradle.internal.tasks.factory.BootClasspathConfig;
import com.android.build.gradle.internal.tasks.factory.BootClasspathConfigImpl;
import com.android.build.gradle.internal.tasks.factory.GlobalTaskCreationConfig;
import com.android.build.gradle.internal.tasks.factory.TaskManagerConfig;
import com.android.build.gradle.internal.variant.ComponentInfo;
import com.android.build.gradle.internal.variant.DynamicFeatureVariantFactory;
import com.android.build.gradle.options.BooleanOption;
import com.android.builder.model.v2.ide.ProjectType;
import com.google.wireless.android.sdk.stats.GradleBuildProject;
import java.util.List;
import javax.inject.Inject;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.Project;
import org.gradle.api.component.SoftwareComponentFactory;
import org.gradle.api.reflect.TypeOf;
import org.gradle.build.event.BuildEventsListenerRegistry;
import org.gradle.tooling.provider.model.ToolingModelBuilderRegistry;
import org.jetbrains.annotations.NotNull;

/** Gradle plugin class for 'application' projects, applied on an optional APK module */
public class DynamicFeaturePlugin
        extends AbstractAppPlugin<
                com.android.build.api.dsl.DynamicFeatureExtension,
                DynamicFeatureAndroidComponentsExtension,
                DynamicFeatureVariantBuilderImpl,
                DynamicFeatureVariantImpl> {
    @Inject
    public DynamicFeaturePlugin(
            ToolingModelBuilderRegistry registry,
            SoftwareComponentFactory componentFactory,
            BuildEventsListenerRegistry listenerRegistry) {
        super(registry, componentFactory, listenerRegistry);
    }

    @Override
    protected int getProjectType() {
        return AndroidProjectTypes.PROJECT_TYPE_DYNAMIC_FEATURE;
    }

    @Override
    protected ProjectType getProjectTypeV2() {
        return ProjectType.DYNAMIC_FEATURE;
    }

    @NonNull
    @Override
    protected GradleBuildProject.PluginType getAnalyticsPluginType() {
        return GradleBuildProject.PluginType.DYNAMIC_FEATURE;
    }

    @Override
    protected void pluginSpecificApply(@NonNull Project project) {
        // do nothing
    }

    @NonNull
    @Override
    protected ExtensionData<com.android.build.api.dsl.DynamicFeatureExtension> createExtension(
            @NonNull DslServices dslServices,
            @NonNull
                    DslContainerProvider<DefaultConfig, BuildType, ProductFlavor, SigningConfig>
                            dslContainers,
            @NonNull NamedDomainObjectContainer<BaseVariantOutput> buildOutputs,
            @NonNull ExtraModelInfo extraModelInfo,
            VersionedSdkLoaderService versionedSdkLoaderService) {
        DynamicFeatureExtensionImpl dynamicFeatureExtension =
                dslServices.newDecoratedInstance(
                        DynamicFeatureExtensionImpl.class, dslServices, dslContainers);

        // detects whether we are running the plugin under unit test mode
        boolean forUnitTesting = project.hasProperty("_agp_internal_test_mode_");

        BootClasspathConfigImpl bootClasspathConfig =
                new BootClasspathConfigImpl(
                        project,
                        dslServices,
                        versionedSdkLoaderService,
                        dynamicFeatureExtension,
                        forUnitTesting);

        if (projectServices.getProjectOptions().get(BooleanOption.USE_NEW_DSL_INTERFACES)) {
            //noinspection unchecked,rawtypes I am so sorry.
            Class<com.android.build.api.dsl.DynamicFeatureExtension> instanceType =
                    (Class) DynamicFeatureExtension.class;
            DynamicFeatureExtension android =
                    (DynamicFeatureExtension)
                            project.getExtensions()
                                    .create(
                                            new TypeOf<
                                                    com.android.build.api.dsl
                                                            .DynamicFeatureExtension>() {},
                                            "android",
                                            instanceType,
                                            dslServices,
                                            bootClasspathConfig,
                                            buildOutputs,
                                            dslContainers.getSourceSetManager(),
                                            extraModelInfo,
                                            dynamicFeatureExtension);
            project.getExtensions()
                    .add(
                            DynamicFeatureExtension.class,
                            "_internal_legacy_android_extension",
                            android);
            return new ExtensionData<>(android, dynamicFeatureExtension, bootClasspathConfig);
        }

        return new ExtensionData<>(
                project.getExtensions()
                        .create(
                                "android",
                                DynamicFeatureExtension.class,
                                dslServices,
                                bootClasspathConfig,
                                buildOutputs,
                                dslContainers.getSourceSetManager(),
                                extraModelInfo,
                                dynamicFeatureExtension),
                dynamicFeatureExtension,
                bootClasspathConfig);
    }

    /**
     * Create typed sub implementation for the extension objects. This has several benefits : 1. do
     * not pollute the user visible definitions with deprecated types. 2. because it's written in
     * Java, it will still compile once the deprecated extension are moved to Level.HIDDEN.
     */
    @SuppressWarnings("deprecation")
    public abstract static class DynamicFeatureAndroidComponentsExtensionImplCompat
            extends DynamicFeatureAndroidComponentsExtensionImpl
            implements AndroidComponentsExtension<
                            com.android.build.api.dsl.DynamicFeatureExtension,
                            DynamicFeatureVariantBuilder,
                            DynamicFeatureVariant>,
                    DynamicFeatureAndroidComponentsExtension {

        public DynamicFeatureAndroidComponentsExtensionImplCompat(
                @NotNull DslServices dslServices,
                @NotNull SdkComponents sdkComponents,
                @NotNull
                        VariantApiOperationsRegistrar<
                                        com.android.build.api.dsl.DynamicFeatureExtension,
                                        DynamicFeatureVariantBuilder,
                                        DynamicFeatureVariant>
                                variantApiOperations,
                @NotNull DynamicFeatureExtension DynamicFeatureExtension) {
            super(dslServices, sdkComponents, variantApiOperations, DynamicFeatureExtension);
        }
    }

    @NonNull
    @Override
    protected DynamicFeatureAndroidComponentsExtension createComponentExtension(
            @NonNull DslServices dslServices,
            @NonNull
                    VariantApiOperationsRegistrar<
                                    com.android.build.api.dsl.DynamicFeatureExtension,
                                    DynamicFeatureVariantBuilderImpl,
                                    DynamicFeatureVariantImpl>
                            variantApiOperationsRegistrar,
            @NonNull BootClasspathConfig bootClasspathConfig) {
        SdkComponents sdkComponents =
                dslServices.newInstance(
                        SdkComponentsImpl.class,
                        dslServices,
                        project.provider(getExtension()::getCompileSdkVersion),
                        project.provider(getExtension()::getBuildToolsRevision),
                        project.provider(getExtension()::getNdkVersion),
                        project.provider(getExtension()::getNdkPath),
                        // need to keep this fully wrapped in a provider so that we don't initialize
                        // any of the lazy objects too early as they would read the
                        // compileSdkVersion
                        // too early.
                        project.provider(bootClasspathConfig::getBootClasspath));

        // register under the new interface for kotlin, groovy will find both the old and new
        // interfaces through the implementation class.
        DynamicFeatureAndroidComponentsExtension extension =
                project.getExtensions()
                        .create(
                                DynamicFeatureAndroidComponentsExtension.class,
                                "androidComponents",
                                DynamicFeatureAndroidComponentsExtensionImplCompat.class,
                                dslServices,
                                sdkComponents,
                                variantApiOperationsRegistrar,
                                getExtension());

        return extension;
    }

    @NonNull
    @Override
    protected DynamicFeatureTaskManager createTaskManager(
            @NonNull Project project,
            @NonNull
                    List<ComponentInfo<DynamicFeatureVariantBuilderImpl, DynamicFeatureVariantImpl>>
                            variants,
            @NonNull List<TestComponentImpl> testComponents,
            @NonNull List<TestFixturesImpl> testFixturesComponents,
            @NonNull GlobalTaskCreationConfig globalTaskCreationConfig,
            @NonNull TaskManagerConfig localConfig,
            @NonNull BaseExtension extension) {
        return new DynamicFeatureTaskManager(
                project,
                variants,
                testComponents,
                testFixturesComponents,
                globalTaskCreationConfig,
                localConfig,
                extension);
    }

    @NonNull
    @Override
    protected DynamicFeatureVariantFactory createVariantFactory(
            @NonNull ProjectServices projectServices) {
        return new DynamicFeatureVariantFactory(projectServices);
    }
}
