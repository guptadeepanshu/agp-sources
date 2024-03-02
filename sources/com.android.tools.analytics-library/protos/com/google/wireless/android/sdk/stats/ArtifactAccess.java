// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Record of a single public artifact access through the public variant API.
 * </pre>
 *
 * Protobuf type {@code android_studio.ArtifactAccess}
 */
public final class ArtifactAccess extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.ArtifactAccess)
    ArtifactAccessOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ArtifactAccess.newBuilder() to construct.
  private ArtifactAccess(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ArtifactAccess() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ArtifactAccess();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ArtifactAccess_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ArtifactAccess_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.ArtifactAccess.class, com.google.wireless.android.sdk.stats.ArtifactAccess.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.ArtifactAccess.AccessType}
   */
  public enum AccessType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_ACCESS_TYPE = 0;</code>
     */
    UNKNOWN_ACCESS_TYPE(0),
    /**
     * <code>GET = 1;</code>
     */
    GET(1),
    /**
     * <code>GET_ALL = 2;</code>
     */
    GET_ALL(2),
    /**
     * <code>CREATE = 3;</code>
     */
    CREATE(3),
    /**
     * <code>APPEND = 4;</code>
     */
    APPEND(4),
    /**
     * <code>TRANSFORM = 5;</code>
     */
    TRANSFORM(5),
    /**
     * <code>TRANSFORM_MANY = 6;</code>
     */
    TRANSFORM_MANY(6),
    ;

    /**
     * <code>UNKNOWN_ACCESS_TYPE = 0;</code>
     */
    public static final int UNKNOWN_ACCESS_TYPE_VALUE = 0;
    /**
     * <code>GET = 1;</code>
     */
    public static final int GET_VALUE = 1;
    /**
     * <code>GET_ALL = 2;</code>
     */
    public static final int GET_ALL_VALUE = 2;
    /**
     * <code>CREATE = 3;</code>
     */
    public static final int CREATE_VALUE = 3;
    /**
     * <code>APPEND = 4;</code>
     */
    public static final int APPEND_VALUE = 4;
    /**
     * <code>TRANSFORM = 5;</code>
     */
    public static final int TRANSFORM_VALUE = 5;
    /**
     * <code>TRANSFORM_MANY = 6;</code>
     */
    public static final int TRANSFORM_MANY_VALUE = 6;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AccessType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AccessType forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_ACCESS_TYPE;
        case 1: return GET;
        case 2: return GET_ALL;
        case 3: return CREATE;
        case 4: return APPEND;
        case 5: return TRANSFORM;
        case 6: return TRANSFORM_MANY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AccessType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AccessType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AccessType>() {
            public AccessType findValueByNumber(int number) {
              return AccessType.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.ArtifactAccess.getDescriptor().getEnumTypes().get(0);
    }

    private static final AccessType[] VALUES = values();

    public static AccessType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AccessType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.ArtifactAccess.AccessType)
  }

  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <pre>
   * Identification of the type of artifact access.
   * </pre>
   *
   * <code>optional .android_studio.ArtifactAccess.AccessType type = 1;</code>
   * @return Whether the type field is set.
   */
  @java.lang.Override public boolean hasType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Identification of the type of artifact access.
   * </pre>
   *
   * <code>optional .android_studio.ArtifactAccess.AccessType type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.ArtifactAccess.AccessType getType() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.ArtifactAccess.AccessType result = com.google.wireless.android.sdk.stats.ArtifactAccess.AccessType.valueOf(type_);
    return result == null ? com.google.wireless.android.sdk.stats.ArtifactAccess.AccessType.UNKNOWN_ACCESS_TYPE : result;
  }

  public static final int INPUT_ARTIFACT_TYPE_FIELD_NUMBER = 2;
  private int inputArtifactType_;
  /**
   * <pre>
   * The artifact type used as an input (read).
   * This is an enum in android git:
   * tools/analytics-library/protos/src/main/proto/analytics_enums.proto
   * will only be set when type == TRANSFORM_MANY
   * </pre>
   *
   * <code>optional int32 input_artifact_type = 2;</code>
   * @return Whether the inputArtifactType field is set.
   */
  @java.lang.Override
  public boolean hasInputArtifactType() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The artifact type used as an input (read).
   * This is an enum in android git:
   * tools/analytics-library/protos/src/main/proto/analytics_enums.proto
   * will only be set when type == TRANSFORM_MANY
   * </pre>
   *
   * <code>optional int32 input_artifact_type = 2;</code>
   * @return The inputArtifactType.
   */
  @java.lang.Override
  public int getInputArtifactType() {
    return inputArtifactType_;
  }

  public static final int OUTPUT_ARTIFACT_TYPE_FIELD_NUMBER = 3;
  private int outputArtifactType_;
  /**
   * <pre>
   * The artifact type used as an output.
   * This is an enum in android git:
   * tools/analytics-library/protos/src/main/proto/analytics_enums.proto
   * </pre>
   *
   * <code>optional int32 output_artifact_type = 3;</code>
   * @return Whether the outputArtifactType field is set.
   */
  @java.lang.Override
  public boolean hasOutputArtifactType() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * The artifact type used as an output.
   * This is an enum in android git:
   * tools/analytics-library/protos/src/main/proto/analytics_enums.proto
   * </pre>
   *
   * <code>optional int32 output_artifact_type = 3;</code>
   * @return The outputArtifactType.
   */
  @java.lang.Override
  public int getOutputArtifactType() {
    return outputArtifactType_;
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
      output.writeEnum(1, type_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(2, inputArtifactType_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(3, outputArtifactType_);
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
        .computeEnumSize(1, type_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, inputArtifactType_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, outputArtifactType_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.ArtifactAccess)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.ArtifactAccess other = (com.google.wireless.android.sdk.stats.ArtifactAccess) obj;

    if (hasType() != other.hasType()) return false;
    if (hasType()) {
      if (type_ != other.type_) return false;
    }
    if (hasInputArtifactType() != other.hasInputArtifactType()) return false;
    if (hasInputArtifactType()) {
      if (getInputArtifactType()
          != other.getInputArtifactType()) return false;
    }
    if (hasOutputArtifactType() != other.hasOutputArtifactType()) return false;
    if (hasOutputArtifactType()) {
      if (getOutputArtifactType()
          != other.getOutputArtifactType()) return false;
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
    if (hasType()) {
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
    }
    if (hasInputArtifactType()) {
      hash = (37 * hash) + INPUT_ARTIFACT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getInputArtifactType();
    }
    if (hasOutputArtifactType()) {
      hash = (37 * hash) + OUTPUT_ARTIFACT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getOutputArtifactType();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.ArtifactAccess parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ArtifactAccess parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ArtifactAccess parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ArtifactAccess parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ArtifactAccess parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ArtifactAccess parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ArtifactAccess parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ArtifactAccess parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ArtifactAccess parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ArtifactAccess parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ArtifactAccess parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ArtifactAccess parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.ArtifactAccess prototype) {
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
   * Record of a single public artifact access through the public variant API.
   * </pre>
   *
   * Protobuf type {@code android_studio.ArtifactAccess}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.ArtifactAccess)
      com.google.wireless.android.sdk.stats.ArtifactAccessOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ArtifactAccess_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ArtifactAccess_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.ArtifactAccess.class, com.google.wireless.android.sdk.stats.ArtifactAccess.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.ArtifactAccess.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      type_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      inputArtifactType_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      outputArtifactType_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ArtifactAccess_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ArtifactAccess getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.ArtifactAccess.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ArtifactAccess build() {
      com.google.wireless.android.sdk.stats.ArtifactAccess result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ArtifactAccess buildPartial() {
      com.google.wireless.android.sdk.stats.ArtifactAccess result = new com.google.wireless.android.sdk.stats.ArtifactAccess(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.type_ = type_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.inputArtifactType_ = inputArtifactType_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.outputArtifactType_ = outputArtifactType_;
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof com.google.wireless.android.sdk.stats.ArtifactAccess) {
        return mergeFrom((com.google.wireless.android.sdk.stats.ArtifactAccess)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.ArtifactAccess other) {
      if (other == com.google.wireless.android.sdk.stats.ArtifactAccess.getDefaultInstance()) return this;
      if (other.hasType()) {
        setType(other.getType());
      }
      if (other.hasInputArtifactType()) {
        setInputArtifactType(other.getInputArtifactType());
      }
      if (other.hasOutputArtifactType()) {
        setOutputArtifactType(other.getOutputArtifactType());
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
              com.google.wireless.android.sdk.stats.ArtifactAccess.AccessType tmpValue =
                  com.google.wireless.android.sdk.stats.ArtifactAccess.AccessType.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(1, tmpRaw);
              } else {
                type_ = tmpRaw;
                bitField0_ |= 0x00000001;
              }
              break;
            } // case 8
            case 16: {
              inputArtifactType_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              outputArtifactType_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private int type_ = 0;
    /**
     * <pre>
     * Identification of the type of artifact access.
     * </pre>
     *
     * <code>optional .android_studio.ArtifactAccess.AccessType type = 1;</code>
     * @return Whether the type field is set.
     */
    @java.lang.Override public boolean hasType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Identification of the type of artifact access.
     * </pre>
     *
     * <code>optional .android_studio.ArtifactAccess.AccessType type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ArtifactAccess.AccessType getType() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.ArtifactAccess.AccessType result = com.google.wireless.android.sdk.stats.ArtifactAccess.AccessType.valueOf(type_);
      return result == null ? com.google.wireless.android.sdk.stats.ArtifactAccess.AccessType.UNKNOWN_ACCESS_TYPE : result;
    }
    /**
     * <pre>
     * Identification of the type of artifact access.
     * </pre>
     *
     * <code>optional .android_studio.ArtifactAccess.AccessType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.wireless.android.sdk.stats.ArtifactAccess.AccessType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Identification of the type of artifact access.
     * </pre>
     *
     * <code>optional .android_studio.ArtifactAccess.AccessType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private int inputArtifactType_ ;
    /**
     * <pre>
     * The artifact type used as an input (read).
     * This is an enum in android git:
     * tools/analytics-library/protos/src/main/proto/analytics_enums.proto
     * will only be set when type == TRANSFORM_MANY
     * </pre>
     *
     * <code>optional int32 input_artifact_type = 2;</code>
     * @return Whether the inputArtifactType field is set.
     */
    @java.lang.Override
    public boolean hasInputArtifactType() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The artifact type used as an input (read).
     * This is an enum in android git:
     * tools/analytics-library/protos/src/main/proto/analytics_enums.proto
     * will only be set when type == TRANSFORM_MANY
     * </pre>
     *
     * <code>optional int32 input_artifact_type = 2;</code>
     * @return The inputArtifactType.
     */
    @java.lang.Override
    public int getInputArtifactType() {
      return inputArtifactType_;
    }
    /**
     * <pre>
     * The artifact type used as an input (read).
     * This is an enum in android git:
     * tools/analytics-library/protos/src/main/proto/analytics_enums.proto
     * will only be set when type == TRANSFORM_MANY
     * </pre>
     *
     * <code>optional int32 input_artifact_type = 2;</code>
     * @param value The inputArtifactType to set.
     * @return This builder for chaining.
     */
    public Builder setInputArtifactType(int value) {
      bitField0_ |= 0x00000002;
      inputArtifactType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The artifact type used as an input (read).
     * This is an enum in android git:
     * tools/analytics-library/protos/src/main/proto/analytics_enums.proto
     * will only be set when type == TRANSFORM_MANY
     * </pre>
     *
     * <code>optional int32 input_artifact_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearInputArtifactType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      inputArtifactType_ = 0;
      onChanged();
      return this;
    }

    private int outputArtifactType_ ;
    /**
     * <pre>
     * The artifact type used as an output.
     * This is an enum in android git:
     * tools/analytics-library/protos/src/main/proto/analytics_enums.proto
     * </pre>
     *
     * <code>optional int32 output_artifact_type = 3;</code>
     * @return Whether the outputArtifactType field is set.
     */
    @java.lang.Override
    public boolean hasOutputArtifactType() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The artifact type used as an output.
     * This is an enum in android git:
     * tools/analytics-library/protos/src/main/proto/analytics_enums.proto
     * </pre>
     *
     * <code>optional int32 output_artifact_type = 3;</code>
     * @return The outputArtifactType.
     */
    @java.lang.Override
    public int getOutputArtifactType() {
      return outputArtifactType_;
    }
    /**
     * <pre>
     * The artifact type used as an output.
     * This is an enum in android git:
     * tools/analytics-library/protos/src/main/proto/analytics_enums.proto
     * </pre>
     *
     * <code>optional int32 output_artifact_type = 3;</code>
     * @param value The outputArtifactType to set.
     * @return This builder for chaining.
     */
    public Builder setOutputArtifactType(int value) {
      bitField0_ |= 0x00000004;
      outputArtifactType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The artifact type used as an output.
     * This is an enum in android git:
     * tools/analytics-library/protos/src/main/proto/analytics_enums.proto
     * </pre>
     *
     * <code>optional int32 output_artifact_type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOutputArtifactType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      outputArtifactType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.ArtifactAccess)
  }

  // @@protoc_insertion_point(class_scope:android_studio.ArtifactAccess)
  private static final com.google.wireless.android.sdk.stats.ArtifactAccess DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.ArtifactAccess();
  }

  public static com.google.wireless.android.sdk.stats.ArtifactAccess getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ArtifactAccess>
      PARSER = new com.google.protobuf.AbstractParser<ArtifactAccess>() {
    @java.lang.Override
    public ArtifactAccess parsePartialFrom(
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

  public static com.google.protobuf.Parser<ArtifactAccess> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ArtifactAccess> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.ArtifactAccess getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

