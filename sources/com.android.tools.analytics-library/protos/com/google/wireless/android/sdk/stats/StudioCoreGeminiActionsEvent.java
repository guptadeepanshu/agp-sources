// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * Protobuf type {@code android_studio.StudioCoreGeminiActionsEvent}
 */
public final class StudioCoreGeminiActionsEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.StudioCoreGeminiActionsEvent)
    StudioCoreGeminiActionsEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StudioCoreGeminiActionsEvent.newBuilder() to construct.
  private StudioCoreGeminiActionsEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StudioCoreGeminiActionsEvent() {
    action_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StudioCoreGeminiActionsEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_StudioCoreGeminiActionsEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_StudioCoreGeminiActionsEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent.class, com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.StudioCoreGeminiActionsEvent.Action}
   */
  public enum Action
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>RENAME_VARIABLE = 1;</code>
     */
    RENAME_VARIABLE(1),
    /**
     * <code>RETHINK_VARIABLE_NAMES = 2;</code>
     */
    RETHINK_VARIABLE_NAMES(2),
    /**
     * <code>SUGGEST_COMMIT_MESSAGE = 3;</code>
     */
    SUGGEST_COMMIT_MESSAGE(3),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>RENAME_VARIABLE = 1;</code>
     */
    public static final int RENAME_VARIABLE_VALUE = 1;
    /**
     * <code>RETHINK_VARIABLE_NAMES = 2;</code>
     */
    public static final int RETHINK_VARIABLE_NAMES_VALUE = 2;
    /**
     * <code>SUGGEST_COMMIT_MESSAGE = 3;</code>
     */
    public static final int SUGGEST_COMMIT_MESSAGE_VALUE = 3;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Action valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Action forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return RENAME_VARIABLE;
        case 2: return RETHINK_VARIABLE_NAMES;
        case 3: return SUGGEST_COMMIT_MESSAGE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Action>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Action> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Action>() {
            public Action findValueByNumber(int number) {
              return Action.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent.getDescriptor().getEnumTypes().get(0);
    }

    private static final Action[] VALUES = values();

    public static Action valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Action(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.StudioCoreGeminiActionsEvent.Action)
  }

  private int bitField0_;
  public static final int ACTION_FIELD_NUMBER = 1;
  private int action_;
  /**
   * <code>optional .android_studio.StudioCoreGeminiActionsEvent.Action action = 1;</code>
   * @return Whether the action field is set.
   */
  @java.lang.Override public boolean hasAction() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .android_studio.StudioCoreGeminiActionsEvent.Action action = 1;</code>
   * @return The action.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent.Action getAction() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent.Action result = com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent.Action.valueOf(action_);
    return result == null ? com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent.Action.UNKNOWN : result;
  }

  public static final int PROMPT_HASH_FIELD_NUMBER = 2;
  private int promptHash_;
  /**
   * <code>optional uint32 prompt_hash = 2;</code>
   * @return Whether the promptHash field is set.
   */
  @java.lang.Override
  public boolean hasPromptHash() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional uint32 prompt_hash = 2;</code>
   * @return The promptHash.
   */
  @java.lang.Override
  public int getPromptHash() {
    return promptHash_;
  }

  public static final int PROMPT_SIZE_FIELD_NUMBER = 3;
  private int promptSize_;
  /**
   * <code>optional uint32 prompt_size = 3;</code>
   * @return Whether the promptSize field is set.
   */
  @java.lang.Override
  public boolean hasPromptSize() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional uint32 prompt_size = 3;</code>
   * @return The promptSize.
   */
  @java.lang.Override
  public int getPromptSize() {
    return promptSize_;
  }

  public static final int LATENCY_MS_FIELD_NUMBER = 4;
  private int latencyMs_;
  /**
   * <code>optional uint32 latency_ms = 4;</code>
   * @return Whether the latencyMs field is set.
   */
  @java.lang.Override
  public boolean hasLatencyMs() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>optional uint32 latency_ms = 4;</code>
   * @return The latencyMs.
   */
  @java.lang.Override
  public int getLatencyMs() {
    return latencyMs_;
  }

  public static final int RESULTS_COUNT_FIELD_NUMBER = 5;
  private int resultsCount_;
  /**
   * <code>optional uint32 results_count = 5;</code>
   * @return Whether the resultsCount field is set.
   */
  @java.lang.Override
  public boolean hasResultsCount() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <code>optional uint32 results_count = 5;</code>
   * @return The resultsCount.
   */
  @java.lang.Override
  public int getResultsCount() {
    return resultsCount_;
  }

  public static final int RESULTS_TAKEN_FIELD_NUMBER = 6;
  private int resultsTaken_;
  /**
   * <code>optional uint32 results_taken = 6;</code>
   * @return Whether the resultsTaken field is set.
   */
  @java.lang.Override
  public boolean hasResultsTaken() {
    return ((bitField0_ & 0x00000020) != 0);
  }
  /**
   * <code>optional uint32 results_taken = 6;</code>
   * @return The resultsTaken.
   */
  @java.lang.Override
  public int getResultsTaken() {
    return resultsTaken_;
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
      output.writeEnum(1, action_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeUInt32(2, promptHash_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeUInt32(3, promptSize_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeUInt32(4, latencyMs_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      output.writeUInt32(5, resultsCount_);
    }
    if (((bitField0_ & 0x00000020) != 0)) {
      output.writeUInt32(6, resultsTaken_);
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
        .computeEnumSize(1, action_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, promptHash_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, promptSize_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, latencyMs_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, resultsCount_);
    }
    if (((bitField0_ & 0x00000020) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, resultsTaken_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent other = (com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent) obj;

    if (hasAction() != other.hasAction()) return false;
    if (hasAction()) {
      if (action_ != other.action_) return false;
    }
    if (hasPromptHash() != other.hasPromptHash()) return false;
    if (hasPromptHash()) {
      if (getPromptHash()
          != other.getPromptHash()) return false;
    }
    if (hasPromptSize() != other.hasPromptSize()) return false;
    if (hasPromptSize()) {
      if (getPromptSize()
          != other.getPromptSize()) return false;
    }
    if (hasLatencyMs() != other.hasLatencyMs()) return false;
    if (hasLatencyMs()) {
      if (getLatencyMs()
          != other.getLatencyMs()) return false;
    }
    if (hasResultsCount() != other.hasResultsCount()) return false;
    if (hasResultsCount()) {
      if (getResultsCount()
          != other.getResultsCount()) return false;
    }
    if (hasResultsTaken() != other.hasResultsTaken()) return false;
    if (hasResultsTaken()) {
      if (getResultsTaken()
          != other.getResultsTaken()) return false;
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
    if (hasAction()) {
      hash = (37 * hash) + ACTION_FIELD_NUMBER;
      hash = (53 * hash) + action_;
    }
    if (hasPromptHash()) {
      hash = (37 * hash) + PROMPT_HASH_FIELD_NUMBER;
      hash = (53 * hash) + getPromptHash();
    }
    if (hasPromptSize()) {
      hash = (37 * hash) + PROMPT_SIZE_FIELD_NUMBER;
      hash = (53 * hash) + getPromptSize();
    }
    if (hasLatencyMs()) {
      hash = (37 * hash) + LATENCY_MS_FIELD_NUMBER;
      hash = (53 * hash) + getLatencyMs();
    }
    if (hasResultsCount()) {
      hash = (37 * hash) + RESULTS_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getResultsCount();
    }
    if (hasResultsTaken()) {
      hash = (37 * hash) + RESULTS_TAKEN_FIELD_NUMBER;
      hash = (53 * hash) + getResultsTaken();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent prototype) {
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
   * Protobuf type {@code android_studio.StudioCoreGeminiActionsEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.StudioCoreGeminiActionsEvent)
      com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_StudioCoreGeminiActionsEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_StudioCoreGeminiActionsEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent.class, com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      action_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      promptHash_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      promptSize_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      latencyMs_ = 0;
      bitField0_ = (bitField0_ & ~0x00000008);
      resultsCount_ = 0;
      bitField0_ = (bitField0_ & ~0x00000010);
      resultsTaken_ = 0;
      bitField0_ = (bitField0_ & ~0x00000020);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_StudioCoreGeminiActionsEvent_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent build() {
      com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent buildPartial() {
      com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent result = new com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.action_ = action_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.promptHash_ = promptHash_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.promptSize_ = promptSize_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.latencyMs_ = latencyMs_;
        to_bitField0_ |= 0x00000008;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.resultsCount_ = resultsCount_;
        to_bitField0_ |= 0x00000010;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.resultsTaken_ = resultsTaken_;
        to_bitField0_ |= 0x00000020;
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
      if (other instanceof com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent) {
        return mergeFrom((com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent other) {
      if (other == com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent.getDefaultInstance()) return this;
      if (other.hasAction()) {
        setAction(other.getAction());
      }
      if (other.hasPromptHash()) {
        setPromptHash(other.getPromptHash());
      }
      if (other.hasPromptSize()) {
        setPromptSize(other.getPromptSize());
      }
      if (other.hasLatencyMs()) {
        setLatencyMs(other.getLatencyMs());
      }
      if (other.hasResultsCount()) {
        setResultsCount(other.getResultsCount());
      }
      if (other.hasResultsTaken()) {
        setResultsTaken(other.getResultsTaken());
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
              com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent.Action tmpValue =
                  com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent.Action.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(1, tmpRaw);
              } else {
                action_ = tmpRaw;
                bitField0_ |= 0x00000001;
              }
              break;
            } // case 8
            case 16: {
              promptHash_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              promptSize_ = input.readUInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              latencyMs_ = input.readUInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              resultsCount_ = input.readUInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              resultsTaken_ = input.readUInt32();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
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

    private int action_ = 0;
    /**
     * <code>optional .android_studio.StudioCoreGeminiActionsEvent.Action action = 1;</code>
     * @return Whether the action field is set.
     */
    @java.lang.Override public boolean hasAction() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .android_studio.StudioCoreGeminiActionsEvent.Action action = 1;</code>
     * @return The action.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent.Action getAction() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent.Action result = com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent.Action.valueOf(action_);
      return result == null ? com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent.Action.UNKNOWN : result;
    }
    /**
     * <code>optional .android_studio.StudioCoreGeminiActionsEvent.Action action = 1;</code>
     * @param value The action to set.
     * @return This builder for chaining.
     */
    public Builder setAction(com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent.Action value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      action_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .android_studio.StudioCoreGeminiActionsEvent.Action action = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAction() {
      bitField0_ = (bitField0_ & ~0x00000001);
      action_ = 0;
      onChanged();
      return this;
    }

    private int promptHash_ ;
    /**
     * <code>optional uint32 prompt_hash = 2;</code>
     * @return Whether the promptHash field is set.
     */
    @java.lang.Override
    public boolean hasPromptHash() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional uint32 prompt_hash = 2;</code>
     * @return The promptHash.
     */
    @java.lang.Override
    public int getPromptHash() {
      return promptHash_;
    }
    /**
     * <code>optional uint32 prompt_hash = 2;</code>
     * @param value The promptHash to set.
     * @return This builder for chaining.
     */
    public Builder setPromptHash(int value) {
      bitField0_ |= 0x00000002;
      promptHash_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 prompt_hash = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPromptHash() {
      bitField0_ = (bitField0_ & ~0x00000002);
      promptHash_ = 0;
      onChanged();
      return this;
    }

    private int promptSize_ ;
    /**
     * <code>optional uint32 prompt_size = 3;</code>
     * @return Whether the promptSize field is set.
     */
    @java.lang.Override
    public boolean hasPromptSize() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional uint32 prompt_size = 3;</code>
     * @return The promptSize.
     */
    @java.lang.Override
    public int getPromptSize() {
      return promptSize_;
    }
    /**
     * <code>optional uint32 prompt_size = 3;</code>
     * @param value The promptSize to set.
     * @return This builder for chaining.
     */
    public Builder setPromptSize(int value) {
      bitField0_ |= 0x00000004;
      promptSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 prompt_size = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPromptSize() {
      bitField0_ = (bitField0_ & ~0x00000004);
      promptSize_ = 0;
      onChanged();
      return this;
    }

    private int latencyMs_ ;
    /**
     * <code>optional uint32 latency_ms = 4;</code>
     * @return Whether the latencyMs field is set.
     */
    @java.lang.Override
    public boolean hasLatencyMs() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional uint32 latency_ms = 4;</code>
     * @return The latencyMs.
     */
    @java.lang.Override
    public int getLatencyMs() {
      return latencyMs_;
    }
    /**
     * <code>optional uint32 latency_ms = 4;</code>
     * @param value The latencyMs to set.
     * @return This builder for chaining.
     */
    public Builder setLatencyMs(int value) {
      bitField0_ |= 0x00000008;
      latencyMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 latency_ms = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLatencyMs() {
      bitField0_ = (bitField0_ & ~0x00000008);
      latencyMs_ = 0;
      onChanged();
      return this;
    }

    private int resultsCount_ ;
    /**
     * <code>optional uint32 results_count = 5;</code>
     * @return Whether the resultsCount field is set.
     */
    @java.lang.Override
    public boolean hasResultsCount() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>optional uint32 results_count = 5;</code>
     * @return The resultsCount.
     */
    @java.lang.Override
    public int getResultsCount() {
      return resultsCount_;
    }
    /**
     * <code>optional uint32 results_count = 5;</code>
     * @param value The resultsCount to set.
     * @return This builder for chaining.
     */
    public Builder setResultsCount(int value) {
      bitField0_ |= 0x00000010;
      resultsCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 results_count = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearResultsCount() {
      bitField0_ = (bitField0_ & ~0x00000010);
      resultsCount_ = 0;
      onChanged();
      return this;
    }

    private int resultsTaken_ ;
    /**
     * <code>optional uint32 results_taken = 6;</code>
     * @return Whether the resultsTaken field is set.
     */
    @java.lang.Override
    public boolean hasResultsTaken() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <code>optional uint32 results_taken = 6;</code>
     * @return The resultsTaken.
     */
    @java.lang.Override
    public int getResultsTaken() {
      return resultsTaken_;
    }
    /**
     * <code>optional uint32 results_taken = 6;</code>
     * @param value The resultsTaken to set.
     * @return This builder for chaining.
     */
    public Builder setResultsTaken(int value) {
      bitField0_ |= 0x00000020;
      resultsTaken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 results_taken = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearResultsTaken() {
      bitField0_ = (bitField0_ & ~0x00000020);
      resultsTaken_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.StudioCoreGeminiActionsEvent)
  }

  // @@protoc_insertion_point(class_scope:android_studio.StudioCoreGeminiActionsEvent)
  private static final com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent();
  }

  public static com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<StudioCoreGeminiActionsEvent>
      PARSER = new com.google.protobuf.AbstractParser<StudioCoreGeminiActionsEvent>() {
    @java.lang.Override
    public StudioCoreGeminiActionsEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<StudioCoreGeminiActionsEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StudioCoreGeminiActionsEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

