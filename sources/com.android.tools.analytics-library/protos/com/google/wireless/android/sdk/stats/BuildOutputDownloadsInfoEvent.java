// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * Protobuf type {@code android_studio.BuildOutputDownloadsInfoEvent}
 */
public final class BuildOutputDownloadsInfoEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.BuildOutputDownloadsInfoEvent)
    BuildOutputDownloadsInfoEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BuildOutputDownloadsInfoEvent.newBuilder() to construct.
  private BuildOutputDownloadsInfoEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BuildOutputDownloadsInfoEvent() {
    view_ = 0;
    interaction_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BuildOutputDownloadsInfoEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_BuildOutputDownloadsInfoEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_BuildOutputDownloadsInfoEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.class, com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.BuildOutputDownloadsInfoEvent.View}
   */
  public enum View
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_VIEW = 0;</code>
     */
    UNKNOWN_VIEW(0),
    /**
     * <code>SYNC_VIEW = 1;</code>
     */
    SYNC_VIEW(1),
    /**
     * <code>BUILD_VIEW = 2;</code>
     */
    BUILD_VIEW(2),
    ;

    /**
     * <code>UNKNOWN_VIEW = 0;</code>
     */
    public static final int UNKNOWN_VIEW_VALUE = 0;
    /**
     * <code>SYNC_VIEW = 1;</code>
     */
    public static final int SYNC_VIEW_VALUE = 1;
    /**
     * <code>BUILD_VIEW = 2;</code>
     */
    public static final int BUILD_VIEW_VALUE = 2;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static View valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static View forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_VIEW;
        case 1: return SYNC_VIEW;
        case 2: return BUILD_VIEW;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<View>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        View> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<View>() {
            public View findValueByNumber(int number) {
              return View.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.getDescriptor().getEnumTypes().get(0);
    }

    private static final View[] VALUES = values();

    public static View valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private View(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.BuildOutputDownloadsInfoEvent.View)
  }

  /**
   * Protobuf enum {@code android_studio.BuildOutputDownloadsInfoEvent.Interaction}
   */
  public enum Interaction
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_INTERACTION = 0;</code>
     */
    UNKNOWN_INTERACTION(0),
    /**
     * <code>OPEN_DOWNLOADS_INFO_UI = 1;</code>
     */
    OPEN_DOWNLOADS_INFO_UI(1),
    /**
     * <code>CLICK_LEARN_MORE_LINK = 2;</code>
     */
    CLICK_LEARN_MORE_LINK(2),
    /**
     * <code>SELECT_REPOSITORY_ROW = 3;</code>
     */
    SELECT_REPOSITORY_ROW(3),
    /**
     * <code>NOTIFICATION_TRIGGERED = 4;</code>
     */
    NOTIFICATION_TRIGGERED(4),
    /**
     * <code>NOTIFICATION_LINK_CLICK = 5;</code>
     */
    NOTIFICATION_LINK_CLICK(5),
    ;

    /**
     * <code>UNKNOWN_INTERACTION = 0;</code>
     */
    public static final int UNKNOWN_INTERACTION_VALUE = 0;
    /**
     * <code>OPEN_DOWNLOADS_INFO_UI = 1;</code>
     */
    public static final int OPEN_DOWNLOADS_INFO_UI_VALUE = 1;
    /**
     * <code>CLICK_LEARN_MORE_LINK = 2;</code>
     */
    public static final int CLICK_LEARN_MORE_LINK_VALUE = 2;
    /**
     * <code>SELECT_REPOSITORY_ROW = 3;</code>
     */
    public static final int SELECT_REPOSITORY_ROW_VALUE = 3;
    /**
     * <code>NOTIFICATION_TRIGGERED = 4;</code>
     */
    public static final int NOTIFICATION_TRIGGERED_VALUE = 4;
    /**
     * <code>NOTIFICATION_LINK_CLICK = 5;</code>
     */
    public static final int NOTIFICATION_LINK_CLICK_VALUE = 5;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Interaction valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Interaction forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_INTERACTION;
        case 1: return OPEN_DOWNLOADS_INFO_UI;
        case 2: return CLICK_LEARN_MORE_LINK;
        case 3: return SELECT_REPOSITORY_ROW;
        case 4: return NOTIFICATION_TRIGGERED;
        case 5: return NOTIFICATION_LINK_CLICK;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Interaction>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Interaction> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Interaction>() {
            public Interaction findValueByNumber(int number) {
              return Interaction.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.getDescriptor().getEnumTypes().get(1);
    }

    private static final Interaction[] VALUES = values();

    public static Interaction valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Interaction(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.BuildOutputDownloadsInfoEvent.Interaction)
  }

  private int bitField0_;
  public static final int VIEW_FIELD_NUMBER = 1;
  private int view_ = 0;
  /**
   * <code>optional .android_studio.BuildOutputDownloadsInfoEvent.View view = 1;</code>
   * @return Whether the view field is set.
   */
  @java.lang.Override public boolean hasView() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .android_studio.BuildOutputDownloadsInfoEvent.View view = 1;</code>
   * @return The view.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.View getView() {
    com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.View result = com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.View.forNumber(view_);
    return result == null ? com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.View.UNKNOWN_VIEW : result;
  }

  public static final int INTERACTION_FIELD_NUMBER = 2;
  private int interaction_ = 0;
  /**
   * <code>optional .android_studio.BuildOutputDownloadsInfoEvent.Interaction interaction = 2;</code>
   * @return Whether the interaction field is set.
   */
  @java.lang.Override public boolean hasInteraction() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .android_studio.BuildOutputDownloadsInfoEvent.Interaction interaction = 2;</code>
   * @return The interaction.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.Interaction getInteraction() {
    com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.Interaction result = com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.Interaction.forNumber(interaction_);
    return result == null ? com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.Interaction.UNKNOWN_INTERACTION : result;
  }

  public static final int BUILD_FINISHED_FIELD_NUMBER = 3;
  private boolean buildFinished_ = false;
  /**
   * <pre>
   * 'true' if this build/sync already finished, 'false' if still running
   * </pre>
   *
   * <code>optional bool build_finished = 3;</code>
   * @return Whether the buildFinished field is set.
   */
  @java.lang.Override
  public boolean hasBuildFinished() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * 'true' if this build/sync already finished, 'false' if still running
   * </pre>
   *
   * <code>optional bool build_finished = 3;</code>
   * @return The buildFinished.
   */
  @java.lang.Override
  public boolean getBuildFinished() {
    return buildFinished_;
  }

  public static final int MS_SINCE_BUILD_START_FIELD_NUMBER = 4;
  private int msSinceBuildStart_ = 0;
  /**
   * <pre>
   * Indicates time of this event in ms since this build/sync started
   * </pre>
   *
   * <code>optional uint32 ms_since_build_start = 4;</code>
   * @return Whether the msSinceBuildStart field is set.
   */
  @java.lang.Override
  public boolean hasMsSinceBuildStart() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * Indicates time of this event in ms since this build/sync started
   * </pre>
   *
   * <code>optional uint32 ms_since_build_start = 4;</code>
   * @return The msSinceBuildStart.
   */
  @java.lang.Override
  public int getMsSinceBuildStart() {
    return msSinceBuildStart_;
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
      output.writeEnum(1, view_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeEnum(2, interaction_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeBool(3, buildFinished_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeUInt32(4, msSinceBuildStart_);
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
        .computeEnumSize(1, view_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, interaction_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, buildFinished_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, msSinceBuildStart_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent other = (com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent) obj;

    if (hasView() != other.hasView()) return false;
    if (hasView()) {
      if (view_ != other.view_) return false;
    }
    if (hasInteraction() != other.hasInteraction()) return false;
    if (hasInteraction()) {
      if (interaction_ != other.interaction_) return false;
    }
    if (hasBuildFinished() != other.hasBuildFinished()) return false;
    if (hasBuildFinished()) {
      if (getBuildFinished()
          != other.getBuildFinished()) return false;
    }
    if (hasMsSinceBuildStart() != other.hasMsSinceBuildStart()) return false;
    if (hasMsSinceBuildStart()) {
      if (getMsSinceBuildStart()
          != other.getMsSinceBuildStart()) return false;
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
    if (hasView()) {
      hash = (37 * hash) + VIEW_FIELD_NUMBER;
      hash = (53 * hash) + view_;
    }
    if (hasInteraction()) {
      hash = (37 * hash) + INTERACTION_FIELD_NUMBER;
      hash = (53 * hash) + interaction_;
    }
    if (hasBuildFinished()) {
      hash = (37 * hash) + BUILD_FINISHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getBuildFinished());
    }
    if (hasMsSinceBuildStart()) {
      hash = (37 * hash) + MS_SINCE_BUILD_START_FIELD_NUMBER;
      hash = (53 * hash) + getMsSinceBuildStart();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent prototype) {
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
   * Protobuf type {@code android_studio.BuildOutputDownloadsInfoEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.BuildOutputDownloadsInfoEvent)
      com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_BuildOutputDownloadsInfoEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_BuildOutputDownloadsInfoEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.class, com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.newBuilder()
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
      view_ = 0;
      interaction_ = 0;
      buildFinished_ = false;
      msSinceBuildStart_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_BuildOutputDownloadsInfoEvent_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent build() {
      com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent buildPartial() {
      com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent result = new com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.view_ = view_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.interaction_ = interaction_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.buildFinished_ = buildFinished_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.msSinceBuildStart_ = msSinceBuildStart_;
        to_bitField0_ |= 0x00000008;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent) {
        return mergeFrom((com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent other) {
      if (other == com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.getDefaultInstance()) return this;
      if (other.hasView()) {
        setView(other.getView());
      }
      if (other.hasInteraction()) {
        setInteraction(other.getInteraction());
      }
      if (other.hasBuildFinished()) {
        setBuildFinished(other.getBuildFinished());
      }
      if (other.hasMsSinceBuildStart()) {
        setMsSinceBuildStart(other.getMsSinceBuildStart());
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
              com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.View tmpValue =
                  com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.View.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(1, tmpRaw);
              } else {
                view_ = tmpRaw;
                bitField0_ |= 0x00000001;
              }
              break;
            } // case 8
            case 16: {
              int tmpRaw = input.readEnum();
              com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.Interaction tmpValue =
                  com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.Interaction.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(2, tmpRaw);
              } else {
                interaction_ = tmpRaw;
                bitField0_ |= 0x00000002;
              }
              break;
            } // case 16
            case 24: {
              buildFinished_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              msSinceBuildStart_ = input.readUInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private int view_ = 0;
    /**
     * <code>optional .android_studio.BuildOutputDownloadsInfoEvent.View view = 1;</code>
     * @return Whether the view field is set.
     */
    @java.lang.Override public boolean hasView() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .android_studio.BuildOutputDownloadsInfoEvent.View view = 1;</code>
     * @return The view.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.View getView() {
      com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.View result = com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.View.forNumber(view_);
      return result == null ? com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.View.UNKNOWN_VIEW : result;
    }
    /**
     * <code>optional .android_studio.BuildOutputDownloadsInfoEvent.View view = 1;</code>
     * @param value The view to set.
     * @return This builder for chaining.
     */
    public Builder setView(com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.View value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      view_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .android_studio.BuildOutputDownloadsInfoEvent.View view = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearView() {
      bitField0_ = (bitField0_ & ~0x00000001);
      view_ = 0;
      onChanged();
      return this;
    }

    private int interaction_ = 0;
    /**
     * <code>optional .android_studio.BuildOutputDownloadsInfoEvent.Interaction interaction = 2;</code>
     * @return Whether the interaction field is set.
     */
    @java.lang.Override public boolean hasInteraction() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .android_studio.BuildOutputDownloadsInfoEvent.Interaction interaction = 2;</code>
     * @return The interaction.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.Interaction getInteraction() {
      com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.Interaction result = com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.Interaction.forNumber(interaction_);
      return result == null ? com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.Interaction.UNKNOWN_INTERACTION : result;
    }
    /**
     * <code>optional .android_studio.BuildOutputDownloadsInfoEvent.Interaction interaction = 2;</code>
     * @param value The interaction to set.
     * @return This builder for chaining.
     */
    public Builder setInteraction(com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent.Interaction value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      interaction_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .android_studio.BuildOutputDownloadsInfoEvent.Interaction interaction = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearInteraction() {
      bitField0_ = (bitField0_ & ~0x00000002);
      interaction_ = 0;
      onChanged();
      return this;
    }

    private boolean buildFinished_ ;
    /**
     * <pre>
     * 'true' if this build/sync already finished, 'false' if still running
     * </pre>
     *
     * <code>optional bool build_finished = 3;</code>
     * @return Whether the buildFinished field is set.
     */
    @java.lang.Override
    public boolean hasBuildFinished() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * 'true' if this build/sync already finished, 'false' if still running
     * </pre>
     *
     * <code>optional bool build_finished = 3;</code>
     * @return The buildFinished.
     */
    @java.lang.Override
    public boolean getBuildFinished() {
      return buildFinished_;
    }
    /**
     * <pre>
     * 'true' if this build/sync already finished, 'false' if still running
     * </pre>
     *
     * <code>optional bool build_finished = 3;</code>
     * @param value The buildFinished to set.
     * @return This builder for chaining.
     */
    public Builder setBuildFinished(boolean value) {

      buildFinished_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 'true' if this build/sync already finished, 'false' if still running
     * </pre>
     *
     * <code>optional bool build_finished = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBuildFinished() {
      bitField0_ = (bitField0_ & ~0x00000004);
      buildFinished_ = false;
      onChanged();
      return this;
    }

    private int msSinceBuildStart_ ;
    /**
     * <pre>
     * Indicates time of this event in ms since this build/sync started
     * </pre>
     *
     * <code>optional uint32 ms_since_build_start = 4;</code>
     * @return Whether the msSinceBuildStart field is set.
     */
    @java.lang.Override
    public boolean hasMsSinceBuildStart() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Indicates time of this event in ms since this build/sync started
     * </pre>
     *
     * <code>optional uint32 ms_since_build_start = 4;</code>
     * @return The msSinceBuildStart.
     */
    @java.lang.Override
    public int getMsSinceBuildStart() {
      return msSinceBuildStart_;
    }
    /**
     * <pre>
     * Indicates time of this event in ms since this build/sync started
     * </pre>
     *
     * <code>optional uint32 ms_since_build_start = 4;</code>
     * @param value The msSinceBuildStart to set.
     * @return This builder for chaining.
     */
    public Builder setMsSinceBuildStart(int value) {

      msSinceBuildStart_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates time of this event in ms since this build/sync started
     * </pre>
     *
     * <code>optional uint32 ms_since_build_start = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMsSinceBuildStart() {
      bitField0_ = (bitField0_ & ~0x00000008);
      msSinceBuildStart_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.BuildOutputDownloadsInfoEvent)
  }

  // @@protoc_insertion_point(class_scope:android_studio.BuildOutputDownloadsInfoEvent)
  private static final com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent();
  }

  public static com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<BuildOutputDownloadsInfoEvent>
      PARSER = new com.google.protobuf.AbstractParser<BuildOutputDownloadsInfoEvent>() {
    @java.lang.Override
    public BuildOutputDownloadsInfoEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<BuildOutputDownloadsInfoEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuildOutputDownloadsInfoEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.BuildOutputDownloadsInfoEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

