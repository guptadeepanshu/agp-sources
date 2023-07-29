// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: analytics_enums.proto

package com.android.tools.build.gradle.internal.profile;

/**
 * Protobuf enum {@code VariantApiArtifactType}
 */
public enum VariantApiArtifactType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CUSTOM_ARTIFACT_TYPE = 0;</code>
   */
  CUSTOM_ARTIFACT_TYPE(0),
  /**
   * <code>AAR = 1;</code>
   */
  AAR(1),
  /**
   * <code>APK = 2;</code>
   */
  APK(2),
  /**
   * <code>BUNDLE = 3;</code>
   */
  BUNDLE(3),
  /**
   * <pre>
   * Deprecated
   * </pre>
   *
   * <code>LIBRARY_MANIFEST = 4;</code>
   */
  LIBRARY_MANIFEST(4),
  /**
   * <code>MERGED_MANIFEST = 5;</code>
   */
  MERGED_MANIFEST(5),
  /**
   * <code>OBFUSCATION_MAPPING_FILE = 6;</code>
   */
  OBFUSCATION_MAPPING_FILE(6),
  /**
   * <code>PUBLIC_ANDROID_RESOURCES_LIST = 7;</code>
   */
  PUBLIC_ANDROID_RESOURCES_LIST(7),
  /**
   * <code>ASSETS = 8;</code>
   */
  ASSETS(8),
  /**
   * <code>METADATA_LIBRARY_DEPENDENCIES_REPORT = 9;</code>
   */
  METADATA_LIBRARY_DEPENDENCIES_REPORT(9),
  /**
   * <code>APK_FROM_BUNDLE = 10;</code>
   */
  APK_FROM_BUNDLE(10),
  /**
   * <code>PROJECT_CLASSES = 11;</code>
   */
  PROJECT_CLASSES(11),
  /**
   * <code>MERGED_NATIVE_LIBS = 12;</code>
   */
  MERGED_NATIVE_LIBS(12),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CUSTOM_ARTIFACT_TYPE = 0;</code>
   */
  public static final int CUSTOM_ARTIFACT_TYPE_VALUE = 0;
  /**
   * <code>AAR = 1;</code>
   */
  public static final int AAR_VALUE = 1;
  /**
   * <code>APK = 2;</code>
   */
  public static final int APK_VALUE = 2;
  /**
   * <code>BUNDLE = 3;</code>
   */
  public static final int BUNDLE_VALUE = 3;
  /**
   * <pre>
   * Deprecated
   * </pre>
   *
   * <code>LIBRARY_MANIFEST = 4;</code>
   */
  public static final int LIBRARY_MANIFEST_VALUE = 4;
  /**
   * <code>MERGED_MANIFEST = 5;</code>
   */
  public static final int MERGED_MANIFEST_VALUE = 5;
  /**
   * <code>OBFUSCATION_MAPPING_FILE = 6;</code>
   */
  public static final int OBFUSCATION_MAPPING_FILE_VALUE = 6;
  /**
   * <code>PUBLIC_ANDROID_RESOURCES_LIST = 7;</code>
   */
  public static final int PUBLIC_ANDROID_RESOURCES_LIST_VALUE = 7;
  /**
   * <code>ASSETS = 8;</code>
   */
  public static final int ASSETS_VALUE = 8;
  /**
   * <code>METADATA_LIBRARY_DEPENDENCIES_REPORT = 9;</code>
   */
  public static final int METADATA_LIBRARY_DEPENDENCIES_REPORT_VALUE = 9;
  /**
   * <code>APK_FROM_BUNDLE = 10;</code>
   */
  public static final int APK_FROM_BUNDLE_VALUE = 10;
  /**
   * <code>PROJECT_CLASSES = 11;</code>
   */
  public static final int PROJECT_CLASSES_VALUE = 11;
  /**
   * <code>MERGED_NATIVE_LIBS = 12;</code>
   */
  public static final int MERGED_NATIVE_LIBS_VALUE = 12;


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
  public static VariantApiArtifactType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static VariantApiArtifactType forNumber(int value) {
    switch (value) {
      case 0: return CUSTOM_ARTIFACT_TYPE;
      case 1: return AAR;
      case 2: return APK;
      case 3: return BUNDLE;
      case 4: return LIBRARY_MANIFEST;
      case 5: return MERGED_MANIFEST;
      case 6: return OBFUSCATION_MAPPING_FILE;
      case 7: return PUBLIC_ANDROID_RESOURCES_LIST;
      case 8: return ASSETS;
      case 9: return METADATA_LIBRARY_DEPENDENCIES_REPORT;
      case 10: return APK_FROM_BUNDLE;
      case 11: return PROJECT_CLASSES;
      case 12: return MERGED_NATIVE_LIBS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<VariantApiArtifactType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      VariantApiArtifactType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<VariantApiArtifactType>() {
          public VariantApiArtifactType findValueByNumber(int number) {
            return VariantApiArtifactType.forNumber(number);
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
    return com.android.tools.build.gradle.internal.profile.AnalyticsEnums.getDescriptor().getEnumTypes().get(7);
  }

  private static final VariantApiArtifactType[] VALUES = values();

  public static VariantApiArtifactType valueOf(
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

  private VariantApiArtifactType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:VariantApiArtifactType)
}

