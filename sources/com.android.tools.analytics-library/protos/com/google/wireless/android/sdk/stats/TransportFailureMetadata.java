// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * Protobuf type {@code android_studio.TransportFailureMetadata}
 */
public final class TransportFailureMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.TransportFailureMetadata)
    TransportFailureMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TransportFailureMetadata.newBuilder() to construct.
  private TransportFailureMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TransportFailureMetadata() {
    failureType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TransportFailureMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_TransportFailureMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_TransportFailureMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.TransportFailureMetadata.class, com.google.wireless.android.sdk.stats.TransportFailureMetadata.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.TransportFailureMetadata.FailureType}
   */
  public enum FailureType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_FAILURE_TYPE = 0;</code>
     */
    UNKNOWN_FAILURE_TYPE(0),
    /**
     * <code>TIMEOUT = 1;</code>
     */
    TIMEOUT(1),
    /**
     * <code>INTERRUPTED = 2;</code>
     */
    INTERRUPTED(2),
    /**
     * <code>IO = 3;</code>
     */
    IO(3),
    /**
     * <code>SYNC = 4;</code>
     */
    SYNC(4),
    /**
     * <code>SHELL_COMMAND_UNRESPONSIVE = 5;</code>
     */
    SHELL_COMMAND_UNRESPONSIVE(5),
    /**
     * <code>ADB_COMMAND_REJECTED = 6;</code>
     */
    ADB_COMMAND_REJECTED(6),
    ;

    /**
     * <code>UNKNOWN_FAILURE_TYPE = 0;</code>
     */
    public static final int UNKNOWN_FAILURE_TYPE_VALUE = 0;
    /**
     * <code>TIMEOUT = 1;</code>
     */
    public static final int TIMEOUT_VALUE = 1;
    /**
     * <code>INTERRUPTED = 2;</code>
     */
    public static final int INTERRUPTED_VALUE = 2;
    /**
     * <code>IO = 3;</code>
     */
    public static final int IO_VALUE = 3;
    /**
     * <code>SYNC = 4;</code>
     */
    public static final int SYNC_VALUE = 4;
    /**
     * <code>SHELL_COMMAND_UNRESPONSIVE = 5;</code>
     */
    public static final int SHELL_COMMAND_UNRESPONSIVE_VALUE = 5;
    /**
     * <code>ADB_COMMAND_REJECTED = 6;</code>
     */
    public static final int ADB_COMMAND_REJECTED_VALUE = 6;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FailureType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static FailureType forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_FAILURE_TYPE;
        case 1: return TIMEOUT;
        case 2: return INTERRUPTED;
        case 3: return IO;
        case 4: return SYNC;
        case 5: return SHELL_COMMAND_UNRESPONSIVE;
        case 6: return ADB_COMMAND_REJECTED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FailureType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        FailureType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FailureType>() {
            public FailureType findValueByNumber(int number) {
              return FailureType.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.TransportFailureMetadata.getDescriptor().getEnumTypes().get(0);
    }

    private static final FailureType[] VALUES = values();

    public static FailureType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private FailureType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.TransportFailureMetadata.FailureType)
  }

  private int bitField0_;
  public static final int FAILURE_TYPE_FIELD_NUMBER = 1;
  private int failureType_ = 0;
  /**
   * <code>optional .android_studio.TransportFailureMetadata.FailureType failure_type = 1;</code>
   * @return Whether the failureType field is set.
   */
  @java.lang.Override public boolean hasFailureType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .android_studio.TransportFailureMetadata.FailureType failure_type = 1;</code>
   * @return The failureType.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.TransportFailureMetadata.FailureType getFailureType() {
    com.google.wireless.android.sdk.stats.TransportFailureMetadata.FailureType result = com.google.wireless.android.sdk.stats.TransportFailureMetadata.FailureType.forNumber(failureType_);
    return result == null ? com.google.wireless.android.sdk.stats.TransportFailureMetadata.FailureType.UNKNOWN_FAILURE_TYPE : result;
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
      output.writeEnum(1, failureType_);
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
        .computeEnumSize(1, failureType_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.TransportFailureMetadata)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.TransportFailureMetadata other = (com.google.wireless.android.sdk.stats.TransportFailureMetadata) obj;

    if (hasFailureType() != other.hasFailureType()) return false;
    if (hasFailureType()) {
      if (failureType_ != other.failureType_) return false;
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
    if (hasFailureType()) {
      hash = (37 * hash) + FAILURE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + failureType_;
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.TransportFailureMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.TransportFailureMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.TransportFailureMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.TransportFailureMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.TransportFailureMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.TransportFailureMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.TransportFailureMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.TransportFailureMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.TransportFailureMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.TransportFailureMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.TransportFailureMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.TransportFailureMetadata parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.TransportFailureMetadata prototype) {
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
   * Protobuf type {@code android_studio.TransportFailureMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.TransportFailureMetadata)
      com.google.wireless.android.sdk.stats.TransportFailureMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_TransportFailureMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_TransportFailureMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.TransportFailureMetadata.class, com.google.wireless.android.sdk.stats.TransportFailureMetadata.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.TransportFailureMetadata.newBuilder()
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
      failureType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_TransportFailureMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.TransportFailureMetadata getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.TransportFailureMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.TransportFailureMetadata build() {
      com.google.wireless.android.sdk.stats.TransportFailureMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.TransportFailureMetadata buildPartial() {
      com.google.wireless.android.sdk.stats.TransportFailureMetadata result = new com.google.wireless.android.sdk.stats.TransportFailureMetadata(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.wireless.android.sdk.stats.TransportFailureMetadata result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.failureType_ = failureType_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.wireless.android.sdk.stats.TransportFailureMetadata) {
        return mergeFrom((com.google.wireless.android.sdk.stats.TransportFailureMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.TransportFailureMetadata other) {
      if (other == com.google.wireless.android.sdk.stats.TransportFailureMetadata.getDefaultInstance()) return this;
      if (other.hasFailureType()) {
        setFailureType(other.getFailureType());
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
              com.google.wireless.android.sdk.stats.TransportFailureMetadata.FailureType tmpValue =
                  com.google.wireless.android.sdk.stats.TransportFailureMetadata.FailureType.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(1, tmpRaw);
              } else {
                failureType_ = tmpRaw;
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

    private int failureType_ = 0;
    /**
     * <code>optional .android_studio.TransportFailureMetadata.FailureType failure_type = 1;</code>
     * @return Whether the failureType field is set.
     */
    @java.lang.Override public boolean hasFailureType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .android_studio.TransportFailureMetadata.FailureType failure_type = 1;</code>
     * @return The failureType.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.TransportFailureMetadata.FailureType getFailureType() {
      com.google.wireless.android.sdk.stats.TransportFailureMetadata.FailureType result = com.google.wireless.android.sdk.stats.TransportFailureMetadata.FailureType.forNumber(failureType_);
      return result == null ? com.google.wireless.android.sdk.stats.TransportFailureMetadata.FailureType.UNKNOWN_FAILURE_TYPE : result;
    }
    /**
     * <code>optional .android_studio.TransportFailureMetadata.FailureType failure_type = 1;</code>
     * @param value The failureType to set.
     * @return This builder for chaining.
     */
    public Builder setFailureType(com.google.wireless.android.sdk.stats.TransportFailureMetadata.FailureType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      failureType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .android_studio.TransportFailureMetadata.FailureType failure_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFailureType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      failureType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.TransportFailureMetadata)
  }

  // @@protoc_insertion_point(class_scope:android_studio.TransportFailureMetadata)
  private static final com.google.wireless.android.sdk.stats.TransportFailureMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.TransportFailureMetadata();
  }

  public static com.google.wireless.android.sdk.stats.TransportFailureMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<TransportFailureMetadata>
      PARSER = new com.google.protobuf.AbstractParser<TransportFailureMetadata>() {
    @java.lang.Override
    public TransportFailureMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<TransportFailureMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransportFailureMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.TransportFailureMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

