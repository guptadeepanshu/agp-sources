// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: version_control_metadata.proto

package com.android.tools.idea.insights.proto;

/**
 * <pre>
 * Describes the location, status and the HEAD revision of an app's source code
 * repository.
 * </pre>
 *
 * Protobuf type {@code RepositoryInfo}
 */
public final class RepositoryInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RepositoryInfo)
    RepositoryInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RepositoryInfo.newBuilder() to construct.
  private RepositoryInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RepositoryInfo() {
    system_ = 0;
    localRootPath_ = "";
    revision_ = "";
    worktreeStatus_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RepositoryInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.android.tools.idea.insights.proto.VersionControlMetadata.internal_static_RepositoryInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.android.tools.idea.insights.proto.VersionControlMetadata.internal_static_RepositoryInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.android.tools.idea.insights.proto.RepositoryInfo.class, com.android.tools.idea.insights.proto.RepositoryInfo.Builder.class);
  }

  /**
   * <pre>
   * Status of the working tree.
   * </pre>
   *
   * Protobuf enum {@code RepositoryInfo.WorktreeStatus}
   */
  public enum WorktreeStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>WORKTREE_STATUS_UNSPECIFIED = 0;</code>
     */
    WORKTREE_STATUS_UNSPECIFIED(0),
    /**
     * <pre>
     * Clean. No uncommitted modifications or files.
     * </pre>
     *
     * <code>WORKTREE_STATUS_CLEAN = 1;</code>
     */
    WORKTREE_STATUS_CLEAN(1),
    /**
     * <pre>
     * Dirty. One or more uncommitted modifications or files.
     * </pre>
     *
     * <code>WORKTREE_STATUS_DIRTY = 2;</code>
     */
    WORKTREE_STATUS_DIRTY(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>WORKTREE_STATUS_UNSPECIFIED = 0;</code>
     */
    public static final int WORKTREE_STATUS_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Clean. No uncommitted modifications or files.
     * </pre>
     *
     * <code>WORKTREE_STATUS_CLEAN = 1;</code>
     */
    public static final int WORKTREE_STATUS_CLEAN_VALUE = 1;
    /**
     * <pre>
     * Dirty. One or more uncommitted modifications or files.
     * </pre>
     *
     * <code>WORKTREE_STATUS_DIRTY = 2;</code>
     */
    public static final int WORKTREE_STATUS_DIRTY_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static WorktreeStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static WorktreeStatus forNumber(int value) {
      switch (value) {
        case 0: return WORKTREE_STATUS_UNSPECIFIED;
        case 1: return WORKTREE_STATUS_CLEAN;
        case 2: return WORKTREE_STATUS_DIRTY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<WorktreeStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        WorktreeStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<WorktreeStatus>() {
            public WorktreeStatus findValueByNumber(int number) {
              return WorktreeStatus.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.android.tools.idea.insights.proto.RepositoryInfo.getDescriptor().getEnumTypes().get(0);
    }

    private static final WorktreeStatus[] VALUES = values();

    public static WorktreeStatus valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private WorktreeStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:RepositoryInfo.WorktreeStatus)
  }

  private int bitField0_;
  public static final int SYSTEM_FIELD_NUMBER = 1;
  private int system_ = 0;
  /**
   * <pre>
   * VC system used by the app.
   * </pre>
   *
   * <code>optional .VersionControlSystem system = 1;</code>
   * @return Whether the system field is set.
   */
  @java.lang.Override public boolean hasSystem() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * VC system used by the app.
   * </pre>
   *
   * <code>optional .VersionControlSystem system = 1;</code>
   * @return The enum numeric value on the wire for system.
   */
  @java.lang.Override public int getSystemValue() {
    return system_;
  }
  /**
   * <pre>
   * VC system used by the app.
   * </pre>
   *
   * <code>optional .VersionControlSystem system = 1;</code>
   * @return The system.
   */
  @java.lang.Override public com.android.tools.idea.insights.proto.VersionControlSystem getSystem() {
    com.android.tools.idea.insights.proto.VersionControlSystem result = com.android.tools.idea.insights.proto.VersionControlSystem.forNumber(system_);
    return result == null ? com.android.tools.idea.insights.proto.VersionControlSystem.UNRECOGNIZED : result;
  }

  public static final int LOCAL_ROOT_PATH_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object localRootPath_ = "";
  /**
   * <pre>
   * The local repository path starts with the “$PROJECT_DIR” or “$ABOVE_PROJECT_DIR” placeholder.
   * </pre>
   *
   * <code>optional string local_root_path = 2;</code>
   * @return Whether the localRootPath field is set.
   */
  @java.lang.Override
  public boolean hasLocalRootPath() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The local repository path starts with the “$PROJECT_DIR” or “$ABOVE_PROJECT_DIR” placeholder.
   * </pre>
   *
   * <code>optional string local_root_path = 2;</code>
   * @return The localRootPath.
   */
  @java.lang.Override
  public java.lang.String getLocalRootPath() {
    java.lang.Object ref = localRootPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      localRootPath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The local repository path starts with the “$PROJECT_DIR” or “$ABOVE_PROJECT_DIR” placeholder.
   * </pre>
   *
   * <code>optional string local_root_path = 2;</code>
   * @return The bytes for localRootPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLocalRootPathBytes() {
    java.lang.Object ref = localRootPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      localRootPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REVISION_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object revision_ = "";
  /**
   * <pre>
   * The revision identifier, e.g. the SHA1 git commit id
   * </pre>
   *
   * <code>optional string revision = 3;</code>
   * @return Whether the revision field is set.
   */
  @java.lang.Override
  public boolean hasRevision() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * The revision identifier, e.g. the SHA1 git commit id
   * </pre>
   *
   * <code>optional string revision = 3;</code>
   * @return The revision.
   */
  @java.lang.Override
  public java.lang.String getRevision() {
    java.lang.Object ref = revision_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      revision_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The revision identifier, e.g. the SHA1 git commit id
   * </pre>
   *
   * <code>optional string revision = 3;</code>
   * @return The bytes for revision.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRevisionBytes() {
    java.lang.Object ref = revision_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      revision_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WORKTREE_STATUS_FIELD_NUMBER = 4;
  private int worktreeStatus_ = 0;
  /**
   * <pre>
   * Status of the working tree this app was built from.
   * </pre>
   *
   * <code>optional .RepositoryInfo.WorktreeStatus worktree_status = 4;</code>
   * @return Whether the worktreeStatus field is set.
   */
  @java.lang.Override public boolean hasWorktreeStatus() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * Status of the working tree this app was built from.
   * </pre>
   *
   * <code>optional .RepositoryInfo.WorktreeStatus worktree_status = 4;</code>
   * @return The enum numeric value on the wire for worktreeStatus.
   */
  @java.lang.Override public int getWorktreeStatusValue() {
    return worktreeStatus_;
  }
  /**
   * <pre>
   * Status of the working tree this app was built from.
   * </pre>
   *
   * <code>optional .RepositoryInfo.WorktreeStatus worktree_status = 4;</code>
   * @return The worktreeStatus.
   */
  @java.lang.Override public com.android.tools.idea.insights.proto.RepositoryInfo.WorktreeStatus getWorktreeStatus() {
    com.android.tools.idea.insights.proto.RepositoryInfo.WorktreeStatus result = com.android.tools.idea.insights.proto.RepositoryInfo.WorktreeStatus.forNumber(worktreeStatus_);
    return result == null ? com.android.tools.idea.insights.proto.RepositoryInfo.WorktreeStatus.UNRECOGNIZED : result;
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
      output.writeEnum(1, system_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, localRootPath_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, revision_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeEnum(4, worktreeStatus_);
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
        .computeEnumSize(1, system_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, localRootPath_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, revision_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, worktreeStatus_);
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
    if (!(obj instanceof com.android.tools.idea.insights.proto.RepositoryInfo)) {
      return super.equals(obj);
    }
    com.android.tools.idea.insights.proto.RepositoryInfo other = (com.android.tools.idea.insights.proto.RepositoryInfo) obj;

    if (hasSystem() != other.hasSystem()) return false;
    if (hasSystem()) {
      if (system_ != other.system_) return false;
    }
    if (hasLocalRootPath() != other.hasLocalRootPath()) return false;
    if (hasLocalRootPath()) {
      if (!getLocalRootPath()
          .equals(other.getLocalRootPath())) return false;
    }
    if (hasRevision() != other.hasRevision()) return false;
    if (hasRevision()) {
      if (!getRevision()
          .equals(other.getRevision())) return false;
    }
    if (hasWorktreeStatus() != other.hasWorktreeStatus()) return false;
    if (hasWorktreeStatus()) {
      if (worktreeStatus_ != other.worktreeStatus_) return false;
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
    if (hasSystem()) {
      hash = (37 * hash) + SYSTEM_FIELD_NUMBER;
      hash = (53 * hash) + system_;
    }
    if (hasLocalRootPath()) {
      hash = (37 * hash) + LOCAL_ROOT_PATH_FIELD_NUMBER;
      hash = (53 * hash) + getLocalRootPath().hashCode();
    }
    if (hasRevision()) {
      hash = (37 * hash) + REVISION_FIELD_NUMBER;
      hash = (53 * hash) + getRevision().hashCode();
    }
    if (hasWorktreeStatus()) {
      hash = (37 * hash) + WORKTREE_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + worktreeStatus_;
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.android.tools.idea.insights.proto.RepositoryInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.tools.idea.insights.proto.RepositoryInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.tools.idea.insights.proto.RepositoryInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.tools.idea.insights.proto.RepositoryInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.tools.idea.insights.proto.RepositoryInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.tools.idea.insights.proto.RepositoryInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.tools.idea.insights.proto.RepositoryInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.tools.idea.insights.proto.RepositoryInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.tools.idea.insights.proto.RepositoryInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.android.tools.idea.insights.proto.RepositoryInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.tools.idea.insights.proto.RepositoryInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.tools.idea.insights.proto.RepositoryInfo parseFrom(
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
  public static Builder newBuilder(com.android.tools.idea.insights.proto.RepositoryInfo prototype) {
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
   * Describes the location, status and the HEAD revision of an app's source code
   * repository.
   * </pre>
   *
   * Protobuf type {@code RepositoryInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RepositoryInfo)
      com.android.tools.idea.insights.proto.RepositoryInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.tools.idea.insights.proto.VersionControlMetadata.internal_static_RepositoryInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.tools.idea.insights.proto.VersionControlMetadata.internal_static_RepositoryInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.tools.idea.insights.proto.RepositoryInfo.class, com.android.tools.idea.insights.proto.RepositoryInfo.Builder.class);
    }

    // Construct using com.android.tools.idea.insights.proto.RepositoryInfo.newBuilder()
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
      system_ = 0;
      localRootPath_ = "";
      revision_ = "";
      worktreeStatus_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.android.tools.idea.insights.proto.VersionControlMetadata.internal_static_RepositoryInfo_descriptor;
    }

    @java.lang.Override
    public com.android.tools.idea.insights.proto.RepositoryInfo getDefaultInstanceForType() {
      return com.android.tools.idea.insights.proto.RepositoryInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.android.tools.idea.insights.proto.RepositoryInfo build() {
      com.android.tools.idea.insights.proto.RepositoryInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.android.tools.idea.insights.proto.RepositoryInfo buildPartial() {
      com.android.tools.idea.insights.proto.RepositoryInfo result = new com.android.tools.idea.insights.proto.RepositoryInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.android.tools.idea.insights.proto.RepositoryInfo result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.system_ = system_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.localRootPath_ = localRootPath_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.revision_ = revision_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.worktreeStatus_ = worktreeStatus_;
        to_bitField0_ |= 0x00000008;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.android.tools.idea.insights.proto.RepositoryInfo) {
        return mergeFrom((com.android.tools.idea.insights.proto.RepositoryInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.android.tools.idea.insights.proto.RepositoryInfo other) {
      if (other == com.android.tools.idea.insights.proto.RepositoryInfo.getDefaultInstance()) return this;
      if (other.hasSystem()) {
        setSystem(other.getSystem());
      }
      if (other.hasLocalRootPath()) {
        localRootPath_ = other.localRootPath_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasRevision()) {
        revision_ = other.revision_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasWorktreeStatus()) {
        setWorktreeStatus(other.getWorktreeStatus());
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
              system_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              localRootPath_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              revision_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              worktreeStatus_ = input.readEnum();
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

    private int system_ = 0;
    /**
     * <pre>
     * VC system used by the app.
     * </pre>
     *
     * <code>optional .VersionControlSystem system = 1;</code>
     * @return Whether the system field is set.
     */
    @java.lang.Override public boolean hasSystem() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * VC system used by the app.
     * </pre>
     *
     * <code>optional .VersionControlSystem system = 1;</code>
     * @return The enum numeric value on the wire for system.
     */
    @java.lang.Override public int getSystemValue() {
      return system_;
    }
    /**
     * <pre>
     * VC system used by the app.
     * </pre>
     *
     * <code>optional .VersionControlSystem system = 1;</code>
     * @param value The enum numeric value on the wire for system to set.
     * @return This builder for chaining.
     */
    public Builder setSystemValue(int value) {
      system_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * VC system used by the app.
     * </pre>
     *
     * <code>optional .VersionControlSystem system = 1;</code>
     * @return The system.
     */
    @java.lang.Override
    public com.android.tools.idea.insights.proto.VersionControlSystem getSystem() {
      com.android.tools.idea.insights.proto.VersionControlSystem result = com.android.tools.idea.insights.proto.VersionControlSystem.forNumber(system_);
      return result == null ? com.android.tools.idea.insights.proto.VersionControlSystem.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * VC system used by the app.
     * </pre>
     *
     * <code>optional .VersionControlSystem system = 1;</code>
     * @param value The system to set.
     * @return This builder for chaining.
     */
    public Builder setSystem(com.android.tools.idea.insights.proto.VersionControlSystem value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      system_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * VC system used by the app.
     * </pre>
     *
     * <code>optional .VersionControlSystem system = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSystem() {
      bitField0_ = (bitField0_ & ~0x00000001);
      system_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object localRootPath_ = "";
    /**
     * <pre>
     * The local repository path starts with the “$PROJECT_DIR” or “$ABOVE_PROJECT_DIR” placeholder.
     * </pre>
     *
     * <code>optional string local_root_path = 2;</code>
     * @return Whether the localRootPath field is set.
     */
    public boolean hasLocalRootPath() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The local repository path starts with the “$PROJECT_DIR” or “$ABOVE_PROJECT_DIR” placeholder.
     * </pre>
     *
     * <code>optional string local_root_path = 2;</code>
     * @return The localRootPath.
     */
    public java.lang.String getLocalRootPath() {
      java.lang.Object ref = localRootPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        localRootPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The local repository path starts with the “$PROJECT_DIR” or “$ABOVE_PROJECT_DIR” placeholder.
     * </pre>
     *
     * <code>optional string local_root_path = 2;</code>
     * @return The bytes for localRootPath.
     */
    public com.google.protobuf.ByteString
        getLocalRootPathBytes() {
      java.lang.Object ref = localRootPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        localRootPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The local repository path starts with the “$PROJECT_DIR” or “$ABOVE_PROJECT_DIR” placeholder.
     * </pre>
     *
     * <code>optional string local_root_path = 2;</code>
     * @param value The localRootPath to set.
     * @return This builder for chaining.
     */
    public Builder setLocalRootPath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      localRootPath_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The local repository path starts with the “$PROJECT_DIR” or “$ABOVE_PROJECT_DIR” placeholder.
     * </pre>
     *
     * <code>optional string local_root_path = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLocalRootPath() {
      localRootPath_ = getDefaultInstance().getLocalRootPath();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The local repository path starts with the “$PROJECT_DIR” or “$ABOVE_PROJECT_DIR” placeholder.
     * </pre>
     *
     * <code>optional string local_root_path = 2;</code>
     * @param value The bytes for localRootPath to set.
     * @return This builder for chaining.
     */
    public Builder setLocalRootPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      localRootPath_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object revision_ = "";
    /**
     * <pre>
     * The revision identifier, e.g. the SHA1 git commit id
     * </pre>
     *
     * <code>optional string revision = 3;</code>
     * @return Whether the revision field is set.
     */
    public boolean hasRevision() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The revision identifier, e.g. the SHA1 git commit id
     * </pre>
     *
     * <code>optional string revision = 3;</code>
     * @return The revision.
     */
    public java.lang.String getRevision() {
      java.lang.Object ref = revision_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        revision_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The revision identifier, e.g. the SHA1 git commit id
     * </pre>
     *
     * <code>optional string revision = 3;</code>
     * @return The bytes for revision.
     */
    public com.google.protobuf.ByteString
        getRevisionBytes() {
      java.lang.Object ref = revision_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        revision_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The revision identifier, e.g. the SHA1 git commit id
     * </pre>
     *
     * <code>optional string revision = 3;</code>
     * @param value The revision to set.
     * @return This builder for chaining.
     */
    public Builder setRevision(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      revision_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The revision identifier, e.g. the SHA1 git commit id
     * </pre>
     *
     * <code>optional string revision = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRevision() {
      revision_ = getDefaultInstance().getRevision();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The revision identifier, e.g. the SHA1 git commit id
     * </pre>
     *
     * <code>optional string revision = 3;</code>
     * @param value The bytes for revision to set.
     * @return This builder for chaining.
     */
    public Builder setRevisionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      revision_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int worktreeStatus_ = 0;
    /**
     * <pre>
     * Status of the working tree this app was built from.
     * </pre>
     *
     * <code>optional .RepositoryInfo.WorktreeStatus worktree_status = 4;</code>
     * @return Whether the worktreeStatus field is set.
     */
    @java.lang.Override public boolean hasWorktreeStatus() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Status of the working tree this app was built from.
     * </pre>
     *
     * <code>optional .RepositoryInfo.WorktreeStatus worktree_status = 4;</code>
     * @return The enum numeric value on the wire for worktreeStatus.
     */
    @java.lang.Override public int getWorktreeStatusValue() {
      return worktreeStatus_;
    }
    /**
     * <pre>
     * Status of the working tree this app was built from.
     * </pre>
     *
     * <code>optional .RepositoryInfo.WorktreeStatus worktree_status = 4;</code>
     * @param value The enum numeric value on the wire for worktreeStatus to set.
     * @return This builder for chaining.
     */
    public Builder setWorktreeStatusValue(int value) {
      worktreeStatus_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Status of the working tree this app was built from.
     * </pre>
     *
     * <code>optional .RepositoryInfo.WorktreeStatus worktree_status = 4;</code>
     * @return The worktreeStatus.
     */
    @java.lang.Override
    public com.android.tools.idea.insights.proto.RepositoryInfo.WorktreeStatus getWorktreeStatus() {
      com.android.tools.idea.insights.proto.RepositoryInfo.WorktreeStatus result = com.android.tools.idea.insights.proto.RepositoryInfo.WorktreeStatus.forNumber(worktreeStatus_);
      return result == null ? com.android.tools.idea.insights.proto.RepositoryInfo.WorktreeStatus.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Status of the working tree this app was built from.
     * </pre>
     *
     * <code>optional .RepositoryInfo.WorktreeStatus worktree_status = 4;</code>
     * @param value The worktreeStatus to set.
     * @return This builder for chaining.
     */
    public Builder setWorktreeStatus(com.android.tools.idea.insights.proto.RepositoryInfo.WorktreeStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      worktreeStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Status of the working tree this app was built from.
     * </pre>
     *
     * <code>optional .RepositoryInfo.WorktreeStatus worktree_status = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearWorktreeStatus() {
      bitField0_ = (bitField0_ & ~0x00000008);
      worktreeStatus_ = 0;
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


    // @@protoc_insertion_point(builder_scope:RepositoryInfo)
  }

  // @@protoc_insertion_point(class_scope:RepositoryInfo)
  private static final com.android.tools.idea.insights.proto.RepositoryInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.android.tools.idea.insights.proto.RepositoryInfo();
  }

  public static com.android.tools.idea.insights.proto.RepositoryInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RepositoryInfo>
      PARSER = new com.google.protobuf.AbstractParser<RepositoryInfo>() {
    @java.lang.Override
    public RepositoryInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<RepositoryInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RepositoryInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.android.tools.idea.insights.proto.RepositoryInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

