// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface LayoutInspectorEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.LayoutInspectorEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type of event
   * </pre>
   *
   * <code>optional .android_studio.LayoutInspectorEvent.LayoutInspectorEventType type = 1;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * Type of event
   * </pre>
   *
   * <code>optional .android_studio.LayoutInspectorEvent.LayoutInspectorEventType type = 1;</code>
   * @return The type.
   */
  com.google.wireless.android.sdk.stats.LayoutInspectorEvent.LayoutInspectorEventType getType();

  /**
   * <pre>
   * defined if LayoutInspectorEventType = CAPTURE, CAPTURE_TIME_OUT
   * </pre>
   *
   * <code>optional int64 duration_in_ms = 2;</code>
   * @return Whether the durationInMs field is set.
   */
  boolean hasDurationInMs();
  /**
   * <pre>
   * defined if LayoutInspectorEventType = CAPTURE, CAPTURE_TIME_OUT
   * </pre>
   *
   * <code>optional int64 duration_in_ms = 2;</code>
   * @return The durationInMs.
   */
  long getDurationInMs();

  /**
   * <pre>
   * defined if LayoutInspectorEventType = CAPTURE
   * size of the captured view data in bytes
   * </pre>
   *
   * <code>optional int64 data_size = 3;</code>
   * @return Whether the dataSize field is set.
   */
  boolean hasDataSize();
  /**
   * <pre>
   * defined if LayoutInspectorEventType = CAPTURE
   * size of the captured view data in bytes
   * </pre>
   *
   * <code>optional int64 data_size = 3;</code>
   * @return The dataSize.
   */
  long getDataSize();

  /**
   * <pre>
   * defined if LayoutInspectorEventType = CAPTURE or OPEN
   * which version of the protocol is used to capture layout info
   * </pre>
   *
   * <code>optional uint32 version = 4;</code>
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   * <pre>
   * defined if LayoutInspectorEventType = CAPTURE or OPEN
   * which version of the protocol is used to capture layout info
   * </pre>
   *
   * <code>optional uint32 version = 4;</code>
   * @return The version.
   */
  int getVersion();
}
