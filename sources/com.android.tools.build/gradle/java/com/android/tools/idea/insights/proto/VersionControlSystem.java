// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: version_control_metadata.proto

package com.android.tools.idea.insights.proto;

/**
 * <pre>
 * The VCS software used.
 * </pre>
 *
 * Protobuf enum {@code VersionControlSystem}
 */
public enum VersionControlSystem
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unknown
   * </pre>
   *
   * <code>VERSION_CONTROL_SYSTEM_UNSPECIFIED = 0;</code>
   */
  VERSION_CONTROL_SYSTEM_UNSPECIFIED(0),
  /**
   * <pre>
   * Git SCM
   * </pre>
   *
   * <code>GIT = 1;</code>
   */
  GIT(1),
  /**
   * <pre>
   * Subversion revision
   * </pre>
   *
   * <code>SVN = 2;</code>
   */
  SVN(2),
  /**
   * <pre>
   * Mercurial
   * </pre>
   *
   * <code>HG = 3;</code>
   */
  HG(3),
  /**
   * <pre>
   * Perforce
   * </pre>
   *
   * <code>PERFORCE = 4;</code>
   */
  PERFORCE(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unknown
   * </pre>
   *
   * <code>VERSION_CONTROL_SYSTEM_UNSPECIFIED = 0;</code>
   */
  public static final int VERSION_CONTROL_SYSTEM_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Git SCM
   * </pre>
   *
   * <code>GIT = 1;</code>
   */
  public static final int GIT_VALUE = 1;
  /**
   * <pre>
   * Subversion revision
   * </pre>
   *
   * <code>SVN = 2;</code>
   */
  public static final int SVN_VALUE = 2;
  /**
   * <pre>
   * Mercurial
   * </pre>
   *
   * <code>HG = 3;</code>
   */
  public static final int HG_VALUE = 3;
  /**
   * <pre>
   * Perforce
   * </pre>
   *
   * <code>PERFORCE = 4;</code>
   */
  public static final int PERFORCE_VALUE = 4;


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
  public static VersionControlSystem valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static VersionControlSystem forNumber(int value) {
    switch (value) {
      case 0: return VERSION_CONTROL_SYSTEM_UNSPECIFIED;
      case 1: return GIT;
      case 2: return SVN;
      case 3: return HG;
      case 4: return PERFORCE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<VersionControlSystem>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      VersionControlSystem> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<VersionControlSystem>() {
          public VersionControlSystem findValueByNumber(int number) {
            return VersionControlSystem.forNumber(number);
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
    return com.android.tools.idea.insights.proto.VersionControlMetadata.getDescriptor().getEnumTypes().get(0);
  }

  private static final VersionControlSystem[] VALUES = values();

  public static VersionControlSystem valueOf(
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

  private VersionControlSystem(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:VersionControlSystem)
}
