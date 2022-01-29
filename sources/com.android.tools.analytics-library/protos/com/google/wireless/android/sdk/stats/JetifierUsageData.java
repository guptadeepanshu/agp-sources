// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Data about jetifier usage in the project
 * </pre>
 *
 * Protobuf type {@code android_studio.JetifierUsageData}
 */
public  final class JetifierUsageData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.JetifierUsageData)
    JetifierUsageDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JetifierUsageData.newBuilder() to construct.
  private JetifierUsageData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JetifierUsageData() {
    jetifierUsageState_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JetifierUsageData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JetifierUsageData(
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
            com.google.wireless.android.sdk.stats.JetifierUsageData.JetifierUsageState value = com.google.wireless.android.sdk.stats.JetifierUsageData.JetifierUsageState.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(1, rawValue);
            } else {
              bitField0_ |= 0x00000001;
              jetifierUsageState_ = rawValue;
            }
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            numberOfLibrariesRequireJetifier_ = input.readInt32();
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_JetifierUsageData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_JetifierUsageData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.JetifierUsageData.class, com.google.wireless.android.sdk.stats.JetifierUsageData.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.JetifierUsageData.JetifierUsageState}
   */
  public enum JetifierUsageState
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_STATE = 0;</code>
     */
    UNKNOWN_STATE(0),
    /**
     * <code>JETIFIER_NOT_USED = 1;</code>
     */
    JETIFIER_NOT_USED(1),
    /**
     * <pre>
     * Jetifier is used in project
     * but no existing checkJetifier task results found
     * </pre>
     *
     * <code>JETIFIER_USED_CHECK_REQUIRED = 2;</code>
     */
    JETIFIER_USED_CHECK_REQUIRED(2),
    /**
     * <code>JETIFIER_CAN_BE_REMOVED = 3;</code>
     */
    JETIFIER_CAN_BE_REMOVED(3),
    /**
     * <code>JETIFIER_REQUIRED_FOR_LIBRARIES = 4;</code>
     */
    JETIFIER_REQUIRED_FOR_LIBRARIES(4),
    ;

    /**
     * <code>UNKNOWN_STATE = 0;</code>
     */
    public static final int UNKNOWN_STATE_VALUE = 0;
    /**
     * <code>JETIFIER_NOT_USED = 1;</code>
     */
    public static final int JETIFIER_NOT_USED_VALUE = 1;
    /**
     * <pre>
     * Jetifier is used in project
     * but no existing checkJetifier task results found
     * </pre>
     *
     * <code>JETIFIER_USED_CHECK_REQUIRED = 2;</code>
     */
    public static final int JETIFIER_USED_CHECK_REQUIRED_VALUE = 2;
    /**
     * <code>JETIFIER_CAN_BE_REMOVED = 3;</code>
     */
    public static final int JETIFIER_CAN_BE_REMOVED_VALUE = 3;
    /**
     * <code>JETIFIER_REQUIRED_FOR_LIBRARIES = 4;</code>
     */
    public static final int JETIFIER_REQUIRED_FOR_LIBRARIES_VALUE = 4;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static JetifierUsageState valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static JetifierUsageState forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_STATE;
        case 1: return JETIFIER_NOT_USED;
        case 2: return JETIFIER_USED_CHECK_REQUIRED;
        case 3: return JETIFIER_CAN_BE_REMOVED;
        case 4: return JETIFIER_REQUIRED_FOR_LIBRARIES;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<JetifierUsageState>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        JetifierUsageState> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<JetifierUsageState>() {
            public JetifierUsageState findValueByNumber(int number) {
              return JetifierUsageState.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.JetifierUsageData.getDescriptor().getEnumTypes().get(0);
    }

    private static final JetifierUsageState[] VALUES = values();

    public static JetifierUsageState valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private JetifierUsageState(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.JetifierUsageData.JetifierUsageState)
  }

  private int bitField0_;
  public static final int JETIFIER_USAGE_STATE_FIELD_NUMBER = 1;
  private int jetifierUsageState_;
  /**
   * <code>optional .android_studio.JetifierUsageData.JetifierUsageState jetifier_usage_state = 1;</code>
   * @return Whether the jetifierUsageState field is set.
   */
  public boolean hasJetifierUsageState() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .android_studio.JetifierUsageData.JetifierUsageState jetifier_usage_state = 1;</code>
   * @return The jetifierUsageState.
   */
  public com.google.wireless.android.sdk.stats.JetifierUsageData.JetifierUsageState getJetifierUsageState() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.JetifierUsageData.JetifierUsageState result = com.google.wireless.android.sdk.stats.JetifierUsageData.JetifierUsageState.valueOf(jetifierUsageState_);
    return result == null ? com.google.wireless.android.sdk.stats.JetifierUsageData.JetifierUsageState.UNKNOWN_STATE : result;
  }

  public static final int NUMBER_OF_LIBRARIES_REQUIRE_JETIFIER_FIELD_NUMBER = 2;
  private int numberOfLibrariesRequireJetifier_;
  /**
   * <pre>
   * Size of the libraries list found by checkJetifier task
   * </pre>
   *
   * <code>optional int32 number_of_libraries_require_jetifier = 2;</code>
   * @return Whether the numberOfLibrariesRequireJetifier field is set.
   */
  public boolean hasNumberOfLibrariesRequireJetifier() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Size of the libraries list found by checkJetifier task
   * </pre>
   *
   * <code>optional int32 number_of_libraries_require_jetifier = 2;</code>
   * @return The numberOfLibrariesRequireJetifier.
   */
  public int getNumberOfLibrariesRequireJetifier() {
    return numberOfLibrariesRequireJetifier_;
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
      output.writeEnum(1, jetifierUsageState_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(2, numberOfLibrariesRequireJetifier_);
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
        .computeEnumSize(1, jetifierUsageState_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, numberOfLibrariesRequireJetifier_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.JetifierUsageData)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.JetifierUsageData other = (com.google.wireless.android.sdk.stats.JetifierUsageData) obj;

    if (hasJetifierUsageState() != other.hasJetifierUsageState()) return false;
    if (hasJetifierUsageState()) {
      if (jetifierUsageState_ != other.jetifierUsageState_) return false;
    }
    if (hasNumberOfLibrariesRequireJetifier() != other.hasNumberOfLibrariesRequireJetifier()) return false;
    if (hasNumberOfLibrariesRequireJetifier()) {
      if (getNumberOfLibrariesRequireJetifier()
          != other.getNumberOfLibrariesRequireJetifier()) return false;
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
    if (hasJetifierUsageState()) {
      hash = (37 * hash) + JETIFIER_USAGE_STATE_FIELD_NUMBER;
      hash = (53 * hash) + jetifierUsageState_;
    }
    if (hasNumberOfLibrariesRequireJetifier()) {
      hash = (37 * hash) + NUMBER_OF_LIBRARIES_REQUIRE_JETIFIER_FIELD_NUMBER;
      hash = (53 * hash) + getNumberOfLibrariesRequireJetifier();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.JetifierUsageData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.JetifierUsageData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.JetifierUsageData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.JetifierUsageData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.JetifierUsageData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.JetifierUsageData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.JetifierUsageData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.JetifierUsageData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.JetifierUsageData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.JetifierUsageData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.JetifierUsageData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.JetifierUsageData parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.JetifierUsageData prototype) {
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
   * Data about jetifier usage in the project
   * </pre>
   *
   * Protobuf type {@code android_studio.JetifierUsageData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.JetifierUsageData)
      com.google.wireless.android.sdk.stats.JetifierUsageDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_JetifierUsageData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_JetifierUsageData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.JetifierUsageData.class, com.google.wireless.android.sdk.stats.JetifierUsageData.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.JetifierUsageData.newBuilder()
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
      jetifierUsageState_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      numberOfLibrariesRequireJetifier_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_JetifierUsageData_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.JetifierUsageData getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.JetifierUsageData.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.JetifierUsageData build() {
      com.google.wireless.android.sdk.stats.JetifierUsageData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.JetifierUsageData buildPartial() {
      com.google.wireless.android.sdk.stats.JetifierUsageData result = new com.google.wireless.android.sdk.stats.JetifierUsageData(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.jetifierUsageState_ = jetifierUsageState_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.numberOfLibrariesRequireJetifier_ = numberOfLibrariesRequireJetifier_;
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
      if (other instanceof com.google.wireless.android.sdk.stats.JetifierUsageData) {
        return mergeFrom((com.google.wireless.android.sdk.stats.JetifierUsageData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.JetifierUsageData other) {
      if (other == com.google.wireless.android.sdk.stats.JetifierUsageData.getDefaultInstance()) return this;
      if (other.hasJetifierUsageState()) {
        setJetifierUsageState(other.getJetifierUsageState());
      }
      if (other.hasNumberOfLibrariesRequireJetifier()) {
        setNumberOfLibrariesRequireJetifier(other.getNumberOfLibrariesRequireJetifier());
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
      com.google.wireless.android.sdk.stats.JetifierUsageData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.JetifierUsageData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int jetifierUsageState_ = 0;
    /**
     * <code>optional .android_studio.JetifierUsageData.JetifierUsageState jetifier_usage_state = 1;</code>
     * @return Whether the jetifierUsageState field is set.
     */
    public boolean hasJetifierUsageState() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .android_studio.JetifierUsageData.JetifierUsageState jetifier_usage_state = 1;</code>
     * @return The jetifierUsageState.
     */
    public com.google.wireless.android.sdk.stats.JetifierUsageData.JetifierUsageState getJetifierUsageState() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.JetifierUsageData.JetifierUsageState result = com.google.wireless.android.sdk.stats.JetifierUsageData.JetifierUsageState.valueOf(jetifierUsageState_);
      return result == null ? com.google.wireless.android.sdk.stats.JetifierUsageData.JetifierUsageState.UNKNOWN_STATE : result;
    }
    /**
     * <code>optional .android_studio.JetifierUsageData.JetifierUsageState jetifier_usage_state = 1;</code>
     * @param value The jetifierUsageState to set.
     * @return This builder for chaining.
     */
    public Builder setJetifierUsageState(com.google.wireless.android.sdk.stats.JetifierUsageData.JetifierUsageState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      jetifierUsageState_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .android_studio.JetifierUsageData.JetifierUsageState jetifier_usage_state = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJetifierUsageState() {
      bitField0_ = (bitField0_ & ~0x00000001);
      jetifierUsageState_ = 0;
      onChanged();
      return this;
    }

    private int numberOfLibrariesRequireJetifier_ ;
    /**
     * <pre>
     * Size of the libraries list found by checkJetifier task
     * </pre>
     *
     * <code>optional int32 number_of_libraries_require_jetifier = 2;</code>
     * @return Whether the numberOfLibrariesRequireJetifier field is set.
     */
    public boolean hasNumberOfLibrariesRequireJetifier() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Size of the libraries list found by checkJetifier task
     * </pre>
     *
     * <code>optional int32 number_of_libraries_require_jetifier = 2;</code>
     * @return The numberOfLibrariesRequireJetifier.
     */
    public int getNumberOfLibrariesRequireJetifier() {
      return numberOfLibrariesRequireJetifier_;
    }
    /**
     * <pre>
     * Size of the libraries list found by checkJetifier task
     * </pre>
     *
     * <code>optional int32 number_of_libraries_require_jetifier = 2;</code>
     * @param value The numberOfLibrariesRequireJetifier to set.
     * @return This builder for chaining.
     */
    public Builder setNumberOfLibrariesRequireJetifier(int value) {
      bitField0_ |= 0x00000002;
      numberOfLibrariesRequireJetifier_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Size of the libraries list found by checkJetifier task
     * </pre>
     *
     * <code>optional int32 number_of_libraries_require_jetifier = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumberOfLibrariesRequireJetifier() {
      bitField0_ = (bitField0_ & ~0x00000002);
      numberOfLibrariesRequireJetifier_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.JetifierUsageData)
  }

  // @@protoc_insertion_point(class_scope:android_studio.JetifierUsageData)
  private static final com.google.wireless.android.sdk.stats.JetifierUsageData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.JetifierUsageData();
  }

  public static com.google.wireless.android.sdk.stats.JetifierUsageData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<JetifierUsageData>
      PARSER = new com.google.protobuf.AbstractParser<JetifierUsageData>() {
    @java.lang.Override
    public JetifierUsageData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JetifierUsageData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JetifierUsageData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JetifierUsageData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.JetifierUsageData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

