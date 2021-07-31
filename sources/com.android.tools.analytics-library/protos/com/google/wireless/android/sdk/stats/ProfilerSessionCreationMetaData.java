// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Metadata associated with how users are starting sessions in the profilers
 * </pre>
 *
 * Protobuf type {@code android_studio.ProfilerSessionCreationMetaData}
 */
public  final class ProfilerSessionCreationMetaData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.ProfilerSessionCreationMetaData)
    ProfilerSessionCreationMetaDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProfilerSessionCreationMetaData.newBuilder() to construct.
  private ProfilerSessionCreationMetaData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProfilerSessionCreationMetaData() {
    createdType_ = 0;
    creationSource_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProfilerSessionCreationMetaData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProfilerSessionCreationMetaData(
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
            com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.SessionType value = com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.SessionType.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(1, rawValue);
            } else {
              bitField0_ |= 0x00000001;
              createdType_ = rawValue;
            }
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
              @SuppressWarnings("deprecation")
            com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.CreationSource value = com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.CreationSource.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(2, rawValue);
            } else {
              bitField0_ |= 0x00000002;
              creationSource_ = rawValue;
            }
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ProfilerSessionCreationMetaData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ProfilerSessionCreationMetaData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.class, com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.ProfilerSessionCreationMetaData.SessionType}
   */
  public enum SessionType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_SESSION = 0;</code>
     */
    UNKNOWN_SESSION(0),
    /**
     * <code>FULL_SESSION = 1;</code>
     */
    FULL_SESSION(1),
    /**
     * <code>MEMORY_CAPTURE = 2;</code>
     */
    MEMORY_CAPTURE(2),
    /**
     * <code>CPU_CAPTURE = 3;</code>
     */
    CPU_CAPTURE(3),
    ;

    /**
     * <code>UNKNOWN_SESSION = 0;</code>
     */
    public static final int UNKNOWN_SESSION_VALUE = 0;
    /**
     * <code>FULL_SESSION = 1;</code>
     */
    public static final int FULL_SESSION_VALUE = 1;
    /**
     * <code>MEMORY_CAPTURE = 2;</code>
     */
    public static final int MEMORY_CAPTURE_VALUE = 2;
    /**
     * <code>CPU_CAPTURE = 3;</code>
     */
    public static final int CPU_CAPTURE_VALUE = 3;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SessionType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static SessionType forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_SESSION;
        case 1: return FULL_SESSION;
        case 2: return MEMORY_CAPTURE;
        case 3: return CPU_CAPTURE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SessionType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        SessionType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SessionType>() {
            public SessionType findValueByNumber(int number) {
              return SessionType.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.getDescriptor().getEnumTypes().get(0);
    }

    private static final SessionType[] VALUES = values();

    public static SessionType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private SessionType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.ProfilerSessionCreationMetaData.SessionType)
  }

  /**
   * Protobuf enum {@code android_studio.ProfilerSessionCreationMetaData.CreationSource}
   */
  public enum CreationSource
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_SOURCE = 0;</code>
     */
    UNKNOWN_SOURCE(0),
    /**
     * <pre>
     * The user manually selects a process or imports an existing capture file.
     * </pre>
     *
     * <code>MANUAL = 1;</code>
     */
    MANUAL(1),
    ;

    /**
     * <code>UNKNOWN_SOURCE = 0;</code>
     */
    public static final int UNKNOWN_SOURCE_VALUE = 0;
    /**
     * <pre>
     * The user manually selects a process or imports an existing capture file.
     * </pre>
     *
     * <code>MANUAL = 1;</code>
     */
    public static final int MANUAL_VALUE = 1;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CreationSource valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CreationSource forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_SOURCE;
        case 1: return MANUAL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CreationSource>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CreationSource> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CreationSource>() {
            public CreationSource findValueByNumber(int number) {
              return CreationSource.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.getDescriptor().getEnumTypes().get(1);
    }

    private static final CreationSource[] VALUES = values();

    public static CreationSource valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private CreationSource(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.ProfilerSessionCreationMetaData.CreationSource)
  }

  private int bitField0_;
  public static final int CREATED_TYPE_FIELD_NUMBER = 1;
  private int createdType_;
  /**
   * <pre>
   * The type of session created
   * </pre>
   *
   * <code>optional .android_studio.ProfilerSessionCreationMetaData.SessionType created_type = 1;</code>
   * @return Whether the createdType field is set.
   */
  public boolean hasCreatedType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The type of session created
   * </pre>
   *
   * <code>optional .android_studio.ProfilerSessionCreationMetaData.SessionType created_type = 1;</code>
   * @return The createdType.
   */
  public com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.SessionType getCreatedType() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.SessionType result = com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.SessionType.valueOf(createdType_);
    return result == null ? com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.SessionType.UNKNOWN_SESSION : result;
  }

  public static final int CREATION_SOURCE_FIELD_NUMBER = 2;
  private int creationSource_;
  /**
   * <pre>
   * How the session is created.
   * </pre>
   *
   * <code>optional .android_studio.ProfilerSessionCreationMetaData.CreationSource creation_source = 2;</code>
   * @return Whether the creationSource field is set.
   */
  public boolean hasCreationSource() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * How the session is created.
   * </pre>
   *
   * <code>optional .android_studio.ProfilerSessionCreationMetaData.CreationSource creation_source = 2;</code>
   * @return The creationSource.
   */
  public com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.CreationSource getCreationSource() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.CreationSource result = com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.CreationSource.valueOf(creationSource_);
    return result == null ? com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.CreationSource.UNKNOWN_SOURCE : result;
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
      output.writeEnum(1, createdType_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeEnum(2, creationSource_);
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
        .computeEnumSize(1, createdType_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, creationSource_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData other = (com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData) obj;

    if (hasCreatedType() != other.hasCreatedType()) return false;
    if (hasCreatedType()) {
      if (createdType_ != other.createdType_) return false;
    }
    if (hasCreationSource() != other.hasCreationSource()) return false;
    if (hasCreationSource()) {
      if (creationSource_ != other.creationSource_) return false;
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
    if (hasCreatedType()) {
      hash = (37 * hash) + CREATED_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + createdType_;
    }
    if (hasCreationSource()) {
      hash = (37 * hash) + CREATION_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + creationSource_;
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData prototype) {
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
   * Metadata associated with how users are starting sessions in the profilers
   * </pre>
   *
   * Protobuf type {@code android_studio.ProfilerSessionCreationMetaData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.ProfilerSessionCreationMetaData)
      com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ProfilerSessionCreationMetaData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ProfilerSessionCreationMetaData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.class, com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.newBuilder()
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
      createdType_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      creationSource_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ProfilerSessionCreationMetaData_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData build() {
      com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData buildPartial() {
      com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData result = new com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.createdType_ = createdType_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.creationSource_ = creationSource_;
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
      if (other instanceof com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData) {
        return mergeFrom((com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData other) {
      if (other == com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.getDefaultInstance()) return this;
      if (other.hasCreatedType()) {
        setCreatedType(other.getCreatedType());
      }
      if (other.hasCreationSource()) {
        setCreationSource(other.getCreationSource());
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
      com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int createdType_ = 0;
    /**
     * <pre>
     * The type of session created
     * </pre>
     *
     * <code>optional .android_studio.ProfilerSessionCreationMetaData.SessionType created_type = 1;</code>
     * @return Whether the createdType field is set.
     */
    public boolean hasCreatedType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The type of session created
     * </pre>
     *
     * <code>optional .android_studio.ProfilerSessionCreationMetaData.SessionType created_type = 1;</code>
     * @return The createdType.
     */
    public com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.SessionType getCreatedType() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.SessionType result = com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.SessionType.valueOf(createdType_);
      return result == null ? com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.SessionType.UNKNOWN_SESSION : result;
    }
    /**
     * <pre>
     * The type of session created
     * </pre>
     *
     * <code>optional .android_studio.ProfilerSessionCreationMetaData.SessionType created_type = 1;</code>
     * @param value The createdType to set.
     * @return This builder for chaining.
     */
    public Builder setCreatedType(com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.SessionType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      createdType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of session created
     * </pre>
     *
     * <code>optional .android_studio.ProfilerSessionCreationMetaData.SessionType created_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCreatedType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      createdType_ = 0;
      onChanged();
      return this;
    }

    private int creationSource_ = 0;
    /**
     * <pre>
     * How the session is created.
     * </pre>
     *
     * <code>optional .android_studio.ProfilerSessionCreationMetaData.CreationSource creation_source = 2;</code>
     * @return Whether the creationSource field is set.
     */
    public boolean hasCreationSource() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * How the session is created.
     * </pre>
     *
     * <code>optional .android_studio.ProfilerSessionCreationMetaData.CreationSource creation_source = 2;</code>
     * @return The creationSource.
     */
    public com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.CreationSource getCreationSource() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.CreationSource result = com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.CreationSource.valueOf(creationSource_);
      return result == null ? com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.CreationSource.UNKNOWN_SOURCE : result;
    }
    /**
     * <pre>
     * How the session is created.
     * </pre>
     *
     * <code>optional .android_studio.ProfilerSessionCreationMetaData.CreationSource creation_source = 2;</code>
     * @param value The creationSource to set.
     * @return This builder for chaining.
     */
    public Builder setCreationSource(com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData.CreationSource value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      creationSource_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * How the session is created.
     * </pre>
     *
     * <code>optional .android_studio.ProfilerSessionCreationMetaData.CreationSource creation_source = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCreationSource() {
      bitField0_ = (bitField0_ & ~0x00000002);
      creationSource_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.ProfilerSessionCreationMetaData)
  }

  // @@protoc_insertion_point(class_scope:android_studio.ProfilerSessionCreationMetaData)
  private static final com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData();
  }

  public static com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ProfilerSessionCreationMetaData>
      PARSER = new com.google.protobuf.AbstractParser<ProfilerSessionCreationMetaData>() {
    @java.lang.Override
    public ProfilerSessionCreationMetaData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProfilerSessionCreationMetaData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProfilerSessionCreationMetaData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProfilerSessionCreationMetaData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.ProfilerSessionCreationMetaData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

