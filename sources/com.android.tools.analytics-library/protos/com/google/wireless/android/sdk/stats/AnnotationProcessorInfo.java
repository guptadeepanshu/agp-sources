// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * Protobuf type {@code android_studio.AnnotationProcessorInfo}
 */
public  final class AnnotationProcessorInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.AnnotationProcessorInfo)
    AnnotationProcessorInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AnnotationProcessorInfo.newBuilder() to construct.
  private AnnotationProcessorInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AnnotationProcessorInfo() {
    spec_ = "";
    inclusionType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AnnotationProcessorInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AnnotationProcessorInfo(
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
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000001;
            spec_ = bs;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
              @SuppressWarnings("deprecation")
            com.google.wireless.android.sdk.stats.AnnotationProcessorInfo.InclusionType value = com.google.wireless.android.sdk.stats.AnnotationProcessorInfo.InclusionType.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(2, rawValue);
            } else {
              bitField0_ |= 0x00000002;
              inclusionType_ = rawValue;
            }
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            isIncremental_ = input.readBool();
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AnnotationProcessorInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AnnotationProcessorInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.AnnotationProcessorInfo.class, com.google.wireless.android.sdk.stats.AnnotationProcessorInfo.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.AnnotationProcessorInfo.InclusionType}
   */
  public enum InclusionType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * The old apt way of including them.
     * </pre>
     *
     * <code>APT = 0;</code>
     */
    APT(0),
    /**
     * <pre>
     * Implicit on the compile classpath.
     * </pre>
     *
     * <code>COMPILE_CLASSPATH = 1;</code>
     */
    COMPILE_CLASSPATH(1),
    /**
     * <pre>
     * The new annotationProcessor way to include them.
     * </pre>
     *
     * <code>ANNOTATION_PROCESSOR = 2;</code>
     */
    ANNOTATION_PROCESSOR(2),
    ;

    /**
     * <pre>
     * The old apt way of including them.
     * </pre>
     *
     * <code>APT = 0;</code>
     */
    public static final int APT_VALUE = 0;
    /**
     * <pre>
     * Implicit on the compile classpath.
     * </pre>
     *
     * <code>COMPILE_CLASSPATH = 1;</code>
     */
    public static final int COMPILE_CLASSPATH_VALUE = 1;
    /**
     * <pre>
     * The new annotationProcessor way to include them.
     * </pre>
     *
     * <code>ANNOTATION_PROCESSOR = 2;</code>
     */
    public static final int ANNOTATION_PROCESSOR_VALUE = 2;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static InclusionType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static InclusionType forNumber(int value) {
      switch (value) {
        case 0: return APT;
        case 1: return COMPILE_CLASSPATH;
        case 2: return ANNOTATION_PROCESSOR;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<InclusionType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        InclusionType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<InclusionType>() {
            public InclusionType findValueByNumber(int number) {
              return InclusionType.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.AnnotationProcessorInfo.getDescriptor().getEnumTypes().get(0);
    }

    private static final InclusionType[] VALUES = values();

    public static InclusionType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private InclusionType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.AnnotationProcessorInfo.InclusionType)
  }

  private int bitField0_;
  public static final int SPEC_FIELD_NUMBER = 1;
  private volatile java.lang.Object spec_;
  /**
   * <pre>
   * The user's original spec, e.g. 'org.immutables:value:2.4.4'
   * Often, though not always, in the form 'package:name:version'.
   * </pre>
   *
   * <code>optional string spec = 1;</code>
   * @return Whether the spec field is set.
   */
  public boolean hasSpec() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The user's original spec, e.g. 'org.immutables:value:2.4.4'
   * Often, though not always, in the form 'package:name:version'.
   * </pre>
   *
   * <code>optional string spec = 1;</code>
   * @return The spec.
   */
  public java.lang.String getSpec() {
    java.lang.Object ref = spec_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        spec_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * The user's original spec, e.g. 'org.immutables:value:2.4.4'
   * Often, though not always, in the form 'package:name:version'.
   * </pre>
   *
   * <code>optional string spec = 1;</code>
   * @return The bytes for spec.
   */
  public com.google.protobuf.ByteString
      getSpecBytes() {
    java.lang.Object ref = spec_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      spec_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INCLUSION_TYPE_FIELD_NUMBER = 2;
  private int inclusionType_;
  /**
   * <pre>
   * How the processor was included in the build file.
   * </pre>
   *
   * <code>optional .android_studio.AnnotationProcessorInfo.InclusionType inclusion_type = 2;</code>
   * @return Whether the inclusionType field is set.
   */
  public boolean hasInclusionType() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * How the processor was included in the build file.
   * </pre>
   *
   * <code>optional .android_studio.AnnotationProcessorInfo.InclusionType inclusion_type = 2;</code>
   * @return The inclusionType.
   */
  public com.google.wireless.android.sdk.stats.AnnotationProcessorInfo.InclusionType getInclusionType() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.AnnotationProcessorInfo.InclusionType result = com.google.wireless.android.sdk.stats.AnnotationProcessorInfo.InclusionType.valueOf(inclusionType_);
    return result == null ? com.google.wireless.android.sdk.stats.AnnotationProcessorInfo.InclusionType.APT : result;
  }

  public static final int IS_INCREMENTAL_FIELD_NUMBER = 3;
  private boolean isIncremental_;
  /**
   * <pre>
   * Whether the annotation processor is
   * incremental(isolating/aggregating/dynamic)
   * </pre>
   *
   * <code>optional bool is_incremental = 3;</code>
   * @return Whether the isIncremental field is set.
   */
  public boolean hasIsIncremental() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Whether the annotation processor is
   * incremental(isolating/aggregating/dynamic)
   * </pre>
   *
   * <code>optional bool is_incremental = 3;</code>
   * @return The isIncremental.
   */
  public boolean getIsIncremental() {
    return isIncremental_;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, spec_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeEnum(2, inclusionType_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeBool(3, isIncremental_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, spec_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, inclusionType_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isIncremental_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.AnnotationProcessorInfo)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.AnnotationProcessorInfo other = (com.google.wireless.android.sdk.stats.AnnotationProcessorInfo) obj;

    if (hasSpec() != other.hasSpec()) return false;
    if (hasSpec()) {
      if (!getSpec()
          .equals(other.getSpec())) return false;
    }
    if (hasInclusionType() != other.hasInclusionType()) return false;
    if (hasInclusionType()) {
      if (inclusionType_ != other.inclusionType_) return false;
    }
    if (hasIsIncremental() != other.hasIsIncremental()) return false;
    if (hasIsIncremental()) {
      if (getIsIncremental()
          != other.getIsIncremental()) return false;
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
    if (hasSpec()) {
      hash = (37 * hash) + SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getSpec().hashCode();
    }
    if (hasInclusionType()) {
      hash = (37 * hash) + INCLUSION_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + inclusionType_;
    }
    if (hasIsIncremental()) {
      hash = (37 * hash) + IS_INCREMENTAL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsIncremental());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.AnnotationProcessorInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.AnnotationProcessorInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AnnotationProcessorInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.AnnotationProcessorInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AnnotationProcessorInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.AnnotationProcessorInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AnnotationProcessorInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.AnnotationProcessorInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AnnotationProcessorInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.AnnotationProcessorInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AnnotationProcessorInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.AnnotationProcessorInfo parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.AnnotationProcessorInfo prototype) {
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
   * Protobuf type {@code android_studio.AnnotationProcessorInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.AnnotationProcessorInfo)
      com.google.wireless.android.sdk.stats.AnnotationProcessorInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AnnotationProcessorInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AnnotationProcessorInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.AnnotationProcessorInfo.class, com.google.wireless.android.sdk.stats.AnnotationProcessorInfo.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.AnnotationProcessorInfo.newBuilder()
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
      spec_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      inclusionType_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      isIncremental_ = false;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AnnotationProcessorInfo_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.AnnotationProcessorInfo getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.AnnotationProcessorInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.AnnotationProcessorInfo build() {
      com.google.wireless.android.sdk.stats.AnnotationProcessorInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.AnnotationProcessorInfo buildPartial() {
      com.google.wireless.android.sdk.stats.AnnotationProcessorInfo result = new com.google.wireless.android.sdk.stats.AnnotationProcessorInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.spec_ = spec_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.inclusionType_ = inclusionType_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.isIncremental_ = isIncremental_;
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
      if (other instanceof com.google.wireless.android.sdk.stats.AnnotationProcessorInfo) {
        return mergeFrom((com.google.wireless.android.sdk.stats.AnnotationProcessorInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.AnnotationProcessorInfo other) {
      if (other == com.google.wireless.android.sdk.stats.AnnotationProcessorInfo.getDefaultInstance()) return this;
      if (other.hasSpec()) {
        bitField0_ |= 0x00000001;
        spec_ = other.spec_;
        onChanged();
      }
      if (other.hasInclusionType()) {
        setInclusionType(other.getInclusionType());
      }
      if (other.hasIsIncremental()) {
        setIsIncremental(other.getIsIncremental());
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
      com.google.wireless.android.sdk.stats.AnnotationProcessorInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.AnnotationProcessorInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object spec_ = "";
    /**
     * <pre>
     * The user's original spec, e.g. 'org.immutables:value:2.4.4'
     * Often, though not always, in the form 'package:name:version'.
     * </pre>
     *
     * <code>optional string spec = 1;</code>
     * @return Whether the spec field is set.
     */
    public boolean hasSpec() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The user's original spec, e.g. 'org.immutables:value:2.4.4'
     * Often, though not always, in the form 'package:name:version'.
     * </pre>
     *
     * <code>optional string spec = 1;</code>
     * @return The spec.
     */
    public java.lang.String getSpec() {
      java.lang.Object ref = spec_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          spec_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The user's original spec, e.g. 'org.immutables:value:2.4.4'
     * Often, though not always, in the form 'package:name:version'.
     * </pre>
     *
     * <code>optional string spec = 1;</code>
     * @return The bytes for spec.
     */
    public com.google.protobuf.ByteString
        getSpecBytes() {
      java.lang.Object ref = spec_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        spec_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The user's original spec, e.g. 'org.immutables:value:2.4.4'
     * Often, though not always, in the form 'package:name:version'.
     * </pre>
     *
     * <code>optional string spec = 1;</code>
     * @param value The spec to set.
     * @return This builder for chaining.
     */
    public Builder setSpec(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      spec_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The user's original spec, e.g. 'org.immutables:value:2.4.4'
     * Often, though not always, in the form 'package:name:version'.
     * </pre>
     *
     * <code>optional string spec = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpec() {
      bitField0_ = (bitField0_ & ~0x00000001);
      spec_ = getDefaultInstance().getSpec();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The user's original spec, e.g. 'org.immutables:value:2.4.4'
     * Often, though not always, in the form 'package:name:version'.
     * </pre>
     *
     * <code>optional string spec = 1;</code>
     * @param value The bytes for spec to set.
     * @return This builder for chaining.
     */
    public Builder setSpecBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      spec_ = value;
      onChanged();
      return this;
    }

    private int inclusionType_ = 0;
    /**
     * <pre>
     * How the processor was included in the build file.
     * </pre>
     *
     * <code>optional .android_studio.AnnotationProcessorInfo.InclusionType inclusion_type = 2;</code>
     * @return Whether the inclusionType field is set.
     */
    public boolean hasInclusionType() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * How the processor was included in the build file.
     * </pre>
     *
     * <code>optional .android_studio.AnnotationProcessorInfo.InclusionType inclusion_type = 2;</code>
     * @return The inclusionType.
     */
    public com.google.wireless.android.sdk.stats.AnnotationProcessorInfo.InclusionType getInclusionType() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.AnnotationProcessorInfo.InclusionType result = com.google.wireless.android.sdk.stats.AnnotationProcessorInfo.InclusionType.valueOf(inclusionType_);
      return result == null ? com.google.wireless.android.sdk.stats.AnnotationProcessorInfo.InclusionType.APT : result;
    }
    /**
     * <pre>
     * How the processor was included in the build file.
     * </pre>
     *
     * <code>optional .android_studio.AnnotationProcessorInfo.InclusionType inclusion_type = 2;</code>
     * @param value The inclusionType to set.
     * @return This builder for chaining.
     */
    public Builder setInclusionType(com.google.wireless.android.sdk.stats.AnnotationProcessorInfo.InclusionType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      inclusionType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * How the processor was included in the build file.
     * </pre>
     *
     * <code>optional .android_studio.AnnotationProcessorInfo.InclusionType inclusion_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearInclusionType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      inclusionType_ = 0;
      onChanged();
      return this;
    }

    private boolean isIncremental_ ;
    /**
     * <pre>
     * Whether the annotation processor is
     * incremental(isolating/aggregating/dynamic)
     * </pre>
     *
     * <code>optional bool is_incremental = 3;</code>
     * @return Whether the isIncremental field is set.
     */
    public boolean hasIsIncremental() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Whether the annotation processor is
     * incremental(isolating/aggregating/dynamic)
     * </pre>
     *
     * <code>optional bool is_incremental = 3;</code>
     * @return The isIncremental.
     */
    public boolean getIsIncremental() {
      return isIncremental_;
    }
    /**
     * <pre>
     * Whether the annotation processor is
     * incremental(isolating/aggregating/dynamic)
     * </pre>
     *
     * <code>optional bool is_incremental = 3;</code>
     * @param value The isIncremental to set.
     * @return This builder for chaining.
     */
    public Builder setIsIncremental(boolean value) {
      bitField0_ |= 0x00000004;
      isIncremental_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether the annotation processor is
     * incremental(isolating/aggregating/dynamic)
     * </pre>
     *
     * <code>optional bool is_incremental = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsIncremental() {
      bitField0_ = (bitField0_ & ~0x00000004);
      isIncremental_ = false;
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


    // @@protoc_insertion_point(builder_scope:android_studio.AnnotationProcessorInfo)
  }

  // @@protoc_insertion_point(class_scope:android_studio.AnnotationProcessorInfo)
  private static final com.google.wireless.android.sdk.stats.AnnotationProcessorInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.AnnotationProcessorInfo();
  }

  public static com.google.wireless.android.sdk.stats.AnnotationProcessorInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<AnnotationProcessorInfo>
      PARSER = new com.google.protobuf.AbstractParser<AnnotationProcessorInfo>() {
    @java.lang.Override
    public AnnotationProcessorInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AnnotationProcessorInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AnnotationProcessorInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnnotationProcessorInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.AnnotationProcessorInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

