// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface GradleBuildSplitsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.GradleBuildSplits)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Are density splits enabled?
   * </pre>
   *
   * <code>optional bool density_enabled = 1;</code>
   * @return Whether the densityEnabled field is set.
   */
  boolean hasDensityEnabled();
  /**
   * <pre>
   * Are density splits enabled?
   * </pre>
   *
   * <code>optional bool density_enabled = 1;</code>
   * @return The densityEnabled.
   */
  boolean getDensityEnabled();

  /**
   * <pre>
   * Is automatic discovery based on the merged resources enabled?
   * Only set if density splits are enabled.
   * Deprecated as of AS3.3 (b/111291762)
   * </pre>
   *
   * <code>optional bool density_auto = 2 [deprecated = true];</code>
   * @deprecated android_studio.GradleBuildSplits.density_auto is deprecated.
   *     See studio_stats.proto;l=4749
   * @return Whether the densityAuto field is set.
   */
  @java.lang.Deprecated boolean hasDensityAuto();
  /**
   * <pre>
   * Is automatic discovery based on the merged resources enabled?
   * Only set if density splits are enabled.
   * Deprecated as of AS3.3 (b/111291762)
   * </pre>
   *
   * <code>optional bool density_auto = 2 [deprecated = true];</code>
   * @deprecated android_studio.GradleBuildSplits.density_auto is deprecated.
   *     See studio_stats.proto;l=4749
   * @return The densityAuto.
   */
  @java.lang.Deprecated boolean getDensityAuto();

  /**
   * <pre>
   * Injected compatible screens manifest values.
   * Only populated if language splits are enabled.
   * e.g. NORMAL, LARGE, XLARGE
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildSplits.CompatibleScreenSize density_compatible_screens = 3;</code>
   * @return A list containing the densityCompatibleScreens.
   */
  java.util.List<com.google.wireless.android.sdk.stats.GradleBuildSplits.CompatibleScreenSize> getDensityCompatibleScreensList();
  /**
   * <pre>
   * Injected compatible screens manifest values.
   * Only populated if language splits are enabled.
   * e.g. NORMAL, LARGE, XLARGE
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildSplits.CompatibleScreenSize density_compatible_screens = 3;</code>
   * @return The count of densityCompatibleScreens.
   */
  int getDensityCompatibleScreensCount();
  /**
   * <pre>
   * Injected compatible screens manifest values.
   * Only populated if language splits are enabled.
   * e.g. NORMAL, LARGE, XLARGE
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildSplits.CompatibleScreenSize density_compatible_screens = 3;</code>
   * @param index The index of the element to return.
   * @return The densityCompatibleScreens at the given index.
   */
  com.google.wireless.android.sdk.stats.GradleBuildSplits.CompatibleScreenSize getDensityCompatibleScreens(int index);

  /**
   * <pre>
   * Densities that the application will be split on.
   * Only populated if density splits are enabled.
   * e.g. 480, 560, 640
   * See
   * https://android.googlesource.com/platform/tools/base/+/studio-master-dev/layoutlib-api/src/main/java/com/android/resources/Density.java
   * for a comprehensive list of possible values.
   * </pre>
   *
   * <code>repeated int32 density_values = 4;</code>
   * @return A list containing the densityValues.
   */
  java.util.List<java.lang.Integer> getDensityValuesList();
  /**
   * <pre>
   * Densities that the application will be split on.
   * Only populated if density splits are enabled.
   * e.g. 480, 560, 640
   * See
   * https://android.googlesource.com/platform/tools/base/+/studio-master-dev/layoutlib-api/src/main/java/com/android/resources/Density.java
   * for a comprehensive list of possible values.
   * </pre>
   *
   * <code>repeated int32 density_values = 4;</code>
   * @return The count of densityValues.
   */
  int getDensityValuesCount();
  /**
   * <pre>
   * Densities that the application will be split on.
   * Only populated if density splits are enabled.
   * e.g. 480, 560, 640
   * See
   * https://android.googlesource.com/platform/tools/base/+/studio-master-dev/layoutlib-api/src/main/java/com/android/resources/Density.java
   * for a comprehensive list of possible values.
   * </pre>
   *
   * <code>repeated int32 density_values = 4;</code>
   * @param index The index of the element to return.
   * @return The densityValues at the given index.
   */
  int getDensityValues(int index);

  /**
   * <pre>
   * Are language splits enabled?
   * </pre>
   *
   * <code>optional bool language_enabled = 5;</code>
   * @return Whether the languageEnabled field is set.
   */
  boolean hasLanguageEnabled();
  /**
   * <pre>
   * Are language splits enabled?
   * </pre>
   *
   * <code>optional bool language_enabled = 5;</code>
   * @return The languageEnabled.
   */
  boolean getLanguageEnabled();

  /**
   * <pre>
   * Is automatic discovery based on the merged resources enabled?
   * Only set if language splits are enabled.
   * Deprecated as of AS3.3 (b/111291762)
   * </pre>
   *
   * <code>optional bool language_auto = 6 [deprecated = true];</code>
   * @deprecated android_studio.GradleBuildSplits.language_auto is deprecated.
   *     See studio_stats.proto;l=4767
   * @return Whether the languageAuto field is set.
   */
  @java.lang.Deprecated boolean hasLanguageAuto();
  /**
   * <pre>
   * Is automatic discovery based on the merged resources enabled?
   * Only set if language splits are enabled.
   * Deprecated as of AS3.3 (b/111291762)
   * </pre>
   *
   * <code>optional bool language_auto = 6 [deprecated = true];</code>
   * @deprecated android_studio.GradleBuildSplits.language_auto is deprecated.
   *     See studio_stats.proto;l=4767
   * @return The languageAuto.
   */
  @java.lang.Deprecated boolean getLanguageAuto();

  /**
   * <pre>
   * Language and region codes that the application will be split on.
   * Only populated if language splits are enabled.
   * e.g. 'fr,fr-rBE', 'fr-rCA', 'en'
   * </pre>
   *
   * <code>repeated string language_includes = 7;</code>
   * @return A list containing the languageIncludes.
   */
  java.util.List<java.lang.String>
      getLanguageIncludesList();
  /**
   * <pre>
   * Language and region codes that the application will be split on.
   * Only populated if language splits are enabled.
   * e.g. 'fr,fr-rBE', 'fr-rCA', 'en'
   * </pre>
   *
   * <code>repeated string language_includes = 7;</code>
   * @return The count of languageIncludes.
   */
  int getLanguageIncludesCount();
  /**
   * <pre>
   * Language and region codes that the application will be split on.
   * Only populated if language splits are enabled.
   * e.g. 'fr,fr-rBE', 'fr-rCA', 'en'
   * </pre>
   *
   * <code>repeated string language_includes = 7;</code>
   * @param index The index of the element to return.
   * @return The languageIncludes at the given index.
   */
  java.lang.String getLanguageIncludes(int index);
  /**
   * <pre>
   * Language and region codes that the application will be split on.
   * Only populated if language splits are enabled.
   * e.g. 'fr,fr-rBE', 'fr-rCA', 'en'
   * </pre>
   *
   * <code>repeated string language_includes = 7;</code>
   * @param index The index of the value to return.
   * @return The bytes of the languageIncludes at the given index.
   */
  com.google.protobuf.ByteString
      getLanguageIncludesBytes(int index);

  /**
   * <pre>
   * Are ABI splits enabled?
   * </pre>
   *
   * <code>optional bool abi_enabled = 8;</code>
   * @return Whether the abiEnabled field is set.
   */
  boolean hasAbiEnabled();
  /**
   * <pre>
   * Are ABI splits enabled?
   * </pre>
   *
   * <code>optional bool abi_enabled = 8;</code>
   * @return The abiEnabled.
   */
  boolean getAbiEnabled();

  /**
   * <pre>
   * Will a universal APK be generated?
   * Only set if abi splits are enabled.
   * </pre>
   *
   * <code>optional bool abi_enable_universal_apk = 9;</code>
   * @return Whether the abiEnableUniversalApk field is set.
   */
  boolean hasAbiEnableUniversalApk();
  /**
   * <pre>
   * Will a universal APK be generated?
   * Only set if abi splits are enabled.
   * </pre>
   *
   * <code>optional bool abi_enable_universal_apk = 9;</code>
   * @return The abiEnableUniversalApk.
   */
  boolean getAbiEnableUniversalApk();

  /**
   * <pre>
   * ABIs that the application will be split on.
   * Only populated if abi splits are enabled.
   * e.g. 'x86', 'armeabi-v7a'
   * </pre>
   *
   * <code>repeated .android_studio.DeviceInfo.ApplicationBinaryInterface abi_filters = 10;</code>
   * @return A list containing the abiFilters.
   */
  java.util.List<com.google.wireless.android.sdk.stats.DeviceInfo.ApplicationBinaryInterface> getAbiFiltersList();
  /**
   * <pre>
   * ABIs that the application will be split on.
   * Only populated if abi splits are enabled.
   * e.g. 'x86', 'armeabi-v7a'
   * </pre>
   *
   * <code>repeated .android_studio.DeviceInfo.ApplicationBinaryInterface abi_filters = 10;</code>
   * @return The count of abiFilters.
   */
  int getAbiFiltersCount();
  /**
   * <pre>
   * ABIs that the application will be split on.
   * Only populated if abi splits are enabled.
   * e.g. 'x86', 'armeabi-v7a'
   * </pre>
   *
   * <code>repeated .android_studio.DeviceInfo.ApplicationBinaryInterface abi_filters = 10;</code>
   * @param index The index of the element to return.
   * @return The abiFilters at the given index.
   */
  com.google.wireless.android.sdk.stats.DeviceInfo.ApplicationBinaryInterface getAbiFilters(int index);
}
