// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Logged when a user clicks a link in a Lint warning/error tooltip in the
 * code editor. We only do this for Lint issues where the issue vendor is
 * Google or AOSP.
 * </pre>
 *
 * Protobuf type {@code android_studio.LintTooltipLinkEvent}
 */
public final class LintTooltipLinkEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.LintTooltipLinkEvent)
    LintTooltipLinkEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LintTooltipLinkEvent.newBuilder() to construct.
  private LintTooltipLinkEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LintTooltipLinkEvent() {
    issueId_ = "";
    url_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LintTooltipLinkEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LintTooltipLinkEvent(
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
            issueId_ = bs;
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000002;
            url_ = bs;
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_LintTooltipLinkEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_LintTooltipLinkEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.LintTooltipLinkEvent.class, com.google.wireless.android.sdk.stats.LintTooltipLinkEvent.Builder.class);
  }

  private int bitField0_;
  public static final int ISSUE_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object issueId_;
  /**
   * <pre>
   * The issue id is a unique identifier for each type of coding issue found by
   * Lint. We only log a LintTooltipLinkEvent for issues where the vendor is
   * Google or AOSP. Examples of issue ids are "HardcodedText" and "NewApi".
   * </pre>
   *
   * <code>optional string issue_id = 1;</code>
   * @return Whether the issueId field is set.
   */
  @java.lang.Override
  public boolean hasIssueId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The issue id is a unique identifier for each type of coding issue found by
   * Lint. We only log a LintTooltipLinkEvent for issues where the vendor is
   * Google or AOSP. Examples of issue ids are "HardcodedText" and "NewApi".
   * </pre>
   *
   * <code>optional string issue_id = 1;</code>
   * @return The issueId.
   */
  @java.lang.Override
  public java.lang.String getIssueId() {
    java.lang.Object ref = issueId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        issueId_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * The issue id is a unique identifier for each type of coding issue found by
   * Lint. We only log a LintTooltipLinkEvent for issues where the vendor is
   * Google or AOSP. Examples of issue ids are "HardcodedText" and "NewApi".
   * </pre>
   *
   * <code>optional string issue_id = 1;</code>
   * @return The bytes for issueId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIssueIdBytes() {
    java.lang.Object ref = issueId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      issueId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URL_FIELD_NUMBER = 2;
  private volatile java.lang.Object url_;
  /**
   * <pre>
   * The URL of the link that was clicked, which will usually be to some
   * developer documentation or article. The URL is from the issue description.
   * The issue description was written by us (Google) as part of the lint check.
   * Examples of some of the URLs we link to:
   * https://developer.android.com/guide/topics/resources/localization.html
   * https://goo.gle/GetInstance
   * https://krebsonsecurity.com/2021/11/trojan-source-bug-threatens-the-security-of-all-code/
   * </pre>
   *
   * <code>optional string url = 2;</code>
   * @return Whether the url field is set.
   */
  @java.lang.Override
  public boolean hasUrl() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The URL of the link that was clicked, which will usually be to some
   * developer documentation or article. The URL is from the issue description.
   * The issue description was written by us (Google) as part of the lint check.
   * Examples of some of the URLs we link to:
   * https://developer.android.com/guide/topics/resources/localization.html
   * https://goo.gle/GetInstance
   * https://krebsonsecurity.com/2021/11/trojan-source-bug-threatens-the-security-of-all-code/
   * </pre>
   *
   * <code>optional string url = 2;</code>
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        url_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * The URL of the link that was clicked, which will usually be to some
   * developer documentation or article. The URL is from the issue description.
   * The issue description was written by us (Google) as part of the lint check.
   * Examples of some of the URLs we link to:
   * https://developer.android.com/guide/topics/resources/localization.html
   * https://goo.gle/GetInstance
   * https://krebsonsecurity.com/2021/11/trojan-source-bug-threatens-the-security-of-all-code/
   * </pre>
   *
   * <code>optional string url = 2;</code>
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, issueId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, url_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, issueId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, url_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.LintTooltipLinkEvent)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.LintTooltipLinkEvent other = (com.google.wireless.android.sdk.stats.LintTooltipLinkEvent) obj;

    if (hasIssueId() != other.hasIssueId()) return false;
    if (hasIssueId()) {
      if (!getIssueId()
          .equals(other.getIssueId())) return false;
    }
    if (hasUrl() != other.hasUrl()) return false;
    if (hasUrl()) {
      if (!getUrl()
          .equals(other.getUrl())) return false;
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
    if (hasIssueId()) {
      hash = (37 * hash) + ISSUE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getIssueId().hashCode();
    }
    if (hasUrl()) {
      hash = (37 * hash) + URL_FIELD_NUMBER;
      hash = (53 * hash) + getUrl().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.LintTooltipLinkEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.LintTooltipLinkEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.LintTooltipLinkEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.LintTooltipLinkEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.LintTooltipLinkEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.LintTooltipLinkEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.LintTooltipLinkEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.LintTooltipLinkEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.LintTooltipLinkEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.LintTooltipLinkEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.LintTooltipLinkEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.LintTooltipLinkEvent parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.LintTooltipLinkEvent prototype) {
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
   * Logged when a user clicks a link in a Lint warning/error tooltip in the
   * code editor. We only do this for Lint issues where the issue vendor is
   * Google or AOSP.
   * </pre>
   *
   * Protobuf type {@code android_studio.LintTooltipLinkEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.LintTooltipLinkEvent)
      com.google.wireless.android.sdk.stats.LintTooltipLinkEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_LintTooltipLinkEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_LintTooltipLinkEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.LintTooltipLinkEvent.class, com.google.wireless.android.sdk.stats.LintTooltipLinkEvent.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.LintTooltipLinkEvent.newBuilder()
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
      issueId_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      url_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_LintTooltipLinkEvent_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.LintTooltipLinkEvent getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.LintTooltipLinkEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.LintTooltipLinkEvent build() {
      com.google.wireless.android.sdk.stats.LintTooltipLinkEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.LintTooltipLinkEvent buildPartial() {
      com.google.wireless.android.sdk.stats.LintTooltipLinkEvent result = new com.google.wireless.android.sdk.stats.LintTooltipLinkEvent(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.issueId_ = issueId_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.url_ = url_;
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
      if (other instanceof com.google.wireless.android.sdk.stats.LintTooltipLinkEvent) {
        return mergeFrom((com.google.wireless.android.sdk.stats.LintTooltipLinkEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.LintTooltipLinkEvent other) {
      if (other == com.google.wireless.android.sdk.stats.LintTooltipLinkEvent.getDefaultInstance()) return this;
      if (other.hasIssueId()) {
        bitField0_ |= 0x00000001;
        issueId_ = other.issueId_;
        onChanged();
      }
      if (other.hasUrl()) {
        bitField0_ |= 0x00000002;
        url_ = other.url_;
        onChanged();
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
      com.google.wireless.android.sdk.stats.LintTooltipLinkEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.LintTooltipLinkEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object issueId_ = "";
    /**
     * <pre>
     * The issue id is a unique identifier for each type of coding issue found by
     * Lint. We only log a LintTooltipLinkEvent for issues where the vendor is
     * Google or AOSP. Examples of issue ids are "HardcodedText" and "NewApi".
     * </pre>
     *
     * <code>optional string issue_id = 1;</code>
     * @return Whether the issueId field is set.
     */
    public boolean hasIssueId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The issue id is a unique identifier for each type of coding issue found by
     * Lint. We only log a LintTooltipLinkEvent for issues where the vendor is
     * Google or AOSP. Examples of issue ids are "HardcodedText" and "NewApi".
     * </pre>
     *
     * <code>optional string issue_id = 1;</code>
     * @return The issueId.
     */
    public java.lang.String getIssueId() {
      java.lang.Object ref = issueId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          issueId_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The issue id is a unique identifier for each type of coding issue found by
     * Lint. We only log a LintTooltipLinkEvent for issues where the vendor is
     * Google or AOSP. Examples of issue ids are "HardcodedText" and "NewApi".
     * </pre>
     *
     * <code>optional string issue_id = 1;</code>
     * @return The bytes for issueId.
     */
    public com.google.protobuf.ByteString
        getIssueIdBytes() {
      java.lang.Object ref = issueId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        issueId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The issue id is a unique identifier for each type of coding issue found by
     * Lint. We only log a LintTooltipLinkEvent for issues where the vendor is
     * Google or AOSP. Examples of issue ids are "HardcodedText" and "NewApi".
     * </pre>
     *
     * <code>optional string issue_id = 1;</code>
     * @param value The issueId to set.
     * @return This builder for chaining.
     */
    public Builder setIssueId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      issueId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The issue id is a unique identifier for each type of coding issue found by
     * Lint. We only log a LintTooltipLinkEvent for issues where the vendor is
     * Google or AOSP. Examples of issue ids are "HardcodedText" and "NewApi".
     * </pre>
     *
     * <code>optional string issue_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIssueId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      issueId_ = getDefaultInstance().getIssueId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The issue id is a unique identifier for each type of coding issue found by
     * Lint. We only log a LintTooltipLinkEvent for issues where the vendor is
     * Google or AOSP. Examples of issue ids are "HardcodedText" and "NewApi".
     * </pre>
     *
     * <code>optional string issue_id = 1;</code>
     * @param value The bytes for issueId to set.
     * @return This builder for chaining.
     */
    public Builder setIssueIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      issueId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object url_ = "";
    /**
     * <pre>
     * The URL of the link that was clicked, which will usually be to some
     * developer documentation or article. The URL is from the issue description.
     * The issue description was written by us (Google) as part of the lint check.
     * Examples of some of the URLs we link to:
     * https://developer.android.com/guide/topics/resources/localization.html
     * https://goo.gle/GetInstance
     * https://krebsonsecurity.com/2021/11/trojan-source-bug-threatens-the-security-of-all-code/
     * </pre>
     *
     * <code>optional string url = 2;</code>
     * @return Whether the url field is set.
     */
    public boolean hasUrl() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The URL of the link that was clicked, which will usually be to some
     * developer documentation or article. The URL is from the issue description.
     * The issue description was written by us (Google) as part of the lint check.
     * Examples of some of the URLs we link to:
     * https://developer.android.com/guide/topics/resources/localization.html
     * https://goo.gle/GetInstance
     * https://krebsonsecurity.com/2021/11/trojan-source-bug-threatens-the-security-of-all-code/
     * </pre>
     *
     * <code>optional string url = 2;</code>
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          url_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The URL of the link that was clicked, which will usually be to some
     * developer documentation or article. The URL is from the issue description.
     * The issue description was written by us (Google) as part of the lint check.
     * Examples of some of the URLs we link to:
     * https://developer.android.com/guide/topics/resources/localization.html
     * https://goo.gle/GetInstance
     * https://krebsonsecurity.com/2021/11/trojan-source-bug-threatens-the-security-of-all-code/
     * </pre>
     *
     * <code>optional string url = 2;</code>
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The URL of the link that was clicked, which will usually be to some
     * developer documentation or article. The URL is from the issue description.
     * The issue description was written by us (Google) as part of the lint check.
     * Examples of some of the URLs we link to:
     * https://developer.android.com/guide/topics/resources/localization.html
     * https://goo.gle/GetInstance
     * https://krebsonsecurity.com/2021/11/trojan-source-bug-threatens-the-security-of-all-code/
     * </pre>
     *
     * <code>optional string url = 2;</code>
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      url_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The URL of the link that was clicked, which will usually be to some
     * developer documentation or article. The URL is from the issue description.
     * The issue description was written by us (Google) as part of the lint check.
     * Examples of some of the URLs we link to:
     * https://developer.android.com/guide/topics/resources/localization.html
     * https://goo.gle/GetInstance
     * https://krebsonsecurity.com/2021/11/trojan-source-bug-threatens-the-security-of-all-code/
     * </pre>
     *
     * <code>optional string url = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      bitField0_ = (bitField0_ & ~0x00000002);
      url_ = getDefaultInstance().getUrl();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The URL of the link that was clicked, which will usually be to some
     * developer documentation or article. The URL is from the issue description.
     * The issue description was written by us (Google) as part of the lint check.
     * Examples of some of the URLs we link to:
     * https://developer.android.com/guide/topics/resources/localization.html
     * https://goo.gle/GetInstance
     * https://krebsonsecurity.com/2021/11/trojan-source-bug-threatens-the-security-of-all-code/
     * </pre>
     *
     * <code>optional string url = 2;</code>
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      url_ = value;
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


    // @@protoc_insertion_point(builder_scope:android_studio.LintTooltipLinkEvent)
  }

  // @@protoc_insertion_point(class_scope:android_studio.LintTooltipLinkEvent)
  private static final com.google.wireless.android.sdk.stats.LintTooltipLinkEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.LintTooltipLinkEvent();
  }

  public static com.google.wireless.android.sdk.stats.LintTooltipLinkEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<LintTooltipLinkEvent>
      PARSER = new com.google.protobuf.AbstractParser<LintTooltipLinkEvent>() {
    @java.lang.Override
    public LintTooltipLinkEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LintTooltipLinkEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LintTooltipLinkEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LintTooltipLinkEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.LintTooltipLinkEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

