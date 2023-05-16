// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: analytics_enums.proto

package com.android.tools.build.gradle.internal.profile;

/**
 * Protobuf enum {@code VariantMethodType}
 */
public enum VariantMethodType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN_METHOD_TYPE = 0;</code>
   */
  UNKNOWN_METHOD_TYPE(0),
  /**
   * <code>ENABLED = 1;</code>
   */
  ENABLED(1),
  /**
   * <code>MIN_SDK_VERSION_VALUE = 2;</code>
   */
  MIN_SDK_VERSION_VALUE(2),
  /**
   * <code>RENDERSCRIPT_TARGET_API = 3;</code>
   */
  RENDERSCRIPT_TARGET_API(3),
  /**
   * <code>MAX_SDK_VERSION_VALUE = 4;</code>
   */
  MAX_SDK_VERSION_VALUE(4),
  /**
   * <code>TARGET_SDK_VERSION_VALUE = 5;</code>
   */
  TARGET_SDK_VERSION_VALUE(5),
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>DEPENDENCIES_ACTION = 6;</code>
   */
  DEPENDENCIES_ACTION(6),
  /**
   * <code>REGISTER_EXTENSION = 7;</code>
   */
  REGISTER_EXTENSION(7),
  /**
   * <code>UNIT_TEST_ENABLED = 8;</code>
   */
  UNIT_TEST_ENABLED(8),
  /**
   * <code>ANDROID_TEST_ENABLED = 9;</code>
   */
  ANDROID_TEST_ENABLED(9),
  /**
   * <code>MIN_SDK_PREVIEW = 10;</code>
   */
  MIN_SDK_PREVIEW(10),
  /**
   * <code>TARGET_SDK_PREVIEW = 11;</code>
   */
  TARGET_SDK_PREVIEW(11),
  /**
   * <code>VARIANT_BUILDER_DEPENDENCIES_INFO = 12;</code>
   */
  VARIANT_BUILDER_DEPENDENCIES_INFO(12),
  /**
   * <code>TEST_FIXTURES_ENABLED = 13;</code>
   */
  TEST_FIXTURES_ENABLED(13),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNKNOWN_METHOD_TYPE = 0;</code>
   */
  public static final int UNKNOWN_METHOD_TYPE_VALUE = 0;
  /**
   * <code>ENABLED = 1;</code>
   */
  public static final int ENABLED_VALUE = 1;
  /**
   * <code>MIN_SDK_VERSION_VALUE = 2;</code>
   */
  public static final int MIN_SDK_VERSION_VALUE_VALUE = 2;
  /**
   * <code>RENDERSCRIPT_TARGET_API = 3;</code>
   */
  public static final int RENDERSCRIPT_TARGET_API_VALUE = 3;
  /**
   * <code>MAX_SDK_VERSION_VALUE = 4;</code>
   */
  public static final int MAX_SDK_VERSION_VALUE_VALUE = 4;
  /**
   * <code>TARGET_SDK_VERSION_VALUE = 5;</code>
   */
  public static final int TARGET_SDK_VERSION_VALUE_VALUE = 5;
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>DEPENDENCIES_ACTION = 6;</code>
   */
  public static final int DEPENDENCIES_ACTION_VALUE = 6;
  /**
   * <code>REGISTER_EXTENSION = 7;</code>
   */
  public static final int REGISTER_EXTENSION_VALUE = 7;
  /**
   * <code>UNIT_TEST_ENABLED = 8;</code>
   */
  public static final int UNIT_TEST_ENABLED_VALUE = 8;
  /**
   * <code>ANDROID_TEST_ENABLED = 9;</code>
   */
  public static final int ANDROID_TEST_ENABLED_VALUE = 9;
  /**
   * <code>MIN_SDK_PREVIEW = 10;</code>
   */
  public static final int MIN_SDK_PREVIEW_VALUE = 10;
  /**
   * <code>TARGET_SDK_PREVIEW = 11;</code>
   */
  public static final int TARGET_SDK_PREVIEW_VALUE = 11;
  /**
   * <code>VARIANT_BUILDER_DEPENDENCIES_INFO = 12;</code>
   */
  public static final int VARIANT_BUILDER_DEPENDENCIES_INFO_VALUE = 12;
  /**
   * <code>TEST_FIXTURES_ENABLED = 13;</code>
   */
  public static final int TEST_FIXTURES_ENABLED_VALUE = 13;


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
  public static VariantMethodType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static VariantMethodType forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_METHOD_TYPE;
      case 1: return ENABLED;
      case 2: return MIN_SDK_VERSION_VALUE;
      case 3: return RENDERSCRIPT_TARGET_API;
      case 4: return MAX_SDK_VERSION_VALUE;
      case 5: return TARGET_SDK_VERSION_VALUE;
      case 6: return DEPENDENCIES_ACTION;
      case 7: return REGISTER_EXTENSION;
      case 8: return UNIT_TEST_ENABLED;
      case 9: return ANDROID_TEST_ENABLED;
      case 10: return MIN_SDK_PREVIEW;
      case 11: return TARGET_SDK_PREVIEW;
      case 12: return VARIANT_BUILDER_DEPENDENCIES_INFO;
      case 13: return TEST_FIXTURES_ENABLED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<VariantMethodType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      VariantMethodType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<VariantMethodType>() {
          public VariantMethodType findValueByNumber(int number) {
            return VariantMethodType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.android.tools.build.gradle.internal.profile.AnalyticsEnums.getDescriptor().getEnumTypes().get(8);
  }

  private static final VariantMethodType[] VALUES = values();

  public static VariantMethodType valueOf(
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

  private VariantMethodType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:VariantMethodType)
}

