// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface PerfettoSdkHandshakeMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.PerfettoSdkHandshakeMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Outcome of the handshake
   * </pre>
   *
   * <code>optional .android_studio.PerfettoSdkHandshakeMetadata.HandshakeResult handshake_result = 1;</code>
   * @return Whether the handshakeResult field is set.
   */
  boolean hasHandshakeResult();
  /**
   * <pre>
   * Outcome of the handshake
   * </pre>
   *
   * <code>optional .android_studio.PerfettoSdkHandshakeMetadata.HandshakeResult handshake_result = 1;</code>
   * @return The handshakeResult.
   */
  com.google.wireless.android.sdk.stats.PerfettoSdkHandshakeMetadata.HandshakeResult getHandshakeResult();
}
