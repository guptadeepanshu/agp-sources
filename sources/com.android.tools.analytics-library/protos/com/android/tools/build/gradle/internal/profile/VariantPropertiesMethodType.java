// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: analytics_enums.proto

package com.android.tools.build.gradle.internal.profile;

/**
 * Protobuf enum {@code VariantPropertiesMethodType}
 */
public enum VariantPropertiesMethodType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN_PROPERTIES_METHOD_TYPE = 0;</code>
   */
  UNKNOWN_PROPERTIES_METHOD_TYPE(0),
  /**
   * <code>ARTIFACTS = 1;</code>
   */
  ARTIFACTS(1),
  /**
   * <code>ASM_TRANSFORM_CLASSES = 2;</code>
   */
  ASM_TRANSFORM_CLASSES(2),
  /**
   * <code>ASM_FRAMES_COMPUTATION_NODE = 3;</code>
   */
  ASM_FRAMES_COMPUTATION_NODE(3),
  /**
   * <code>BUILD_TYPE = 4;</code>
   */
  BUILD_TYPE(4),
  /**
   * <code>PRODUCT_FLAVORS = 5;</code>
   */
  PRODUCT_FLAVORS(5),
  /**
   * <code>FLAVOR_NAME = 6;</code>
   */
  FLAVOR_NAME(6),
  /**
   * <code>READ_ONLY_APPLICATION_ID = 7;</code>
   */
  READ_ONLY_APPLICATION_ID(7),
  /**
   * <code>PACKAGE_NAME = 8 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  PACKAGE_NAME(8),
  /**
   * <code>BUILD_CONFIG_FIELDS = 9;</code>
   */
  BUILD_CONFIG_FIELDS(9),
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>ADD_BUILD_CONFIG_FIELD = 10;</code>
   */
  ADD_BUILD_CONFIG_FIELD(10),
  /**
   * <code>RES_VALUE = 11;</code>
   */
  RES_VALUE(11),
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>ADD_RES_VALUE = 12;</code>
   */
  ADD_RES_VALUE(12),
  /**
   * <code>MANIFEST_PLACEHOLDERS = 13;</code>
   */
  MANIFEST_PLACEHOLDERS(13),
  /**
   * <code>APPLICATION_ID = 14;</code>
   */
  APPLICATION_ID(14),
  /**
   * <code>AAPT_OPTIONS = 15;</code>
   */
  AAPT_OPTIONS(15),
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>AAPT_OPTIONS_ACTION = 16;</code>
   */
  AAPT_OPTIONS_ACTION(16),
  /**
   * <code>TESTED_APPLICATION_ID = 17;</code>
   */
  TESTED_APPLICATION_ID(17),
  /**
   * <code>INSTRUMENTATION_RUNNER = 18;</code>
   */
  INSTRUMENTATION_RUNNER(18),
  /**
   * <code>HANDLE_PROFILING = 19;</code>
   */
  HANDLE_PROFILING(19),
  /**
   * <code>FUNCTIONAL_TEST = 20;</code>
   */
  FUNCTIONAL_TEST(20),
  /**
   * <code>TEST_LABEL = 21;</code>
   */
  TEST_LABEL(21),
  /**
   * <code>GET_OUTPUTS = 22;</code>
   */
  GET_OUTPUTS(22),
  /**
   * <code>DEPENDENCIES_INFO = 23;</code>
   */
  DEPENDENCIES_INFO(23),
  /**
   * <code>SIGNING_CONFIG = 24;</code>
   */
  SIGNING_CONFIG(24),
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>SIGNING_CONFIG_ACTION = 25;</code>
   */
  SIGNING_CONFIG_ACTION(25),
  /**
   * <code>TESTED_VARIANT = 26;</code>
   */
  TESTED_VARIANT(26),
  /**
   * <code>PACKAGING_OPTIONS = 27;</code>
   */
  PACKAGING_OPTIONS(27),
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>PACKAGING_OPTIONS_ACTION = 28;</code>
   */
  PACKAGING_OPTIONS_ACTION(28),
  /**
   * <code>GET_BUILT_ARTIFACTS_LOADER = 29;</code>
   */
  GET_BUILT_ARTIFACTS_LOADER(29),
  /**
   * <code>GET_ARTIFACT = 30;</code>
   */
  GET_ARTIFACT(30),
  /**
   * <code>GET_ALL_ARTIFACTS = 31;</code>
   */
  GET_ALL_ARTIFACTS(31),
  /**
   * <code>USE_TASK = 32;</code>
   */
  USE_TASK(32),
  /**
   * <code>WIRED_WITH = 33;</code>
   */
  WIRED_WITH(33),
  /**
   * <code>WIRED_WITH_FILES = 34;</code>
   */
  WIRED_WITH_FILES(34),
  /**
   * <code>WIRED_WITH_LIST = 35;</code>
   */
  WIRED_WITH_LIST(35),
  /**
   * <code>WIRED_WITH_DIRECTORIES = 36;</code>
   */
  WIRED_WITH_DIRECTORIES(36),
  /**
   * <code>TO_APPEND_TO = 37;</code>
   */
  TO_APPEND_TO(37),
  /**
   * <code>TO_CREATE = 38;</code>
   */
  TO_CREATE(38),
  /**
   * <code>TO_TRANSFORM_FILE = 39;</code>
   */
  TO_TRANSFORM_FILE(39),
  /**
   * <code>TO_TRANSFORM_COMBINE = 40;</code>
   */
  TO_TRANSFORM_COMBINE(40),
  /**
   * <code>TO_TRANSFORM_DIRECTORY = 41;</code>
   */
  TO_TRANSFORM_DIRECTORY(41),
  /**
   * <code>TO_TRANSFORM_MANY = 42;</code>
   */
  TO_TRANSFORM_MANY(42),
  /**
   * <code>SUBMIT_TO_WORKERS = 43;</code>
   */
  SUBMIT_TO_WORKERS(43),
  /**
   * <code>JNI_LIBS_PACKAGING_OPTIONS = 44;</code>
   */
  JNI_LIBS_PACKAGING_OPTIONS(44),
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>JNI_LIBS_PACKAGING_OPTIONS_ACTION = 45;</code>
   */
  JNI_LIBS_PACKAGING_OPTIONS_ACTION(45),
  /**
   * <code>RESOURCES_PACKAGING_OPTIONS = 46;</code>
   */
  RESOURCES_PACKAGING_OPTIONS(46),
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>RESOURCES_PACKAGING_OPTIONS_ACTION = 47;</code>
   */
  RESOURCES_PACKAGING_OPTIONS_ACTION(47),
  /**
   * <code>DEX_PACKAGING_OPTIONS = 48;</code>
   */
  DEX_PACKAGING_OPTIONS(48),
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>DEX_PACKAGING_OPTIONS_ACTION = 49;</code>
   */
  DEX_PACKAGING_OPTIONS_ACTION(49),
  /**
   * <code>CMAKE_NATIVE_OPTIONS = 50;</code>
   */
  CMAKE_NATIVE_OPTIONS(50),
  /**
   * <code>CMAKE_OPTIONS_ABI_FILTERS = 51;</code>
   */
  CMAKE_OPTIONS_ABI_FILTERS(51),
  /**
   * <code>CMAKE_OPTIONS_ARGUMENTS = 52;</code>
   */
  CMAKE_OPTIONS_ARGUMENTS(52),
  /**
   * <code>CMAKE_OPTIONS_C_FLAGS = 53;</code>
   */
  CMAKE_OPTIONS_C_FLAGS(53),
  /**
   * <code>CMAKE_OPTIONS_CPP_FLAGS = 54;</code>
   */
  CMAKE_OPTIONS_CPP_FLAGS(54),
  /**
   * <code>CMAKE_OPTIONS_TARGETS = 55;</code>
   */
  CMAKE_OPTIONS_TARGETS(55),
  /**
   * <code>NDK_BUILD_NATIVE_OPTIONS = 56;</code>
   */
  NDK_BUILD_NATIVE_OPTIONS(56),
  /**
   * <code>NDK_BUILD_OPTIONS_ABI_FILTERS = 57;</code>
   */
  NDK_BUILD_OPTIONS_ABI_FILTERS(57),
  /**
   * <code>NDK_BUILD_OPTIONS_ARGUMENTS = 58;</code>
   */
  NDK_BUILD_OPTIONS_ARGUMENTS(58),
  /**
   * <code>NDK_BUILD_OPTIONS_C_FLAGS = 59;</code>
   */
  NDK_BUILD_OPTIONS_C_FLAGS(59),
  /**
   * <code>NDK_BUILD_OPTIONS_CPP_FLAGS = 60;</code>
   */
  NDK_BUILD_OPTIONS_CPP_FLAGS(60),
  /**
   * <code>NDK_BUILD_OPTIONS_TARGETS = 61;</code>
   */
  NDK_BUILD_OPTIONS_TARGETS(61),
  /**
   * <code>NAMESPACE = 62;</code>
   */
  NAMESPACE(62),
  /**
   * <code>GET_EXTENSION = 63;</code>
   */
  GET_EXTENSION(63),
  /**
   * <code>DEXING = 64;</code>
   */
  DEXING(64),
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>DEXING_ACTION = 65;</code>
   */
  DEXING_ACTION(65),
  /**
   * <code>MULTI_DEX_KEEP_FILE = 66;</code>
   */
  MULTI_DEX_KEEP_FILE(66),
  /**
   * <code>MULTI_DEX_KEEP_PROGUARD = 67;</code>
   */
  MULTI_DEX_KEEP_PROGUARD(67),
  /**
   * <code>RENDERSCRIPT = 68;</code>
   */
  RENDERSCRIPT(68),
  /**
   * <code>RENDERSCRIPT_SUPPORT_MODE = 69;</code>
   */
  RENDERSCRIPT_SUPPORT_MODE(69),
  /**
   * <code>RENDERSCRIPT_SUPPORT_MODE_BLAS = 70;</code>
   */
  RENDERSCRIPT_SUPPORT_MODE_BLAS(70),
  /**
   * <code>RENDERSCRIPT_NDK_MODE = 71;</code>
   */
  RENDERSCRIPT_NDK_MODE(71),
  /**
   * <code>RENDERSCRIPT_OPTIMIZATION_LEVEL = 72;</code>
   */
  RENDERSCRIPT_OPTIMIZATION_LEVEL(72),
  /**
   * <code>ANDROID_TEST = 73;</code>
   */
  ANDROID_TEST(73),
  /**
   * <code>VARIANT_AAR_METADATA = 74;</code>
   */
  VARIANT_AAR_METADATA(74),
  /**
   * <code>VARIANT_AAR_METADATA_MIN_COMPILE_SDK = 75;</code>
   */
  VARIANT_AAR_METADATA_MIN_COMPILE_SDK(75),
  /**
   * <code>SIGNING_CONFIG_ENABLE_V1 = 76;</code>
   */
  SIGNING_CONFIG_ENABLE_V1(76),
  /**
   * <code>SIGNING_CONFIG_ENABLE_V2 = 77;</code>
   */
  SIGNING_CONFIG_ENABLE_V2(77),
  /**
   * <code>SIGNING_CONFIG_ENABLE_V3 = 78;</code>
   */
  SIGNING_CONFIG_ENABLE_V3(78),
  /**
   * <code>SIGNING_CONFIG_ENABLE_V4 = 79;</code>
   */
  SIGNING_CONFIG_ENABLE_V4(79),
  /**
   * <code>VARIANT_PSEUDOLOCALES_ENABLED = 80;</code>
   */
  VARIANT_PSEUDOLOCALES_ENABLED(80),
  /**
   * <code>PROGUARD_FILES = 81;</code>
   */
  PROGUARD_FILES(81),
  /**
   * <code>MIN_SDK_VERSION = 82;</code>
   */
  MIN_SDK_VERSION(82),
  /**
   * <code>MAX_SDK_VERSION = 83;</code>
   */
  MAX_SDK_VERSION(83),
  /**
   * <code>TARGET_SDK_VERSION = 84;</code>
   */
  TARGET_SDK_VERSION(84),
  /**
   * <code>MAKE_RES_VALUE_KEY = 85;</code>
   */
  MAKE_RES_VALUE_KEY(85),
  /**
   * <code>TEST_FIXTURES = 86;</code>
   */
  TEST_FIXTURES(86),
  /**
   * <code>VARIANT_PROPERTIES = 87;</code>
   */
  VARIANT_PROPERTIES(87),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNKNOWN_PROPERTIES_METHOD_TYPE = 0;</code>
   */
  public static final int UNKNOWN_PROPERTIES_METHOD_TYPE_VALUE = 0;
  /**
   * <code>ARTIFACTS = 1;</code>
   */
  public static final int ARTIFACTS_VALUE = 1;
  /**
   * <code>ASM_TRANSFORM_CLASSES = 2;</code>
   */
  public static final int ASM_TRANSFORM_CLASSES_VALUE = 2;
  /**
   * <code>ASM_FRAMES_COMPUTATION_NODE = 3;</code>
   */
  public static final int ASM_FRAMES_COMPUTATION_NODE_VALUE = 3;
  /**
   * <code>BUILD_TYPE = 4;</code>
   */
  public static final int BUILD_TYPE_VALUE = 4;
  /**
   * <code>PRODUCT_FLAVORS = 5;</code>
   */
  public static final int PRODUCT_FLAVORS_VALUE = 5;
  /**
   * <code>FLAVOR_NAME = 6;</code>
   */
  public static final int FLAVOR_NAME_VALUE = 6;
  /**
   * <code>READ_ONLY_APPLICATION_ID = 7;</code>
   */
  public static final int READ_ONLY_APPLICATION_ID_VALUE = 7;
  /**
   * <code>PACKAGE_NAME = 8 [deprecated = true];</code>
   */
  public static final int PACKAGE_NAME_VALUE = 8;
  /**
   * <code>BUILD_CONFIG_FIELDS = 9;</code>
   */
  public static final int BUILD_CONFIG_FIELDS_VALUE = 9;
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>ADD_BUILD_CONFIG_FIELD = 10;</code>
   */
  public static final int ADD_BUILD_CONFIG_FIELD_VALUE = 10;
  /**
   * <code>RES_VALUE = 11;</code>
   */
  public static final int RES_VALUE_VALUE = 11;
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>ADD_RES_VALUE = 12;</code>
   */
  public static final int ADD_RES_VALUE_VALUE = 12;
  /**
   * <code>MANIFEST_PLACEHOLDERS = 13;</code>
   */
  public static final int MANIFEST_PLACEHOLDERS_VALUE = 13;
  /**
   * <code>APPLICATION_ID = 14;</code>
   */
  public static final int APPLICATION_ID_VALUE = 14;
  /**
   * <code>AAPT_OPTIONS = 15;</code>
   */
  public static final int AAPT_OPTIONS_VALUE = 15;
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>AAPT_OPTIONS_ACTION = 16;</code>
   */
  public static final int AAPT_OPTIONS_ACTION_VALUE = 16;
  /**
   * <code>TESTED_APPLICATION_ID = 17;</code>
   */
  public static final int TESTED_APPLICATION_ID_VALUE = 17;
  /**
   * <code>INSTRUMENTATION_RUNNER = 18;</code>
   */
  public static final int INSTRUMENTATION_RUNNER_VALUE = 18;
  /**
   * <code>HANDLE_PROFILING = 19;</code>
   */
  public static final int HANDLE_PROFILING_VALUE = 19;
  /**
   * <code>FUNCTIONAL_TEST = 20;</code>
   */
  public static final int FUNCTIONAL_TEST_VALUE = 20;
  /**
   * <code>TEST_LABEL = 21;</code>
   */
  public static final int TEST_LABEL_VALUE = 21;
  /**
   * <code>GET_OUTPUTS = 22;</code>
   */
  public static final int GET_OUTPUTS_VALUE = 22;
  /**
   * <code>DEPENDENCIES_INFO = 23;</code>
   */
  public static final int DEPENDENCIES_INFO_VALUE = 23;
  /**
   * <code>SIGNING_CONFIG = 24;</code>
   */
  public static final int SIGNING_CONFIG_VALUE = 24;
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>SIGNING_CONFIG_ACTION = 25;</code>
   */
  public static final int SIGNING_CONFIG_ACTION_VALUE = 25;
  /**
   * <code>TESTED_VARIANT = 26;</code>
   */
  public static final int TESTED_VARIANT_VALUE = 26;
  /**
   * <code>PACKAGING_OPTIONS = 27;</code>
   */
  public static final int PACKAGING_OPTIONS_VALUE = 27;
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>PACKAGING_OPTIONS_ACTION = 28;</code>
   */
  public static final int PACKAGING_OPTIONS_ACTION_VALUE = 28;
  /**
   * <code>GET_BUILT_ARTIFACTS_LOADER = 29;</code>
   */
  public static final int GET_BUILT_ARTIFACTS_LOADER_VALUE = 29;
  /**
   * <code>GET_ARTIFACT = 30;</code>
   */
  public static final int GET_ARTIFACT_VALUE = 30;
  /**
   * <code>GET_ALL_ARTIFACTS = 31;</code>
   */
  public static final int GET_ALL_ARTIFACTS_VALUE = 31;
  /**
   * <code>USE_TASK = 32;</code>
   */
  public static final int USE_TASK_VALUE = 32;
  /**
   * <code>WIRED_WITH = 33;</code>
   */
  public static final int WIRED_WITH_VALUE = 33;
  /**
   * <code>WIRED_WITH_FILES = 34;</code>
   */
  public static final int WIRED_WITH_FILES_VALUE = 34;
  /**
   * <code>WIRED_WITH_LIST = 35;</code>
   */
  public static final int WIRED_WITH_LIST_VALUE = 35;
  /**
   * <code>WIRED_WITH_DIRECTORIES = 36;</code>
   */
  public static final int WIRED_WITH_DIRECTORIES_VALUE = 36;
  /**
   * <code>TO_APPEND_TO = 37;</code>
   */
  public static final int TO_APPEND_TO_VALUE = 37;
  /**
   * <code>TO_CREATE = 38;</code>
   */
  public static final int TO_CREATE_VALUE = 38;
  /**
   * <code>TO_TRANSFORM_FILE = 39;</code>
   */
  public static final int TO_TRANSFORM_FILE_VALUE = 39;
  /**
   * <code>TO_TRANSFORM_COMBINE = 40;</code>
   */
  public static final int TO_TRANSFORM_COMBINE_VALUE = 40;
  /**
   * <code>TO_TRANSFORM_DIRECTORY = 41;</code>
   */
  public static final int TO_TRANSFORM_DIRECTORY_VALUE = 41;
  /**
   * <code>TO_TRANSFORM_MANY = 42;</code>
   */
  public static final int TO_TRANSFORM_MANY_VALUE = 42;
  /**
   * <code>SUBMIT_TO_WORKERS = 43;</code>
   */
  public static final int SUBMIT_TO_WORKERS_VALUE = 43;
  /**
   * <code>JNI_LIBS_PACKAGING_OPTIONS = 44;</code>
   */
  public static final int JNI_LIBS_PACKAGING_OPTIONS_VALUE = 44;
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>JNI_LIBS_PACKAGING_OPTIONS_ACTION = 45;</code>
   */
  public static final int JNI_LIBS_PACKAGING_OPTIONS_ACTION_VALUE = 45;
  /**
   * <code>RESOURCES_PACKAGING_OPTIONS = 46;</code>
   */
  public static final int RESOURCES_PACKAGING_OPTIONS_VALUE = 46;
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>RESOURCES_PACKAGING_OPTIONS_ACTION = 47;</code>
   */
  public static final int RESOURCES_PACKAGING_OPTIONS_ACTION_VALUE = 47;
  /**
   * <code>DEX_PACKAGING_OPTIONS = 48;</code>
   */
  public static final int DEX_PACKAGING_OPTIONS_VALUE = 48;
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>DEX_PACKAGING_OPTIONS_ACTION = 49;</code>
   */
  public static final int DEX_PACKAGING_OPTIONS_ACTION_VALUE = 49;
  /**
   * <code>CMAKE_NATIVE_OPTIONS = 50;</code>
   */
  public static final int CMAKE_NATIVE_OPTIONS_VALUE = 50;
  /**
   * <code>CMAKE_OPTIONS_ABI_FILTERS = 51;</code>
   */
  public static final int CMAKE_OPTIONS_ABI_FILTERS_VALUE = 51;
  /**
   * <code>CMAKE_OPTIONS_ARGUMENTS = 52;</code>
   */
  public static final int CMAKE_OPTIONS_ARGUMENTS_VALUE = 52;
  /**
   * <code>CMAKE_OPTIONS_C_FLAGS = 53;</code>
   */
  public static final int CMAKE_OPTIONS_C_FLAGS_VALUE = 53;
  /**
   * <code>CMAKE_OPTIONS_CPP_FLAGS = 54;</code>
   */
  public static final int CMAKE_OPTIONS_CPP_FLAGS_VALUE = 54;
  /**
   * <code>CMAKE_OPTIONS_TARGETS = 55;</code>
   */
  public static final int CMAKE_OPTIONS_TARGETS_VALUE = 55;
  /**
   * <code>NDK_BUILD_NATIVE_OPTIONS = 56;</code>
   */
  public static final int NDK_BUILD_NATIVE_OPTIONS_VALUE = 56;
  /**
   * <code>NDK_BUILD_OPTIONS_ABI_FILTERS = 57;</code>
   */
  public static final int NDK_BUILD_OPTIONS_ABI_FILTERS_VALUE = 57;
  /**
   * <code>NDK_BUILD_OPTIONS_ARGUMENTS = 58;</code>
   */
  public static final int NDK_BUILD_OPTIONS_ARGUMENTS_VALUE = 58;
  /**
   * <code>NDK_BUILD_OPTIONS_C_FLAGS = 59;</code>
   */
  public static final int NDK_BUILD_OPTIONS_C_FLAGS_VALUE = 59;
  /**
   * <code>NDK_BUILD_OPTIONS_CPP_FLAGS = 60;</code>
   */
  public static final int NDK_BUILD_OPTIONS_CPP_FLAGS_VALUE = 60;
  /**
   * <code>NDK_BUILD_OPTIONS_TARGETS = 61;</code>
   */
  public static final int NDK_BUILD_OPTIONS_TARGETS_VALUE = 61;
  /**
   * <code>NAMESPACE = 62;</code>
   */
  public static final int NAMESPACE_VALUE = 62;
  /**
   * <code>GET_EXTENSION = 63;</code>
   */
  public static final int GET_EXTENSION_VALUE = 63;
  /**
   * <code>DEXING = 64;</code>
   */
  public static final int DEXING_VALUE = 64;
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>DEXING_ACTION = 65;</code>
   */
  public static final int DEXING_ACTION_VALUE = 65;
  /**
   * <code>MULTI_DEX_KEEP_FILE = 66;</code>
   */
  public static final int MULTI_DEX_KEEP_FILE_VALUE = 66;
  /**
   * <code>MULTI_DEX_KEEP_PROGUARD = 67;</code>
   */
  public static final int MULTI_DEX_KEEP_PROGUARD_VALUE = 67;
  /**
   * <code>RENDERSCRIPT = 68;</code>
   */
  public static final int RENDERSCRIPT_VALUE = 68;
  /**
   * <code>RENDERSCRIPT_SUPPORT_MODE = 69;</code>
   */
  public static final int RENDERSCRIPT_SUPPORT_MODE_VALUE = 69;
  /**
   * <code>RENDERSCRIPT_SUPPORT_MODE_BLAS = 70;</code>
   */
  public static final int RENDERSCRIPT_SUPPORT_MODE_BLAS_VALUE = 70;
  /**
   * <code>RENDERSCRIPT_NDK_MODE = 71;</code>
   */
  public static final int RENDERSCRIPT_NDK_MODE_VALUE = 71;
  /**
   * <code>RENDERSCRIPT_OPTIMIZATION_LEVEL = 72;</code>
   */
  public static final int RENDERSCRIPT_OPTIMIZATION_LEVEL_VALUE = 72;
  /**
   * <code>ANDROID_TEST = 73;</code>
   */
  public static final int ANDROID_TEST_VALUE = 73;
  /**
   * <code>VARIANT_AAR_METADATA = 74;</code>
   */
  public static final int VARIANT_AAR_METADATA_VALUE = 74;
  /**
   * <code>VARIANT_AAR_METADATA_MIN_COMPILE_SDK = 75;</code>
   */
  public static final int VARIANT_AAR_METADATA_MIN_COMPILE_SDK_VALUE = 75;
  /**
   * <code>SIGNING_CONFIG_ENABLE_V1 = 76;</code>
   */
  public static final int SIGNING_CONFIG_ENABLE_V1_VALUE = 76;
  /**
   * <code>SIGNING_CONFIG_ENABLE_V2 = 77;</code>
   */
  public static final int SIGNING_CONFIG_ENABLE_V2_VALUE = 77;
  /**
   * <code>SIGNING_CONFIG_ENABLE_V3 = 78;</code>
   */
  public static final int SIGNING_CONFIG_ENABLE_V3_VALUE = 78;
  /**
   * <code>SIGNING_CONFIG_ENABLE_V4 = 79;</code>
   */
  public static final int SIGNING_CONFIG_ENABLE_V4_VALUE = 79;
  /**
   * <code>VARIANT_PSEUDOLOCALES_ENABLED = 80;</code>
   */
  public static final int VARIANT_PSEUDOLOCALES_ENABLED_VALUE = 80;
  /**
   * <code>PROGUARD_FILES = 81;</code>
   */
  public static final int PROGUARD_FILES_VALUE = 81;
  /**
   * <code>MIN_SDK_VERSION = 82;</code>
   */
  public static final int MIN_SDK_VERSION_VALUE = 82;
  /**
   * <code>MAX_SDK_VERSION = 83;</code>
   */
  public static final int MAX_SDK_VERSION_VALUE = 83;
  /**
   * <code>TARGET_SDK_VERSION = 84;</code>
   */
  public static final int TARGET_SDK_VERSION_VALUE = 84;
  /**
   * <code>MAKE_RES_VALUE_KEY = 85;</code>
   */
  public static final int MAKE_RES_VALUE_KEY_VALUE = 85;
  /**
   * <code>TEST_FIXTURES = 86;</code>
   */
  public static final int TEST_FIXTURES_VALUE = 86;
  /**
   * <code>VARIANT_PROPERTIES = 87;</code>
   */
  public static final int VARIANT_PROPERTIES_VALUE = 87;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static VariantPropertiesMethodType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static VariantPropertiesMethodType forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_PROPERTIES_METHOD_TYPE;
      case 1: return ARTIFACTS;
      case 2: return ASM_TRANSFORM_CLASSES;
      case 3: return ASM_FRAMES_COMPUTATION_NODE;
      case 4: return BUILD_TYPE;
      case 5: return PRODUCT_FLAVORS;
      case 6: return FLAVOR_NAME;
      case 7: return READ_ONLY_APPLICATION_ID;
      case 8: return PACKAGE_NAME;
      case 9: return BUILD_CONFIG_FIELDS;
      case 10: return ADD_BUILD_CONFIG_FIELD;
      case 11: return RES_VALUE;
      case 12: return ADD_RES_VALUE;
      case 13: return MANIFEST_PLACEHOLDERS;
      case 14: return APPLICATION_ID;
      case 15: return AAPT_OPTIONS;
      case 16: return AAPT_OPTIONS_ACTION;
      case 17: return TESTED_APPLICATION_ID;
      case 18: return INSTRUMENTATION_RUNNER;
      case 19: return HANDLE_PROFILING;
      case 20: return FUNCTIONAL_TEST;
      case 21: return TEST_LABEL;
      case 22: return GET_OUTPUTS;
      case 23: return DEPENDENCIES_INFO;
      case 24: return SIGNING_CONFIG;
      case 25: return SIGNING_CONFIG_ACTION;
      case 26: return TESTED_VARIANT;
      case 27: return PACKAGING_OPTIONS;
      case 28: return PACKAGING_OPTIONS_ACTION;
      case 29: return GET_BUILT_ARTIFACTS_LOADER;
      case 30: return GET_ARTIFACT;
      case 31: return GET_ALL_ARTIFACTS;
      case 32: return USE_TASK;
      case 33: return WIRED_WITH;
      case 34: return WIRED_WITH_FILES;
      case 35: return WIRED_WITH_LIST;
      case 36: return WIRED_WITH_DIRECTORIES;
      case 37: return TO_APPEND_TO;
      case 38: return TO_CREATE;
      case 39: return TO_TRANSFORM_FILE;
      case 40: return TO_TRANSFORM_COMBINE;
      case 41: return TO_TRANSFORM_DIRECTORY;
      case 42: return TO_TRANSFORM_MANY;
      case 43: return SUBMIT_TO_WORKERS;
      case 44: return JNI_LIBS_PACKAGING_OPTIONS;
      case 45: return JNI_LIBS_PACKAGING_OPTIONS_ACTION;
      case 46: return RESOURCES_PACKAGING_OPTIONS;
      case 47: return RESOURCES_PACKAGING_OPTIONS_ACTION;
      case 48: return DEX_PACKAGING_OPTIONS;
      case 49: return DEX_PACKAGING_OPTIONS_ACTION;
      case 50: return CMAKE_NATIVE_OPTIONS;
      case 51: return CMAKE_OPTIONS_ABI_FILTERS;
      case 52: return CMAKE_OPTIONS_ARGUMENTS;
      case 53: return CMAKE_OPTIONS_C_FLAGS;
      case 54: return CMAKE_OPTIONS_CPP_FLAGS;
      case 55: return CMAKE_OPTIONS_TARGETS;
      case 56: return NDK_BUILD_NATIVE_OPTIONS;
      case 57: return NDK_BUILD_OPTIONS_ABI_FILTERS;
      case 58: return NDK_BUILD_OPTIONS_ARGUMENTS;
      case 59: return NDK_BUILD_OPTIONS_C_FLAGS;
      case 60: return NDK_BUILD_OPTIONS_CPP_FLAGS;
      case 61: return NDK_BUILD_OPTIONS_TARGETS;
      case 62: return NAMESPACE;
      case 63: return GET_EXTENSION;
      case 64: return DEXING;
      case 65: return DEXING_ACTION;
      case 66: return MULTI_DEX_KEEP_FILE;
      case 67: return MULTI_DEX_KEEP_PROGUARD;
      case 68: return RENDERSCRIPT;
      case 69: return RENDERSCRIPT_SUPPORT_MODE;
      case 70: return RENDERSCRIPT_SUPPORT_MODE_BLAS;
      case 71: return RENDERSCRIPT_NDK_MODE;
      case 72: return RENDERSCRIPT_OPTIMIZATION_LEVEL;
      case 73: return ANDROID_TEST;
      case 74: return VARIANT_AAR_METADATA;
      case 75: return VARIANT_AAR_METADATA_MIN_COMPILE_SDK;
      case 76: return SIGNING_CONFIG_ENABLE_V1;
      case 77: return SIGNING_CONFIG_ENABLE_V2;
      case 78: return SIGNING_CONFIG_ENABLE_V3;
      case 79: return SIGNING_CONFIG_ENABLE_V4;
      case 80: return VARIANT_PSEUDOLOCALES_ENABLED;
      case 81: return PROGUARD_FILES;
      case 82: return MIN_SDK_VERSION;
      case 83: return MAX_SDK_VERSION;
      case 84: return TARGET_SDK_VERSION;
      case 85: return MAKE_RES_VALUE_KEY;
      case 86: return TEST_FIXTURES;
      case 87: return VARIANT_PROPERTIES;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<VariantPropertiesMethodType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      VariantPropertiesMethodType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<VariantPropertiesMethodType>() {
          public VariantPropertiesMethodType findValueByNumber(int number) {
            return VariantPropertiesMethodType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.android.tools.build.gradle.internal.profile.AnalyticsEnums.getDescriptor().getEnumTypes().get(9);
  }

  private static final VariantPropertiesMethodType[] VALUES = values();

  public static VariantPropertiesMethodType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private VariantPropertiesMethodType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:VariantPropertiesMethodType)
}

