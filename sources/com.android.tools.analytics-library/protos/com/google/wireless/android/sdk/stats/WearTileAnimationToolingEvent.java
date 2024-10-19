// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Details for Wear Tile animation tooling event
 * </pre>
 *
 * Protobuf type {@code android_studio.WearTileAnimationToolingEvent}
 */
public final class WearTileAnimationToolingEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.WearTileAnimationToolingEvent)
    WearTileAnimationToolingEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WearTileAnimationToolingEvent.newBuilder() to construct.
  private WearTileAnimationToolingEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WearTileAnimationToolingEvent() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WearTileAnimationToolingEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_WearTileAnimationToolingEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_WearTileAnimationToolingEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent.class, com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.WearTileAnimationToolingEvent.WearTileAnimationToolingEventType}
   */
  public enum WearTileAnimationToolingEventType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_EVENT_TYPE = 0;</code>
     */
    UNKNOWN_EVENT_TYPE(0),
    /**
     * <code>OPEN_ANIMATION_INSPECTOR = 1;</code>
     */
    OPEN_ANIMATION_INSPECTOR(1),
    /**
     * <code>CLOSE_ANIMATION_INSPECTOR = 2;</code>
     */
    CLOSE_ANIMATION_INSPECTOR(2),
    /**
     * <pre>
     * Track when the animation inspector is available for Wear Tile previews.
     * </pre>
     *
     * <code>ANIMATION_INSPECTOR_AVAILABLE = 3;</code>
     */
    ANIMATION_INSPECTOR_AVAILABLE(3),
    /**
     * <code>TRIGGER_PLAY_ACTION = 4;</code>
     */
    TRIGGER_PLAY_ACTION(4),
    /**
     * <code>TRIGGER_PAUSE_ACTION = 5;</code>
     */
    TRIGGER_PAUSE_ACTION(5),
    /**
     * <code>ENABLE_LOOP_ACTION = 6;</code>
     */
    ENABLE_LOOP_ACTION(6),
    /**
     * <code>DISABLE_LOOP_ACTION = 7;</code>
     */
    DISABLE_LOOP_ACTION(7),
    /**
     * <code>CHANGE_ANIMATION_SPEED = 8;</code>
     */
    CHANGE_ANIMATION_SPEED(8),
    /**
     * <code>TRIGGER_JUMP_TO_START_ACTION = 9;</code>
     */
    TRIGGER_JUMP_TO_START_ACTION(9),
    /**
     * <code>TRIGGER_JUMP_TO_END_ACTION = 10;</code>
     */
    TRIGGER_JUMP_TO_END_ACTION(10),
    /**
     * <code>CHANGE_START_STATE = 11;</code>
     */
    CHANGE_START_STATE(11),
    /**
     * <code>CHANGE_END_STATE = 12;</code>
     */
    CHANGE_END_STATE(12),
    /**
     * <code>TRIGGER_SWAP_STATES_ACTION = 13;</code>
     */
    TRIGGER_SWAP_STATES_ACTION(13),
    /**
     * <code>CLICK_ANIMATION_INSPECTOR_TIMELINE = 14;</code>
     */
    CLICK_ANIMATION_INSPECTOR_TIMELINE(14),
    /**
     * <code>DRAG_ANIMATION_INSPECTOR_TIMELINE = 15;</code>
     */
    DRAG_ANIMATION_INSPECTOR_TIMELINE(15),
    /**
     * <code>EXPAND_ANIMATION_CARD = 16;</code>
     */
    EXPAND_ANIMATION_CARD(16),
    /**
     * <code>COLLAPSE_ANIMATION_CARD = 17;</code>
     */
    COLLAPSE_ANIMATION_CARD(17),
    /**
     * <code>OPEN_ANIMATION_IN_TAB = 18;</code>
     */
    OPEN_ANIMATION_IN_TAB(18),
    /**
     * <code>CLOSE_ANIMATION_TAB = 19;</code>
     */
    CLOSE_ANIMATION_TAB(19),
    /**
     * <code>LOCK_ANIMATION = 20;</code>
     */
    LOCK_ANIMATION(20),
    /**
     * <code>UNLOCK_ANIMATION = 21;</code>
     */
    UNLOCK_ANIMATION(21),
    /**
     * <code>RESET_TIMELINE = 22;</code>
     */
    RESET_TIMELINE(22),
    /**
     * <code>DRAG_TIMELINE_LINE = 23;</code>
     */
    DRAG_TIMELINE_LINE(23),
    /**
     * <pre>
     * Open the picker to change the state of the animation.
     * </pre>
     *
     * <code>OPEN_PICKER = 24;</code>
     */
    OPEN_PICKER(24),
    ;

    /**
     * <code>UNKNOWN_EVENT_TYPE = 0;</code>
     */
    public static final int UNKNOWN_EVENT_TYPE_VALUE = 0;
    /**
     * <code>OPEN_ANIMATION_INSPECTOR = 1;</code>
     */
    public static final int OPEN_ANIMATION_INSPECTOR_VALUE = 1;
    /**
     * <code>CLOSE_ANIMATION_INSPECTOR = 2;</code>
     */
    public static final int CLOSE_ANIMATION_INSPECTOR_VALUE = 2;
    /**
     * <pre>
     * Track when the animation inspector is available for Wear Tile previews.
     * </pre>
     *
     * <code>ANIMATION_INSPECTOR_AVAILABLE = 3;</code>
     */
    public static final int ANIMATION_INSPECTOR_AVAILABLE_VALUE = 3;
    /**
     * <code>TRIGGER_PLAY_ACTION = 4;</code>
     */
    public static final int TRIGGER_PLAY_ACTION_VALUE = 4;
    /**
     * <code>TRIGGER_PAUSE_ACTION = 5;</code>
     */
    public static final int TRIGGER_PAUSE_ACTION_VALUE = 5;
    /**
     * <code>ENABLE_LOOP_ACTION = 6;</code>
     */
    public static final int ENABLE_LOOP_ACTION_VALUE = 6;
    /**
     * <code>DISABLE_LOOP_ACTION = 7;</code>
     */
    public static final int DISABLE_LOOP_ACTION_VALUE = 7;
    /**
     * <code>CHANGE_ANIMATION_SPEED = 8;</code>
     */
    public static final int CHANGE_ANIMATION_SPEED_VALUE = 8;
    /**
     * <code>TRIGGER_JUMP_TO_START_ACTION = 9;</code>
     */
    public static final int TRIGGER_JUMP_TO_START_ACTION_VALUE = 9;
    /**
     * <code>TRIGGER_JUMP_TO_END_ACTION = 10;</code>
     */
    public static final int TRIGGER_JUMP_TO_END_ACTION_VALUE = 10;
    /**
     * <code>CHANGE_START_STATE = 11;</code>
     */
    public static final int CHANGE_START_STATE_VALUE = 11;
    /**
     * <code>CHANGE_END_STATE = 12;</code>
     */
    public static final int CHANGE_END_STATE_VALUE = 12;
    /**
     * <code>TRIGGER_SWAP_STATES_ACTION = 13;</code>
     */
    public static final int TRIGGER_SWAP_STATES_ACTION_VALUE = 13;
    /**
     * <code>CLICK_ANIMATION_INSPECTOR_TIMELINE = 14;</code>
     */
    public static final int CLICK_ANIMATION_INSPECTOR_TIMELINE_VALUE = 14;
    /**
     * <code>DRAG_ANIMATION_INSPECTOR_TIMELINE = 15;</code>
     */
    public static final int DRAG_ANIMATION_INSPECTOR_TIMELINE_VALUE = 15;
    /**
     * <code>EXPAND_ANIMATION_CARD = 16;</code>
     */
    public static final int EXPAND_ANIMATION_CARD_VALUE = 16;
    /**
     * <code>COLLAPSE_ANIMATION_CARD = 17;</code>
     */
    public static final int COLLAPSE_ANIMATION_CARD_VALUE = 17;
    /**
     * <code>OPEN_ANIMATION_IN_TAB = 18;</code>
     */
    public static final int OPEN_ANIMATION_IN_TAB_VALUE = 18;
    /**
     * <code>CLOSE_ANIMATION_TAB = 19;</code>
     */
    public static final int CLOSE_ANIMATION_TAB_VALUE = 19;
    /**
     * <code>LOCK_ANIMATION = 20;</code>
     */
    public static final int LOCK_ANIMATION_VALUE = 20;
    /**
     * <code>UNLOCK_ANIMATION = 21;</code>
     */
    public static final int UNLOCK_ANIMATION_VALUE = 21;
    /**
     * <code>RESET_TIMELINE = 22;</code>
     */
    public static final int RESET_TIMELINE_VALUE = 22;
    /**
     * <code>DRAG_TIMELINE_LINE = 23;</code>
     */
    public static final int DRAG_TIMELINE_LINE_VALUE = 23;
    /**
     * <pre>
     * Open the picker to change the state of the animation.
     * </pre>
     *
     * <code>OPEN_PICKER = 24;</code>
     */
    public static final int OPEN_PICKER_VALUE = 24;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static WearTileAnimationToolingEventType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static WearTileAnimationToolingEventType forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_EVENT_TYPE;
        case 1: return OPEN_ANIMATION_INSPECTOR;
        case 2: return CLOSE_ANIMATION_INSPECTOR;
        case 3: return ANIMATION_INSPECTOR_AVAILABLE;
        case 4: return TRIGGER_PLAY_ACTION;
        case 5: return TRIGGER_PAUSE_ACTION;
        case 6: return ENABLE_LOOP_ACTION;
        case 7: return DISABLE_LOOP_ACTION;
        case 8: return CHANGE_ANIMATION_SPEED;
        case 9: return TRIGGER_JUMP_TO_START_ACTION;
        case 10: return TRIGGER_JUMP_TO_END_ACTION;
        case 11: return CHANGE_START_STATE;
        case 12: return CHANGE_END_STATE;
        case 13: return TRIGGER_SWAP_STATES_ACTION;
        case 14: return CLICK_ANIMATION_INSPECTOR_TIMELINE;
        case 15: return DRAG_ANIMATION_INSPECTOR_TIMELINE;
        case 16: return EXPAND_ANIMATION_CARD;
        case 17: return COLLAPSE_ANIMATION_CARD;
        case 18: return OPEN_ANIMATION_IN_TAB;
        case 19: return CLOSE_ANIMATION_TAB;
        case 20: return LOCK_ANIMATION;
        case 21: return UNLOCK_ANIMATION;
        case 22: return RESET_TIMELINE;
        case 23: return DRAG_TIMELINE_LINE;
        case 24: return OPEN_PICKER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<WearTileAnimationToolingEventType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        WearTileAnimationToolingEventType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<WearTileAnimationToolingEventType>() {
            public WearTileAnimationToolingEventType findValueByNumber(int number) {
              return WearTileAnimationToolingEventType.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent.getDescriptor().getEnumTypes().get(0);
    }

    private static final WearTileAnimationToolingEventType[] VALUES = values();

    public static WearTileAnimationToolingEventType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private WearTileAnimationToolingEventType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.WearTileAnimationToolingEvent.WearTileAnimationToolingEventType)
  }

  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <pre>
   * Type of event.
   * </pre>
   *
   * <code>optional .android_studio.WearTileAnimationToolingEvent.WearTileAnimationToolingEventType type = 1;</code>
   * @return Whether the type field is set.
   */
  @java.lang.Override public boolean hasType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Type of event.
   * </pre>
   *
   * <code>optional .android_studio.WearTileAnimationToolingEvent.WearTileAnimationToolingEventType type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent.WearTileAnimationToolingEventType getType() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent.WearTileAnimationToolingEventType result = com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent.WearTileAnimationToolingEventType.valueOf(type_);
    return result == null ? com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent.WearTileAnimationToolingEventType.UNKNOWN_EVENT_TYPE : result;
  }

  public static final int ANIMATION_SPEED_MULTIPLIER_FIELD_NUMBER = 2;
  private float animationSpeedMultiplier_;
  /**
   * <pre>
   * Multiplier of the animation speed (e.g. 1.5x, 0.25x).
   * Set when type is CHANGE_ANIMATION_SPEED.
   * </pre>
   *
   * <code>optional float animation_speed_multiplier = 2;</code>
   * @return Whether the animationSpeedMultiplier field is set.
   */
  @java.lang.Override
  public boolean hasAnimationSpeedMultiplier() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Multiplier of the animation speed (e.g. 1.5x, 0.25x).
   * Set when type is CHANGE_ANIMATION_SPEED.
   * </pre>
   *
   * <code>optional float animation_speed_multiplier = 2;</code>
   * @return The animationSpeedMultiplier.
   */
  @java.lang.Override
  public float getAnimationSpeedMultiplier() {
    return animationSpeedMultiplier_;
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
      output.writeFloat(2, animationSpeedMultiplier_);
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
        .computeFloatSize(2, animationSpeedMultiplier_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent other = (com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent) obj;

    if (hasType() != other.hasType()) return false;
    if (hasType()) {
      if (type_ != other.type_) return false;
    }
    if (hasAnimationSpeedMultiplier() != other.hasAnimationSpeedMultiplier()) return false;
    if (hasAnimationSpeedMultiplier()) {
      if (java.lang.Float.floatToIntBits(getAnimationSpeedMultiplier())
          != java.lang.Float.floatToIntBits(
              other.getAnimationSpeedMultiplier())) return false;
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
    if (hasAnimationSpeedMultiplier()) {
      hash = (37 * hash) + ANIMATION_SPEED_MULTIPLIER_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getAnimationSpeedMultiplier());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent prototype) {
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
   * Details for Wear Tile animation tooling event
   * </pre>
   *
   * Protobuf type {@code android_studio.WearTileAnimationToolingEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.WearTileAnimationToolingEvent)
      com.google.wireless.android.sdk.stats.WearTileAnimationToolingEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_WearTileAnimationToolingEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_WearTileAnimationToolingEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent.class, com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent.newBuilder()
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
      animationSpeedMultiplier_ = 0F;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_WearTileAnimationToolingEvent_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent build() {
      com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent buildPartial() {
      com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent result = new com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.type_ = type_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.animationSpeedMultiplier_ = animationSpeedMultiplier_;
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
      if (other instanceof com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent) {
        return mergeFrom((com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent other) {
      if (other == com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent.getDefaultInstance()) return this;
      if (other.hasType()) {
        setType(other.getType());
      }
      if (other.hasAnimationSpeedMultiplier()) {
        setAnimationSpeedMultiplier(other.getAnimationSpeedMultiplier());
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
              com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent.WearTileAnimationToolingEventType tmpValue =
                  com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent.WearTileAnimationToolingEventType.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(1, tmpRaw);
              } else {
                type_ = tmpRaw;
                bitField0_ |= 0x00000001;
              }
              break;
            } // case 8
            case 21: {
              animationSpeedMultiplier_ = input.readFloat();
              bitField0_ |= 0x00000002;
              break;
            } // case 21
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
     * Type of event.
     * </pre>
     *
     * <code>optional .android_studio.WearTileAnimationToolingEvent.WearTileAnimationToolingEventType type = 1;</code>
     * @return Whether the type field is set.
     */
    @java.lang.Override public boolean hasType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Type of event.
     * </pre>
     *
     * <code>optional .android_studio.WearTileAnimationToolingEvent.WearTileAnimationToolingEventType type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent.WearTileAnimationToolingEventType getType() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent.WearTileAnimationToolingEventType result = com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent.WearTileAnimationToolingEventType.valueOf(type_);
      return result == null ? com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent.WearTileAnimationToolingEventType.UNKNOWN_EVENT_TYPE : result;
    }
    /**
     * <pre>
     * Type of event.
     * </pre>
     *
     * <code>optional .android_studio.WearTileAnimationToolingEvent.WearTileAnimationToolingEventType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent.WearTileAnimationToolingEventType value) {
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
     * Type of event.
     * </pre>
     *
     * <code>optional .android_studio.WearTileAnimationToolingEvent.WearTileAnimationToolingEventType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private float animationSpeedMultiplier_ ;
    /**
     * <pre>
     * Multiplier of the animation speed (e.g. 1.5x, 0.25x).
     * Set when type is CHANGE_ANIMATION_SPEED.
     * </pre>
     *
     * <code>optional float animation_speed_multiplier = 2;</code>
     * @return Whether the animationSpeedMultiplier field is set.
     */
    @java.lang.Override
    public boolean hasAnimationSpeedMultiplier() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Multiplier of the animation speed (e.g. 1.5x, 0.25x).
     * Set when type is CHANGE_ANIMATION_SPEED.
     * </pre>
     *
     * <code>optional float animation_speed_multiplier = 2;</code>
     * @return The animationSpeedMultiplier.
     */
    @java.lang.Override
    public float getAnimationSpeedMultiplier() {
      return animationSpeedMultiplier_;
    }
    /**
     * <pre>
     * Multiplier of the animation speed (e.g. 1.5x, 0.25x).
     * Set when type is CHANGE_ANIMATION_SPEED.
     * </pre>
     *
     * <code>optional float animation_speed_multiplier = 2;</code>
     * @param value The animationSpeedMultiplier to set.
     * @return This builder for chaining.
     */
    public Builder setAnimationSpeedMultiplier(float value) {
      bitField0_ |= 0x00000002;
      animationSpeedMultiplier_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Multiplier of the animation speed (e.g. 1.5x, 0.25x).
     * Set when type is CHANGE_ANIMATION_SPEED.
     * </pre>
     *
     * <code>optional float animation_speed_multiplier = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnimationSpeedMultiplier() {
      bitField0_ = (bitField0_ & ~0x00000002);
      animationSpeedMultiplier_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:android_studio.WearTileAnimationToolingEvent)
  }

  // @@protoc_insertion_point(class_scope:android_studio.WearTileAnimationToolingEvent)
  private static final com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent();
  }

  public static com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<WearTileAnimationToolingEvent>
      PARSER = new com.google.protobuf.AbstractParser<WearTileAnimationToolingEvent>() {
    @java.lang.Override
    public WearTileAnimationToolingEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<WearTileAnimationToolingEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WearTileAnimationToolingEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.WearTileAnimationToolingEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
