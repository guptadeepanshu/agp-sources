// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Session data around goto declaration
 * </pre>
 *
 * Protobuf type {@code android_studio.DynamicLayoutInspectorGotoDeclaration}
 */
public final class DynamicLayoutInspectorGotoDeclaration extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.DynamicLayoutInspectorGotoDeclaration)
    DynamicLayoutInspectorGotoDeclarationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DynamicLayoutInspectorGotoDeclaration.newBuilder() to construct.
  private DynamicLayoutInspectorGotoDeclaration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DynamicLayoutInspectorGotoDeclaration() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DynamicLayoutInspectorGotoDeclaration();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DynamicLayoutInspectorGotoDeclaration_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DynamicLayoutInspectorGotoDeclaration_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration.class, com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration.Builder.class);
  }

  private int bitField0_;
  public static final int CLICKS_MENU_ACTION_FIELD_NUMBER = 1;
  private int clicksMenuAction_;
  /**
   * <pre>
   * Number of clicks on "Goto Declaration" menu action
   * </pre>
   *
   * <code>optional uint32 clicks_menu_action = 1;</code>
   * @return Whether the clicksMenuAction field is set.
   */
  @java.lang.Override
  public boolean hasClicksMenuAction() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Number of clicks on "Goto Declaration" menu action
   * </pre>
   *
   * <code>optional uint32 clicks_menu_action = 1;</code>
   * @return The clicksMenuAction.
   */
  @java.lang.Override
  public int getClicksMenuAction() {
    return clicksMenuAction_;
  }

  public static final int KEY_STROKES_SHORTCUT_FIELD_NUMBER = 2;
  private int keyStrokesShortcut_;
  /**
   * <pre>
   * Number of times the "Goto Declaration" menu action was activated with key
   * shortcut
   * </pre>
   *
   * <code>optional uint32 key_strokes_shortcut = 2;</code>
   * @return Whether the keyStrokesShortcut field is set.
   */
  @java.lang.Override
  public boolean hasKeyStrokesShortcut() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Number of times the "Goto Declaration" menu action was activated with key
   * shortcut
   * </pre>
   *
   * <code>optional uint32 key_strokes_shortcut = 2;</code>
   * @return The keyStrokesShortcut.
   */
  @java.lang.Override
  public int getKeyStrokesShortcut() {
    return keyStrokesShortcut_;
  }

  public static final int DOUBLE_CLICKS_FIELD_NUMBER = 3;
  private int doubleClicks_;
  /**
   * <pre>
   * Number of times double click was used to "Goto Declaration"
   * from component tree
   * </pre>
   *
   * <code>optional uint32 double_clicks = 3;</code>
   * @return Whether the doubleClicks field is set.
   */
  @java.lang.Override
  public boolean hasDoubleClicks() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Number of times double click was used to "Goto Declaration"
   * from component tree
   * </pre>
   *
   * <code>optional uint32 double_clicks = 3;</code>
   * @return The doubleClicks.
   */
  @java.lang.Override
  public int getDoubleClicks() {
    return doubleClicks_;
  }

  public static final int DOUBLE_CLICKS_FROM_RENDER_FIELD_NUMBER = 4;
  private int doubleClicksFromRender_;
  /**
   * <pre>
   * Number of times double click was used to "Goto Declaration"
   * from device render
   * </pre>
   *
   * <code>optional uint32 double_clicks_from_render = 4;</code>
   * @return Whether the doubleClicksFromRender field is set.
   */
  @java.lang.Override
  public boolean hasDoubleClicksFromRender() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * Number of times double click was used to "Goto Declaration"
   * from device render
   * </pre>
   *
   * <code>optional uint32 double_clicks_from_render = 4;</code>
   * @return The doubleClicksFromRender.
   */
  @java.lang.Override
  public int getDoubleClicksFromRender() {
    return doubleClicksFromRender_;
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
      output.writeUInt32(1, clicksMenuAction_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeUInt32(2, keyStrokesShortcut_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeUInt32(3, doubleClicks_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeUInt32(4, doubleClicksFromRender_);
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
        .computeUInt32Size(1, clicksMenuAction_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, keyStrokesShortcut_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, doubleClicks_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, doubleClicksFromRender_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration other = (com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration) obj;

    if (hasClicksMenuAction() != other.hasClicksMenuAction()) return false;
    if (hasClicksMenuAction()) {
      if (getClicksMenuAction()
          != other.getClicksMenuAction()) return false;
    }
    if (hasKeyStrokesShortcut() != other.hasKeyStrokesShortcut()) return false;
    if (hasKeyStrokesShortcut()) {
      if (getKeyStrokesShortcut()
          != other.getKeyStrokesShortcut()) return false;
    }
    if (hasDoubleClicks() != other.hasDoubleClicks()) return false;
    if (hasDoubleClicks()) {
      if (getDoubleClicks()
          != other.getDoubleClicks()) return false;
    }
    if (hasDoubleClicksFromRender() != other.hasDoubleClicksFromRender()) return false;
    if (hasDoubleClicksFromRender()) {
      if (getDoubleClicksFromRender()
          != other.getDoubleClicksFromRender()) return false;
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
    if (hasClicksMenuAction()) {
      hash = (37 * hash) + CLICKS_MENU_ACTION_FIELD_NUMBER;
      hash = (53 * hash) + getClicksMenuAction();
    }
    if (hasKeyStrokesShortcut()) {
      hash = (37 * hash) + KEY_STROKES_SHORTCUT_FIELD_NUMBER;
      hash = (53 * hash) + getKeyStrokesShortcut();
    }
    if (hasDoubleClicks()) {
      hash = (37 * hash) + DOUBLE_CLICKS_FIELD_NUMBER;
      hash = (53 * hash) + getDoubleClicks();
    }
    if (hasDoubleClicksFromRender()) {
      hash = (37 * hash) + DOUBLE_CLICKS_FROM_RENDER_FIELD_NUMBER;
      hash = (53 * hash) + getDoubleClicksFromRender();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration prototype) {
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
   * Session data around goto declaration
   * </pre>
   *
   * Protobuf type {@code android_studio.DynamicLayoutInspectorGotoDeclaration}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.DynamicLayoutInspectorGotoDeclaration)
      com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclarationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DynamicLayoutInspectorGotoDeclaration_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DynamicLayoutInspectorGotoDeclaration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration.class, com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      clicksMenuAction_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      keyStrokesShortcut_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      doubleClicks_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      doubleClicksFromRender_ = 0;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DynamicLayoutInspectorGotoDeclaration_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration build() {
      com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration buildPartial() {
      com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration result = new com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.clicksMenuAction_ = clicksMenuAction_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.keyStrokesShortcut_ = keyStrokesShortcut_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.doubleClicks_ = doubleClicks_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.doubleClicksFromRender_ = doubleClicksFromRender_;
        to_bitField0_ |= 0x00000008;
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
      if (other instanceof com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration) {
        return mergeFrom((com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration other) {
      if (other == com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration.getDefaultInstance()) return this;
      if (other.hasClicksMenuAction()) {
        setClicksMenuAction(other.getClicksMenuAction());
      }
      if (other.hasKeyStrokesShortcut()) {
        setKeyStrokesShortcut(other.getKeyStrokesShortcut());
      }
      if (other.hasDoubleClicks()) {
        setDoubleClicks(other.getDoubleClicks());
      }
      if (other.hasDoubleClicksFromRender()) {
        setDoubleClicksFromRender(other.getDoubleClicksFromRender());
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
              clicksMenuAction_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              keyStrokesShortcut_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              doubleClicks_ = input.readUInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              doubleClicksFromRender_ = input.readUInt32();
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

    private int clicksMenuAction_ ;
    /**
     * <pre>
     * Number of clicks on "Goto Declaration" menu action
     * </pre>
     *
     * <code>optional uint32 clicks_menu_action = 1;</code>
     * @return Whether the clicksMenuAction field is set.
     */
    @java.lang.Override
    public boolean hasClicksMenuAction() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Number of clicks on "Goto Declaration" menu action
     * </pre>
     *
     * <code>optional uint32 clicks_menu_action = 1;</code>
     * @return The clicksMenuAction.
     */
    @java.lang.Override
    public int getClicksMenuAction() {
      return clicksMenuAction_;
    }
    /**
     * <pre>
     * Number of clicks on "Goto Declaration" menu action
     * </pre>
     *
     * <code>optional uint32 clicks_menu_action = 1;</code>
     * @param value The clicksMenuAction to set.
     * @return This builder for chaining.
     */
    public Builder setClicksMenuAction(int value) {
      bitField0_ |= 0x00000001;
      clicksMenuAction_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of clicks on "Goto Declaration" menu action
     * </pre>
     *
     * <code>optional uint32 clicks_menu_action = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearClicksMenuAction() {
      bitField0_ = (bitField0_ & ~0x00000001);
      clicksMenuAction_ = 0;
      onChanged();
      return this;
    }

    private int keyStrokesShortcut_ ;
    /**
     * <pre>
     * Number of times the "Goto Declaration" menu action was activated with key
     * shortcut
     * </pre>
     *
     * <code>optional uint32 key_strokes_shortcut = 2;</code>
     * @return Whether the keyStrokesShortcut field is set.
     */
    @java.lang.Override
    public boolean hasKeyStrokesShortcut() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Number of times the "Goto Declaration" menu action was activated with key
     * shortcut
     * </pre>
     *
     * <code>optional uint32 key_strokes_shortcut = 2;</code>
     * @return The keyStrokesShortcut.
     */
    @java.lang.Override
    public int getKeyStrokesShortcut() {
      return keyStrokesShortcut_;
    }
    /**
     * <pre>
     * Number of times the "Goto Declaration" menu action was activated with key
     * shortcut
     * </pre>
     *
     * <code>optional uint32 key_strokes_shortcut = 2;</code>
     * @param value The keyStrokesShortcut to set.
     * @return This builder for chaining.
     */
    public Builder setKeyStrokesShortcut(int value) {
      bitField0_ |= 0x00000002;
      keyStrokesShortcut_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of times the "Goto Declaration" menu action was activated with key
     * shortcut
     * </pre>
     *
     * <code>optional uint32 key_strokes_shortcut = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearKeyStrokesShortcut() {
      bitField0_ = (bitField0_ & ~0x00000002);
      keyStrokesShortcut_ = 0;
      onChanged();
      return this;
    }

    private int doubleClicks_ ;
    /**
     * <pre>
     * Number of times double click was used to "Goto Declaration"
     * from component tree
     * </pre>
     *
     * <code>optional uint32 double_clicks = 3;</code>
     * @return Whether the doubleClicks field is set.
     */
    @java.lang.Override
    public boolean hasDoubleClicks() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Number of times double click was used to "Goto Declaration"
     * from component tree
     * </pre>
     *
     * <code>optional uint32 double_clicks = 3;</code>
     * @return The doubleClicks.
     */
    @java.lang.Override
    public int getDoubleClicks() {
      return doubleClicks_;
    }
    /**
     * <pre>
     * Number of times double click was used to "Goto Declaration"
     * from component tree
     * </pre>
     *
     * <code>optional uint32 double_clicks = 3;</code>
     * @param value The doubleClicks to set.
     * @return This builder for chaining.
     */
    public Builder setDoubleClicks(int value) {
      bitField0_ |= 0x00000004;
      doubleClicks_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of times double click was used to "Goto Declaration"
     * from component tree
     * </pre>
     *
     * <code>optional uint32 double_clicks = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDoubleClicks() {
      bitField0_ = (bitField0_ & ~0x00000004);
      doubleClicks_ = 0;
      onChanged();
      return this;
    }

    private int doubleClicksFromRender_ ;
    /**
     * <pre>
     * Number of times double click was used to "Goto Declaration"
     * from device render
     * </pre>
     *
     * <code>optional uint32 double_clicks_from_render = 4;</code>
     * @return Whether the doubleClicksFromRender field is set.
     */
    @java.lang.Override
    public boolean hasDoubleClicksFromRender() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Number of times double click was used to "Goto Declaration"
     * from device render
     * </pre>
     *
     * <code>optional uint32 double_clicks_from_render = 4;</code>
     * @return The doubleClicksFromRender.
     */
    @java.lang.Override
    public int getDoubleClicksFromRender() {
      return doubleClicksFromRender_;
    }
    /**
     * <pre>
     * Number of times double click was used to "Goto Declaration"
     * from device render
     * </pre>
     *
     * <code>optional uint32 double_clicks_from_render = 4;</code>
     * @param value The doubleClicksFromRender to set.
     * @return This builder for chaining.
     */
    public Builder setDoubleClicksFromRender(int value) {
      bitField0_ |= 0x00000008;
      doubleClicksFromRender_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of times double click was used to "Goto Declaration"
     * from device render
     * </pre>
     *
     * <code>optional uint32 double_clicks_from_render = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDoubleClicksFromRender() {
      bitField0_ = (bitField0_ & ~0x00000008);
      doubleClicksFromRender_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.DynamicLayoutInspectorGotoDeclaration)
  }

  // @@protoc_insertion_point(class_scope:android_studio.DynamicLayoutInspectorGotoDeclaration)
  private static final com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration();
  }

  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<DynamicLayoutInspectorGotoDeclaration>
      PARSER = new com.google.protobuf.AbstractParser<DynamicLayoutInspectorGotoDeclaration>() {
    @java.lang.Override
    public DynamicLayoutInspectorGotoDeclaration parsePartialFrom(
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

  public static com.google.protobuf.Parser<DynamicLayoutInspectorGotoDeclaration> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DynamicLayoutInspectorGotoDeclaration> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.DynamicLayoutInspectorGotoDeclaration getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

