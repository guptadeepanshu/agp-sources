// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface AdbServerStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.AdbServerState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bool is_managed = 1;</code>
   * @return Whether the isManaged field is set.
   */
  boolean hasIsManaged();
  /**
   * <code>optional bool is_managed = 1;</code>
   * @return The isManaged.
   */
  boolean getIsManaged();

  /**
   * <code>optional string version = 2;</code>
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   * <code>optional string version = 2;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <code>optional string version = 2;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <code>optional .android_studio.AdbServerState.MDNDBackend mdns_backend = 3;</code>
   * @return Whether the mdnsBackend field is set.
   */
  boolean hasMdnsBackend();
  /**
   * <code>optional .android_studio.AdbServerState.MDNDBackend mdns_backend = 3;</code>
   * @return The mdnsBackend.
   */
  com.google.wireless.android.sdk.stats.AdbServerState.MDNDBackend getMdnsBackend();

  /**
   * <code>optional .android_studio.AdbServerState.USBBackend usb_backend = 4;</code>
   * @return Whether the usbBackend field is set.
   */
  boolean hasUsbBackend();
  /**
   * <code>optional .android_studio.AdbServerState.USBBackend usb_backend = 4;</code>
   * @return The usbBackend.
   */
  com.google.wireless.android.sdk.stats.AdbServerState.USBBackend getUsbBackend();
}
