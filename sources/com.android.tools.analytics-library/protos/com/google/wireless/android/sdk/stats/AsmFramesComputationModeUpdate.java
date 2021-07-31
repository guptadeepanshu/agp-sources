// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * An action to set the asm frames computation mode for the asm classes
 * transforms
 * </pre>
 *
 * Protobuf type {@code android_studio.AsmFramesComputationModeUpdate}
 */
public  final class AsmFramesComputationModeUpdate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.AsmFramesComputationModeUpdate)
    AsmFramesComputationModeUpdateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AsmFramesComputationModeUpdate.newBuilder() to construct.
  private AsmFramesComputationModeUpdate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AsmFramesComputationModeUpdate() {
    mode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AsmFramesComputationModeUpdate();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AsmFramesComputationModeUpdate(
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
            com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate.Mode value = com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate.Mode.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(1, rawValue);
            } else {
              bitField0_ |= 0x00000001;
              mode_ = rawValue;
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AsmFramesComputationModeUpdate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AsmFramesComputationModeUpdate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate.class, com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate.Builder.class);
  }

  /**
   * <pre>
   * List of frames computation modes
   * </pre>
   *
   * Protobuf enum {@code android_studio.AsmFramesComputationModeUpdate.Mode}
   */
  public enum Mode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_MODE = 0;</code>
     */
    UNKNOWN_MODE(0),
    /**
     * <code>COPY_FRAMES = 1;</code>
     */
    COPY_FRAMES(1),
    /**
     * <code>COMPUTE_FRAMES_FOR_INSTRUMENTED_METHODS = 2;</code>
     */
    COMPUTE_FRAMES_FOR_INSTRUMENTED_METHODS(2),
    /**
     * <code>COMPUTE_FRAMES_FOR_INSTRUMENTED_CLASSES = 3;</code>
     */
    COMPUTE_FRAMES_FOR_INSTRUMENTED_CLASSES(3),
    /**
     * <code>COMPUTE_FRAMES_FOR_ALL_CLASSES = 4;</code>
     */
    COMPUTE_FRAMES_FOR_ALL_CLASSES(4),
    ;

    /**
     * <code>UNKNOWN_MODE = 0;</code>
     */
    public static final int UNKNOWN_MODE_VALUE = 0;
    /**
     * <code>COPY_FRAMES = 1;</code>
     */
    public static final int COPY_FRAMES_VALUE = 1;
    /**
     * <code>COMPUTE_FRAMES_FOR_INSTRUMENTED_METHODS = 2;</code>
     */
    public static final int COMPUTE_FRAMES_FOR_INSTRUMENTED_METHODS_VALUE = 2;
    /**
     * <code>COMPUTE_FRAMES_FOR_INSTRUMENTED_CLASSES = 3;</code>
     */
    public static final int COMPUTE_FRAMES_FOR_INSTRUMENTED_CLASSES_VALUE = 3;
    /**
     * <code>COMPUTE_FRAMES_FOR_ALL_CLASSES = 4;</code>
     */
    public static final int COMPUTE_FRAMES_FOR_ALL_CLASSES_VALUE = 4;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Mode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Mode forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_MODE;
        case 1: return COPY_FRAMES;
        case 2: return COMPUTE_FRAMES_FOR_INSTRUMENTED_METHODS;
        case 3: return COMPUTE_FRAMES_FOR_INSTRUMENTED_CLASSES;
        case 4: return COMPUTE_FRAMES_FOR_ALL_CLASSES;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Mode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Mode> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Mode>() {
            public Mode findValueByNumber(int number) {
              return Mode.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate.getDescriptor().getEnumTypes().get(0);
    }

    private static final Mode[] VALUES = values();

    public static Mode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Mode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.AsmFramesComputationModeUpdate.Mode)
  }

  private int bitField0_;
  public static final int MODE_FIELD_NUMBER = 1;
  private int mode_;
  /**
   * <pre>
   * The requested frames computation mode
   * </pre>
   *
   * <code>optional .android_studio.AsmFramesComputationModeUpdate.Mode mode = 1;</code>
   * @return Whether the mode field is set.
   */
  public boolean hasMode() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The requested frames computation mode
   * </pre>
   *
   * <code>optional .android_studio.AsmFramesComputationModeUpdate.Mode mode = 1;</code>
   * @return The mode.
   */
  public com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate.Mode getMode() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate.Mode result = com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate.Mode.valueOf(mode_);
    return result == null ? com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate.Mode.UNKNOWN_MODE : result;
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
      output.writeEnum(1, mode_);
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
        .computeEnumSize(1, mode_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate other = (com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate) obj;

    if (hasMode() != other.hasMode()) return false;
    if (hasMode()) {
      if (mode_ != other.mode_) return false;
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
    if (hasMode()) {
      hash = (37 * hash) + MODE_FIELD_NUMBER;
      hash = (53 * hash) + mode_;
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate prototype) {
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
   * An action to set the asm frames computation mode for the asm classes
   * transforms
   * </pre>
   *
   * Protobuf type {@code android_studio.AsmFramesComputationModeUpdate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.AsmFramesComputationModeUpdate)
      com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AsmFramesComputationModeUpdate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AsmFramesComputationModeUpdate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate.class, com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate.newBuilder()
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
      mode_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_AsmFramesComputationModeUpdate_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate build() {
      com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate buildPartial() {
      com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate result = new com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.mode_ = mode_;
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
      if (other instanceof com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate) {
        return mergeFrom((com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate other) {
      if (other == com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate.getDefaultInstance()) return this;
      if (other.hasMode()) {
        setMode(other.getMode());
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
      com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int mode_ = 0;
    /**
     * <pre>
     * The requested frames computation mode
     * </pre>
     *
     * <code>optional .android_studio.AsmFramesComputationModeUpdate.Mode mode = 1;</code>
     * @return Whether the mode field is set.
     */
    public boolean hasMode() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The requested frames computation mode
     * </pre>
     *
     * <code>optional .android_studio.AsmFramesComputationModeUpdate.Mode mode = 1;</code>
     * @return The mode.
     */
    public com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate.Mode getMode() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate.Mode result = com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate.Mode.valueOf(mode_);
      return result == null ? com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate.Mode.UNKNOWN_MODE : result;
    }
    /**
     * <pre>
     * The requested frames computation mode
     * </pre>
     *
     * <code>optional .android_studio.AsmFramesComputationModeUpdate.Mode mode = 1;</code>
     * @param value The mode to set.
     * @return This builder for chaining.
     */
    public Builder setMode(com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate.Mode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      mode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The requested frames computation mode
     * </pre>
     *
     * <code>optional .android_studio.AsmFramesComputationModeUpdate.Mode mode = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      mode_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.AsmFramesComputationModeUpdate)
  }

  // @@protoc_insertion_point(class_scope:android_studio.AsmFramesComputationModeUpdate)
  private static final com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate();
  }

  public static com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<AsmFramesComputationModeUpdate>
      PARSER = new com.google.protobuf.AbstractParser<AsmFramesComputationModeUpdate>() {
    @java.lang.Override
    public AsmFramesComputationModeUpdate parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AsmFramesComputationModeUpdate(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AsmFramesComputationModeUpdate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AsmFramesComputationModeUpdate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.AsmFramesComputationModeUpdate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

