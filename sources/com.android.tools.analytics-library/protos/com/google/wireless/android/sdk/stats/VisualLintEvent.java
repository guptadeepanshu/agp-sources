// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * <pre>
 * Details of an event linked to visual linting
 * </pre>
 *
 * Protobuf type {@code android_studio.VisualLintEvent}
 */
public  final class VisualLintEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.VisualLintEvent)
    VisualLintEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VisualLintEvent.newBuilder() to construct.
  private VisualLintEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VisualLintEvent() {
    issueType_ = 0;
    issueEvent_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VisualLintEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VisualLintEvent(
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
            com.google.wireless.android.sdk.stats.VisualLintEvent.IssueType value = com.google.wireless.android.sdk.stats.VisualLintEvent.IssueType.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(1, rawValue);
            } else {
              bitField0_ |= 0x00000001;
              issueType_ = rawValue;
            }
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
              @SuppressWarnings("deprecation")
            com.google.wireless.android.sdk.stats.VisualLintEvent.IssueEvent value = com.google.wireless.android.sdk.stats.VisualLintEvent.IssueEvent.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(2, rawValue);
            } else {
              bitField0_ |= 0x00000002;
              issueEvent_ = rawValue;
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
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_VisualLintEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_VisualLintEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.VisualLintEvent.class, com.google.wireless.android.sdk.stats.VisualLintEvent.Builder.class);
  }

  /**
   * <pre>
   * Type of issues creating by visual linting
   * </pre>
   *
   * Protobuf enum {@code android_studio.VisualLintEvent.IssueType}
   */
  public enum IssueType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_TYPE = 0;</code>
     */
    UNKNOWN_TYPE(0),
    /**
     * <code>BOUNDS = 1;</code>
     */
    BOUNDS(1),
    /**
     * <code>BOTTOM_NAV = 2;</code>
     */
    BOTTOM_NAV(2),
    /**
     * <code>BOTTOM_APP_BAR = 3;</code>
     */
    BOTTOM_APP_BAR(3),
    /**
     * <code>OVERLAP = 4;</code>
     */
    OVERLAP(4),
    /**
     * <code>LONG_TEXT = 5;</code>
     */
    LONG_TEXT(5),
    /**
     * <code>ATF = 6;</code>
     */
    ATF(6),
    /**
     * <code>LOCALE_TEXT = 7;</code>
     */
    LOCALE_TEXT(7),
    ;

    /**
     * <code>UNKNOWN_TYPE = 0;</code>
     */
    public static final int UNKNOWN_TYPE_VALUE = 0;
    /**
     * <code>BOUNDS = 1;</code>
     */
    public static final int BOUNDS_VALUE = 1;
    /**
     * <code>BOTTOM_NAV = 2;</code>
     */
    public static final int BOTTOM_NAV_VALUE = 2;
    /**
     * <code>BOTTOM_APP_BAR = 3;</code>
     */
    public static final int BOTTOM_APP_BAR_VALUE = 3;
    /**
     * <code>OVERLAP = 4;</code>
     */
    public static final int OVERLAP_VALUE = 4;
    /**
     * <code>LONG_TEXT = 5;</code>
     */
    public static final int LONG_TEXT_VALUE = 5;
    /**
     * <code>ATF = 6;</code>
     */
    public static final int ATF_VALUE = 6;
    /**
     * <code>LOCALE_TEXT = 7;</code>
     */
    public static final int LOCALE_TEXT_VALUE = 7;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static IssueType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static IssueType forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_TYPE;
        case 1: return BOUNDS;
        case 2: return BOTTOM_NAV;
        case 3: return BOTTOM_APP_BAR;
        case 4: return OVERLAP;
        case 5: return LONG_TEXT;
        case 6: return ATF;
        case 7: return LOCALE_TEXT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<IssueType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        IssueType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<IssueType>() {
            public IssueType findValueByNumber(int number) {
              return IssueType.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.VisualLintEvent.getDescriptor().getEnumTypes().get(0);
    }

    private static final IssueType[] VALUES = values();

    public static IssueType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private IssueType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.VisualLintEvent.IssueType)
  }

  /**
   * <pre>
   * Type of events affecting visual lint issues
   * </pre>
   *
   * Protobuf enum {@code android_studio.VisualLintEvent.IssueEvent}
   */
  public enum IssueEvent
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_EVENT = 0;</code>
     */
    UNKNOWN_EVENT(0),
    /**
     * <code>CREATE_ISSUE = 1;</code>
     */
    CREATE_ISSUE(1),
    /**
     * <code>EXPAND_ISSUE = 2;</code>
     */
    EXPAND_ISSUE(2),
    /**
     * <code>IGNORE_ISSUE = 3;</code>
     */
    IGNORE_ISSUE(3),
    ;

    /**
     * <code>UNKNOWN_EVENT = 0;</code>
     */
    public static final int UNKNOWN_EVENT_VALUE = 0;
    /**
     * <code>CREATE_ISSUE = 1;</code>
     */
    public static final int CREATE_ISSUE_VALUE = 1;
    /**
     * <code>EXPAND_ISSUE = 2;</code>
     */
    public static final int EXPAND_ISSUE_VALUE = 2;
    /**
     * <code>IGNORE_ISSUE = 3;</code>
     */
    public static final int IGNORE_ISSUE_VALUE = 3;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static IssueEvent valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static IssueEvent forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_EVENT;
        case 1: return CREATE_ISSUE;
        case 2: return EXPAND_ISSUE;
        case 3: return IGNORE_ISSUE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<IssueEvent>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        IssueEvent> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<IssueEvent>() {
            public IssueEvent findValueByNumber(int number) {
              return IssueEvent.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.VisualLintEvent.getDescriptor().getEnumTypes().get(1);
    }

    private static final IssueEvent[] VALUES = values();

    public static IssueEvent valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private IssueEvent(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.VisualLintEvent.IssueEvent)
  }

  private int bitField0_;
  public static final int ISSUE_TYPE_FIELD_NUMBER = 1;
  private int issueType_;
  /**
   * <pre>
   * The type of the visual lint issue affected by this event
   * </pre>
   *
   * <code>optional .android_studio.VisualLintEvent.IssueType issue_type = 1;</code>
   * @return Whether the issueType field is set.
   */
  public boolean hasIssueType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The type of the visual lint issue affected by this event
   * </pre>
   *
   * <code>optional .android_studio.VisualLintEvent.IssueType issue_type = 1;</code>
   * @return The issueType.
   */
  public com.google.wireless.android.sdk.stats.VisualLintEvent.IssueType getIssueType() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.VisualLintEvent.IssueType result = com.google.wireless.android.sdk.stats.VisualLintEvent.IssueType.valueOf(issueType_);
    return result == null ? com.google.wireless.android.sdk.stats.VisualLintEvent.IssueType.UNKNOWN_TYPE : result;
  }

  public static final int ISSUE_EVENT_FIELD_NUMBER = 2;
  private int issueEvent_;
  /**
   * <pre>
   * The kind of event affecting the issue
   * </pre>
   *
   * <code>optional .android_studio.VisualLintEvent.IssueEvent issue_event = 2;</code>
   * @return Whether the issueEvent field is set.
   */
  public boolean hasIssueEvent() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The kind of event affecting the issue
   * </pre>
   *
   * <code>optional .android_studio.VisualLintEvent.IssueEvent issue_event = 2;</code>
   * @return The issueEvent.
   */
  public com.google.wireless.android.sdk.stats.VisualLintEvent.IssueEvent getIssueEvent() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.VisualLintEvent.IssueEvent result = com.google.wireless.android.sdk.stats.VisualLintEvent.IssueEvent.valueOf(issueEvent_);
    return result == null ? com.google.wireless.android.sdk.stats.VisualLintEvent.IssueEvent.UNKNOWN_EVENT : result;
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
      output.writeEnum(1, issueType_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeEnum(2, issueEvent_);
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
        .computeEnumSize(1, issueType_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, issueEvent_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.VisualLintEvent)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.VisualLintEvent other = (com.google.wireless.android.sdk.stats.VisualLintEvent) obj;

    if (hasIssueType() != other.hasIssueType()) return false;
    if (hasIssueType()) {
      if (issueType_ != other.issueType_) return false;
    }
    if (hasIssueEvent() != other.hasIssueEvent()) return false;
    if (hasIssueEvent()) {
      if (issueEvent_ != other.issueEvent_) return false;
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
    if (hasIssueType()) {
      hash = (37 * hash) + ISSUE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + issueType_;
    }
    if (hasIssueEvent()) {
      hash = (37 * hash) + ISSUE_EVENT_FIELD_NUMBER;
      hash = (53 * hash) + issueEvent_;
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.VisualLintEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.VisualLintEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.VisualLintEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.VisualLintEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.VisualLintEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.VisualLintEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.VisualLintEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.VisualLintEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.VisualLintEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.VisualLintEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.VisualLintEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.VisualLintEvent parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.VisualLintEvent prototype) {
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
   * Details of an event linked to visual linting
   * </pre>
   *
   * Protobuf type {@code android_studio.VisualLintEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.VisualLintEvent)
      com.google.wireless.android.sdk.stats.VisualLintEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_VisualLintEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_VisualLintEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.VisualLintEvent.class, com.google.wireless.android.sdk.stats.VisualLintEvent.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.VisualLintEvent.newBuilder()
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
      issueType_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      issueEvent_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_VisualLintEvent_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.VisualLintEvent getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.VisualLintEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.VisualLintEvent build() {
      com.google.wireless.android.sdk.stats.VisualLintEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.VisualLintEvent buildPartial() {
      com.google.wireless.android.sdk.stats.VisualLintEvent result = new com.google.wireless.android.sdk.stats.VisualLintEvent(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.issueType_ = issueType_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.issueEvent_ = issueEvent_;
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
      if (other instanceof com.google.wireless.android.sdk.stats.VisualLintEvent) {
        return mergeFrom((com.google.wireless.android.sdk.stats.VisualLintEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.VisualLintEvent other) {
      if (other == com.google.wireless.android.sdk.stats.VisualLintEvent.getDefaultInstance()) return this;
      if (other.hasIssueType()) {
        setIssueType(other.getIssueType());
      }
      if (other.hasIssueEvent()) {
        setIssueEvent(other.getIssueEvent());
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
      com.google.wireless.android.sdk.stats.VisualLintEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.wireless.android.sdk.stats.VisualLintEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int issueType_ = 0;
    /**
     * <pre>
     * The type of the visual lint issue affected by this event
     * </pre>
     *
     * <code>optional .android_studio.VisualLintEvent.IssueType issue_type = 1;</code>
     * @return Whether the issueType field is set.
     */
    public boolean hasIssueType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The type of the visual lint issue affected by this event
     * </pre>
     *
     * <code>optional .android_studio.VisualLintEvent.IssueType issue_type = 1;</code>
     * @return The issueType.
     */
    public com.google.wireless.android.sdk.stats.VisualLintEvent.IssueType getIssueType() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.VisualLintEvent.IssueType result = com.google.wireless.android.sdk.stats.VisualLintEvent.IssueType.valueOf(issueType_);
      return result == null ? com.google.wireless.android.sdk.stats.VisualLintEvent.IssueType.UNKNOWN_TYPE : result;
    }
    /**
     * <pre>
     * The type of the visual lint issue affected by this event
     * </pre>
     *
     * <code>optional .android_studio.VisualLintEvent.IssueType issue_type = 1;</code>
     * @param value The issueType to set.
     * @return This builder for chaining.
     */
    public Builder setIssueType(com.google.wireless.android.sdk.stats.VisualLintEvent.IssueType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      issueType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the visual lint issue affected by this event
     * </pre>
     *
     * <code>optional .android_studio.VisualLintEvent.IssueType issue_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIssueType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      issueType_ = 0;
      onChanged();
      return this;
    }

    private int issueEvent_ = 0;
    /**
     * <pre>
     * The kind of event affecting the issue
     * </pre>
     *
     * <code>optional .android_studio.VisualLintEvent.IssueEvent issue_event = 2;</code>
     * @return Whether the issueEvent field is set.
     */
    public boolean hasIssueEvent() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The kind of event affecting the issue
     * </pre>
     *
     * <code>optional .android_studio.VisualLintEvent.IssueEvent issue_event = 2;</code>
     * @return The issueEvent.
     */
    public com.google.wireless.android.sdk.stats.VisualLintEvent.IssueEvent getIssueEvent() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.VisualLintEvent.IssueEvent result = com.google.wireless.android.sdk.stats.VisualLintEvent.IssueEvent.valueOf(issueEvent_);
      return result == null ? com.google.wireless.android.sdk.stats.VisualLintEvent.IssueEvent.UNKNOWN_EVENT : result;
    }
    /**
     * <pre>
     * The kind of event affecting the issue
     * </pre>
     *
     * <code>optional .android_studio.VisualLintEvent.IssueEvent issue_event = 2;</code>
     * @param value The issueEvent to set.
     * @return This builder for chaining.
     */
    public Builder setIssueEvent(com.google.wireless.android.sdk.stats.VisualLintEvent.IssueEvent value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      issueEvent_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The kind of event affecting the issue
     * </pre>
     *
     * <code>optional .android_studio.VisualLintEvent.IssueEvent issue_event = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIssueEvent() {
      bitField0_ = (bitField0_ & ~0x00000002);
      issueEvent_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.VisualLintEvent)
  }

  // @@protoc_insertion_point(class_scope:android_studio.VisualLintEvent)
  private static final com.google.wireless.android.sdk.stats.VisualLintEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.VisualLintEvent();
  }

  public static com.google.wireless.android.sdk.stats.VisualLintEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<VisualLintEvent>
      PARSER = new com.google.protobuf.AbstractParser<VisualLintEvent>() {
    @java.lang.Override
    public VisualLintEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VisualLintEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VisualLintEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VisualLintEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.VisualLintEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
