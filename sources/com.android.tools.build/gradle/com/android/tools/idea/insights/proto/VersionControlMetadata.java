// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: version_control_metadata.proto

package com.android.tools.idea.insights.proto;

public final class VersionControlMetadata {
  private VersionControlMetadata() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RepositoryInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RepositoryInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BuildInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BuildInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BuildStamp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BuildStamp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036version_control_metadata.proto\032\037google" +
      "/protobuf/timestamp.proto\"\330\002\n\016Repository" +
      "Info\022*\n\006system\030\001 \001(\0162\025.VersionControlSys" +
      "temH\000\210\001\001\022\034\n\017local_root_path\030\002 \001(\tH\001\210\001\001\022\025" +
      "\n\010revision\030\003 \001(\tH\002\210\001\001\022<\n\017worktree_status" +
      "\030\004 \001(\0162\036.RepositoryInfo.WorktreeStatusH\003" +
      "\210\001\001\"g\n\016WorktreeStatus\022\037\n\033WORKTREE_STATUS" +
      "_UNSPECIFIED\020\000\022\031\n\025WORKTREE_STATUS_CLEAN\020" +
      "\001\022\031\n\025WORKTREE_STATUS_DIRTY\020\002B\t\n\007_systemB" +
      "\022\n\020_local_root_pathB\013\n\t_revisionB\022\n\020_wor" +
      "ktree_status\"\335\001\n\tBuildInfo\022\023\n\006job_id\030\001 \001" +
      "(\tH\000\210\001\001\022\024\n\007job_url\030\002 \001(\tH\001\210\001\001\022\025\n\010build_i" +
      "d\030\003 \001(\tH\002\210\001\001\022\022\n\005label\030\004 \001(\tH\003\210\001\001\0228\n\017buil" +
      "d_timestamp\030\005 \001(\0132\032.google.protobuf.Time" +
      "stampH\004\210\001\001B\t\n\007_job_idB\n\n\010_job_urlB\013\n\t_bu" +
      "ild_idB\010\n\006_labelB\022\n\020_build_timestamp\"\242\002\n" +
      "\nBuildStamp\022%\n\014repositories\030\001 \003(\0132\017.Repo" +
      "sitoryInfo\022#\n\nbuild_info\030\002 \001(\0132\n.BuildIn" +
      "foH\000\210\001\001\022C\n\025generate_error_reason\030\003 \001(\0162\037" +
      ".BuildStamp.GenerateErrorReasonH\001\210\001\001\"Z\n\023" +
      "GenerateErrorReason\022\017\n\013UNSPECIFIED\020\000\022\032\n\026" +
      "NO_SUPPORTED_VCS_FOUND\020\001\022\026\n\022NO_VALID_GIT" +
      "_FOUND\020\002B\r\n\013_build_infoB\030\n\026_generate_err" +
      "or_reason*f\n\024VersionControlSystem\022&\n\"VER" +
      "SION_CONTROL_SYSTEM_UNSPECIFIED\020\000\022\007\n\003GIT" +
      "\020\001\022\007\n\003SVN\020\002\022\006\n\002HG\020\003\022\014\n\010PERFORCE\020\004B)\n%com" +
      ".android.tools.idea.insights.protoP\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_RepositoryInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RepositoryInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RepositoryInfo_descriptor,
        new java.lang.String[] { "System", "LocalRootPath", "Revision", "WorktreeStatus", "System", "LocalRootPath", "Revision", "WorktreeStatus", });
    internal_static_BuildInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_BuildInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BuildInfo_descriptor,
        new java.lang.String[] { "JobId", "JobUrl", "BuildId", "Label", "BuildTimestamp", "JobId", "JobUrl", "BuildId", "Label", "BuildTimestamp", });
    internal_static_BuildStamp_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_BuildStamp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BuildStamp_descriptor,
        new java.lang.String[] { "Repositories", "BuildInfo", "GenerateErrorReason", "BuildInfo", "GenerateErrorReason", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
