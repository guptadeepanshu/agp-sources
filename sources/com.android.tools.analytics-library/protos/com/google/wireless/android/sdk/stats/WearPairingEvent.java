// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Event related to Wear OS emulator pairing assistant
 * </pre>
 *
 * Protobuf type {@code android_studio.WearPairingEvent}
 */
public final class WearPairingEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.WearPairingEvent)
    WearPairingEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WearPairingEvent.newBuilder() to construct.
  private WearPairingEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WearPairingEvent() {
    kind_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WearPairingEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_WearPairingEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_WearPairingEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.WearPairingEvent.class, com.google.wireless.android.sdk.stats.WearPairingEvent.Builder.class);
  }

  /**
   * <pre>
   * The kind of WearPairingEvent
   * </pre>
   *
   * Protobuf enum {@code android_studio.WearPairingEvent.EventKind}
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
     * Assistant was launched with no pre-selected device (ie two columns)
     * </pre>
     *
     * <code>SHOW_ASSISTANT_FULL_SELECTION = 1;</code>
     */
    SHOW_ASSISTANT_FULL_SELECTION(1),
    /**
     * <pre>
     * Assistant was launched with a pre-selected device (ie single column)
     * </pre>
     *
     * <code>SHOW_ASSISTANT_PRE_SELECTION = 2;</code>
     */
    SHOW_ASSISTANT_PRE_SELECTION(2),
    /**
     * <pre>
     * "Successful Pairing" screen is displayed
     * </pre>
     *
     * <code>SHOW_SUCCESSFUL_PAIRING = 3;</code>
     */
    SHOW_SUCCESSFUL_PAIRING(3),
    /**
     * <pre>
     * "Install Wear OS Companion" screen is displayed
     * </pre>
     *
     * <code>SHOW_INSTALL_WEAR_OS_COMPANION = 4;</code>
     */
    SHOW_INSTALL_WEAR_OS_COMPANION(4),
    /**
     * <pre>
     * Devices lost connection and then automatically reconnected
     * </pre>
     *
     * <code>AUTOMATIC_RECONNECT = 5;</code>
     */
    AUTOMATIC_RECONNECT(5),
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
     * Assistant was launched with no pre-selected device (ie two columns)
     * </pre>
     *
     * <code>SHOW_ASSISTANT_FULL_SELECTION = 1;</code>
     */
    public static final int SHOW_ASSISTANT_FULL_SELECTION_VALUE = 1;
    /**
     * <pre>
     * Assistant was launched with a pre-selected device (ie single column)
     * </pre>
     *
     * <code>SHOW_ASSISTANT_PRE_SELECTION = 2;</code>
     */
    public static final int SHOW_ASSISTANT_PRE_SELECTION_VALUE = 2;
    /**
     * <pre>
     * "Successful Pairing" screen is displayed
     * </pre>
     *
     * <code>SHOW_SUCCESSFUL_PAIRING = 3;</code>
     */
    public static final int SHOW_SUCCESSFUL_PAIRING_VALUE = 3;
    /**
     * <pre>
     * "Install Wear OS Companion" screen is displayed
     * </pre>
     *
     * <code>SHOW_INSTALL_WEAR_OS_COMPANION = 4;</code>
     */
    public static final int SHOW_INSTALL_WEAR_OS_COMPANION_VALUE = 4;
    /**
     * <pre>
     * Devices lost connection and then automatically reconnected
     * </pre>
     *
     * <code>AUTOMATIC_RECONNECT = 5;</code>
     */
    public static final int AUTOMATIC_RECONNECT_VALUE = 5;


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
        case 1: return SHOW_ASSISTANT_FULL_SELECTION;
        case 2: return SHOW_ASSISTANT_PRE_SELECTION;
        case 3: return SHOW_SUCCESSFUL_PAIRING;
        case 4: return SHOW_INSTALL_WEAR_OS_COMPANION;
        case 5: return AUTOMATIC_RECONNECT;
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
      return com.google.wireless.android.sdk.stats.WearPairingEvent.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:android_studio.WearPairingEvent.EventKind)
  }

  private int bitField0_;
  public static final int KIND_FIELD_NUMBER = 1;
  private int kind_ = 0;
  /**
   * <pre>
   * The kind of WearPairingEvent
   * </pre>
   *
   * <code>optional .android_studio.WearPairingEvent.EventKind kind = 1;</code>
   * @return Whether the kind field is set.
   */
  @java.lang.Override public boolean hasKind() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The kind of WearPairingEvent
   * </pre>
   *
   * <code>optional .android_studio.WearPairingEvent.EventKind kind = 1;</code>
   * @return The kind.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.WearPairingEvent.EventKind getKind() {
    com.google.wireless.android.sdk.stats.WearPairingEvent.EventKind result = com.google.wireless.android.sdk.stats.WearPairingEvent.EventKind.forNumber(kind_);
    return result == null ? com.google.wireless.android.sdk.stats.WearPairingEvent.EventKind.UNSPECIFIED : result;
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
    getUnknownFields().writeTo(output);
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
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.wireless.android.sdk.stats.WearPairingEvent)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.WearPairingEvent other = (com.google.wireless.android.sdk.stats.WearPairingEvent) obj;

    if (hasKind() != other.hasKind()) return false;
    if (hasKind()) {
      if (kind_ != other.kind_) return false;
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
    if (hasKind()) {
      hash = (37 * hash) + KIND_FIELD_NUMBER;
      hash = (53 * hash) + kind_;
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.WearPairingEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.WearPairingEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.WearPairingEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.WearPairingEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.WearPairingEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.WearPairingEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.WearPairingEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.WearPairingEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.WearPairingEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.WearPairingEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.WearPairingEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.WearPairingEvent parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.WearPairingEvent prototype) {
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
   * Event related to Wear OS emulator pairing assistant
   * </pre>
   *
   * Protobuf type {@code android_studio.WearPairingEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.WearPairingEvent)
      com.google.wireless.android.sdk.stats.WearPairingEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_WearPairingEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_WearPairingEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.WearPairingEvent.class, com.google.wireless.android.sdk.stats.WearPairingEvent.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.WearPairingEvent.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      kind_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_WearPairingEvent_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.WearPairingEvent getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.WearPairingEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.WearPairingEvent build() {
      com.google.wireless.android.sdk.stats.WearPairingEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.WearPairingEvent buildPartial() {
      com.google.wireless.android.sdk.stats.WearPairingEvent result = new com.google.wireless.android.sdk.stats.WearPairingEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.wireless.android.sdk.stats.WearPairingEvent result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.kind_ = kind_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.wireless.android.sdk.stats.WearPairingEvent) {
        return mergeFrom((com.google.wireless.android.sdk.stats.WearPairingEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.WearPairingEvent other) {
      if (other == com.google.wireless.android.sdk.stats.WearPairingEvent.getDefaultInstance()) return this;
      if (other.hasKind()) {
        setKind(other.getKind());
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
              int tmpRaw = input.readEnum();
              com.google.wireless.android.sdk.stats.WearPairingEvent.EventKind tmpValue =
                  com.google.wireless.android.sdk.stats.WearPairingEvent.EventKind.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(1, tmpRaw);
              } else {
                kind_ = tmpRaw;
                bitField0_ |= 0x00000001;
              }
              break;
            } // case 8
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

    private int kind_ = 0;
    /**
     * <pre>
     * The kind of WearPairingEvent
     * </pre>
     *
     * <code>optional .android_studio.WearPairingEvent.EventKind kind = 1;</code>
     * @return Whether the kind field is set.
     */
    @java.lang.Override public boolean hasKind() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The kind of WearPairingEvent
     * </pre>
     *
     * <code>optional .android_studio.WearPairingEvent.EventKind kind = 1;</code>
     * @return The kind.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.WearPairingEvent.EventKind getKind() {
      com.google.wireless.android.sdk.stats.WearPairingEvent.EventKind result = com.google.wireless.android.sdk.stats.WearPairingEvent.EventKind.forNumber(kind_);
      return result == null ? com.google.wireless.android.sdk.stats.WearPairingEvent.EventKind.UNSPECIFIED : result;
    }
    /**
     * <pre>
     * The kind of WearPairingEvent
     * </pre>
     *
     * <code>optional .android_studio.WearPairingEvent.EventKind kind = 1;</code>
     * @param value The kind to set.
     * @return This builder for chaining.
     */
    public Builder setKind(com.google.wireless.android.sdk.stats.WearPairingEvent.EventKind value) {
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
     * The kind of WearPairingEvent
     * </pre>
     *
     * <code>optional .android_studio.WearPairingEvent.EventKind kind = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKind() {
      bitField0_ = (bitField0_ & ~0x00000001);
      kind_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.WearPairingEvent)
  }

  // @@protoc_insertion_point(class_scope:android_studio.WearPairingEvent)
  private static final com.google.wireless.android.sdk.stats.WearPairingEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.WearPairingEvent();
  }

  public static com.google.wireless.android.sdk.stats.WearPairingEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<WearPairingEvent>
      PARSER = new com.google.protobuf.AbstractParser<WearPairingEvent>() {
    @java.lang.Override
    public WearPairingEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<WearPairingEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WearPairingEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.WearPairingEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

