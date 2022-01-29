// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Event related to the device manager tool window, the replacement for the AVD
 * manager
 * </pre>
 *
 * Protobuf type {@code android_studio.DeviceManagerEvent}
 */
public  final class DeviceManagerEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.DeviceManagerEvent)
    DeviceManagerEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeviceManagerEvent.newBuilder() to construct.
  private DeviceManagerEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeviceManagerEvent() {
    kind_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeviceManagerEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeviceManagerEvent(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();
              @SuppressWarnings("deprecation")
            com.google.wireless.android.sdk.stats.DeviceManagerEvent.EventKind value = com.google.wireless.android.sdk.stats.DeviceManagerEvent.EventKind.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(1, rawValue);
            } else {
              bitField0_ |= 0x00000001;
              kind_ = rawValue;
            }
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            virtualDeviceCount_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DeviceManagerEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DeviceManagerEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.DeviceManagerEvent.class, com.google.wireless.android.sdk.stats.DeviceManagerEvent.Builder.class);
  }

  /**
   * <pre>
   * The kind of DeviceManagerEvent
   * </pre>
   *
   * Protobuf enum {@code android_studio.DeviceManagerEvent.EventKind}
   */
  public enum EventKind
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Default kind
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The count of devices under the Virtual tab
     * </pre>
     *
     * <code>VIRTUAL_DEVICE_COUNT = 1;</code>
     */
    VIRTUAL_DEVICE_COUNT(1),
    /**
     * <pre>
     * The Launch action under the Virtual tab was clicked
     * </pre>
     *
     * <code>VIRTUAL_LAUNCH_ACTION = 2;</code>
     */
    VIRTUAL_LAUNCH_ACTION(2),
    /**
     * <pre>
     * The Device file explorer action under the Virtual tab was clicked
     * </pre>
     *
     * <code>VIRTUAL_DEVICE_FILE_EXPLORER_ACTION = 3;</code>
     */
    VIRTUAL_DEVICE_FILE_EXPLORER_ACTION(3),
    /**
     * <pre>
     * The Edit action under the Virtual tab was clicked
     * </pre>
     *
     * <code>VIRTUAL_EDIT_ACTION = 4;</code>
     */
    VIRTUAL_EDIT_ACTION(4),
    /**
     * <pre>
     * The Pair device action under the Virtual tab was clicked
     * </pre>
     *
     * <code>VIRTUAL_PAIR_DEVICE_ACTION = 5;</code>
     */
    VIRTUAL_PAIR_DEVICE_ACTION(5),
    /**
     * <pre>
     * The Duplicate action under the Virtual tab was clicked
     * </pre>
     *
     * <code>VIRTUAL_DUPLICATE_ACTION = 6;</code>
     */
    VIRTUAL_DUPLICATE_ACTION(6),
    /**
     * <pre>
     * The Wipe data action under the Virtual tab was clicked
     * </pre>
     *
     * <code>VIRTUAL_WIPE_DATA_ACTION = 7;</code>
     */
    VIRTUAL_WIPE_DATA_ACTION(7),
    /**
     * <pre>
     * The Cold boot now action under the Virtual tab was clicked
     * </pre>
     *
     * <code>VIRTUAL_COLD_BOOT_NOW_ACTION = 8;</code>
     */
    VIRTUAL_COLD_BOOT_NOW_ACTION(8),
    /**
     * <pre>
     * The Show on disk action under the Virtual tab was clicked
     * </pre>
     *
     * <code>VIRTUAL_SHOW_ON_DISK_ACTION = 9;</code>
     */
    VIRTUAL_SHOW_ON_DISK_ACTION(9),
    /**
     * <pre>
     * The Delete action under the Virtual tab was clicked
     * </pre>
     *
     * <code>VIRTUAL_DELETE_ACTION = 10;</code>
     */
    VIRTUAL_DELETE_ACTION(10),
    /**
     * <pre>
     * The Stop action under the Virtual tab was clicked
     * </pre>
     *
     * <code>VIRTUAL_STOP_ACTION = 11;</code>
     */
    VIRTUAL_STOP_ACTION(11),
    /**
     * <pre>
     * The Device file explorer action under the Physical tab was clicked
     * </pre>
     *
     * <code>PHYSICAL_DEVICE_FILE_EXPLORER_ACTION = 12;</code>
     */
    PHYSICAL_DEVICE_FILE_EXPLORER_ACTION(12),
    /**
     * <pre>
     * The Pair device action under the Physical tab was clicked
     * </pre>
     *
     * <code>PHYSICAL_PAIR_DEVICE_ACTION = 13;</code>
     */
    PHYSICAL_PAIR_DEVICE_ACTION(13),
    /**
     * <pre>
     * The Delete action under the Physical tab was clicked
     * </pre>
     *
     * <code>PHYSICAL_DELETE_ACTION = 14;</code>
     */
    PHYSICAL_DELETE_ACTION(14),
    /**
     * <pre>
     * The Unpair device action under the Virtual tab was clicked
     * </pre>
     *
     * <code>VIRTUAL_UNPAIR_DEVICE_ACTION = 15;</code>
     */
    VIRTUAL_UNPAIR_DEVICE_ACTION(15),
    /**
     * <pre>
     * The Unpair device action under the Physical tab was clicked
     * </pre>
     *
     * <code>PHYSICAL_UNPAIR_DEVICE_ACTION = 16;</code>
     */
    PHYSICAL_UNPAIR_DEVICE_ACTION(16),
    ;

    /**
     * <pre>
     * Default kind
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The count of devices under the Virtual tab
     * </pre>
     *
     * <code>VIRTUAL_DEVICE_COUNT = 1;</code>
     */
    public static final int VIRTUAL_DEVICE_COUNT_VALUE = 1;
    /**
     * <pre>
     * The Launch action under the Virtual tab was clicked
     * </pre>
     *
     * <code>VIRTUAL_LAUNCH_ACTION = 2;</code>
     */
    public static final int VIRTUAL_LAUNCH_ACTION_VALUE = 2;
    /**
     * <pre>
     * The Device file explorer action under the Virtual tab was clicked
     * </pre>
     *
     * <code>VIRTUAL_DEVICE_FILE_EXPLORER_ACTION = 3;</code>
     */
    public static final int VIRTUAL_DEVICE_FILE_EXPLORER_ACTION_VALUE = 3;
    /**
     * <pre>
     * The Edit action under the Virtual tab was clicked
     * </pre>
     *
     * <code>VIRTUAL_EDIT_ACTION = 4;</code>
     */
    public static final int VIRTUAL_EDIT_ACTION_VALUE = 4;
    /**
     * <pre>
     * The Pair device action under the Virtual tab was clicked
     * </pre>
     *
     * <code>VIRTUAL_PAIR_DEVICE_ACTION = 5;</code>
     */
    public static final int VIRTUAL_PAIR_DEVICE_ACTION_VALUE = 5;
    /**
     * <pre>
     * The Duplicate action under the Virtual tab was clicked
     * </pre>
     *
     * <code>VIRTUAL_DUPLICATE_ACTION = 6;</code>
     */
    public static final int VIRTUAL_DUPLICATE_ACTION_VALUE = 6;
    /**
     * <pre>
     * The Wipe data action under the Virtual tab was clicked
     * </pre>
     *
     * <code>VIRTUAL_WIPE_DATA_ACTION = 7;</code>
     */
    public static final int VIRTUAL_WIPE_DATA_ACTION_VALUE = 7;
    /**
     * <pre>
     * The Cold boot now action under the Virtual tab was clicked
     * </pre>
     *
     * <code>VIRTUAL_COLD_BOOT_NOW_ACTION = 8;</code>
     */
    public static final int VIRTUAL_COLD_BOOT_NOW_ACTION_VALUE = 8;
    /**
     * <pre>
     * The Show on disk action under the Virtual tab was clicked
     * </pre>
     *
     * <code>VIRTUAL_SHOW_ON_DISK_ACTION = 9;</code>
     */
    public static final int VIRTUAL_SHOW_ON_DISK_ACTION_VALUE = 9;
    /**
     * <pre>
     * The Delete action under the Virtual tab was clicked
     * </pre>
     *
     * <code>VIRTUAL_DELETE_ACTION = 10;</code>
     */
    public static final int VIRTUAL_DELETE_ACTION_VALUE = 10;
    /**
     * <pre>
     * The Stop action under the Virtual tab was clicked
     * </pre>
     *
     * <code>VIRTUAL_STOP_ACTION = 11;</code>
     */
    public static final int VIRTUAL_STOP_ACTION_VALUE = 11;
    /**
     * <pre>
     * The Device file explorer action under the Physical tab was clicked
     * </pre>
     *
     * <code>PHYSICAL_DEVICE_FILE_EXPLORER_ACTION = 12;</code>
     */
    public static final int PHYSICAL_DEVICE_FILE_EXPLORER_ACTION_VALUE = 12;
    /**
     * <pre>
     * The Pair device action under the Physical tab was clicked
     * </pre>
     *
     * <code>PHYSICAL_PAIR_DEVICE_ACTION = 13;</code>
     */
    public static final int PHYSICAL_PAIR_DEVICE_ACTION_VALUE = 13;
    /**
     * <pre>
     * The Delete action under the Physical tab was clicked
     * </pre>
     *
     * <code>PHYSICAL_DELETE_ACTION = 14;</code>
     */
    public static final int PHYSICAL_DELETE_ACTION_VALUE = 14;
    /**
     * <pre>
     * The Unpair device action under the Virtual tab was clicked
     * </pre>
     *
     * <code>VIRTUAL_UNPAIR_DEVICE_ACTION = 15;</code>
     */
    public static final int VIRTUAL_UNPAIR_DEVICE_ACTION_VALUE = 15;
    /**
     * <pre>
     * The Unpair device action under the Physical tab was clicked
     * </pre>
     *
     * <code>PHYSICAL_UNPAIR_DEVICE_ACTION = 16;</code>
     */
    public static final int PHYSICAL_UNPAIR_DEVICE_ACTION_VALUE = 16;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EventKind valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static EventKind forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return VIRTUAL_DEVICE_COUNT;
        case 2: return VIRTUAL_LAUNCH_ACTION;
        case 3: return VIRTUAL_DEVICE_FILE_EXPLORER_ACTION;
        case 4: return VIRTUAL_EDIT_ACTION;
        case 5: return VIRTUAL_PAIR_DEVICE_ACTION;
        case 6: return VIRTUAL_DUPLICATE_ACTION;
        case 7: return VIRTUAL_WIPE_DATA_ACTION;
        case 8: return VIRTUAL_COLD_BOOT_NOW_ACTION;
        case 9: return VIRTUAL_SHOW_ON_DISK_ACTION;
        case 10: return VIRTUAL_DELETE_ACTION;
        case 11: return VIRTUAL_STOP_ACTION;
        case 12: return PHYSICAL_DEVICE_FILE_EXPLORER_ACTION;
        case 13: return PHYSICAL_PAIR_DEVICE_ACTION;
        case 14: return PHYSICAL_DELETE_ACTION;
        case 15: return VIRTUAL_UNPAIR_DEVICE_ACTION;
        case 16: return PHYSICAL_UNPAIR_DEVICE_ACTION;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EventKind>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        EventKind> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EventKind>() {
            public EventKind findValueByNumber(int number) {
              return EventKind.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.DeviceManagerEvent.getDescriptor().getEnumTypes().get(0);
    }

    private static final EventKind[] VALUES = values();

    public static EventKind valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private EventKind(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.DeviceManagerEvent.EventKind)
  }

  private int bitField0_;
  public static final int KIND_FIELD_NUMBER = 1;
  private int kind_;
  /**
   * <pre>
   * The kind of DeviceManagerEvent
   * </pre>
   *
   * <code>optional .android_studio.DeviceManagerEvent.EventKind kind = 1;</code>
   * @return Whether the kind field is set.
   */
  public boolean hasKind() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The kind of DeviceManagerEvent
   * </pre>
   *
   * <code>optional .android_studio.DeviceManagerEvent.EventKind kind = 1;</code>
   * @return The kind.
   */
  public com.google.wireless.android.sdk.stats.DeviceManagerEvent.EventKind getKind() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.DeviceManagerEvent.EventKind result = com.google.wireless.android.sdk.stats.DeviceManagerEvent.EventKind.valueOf(kind_);
    return result == null ? com.google.wireless.android.sdk.stats.DeviceManagerEvent.EventKind.UNSPECIFIED : result;
  }

  public static final int VIRTUAL_DEVICE_COUNT_FIELD_NUMBER = 2;
  private int virtualDeviceCount_;
  /**
   * <pre>
   * The count of devices under the Virtual tab. Set when kind =
   * VIRTUAL_DEVICE_COUNT.
   * </pre>
   *
   * <code>optional int32 virtual_device_count = 2;</code>
   * @return Whether the virtualDeviceCount field is set.
   */
  public boolean hasVirtualDeviceCount() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The count of devices under the Virtual tab. Set when kind =
   * VIRTUAL_DEVICE_COUNT.
   * </pre>
   *
   * <code>optional int32 virtual_device_count = 2;</code>
   * @return The virtualDeviceCount.
   */
  public int getVirtualDeviceCount() {
    return virtualDeviceCount_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeEnum(1, kind_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(2, virtualDeviceCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, kind_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, virtualDeviceCount_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.wireless.android.sdk.stats.DeviceManagerEvent)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.DeviceManagerEvent other = (com.google.wireless.android.sdk.stats.DeviceManagerEvent) obj;

    if (hasKind() != other.hasKind()) return false;
    if (hasKind()) {
      if (kind_ != other.kind_) return false;
    }
    if (hasVirtualDeviceCount() != other.hasVirtualDeviceCount()) return false;
    if (hasVirtualDeviceCount()) {
      if (getVirtualDeviceCount()
          != other.getVirtualDeviceCount()) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasKind()) {
      hash = (37 * hash) + KIND_FIELD_NUMBER;
      hash = (53 * hash) + kind_;
    }
    if (hasVirtualDeviceCount()) {
      hash = (37 * hash) + VIRTUAL_DEVICE_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getVirtualDeviceCount();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.DeviceManagerEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.DeviceManagerEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DeviceManagerEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.DeviceManagerEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DeviceManagerEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.DeviceManagerEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DeviceManagerEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.DeviceManagerEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DeviceManagerEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.DeviceManagerEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DeviceManagerEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.DeviceManagerEvent parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.DeviceManagerEvent prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Event related to the device manager tool window, the replacement for the AVD
   * manager
   * </pre>
   *
   * Protobuf type {@code android_studio.DeviceManagerEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.DeviceManagerEvent)
      com.google.wireless.android.sdk.stats.DeviceManagerEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DeviceManagerEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DeviceManagerEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.DeviceManagerEvent.class, com.google.wireless.android.sdk.stats.DeviceManagerEvent.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.DeviceManagerEvent.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      kind_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      virtualDeviceCount_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DeviceManagerEvent_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.DeviceManagerEvent getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.DeviceManagerEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.DeviceManagerEvent build() {
      com.google.wireless.android.sdk.stats.DeviceManagerEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.DeviceManagerEvent buildPartial() {
      com.google.wireless.android.sdk.stats.DeviceManagerEvent result = new com.google.wireless.android.sdk.stats.DeviceManagerEvent(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.kind_ = kind_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.virtualDeviceCount_ = virtualDeviceCount_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.wireless.android.sdk.stats.DeviceManagerEvent) {
        return mergeFrom((com.google.wireless.android.sdk.stats.DeviceManagerEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.DeviceManagerEvent other) {
      if (other == com.google.wireless.android.sdk.stats.DeviceManagerEvent.getDefaultInstance()) return this;
      if (other.hasKind()) {
        setKind(other.getKind());
      }
      if (other.hasVirtualDeviceCount()) {
        setVirtualDeviceCount(other.getVirtualDeviceCount());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.wireless.android.sdk.stats.DeviceManagerEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.DeviceManagerEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int kind_ = 0;
    /**
     * <pre>
     * The kind of DeviceManagerEvent
     * </pre>
     *
     * <code>optional .android_studio.DeviceManagerEvent.EventKind kind = 1;</code>
     * @return Whether the kind field is set.
     */
    public boolean hasKind() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The kind of DeviceManagerEvent
     * </pre>
     *
     * <code>optional .android_studio.DeviceManagerEvent.EventKind kind = 1;</code>
     * @return The kind.
     */
    public com.google.wireless.android.sdk.stats.DeviceManagerEvent.EventKind getKind() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.DeviceManagerEvent.EventKind result = com.google.wireless.android.sdk.stats.DeviceManagerEvent.EventKind.valueOf(kind_);
      return result == null ? com.google.wireless.android.sdk.stats.DeviceManagerEvent.EventKind.UNSPECIFIED : result;
    }
    /**
     * <pre>
     * The kind of DeviceManagerEvent
     * </pre>
     *
     * <code>optional .android_studio.DeviceManagerEvent.EventKind kind = 1;</code>
     * @param value The kind to set.
     * @return This builder for chaining.
     */
    public Builder setKind(com.google.wireless.android.sdk.stats.DeviceManagerEvent.EventKind value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      kind_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The kind of DeviceManagerEvent
     * </pre>
     *
     * <code>optional .android_studio.DeviceManagerEvent.EventKind kind = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKind() {
      bitField0_ = (bitField0_ & ~0x00000001);
      kind_ = 0;
      onChanged();
      return this;
    }

    private int virtualDeviceCount_ ;
    /**
     * <pre>
     * The count of devices under the Virtual tab. Set when kind =
     * VIRTUAL_DEVICE_COUNT.
     * </pre>
     *
     * <code>optional int32 virtual_device_count = 2;</code>
     * @return Whether the virtualDeviceCount field is set.
     */
    public boolean hasVirtualDeviceCount() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The count of devices under the Virtual tab. Set when kind =
     * VIRTUAL_DEVICE_COUNT.
     * </pre>
     *
     * <code>optional int32 virtual_device_count = 2;</code>
     * @return The virtualDeviceCount.
     */
    public int getVirtualDeviceCount() {
      return virtualDeviceCount_;
    }
    /**
     * <pre>
     * The count of devices under the Virtual tab. Set when kind =
     * VIRTUAL_DEVICE_COUNT.
     * </pre>
     *
     * <code>optional int32 virtual_device_count = 2;</code>
     * @param value The virtualDeviceCount to set.
     * @return This builder for chaining.
     */
    public Builder setVirtualDeviceCount(int value) {
      bitField0_ |= 0x00000002;
      virtualDeviceCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The count of devices under the Virtual tab. Set when kind =
     * VIRTUAL_DEVICE_COUNT.
     * </pre>
     *
     * <code>optional int32 virtual_device_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVirtualDeviceCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      virtualDeviceCount_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:android_studio.DeviceManagerEvent)
  }

  // @@protoc_insertion_point(class_scope:android_studio.DeviceManagerEvent)
  private static final com.google.wireless.android.sdk.stats.DeviceManagerEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.DeviceManagerEvent();
  }

  public static com.google.wireless.android.sdk.stats.DeviceManagerEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<DeviceManagerEvent>
      PARSER = new com.google.protobuf.AbstractParser<DeviceManagerEvent>() {
    @java.lang.Override
    public DeviceManagerEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeviceManagerEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeviceManagerEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeviceManagerEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.DeviceManagerEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

