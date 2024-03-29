// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: version_control_metadata.proto

package com.android.tools.idea.insights.proto;

public interface BuildInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:BuildInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the build job which created this bundle.
   * </pre>
   *
   * <code>optional string job_id = 1;</code>
   * @return Whether the jobId field is set.
   */
  boolean hasJobId();
  /**
   * <pre>
   * ID of the build job which created this bundle.
   * </pre>
   *
   * <code>optional string job_id = 1;</code>
   * @return The jobId.
   */
  java.lang.String getJobId();
  /**
   * <pre>
   * ID of the build job which created this bundle.
   * </pre>
   *
   * <code>optional string job_id = 1;</code>
   * @return The bytes for jobId.
   */
  com.google.protobuf.ByteString
      getJobIdBytes();

  /**
   * <pre>
   * URL to the build job which created this bundle. Does not need to be public,
   * and probably will not be.
   * </pre>
   *
   * <code>optional string job_url = 2;</code>
   * @return Whether the jobUrl field is set.
   */
  boolean hasJobUrl();
  /**
   * <pre>
   * URL to the build job which created this bundle. Does not need to be public,
   * and probably will not be.
   * </pre>
   *
   * <code>optional string job_url = 2;</code>
   * @return The jobUrl.
   */
  java.lang.String getJobUrl();
  /**
   * <pre>
   * URL to the build job which created this bundle. Does not need to be public,
   * and probably will not be.
   * </pre>
   *
   * <code>optional string job_url = 2;</code>
   * @return The bytes for jobUrl.
   */
  com.google.protobuf.ByteString
      getJobUrlBytes();

  /**
   * <pre>
   * ID for the specific build, e.g. a UUID.
   * </pre>
   *
   * <code>optional string build_id = 3;</code>
   * @return Whether the buildId field is set.
   */
  boolean hasBuildId();
  /**
   * <pre>
   * ID for the specific build, e.g. a UUID.
   * </pre>
   *
   * <code>optional string build_id = 3;</code>
   * @return The buildId.
   */
  java.lang.String getBuildId();
  /**
   * <pre>
   * ID for the specific build, e.g. a UUID.
   * </pre>
   *
   * <code>optional string build_id = 3;</code>
   * @return The bytes for buildId.
   */
  com.google.protobuf.ByteString
      getBuildIdBytes();

  /**
   * <pre>
   * Build label: an arbitrary string set by the build system. May be used to
   * embed a release label.
   * </pre>
   *
   * <code>optional string label = 4;</code>
   * @return Whether the label field is set.
   */
  boolean hasLabel();
  /**
   * <pre>
   * Build label: an arbitrary string set by the build system. May be used to
   * embed a release label.
   * </pre>
   *
   * <code>optional string label = 4;</code>
   * @return The label.
   */
  java.lang.String getLabel();
  /**
   * <pre>
   * Build label: an arbitrary string set by the build system. May be used to
   * embed a release label.
   * </pre>
   *
   * <code>optional string label = 4;</code>
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <pre>
   * Time at which the build was started.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp build_timestamp = 5;</code>
   * @return Whether the buildTimestamp field is set.
   */
  boolean hasBuildTimestamp();
  /**
   * <pre>
   * Time at which the build was started.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp build_timestamp = 5;</code>
   * @return The buildTimestamp.
   */
  com.google.protobuf.Timestamp getBuildTimestamp();
  /**
   * <pre>
   * Time at which the build was started.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp build_timestamp = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getBuildTimestampOrBuilder();
}
