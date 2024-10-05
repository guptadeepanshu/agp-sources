// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * DO NOT USE: OBSOLETE
 * </pre>
 *
 * Protobuf type {@code android_studio.AdbServerState}
 */
public final class AdbServerState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.AdbServerState)
    AdbServerStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdbServerState.newBuilder() to construct.
  private AdbServerState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdbServerState() {
    version_ = "";
    mdnsBackend_ = 0;
    usbBackend_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdbServerState();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AdbServerState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AdbServerState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.AdbServerState.class, com.google.wireless.android.sdk.stats.AdbServerState.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.AdbServerState.MDNDBackend}
   */
  public enum MDNDBackend
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>TYPE_MDNS_UNKNOWN = 0;</code>
     */
    TYPE_MDNS_UNKNOWN(0),
    /**
     * <code>TYPE_MDNS_DEFAULT = 1;</code>
     */
    TYPE_MDNS_DEFAULT(1),
    /**
     * <code>TYPE_BONJOUR = 2;</code>
     */
    TYPE_BONJOUR(2),
    /**
     * <code>TYPE_OPENSCREEN = 3;</code>
     */
    TYPE_OPENSCREEN(3),
    ;

    /**
     * <code>TYPE_MDNS_UNKNOWN = 0;</code>
     */
    public static final int TYPE_MDNS_UNKNOWN_VALUE = 0;
    /**
     * <code>TYPE_MDNS_DEFAULT = 1;</code>
     */
    public static final int TYPE_MDNS_DEFAULT_VALUE = 1;
    /**
     * <code>TYPE_BONJOUR = 2;</code>
     */
    public static final int TYPE_BONJOUR_VALUE = 2;
    /**
     * <code>TYPE_OPENSCREEN = 3;</code>
     */
    public static final int TYPE_OPENSCREEN_VALUE = 3;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MDNDBackend valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MDNDBackend forNumber(int value) {
      switch (value) {
        case 0: return TYPE_MDNS_UNKNOWN;
        case 1: return TYPE_MDNS_DEFAULT;
        case 2: return TYPE_BONJOUR;
        case 3: return TYPE_OPENSCREEN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MDNDBackend>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MDNDBackend> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MDNDBackend>() {
            public MDNDBackend findValueByNumber(int number) {
              return MDNDBackend.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.AdbServerState.getDescriptor().getEnumTypes().get(0);
    }

    private static final MDNDBackend[] VALUES = values();

    public static MDNDBackend valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MDNDBackend(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.AdbServerState.MDNDBackend)
  }

  /**
   * Protobuf enum {@code android_studio.AdbServerState.USBBackend}
   */
  public enum USBBackend
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>TYPE_USB_UNKNOWN = 0;</code>
     */
    TYPE_USB_UNKNOWN(0),
    /**
     * <code>TYPE_USB_DEFAULT = 1;</code>
     */
    TYPE_USB_DEFAULT(1),
    /**
     * <code>TYPE_LIBUSB = 2;</code>
     */
    TYPE_LIBUSB(2),
    /**
     * <code>TYPE_NATIVE = 3;</code>
     */
    TYPE_NATIVE(3),
    ;

    /**
     * <code>TYPE_USB_UNKNOWN = 0;</code>
     */
    public static final int TYPE_USB_UNKNOWN_VALUE = 0;
    /**
     * <code>TYPE_USB_DEFAULT = 1;</code>
     */
    public static final int TYPE_USB_DEFAULT_VALUE = 1;
    /**
     * <code>TYPE_LIBUSB = 2;</code>
     */
    public static final int TYPE_LIBUSB_VALUE = 2;
    /**
     * <code>TYPE_NATIVE = 3;</code>
     */
    public static final int TYPE_NATIVE_VALUE = 3;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static USBBackend valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static USBBackend forNumber(int value) {
      switch (value) {
        case 0: return TYPE_USB_UNKNOWN;
        case 1: return TYPE_USB_DEFAULT;
        case 2: return TYPE_LIBUSB;
        case 3: return TYPE_NATIVE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<USBBackend>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        USBBackend> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<USBBackend>() {
            public USBBackend findValueByNumber(int number) {
              return USBBackend.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.AdbServerState.getDescriptor().getEnumTypes().get(1);
    }

    private static final USBBackend[] VALUES = values();

    public static USBBackend valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private USBBackend(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.AdbServerState.USBBackend)
  }

  private int bitField0_;
  public static final int IS_MANAGED_FIELD_NUMBER = 1;
  private boolean isManaged_;
  /**
   * <code>optional bool is_managed = 1;</code>
   * @return Whether the isManaged field is set.
   */
  @java.lang.Override
  public boolean hasIsManaged() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional bool is_managed = 1;</code>
   * @return The isManaged.
   */
  @java.lang.Override
  public boolean getIsManaged() {
    return isManaged_;
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private volatile java.lang.Object version_;
  /**
   * <code>optional string version = 2;</code>
   * @return Whether the version field is set.
   */
  @java.lang.Override
  public boolean hasVersion() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string version = 2;</code>
   * @return The version.
   */
  @java.lang.Override
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        version_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string version = 2;</code>
   * @return The bytes for version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MDNS_BACKEND_FIELD_NUMBER = 3;
  private int mdnsBackend_;
  /**
   * <code>optional .android_studio.AdbServerState.MDNDBackend mdns_backend = 3;</code>
   * @return Whether the mdnsBackend field is set.
   */
  @java.lang.Override public boolean hasMdnsBackend() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional .android_studio.AdbServerState.MDNDBackend mdns_backend = 3;</code>
   * @return The mdnsBackend.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.AdbServerState.MDNDBackend getMdnsBackend() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.AdbServerState.MDNDBackend result = com.google.wireless.android.sdk.stats.AdbServerState.MDNDBackend.valueOf(mdnsBackend_);
    return result == null ? com.google.wireless.android.sdk.stats.AdbServerState.MDNDBackend.TYPE_MDNS_UNKNOWN : result;
  }

  public static final int USB_BACKEND_FIELD_NUMBER = 4;
  private int usbBackend_;
  /**
   * <code>optional .android_studio.AdbServerState.USBBackend usb_backend = 4;</code>
   * @return Whether the usbBackend field is set.
   */
  @java.lang.Override public boolean hasUsbBackend() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>optional .android_studio.AdbServerState.USBBackend usb_backend = 4;</code>
   * @return The usbBackend.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.AdbServerState.USBBackend getUsbBackend() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.AdbServerState.USBBackend result = com.google.wireless.android.sdk.stats.AdbServerState.USBBackend.valueOf(usbBackend_);
    return result == null ? com.google.wireless.android.sdk.stats.AdbServerState.USBBackend.TYPE_USB_UNKNOWN : result;
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
      output.writeBool(1, isManaged_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, version_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeEnum(3, mdnsBackend_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeEnum(4, usbBackend_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, isManaged_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, version_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, mdnsBackend_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, usbBackend_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.wireless.android.sdk.stats.AdbServerState)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.AdbServerState other = (com.google.wireless.android.sdk.stats.AdbServerState) obj;

    if (hasIsManaged() != other.hasIsManaged()) return false;
    if (hasIsManaged()) {
      if (getIsManaged()
          != other.getIsManaged()) return false;
    }
    if (hasVersion() != other.hasVersion()) return false;
    if (hasVersion()) {
      if (!getVersion()
          .equals(other.getVersion())) return false;
    }
    if (hasMdnsBackend() != other.hasMdnsBackend()) return false;
    if (hasMdnsBackend()) {
      if (mdnsBackend_ != other.mdnsBackend_) return false;
    }
    if (hasUsbBackend() != other.hasUsbBackend()) return false;
    if (hasUsbBackend()) {
      if (usbBackend_ != other.usbBackend_) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasIsManaged()) {
      hash = (37 * hash) + IS_MANAGED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsManaged());
    }
    if (hasVersion()) {
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion().hashCode();
    }
    if (hasMdnsBackend()) {
      hash = (37 * hash) + MDNS_BACKEND_FIELD_NUMBER;
      hash = (53 * hash) + mdnsBackend_;
    }
    if (hasUsbBackend()) {
      hash = (37 * hash) + USB_BACKEND_FIELD_NUMBER;
      hash = (53 * hash) + usbBackend_;
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.AdbServerState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.AdbServerState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AdbServerState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.AdbServerState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AdbServerState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.AdbServerState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AdbServerState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.AdbServerState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AdbServerState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.AdbServerState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AdbServerState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.AdbServerState parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.AdbServerState prototype) {
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
   * DO NOT USE: OBSOLETE
   * </pre>
   *
   * Protobuf type {@code android_studio.AdbServerState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.AdbServerState)
      com.google.wireless.android.sdk.stats.AdbServerStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AdbServerState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AdbServerState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.AdbServerState.class, com.google.wireless.android.sdk.stats.AdbServerState.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.AdbServerState.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      isManaged_ = false;
      bitField0_ = (bitField0_ & ~0x00000001);
      version_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      mdnsBackend_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      usbBackend_ = 0;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AdbServerState_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.AdbServerState getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.AdbServerState.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.AdbServerState build() {
      com.google.wireless.android.sdk.stats.AdbServerState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.AdbServerState buildPartial() {
      com.google.wireless.android.sdk.stats.AdbServerState result = new com.google.wireless.android.sdk.stats.AdbServerState(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.isManaged_ = isManaged_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.version_ = version_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.mdnsBackend_ = mdnsBackend_;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        to_bitField0_ |= 0x00000008;
      }
      result.usbBackend_ = usbBackend_;
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
      if (other instanceof com.google.wireless.android.sdk.stats.AdbServerState) {
        return mergeFrom((com.google.wireless.android.sdk.stats.AdbServerState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.AdbServerState other) {
      if (other == com.google.wireless.android.sdk.stats.AdbServerState.getDefaultInstance()) return this;
      if (other.hasIsManaged()) {
        setIsManaged(other.getIsManaged());
      }
      if (other.hasVersion()) {
        bitField0_ |= 0x00000002;
        version_ = other.version_;
        onChanged();
      }
      if (other.hasMdnsBackend()) {
        setMdnsBackend(other.getMdnsBackend());
      }
      if (other.hasUsbBackend()) {
        setUsbBackend(other.getUsbBackend());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              isManaged_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              version_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              int tmpRaw = input.readEnum();
              com.google.wireless.android.sdk.stats.AdbServerState.MDNDBackend tmpValue =
                  com.google.wireless.android.sdk.stats.AdbServerState.MDNDBackend.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(3, tmpRaw);
              } else {
                mdnsBackend_ = tmpRaw;
                bitField0_ |= 0x00000004;
              }
              break;
            } // case 24
            case 32: {
              int tmpRaw = input.readEnum();
              com.google.wireless.android.sdk.stats.AdbServerState.USBBackend tmpValue =
                  com.google.wireless.android.sdk.stats.AdbServerState.USBBackend.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(4, tmpRaw);
              } else {
                usbBackend_ = tmpRaw;
                bitField0_ |= 0x00000008;
              }
              break;
            } // case 32
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private boolean isManaged_ ;
    /**
     * <code>optional bool is_managed = 1;</code>
     * @return Whether the isManaged field is set.
     */
    @java.lang.Override
    public boolean hasIsManaged() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional bool is_managed = 1;</code>
     * @return The isManaged.
     */
    @java.lang.Override
    public boolean getIsManaged() {
      return isManaged_;
    }
    /**
     * <code>optional bool is_managed = 1;</code>
     * @param value The isManaged to set.
     * @return This builder for chaining.
     */
    public Builder setIsManaged(boolean value) {
      bitField0_ |= 0x00000001;
      isManaged_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool is_managed = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsManaged() {
      bitField0_ = (bitField0_ & ~0x00000001);
      isManaged_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object version_ = "";
    /**
     * <code>optional string version = 2;</code>
     * @return Whether the version field is set.
     */
    public boolean hasVersion() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string version = 2;</code>
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          version_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string version = 2;</code>
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string version = 2;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string version = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      bitField0_ = (bitField0_ & ~0x00000002);
      version_ = getDefaultInstance().getVersion();
      onChanged();
      return this;
    }
    /**
     * <code>optional string version = 2;</code>
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      version_ = value;
      onChanged();
      return this;
    }

    private int mdnsBackend_ = 0;
    /**
     * <code>optional .android_studio.AdbServerState.MDNDBackend mdns_backend = 3;</code>
     * @return Whether the mdnsBackend field is set.
     */
    @java.lang.Override public boolean hasMdnsBackend() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional .android_studio.AdbServerState.MDNDBackend mdns_backend = 3;</code>
     * @return The mdnsBackend.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.AdbServerState.MDNDBackend getMdnsBackend() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.AdbServerState.MDNDBackend result = com.google.wireless.android.sdk.stats.AdbServerState.MDNDBackend.valueOf(mdnsBackend_);
      return result == null ? com.google.wireless.android.sdk.stats.AdbServerState.MDNDBackend.TYPE_MDNS_UNKNOWN : result;
    }
    /**
     * <code>optional .android_studio.AdbServerState.MDNDBackend mdns_backend = 3;</code>
     * @param value The mdnsBackend to set.
     * @return This builder for chaining.
     */
    public Builder setMdnsBackend(com.google.wireless.android.sdk.stats.AdbServerState.MDNDBackend value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      mdnsBackend_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .android_studio.AdbServerState.MDNDBackend mdns_backend = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMdnsBackend() {
      bitField0_ = (bitField0_ & ~0x00000004);
      mdnsBackend_ = 0;
      onChanged();
      return this;
    }

    private int usbBackend_ = 0;
    /**
     * <code>optional .android_studio.AdbServerState.USBBackend usb_backend = 4;</code>
     * @return Whether the usbBackend field is set.
     */
    @java.lang.Override public boolean hasUsbBackend() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional .android_studio.AdbServerState.USBBackend usb_backend = 4;</code>
     * @return The usbBackend.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.AdbServerState.USBBackend getUsbBackend() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.AdbServerState.USBBackend result = com.google.wireless.android.sdk.stats.AdbServerState.USBBackend.valueOf(usbBackend_);
      return result == null ? com.google.wireless.android.sdk.stats.AdbServerState.USBBackend.TYPE_USB_UNKNOWN : result;
    }
    /**
     * <code>optional .android_studio.AdbServerState.USBBackend usb_backend = 4;</code>
     * @param value The usbBackend to set.
     * @return This builder for chaining.
     */
    public Builder setUsbBackend(com.google.wireless.android.sdk.stats.AdbServerState.USBBackend value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      usbBackend_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .android_studio.AdbServerState.USBBackend usb_backend = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearUsbBackend() {
      bitField0_ = (bitField0_ & ~0x00000008);
      usbBackend_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.AdbServerState)
  }

  // @@protoc_insertion_point(class_scope:android_studio.AdbServerState)
  private static final com.google.wireless.android.sdk.stats.AdbServerState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.AdbServerState();
  }

  public static com.google.wireless.android.sdk.stats.AdbServerState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<AdbServerState>
      PARSER = new com.google.protobuf.AbstractParser<AdbServerState>() {
    @java.lang.Override
    public AdbServerState parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<AdbServerState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdbServerState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.AdbServerState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

