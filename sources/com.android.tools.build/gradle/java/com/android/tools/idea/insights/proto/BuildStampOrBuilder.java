// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: version_control_metadata.proto

package com.android.tools.idea.insights.proto;

public interface BuildStampOrBuilder extends
    // @@protoc_insertion_point(interface_extends:BuildStamp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Info for all the VCS repositories included in the app.
   * </pre>
   *
   * <code>repeated .RepositoryInfo repositories = 1;</code>
   */
  java.util.List<com.android.tools.idea.insights.proto.RepositoryInfo> 
      getRepositoriesList();
  /**
   * <pre>
   * Info for all the VCS repositories included in the app.
   * </pre>
   *
   * <code>repeated .RepositoryInfo repositories = 1;</code>
   */
  com.android.tools.idea.insights.proto.RepositoryInfo getRepositories(int index);
  /**
   * <pre>
   * Info for all the VCS repositories included in the app.
   * </pre>
   *
   * <code>repeated .RepositoryInfo repositories = 1;</code>
   */
  int getRepositoriesCount();
  /**
   * <pre>
   * Info for all the VCS repositories included in the app.
   * </pre>
   *
   * <code>repeated .RepositoryInfo repositories = 1;</code>
   */
  java.util.List<? extends com.android.tools.idea.insights.proto.RepositoryInfoOrBuilder> 
      getRepositoriesOrBuilderList();
  /**
   * <pre>
   * Info for all the VCS repositories included in the app.
   * </pre>
   *
   * <code>repeated .RepositoryInfo repositories = 1;</code>
   */
  com.android.tools.idea.insights.proto.RepositoryInfoOrBuilder getRepositoriesOrBuilder(
      int index);

  /**
   * <pre>
   * Build system data.
   * </pre>
   *
   * <code>.BuildInfo build_info = 2;</code>
   * @return Whether the buildInfo field is set.
   */
  boolean hasBuildInfo();
  /**
   * <pre>
   * Build system data.
   * </pre>
   *
   * <code>.BuildInfo build_info = 2;</code>
   * @return The buildInfo.
   */
  com.android.tools.idea.insights.proto.BuildInfo getBuildInfo();
  /**
   * <pre>
   * Build system data.
   * </pre>
   *
   * <code>.BuildInfo build_info = 2;</code>
   */
  com.android.tools.idea.insights.proto.BuildInfoOrBuilder getBuildInfoOrBuilder();
}
