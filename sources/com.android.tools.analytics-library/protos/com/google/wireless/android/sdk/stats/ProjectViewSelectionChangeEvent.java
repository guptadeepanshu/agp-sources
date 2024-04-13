// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * Protobuf type {@code android_studio.ProjectViewSelectionChangeEvent}
 */
public final class ProjectViewSelectionChangeEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.ProjectViewSelectionChangeEvent)
    ProjectViewSelectionChangeEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProjectViewSelectionChangeEvent.newBuilder() to construct.
  private ProjectViewSelectionChangeEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProjectViewSelectionChangeEvent() {
    viewBeforeChange_ = 0;
    viewAfterChange_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProjectViewSelectionChangeEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ProjectViewSelectionChangeEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ProjectViewSelectionChangeEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.class, com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.ProjectViewSelectionChangeEvent.ProjectViewContent}
   */
  public enum ProjectViewContent
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>ANDROID = 1;</code>
     */
    ANDROID(1),
    /**
     * <code>PROJECT = 2;</code>
     */
    PROJECT(2),
    /**
     * <code>OTHER = 3;</code>
     */
    OTHER(3),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>ANDROID = 1;</code>
     */
    public static final int ANDROID_VALUE = 1;
    /**
     * <code>PROJECT = 2;</code>
     */
    public static final int PROJECT_VALUE = 2;
    /**
     * <code>OTHER = 3;</code>
     */
    public static final int OTHER_VALUE = 3;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ProjectViewContent valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ProjectViewContent forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return ANDROID;
        case 2: return PROJECT;
        case 3: return OTHER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ProjectViewContent>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ProjectViewContent> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ProjectViewContent>() {
            public ProjectViewContent findValueByNumber(int number) {
              return ProjectViewContent.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.getDescriptor().getEnumTypes().get(0);
    }

    private static final ProjectViewContent[] VALUES = values();

    public static ProjectViewContent valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ProjectViewContent(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.ProjectViewSelectionChangeEvent.ProjectViewContent)
  }

  private int bitField0_;
  public static final int VIEW_BEFORE_CHANGE_FIELD_NUMBER = 1;
  private int viewBeforeChange_;
  /**
   * <pre>
   * For init event 'before' will be UNKNOWN
   * </pre>
   *
   * <code>optional .android_studio.ProjectViewSelectionChangeEvent.ProjectViewContent view_before_change = 1;</code>
   * @return Whether the viewBeforeChange field is set.
   */
  @java.lang.Override public boolean hasViewBeforeChange() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * For init event 'before' will be UNKNOWN
   * </pre>
   *
   * <code>optional .android_studio.ProjectViewSelectionChangeEvent.ProjectViewContent view_before_change = 1;</code>
   * @return The viewBeforeChange.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.ProjectViewContent getViewBeforeChange() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.ProjectViewContent result = com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.ProjectViewContent.valueOf(viewBeforeChange_);
    return result == null ? com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.ProjectViewContent.UNKNOWN : result;
  }

  public static final int VIEW_AFTER_CHANGE_FIELD_NUMBER = 2;
  private int viewAfterChange_;
  /**
   * <code>optional .android_studio.ProjectViewSelectionChangeEvent.ProjectViewContent view_after_change = 2;</code>
   * @return Whether the viewAfterChange field is set.
   */
  @java.lang.Override public boolean hasViewAfterChange() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .android_studio.ProjectViewSelectionChangeEvent.ProjectViewContent view_after_change = 2;</code>
   * @return The viewAfterChange.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.ProjectViewContent getViewAfterChange() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.ProjectViewContent result = com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.ProjectViewContent.valueOf(viewAfterChange_);
    return result == null ? com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.ProjectViewContent.UNKNOWN : result;
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
      output.writeEnum(1, viewBeforeChange_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeEnum(2, viewAfterChange_);
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
        .computeEnumSize(1, viewBeforeChange_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, viewAfterChange_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent other = (com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent) obj;

    if (hasViewBeforeChange() != other.hasViewBeforeChange()) return false;
    if (hasViewBeforeChange()) {
      if (viewBeforeChange_ != other.viewBeforeChange_) return false;
    }
    if (hasViewAfterChange() != other.hasViewAfterChange()) return false;
    if (hasViewAfterChange()) {
      if (viewAfterChange_ != other.viewAfterChange_) return false;
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
    if (hasViewBeforeChange()) {
      hash = (37 * hash) + VIEW_BEFORE_CHANGE_FIELD_NUMBER;
      hash = (53 * hash) + viewBeforeChange_;
    }
    if (hasViewAfterChange()) {
      hash = (37 * hash) + VIEW_AFTER_CHANGE_FIELD_NUMBER;
      hash = (53 * hash) + viewAfterChange_;
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent prototype) {
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
   * Protobuf type {@code android_studio.ProjectViewSelectionChangeEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.ProjectViewSelectionChangeEvent)
      com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ProjectViewSelectionChangeEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ProjectViewSelectionChangeEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.class, com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      viewBeforeChange_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      viewAfterChange_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_ProjectViewSelectionChangeEvent_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent build() {
      com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent buildPartial() {
      com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent result = new com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.viewBeforeChange_ = viewBeforeChange_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.viewAfterChange_ = viewAfterChange_;
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
      if (other instanceof com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent) {
        return mergeFrom((com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent other) {
      if (other == com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.getDefaultInstance()) return this;
      if (other.hasViewBeforeChange()) {
        setViewBeforeChange(other.getViewBeforeChange());
      }
      if (other.hasViewAfterChange()) {
        setViewAfterChange(other.getViewAfterChange());
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
              com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.ProjectViewContent tmpValue =
                  com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.ProjectViewContent.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(1, tmpRaw);
              } else {
                viewBeforeChange_ = tmpRaw;
                bitField0_ |= 0x00000001;
              }
              break;
            } // case 8
            case 16: {
              int tmpRaw = input.readEnum();
              com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.ProjectViewContent tmpValue =
                  com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.ProjectViewContent.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(2, tmpRaw);
              } else {
                viewAfterChange_ = tmpRaw;
                bitField0_ |= 0x00000002;
              }
              break;
            } // case 16
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

    private int viewBeforeChange_ = 0;
    /**
     * <pre>
     * For init event 'before' will be UNKNOWN
     * </pre>
     *
     * <code>optional .android_studio.ProjectViewSelectionChangeEvent.ProjectViewContent view_before_change = 1;</code>
     * @return Whether the viewBeforeChange field is set.
     */
    @java.lang.Override public boolean hasViewBeforeChange() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * For init event 'before' will be UNKNOWN
     * </pre>
     *
     * <code>optional .android_studio.ProjectViewSelectionChangeEvent.ProjectViewContent view_before_change = 1;</code>
     * @return The viewBeforeChange.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.ProjectViewContent getViewBeforeChange() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.ProjectViewContent result = com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.ProjectViewContent.valueOf(viewBeforeChange_);
      return result == null ? com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.ProjectViewContent.UNKNOWN : result;
    }
    /**
     * <pre>
     * For init event 'before' will be UNKNOWN
     * </pre>
     *
     * <code>optional .android_studio.ProjectViewSelectionChangeEvent.ProjectViewContent view_before_change = 1;</code>
     * @param value The viewBeforeChange to set.
     * @return This builder for chaining.
     */
    public Builder setViewBeforeChange(com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.ProjectViewContent value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      viewBeforeChange_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * For init event 'before' will be UNKNOWN
     * </pre>
     *
     * <code>optional .android_studio.ProjectViewSelectionChangeEvent.ProjectViewContent view_before_change = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearViewBeforeChange() {
      bitField0_ = (bitField0_ & ~0x00000001);
      viewBeforeChange_ = 0;
      onChanged();
      return this;
    }

    private int viewAfterChange_ = 0;
    /**
     * <code>optional .android_studio.ProjectViewSelectionChangeEvent.ProjectViewContent view_after_change = 2;</code>
     * @return Whether the viewAfterChange field is set.
     */
    @java.lang.Override public boolean hasViewAfterChange() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .android_studio.ProjectViewSelectionChangeEvent.ProjectViewContent view_after_change = 2;</code>
     * @return The viewAfterChange.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.ProjectViewContent getViewAfterChange() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.ProjectViewContent result = com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.ProjectViewContent.valueOf(viewAfterChange_);
      return result == null ? com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.ProjectViewContent.UNKNOWN : result;
    }
    /**
     * <code>optional .android_studio.ProjectViewSelectionChangeEvent.ProjectViewContent view_after_change = 2;</code>
     * @param value The viewAfterChange to set.
     * @return This builder for chaining.
     */
    public Builder setViewAfterChange(com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent.ProjectViewContent value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      viewAfterChange_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .android_studio.ProjectViewSelectionChangeEvent.ProjectViewContent view_after_change = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearViewAfterChange() {
      bitField0_ = (bitField0_ & ~0x00000002);
      viewAfterChange_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.ProjectViewSelectionChangeEvent)
  }

  // @@protoc_insertion_point(class_scope:android_studio.ProjectViewSelectionChangeEvent)
  private static final com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent();
  }

  public static com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ProjectViewSelectionChangeEvent>
      PARSER = new com.google.protobuf.AbstractParser<ProjectViewSelectionChangeEvent>() {
    @java.lang.Override
    public ProjectViewSelectionChangeEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<ProjectViewSelectionChangeEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProjectViewSelectionChangeEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.ProjectViewSelectionChangeEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
