// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * Protobuf type {@code android_studio.EditorNotification}
 */
public final class EditorNotification extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.EditorNotification)
    EditorNotificationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EditorNotification.newBuilder() to construct.
  private EditorNotification(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EditorNotification() {
    notificationType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EditorNotification();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EditorNotification_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EditorNotification_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.EditorNotification.class, com.google.wireless.android.sdk.stats.EditorNotification.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.EditorNotification.NotificationType}
   */
  public enum NotificationType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>ESSENTIALS_MODE = 1;</code>
     */
    ESSENTIALS_MODE(1),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>ESSENTIALS_MODE = 1;</code>
     */
    public static final int ESSENTIALS_MODE_VALUE = 1;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static NotificationType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static NotificationType forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return ESSENTIALS_MODE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<NotificationType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        NotificationType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<NotificationType>() {
            public NotificationType findValueByNumber(int number) {
              return NotificationType.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.EditorNotification.getDescriptor().getEnumTypes().get(0);
    }

    private static final NotificationType[] VALUES = values();

    public static NotificationType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private NotificationType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.EditorNotification.NotificationType)
  }

  private int bitField0_;
  public static final int NOTIFICATION_TYPE_FIELD_NUMBER = 1;
  private int notificationType_ = 0;
  /**
   * <pre>
   * The type of notification being displayed to the user
   * </pre>
   *
   * <code>optional .android_studio.EditorNotification.NotificationType notification_type = 1;</code>
   * @return Whether the notificationType field is set.
   */
  @java.lang.Override public boolean hasNotificationType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The type of notification being displayed to the user
   * </pre>
   *
   * <code>optional .android_studio.EditorNotification.NotificationType notification_type = 1;</code>
   * @return The notificationType.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.EditorNotification.NotificationType getNotificationType() {
    com.google.wireless.android.sdk.stats.EditorNotification.NotificationType result = com.google.wireless.android.sdk.stats.EditorNotification.NotificationType.forNumber(notificationType_);
    return result == null ? com.google.wireless.android.sdk.stats.EditorNotification.NotificationType.UNKNOWN : result;
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
      output.writeEnum(1, notificationType_);
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
        .computeEnumSize(1, notificationType_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.EditorNotification)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.EditorNotification other = (com.google.wireless.android.sdk.stats.EditorNotification) obj;

    if (hasNotificationType() != other.hasNotificationType()) return false;
    if (hasNotificationType()) {
      if (notificationType_ != other.notificationType_) return false;
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
    if (hasNotificationType()) {
      hash = (37 * hash) + NOTIFICATION_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + notificationType_;
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.EditorNotification parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.EditorNotification parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EditorNotification parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.EditorNotification parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EditorNotification parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.EditorNotification parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EditorNotification parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.EditorNotification parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EditorNotification parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.EditorNotification parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EditorNotification parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.EditorNotification parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.EditorNotification prototype) {
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
   * Protobuf type {@code android_studio.EditorNotification}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.EditorNotification)
      com.google.wireless.android.sdk.stats.EditorNotificationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EditorNotification_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EditorNotification_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.EditorNotification.class, com.google.wireless.android.sdk.stats.EditorNotification.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.EditorNotification.newBuilder()
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
      notificationType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EditorNotification_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.EditorNotification getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.EditorNotification.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.EditorNotification build() {
      com.google.wireless.android.sdk.stats.EditorNotification result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.EditorNotification buildPartial() {
      com.google.wireless.android.sdk.stats.EditorNotification result = new com.google.wireless.android.sdk.stats.EditorNotification(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.wireless.android.sdk.stats.EditorNotification result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.notificationType_ = notificationType_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.wireless.android.sdk.stats.EditorNotification) {
        return mergeFrom((com.google.wireless.android.sdk.stats.EditorNotification)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.EditorNotification other) {
      if (other == com.google.wireless.android.sdk.stats.EditorNotification.getDefaultInstance()) return this;
      if (other.hasNotificationType()) {
        setNotificationType(other.getNotificationType());
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
              com.google.wireless.android.sdk.stats.EditorNotification.NotificationType tmpValue =
                  com.google.wireless.android.sdk.stats.EditorNotification.NotificationType.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(1, tmpRaw);
              } else {
                notificationType_ = tmpRaw;
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

    private int notificationType_ = 0;
    /**
     * <pre>
     * The type of notification being displayed to the user
     * </pre>
     *
     * <code>optional .android_studio.EditorNotification.NotificationType notification_type = 1;</code>
     * @return Whether the notificationType field is set.
     */
    @java.lang.Override public boolean hasNotificationType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The type of notification being displayed to the user
     * </pre>
     *
     * <code>optional .android_studio.EditorNotification.NotificationType notification_type = 1;</code>
     * @return The notificationType.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.EditorNotification.NotificationType getNotificationType() {
      com.google.wireless.android.sdk.stats.EditorNotification.NotificationType result = com.google.wireless.android.sdk.stats.EditorNotification.NotificationType.forNumber(notificationType_);
      return result == null ? com.google.wireless.android.sdk.stats.EditorNotification.NotificationType.UNKNOWN : result;
    }
    /**
     * <pre>
     * The type of notification being displayed to the user
     * </pre>
     *
     * <code>optional .android_studio.EditorNotification.NotificationType notification_type = 1;</code>
     * @param value The notificationType to set.
     * @return This builder for chaining.
     */
    public Builder setNotificationType(com.google.wireless.android.sdk.stats.EditorNotification.NotificationType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      notificationType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of notification being displayed to the user
     * </pre>
     *
     * <code>optional .android_studio.EditorNotification.NotificationType notification_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNotificationType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      notificationType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.EditorNotification)
  }

  // @@protoc_insertion_point(class_scope:android_studio.EditorNotification)
  private static final com.google.wireless.android.sdk.stats.EditorNotification DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.EditorNotification();
  }

  public static com.google.wireless.android.sdk.stats.EditorNotification getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<EditorNotification>
      PARSER = new com.google.protobuf.AbstractParser<EditorNotification>() {
    @java.lang.Override
    public EditorNotification parsePartialFrom(
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

  public static com.google.protobuf.Parser<EditorNotification> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EditorNotification> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.EditorNotification getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

