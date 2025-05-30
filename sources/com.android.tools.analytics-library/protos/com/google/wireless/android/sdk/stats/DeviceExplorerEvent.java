// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

/**
 * Protobuf type {@code android_studio.DeviceExplorerEvent}
 */
public final class DeviceExplorerEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:android_studio.DeviceExplorerEvent)
    DeviceExplorerEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeviceExplorerEvent.newBuilder() to construct.
  private DeviceExplorerEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeviceExplorerEvent() {
    action_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeviceExplorerEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DeviceExplorerEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DeviceExplorerEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.wireless.android.sdk.stats.DeviceExplorerEvent.class, com.google.wireless.android.sdk.stats.DeviceExplorerEvent.Builder.class);
  }

  /**
   * Protobuf enum {@code android_studio.DeviceExplorerEvent.Action}
   */
  public enum Action
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Default
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The user changed the device in the dropdown.
     * </pre>
     *
     * <code>DEVICE_CHANGE = 1;</code>
     */
    DEVICE_CHANGE(1),
    /**
     * <pre>
     * The user created a new file
     * </pre>
     *
     * <code>NEW_FILE = 2;</code>
     */
    NEW_FILE(2),
    /**
     * <pre>
     * The user created a new directory
     * </pre>
     *
     * <code>NEW_DIRECTORY = 3;</code>
     */
    NEW_DIRECTORY(3),
    /**
     * <pre>
     * The user downloaded a file using "save as"
     * </pre>
     *
     * <code>SAVE_AS = 4;</code>
     */
    SAVE_AS(4),
    /**
     * <pre>
     * The user uploaded a file using "upload..."
     * </pre>
     *
     * <code>UPLOAD = 5;</code>
     */
    UPLOAD(5),
    /**
     * <pre>
     * The user uploaded a file using drag and drop
     * </pre>
     *
     * <code>DROP = 6;</code>
     */
    DROP(6),
    /**
     * <pre>
     * The user deleted a path
     * </pre>
     *
     * <code>DELETE = 7;</code>
     */
    DELETE(7),
    /**
     * <pre>
     * The user resync'ed a path
     * </pre>
     *
     * <code>SYNC = 8;</code>
     */
    SYNC(8),
    /**
     * <pre>
     * The user copied a path
     * </pre>
     *
     * <code>COPY_PATH = 9;</code>
     */
    COPY_PATH(9),
    /**
     * <pre>
     * The user expanded a data/data/&#42; directory
     * </pre>
     *
     * <code>EXPAND_APP_DATA = 10;</code>
     */
    EXPAND_APP_DATA(10),
    /**
     * <pre>
     * The user force stopped a process
     * </pre>
     *
     * <code>FORCE_STOP = 11;</code>
     */
    FORCE_STOP(11),
    /**
     * <pre>
     * The user killed a process
     * </pre>
     *
     * <code>KILL = 12;</code>
     */
    KILL(12),
    /**
     * <pre>
     * The user attached the debugger to a process
     * </pre>
     *
     * <code>ATTACH_DEBUGGER = 13;</code>
     */
    ATTACH_DEBUGGER(13),
    /**
     * <pre>
     * The user refreshed the process list
     * </pre>
     *
     * <code>REFRESH_PROCESSES = 14;</code>
     */
    REFRESH_PROCESSES(14),
    /**
     * <pre>
     * The user toggled application ID filtering
     * </pre>
     *
     * <code>APPLICATION_ID_FILTER_TOGGLED = 15;</code>
     */
    APPLICATION_ID_FILTER_TOGGLED(15),
    /**
     * <pre>
     * The user clicked on the files tab
     * </pre>
     *
     * <code>FILES_TAB_CLICKED = 16;</code>
     */
    FILES_TAB_CLICKED(16),
    /**
     * <pre>
     * The user clicked on the process tab
     * </pre>
     *
     * <code>PROCESS_TAB_CLICKED = 17;</code>
     */
    PROCESS_TAB_CLICKED(17),
    /**
     * <pre>
     * The user toggled on application ID filtering
     * </pre>
     *
     * <code>APPLICATION_ID_FILTER_TOGGLED_ON = 18;</code>
     */
    APPLICATION_ID_FILTER_TOGGLED_ON(18),
    /**
     * <pre>
     * The user toggled off application ID filtering
     * </pre>
     *
     * <code>APPLICATION_ID_FILTER_TOGGLED_OFF = 19;</code>
     */
    APPLICATION_ID_FILTER_TOGGLED_OFF(19),
    ;

    /**
     * <pre>
     * Default
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The user changed the device in the dropdown.
     * </pre>
     *
     * <code>DEVICE_CHANGE = 1;</code>
     */
    public static final int DEVICE_CHANGE_VALUE = 1;
    /**
     * <pre>
     * The user created a new file
     * </pre>
     *
     * <code>NEW_FILE = 2;</code>
     */
    public static final int NEW_FILE_VALUE = 2;
    /**
     * <pre>
     * The user created a new directory
     * </pre>
     *
     * <code>NEW_DIRECTORY = 3;</code>
     */
    public static final int NEW_DIRECTORY_VALUE = 3;
    /**
     * <pre>
     * The user downloaded a file using "save as"
     * </pre>
     *
     * <code>SAVE_AS = 4;</code>
     */
    public static final int SAVE_AS_VALUE = 4;
    /**
     * <pre>
     * The user uploaded a file using "upload..."
     * </pre>
     *
     * <code>UPLOAD = 5;</code>
     */
    public static final int UPLOAD_VALUE = 5;
    /**
     * <pre>
     * The user uploaded a file using drag and drop
     * </pre>
     *
     * <code>DROP = 6;</code>
     */
    public static final int DROP_VALUE = 6;
    /**
     * <pre>
     * The user deleted a path
     * </pre>
     *
     * <code>DELETE = 7;</code>
     */
    public static final int DELETE_VALUE = 7;
    /**
     * <pre>
     * The user resync'ed a path
     * </pre>
     *
     * <code>SYNC = 8;</code>
     */
    public static final int SYNC_VALUE = 8;
    /**
     * <pre>
     * The user copied a path
     * </pre>
     *
     * <code>COPY_PATH = 9;</code>
     */
    public static final int COPY_PATH_VALUE = 9;
    /**
     * <pre>
     * The user expanded a data/data/&#42; directory
     * </pre>
     *
     * <code>EXPAND_APP_DATA = 10;</code>
     */
    public static final int EXPAND_APP_DATA_VALUE = 10;
    /**
     * <pre>
     * The user force stopped a process
     * </pre>
     *
     * <code>FORCE_STOP = 11;</code>
     */
    public static final int FORCE_STOP_VALUE = 11;
    /**
     * <pre>
     * The user killed a process
     * </pre>
     *
     * <code>KILL = 12;</code>
     */
    public static final int KILL_VALUE = 12;
    /**
     * <pre>
     * The user attached the debugger to a process
     * </pre>
     *
     * <code>ATTACH_DEBUGGER = 13;</code>
     */
    public static final int ATTACH_DEBUGGER_VALUE = 13;
    /**
     * <pre>
     * The user refreshed the process list
     * </pre>
     *
     * <code>REFRESH_PROCESSES = 14;</code>
     */
    public static final int REFRESH_PROCESSES_VALUE = 14;
    /**
     * <pre>
     * The user toggled application ID filtering
     * </pre>
     *
     * <code>APPLICATION_ID_FILTER_TOGGLED = 15;</code>
     */
    public static final int APPLICATION_ID_FILTER_TOGGLED_VALUE = 15;
    /**
     * <pre>
     * The user clicked on the files tab
     * </pre>
     *
     * <code>FILES_TAB_CLICKED = 16;</code>
     */
    public static final int FILES_TAB_CLICKED_VALUE = 16;
    /**
     * <pre>
     * The user clicked on the process tab
     * </pre>
     *
     * <code>PROCESS_TAB_CLICKED = 17;</code>
     */
    public static final int PROCESS_TAB_CLICKED_VALUE = 17;
    /**
     * <pre>
     * The user toggled on application ID filtering
     * </pre>
     *
     * <code>APPLICATION_ID_FILTER_TOGGLED_ON = 18;</code>
     */
    public static final int APPLICATION_ID_FILTER_TOGGLED_ON_VALUE = 18;
    /**
     * <pre>
     * The user toggled off application ID filtering
     * </pre>
     *
     * <code>APPLICATION_ID_FILTER_TOGGLED_OFF = 19;</code>
     */
    public static final int APPLICATION_ID_FILTER_TOGGLED_OFF_VALUE = 19;


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
        case 0: return UNSPECIFIED;
        case 1: return DEVICE_CHANGE;
        case 2: return NEW_FILE;
        case 3: return NEW_DIRECTORY;
        case 4: return SAVE_AS;
        case 5: return UPLOAD;
        case 6: return DROP;
        case 7: return DELETE;
        case 8: return SYNC;
        case 9: return COPY_PATH;
        case 10: return EXPAND_APP_DATA;
        case 11: return FORCE_STOP;
        case 12: return KILL;
        case 13: return ATTACH_DEBUGGER;
        case 14: return REFRESH_PROCESSES;
        case 15: return APPLICATION_ID_FILTER_TOGGLED;
        case 16: return FILES_TAB_CLICKED;
        case 17: return PROCESS_TAB_CLICKED;
        case 18: return APPLICATION_ID_FILTER_TOGGLED_ON;
        case 19: return APPLICATION_ID_FILTER_TOGGLED_OFF;
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
      return com.google.wireless.android.sdk.stats.DeviceExplorerEvent.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:android_studio.DeviceExplorerEvent.Action)
  }

  private int bitField0_;
  public static final int ACTION_FIELD_NUMBER = 1;
  private int action_ = 0;
  /**
   * <code>optional .android_studio.DeviceExplorerEvent.Action action = 1;</code>
   * @return Whether the action field is set.
   */
  @java.lang.Override public boolean hasAction() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .android_studio.DeviceExplorerEvent.Action action = 1;</code>
   * @return The action.
   */
  @java.lang.Override public com.google.wireless.android.sdk.stats.DeviceExplorerEvent.Action getAction() {
    com.google.wireless.android.sdk.stats.DeviceExplorerEvent.Action result = com.google.wireless.android.sdk.stats.DeviceExplorerEvent.Action.forNumber(action_);
    return result == null ? com.google.wireless.android.sdk.stats.DeviceExplorerEvent.Action.UNSPECIFIED : result;
  }

  public static final int TRANSFER_FILE_COUNT_FIELD_NUMBER = 2;
  private int transferFileCount_ = 0;
  /**
   * <pre>
   * Number of files (Only valid for transfer actions)
   * </pre>
   *
   * <code>optional int32 transfer_file_count = 2;</code>
   * @return Whether the transferFileCount field is set.
   */
  @java.lang.Override
  public boolean hasTransferFileCount() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Number of files (Only valid for transfer actions)
   * </pre>
   *
   * <code>optional int32 transfer_file_count = 2;</code>
   * @return The transferFileCount.
   */
  @java.lang.Override
  public int getTransferFileCount() {
    return transferFileCount_;
  }

  public static final int TRANSFER_TOTAL_SIZE_FIELD_NUMBER = 3;
  private int transferTotalSize_ = 0;
  /**
   * <pre>
   * Total size in bytes (Only valid for transfer actions)
   * </pre>
   *
   * <code>optional int32 transfer_total_size = 3;</code>
   * @return Whether the transferTotalSize field is set.
   */
  @java.lang.Override
  public boolean hasTransferTotalSize() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Total size in bytes (Only valid for transfer actions)
   * </pre>
   *
   * <code>optional int32 transfer_total_size = 3;</code>
   * @return The transferTotalSize.
   */
  @java.lang.Override
  public int getTransferTotalSize() {
    return transferTotalSize_;
  }

  public static final int TRANSFER_TIME_MS_FIELD_NUMBER = 4;
  private int transferTimeMs_ = 0;
  /**
   * <pre>
   * Total time in ms (Only valid for transfer actions)
   * </pre>
   *
   * <code>optional int32 transfer_time_ms = 4;</code>
   * @return Whether the transferTimeMs field is set.
   */
  @java.lang.Override
  public boolean hasTransferTimeMs() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * Total time in ms (Only valid for transfer actions)
   * </pre>
   *
   * <code>optional int32 transfer_time_ms = 4;</code>
   * @return The transferTimeMs.
   */
  @java.lang.Override
  public int getTransferTimeMs() {
    return transferTimeMs_;
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
      output.writeInt32(2, transferFileCount_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(3, transferTotalSize_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeInt32(4, transferTimeMs_);
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
        .computeInt32Size(2, transferFileCount_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, transferTotalSize_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, transferTimeMs_);
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
    if (!(obj instanceof com.google.wireless.android.sdk.stats.DeviceExplorerEvent)) {
      return super.equals(obj);
    }
    com.google.wireless.android.sdk.stats.DeviceExplorerEvent other = (com.google.wireless.android.sdk.stats.DeviceExplorerEvent) obj;

    if (hasAction() != other.hasAction()) return false;
    if (hasAction()) {
      if (action_ != other.action_) return false;
    }
    if (hasTransferFileCount() != other.hasTransferFileCount()) return false;
    if (hasTransferFileCount()) {
      if (getTransferFileCount()
          != other.getTransferFileCount()) return false;
    }
    if (hasTransferTotalSize() != other.hasTransferTotalSize()) return false;
    if (hasTransferTotalSize()) {
      if (getTransferTotalSize()
          != other.getTransferTotalSize()) return false;
    }
    if (hasTransferTimeMs() != other.hasTransferTimeMs()) return false;
    if (hasTransferTimeMs()) {
      if (getTransferTimeMs()
          != other.getTransferTimeMs()) return false;
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
    if (hasTransferFileCount()) {
      hash = (37 * hash) + TRANSFER_FILE_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getTransferFileCount();
    }
    if (hasTransferTotalSize()) {
      hash = (37 * hash) + TRANSFER_TOTAL_SIZE_FIELD_NUMBER;
      hash = (53 * hash) + getTransferTotalSize();
    }
    if (hasTransferTimeMs()) {
      hash = (37 * hash) + TRANSFER_TIME_MS_FIELD_NUMBER;
      hash = (53 * hash) + getTransferTimeMs();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.wireless.android.sdk.stats.DeviceExplorerEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.DeviceExplorerEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DeviceExplorerEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.DeviceExplorerEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DeviceExplorerEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.wireless.android.sdk.stats.DeviceExplorerEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DeviceExplorerEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.DeviceExplorerEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DeviceExplorerEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.DeviceExplorerEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.wireless.android.sdk.stats.DeviceExplorerEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.wireless.android.sdk.stats.DeviceExplorerEvent parseFrom(
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
  public static Builder newBuilder(com.google.wireless.android.sdk.stats.DeviceExplorerEvent prototype) {
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
   * Protobuf type {@code android_studio.DeviceExplorerEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:android_studio.DeviceExplorerEvent)
      com.google.wireless.android.sdk.stats.DeviceExplorerEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DeviceExplorerEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DeviceExplorerEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.wireless.android.sdk.stats.DeviceExplorerEvent.class, com.google.wireless.android.sdk.stats.DeviceExplorerEvent.Builder.class);
    }

    // Construct using com.google.wireless.android.sdk.stats.DeviceExplorerEvent.newBuilder()
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
      action_ = 0;
      transferFileCount_ = 0;
      transferTotalSize_ = 0;
      transferTimeMs_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.wireless.android.sdk.stats.AndroidStudioStats.internal_static_android_studio_DeviceExplorerEvent_descriptor;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.DeviceExplorerEvent getDefaultInstanceForType() {
      return com.google.wireless.android.sdk.stats.DeviceExplorerEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.DeviceExplorerEvent build() {
      com.google.wireless.android.sdk.stats.DeviceExplorerEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.wireless.android.sdk.stats.DeviceExplorerEvent buildPartial() {
      com.google.wireless.android.sdk.stats.DeviceExplorerEvent result = new com.google.wireless.android.sdk.stats.DeviceExplorerEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.wireless.android.sdk.stats.DeviceExplorerEvent result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.action_ = action_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.transferFileCount_ = transferFileCount_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.transferTotalSize_ = transferTotalSize_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.transferTimeMs_ = transferTimeMs_;
        to_bitField0_ |= 0x00000008;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.wireless.android.sdk.stats.DeviceExplorerEvent) {
        return mergeFrom((com.google.wireless.android.sdk.stats.DeviceExplorerEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.wireless.android.sdk.stats.DeviceExplorerEvent other) {
      if (other == com.google.wireless.android.sdk.stats.DeviceExplorerEvent.getDefaultInstance()) return this;
      if (other.hasAction()) {
        setAction(other.getAction());
      }
      if (other.hasTransferFileCount()) {
        setTransferFileCount(other.getTransferFileCount());
      }
      if (other.hasTransferTotalSize()) {
        setTransferTotalSize(other.getTransferTotalSize());
      }
      if (other.hasTransferTimeMs()) {
        setTransferTimeMs(other.getTransferTimeMs());
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
              com.google.wireless.android.sdk.stats.DeviceExplorerEvent.Action tmpValue =
                  com.google.wireless.android.sdk.stats.DeviceExplorerEvent.Action.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(1, tmpRaw);
              } else {
                action_ = tmpRaw;
                bitField0_ |= 0x00000001;
              }
              break;
            } // case 8
            case 16: {
              transferFileCount_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              transferTotalSize_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              transferTimeMs_ = input.readInt32();
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

    private int action_ = 0;
    /**
     * <code>optional .android_studio.DeviceExplorerEvent.Action action = 1;</code>
     * @return Whether the action field is set.
     */
    @java.lang.Override public boolean hasAction() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .android_studio.DeviceExplorerEvent.Action action = 1;</code>
     * @return The action.
     */
    @java.lang.Override
    public com.google.wireless.android.sdk.stats.DeviceExplorerEvent.Action getAction() {
      com.google.wireless.android.sdk.stats.DeviceExplorerEvent.Action result = com.google.wireless.android.sdk.stats.DeviceExplorerEvent.Action.forNumber(action_);
      return result == null ? com.google.wireless.android.sdk.stats.DeviceExplorerEvent.Action.UNSPECIFIED : result;
    }
    /**
     * <code>optional .android_studio.DeviceExplorerEvent.Action action = 1;</code>
     * @param value The action to set.
     * @return This builder for chaining.
     */
    public Builder setAction(com.google.wireless.android.sdk.stats.DeviceExplorerEvent.Action value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      action_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .android_studio.DeviceExplorerEvent.Action action = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAction() {
      bitField0_ = (bitField0_ & ~0x00000001);
      action_ = 0;
      onChanged();
      return this;
    }

    private int transferFileCount_ ;
    /**
     * <pre>
     * Number of files (Only valid for transfer actions)
     * </pre>
     *
     * <code>optional int32 transfer_file_count = 2;</code>
     * @return Whether the transferFileCount field is set.
     */
    @java.lang.Override
    public boolean hasTransferFileCount() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Number of files (Only valid for transfer actions)
     * </pre>
     *
     * <code>optional int32 transfer_file_count = 2;</code>
     * @return The transferFileCount.
     */
    @java.lang.Override
    public int getTransferFileCount() {
      return transferFileCount_;
    }
    /**
     * <pre>
     * Number of files (Only valid for transfer actions)
     * </pre>
     *
     * <code>optional int32 transfer_file_count = 2;</code>
     * @param value The transferFileCount to set.
     * @return This builder for chaining.
     */
    public Builder setTransferFileCount(int value) {

      transferFileCount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of files (Only valid for transfer actions)
     * </pre>
     *
     * <code>optional int32 transfer_file_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTransferFileCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      transferFileCount_ = 0;
      onChanged();
      return this;
    }

    private int transferTotalSize_ ;
    /**
     * <pre>
     * Total size in bytes (Only valid for transfer actions)
     * </pre>
     *
     * <code>optional int32 transfer_total_size = 3;</code>
     * @return Whether the transferTotalSize field is set.
     */
    @java.lang.Override
    public boolean hasTransferTotalSize() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Total size in bytes (Only valid for transfer actions)
     * </pre>
     *
     * <code>optional int32 transfer_total_size = 3;</code>
     * @return The transferTotalSize.
     */
    @java.lang.Override
    public int getTransferTotalSize() {
      return transferTotalSize_;
    }
    /**
     * <pre>
     * Total size in bytes (Only valid for transfer actions)
     * </pre>
     *
     * <code>optional int32 transfer_total_size = 3;</code>
     * @param value The transferTotalSize to set.
     * @return This builder for chaining.
     */
    public Builder setTransferTotalSize(int value) {

      transferTotalSize_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Total size in bytes (Only valid for transfer actions)
     * </pre>
     *
     * <code>optional int32 transfer_total_size = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTransferTotalSize() {
      bitField0_ = (bitField0_ & ~0x00000004);
      transferTotalSize_ = 0;
      onChanged();
      return this;
    }

    private int transferTimeMs_ ;
    /**
     * <pre>
     * Total time in ms (Only valid for transfer actions)
     * </pre>
     *
     * <code>optional int32 transfer_time_ms = 4;</code>
     * @return Whether the transferTimeMs field is set.
     */
    @java.lang.Override
    public boolean hasTransferTimeMs() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Total time in ms (Only valid for transfer actions)
     * </pre>
     *
     * <code>optional int32 transfer_time_ms = 4;</code>
     * @return The transferTimeMs.
     */
    @java.lang.Override
    public int getTransferTimeMs() {
      return transferTimeMs_;
    }
    /**
     * <pre>
     * Total time in ms (Only valid for transfer actions)
     * </pre>
     *
     * <code>optional int32 transfer_time_ms = 4;</code>
     * @param value The transferTimeMs to set.
     * @return This builder for chaining.
     */
    public Builder setTransferTimeMs(int value) {

      transferTimeMs_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Total time in ms (Only valid for transfer actions)
     * </pre>
     *
     * <code>optional int32 transfer_time_ms = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTransferTimeMs() {
      bitField0_ = (bitField0_ & ~0x00000008);
      transferTimeMs_ = 0;
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


    // @@protoc_insertion_point(builder_scope:android_studio.DeviceExplorerEvent)
  }

  // @@protoc_insertion_point(class_scope:android_studio.DeviceExplorerEvent)
  private static final com.google.wireless.android.sdk.stats.DeviceExplorerEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.wireless.android.sdk.stats.DeviceExplorerEvent();
  }

  public static com.google.wireless.android.sdk.stats.DeviceExplorerEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<DeviceExplorerEvent>
      PARSER = new com.google.protobuf.AbstractParser<DeviceExplorerEvent>() {
    @java.lang.Override
    public DeviceExplorerEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeviceExplorerEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeviceExplorerEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.wireless.android.sdk.stats.DeviceExplorerEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

