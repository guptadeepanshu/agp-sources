// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Detailed lists of snapshot operation failure reasons.
 * Shared between load and save operations.
 * </pre>
 *
 * Protobuf enum {@code android_studio.EmulatorSnapshotFailureReason}
 */
public enum EmulatorSnapshotFailureReason
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_UNSPECIFIED = 0;</code>
   */
  EMULATOR_SNAPSHOT_FAILURE_REASON_UNSPECIFIED(0),
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_CORRUPTED_DATA = 1;</code>
   */
  EMULATOR_SNAPSHOT_FAILURE_REASON_CORRUPTED_DATA(1),
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_NO_SNAPSHOT_PB = 2;</code>
   */
  EMULATOR_SNAPSHOT_FAILURE_REASON_NO_SNAPSHOT_PB(2),
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_BAD_SNAPSHOT_PB = 3;</code>
   */
  EMULATOR_SNAPSHOT_FAILURE_REASON_BAD_SNAPSHOT_PB(3),
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_INCOMPATIBLE_VERSION = 4;</code>
   */
  EMULATOR_SNAPSHOT_FAILURE_REASON_INCOMPATIBLE_VERSION(4),
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_NO_RAM_FILE = 5;</code>
   */
  EMULATOR_SNAPSHOT_FAILURE_REASON_NO_RAM_FILE(5),
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_NO_TEXTURES_FILE = 6;</code>
   */
  EMULATOR_SNAPSHOT_FAILURE_REASON_NO_TEXTURES_FILE(6),
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_SNAPSHOTS_NOT_SUPPORTED = 7;</code>
   */
  EMULATOR_SNAPSHOT_FAILURE_REASON_SNAPSHOTS_NOT_SUPPORTED(7),
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_UNRECOVERABLE_ERROR_LIMIT = 10000;</code>
   */
  EMULATOR_SNAPSHOT_FAILURE_REASON_UNRECOVERABLE_ERROR_LIMIT(10000),
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_NO_SNAPSHOT_IN_IMAGE = 10001;</code>
   */
  EMULATOR_SNAPSHOT_FAILURE_REASON_NO_SNAPSHOT_IN_IMAGE(10001),
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_CONFIG_MISMATCH_HOST_HYPERVISOR = 10002;</code>
   */
  EMULATOR_SNAPSHOT_FAILURE_REASON_CONFIG_MISMATCH_HOST_HYPERVISOR(10002),
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_CONFIG_MISMATCH_HOST_GPU = 10003;</code>
   */
  EMULATOR_SNAPSHOT_FAILURE_REASON_CONFIG_MISMATCH_HOST_GPU(10003),
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_CONFIG_MISMATCH_RENDERER = 10004;</code>
   */
  EMULATOR_SNAPSHOT_FAILURE_REASON_CONFIG_MISMATCH_RENDERER(10004),
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_CONFIG_MISMATCH_FEATURES = 10005;</code>
   */
  EMULATOR_SNAPSHOT_FAILURE_REASON_CONFIG_MISMATCH_FEATURES(10005),
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_CONFIG_MISMATCH_AVD = 10006;</code>
   */
  EMULATOR_SNAPSHOT_FAILURE_REASON_CONFIG_MISMATCH_AVD(10006),
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_SYSTEM_IMAGE_CHANGED = 10007;</code>
   */
  EMULATOR_SNAPSHOT_FAILURE_REASON_SYSTEM_IMAGE_CHANGED(10007),
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_VALIDATION_ERROR_LIMIT = 20000;</code>
   */
  EMULATOR_SNAPSHOT_FAILURE_REASON_VALIDATION_ERROR_LIMIT(20000),
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_INTERNAL_ERROR = 20001;</code>
   */
  EMULATOR_SNAPSHOT_FAILURE_REASON_INTERNAL_ERROR(20001),
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_EMULATION_ENGINE_FAILED = 20002;</code>
   */
  EMULATOR_SNAPSHOT_FAILURE_REASON_EMULATION_ENGINE_FAILED(20002),
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_RAM_FAILED = 20003;</code>
   */
  EMULATOR_SNAPSHOT_FAILURE_REASON_RAM_FAILED(20003),
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_TEXTURES_FAILED = 20004;</code>
   */
  EMULATOR_SNAPSHOT_FAILURE_REASON_TEXTURES_FAILED(20004),
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_ADB_OFFLINE = 20005;</code>
   */
  EMULATOR_SNAPSHOT_FAILURE_REASON_ADB_OFFLINE(20005),
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_UNSUPPORTED_VK_APP = 20006;</code>
   */
  EMULATOR_SNAPSHOT_FAILURE_REASON_UNSUPPORTED_VK_APP(20006),
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_UNSUPPORTED_VK_API = 20007;</code>
   */
  EMULATOR_SNAPSHOT_FAILURE_REASON_UNSUPPORTED_VK_API(20007),
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_IN_PROGRESS_LIMIT = 30000;</code>
   */
  EMULATOR_SNAPSHOT_FAILURE_REASON_IN_PROGRESS_LIMIT(30000),
  ;

  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_UNSPECIFIED = 0;</code>
   */
  public static final int EMULATOR_SNAPSHOT_FAILURE_REASON_UNSPECIFIED_VALUE = 0;
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_CORRUPTED_DATA = 1;</code>
   */
  public static final int EMULATOR_SNAPSHOT_FAILURE_REASON_CORRUPTED_DATA_VALUE = 1;
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_NO_SNAPSHOT_PB = 2;</code>
   */
  public static final int EMULATOR_SNAPSHOT_FAILURE_REASON_NO_SNAPSHOT_PB_VALUE = 2;
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_BAD_SNAPSHOT_PB = 3;</code>
   */
  public static final int EMULATOR_SNAPSHOT_FAILURE_REASON_BAD_SNAPSHOT_PB_VALUE = 3;
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_INCOMPATIBLE_VERSION = 4;</code>
   */
  public static final int EMULATOR_SNAPSHOT_FAILURE_REASON_INCOMPATIBLE_VERSION_VALUE = 4;
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_NO_RAM_FILE = 5;</code>
   */
  public static final int EMULATOR_SNAPSHOT_FAILURE_REASON_NO_RAM_FILE_VALUE = 5;
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_NO_TEXTURES_FILE = 6;</code>
   */
  public static final int EMULATOR_SNAPSHOT_FAILURE_REASON_NO_TEXTURES_FILE_VALUE = 6;
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_SNAPSHOTS_NOT_SUPPORTED = 7;</code>
   */
  public static final int EMULATOR_SNAPSHOT_FAILURE_REASON_SNAPSHOTS_NOT_SUPPORTED_VALUE = 7;
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_UNRECOVERABLE_ERROR_LIMIT = 10000;</code>
   */
  public static final int EMULATOR_SNAPSHOT_FAILURE_REASON_UNRECOVERABLE_ERROR_LIMIT_VALUE = 10000;
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_NO_SNAPSHOT_IN_IMAGE = 10001;</code>
   */
  public static final int EMULATOR_SNAPSHOT_FAILURE_REASON_NO_SNAPSHOT_IN_IMAGE_VALUE = 10001;
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_CONFIG_MISMATCH_HOST_HYPERVISOR = 10002;</code>
   */
  public static final int EMULATOR_SNAPSHOT_FAILURE_REASON_CONFIG_MISMATCH_HOST_HYPERVISOR_VALUE = 10002;
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_CONFIG_MISMATCH_HOST_GPU = 10003;</code>
   */
  public static final int EMULATOR_SNAPSHOT_FAILURE_REASON_CONFIG_MISMATCH_HOST_GPU_VALUE = 10003;
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_CONFIG_MISMATCH_RENDERER = 10004;</code>
   */
  public static final int EMULATOR_SNAPSHOT_FAILURE_REASON_CONFIG_MISMATCH_RENDERER_VALUE = 10004;
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_CONFIG_MISMATCH_FEATURES = 10005;</code>
   */
  public static final int EMULATOR_SNAPSHOT_FAILURE_REASON_CONFIG_MISMATCH_FEATURES_VALUE = 10005;
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_CONFIG_MISMATCH_AVD = 10006;</code>
   */
  public static final int EMULATOR_SNAPSHOT_FAILURE_REASON_CONFIG_MISMATCH_AVD_VALUE = 10006;
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_SYSTEM_IMAGE_CHANGED = 10007;</code>
   */
  public static final int EMULATOR_SNAPSHOT_FAILURE_REASON_SYSTEM_IMAGE_CHANGED_VALUE = 10007;
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_VALIDATION_ERROR_LIMIT = 20000;</code>
   */
  public static final int EMULATOR_SNAPSHOT_FAILURE_REASON_VALIDATION_ERROR_LIMIT_VALUE = 20000;
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_INTERNAL_ERROR = 20001;</code>
   */
  public static final int EMULATOR_SNAPSHOT_FAILURE_REASON_INTERNAL_ERROR_VALUE = 20001;
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_EMULATION_ENGINE_FAILED = 20002;</code>
   */
  public static final int EMULATOR_SNAPSHOT_FAILURE_REASON_EMULATION_ENGINE_FAILED_VALUE = 20002;
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_RAM_FAILED = 20003;</code>
   */
  public static final int EMULATOR_SNAPSHOT_FAILURE_REASON_RAM_FAILED_VALUE = 20003;
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_TEXTURES_FAILED = 20004;</code>
   */
  public static final int EMULATOR_SNAPSHOT_FAILURE_REASON_TEXTURES_FAILED_VALUE = 20004;
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_ADB_OFFLINE = 20005;</code>
   */
  public static final int EMULATOR_SNAPSHOT_FAILURE_REASON_ADB_OFFLINE_VALUE = 20005;
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_UNSUPPORTED_VK_APP = 20006;</code>
   */
  public static final int EMULATOR_SNAPSHOT_FAILURE_REASON_UNSUPPORTED_VK_APP_VALUE = 20006;
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_UNSUPPORTED_VK_API = 20007;</code>
   */
  public static final int EMULATOR_SNAPSHOT_FAILURE_REASON_UNSUPPORTED_VK_API_VALUE = 20007;
  /**
   * <code>EMULATOR_SNAPSHOT_FAILURE_REASON_IN_PROGRESS_LIMIT = 30000;</code>
   */
  public static final int EMULATOR_SNAPSHOT_FAILURE_REASON_IN_PROGRESS_LIMIT_VALUE = 30000;


  public final int getNumber() {
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static EmulatorSnapshotFailureReason valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EmulatorSnapshotFailureReason forNumber(int value) {
    switch (value) {
      case 0: return EMULATOR_SNAPSHOT_FAILURE_REASON_UNSPECIFIED;
      case 1: return EMULATOR_SNAPSHOT_FAILURE_REASON_CORRUPTED_DATA;
      case 2: return EMULATOR_SNAPSHOT_FAILURE_REASON_NO_SNAPSHOT_PB;
      case 3: return EMULATOR_SNAPSHOT_FAILURE_REASON_BAD_SNAPSHOT_PB;
      case 4: return EMULATOR_SNAPSHOT_FAILURE_REASON_INCOMPATIBLE_VERSION;
      case 5: return EMULATOR_SNAPSHOT_FAILURE_REASON_NO_RAM_FILE;
      case 6: return EMULATOR_SNAPSHOT_FAILURE_REASON_NO_TEXTURES_FILE;
      case 7: return EMULATOR_SNAPSHOT_FAILURE_REASON_SNAPSHOTS_NOT_SUPPORTED;
      case 10000: return EMULATOR_SNAPSHOT_FAILURE_REASON_UNRECOVERABLE_ERROR_LIMIT;
      case 10001: return EMULATOR_SNAPSHOT_FAILURE_REASON_NO_SNAPSHOT_IN_IMAGE;
      case 10002: return EMULATOR_SNAPSHOT_FAILURE_REASON_CONFIG_MISMATCH_HOST_HYPERVISOR;
      case 10003: return EMULATOR_SNAPSHOT_FAILURE_REASON_CONFIG_MISMATCH_HOST_GPU;
      case 10004: return EMULATOR_SNAPSHOT_FAILURE_REASON_CONFIG_MISMATCH_RENDERER;
      case 10005: return EMULATOR_SNAPSHOT_FAILURE_REASON_CONFIG_MISMATCH_FEATURES;
      case 10006: return EMULATOR_SNAPSHOT_FAILURE_REASON_CONFIG_MISMATCH_AVD;
      case 10007: return EMULATOR_SNAPSHOT_FAILURE_REASON_SYSTEM_IMAGE_CHANGED;
      case 20000: return EMULATOR_SNAPSHOT_FAILURE_REASON_VALIDATION_ERROR_LIMIT;
      case 20001: return EMULATOR_SNAPSHOT_FAILURE_REASON_INTERNAL_ERROR;
      case 20002: return EMULATOR_SNAPSHOT_FAILURE_REASON_EMULATION_ENGINE_FAILED;
      case 20003: return EMULATOR_SNAPSHOT_FAILURE_REASON_RAM_FAILED;
      case 20004: return EMULATOR_SNAPSHOT_FAILURE_REASON_TEXTURES_FAILED;
      case 20005: return EMULATOR_SNAPSHOT_FAILURE_REASON_ADB_OFFLINE;
      case 20006: return EMULATOR_SNAPSHOT_FAILURE_REASON_UNSUPPORTED_VK_APP;
      case 20007: return EMULATOR_SNAPSHOT_FAILURE_REASON_UNSUPPORTED_VK_API;
      case 30000: return EMULATOR_SNAPSHOT_FAILURE_REASON_IN_PROGRESS_LIMIT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EmulatorSnapshotFailureReason>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EmulatorSnapshotFailureReason> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EmulatorSnapshotFailureReason>() {
          public EmulatorSnapshotFailureReason findValueByNumber(int number) {
            return EmulatorSnapshotFailureReason.forNumber(number);
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.getDescriptor().getEnumTypes().get(3);
  }

  private static final EmulatorSnapshotFailureReason[] VALUES = values();

  public static EmulatorSnapshotFailureReason valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private EmulatorSnapshotFailureReason(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:android_studio.EmulatorSnapshotFailureReason)
}

