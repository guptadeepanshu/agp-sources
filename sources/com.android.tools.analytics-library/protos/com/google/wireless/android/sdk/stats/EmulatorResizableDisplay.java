// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Metrics for resizable display details
 * </pre>
 *
 * Protobuf type {@code android_studio.EmulatorResizableDisplay}
 */
public final class EmulatorResizableDisplay extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.EmulatorResizableDisplay)
    EmulatorResizableDisplayOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EmulatorResizableDisplay.newBuilder() to construct.
  private EmulatorResizableDisplay(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EmulatorResizableDisplay() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EmulatorResizableDisplay();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EmulatorResizableDisplay(
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
            displayPhoneCount_ = input.readUInt32();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            displayFoldableCount_ = input.readUInt32();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            displayTabletCount_ = input.readUInt32();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000008;
            displayDesktopCount_ = input.readUInt32();
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorResizableDisplay_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorResizableDisplay_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.EmulatorResizableDisplay.class, com.google.wireless.android.sdk.stats.EmulatorResizableDisplay.Builder.class);
  }

  private int bitField0_;
  public static final int DISPLAY_PHONE_COUNT_FIELD_NUMBER = 1;
  private int displayPhoneCount_;
  /**
   * <pre>
   * Counts for different display size types
   * </pre>
   *
   * <code>optional uint32 display_phone_count = 1;</code>
   * @return Whether the displayPhoneCount field is set.
   */
  @java.lang.Override
  public boolean hasDisplayPhoneCount() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Counts for different display size types
   * </pre>
   *
   * <code>optional uint32 display_phone_count = 1;</code>
   * @return The displayPhoneCount.
   */
  @java.lang.Override
  public int getDisplayPhoneCount() {
    return displayPhoneCount_;
  }

  public static final int DISPLAY_FOLDABLE_COUNT_FIELD_NUMBER = 2;
  private int displayFoldableCount_;
  /**
   * <code>optional uint32 display_foldable_count = 2;</code>
   * @return Whether the displayFoldableCount field is set.
   */
  @java.lang.Override
  public boolean hasDisplayFoldableCount() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional uint32 display_foldable_count = 2;</code>
   * @return The displayFoldableCount.
   */
  @java.lang.Override
  public int getDisplayFoldableCount() {
    return displayFoldableCount_;
  }

  public static final int DISPLAY_TABLET_COUNT_FIELD_NUMBER = 3;
  private int displayTabletCount_;
  /**
   * <code>optional uint32 display_tablet_count = 3;</code>
   * @return Whether the displayTabletCount field is set.
   */
  @java.lang.Override
  public boolean hasDisplayTabletCount() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional uint32 display_tablet_count = 3;</code>
   * @return The displayTabletCount.
   */
  @java.lang.Override
  public int getDisplayTabletCount() {
    return displayTabletCount_;
  }

  public static final int DISPLAY_DESKTOP_COUNT_FIELD_NUMBER = 4;
  private int displayDesktopCount_;
  /**
   * <code>optional uint32 display_desktop_count = 4;</code>
   * @return Whether the displayDesktopCount field is set.
   */
  @java.lang.Override
  public boolean hasDisplayDesktopCount() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>optional uint32 display_desktop_count = 4;</code>
   * @return The displayDesktopCount.
   */
  @java.lang.Override
  public int getDisplayDesktopCount() {
    return displayDesktopCount_;
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
      output.writeUInt32(1, displayPhoneCount_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeUInt32(2, displayFoldableCount_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeUInt32(3, displayTabletCount_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeUInt32(4, displayDesktopCount_);
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
        .computeUInt32Size(1, displayPhoneCount_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, displayFoldableCount_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, displayTabletCount_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, displayDesktopCount_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.EmulatorResizableDisplay)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.EmulatorResizableDisplay other = (com.google.wireless.android.sdk.stats.EmulatorResizableDisplay) obj;

    if (hasDisplayPhoneCount() != other.hasDisplayPhoneCount()) return false;
    if (hasDisplayPhoneCount()) {
      if (getDisplayPhoneCount()
          != other.getDisplayPhoneCount()) return false;
    }
    if (hasDisplayFoldableCount() != other.hasDisplayFoldableCount()) return false;
    if (hasDisplayFoldableCount()) {
      if (getDisplayFoldableCount()
          != other.getDisplayFoldableCount()) return false;
    }
    if (hasDisplayTabletCount() != other.hasDisplayTabletCount()) return false;
    if (hasDisplayTabletCount()) {
      if (getDisplayTabletCount()
          != other.getDisplayTabletCount()) return false;
    }
    if (hasDisplayDesktopCount() != other.hasDisplayDesktopCount()) return false;
    if (hasDisplayDesktopCount()) {
      if (getDisplayDesktopCount()
          != other.getDisplayDesktopCount()) return false;
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
    if (hasDisplayPhoneCount()) {
      hash = (37 * hash) + DISPLAY_PHONE_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getDisplayPhoneCount();
    }
    if (hasDisplayFoldableCount()) {
      hash = (37 * hash) + DISPLAY_FOLDABLE_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getDisplayFoldableCount();
    }
    if (hasDisplayTabletCount()) {
      hash = (37 * hash) + DISPLAY_TABLET_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getDisplayTabletCount();
    }
    if (hasDisplayDesktopCount()) {
      hash = (37 * hash) + DISPLAY_DESKTOP_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getDisplayDesktopCount();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.EmulatorResizableDisplay parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorResizableDisplay parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorResizableDisplay parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorResizableDisplay parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorResizableDisplay parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorResizableDisplay parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorResizableDisplay parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorResizableDisplay parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorResizableDisplay parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorResizableDisplay parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorResizableDisplay parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.EmulatorResizableDisplay parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.EmulatorResizableDisplay prototype) {
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
   * Metrics for resizable display details
   * </pre>
   *
   * Protobuf type {@code android_studio.EmulatorResizableDisplay}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.EmulatorResizableDisplay)
      com.google.wireless.android.sdk.stats.EmulatorResizableDisplayOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorResizableDisplay_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorResizableDisplay_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.EmulatorResizableDisplay.class, com.google.wireless.android.sdk.stats.EmulatorResizableDisplay.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.EmulatorResizableDisplay.newBuilder()
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
      displayPhoneCount_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      displayFoldableCount_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      displayTabletCount_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      displayDesktopCount_ = 0;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_EmulatorResizableDisplay_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.EmulatorResizableDisplay getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.EmulatorResizableDisplay.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.EmulatorResizableDisplay build() {
      com.google.wireless.android.sdk.stats.EmulatorResizableDisplay result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.EmulatorResizableDisplay buildPartial() {
      com.google.wireless.android.sdk.stats.EmulatorResizableDisplay result = new com.google.wireless.android.sdk.stats.EmulatorResizableDisplay(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.displayPhoneCount_ = displayPhoneCount_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.displayFoldableCount_ = displayFoldableCount_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.displayTabletCount_ = displayTabletCount_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.displayDesktopCount_ = displayDesktopCount_;
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
      if (other instanceof com.google.wireless.android.sdk.stats.EmulatorResizableDisplay) {
        return mergeFrom((com.google.wireless.android.sdk.stats.EmulatorResizableDisplay)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.EmulatorResizableDisplay other) {
      if (other == com.google.wireless.android.sdk.stats.EmulatorResizableDisplay.getDefaultInstance()) return this;
      if (other.hasDisplayPhoneCount()) {
        setDisplayPhoneCount(other.getDisplayPhoneCount());
      }
      if (other.hasDisplayFoldableCount()) {
        setDisplayFoldableCount(other.getDisplayFoldableCount());
      }
      if (other.hasDisplayTabletCount()) {
        setDisplayTabletCount(other.getDisplayTabletCount());
      }
      if (other.hasDisplayDesktopCount()) {
        setDisplayDesktopCount(other.getDisplayDesktopCount());
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
      com.google.wireless.android.sdk.stats.EmulatorResizableDisplay parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.EmulatorResizableDisplay) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int displayPhoneCount_ ;
    /**
     * <pre>
     * Counts for different display size types
     * </pre>
     *
     * <code>optional uint32 display_phone_count = 1;</code>
     * @return Whether the displayPhoneCount field is set.
     */
    @java.lang.Override
    public boolean hasDisplayPhoneCount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Counts for different display size types
     * </pre>
     *
     * <code>optional uint32 display_phone_count = 1;</code>
     * @return The displayPhoneCount.
     */
    @java.lang.Override
    public int getDisplayPhoneCount() {
      return displayPhoneCount_;
    }
    /**
     * <pre>
     * Counts for different display size types
     * </pre>
     *
     * <code>optional uint32 display_phone_count = 1;</code>
     * @param value The displayPhoneCount to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayPhoneCount(int value) {
      bitField0_ |= 0x00000001;
      displayPhoneCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Counts for different display size types
     * </pre>
     *
     * <code>optional uint32 display_phone_count = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplayPhoneCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      displayPhoneCount_ = 0;
      onChanged();
      return this;
    }

    private int displayFoldableCount_ ;
    /**
     * <code>optional uint32 display_foldable_count = 2;</code>
     * @return Whether the displayFoldableCount field is set.
     */
    @java.lang.Override
    public boolean hasDisplayFoldableCount() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional uint32 display_foldable_count = 2;</code>
     * @return The displayFoldableCount.
     */
    @java.lang.Override
    public int getDisplayFoldableCount() {
      return displayFoldableCount_;
    }
    /**
     * <code>optional uint32 display_foldable_count = 2;</code>
     * @param value The displayFoldableCount to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayFoldableCount(int value) {
      bitField0_ |= 0x00000002;
      displayFoldableCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 display_foldable_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplayFoldableCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      displayFoldableCount_ = 0;
      onChanged();
      return this;
    }

    private int displayTabletCount_ ;
    /**
     * <code>optional uint32 display_tablet_count = 3;</code>
     * @return Whether the displayTabletCount field is set.
     */
    @java.lang.Override
    public boolean hasDisplayTabletCount() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional uint32 display_tablet_count = 3;</code>
     * @return The displayTabletCount.
     */
    @java.lang.Override
    public int getDisplayTabletCount() {
      return displayTabletCount_;
    }
    /**
     * <code>optional uint32 display_tablet_count = 3;</code>
     * @param value The displayTabletCount to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayTabletCount(int value) {
      bitField0_ |= 0x00000004;
      displayTabletCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 display_tablet_count = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplayTabletCount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      displayTabletCount_ = 0;
      onChanged();
      return this;
    }

    private int displayDesktopCount_ ;
    /**
     * <code>optional uint32 display_desktop_count = 4;</code>
     * @return Whether the displayDesktopCount field is set.
     */
    @java.lang.Override
    public boolean hasDisplayDesktopCount() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional uint32 display_desktop_count = 4;</code>
     * @return The displayDesktopCount.
     */
    @java.lang.Override
    public int getDisplayDesktopCount() {
      return displayDesktopCount_;
    }
    /**
     * <code>optional uint32 display_desktop_count = 4;</code>
     * @param value The displayDesktopCount to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayDesktopCount(int value) {
      bitField0_ |= 0x00000008;
      displayDesktopCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 display_desktop_count = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplayDesktopCount() {
      bitField0_ = (bitField0_ & ~0x00000008);
      displayDesktopCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.EmulatorResizableDisplay)
  }

  // @@protoc_insertion_point(class_scope:android_studio.EmulatorResizableDisplay)
  private static final com.google.wireless.android.sdk.stats.EmulatorResizableDisplay DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.EmulatorResizableDisplay();
  }

  public static com.google.wireless.android.sdk.stats.EmulatorResizableDisplay getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<EmulatorResizableDisplay>
      PARSER = new com.google.protobuf.AbstractParser<EmulatorResizableDisplay>() {
    @java.lang.Override
    public EmulatorResizableDisplay parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EmulatorResizableDisplay(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EmulatorResizableDisplay> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EmulatorResizableDisplay> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.EmulatorResizableDisplay getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

