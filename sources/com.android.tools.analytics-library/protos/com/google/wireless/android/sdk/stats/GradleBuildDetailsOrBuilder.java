// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface GradleBuildDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.GradleBuildDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Version of our Gradle plugin supporting android builds. e.g. '2.0-beta1'
   * </pre>
   *
   * <code>optional string android_plugin_version = 1;</code>
   * @return Whether the androidPluginVersion field is set.
   */
  boolean hasAndroidPluginVersion();
  /**
   * <pre>
   * Version of our Gradle plugin supporting android builds. e.g. '2.0-beta1'
   * </pre>
   *
   * <code>optional string android_plugin_version = 1;</code>
   * @return The androidPluginVersion.
   */
  java.lang.String getAndroidPluginVersion();
  /**
   * <pre>
   * Version of our Gradle plugin supporting android builds. e.g. '2.0-beta1'
   * </pre>
   *
   * <code>optional string android_plugin_version = 1;</code>
   * @return The bytes for androidPluginVersion.
   */
  com.google.protobuf.ByteString
      getAndroidPluginVersionBytes();

  /**
   * <pre>
   * Version of the open source Gradle application used.
   * </pre>
   *
   * <code>optional string gradle_version = 2;</code>
   * @return Whether the gradleVersion field is set.
   */
  boolean hasGradleVersion();
  /**
   * <pre>
   * Version of the open source Gradle application used.
   * </pre>
   *
   * <code>optional string gradle_version = 2;</code>
   * @return The gradleVersion.
   */
  java.lang.String getGradleVersion();
  /**
   * <pre>
   * Version of the open source Gradle application used.
   * </pre>
   *
   * <code>optional string gradle_version = 2;</code>
   * @return The bytes for gradleVersion.
   */
  com.google.protobuf.ByteString
      getGradleVersionBytes();

  /**
   * <pre>
   * indicates whether the user has instant run enabled in settings
   * </pre>
   *
   * <code>optional bool user_enabled_ir = 3;</code>
   * @return Whether the userEnabledIr field is set.
   */
  boolean hasUserEnabledIr();
  /**
   * <pre>
   * indicates whether the user has instant run enabled in settings
   * </pre>
   *
   * <code>optional bool user_enabled_ir = 3;</code>
   * @return The userEnabledIr.
   */
  boolean getUserEnabledIr();

  /**
   * <pre>
   * indicates whether the IDE thinks whether this plugin version supports IR
   * </pre>
   *
   * <code>optional bool model_supports_ir = 4;</code>
   * @return Whether the modelSupportsIr field is set.
   */
  boolean hasModelSupportsIr();
  /**
   * <pre>
   * indicates whether the IDE thinks whether this plugin version supports IR
   * </pre>
   *
   * <code>optional bool model_supports_ir = 4;</code>
   * @return The modelSupportsIr.
   */
  boolean getModelSupportsIr();

  /**
   * <pre>
   * indicates whether the current variant supports IR, but this can be changed
   * without a notification
   * </pre>
   *
   * <code>optional bool variant_supports_ir = 5;</code>
   * @return Whether the variantSupportsIr field is set.
   */
  boolean hasVariantSupportsIr();
  /**
   * <pre>
   * indicates whether the current variant supports IR, but this can be changed
   * without a notification
   * </pre>
   *
   * <code>optional bool variant_supports_ir = 5;</code>
   * @return The variantSupportsIr.
   */
  boolean getVariantSupportsIr();

  /**
   * <pre>
   * per library metrics.
   * </pre>
   *
   * <code>repeated .android_studio.GradleLibrary libraries = 6;</code>
   */
  java.util.List<com.google.wireless.android.sdk.stats.GradleLibrary> 
      getLibrariesList();
  /**
   * <pre>
   * per library metrics.
   * </pre>
   *
   * <code>repeated .android_studio.GradleLibrary libraries = 6;</code>
   */
  com.google.wireless.android.sdk.stats.GradleLibrary getLibraries(int index);
  /**
   * <pre>
   * per library metrics.
   * </pre>
   *
   * <code>repeated .android_studio.GradleLibrary libraries = 6;</code>
   */
  int getLibrariesCount();
  /**
   * <pre>
   * per library metrics.
   * </pre>
   *
   * <code>repeated .android_studio.GradleLibrary libraries = 6;</code>
   */
  java.util.List<? extends com.google.wireless.android.sdk.stats.GradleLibraryOrBuilder> 
      getLibrariesOrBuilderList();
  /**
   * <pre>
   * per library metrics.
   * </pre>
   *
   * <code>repeated .android_studio.GradleLibrary libraries = 6;</code>
   */
  com.google.wireless.android.sdk.stats.GradleLibraryOrBuilder getLibrariesOrBuilder(
      int index);

  /**
   * <pre>
   * per module metrics.
   * </pre>
   *
   * <code>repeated .android_studio.GradleModule modules = 7;</code>
   */
  java.util.List<com.google.wireless.android.sdk.stats.GradleModule> 
      getModulesList();
  /**
   * <pre>
   * per module metrics.
   * </pre>
   *
   * <code>repeated .android_studio.GradleModule modules = 7;</code>
   */
  com.google.wireless.android.sdk.stats.GradleModule getModules(int index);
  /**
   * <pre>
   * per module metrics.
   * </pre>
   *
   * <code>repeated .android_studio.GradleModule modules = 7;</code>
   */
  int getModulesCount();
  /**
   * <pre>
   * per module metrics.
   * </pre>
   *
   * <code>repeated .android_studio.GradleModule modules = 7;</code>
   */
  java.util.List<? extends com.google.wireless.android.sdk.stats.GradleModuleOrBuilder> 
      getModulesOrBuilderList();
  /**
   * <pre>
   * per module metrics.
   * </pre>
   *
   * <code>repeated .android_studio.GradleModule modules = 7;</code>
   */
  com.google.wireless.android.sdk.stats.GradleModuleOrBuilder getModulesOrBuilder(
      int index);

  /**
   * <pre>
   * per android module metrics.
   * </pre>
   *
   * <code>repeated .android_studio.GradleAndroidModule android_modules = 8;</code>
   */
  java.util.List<com.google.wireless.android.sdk.stats.GradleAndroidModule> 
      getAndroidModulesList();
  /**
   * <pre>
   * per android module metrics.
   * </pre>
   *
   * <code>repeated .android_studio.GradleAndroidModule android_modules = 8;</code>
   */
  com.google.wireless.android.sdk.stats.GradleAndroidModule getAndroidModules(int index);
  /**
   * <pre>
   * per android module metrics.
   * </pre>
   *
   * <code>repeated .android_studio.GradleAndroidModule android_modules = 8;</code>
   */
  int getAndroidModulesCount();
  /**
   * <pre>
   * per android module metrics.
   * </pre>
   *
   * <code>repeated .android_studio.GradleAndroidModule android_modules = 8;</code>
   */
  java.util.List<? extends com.google.wireless.android.sdk.stats.GradleAndroidModuleOrBuilder> 
      getAndroidModulesOrBuilderList();
  /**
   * <pre>
   * per android module metrics.
   * </pre>
   *
   * <code>repeated .android_studio.GradleAndroidModule android_modules = 8;</code>
   */
  com.google.wireless.android.sdk.stats.GradleAndroidModuleOrBuilder getAndroidModulesOrBuilder(
      int index);

  /**
   * <pre>
   * per native android module metrics
   * </pre>
   *
   * <code>repeated .android_studio.GradleNativeAndroidModule native_android_modules = 9;</code>
   */
  java.util.List<com.google.wireless.android.sdk.stats.GradleNativeAndroidModule> 
      getNativeAndroidModulesList();
  /**
   * <pre>
   * per native android module metrics
   * </pre>
   *
   * <code>repeated .android_studio.GradleNativeAndroidModule native_android_modules = 9;</code>
   */
  com.google.wireless.android.sdk.stats.GradleNativeAndroidModule getNativeAndroidModules(int index);
  /**
   * <pre>
   * per native android module metrics
   * </pre>
   *
   * <code>repeated .android_studio.GradleNativeAndroidModule native_android_modules = 9;</code>
   */
  int getNativeAndroidModulesCount();
  /**
   * <pre>
   * per native android module metrics
   * </pre>
   *
   * <code>repeated .android_studio.GradleNativeAndroidModule native_android_modules = 9;</code>
   */
  java.util.List<? extends com.google.wireless.android.sdk.stats.GradleNativeAndroidModuleOrBuilder> 
      getNativeAndroidModulesOrBuilderList();
  /**
   * <pre>
   * per native android module metrics
   * </pre>
   *
   * <code>repeated .android_studio.GradleNativeAndroidModule native_android_modules = 9;</code>
   */
  com.google.wireless.android.sdk.stats.GradleNativeAndroidModuleOrBuilder getNativeAndroidModulesOrBuilder(
      int index);

  /**
   * <pre>
   * The app_id is the id for the user's android app
   * which we salt on the client (28 day rotation) then sha256
   * so it is anonymized and is unique per user, but has a 1-N relation.
   * </pre>
   *
   * <code>optional string app_id = 10;</code>
   * @return Whether the appId field is set.
   */
  boolean hasAppId();
  /**
   * <pre>
   * The app_id is the id for the user's android app
   * which we salt on the client (28 day rotation) then sha256
   * so it is anonymized and is unique per user, but has a 1-N relation.
   * </pre>
   *
   * <code>optional string app_id = 10;</code>
   * @return The appId.
   */
  java.lang.String getAppId();
  /**
   * <pre>
   * The app_id is the id for the user's android app
   * which we salt on the client (28 day rotation) then sha256
   * so it is anonymized and is unique per user, but has a 1-N relation.
   * </pre>
   *
   * <code>optional string app_id = 10;</code>
   * @return The bytes for appId.
   */
  com.google.protobuf.ByteString
      getAppIdBytes();
}
