// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface GradleBuildProjectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.GradleBuildProject)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Identifier, local to the containing AndroidStudioEvent, for the project.
   * Can be used to correlate spans (GradleBuildProfileSpan) with this
   * project for this build only. Is created by sequentially
   * numbering projects as they are encountered.
   * Is not stable across build invocations.
   * </pre>
   *
   * <code>optional int64 id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Identifier, local to the containing AndroidStudioEvent, for the project.
   * Can be used to correlate spans (GradleBuildProfileSpan) with this
   * project for this build only. Is created by sequentially
   * numbering projects as they are encountered.
   * Is not stable across build invocations.
   * </pre>
   *
   * <code>optional int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Version of our Android Gradle plugin supporting android builds.
   * e.g. '2.0-beta1'
   * For the experimental plugin this is the gradle-core version.
   * </pre>
   *
   * <code>optional string android_plugin_version = 2;</code>
   * @return Whether the androidPluginVersion field is set.
   */
  boolean hasAndroidPluginVersion();
  /**
   * <pre>
   * Version of our Android Gradle plugin supporting android builds.
   * e.g. '2.0-beta1'
   * For the experimental plugin this is the gradle-core version.
   * </pre>
   *
   * <code>optional string android_plugin_version = 2;</code>
   * @return The androidPluginVersion.
   */
  java.lang.String getAndroidPluginVersion();
  /**
   * <pre>
   * Version of our Android Gradle plugin supporting android builds.
   * e.g. '2.0-beta1'
   * For the experimental plugin this is the gradle-core version.
   * </pre>
   *
   * <code>optional string android_plugin_version = 2;</code>
   * @return The bytes for androidPluginVersion.
   */
  com.google.protobuf.ByteString
      getAndroidPluginVersionBytes();

  /**
   * <pre>
   * Which Android Gradle plugin is used.
   * </pre>
   *
   * <code>optional .android_studio.GradleBuildProject.PluginType android_plugin = 3;</code>
   * @return Whether the androidPlugin field is set.
   */
  boolean hasAndroidPlugin();
  /**
   * <pre>
   * Which Android Gradle plugin is used.
   * </pre>
   *
   * <code>optional .android_studio.GradleBuildProject.PluginType android_plugin = 3;</code>
   * @return The androidPlugin.
   */
  com.google.wireless.android.sdk.stats.GradleBuildProject.PluginType getAndroidPlugin();

  /**
   * <pre>
   * Which plugin generation is used.
   * </pre>
   *
   * <code>optional .android_studio.GradleBuildProject.PluginGeneration plugin_generation = 4;</code>
   * @return Whether the pluginGeneration field is set.
   */
  boolean hasPluginGeneration();
  /**
   * <pre>
   * Which plugin generation is used.
   * </pre>
   *
   * <code>optional .android_studio.GradleBuildProject.PluginGeneration plugin_generation = 4;</code>
   * @return The pluginGeneration.
   */
  com.google.wireless.android.sdk.stats.GradleBuildProject.PluginGeneration getPluginGeneration();

  /**
   * <pre>
   * The build tools version used, e.g. '24.0.0 rc2'
   * </pre>
   *
   * <code>optional string build_tools_version = 5;</code>
   * @return Whether the buildToolsVersion field is set.
   */
  boolean hasBuildToolsVersion();
  /**
   * <pre>
   * The build tools version used, e.g. '24.0.0 rc2'
   * </pre>
   *
   * <code>optional string build_tools_version = 5;</code>
   * @return The buildToolsVersion.
   */
  java.lang.String getBuildToolsVersion();
  /**
   * <pre>
   * The build tools version used, e.g. '24.0.0 rc2'
   * </pre>
   *
   * <code>optional string build_tools_version = 5;</code>
   * @return The bytes for buildToolsVersion.
   */
  com.google.protobuf.ByteString
      getBuildToolsVersionBytes();

  /**
   * <pre>
   * Statistics about the project build.
   * Will be used to characterize and bucket projects for subgroup analysis.
   * </pre>
   *
   * <code>optional .android_studio.GradleBuildProjectMetrics metrics = 6;</code>
   * @return Whether the metrics field is set.
   */
  boolean hasMetrics();
  /**
   * <pre>
   * Statistics about the project build.
   * Will be used to characterize and bucket projects for subgroup analysis.
   * </pre>
   *
   * <code>optional .android_studio.GradleBuildProjectMetrics metrics = 6;</code>
   * @return The metrics.
   */
  com.google.wireless.android.sdk.stats.GradleBuildProjectMetrics getMetrics();
  /**
   * <pre>
   * Statistics about the project build.
   * Will be used to characterize and bucket projects for subgroup analysis.
   * </pre>
   *
   * <code>optional .android_studio.GradleBuildProjectMetrics metrics = 6;</code>
   */
  com.google.wireless.android.sdk.stats.GradleBuildProjectMetricsOrBuilder getMetricsOrBuilder();

  /**
   * <pre>
   * The variants in this project
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildVariant variant = 7;</code>
   */
  java.util.List<com.google.wireless.android.sdk.stats.GradleBuildVariant> 
      getVariantList();
  /**
   * <pre>
   * The variants in this project
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildVariant variant = 7;</code>
   */
  com.google.wireless.android.sdk.stats.GradleBuildVariant getVariant(int index);
  /**
   * <pre>
   * The variants in this project
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildVariant variant = 7;</code>
   */
  int getVariantCount();
  /**
   * <pre>
   * The variants in this project
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildVariant variant = 7;</code>
   */
  java.util.List<? extends com.google.wireless.android.sdk.stats.GradleBuildVariantOrBuilder> 
      getVariantOrBuilderList();
  /**
   * <pre>
   * The variants in this project
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildVariant variant = 7;</code>
   */
  com.google.wireless.android.sdk.stats.GradleBuildVariantOrBuilder getVariantOrBuilder(
      int index);

  /**
   * <pre>
   * For instantApps, the number of dependent atoms.
   * </pre>
   *
   * <code>optional int64 atoms = 8;</code>
   * @return Whether the atoms field is set.
   */
  boolean hasAtoms();
  /**
   * <pre>
   * For instantApps, the number of dependent atoms.
   * </pre>
   *
   * <code>optional int64 atoms = 8;</code>
   * @return The atoms.
   */
  long getAtoms();

  /**
   * <pre>
   * The compile SDK.
   * Stored in the form of a target hash
   * e.g. "android-25" or "The Vendor Inc.:My Addon:10"
   * </pre>
   *
   * <code>optional string compile_sdk = 9;</code>
   * @return Whether the compileSdk field is set.
   */
  boolean hasCompileSdk();
  /**
   * <pre>
   * The compile SDK.
   * Stored in the form of a target hash
   * e.g. "android-25" or "The Vendor Inc.:My Addon:10"
   * </pre>
   *
   * <code>optional string compile_sdk = 9;</code>
   * @return The compileSdk.
   */
  java.lang.String getCompileSdk();
  /**
   * <pre>
   * The compile SDK.
   * Stored in the form of a target hash
   * e.g. "android-25" or "The Vendor Inc.:My Addon:10"
   * </pre>
   *
   * <code>optional string compile_sdk = 9;</code>
   * @return The bytes for compileSdk.
   */
  com.google.protobuf.ByteString
      getCompileSdkBytes();

  /**
   * <pre>
   * The split config as defined by the user in the DSL.
   * </pre>
   *
   * <code>optional .android_studio.GradleBuildSplits splits = 10;</code>
   * @return Whether the splits field is set.
   */
  boolean hasSplits();
  /**
   * <pre>
   * The split config as defined by the user in the DSL.
   * </pre>
   *
   * <code>optional .android_studio.GradleBuildSplits splits = 10;</code>
   * @return The splits.
   */
  com.google.wireless.android.sdk.stats.GradleBuildSplits getSplits();
  /**
   * <pre>
   * The split config as defined by the user in the DSL.
   * </pre>
   *
   * <code>optional .android_studio.GradleBuildSplits splits = 10;</code>
   */
  com.google.wireless.android.sdk.stats.GradleBuildSplitsOrBuilder getSplitsOrBuilder();

  /**
   * <pre>
   * Version of the Kotlin Gradle plugin used, if any.
   * e.g. '1.1.3'
   * </pre>
   *
   * <code>optional string kotlin_plugin_version = 11;</code>
   * @return Whether the kotlinPluginVersion field is set.
   */
  boolean hasKotlinPluginVersion();
  /**
   * <pre>
   * Version of the Kotlin Gradle plugin used, if any.
   * e.g. '1.1.3'
   * </pre>
   *
   * <code>optional string kotlin_plugin_version = 11;</code>
   * @return The kotlinPluginVersion.
   */
  java.lang.String getKotlinPluginVersion();
  /**
   * <pre>
   * Version of the Kotlin Gradle plugin used, if any.
   * e.g. '1.1.3'
   * </pre>
   *
   * <code>optional string kotlin_plugin_version = 11;</code>
   * @return The bytes for kotlinPluginVersion.
   */
  com.google.protobuf.ByteString
      getKotlinPluginVersionBytes();

  /**
   * <pre>
   * The project options as set by the user or by studio.
   * </pre>
   *
   * <code>optional .android_studio.GradleProjectOptionsSettings options = 12;</code>
   * @return Whether the options field is set.
   */
  boolean hasOptions();
  /**
   * <pre>
   * The project options as set by the user or by studio.
   * </pre>
   *
   * <code>optional .android_studio.GradleProjectOptionsSettings options = 12;</code>
   * @return The options.
   */
  com.google.wireless.android.sdk.stats.GradleProjectOptionsSettings getOptions();
  /**
   * <pre>
   * The project options as set by the user or by studio.
   * </pre>
   *
   * <code>optional .android_studio.GradleProjectOptionsSettings options = 12;</code>
   */
  com.google.wireless.android.sdk.stats.GradleProjectOptionsSettingsOrBuilder getOptionsOrBuilder();

  /**
   * <pre>
   * All of the gradle plugins applied to this project
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildProject.GradlePlugin plugin = 13;</code>
   * @return A list containing the plugin.
   */
  java.util.List<com.google.wireless.android.sdk.stats.GradleBuildProject.GradlePlugin> getPluginList();
  /**
   * <pre>
   * All of the gradle plugins applied to this project
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildProject.GradlePlugin plugin = 13;</code>
   * @return The count of plugin.
   */
  int getPluginCount();
  /**
   * <pre>
   * All of the gradle plugins applied to this project
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildProject.GradlePlugin plugin = 13;</code>
   * @param index The index of the element to return.
   * @return The plugin at the given index.
   */
  com.google.wireless.android.sdk.stats.GradleBuildProject.GradlePlugin getPlugin(int index);

  /**
   * <pre>
   * The version of the firebase performance plugin applied to the project
   * e.g. '1.3.0'
   * </pre>
   *
   * <code>optional string firebase_performance_plugin_version = 14;</code>
   * @return Whether the firebasePerformancePluginVersion field is set.
   */
  boolean hasFirebasePerformancePluginVersion();
  /**
   * <pre>
   * The version of the firebase performance plugin applied to the project
   * e.g. '1.3.0'
   * </pre>
   *
   * <code>optional string firebase_performance_plugin_version = 14;</code>
   * @return The firebasePerformancePluginVersion.
   */
  java.lang.String getFirebasePerformancePluginVersion();
  /**
   * <pre>
   * The version of the firebase performance plugin applied to the project
   * e.g. '1.3.0'
   * </pre>
   *
   * <code>optional string firebase_performance_plugin_version = 14;</code>
   * @return The bytes for firebasePerformancePluginVersion.
   */
  com.google.protobuf.ByteString
      getFirebasePerformancePluginVersionBytes();

  /**
   * <pre>
   * If enableCompose is set to true
   * </pre>
   *
   * <code>optional bool compose_enabled = 15;</code>
   * @return Whether the composeEnabled field is set.
   */
  boolean hasComposeEnabled();
  /**
   * <pre>
   * If enableCompose is set to true
   * </pre>
   *
   * <code>optional bool compose_enabled = 15;</code>
   * @return The composeEnabled.
   */
  boolean getComposeEnabled();

  /**
   * <pre>
   * All of the gradle plugin names applied to this project,
   * these are class names of the plugins, not free form names
   * deprecated, use applied_plugins instead
   * </pre>
   *
   * <code>repeated string plugin_names = 16 [deprecated = true];</code>
   * @deprecated
   * @return A list containing the pluginNames.
   */
  @java.lang.Deprecated java.util.List<java.lang.String>
      getPluginNamesList();
  /**
   * <pre>
   * All of the gradle plugin names applied to this project,
   * these are class names of the plugins, not free form names
   * deprecated, use applied_plugins instead
   * </pre>
   *
   * <code>repeated string plugin_names = 16 [deprecated = true];</code>
   * @deprecated
   * @return The count of pluginNames.
   */
  @java.lang.Deprecated int getPluginNamesCount();
  /**
   * <pre>
   * All of the gradle plugin names applied to this project,
   * these are class names of the plugins, not free form names
   * deprecated, use applied_plugins instead
   * </pre>
   *
   * <code>repeated string plugin_names = 16 [deprecated = true];</code>
   * @deprecated
   * @param index The index of the element to return.
   * @return The pluginNames at the given index.
   */
  @java.lang.Deprecated java.lang.String getPluginNames(int index);
  /**
   * <pre>
   * All of the gradle plugin names applied to this project,
   * these are class names of the plugins, not free form names
   * deprecated, use applied_plugins instead
   * </pre>
   *
   * <code>repeated string plugin_names = 16 [deprecated = true];</code>
   * @deprecated
   * @param index The index of the value to return.
   * @return The bytes of the pluginNames at the given index.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getPluginNamesBytes(int index);

  /**
   * <pre>
   * Record all of the task class names applied to the project
   * e.g an example is ORG_GRADLE_API_TASKS_WRAPPER_WRAPPER_DECORATED
   * </pre>
   *
   * <code>repeated string task_names = 17;</code>
   * @return A list containing the taskNames.
   */
  java.util.List<java.lang.String>
      getTaskNamesList();
  /**
   * <pre>
   * Record all of the task class names applied to the project
   * e.g an example is ORG_GRADLE_API_TASKS_WRAPPER_WRAPPER_DECORATED
   * </pre>
   *
   * <code>repeated string task_names = 17;</code>
   * @return The count of taskNames.
   */
  int getTaskNamesCount();
  /**
   * <pre>
   * Record all of the task class names applied to the project
   * e.g an example is ORG_GRADLE_API_TASKS_WRAPPER_WRAPPER_DECORATED
   * </pre>
   *
   * <code>repeated string task_names = 17;</code>
   * @param index The index of the element to return.
   * @return The taskNames at the given index.
   */
  java.lang.String getTaskNames(int index);
  /**
   * <pre>
   * Record all of the task class names applied to the project
   * e.g an example is ORG_GRADLE_API_TASKS_WRAPPER_WRAPPER_DECORATED
   * </pre>
   *
   * <code>repeated string task_names = 17;</code>
   * @param index The index of the value to return.
   * @return The bytes of the taskNames at the given index.
   */
  com.google.protobuf.ByteString
      getTaskNamesBytes(int index);

  /**
   * <pre>
   * Records use of APIs used at the sub-project level
   * </pre>
   *
   * <code>optional .android_studio.ProjectApiUse project_api_use = 18;</code>
   * @return Whether the projectApiUse field is set.
   */
  boolean hasProjectApiUse();
  /**
   * <pre>
   * Records use of APIs used at the sub-project level
   * </pre>
   *
   * <code>optional .android_studio.ProjectApiUse project_api_use = 18;</code>
   * @return The projectApiUse.
   */
  com.google.wireless.android.sdk.stats.ProjectApiUse getProjectApiUse();
  /**
   * <pre>
   * Records use of APIs used at the sub-project level
   * </pre>
   *
   * <code>optional .android_studio.ProjectApiUse project_api_use = 18;</code>
   */
  com.google.wireless.android.sdk.stats.ProjectApiUseOrBuilder getProjectApiUseOrBuilder();

  /**
   * <pre>
   * All the gradle plugins applied to this project.
   * </pre>
   *
   * <code>repeated .android_studio.GradlePluginData applied_plugins = 19;</code>
   */
  java.util.List<com.google.wireless.android.sdk.stats.GradlePluginData> 
      getAppliedPluginsList();
  /**
   * <pre>
   * All the gradle plugins applied to this project.
   * </pre>
   *
   * <code>repeated .android_studio.GradlePluginData applied_plugins = 19;</code>
   */
  com.google.wireless.android.sdk.stats.GradlePluginData getAppliedPlugins(int index);
  /**
   * <pre>
   * All the gradle plugins applied to this project.
   * </pre>
   *
   * <code>repeated .android_studio.GradlePluginData applied_plugins = 19;</code>
   */
  int getAppliedPluginsCount();
  /**
   * <pre>
   * All the gradle plugins applied to this project.
   * </pre>
   *
   * <code>repeated .android_studio.GradlePluginData applied_plugins = 19;</code>
   */
  java.util.List<? extends com.google.wireless.android.sdk.stats.GradlePluginDataOrBuilder> 
      getAppliedPluginsOrBuilderList();
  /**
   * <pre>
   * All the gradle plugins applied to this project.
   * </pre>
   *
   * <code>repeated .android_studio.GradlePluginData applied_plugins = 19;</code>
   */
  com.google.wireless.android.sdk.stats.GradlePluginDataOrBuilder getAppliedPluginsOrBuilder(
      int index);

  /**
   * <pre>
   * Java compilation options
   * </pre>
   *
   * <code>optional .android_studio.GradleBuildProject.CompileOptions compile_options = 20;</code>
   * @return Whether the compileOptions field is set.
   */
  boolean hasCompileOptions();
  /**
   * <pre>
   * Java compilation options
   * </pre>
   *
   * <code>optional .android_studio.GradleBuildProject.CompileOptions compile_options = 20;</code>
   * @return The compileOptions.
   */
  com.google.wireless.android.sdk.stats.GradleBuildProject.CompileOptions getCompileOptions();
  /**
   * <pre>
   * Java compilation options
   * </pre>
   *
   * <code>optional .android_studio.GradleBuildProject.CompileOptions compile_options = 20;</code>
   */
  com.google.wireless.android.sdk.stats.GradleBuildProject.CompileOptionsOrBuilder getCompileOptionsOrBuilder();
}
