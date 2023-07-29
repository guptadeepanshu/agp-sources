// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface SdkIndexLibraryDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.SdkIndexLibraryDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Group Id of library
   * </pre>
   *
   * <code>optional string group_id = 1;</code>
   * @return Whether the groupId field is set.
   */
  boolean hasGroupId();
  /**
   * <pre>
   * Group Id of library
   * </pre>
   *
   * <code>optional string group_id = 1;</code>
   * @return The groupId.
   */
  java.lang.String getGroupId();
  /**
   * <pre>
   * Group Id of library
   * </pre>
   *
   * <code>optional string group_id = 1;</code>
   * @return The bytes for groupId.
   */
  com.google.protobuf.ByteString
      getGroupIdBytes();

  /**
   * <pre>
   * Artifact Id of library
   * </pre>
   *
   * <code>optional string artifact_id = 2;</code>
   * @return Whether the artifactId field is set.
   */
  boolean hasArtifactId();
  /**
   * <pre>
   * Artifact Id of library
   * </pre>
   *
   * <code>optional string artifact_id = 2;</code>
   * @return The artifactId.
   */
  java.lang.String getArtifactId();
  /**
   * <pre>
   * Artifact Id of library
   * </pre>
   *
   * <code>optional string artifact_id = 2;</code>
   * @return The bytes for artifactId.
   */
  com.google.protobuf.ByteString
      getArtifactIdBytes();

  /**
   * <pre>
   * Version of library
   * </pre>
   *
   * <code>optional string version_string = 3;</code>
   * @return Whether the versionString field is set.
   */
  boolean hasVersionString();
  /**
   * <pre>
   * Version of library
   * </pre>
   *
   * <code>optional string version_string = 3;</code>
   * @return The versionString.
   */
  java.lang.String getVersionString();
  /**
   * <pre>
   * Version of library
   * </pre>
   *
   * <code>optional string version_string = 3;</code>
   * @return The bytes for versionString.
   */
  com.google.protobuf.ByteString
      getVersionStringBytes();

  /**
   * <pre>
   * Is this library reported as blocking publishing on Google Play?
   * </pre>
   *
   * <code>optional bool is_blocking = 4;</code>
   * @return Whether the isBlocking field is set.
   */
  boolean hasIsBlocking();
  /**
   * <pre>
   * Is this library reported as blocking publishing on Google Play?
   * </pre>
   *
   * <code>optional bool is_blocking = 4;</code>
   * @return The isBlocking.
   */
  boolean getIsBlocking();
}
