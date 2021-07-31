// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * Protobuf type {@code android_studio.DynamicLayoutInspectorSystemNode}
 */
public  final class DynamicLayoutInspectorSystemNode extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.DynamicLayoutInspectorSystemNode)
    DynamicLayoutInspectorSystemNodeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DynamicLayoutInspectorSystemNode.newBuilder() to construct.
  private DynamicLayoutInspectorSystemNode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DynamicLayoutInspectorSystemNode() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DynamicLayoutInspectorSystemNode();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DynamicLayoutInspectorSystemNode(
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
            bitField0_ |= 0x00000001;
            clicksWithHiddenSystemViews_ = input.readUInt32();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            clicksWithVisibleSystemViews_ = input.readUInt32();
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DynamicLayoutInspectorSystemNode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DynamicLayoutInspectorSystemNode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode.class, com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode.Builder.class);
  }

  private int bitField0_;
  public static final int CLICKS_WITH_HIDDEN_SYSTEM_VIEWS_FIELD_NUMBER = 1;
  private int clicksWithHiddenSystemViews_;
  /**
   * <pre>
   * Number of selections while the system views are hidden
   * </pre>
   *
   * <code>optional uint32 clicks_with_hidden_system_views = 1;</code>
   * @return Whether the clicksWithHiddenSystemViews field is set.
   */
  public boolean hasClicksWithHiddenSystemViews() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Number of selections while the system views are hidden
   * </pre>
   *
   * <code>optional uint32 clicks_with_hidden_system_views = 1;</code>
   * @return The clicksWithHiddenSystemViews.
   */
  public int getClicksWithHiddenSystemViews() {
    return clicksWithHiddenSystemViews_;
  }

  public static final int CLICKS_WITH_VISIBLE_SYSTEM_VIEWS_FIELD_NUMBER = 2;
  private int clicksWithVisibleSystemViews_;
  /**
   * <pre>
   * Number of selections while the system views are visible
   * </pre>
   *
   * <code>optional uint32 clicks_with_visible_system_views = 2;</code>
   * @return Whether the clicksWithVisibleSystemViews field is set.
   */
  public boolean hasClicksWithVisibleSystemViews() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Number of selections while the system views are visible
   * </pre>
   *
   * <code>optional uint32 clicks_with_visible_system_views = 2;</code>
   * @return The clicksWithVisibleSystemViews.
   */
  public int getClicksWithVisibleSystemViews() {
    return clicksWithVisibleSystemViews_;
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
      output.writeUInt32(1, clicksWithHiddenSystemViews_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeUInt32(2, clicksWithVisibleSystemViews_);
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
        .computeUInt32Size(1, clicksWithHiddenSystemViews_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, clicksWithVisibleSystemViews_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode other = (com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode) obj;

    if (hasClicksWithHiddenSystemViews() != other.hasClicksWithHiddenSystemViews()) return false;
    if (hasClicksWithHiddenSystemViews()) {
      if (getClicksWithHiddenSystemViews()
          != other.getClicksWithHiddenSystemViews()) return false;
    }
    if (hasClicksWithVisibleSystemViews() != other.hasClicksWithVisibleSystemViews()) return false;
    if (hasClicksWithVisibleSystemViews()) {
      if (getClicksWithVisibleSystemViews()
          != other.getClicksWithVisibleSystemViews()) return false;
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
    if (hasClicksWithHiddenSystemViews()) {
      hash = (37 * hash) + CLICKS_WITH_HIDDEN_SYSTEM_VIEWS_FIELD_NUMBER;
      hash = (53 * hash) + getClicksWithHiddenSystemViews();
    }
    if (hasClicksWithVisibleSystemViews()) {
      hash = (37 * hash) + CLICKS_WITH_VISIBLE_SYSTEM_VIEWS_FIELD_NUMBER;
      hash = (53 * hash) + getClicksWithVisibleSystemViews();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode prototype) {
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
   * Protobuf type {@code android_studio.DynamicLayoutInspectorSystemNode}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.DynamicLayoutInspectorSystemNode)
      com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DynamicLayoutInspectorSystemNode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DynamicLayoutInspectorSystemNode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode.class, com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode.newBuilder()
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
      clicksWithHiddenSystemViews_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      clicksWithVisibleSystemViews_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DynamicLayoutInspectorSystemNode_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode build() {
      com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode buildPartial() {
      com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode result = new com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.clicksWithHiddenSystemViews_ = clicksWithHiddenSystemViews_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.clicksWithVisibleSystemViews_ = clicksWithVisibleSystemViews_;
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
      if (other instanceof com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode) {
        return mergeFrom((com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode other) {
      if (other == com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode.getDefaultInstance()) return this;
      if (other.hasClicksWithHiddenSystemViews()) {
        setClicksWithHiddenSystemViews(other.getClicksWithHiddenSystemViews());
      }
      if (other.hasClicksWithVisibleSystemViews()) {
        setClicksWithVisibleSystemViews(other.getClicksWithVisibleSystemViews());
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
      com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int clicksWithHiddenSystemViews_ ;
    /**
     * <pre>
     * Number of selections while the system views are hidden
     * </pre>
     *
     * <code>optional uint32 clicks_with_hidden_system_views = 1;</code>
     * @return Whether the clicksWithHiddenSystemViews field is set.
     */
    public boolean hasClicksWithHiddenSystemViews() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Number of selections while the system views are hidden
     * </pre>
     *
     * <code>optional uint32 clicks_with_hidden_system_views = 1;</code>
     * @return The clicksWithHiddenSystemViews.
     */
    public int getClicksWithHiddenSystemViews() {
      return clicksWithHiddenSystemViews_;
    }
    /**
     * <pre>
     * Number of selections while the system views are hidden
     * </pre>
     *
     * <code>optional uint32 clicks_with_hidden_system_views = 1;</code>
     * @param value The clicksWithHiddenSystemViews to set.
     * @return This builder for chaining.
     */
    public Builder setClicksWithHiddenSystemViews(int value) {
      bitField0_ |= 0x00000001;
      clicksWithHiddenSystemViews_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of selections while the system views are hidden
     * </pre>
     *
     * <code>optional uint32 clicks_with_hidden_system_views = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearClicksWithHiddenSystemViews() {
      bitField0_ = (bitField0_ & ~0x00000001);
      clicksWithHiddenSystemViews_ = 0;
      onChanged();
      return this;
    }

    private int clicksWithVisibleSystemViews_ ;
    /**
     * <pre>
     * Number of selections while the system views are visible
     * </pre>
     *
     * <code>optional uint32 clicks_with_visible_system_views = 2;</code>
     * @return Whether the clicksWithVisibleSystemViews field is set.
     */
    public boolean hasClicksWithVisibleSystemViews() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Number of selections while the system views are visible
     * </pre>
     *
     * <code>optional uint32 clicks_with_visible_system_views = 2;</code>
     * @return The clicksWithVisibleSystemViews.
     */
    public int getClicksWithVisibleSystemViews() {
      return clicksWithVisibleSystemViews_;
    }
    /**
     * <pre>
     * Number of selections while the system views are visible
     * </pre>
     *
     * <code>optional uint32 clicks_with_visible_system_views = 2;</code>
     * @param value The clicksWithVisibleSystemViews to set.
     * @return This builder for chaining.
     */
    public Builder setClicksWithVisibleSystemViews(int value) {
      bitField0_ |= 0x00000002;
      clicksWithVisibleSystemViews_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of selections while the system views are visible
     * </pre>
     *
     * <code>optional uint32 clicks_with_visible_system_views = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearClicksWithVisibleSystemViews() {
      bitField0_ = (bitField0_ & ~0x00000002);
      clicksWithVisibleSystemViews_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.DynamicLayoutInspectorSystemNode)
  }

  // @@protoc_insertion_point(class_scope:android_studio.DynamicLayoutInspectorSystemNode)
  private static final com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode();
  }

  public static com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<DynamicLayoutInspectorSystemNode>
      PARSER = new com.google.protobuf.AbstractParser<DynamicLayoutInspectorSystemNode>() {
    @java.lang.Override
    public DynamicLayoutInspectorSystemNode parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DynamicLayoutInspectorSystemNode(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DynamicLayoutInspectorSystemNode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DynamicLayoutInspectorSystemNode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSystemNode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

