// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * Protobuf type {@code android_studio.HeapReportEvent}
 */
public final class HeapReportEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.HeapReportEvent)
    HeapReportEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HeapReportEvent.newBuilder() to construct.
  private HeapReportEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HeapReportEvent() {
    status_ = 0;
    reason_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HeapReportEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_HeapReportEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_HeapReportEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.HeapReportEvent.class, com.google.wireless.android.sdk.stats.HeapReportEvent.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.HeapReportEvent.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>LOW_MEMORY_EVENT = 1;</code>
     */
    LOW_MEMORY_EVENT(1),
    /**
     * <code>INSUFFICIENT_DISK_SPACE = 2;</code>
     */
    INSUFFICIENT_DISK_SPACE(2),
    /**
     * <code>HEAP_TOO_SMALL = 3;</code>
     */
    HEAP_TOO_SMALL(3),
    /**
     * <code>RATE_LIMITED = 4;</code>
     */
    RATE_LIMITED(4),
    /**
     * <code>EXCESS_FREE_MEMORY = 5;</code>
     */
    EXCESS_FREE_MEMORY(5),
    /**
     * <code>FORCED_GC = 6;</code>
     */
    FORCED_GC(6),
    /**
     * <code>EXCESS_FREE_MEMORY_AFTER_GC = 7;</code>
     */
    EXCESS_FREE_MEMORY_AFTER_GC(7),
    /**
     * <code>REPORT_ALREADY_PENDING = 8;</code>
     */
    REPORT_ALREADY_PENDING(8),
    /**
     * <code>CAPTURE_SNAPSHOT_FAILED = 9;</code>
     */
    CAPTURE_SNAPSHOT_FAILED(9),
    /**
     * <code>ANALYSIS_STARTED = 10;</code>
     */
    ANALYSIS_STARTED(10),
    /**
     * <code>ERROR_DURING_ANALYSIS = 11;</code>
     */
    ERROR_DURING_ANALYSIS(11),
    /**
     * <code>ANALYSIS_FINISHED = 12;</code>
     */
    ANALYSIS_FINISHED(12),
    /**
     * <code>REVIEW_DIALOG_SHOWN = 13;</code>
     */
    REVIEW_DIALOG_SHOWN(13),
    /**
     * <code>REVIEW_ACCEPTED = 14;</code>
     */
    REVIEW_ACCEPTED(14),
    /**
     * <code>REVIEW_DECLINED = 15;</code>
     */
    REVIEW_DECLINED(15),
    /**
     * <code>REPORT_UPLOADED = 16;</code>
     */
    REPORT_UPLOADED(16),
    /**
     * <code>REPORT_UPLOAD_FAILED = 17;</code>
     */
    REPORT_UPLOAD_FAILED(17),
    /**
     * <code>DISABLED_SYSTEM_PROPERTY = 18;</code>
     */
    DISABLED_SYSTEM_PROPERTY(18),
    /**
     * <code>DISABLED_SERVER_FLAG = 19;</code>
     */
    DISABLED_SERVER_FLAG(19),
    /**
     * <code>DISABLED_NOT_64_BIT = 20;</code>
     */
    DISABLED_NOT_64_BIT(20),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>LOW_MEMORY_EVENT = 1;</code>
     */
    public static final int LOW_MEMORY_EVENT_VALUE = 1;
    /**
     * <code>INSUFFICIENT_DISK_SPACE = 2;</code>
     */
    public static final int INSUFFICIENT_DISK_SPACE_VALUE = 2;
    /**
     * <code>HEAP_TOO_SMALL = 3;</code>
     */
    public static final int HEAP_TOO_SMALL_VALUE = 3;
    /**
     * <code>RATE_LIMITED = 4;</code>
     */
    public static final int RATE_LIMITED_VALUE = 4;
    /**
     * <code>EXCESS_FREE_MEMORY = 5;</code>
     */
    public static final int EXCESS_FREE_MEMORY_VALUE = 5;
    /**
     * <code>FORCED_GC = 6;</code>
     */
    public static final int FORCED_GC_VALUE = 6;
    /**
     * <code>EXCESS_FREE_MEMORY_AFTER_GC = 7;</code>
     */
    public static final int EXCESS_FREE_MEMORY_AFTER_GC_VALUE = 7;
    /**
     * <code>REPORT_ALREADY_PENDING = 8;</code>
     */
    public static final int REPORT_ALREADY_PENDING_VALUE = 8;
    /**
     * <code>CAPTURE_SNAPSHOT_FAILED = 9;</code>
     */
    public static final int CAPTURE_SNAPSHOT_FAILED_VALUE = 9;
    /**
     * <code>ANALYSIS_STARTED = 10;</code>
     */
    public static final int ANALYSIS_STARTED_VALUE = 10;
    /**
     * <code>ERROR_DURING_ANALYSIS = 11;</code>
     */
    public static final int ERROR_DURING_ANALYSIS_VALUE = 11;
    /**
     * <code>ANALYSIS_FINISHED = 12;</code>
     */
    public static final int ANALYSIS_FINISHED_VALUE = 12;
    /**
     * <code>REVIEW_DIALOG_SHOWN = 13;</code>
     */
    public static final int REVIEW_DIALOG_SHOWN_VALUE = 13;
    /**
     * <code>REVIEW_ACCEPTED = 14;</code>
     */
    public static final int REVIEW_ACCEPTED_VALUE = 14;
    /**
     * <code>REVIEW_DECLINED = 15;</code>
     */
    public static final int REVIEW_DECLINED_VALUE = 15;
    /**
     * <code>REPORT_UPLOADED = 16;</code>
     */
    public static final int REPORT_UPLOADED_VALUE = 16;
    /**
     * <code>REPORT_UPLOAD_FAILED = 17;</code>
     */
    public static final int REPORT_UPLOAD_FAILED_VALUE = 17;
    /**
     * <code>DISABLED_SYSTEM_PROPERTY = 18;</code>
     */
    public static final int DISABLED_SYSTEM_PROPERTY_VALUE = 18;
    /**
     * <code>DISABLED_SERVER_FLAG = 19;</code>
     */
    public static final int DISABLED_SERVER_FLAG_VALUE = 19;
    /**
     * <code>DISABLED_NOT_64_BIT = 20;</code>
     */
    public static final int DISABLED_NOT_64_BIT_VALUE = 20;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Status valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Status forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return LOW_MEMORY_EVENT;
        case 2: return INSUFFICIENT_DISK_SPACE;
        case 3: return HEAP_TOO_SMALL;
        case 4: return RATE_LIMITED;
        case 5: return EXCESS_FREE_MEMORY;
        case 6: return FORCED_GC;
        case 7: return EXCESS_FREE_MEMORY_AFTER_GC;
        case 8: return REPORT_ALREADY_PENDING;
        case 9: return CAPTURE_SNAPSHOT_FAILED;
        case 10: return ANALYSIS_STARTED;
        case 11: return ERROR_DURING_ANALYSIS;
        case 12: return ANALYSIS_FINISHED;
        case 13: return REVIEW_DIALOG_SHOWN;
        case 14: return REVIEW_ACCEPTED;
        case 15: return REVIEW_DECLINED;
        case 16: return REPORT_UPLOADED;
        case 17: return REPORT_UPLOAD_FAILED;
        case 18: return DISABLED_SYSTEM_PROPERTY;
        case 19: return DISABLED_SERVER_FLAG;
        case 20: return DISABLED_NOT_64_BIT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.HeapReportEvent.getDescriptor().getEnumTypes().get(0);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Status(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.HeapReportEvent.Status)
  }

  /**
   * <pre>
   * mirrors com.android.tools.idea.diagnostic.report.MemoryReportReason
   * </pre>
   *
   * Protobuf enum {@code android_studio.HeapReportEvent.Reason}
   */
  public enum Reason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>NONE = 0;</code>
     */
    NONE(0),
    /**
     * <code>USER_INVOKED = 1;</code>
     */
    USER_INVOKED(1),
    /**
     * <code>INTERNAL_USER_INVOKED = 2;</code>
     */
    INTERNAL_USER_INVOKED(2),
    /**
     * <code>FREQUENT_LOW_MEMORY_NOTIFICATION = 3;</code>
     */
    FREQUENT_LOW_MEMORY_NOTIFICATION(3),
    /**
     * <code>LOW_MEMORY = 4;</code>
     */
    LOW_MEMORY(4),
    /**
     * <code>OUT_OF_MEMORY = 5;</code>
     */
    OUT_OF_MEMORY(5),
    ;

    /**
     * <code>NONE = 0;</code>
     */
    public static final int NONE_VALUE = 0;
    /**
     * <code>USER_INVOKED = 1;</code>
     */
    public static final int USER_INVOKED_VALUE = 1;
    /**
     * <code>INTERNAL_USER_INVOKED = 2;</code>
     */
    public static final int INTERNAL_USER_INVOKED_VALUE = 2;
    /**
     * <code>FREQUENT_LOW_MEMORY_NOTIFICATION = 3;</code>
     */
    public static final int FREQUENT_LOW_MEMORY_NOTIFICATION_VALUE = 3;
    /**
     * <code>LOW_MEMORY = 4;</code>
     */
    public static final int LOW_MEMORY_VALUE = 4;
    /**
     * <code>OUT_OF_MEMORY = 5;</code>
     */
    public static final int OUT_OF_MEMORY_VALUE = 5;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Reason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Reason forNumber(int value) {
      switch (value) {
        case 0: return NONE;
        case 1: return USER_INVOKED;
        case 2: return INTERNAL_USER_INVOKED;
        case 3: return FREQUENT_LOW_MEMORY_NOTIFICATION;
        case 4: return LOW_MEMORY;
        case 5: return OUT_OF_MEMORY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Reason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Reason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Reason>() {
            public Reason findValueByNumber(int number) {
              return Reason.forNumber(number);
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
      return com.google.wireless.android.sdk.stats.HeapReportEvent.getDescriptor().getEnumTypes().get(1);
    }

    private static final Reason[] VALUES = values();

    public static Reason valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Reason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:android_studio.HeapReportEvent.Reason)
  }

  private int bitField0_;
  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>optional .android_studio.HeapReportEvent.Status status = 1;</code>
   * @return Whether the status field is set.
   */
  @java.lang.Override public boolean hasStatus() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .android_studio.HeapReportEvent.Status status = 1;</code>
   * @return The status.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.HeapReportEvent.Status getStatus() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.HeapReportEvent.Status result = com.google.wireless.android.sdk.stats.HeapReportEvent.Status.valueOf(status_);
    return result == null ? com.google.wireless.android.sdk.stats.HeapReportEvent.Status.UNKNOWN : result;
  }

  public static final int REASON_FIELD_NUMBER = 2;
  private int reason_;
  /**
   * <pre>
   * set when status = LOW_MEMORY_EVENT
   * </pre>
   *
   * <code>optional .android_studio.HeapReportEvent.Reason reason = 2;</code>
   * @return Whether the reason field is set.
   */
  @java.lang.Override public boolean hasReason() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * set when status = LOW_MEMORY_EVENT
   * </pre>
   *
   * <code>optional .android_studio.HeapReportEvent.Reason reason = 2;</code>
   * @return The reason.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.HeapReportEvent.Reason getReason() {
    @SuppressWarnings("deprecation")
    com.google.wireless.android.sdk.stats.HeapReportEvent.Reason result = com.google.wireless.android.sdk.stats.HeapReportEvent.Reason.valueOf(reason_);
    return result == null ? com.google.wireless.android.sdk.stats.HeapReportEvent.Reason.NONE : result;
  }

  public static final int FREED_MEMORY_FIELD_NUMBER = 3;
  private long freedMemory_;
  /**
   * <pre>
   * set when status = FORCED_GC
   * </pre>
   *
   * <code>optional int64 freed_memory = 3;</code>
   * @return Whether the freedMemory field is set.
   */
  @java.lang.Override
  public boolean hasFreedMemory() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * set when status = FORCED_GC
   * </pre>
   *
   * <code>optional int64 freed_memory = 3;</code>
   * @return The freedMemory.
   */
  @java.lang.Override
  public long getFreedMemory() {
    return freedMemory_;
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
      output.writeEnum(1, status_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeEnum(2, reason_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt64(3, freedMemory_);
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
        .computeEnumSize(1, status_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, reason_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, freedMemory_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.HeapReportEvent)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.HeapReportEvent other = (com.google.wireless.android.sdk.stats.HeapReportEvent) obj;

    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (status_ != other.status_) return false;
    }
    if (hasReason() != other.hasReason()) return false;
    if (hasReason()) {
      if (reason_ != other.reason_) return false;
    }
    if (hasFreedMemory() != other.hasFreedMemory()) return false;
    if (hasFreedMemory()) {
      if (getFreedMemory()
          != other.getFreedMemory()) return false;
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
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + status_;
    }
    if (hasReason()) {
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
    }
    if (hasFreedMemory()) {
      hash = (37 * hash) + FREED_MEMORY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getFreedMemory());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.HeapReportEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.HeapReportEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.HeapReportEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.HeapReportEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.HeapReportEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.HeapReportEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.HeapReportEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.HeapReportEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.HeapReportEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.HeapReportEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.HeapReportEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.HeapReportEvent parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.HeapReportEvent prototype) {
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
   * Protobuf type {@code android_studio.HeapReportEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.HeapReportEvent)
      com.google.wireless.android.sdk.stats.HeapReportEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_HeapReportEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_HeapReportEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.HeapReportEvent.class, com.google.wireless.android.sdk.stats.HeapReportEvent.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.HeapReportEvent.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      status_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      reason_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      freedMemory_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_HeapReportEvent_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.HeapReportEvent getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.HeapReportEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.HeapReportEvent build() {
      com.google.wireless.android.sdk.stats.HeapReportEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.HeapReportEvent buildPartial() {
      com.google.wireless.android.sdk.stats.HeapReportEvent result = new com.google.wireless.android.sdk.stats.HeapReportEvent(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.status_ = status_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.reason_ = reason_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.freedMemory_ = freedMemory_;
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof com.google.wireless.android.sdk.stats.HeapReportEvent) {
        return mergeFrom((com.google.wireless.android.sdk.stats.HeapReportEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.HeapReportEvent other) {
      if (other == com.google.wireless.android.sdk.stats.HeapReportEvent.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        setStatus(other.getStatus());
      }
      if (other.hasReason()) {
        setReason(other.getReason());
      }
      if (other.hasFreedMemory()) {
        setFreedMemory(other.getFreedMemory());
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
              com.google.wireless.android.sdk.stats.HeapReportEvent.Status tmpValue =
                  com.google.wireless.android.sdk.stats.HeapReportEvent.Status.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(1, tmpRaw);
              } else {
                status_ = tmpRaw;
                bitField0_ |= 0x00000001;
              }
              break;
            } // case 8
            case 16: {
              int tmpRaw = input.readEnum();
              com.google.wireless.android.sdk.stats.HeapReportEvent.Reason tmpValue =
                  com.google.wireless.android.sdk.stats.HeapReportEvent.Reason.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(2, tmpRaw);
              } else {
                reason_ = tmpRaw;
                bitField0_ |= 0x00000002;
              }
              break;
            } // case 16
            case 24: {
              freedMemory_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private int status_ = 0;
    /**
     * <code>optional .android_studio.HeapReportEvent.Status status = 1;</code>
     * @return Whether the status field is set.
     */
    @java.lang.Override public boolean hasStatus() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .android_studio.HeapReportEvent.Status status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.HeapReportEvent.Status getStatus() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.HeapReportEvent.Status result = com.google.wireless.android.sdk.stats.HeapReportEvent.Status.valueOf(status_);
      return result == null ? com.google.wireless.android.sdk.stats.HeapReportEvent.Status.UNKNOWN : result;
    }
    /**
     * <code>optional .android_studio.HeapReportEvent.Status status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(com.google.wireless.android.sdk.stats.HeapReportEvent.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .android_studio.HeapReportEvent.Status status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000001);
      status_ = 0;
      onChanged();
      return this;
    }

    private int reason_ = 0;
    /**
     * <pre>
     * set when status = LOW_MEMORY_EVENT
     * </pre>
     *
     * <code>optional .android_studio.HeapReportEvent.Reason reason = 2;</code>
     * @return Whether the reason field is set.
     */
    @java.lang.Override public boolean hasReason() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * set when status = LOW_MEMORY_EVENT
     * </pre>
     *
     * <code>optional .android_studio.HeapReportEvent.Reason reason = 2;</code>
     * @return The reason.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.HeapReportEvent.Reason getReason() {
      @SuppressWarnings("deprecation")
      com.google.wireless.android.sdk.stats.HeapReportEvent.Reason result = com.google.wireless.android.sdk.stats.HeapReportEvent.Reason.valueOf(reason_);
      return result == null ? com.google.wireless.android.sdk.stats.HeapReportEvent.Reason.NONE : result;
    }
    /**
     * <pre>
     * set when status = LOW_MEMORY_EVENT
     * </pre>
     *
     * <code>optional .android_studio.HeapReportEvent.Reason reason = 2;</code>
     * @param value The reason to set.
     * @return This builder for chaining.
     */
    public Builder setReason(com.google.wireless.android.sdk.stats.HeapReportEvent.Reason value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      reason_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * set when status = LOW_MEMORY_EVENT
     * </pre>
     *
     * <code>optional .android_studio.HeapReportEvent.Reason reason = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearReason() {
      bitField0_ = (bitField0_ & ~0x00000002);
      reason_ = 0;
      onChanged();
      return this;
    }

    private long freedMemory_ ;
    /**
     * <pre>
     * set when status = FORCED_GC
     * </pre>
     *
     * <code>optional int64 freed_memory = 3;</code>
     * @return Whether the freedMemory field is set.
     */
    @java.lang.Override
    public boolean hasFreedMemory() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * set when status = FORCED_GC
     * </pre>
     *
     * <code>optional int64 freed_memory = 3;</code>
     * @return The freedMemory.
     */
    @java.lang.Override
    public long getFreedMemory() {
      return freedMemory_;
    }
    /**
     * <pre>
     * set when status = FORCED_GC
     * </pre>
     *
     * <code>optional int64 freed_memory = 3;</code>
     * @param value The freedMemory to set.
     * @return This builder for chaining.
     */
    public Builder setFreedMemory(long value) {
      bitField0_ |= 0x00000004;
      freedMemory_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * set when status = FORCED_GC
     * </pre>
     *
     * <code>optional int64 freed_memory = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFreedMemory() {
      bitField0_ = (bitField0_ & ~0x00000004);
      freedMemory_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:android_studio.HeapReportEvent)
  }

  // @@protoc_insertion_point(class_scope:android_studio.HeapReportEvent)
  private static final com.google.wireless.android.sdk.stats.HeapReportEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.HeapReportEvent();
  }

  public static com.google.wireless.android.sdk.stats.HeapReportEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<HeapReportEvent>
      PARSER = new com.google.protobuf.AbstractParser<HeapReportEvent>() {
    @java.lang.Override
    public HeapReportEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<HeapReportEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HeapReportEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.HeapReportEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

