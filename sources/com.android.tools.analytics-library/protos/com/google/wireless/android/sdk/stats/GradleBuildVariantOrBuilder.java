// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface GradleBuildVariantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.GradleBuildVariant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Identifier, local to this AndroidStudioEvent, for the variant.
   * Can be used to correlate spans (GradleBuildProfileSpan) with this
   * project for this build only. Is created by sequentially
   * numbering variants as they are created.
   * Is not stable across build invocations.
   * </pre>
   *
   * <code>optional int64 id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Identifier, local to this AndroidStudioEvent, for the variant.
   * Can be used to correlate spans (GradleBuildProfileSpan) with this
   * project for this build only. Is created by sequentially
   * numbering variants as they are created.
   * Is not stable across build invocations.
   * </pre>
   *
   * <code>optional int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Whether the variant is debuggable.
   * </pre>
   *
   * <code>optional bool is_debug = 2;</code>
   * @return Whether the isDebug field is set.
   */
  boolean hasIsDebug();
  /**
   * <pre>
   * Whether the variant is debuggable.
   * </pre>
   *
   * <code>optional bool is_debug = 2;</code>
   * @return The isDebug.
   */
  boolean getIsDebug();

  /**
   * <pre>
   * Whether the variant is compiled using jack
   * </pre>
   *
   * <code>optional bool use_jack = 3;</code>
   * @return Whether the useJack field is set.
   */
  boolean hasUseJack();
  /**
   * <pre>
   * Whether the variant is compiled using jack
   * </pre>
   *
   * <code>optional bool use_jack = 3;</code>
   * @return The useJack.
   */
  boolean getUseJack();

  /**
   * <pre>
   * Whether the variant is minified
   * </pre>
   *
   * <code>optional bool minify_enabled = 4;</code>
   * @return Whether the minifyEnabled field is set.
   */
  boolean hasMinifyEnabled();
  /**
   * <pre>
   * Whether the variant is minified
   * </pre>
   *
   * <code>optional bool minify_enabled = 4;</code>
   * @return The minifyEnabled.
   */
  boolean getMinifyEnabled();

  /**
   * <pre>
   * Is multidex enabled for the variant
   * </pre>
   *
   * <code>optional bool use_multidex = 5;</code>
   * @return Whether the useMultidex field is set.
   */
  boolean hasUseMultidex();
  /**
   * <pre>
   * Is multidex enabled for the variant
   * </pre>
   *
   * <code>optional bool use_multidex = 5;</code>
   * @return The useMultidex.
   */
  boolean getUseMultidex();

  /**
   * <pre>
   * Is legacy (pre-api 19) multidex enabled for the variant.
   * Only can true if use_multidex is also true.
   * </pre>
   *
   * <code>optional bool use_legacy_multidex = 6;</code>
   * @return Whether the useLegacyMultidex field is set.
   */
  boolean hasUseLegacyMultidex();
  /**
   * <pre>
   * Is legacy (pre-api 19) multidex enabled for the variant.
   * Only can true if use_multidex is also true.
   * </pre>
   *
   * <code>optional bool use_legacy_multidex = 6;</code>
   * @return The useLegacyMultidex.
   */
  boolean getUseLegacyMultidex();

  /**
   * <pre>
   * The type of variant.
   * </pre>
   *
   * <code>optional .android_studio.GradleBuildVariant.VariantType variant_type = 7;</code>
   * @return Whether the variantType field is set.
   */
  boolean hasVariantType();
  /**
   * <pre>
   * The type of variant.
   * </pre>
   *
   * <code>optional .android_studio.GradleBuildVariant.VariantType variant_type = 7;</code>
   * @return The variantType.
   */
  com.google.wireless.android.sdk.stats.GradleBuildVariant.VariantType getVariantType();

  /**
   * <pre>
   * For test variants, the tested variant id. (See GradleBuildVariant.id)
   * </pre>
   *
   * <code>optional int64 tested_id = 8;</code>
   * @return Whether the testedId field is set.
   */
  boolean hasTestedId();
  /**
   * <pre>
   * For test variants, the tested variant id. (See GradleBuildVariant.id)
   * </pre>
   *
   * <code>optional int64 tested_id = 8;</code>
   * @return The testedId.
   */
  long getTestedId();

  /**
   * <pre>
   * List of proguard flags used in this build variant.
   * NOTE this is a string as the proguard flags can be changed
   * based on which release of proguard is being used and is outside of our
   * control. See https://www.guardsquare.com/en/proguard/manual/usage
   * for current list. This property only will contain the "-&lt;flag&gt;" without
   * the arguments passed to that flag.
   * </pre>
   *
   * <code>repeated string proguard_flags = 9;</code>
   * @return A list containing the proguardFlags.
   */
  java.util.List<java.lang.String>
      getProguardFlagsList();
  /**
   * <pre>
   * List of proguard flags used in this build variant.
   * NOTE this is a string as the proguard flags can be changed
   * based on which release of proguard is being used and is outside of our
   * control. See https://www.guardsquare.com/en/proguard/manual/usage
   * for current list. This property only will contain the "-&lt;flag&gt;" without
   * the arguments passed to that flag.
   * </pre>
   *
   * <code>repeated string proguard_flags = 9;</code>
   * @return The count of proguardFlags.
   */
  int getProguardFlagsCount();
  /**
   * <pre>
   * List of proguard flags used in this build variant.
   * NOTE this is a string as the proguard flags can be changed
   * based on which release of proguard is being used and is outside of our
   * control. See https://www.guardsquare.com/en/proguard/manual/usage
   * for current list. This property only will contain the "-&lt;flag&gt;" without
   * the arguments passed to that flag.
   * </pre>
   *
   * <code>repeated string proguard_flags = 9;</code>
   * @param index The index of the element to return.
   * @return The proguardFlags at the given index.
   */
  java.lang.String getProguardFlags(int index);
  /**
   * <pre>
   * List of proguard flags used in this build variant.
   * NOTE this is a string as the proguard flags can be changed
   * based on which release of proguard is being used and is outside of our
   * control. See https://www.guardsquare.com/en/proguard/manual/usage
   * for current list. This property only will contain the "-&lt;flag&gt;" without
   * the arguments passed to that flag.
   * </pre>
   *
   * <code>repeated string proguard_flags = 9;</code>
   * @param index The index of the value to return.
   * @return The bytes of the proguardFlags at the given index.
   */
  com.google.protobuf.ByteString
      getProguardFlagsBytes(int index);

  /**
   * <pre>
   * Java annotation processors used in this build variant.
   * Uses the Gradle compact format:  package:module:version
   * </pre>
   *
   * <code>repeated .android_studio.AnnotationProcessorInfo annotation_processors = 10;</code>
   */
  java.util.List<com.google.wireless.android.sdk.stats.AnnotationProcessorInfo> 
      getAnnotationProcessorsList();
  /**
   * <pre>
   * Java annotation processors used in this build variant.
   * Uses the Gradle compact format:  package:module:version
   * </pre>
   *
   * <code>repeated .android_studio.AnnotationProcessorInfo annotation_processors = 10;</code>
   */
  com.google.wireless.android.sdk.stats.AnnotationProcessorInfo getAnnotationProcessors(int index);
  /**
   * <pre>
   * Java annotation processors used in this build variant.
   * Uses the Gradle compact format:  package:module:version
   * </pre>
   *
   * <code>repeated .android_studio.AnnotationProcessorInfo annotation_processors = 10;</code>
   */
  int getAnnotationProcessorsCount();
  /**
   * <pre>
   * Java annotation processors used in this build variant.
   * Uses the Gradle compact format:  package:module:version
   * </pre>
   *
   * <code>repeated .android_studio.AnnotationProcessorInfo annotation_processors = 10;</code>
   */
  java.util.List<? extends com.google.wireless.android.sdk.stats.AnnotationProcessorInfoOrBuilder> 
      getAnnotationProcessorsOrBuilderList();
  /**
   * <pre>
   * Java annotation processors used in this build variant.
   * Uses the Gradle compact format:  package:module:version
   * </pre>
   *
   * <code>repeated .android_studio.AnnotationProcessorInfo annotation_processors = 10;</code>
   */
  com.google.wireless.android.sdk.stats.AnnotationProcessorInfoOrBuilder getAnnotationProcessorsOrBuilder(
      int index);

  /**
   * <pre>
   * If Java 8 language support is enabled, which tools provides it.
   * </pre>
   *
   * <code>optional .android_studio.GradleBuildVariant.Java8LangSupport java8_lang_support = 11;</code>
   * @return Whether the java8LangSupport field is set.
   */
  boolean hasJava8LangSupport();
  /**
   * <pre>
   * If Java 8 language support is enabled, which tools provides it.
   * </pre>
   *
   * <code>optional .android_studio.GradleBuildVariant.Java8LangSupport java8_lang_support = 11;</code>
   * @return The java8LangSupport.
   */
  com.google.wireless.android.sdk.stats.GradleBuildVariant.Java8LangSupport getJava8LangSupport();

  /**
   * <pre>
   * The various device api versions of this variant.
   * Minimum supported.
   * </pre>
   *
   * <code>optional .android_studio.ApiVersion min_sdk_version = 12 [lazy = true];</code>
   * @return Whether the minSdkVersion field is set.
   */
  boolean hasMinSdkVersion();
  /**
   * <pre>
   * The various device api versions of this variant.
   * Minimum supported.
   * </pre>
   *
   * <code>optional .android_studio.ApiVersion min_sdk_version = 12 [lazy = true];</code>
   * @return The minSdkVersion.
   */
  com.google.wireless.android.sdk.stats.ApiVersion getMinSdkVersion();
  /**
   * <pre>
   * The various device api versions of this variant.
   * Minimum supported.
   * </pre>
   *
   * <code>optional .android_studio.ApiVersion min_sdk_version = 12 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.ApiVersionOrBuilder getMinSdkVersionOrBuilder();

  /**
   * <pre>
   * Target sdk version.
   * </pre>
   *
   * <code>optional .android_studio.ApiVersion target_sdk_version = 13 [lazy = true];</code>
   * @return Whether the targetSdkVersion field is set.
   */
  boolean hasTargetSdkVersion();
  /**
   * <pre>
   * Target sdk version.
   * </pre>
   *
   * <code>optional .android_studio.ApiVersion target_sdk_version = 13 [lazy = true];</code>
   * @return The targetSdkVersion.
   */
  com.google.wireless.android.sdk.stats.ApiVersion getTargetSdkVersion();
  /**
   * <pre>
   * Target sdk version.
   * </pre>
   *
   * <code>optional .android_studio.ApiVersion target_sdk_version = 13 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.ApiVersionOrBuilder getTargetSdkVersionOrBuilder();

  /**
   * <pre>
   * The maximum sdk version
   * </pre>
   *
   * <code>optional .android_studio.ApiVersion max_sdk_version = 14 [lazy = true];</code>
   * @return Whether the maxSdkVersion field is set.
   */
  boolean hasMaxSdkVersion();
  /**
   * <pre>
   * The maximum sdk version
   * </pre>
   *
   * <code>optional .android_studio.ApiVersion max_sdk_version = 14 [lazy = true];</code>
   * @return The maxSdkVersion.
   */
  com.google.wireless.android.sdk.stats.ApiVersion getMaxSdkVersion();
  /**
   * <pre>
   * The maximum sdk version
   * </pre>
   *
   * <code>optional .android_studio.ApiVersion max_sdk_version = 14 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.ApiVersionOrBuilder getMaxSdkVersionOrBuilder();

  /**
   * <code>optional .android_studio.GradleBuildVariant.DexBuilderTool dex_builder = 15;</code>
   * @return Whether the dexBuilder field is set.
   */
  boolean hasDexBuilder();
  /**
   * <code>optional .android_studio.GradleBuildVariant.DexBuilderTool dex_builder = 15;</code>
   * @return The dexBuilder.
   */
  com.google.wireless.android.sdk.stats.GradleBuildVariant.DexBuilderTool getDexBuilder();

  /**
   * <code>optional .android_studio.GradleBuildVariant.DexMergerTool dex_merger = 16;</code>
   * @return Whether the dexMerger field is set.
   */
  boolean hasDexMerger();
  /**
   * <code>optional .android_studio.GradleBuildVariant.DexMergerTool dex_merger = 16;</code>
   * @return The dexMerger.
   */
  com.google.wireless.android.sdk.stats.GradleBuildVariant.DexMergerTool getDexMerger();

  /**
   * <code>optional .android_studio.GradleBuildVariant.CodeShrinkerTool code_shrinker = 17;</code>
   * @return Whether the codeShrinker field is set.
   */
  boolean hasCodeShrinker();
  /**
   * <code>optional .android_studio.GradleBuildVariant.CodeShrinkerTool code_shrinker = 17;</code>
   * @return The codeShrinker.
   */
  com.google.wireless.android.sdk.stats.GradleBuildVariant.CodeShrinkerTool getCodeShrinker();

  /**
   * <pre>
   * The method used to run instrumentation tests for this variant.
   * </pre>
   *
   * <code>optional .android_studio.TestRun.TestExecution test_execution = 18;</code>
   * @return Whether the testExecution field is set.
   */
  boolean hasTestExecution();
  /**
   * <pre>
   * The method used to run instrumentation tests for this variant.
   * </pre>
   *
   * <code>optional .android_studio.TestRun.TestExecution test_execution = 18;</code>
   * @return The testExecution.
   */
  com.google.wireless.android.sdk.stats.TestRun.TestExecution getTestExecution();

  /**
   * <pre>
   * The underlying native project system.
   * </pre>
   *
   * <code>optional .android_studio.GradleNativeAndroidModule.NativeBuildSystemType native_build_system_type = 19;</code>
   * @return Whether the nativeBuildSystemType field is set.
   */
  boolean hasNativeBuildSystemType();
  /**
   * <pre>
   * The underlying native project system.
   * </pre>
   *
   * <code>optional .android_studio.GradleNativeAndroidModule.NativeBuildSystemType native_build_system_type = 19;</code>
   * @return The nativeBuildSystemType.
   */
  com.google.wireless.android.sdk.stats.GradleNativeAndroidModule.NativeBuildSystemType getNativeBuildSystemType();

  /**
   * <pre>
   * The CMake version number if this is a CMake-based build.
   * </pre>
   *
   * <code>optional string native_cmake_version = 20;</code>
   * @return Whether the nativeCmakeVersion field is set.
   */
  boolean hasNativeCmakeVersion();
  /**
   * <pre>
   * The CMake version number if this is a CMake-based build.
   * </pre>
   *
   * <code>optional string native_cmake_version = 20;</code>
   * @return The nativeCmakeVersion.
   */
  java.lang.String getNativeCmakeVersion();
  /**
   * <pre>
   * The CMake version number if this is a CMake-based build.
   * </pre>
   *
   * <code>optional string native_cmake_version = 20;</code>
   * @return The bytes for nativeCmakeVersion.
   */
  com.google.protobuf.ByteString
      getNativeCmakeVersionBytes();

  /**
   * <pre>
   * Per-ABI native build info.
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildVariant.NativeBuildConfigInfo native_build_config = 21;</code>
   */
  java.util.List<com.google.wireless.android.sdk.stats.GradleBuildVariant.NativeBuildConfigInfo> 
      getNativeBuildConfigList();
  /**
   * <pre>
   * Per-ABI native build info.
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildVariant.NativeBuildConfigInfo native_build_config = 21;</code>
   */
  com.google.wireless.android.sdk.stats.GradleBuildVariant.NativeBuildConfigInfo getNativeBuildConfig(int index);
  /**
   * <pre>
   * Per-ABI native build info.
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildVariant.NativeBuildConfigInfo native_build_config = 21;</code>
   */
  int getNativeBuildConfigCount();
  /**
   * <pre>
   * Per-ABI native build info.
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildVariant.NativeBuildConfigInfo native_build_config = 21;</code>
   */
  java.util.List<? extends com.google.wireless.android.sdk.stats.GradleBuildVariant.NativeBuildConfigInfoOrBuilder> 
      getNativeBuildConfigOrBuilderList();
  /**
   * <pre>
   * Per-ABI native build info.
   * </pre>
   *
   * <code>repeated .android_studio.GradleBuildVariant.NativeBuildConfigInfo native_build_config = 21;</code>
   */
  com.google.wireless.android.sdk.stats.GradleBuildVariant.NativeBuildConfigInfoOrBuilder getNativeBuildConfigOrBuilder(
      int index);

  /**
   * <pre>
   * Whether annotation processing could be run incrementally
   * </pre>
   *
   * <code>optional bool is_annotation_processing_incremental = 22;</code>
   * @return Whether the isAnnotationProcessingIncremental field is set.
   */
  boolean hasIsAnnotationProcessingIncremental();
  /**
   * <pre>
   * Whether annotation processing could be run incrementally
   * </pre>
   *
   * <code>optional bool is_annotation_processing_incremental = 22;</code>
   * @return The isAnnotationProcessingIncremental.
   */
  boolean getIsAnnotationProcessingIncremental();

  /**
   * <pre>
   * Whether this variant (a base module or dynamic feature) is marked as
   * instant enabled in its manifest (Google Play Instant / Instant Apps)
   * </pre>
   *
   * <code>optional bool is_instant_enabled = 23;</code>
   * @return Whether the isInstantEnabled field is set.
   */
  boolean hasIsInstantEnabled();
  /**
   * <pre>
   * Whether this variant (a base module or dynamic feature) is marked as
   * instant enabled in its manifest (Google Play Instant / Instant Apps)
   * </pre>
   *
   * <code>optional bool is_instant_enabled = 23;</code>
   * @return The isInstantEnabled.
   */
  boolean getIsInstantEnabled();

  /**
   * <pre>
   * Whether coreLibraryDesugaring is enabled for the variant
   * </pre>
   *
   * <code>optional bool core_library_desugaring_enabled = 24;</code>
   * @return Whether the coreLibraryDesugaringEnabled field is set.
   */
  boolean hasCoreLibraryDesugaringEnabled();
  /**
   * <pre>
   * Whether coreLibraryDesugaring is enabled for the variant
   * </pre>
   *
   * <code>optional bool core_library_desugaring_enabled = 24;</code>
   * @return The coreLibraryDesugaringEnabled.
   */
  boolean getCoreLibraryDesugaringEnabled();

  /**
   * <pre>
   * container for variant api accesses if the variant api was used.
   * </pre>
   *
   * <code>optional .android_studio.VariantApiUsage variant_api_access = 25 [lazy = true];</code>
   * @return Whether the variantApiAccess field is set.
   */
  boolean hasVariantApiAccess();
  /**
   * <pre>
   * container for variant api accesses if the variant api was used.
   * </pre>
   *
   * <code>optional .android_studio.VariantApiUsage variant_api_access = 25 [lazy = true];</code>
   * @return The variantApiAccess.
   */
  com.google.wireless.android.sdk.stats.VariantApiUsage getVariantApiAccess();
  /**
   * <pre>
   * container for variant api accesses if the variant api was used.
   * </pre>
   *
   * <code>optional .android_studio.VariantApiUsage variant_api_access = 25 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.VariantApiUsageOrBuilder getVariantApiAccessOrBuilder();

  /**
   * <pre>
   * Kotlin-specific options in build files
   * </pre>
   *
   * <code>optional .android_studio.GradleBuildVariant.KotlinOptions kotlin_options = 26 [lazy = true];</code>
   * @return Whether the kotlinOptions field is set.
   */
  boolean hasKotlinOptions();
  /**
   * <pre>
   * Kotlin-specific options in build files
   * </pre>
   *
   * <code>optional .android_studio.GradleBuildVariant.KotlinOptions kotlin_options = 26 [lazy = true];</code>
   * @return The kotlinOptions.
   */
  com.google.wireless.android.sdk.stats.GradleBuildVariant.KotlinOptions getKotlinOptions();
  /**
   * <pre>
   * Kotlin-specific options in build files
   * </pre>
   *
   * <code>optional .android_studio.GradleBuildVariant.KotlinOptions kotlin_options = 26 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.GradleBuildVariant.KotlinOptionsOrBuilder getKotlinOptionsOrBuilder();

  /**
   * <pre>
   * List of registered classes transforms
   * </pre>
   *
   * <code>repeated .android_studio.AsmClassesTransformRegistration asm_classes_transforms = 27;</code>
   */
  java.util.List<com.google.wireless.android.sdk.stats.AsmClassesTransformRegistration> 
      getAsmClassesTransformsList();
  /**
   * <pre>
   * List of registered classes transforms
   * </pre>
   *
   * <code>repeated .android_studio.AsmClassesTransformRegistration asm_classes_transforms = 27;</code>
   */
  com.google.wireless.android.sdk.stats.AsmClassesTransformRegistration getAsmClassesTransforms(int index);
  /**
   * <pre>
   * List of registered classes transforms
   * </pre>
   *
   * <code>repeated .android_studio.AsmClassesTransformRegistration asm_classes_transforms = 27;</code>
   */
  int getAsmClassesTransformsCount();
  /**
   * <pre>
   * List of registered classes transforms
   * </pre>
   *
   * <code>repeated .android_studio.AsmClassesTransformRegistration asm_classes_transforms = 27;</code>
   */
  java.util.List<? extends com.google.wireless.android.sdk.stats.AsmClassesTransformRegistrationOrBuilder> 
      getAsmClassesTransformsOrBuilderList();
  /**
   * <pre>
   * List of registered classes transforms
   * </pre>
   *
   * <code>repeated .android_studio.AsmClassesTransformRegistration asm_classes_transforms = 27;</code>
   */
  com.google.wireless.android.sdk.stats.AsmClassesTransformRegistrationOrBuilder getAsmClassesTransformsOrBuilder(
      int index);

  /**
   * <pre>
   * List of updates to the frames computation mode
   * </pre>
   *
   * <code>repeated .android_studio.AsmFramesComputationModeUpdate frames_computation_mode_updates = 28;</code>
   */
  java.util.List<com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate> 
      getFramesComputationModeUpdatesList();
  /**
   * <pre>
   * List of updates to the frames computation mode
   * </pre>
   *
   * <code>repeated .android_studio.AsmFramesComputationModeUpdate frames_computation_mode_updates = 28;</code>
   */
  com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate getFramesComputationModeUpdates(int index);
  /**
   * <pre>
   * List of updates to the frames computation mode
   * </pre>
   *
   * <code>repeated .android_studio.AsmFramesComputationModeUpdate frames_computation_mode_updates = 28;</code>
   */
  int getFramesComputationModeUpdatesCount();
  /**
   * <pre>
   * List of updates to the frames computation mode
   * </pre>
   *
   * <code>repeated .android_studio.AsmFramesComputationModeUpdate frames_computation_mode_updates = 28;</code>
   */
  java.util.List<? extends com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdateOrBuilder> 
      getFramesComputationModeUpdatesOrBuilderList();
  /**
   * <pre>
   * List of updates to the frames computation mode
   * </pre>
   *
   * <code>repeated .android_studio.AsmFramesComputationModeUpdate frames_computation_mode_updates = 28;</code>
   */
  com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdateOrBuilder getFramesComputationModeUpdatesOrBuilder(
      int index);

  /**
   * <pre>
   * Native diagnostic codes logged while processing this variant. For a list
   * of possible values, see
   * /tools/base/common/src/main/java/com/android/utils/cxx/CxxDiagnosticCode.kt
   * </pre>
   *
   * <code>repeated int32 cxx_diagnostic_codes = 29 [packed = true];</code>
   * @return A list containing the cxxDiagnosticCodes.
   */
  java.util.List<java.lang.Integer> getCxxDiagnosticCodesList();
  /**
   * <pre>
   * Native diagnostic codes logged while processing this variant. For a list
   * of possible values, see
   * /tools/base/common/src/main/java/com/android/utils/cxx/CxxDiagnosticCode.kt
   * </pre>
   *
   * <code>repeated int32 cxx_diagnostic_codes = 29 [packed = true];</code>
   * @return The count of cxxDiagnosticCodes.
   */
  int getCxxDiagnosticCodesCount();
  /**
   * <pre>
   * Native diagnostic codes logged while processing this variant. For a list
   * of possible values, see
   * /tools/base/common/src/main/java/com/android/utils/cxx/CxxDiagnosticCode.kt
   * </pre>
   *
   * <code>repeated int32 cxx_diagnostic_codes = 29 [packed = true];</code>
   * @param index The index of the element to return.
   * @return The cxxDiagnosticCodes at the given index.
   */
  int getCxxDiagnosticCodes(int index);

  /**
   * <pre>
   * whether this variant has unit tests enabled
   * </pre>
   *
   * <code>optional bool has_unit_test = 30;</code>
   * @return Whether the hasUnitTest field is set.
   */
  boolean hasHasUnitTest();
  /**
   * <pre>
   * whether this variant has unit tests enabled
   * </pre>
   *
   * <code>optional bool has_unit_test = 30;</code>
   * @return The hasUnitTest.
   */
  boolean getHasUnitTest();

  /**
   * <pre>
   * whether this variant has android tests enabled
   * </pre>
   *
   * <code>optional bool has_android_test = 31;</code>
   * @return Whether the hasAndroidTest field is set.
   */
  boolean hasHasAndroidTest();
  /**
   * <pre>
   * whether this variant has android tests enabled
   * </pre>
   *
   * <code>optional bool has_android_test = 31;</code>
   * @return The hasAndroidTest.
   */
  boolean getHasAndroidTest();

  /**
   * <pre>
   * whether this variant has test fixtures enabled
   * </pre>
   *
   * <code>optional bool has_test_fixtures = 32;</code>
   * @return Whether the hasTestFixtures field is set.
   */
  boolean hasHasTestFixtures();
  /**
   * <pre>
   * whether this variant has test fixtures enabled
   * </pre>
   *
   * <code>optional bool has_test_fixtures = 32;</code>
   * @return The hasTestFixtures.
   */
  boolean getHasTestFixtures();

  /**
   * <pre>
   * information about the privacy sandbox SDKs this project consumes
   * </pre>
   *
   * <code>optional .android_studio.GradleBuildVariant.PrivacySandboxDependenciesInfo privacy_sandbox_dependencies_info = 33 [lazy = true];</code>
   * @return Whether the privacySandboxDependenciesInfo field is set.
   */
  boolean hasPrivacySandboxDependenciesInfo();
  /**
   * <pre>
   * information about the privacy sandbox SDKs this project consumes
   * </pre>
   *
   * <code>optional .android_studio.GradleBuildVariant.PrivacySandboxDependenciesInfo privacy_sandbox_dependencies_info = 33 [lazy = true];</code>
   * @return The privacySandboxDependenciesInfo.
   */
  com.google.wireless.android.sdk.stats.GradleBuildVariant.PrivacySandboxDependenciesInfo getPrivacySandboxDependenciesInfo();
  /**
   * <pre>
   * information about the privacy sandbox SDKs this project consumes
   * </pre>
   *
   * <code>optional .android_studio.GradleBuildVariant.PrivacySandboxDependenciesInfo privacy_sandbox_dependencies_info = 33 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.GradleBuildVariant.PrivacySandboxDependenciesInfoOrBuilder getPrivacySandboxDependenciesInfoOrBuilder();
}
