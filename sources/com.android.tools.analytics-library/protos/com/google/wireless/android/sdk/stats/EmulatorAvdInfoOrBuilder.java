// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface EmulatorAvdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.EmulatorAvdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the AVD. Deprecated as it could potentially contain PII.
   * </pre>
   *
   * <code>optional string name = 1 [deprecated = true];</code>
   * @deprecated
   * @return Whether the name field is set.
   */
  @java.lang.Deprecated boolean hasName();
  /**
   * <pre>
   * Name of the AVD. Deprecated as it could potentially contain PII.
   * </pre>
   *
   * <code>optional string name = 1 [deprecated = true];</code>
   * @deprecated
   * @return The name.
   */
  @java.lang.Deprecated java.lang.String getName();
  /**
   * <pre>
   * Name of the AVD. Deprecated as it could potentially contain PII.
   * </pre>
   *
   * <code>optional string name = 1 [deprecated = true];</code>
   * @deprecated
   * @return The bytes for name.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Api level (23 = M, 24 = N, ...)
   * </pre>
   *
   * <code>optional int64 api_level = 2;</code>
   * @return Whether the apiLevel field is set.
   */
  boolean hasApiLevel();
  /**
   * <pre>
   * Api level (23 = M, 24 = N, ...)
   * </pre>
   *
   * <code>optional int64 api_level = 2;</code>
   * @return The apiLevel.
   */
  long getApiLevel();

  /**
   * <pre>
   * CPU architecture.
   * </pre>
   *
   * <code>optional .android_studio.EmulatorDetails.GuestCpuArchitecture arch = 3;</code>
   * @return Whether the arch field is set.
   */
  boolean hasArch();
  /**
   * <pre>
   * CPU architecture.
   * </pre>
   *
   * <code>optional .android_studio.EmulatorDetails.GuestCpuArchitecture arch = 3;</code>
   * @return The arch.
   */
  com.google.wireless.android.sdk.stats.EmulatorDetails.GuestCpuArchitecture getArch();

  /**
   * <pre>
   * When was this AVD created, UTC Unix timespamp.
   * </pre>
   *
   * <code>optional int64 creation_timestamp = 4;</code>
   * @return Whether the creationTimestamp field is set.
   */
  boolean hasCreationTimestamp();
  /**
   * <pre>
   * When was this AVD created, UTC Unix timespamp.
   * </pre>
   *
   * <code>optional int64 creation_timestamp = 4;</code>
   * @return The creationTimestamp.
   */
  long getCreationTimestamp();

  /**
   * <pre>
   * A build-id string from build.prop, something like 'sdk_google_phone 1231231
   * 10-11-2012'.
   * </pre>
   *
   * <code>optional string build_id = 5;</code>
   * @return Whether the buildId field is set.
   */
  boolean hasBuildId();
  /**
   * <pre>
   * A build-id string from build.prop, something like 'sdk_google_phone 1231231
   * 10-11-2012'.
   * </pre>
   *
   * <code>optional string build_id = 5;</code>
   * @return The buildId.
   */
  java.lang.String getBuildId();
  /**
   * <pre>
   * A build-id string from build.prop, something like 'sdk_google_phone 1231231
   * 10-11-2012'.
   * </pre>
   *
   * <code>optional string build_id = 5;</code>
   * @return The bytes for buildId.
   */
  com.google.protobuf.ByteString
      getBuildIdBytes();

  /**
   * <pre>
   * Unix build UTC timestamp.
   * </pre>
   *
   * <code>optional int64 build_timestamp = 6;</code>
   * @return Whether the buildTimestamp field is set.
   */
  boolean hasBuildTimestamp();
  /**
   * <pre>
   * Unix build UTC timestamp.
   * </pre>
   *
   * <code>optional int64 build_timestamp = 6;</code>
   * @return The buildTimestamp.
   */
  long getBuildTimestamp();

  /**
   * <pre>
   * Kind of the image (e.g. pure AOSP, with Google APIs, etc.).
   * </pre>
   *
   * <code>optional .android_studio.EmulatorAvdInfo.EmulatorAvdImageKind image_kind = 7;</code>
   * @return Whether the imageKind field is set.
   */
  boolean hasImageKind();
  /**
   * <pre>
   * Kind of the image (e.g. pure AOSP, with Google APIs, etc.).
   * </pre>
   *
   * <code>optional .android_studio.EmulatorAvdInfo.EmulatorAvdImageKind image_kind = 7;</code>
   * @return The imageKind.
   */
  com.google.wireless.android.sdk.stats.EmulatorAvdInfo.EmulatorAvdImageKind getImageKind();

  /**
   * <pre>
   * A collection of files in the AVD
   * (usually 3 entries: kernel, system &amp; ramdisk).
   * </pre>
   *
   * <code>repeated .android_studio.EmulatorAvdFile files = 8;</code>
   */
  java.util.List<com.google.wireless.android.sdk.stats.EmulatorAvdFile> 
      getFilesList();
  /**
   * <pre>
   * A collection of files in the AVD
   * (usually 3 entries: kernel, system &amp; ramdisk).
   * </pre>
   *
   * <code>repeated .android_studio.EmulatorAvdFile files = 8;</code>
   */
  com.google.wireless.android.sdk.stats.EmulatorAvdFile getFiles(int index);
  /**
   * <pre>
   * A collection of files in the AVD
   * (usually 3 entries: kernel, system &amp; ramdisk).
   * </pre>
   *
   * <code>repeated .android_studio.EmulatorAvdFile files = 8;</code>
   */
  int getFilesCount();
  /**
   * <pre>
   * A collection of files in the AVD
   * (usually 3 entries: kernel, system &amp; ramdisk).
   * </pre>
   *
   * <code>repeated .android_studio.EmulatorAvdFile files = 8;</code>
   */
  java.util.List<? extends com.google.wireless.android.sdk.stats.EmulatorAvdFileOrBuilder> 
      getFilesOrBuilderList();
  /**
   * <pre>
   * A collection of files in the AVD
   * (usually 3 entries: kernel, system &amp; ramdisk).
   * </pre>
   *
   * <code>repeated .android_studio.EmulatorAvdFile files = 8;</code>
   */
  com.google.wireless.android.sdk.stats.EmulatorAvdFileOrBuilder getFilesOrBuilder(
      int index);

  /**
   * <pre>
   * Collection of other AVD properties, mostly relating to flavor
   * (TV vs phone vs Auto, etc)
   * </pre>
   *
   * <code>repeated .android_studio.EmulatorAvdInfo.EmulatorAvdProperty properties = 9;</code>
   * @return A list containing the properties.
   */
  java.util.List<com.google.wireless.android.sdk.stats.EmulatorAvdInfo.EmulatorAvdProperty> getPropertiesList();
  /**
   * <pre>
   * Collection of other AVD properties, mostly relating to flavor
   * (TV vs phone vs Auto, etc)
   * </pre>
   *
   * <code>repeated .android_studio.EmulatorAvdInfo.EmulatorAvdProperty properties = 9;</code>
   * @return The count of properties.
   */
  int getPropertiesCount();
  /**
   * <pre>
   * Collection of other AVD properties, mostly relating to flavor
   * (TV vs phone vs Auto, etc)
   * </pre>
   *
   * <code>repeated .android_studio.EmulatorAvdInfo.EmulatorAvdProperty properties = 9;</code>
   * @param index The index of the element to return.
   * @return The properties at the given index.
   */
  com.google.wireless.android.sdk.stats.EmulatorAvdInfo.EmulatorAvdProperty getProperties(int index);
}
