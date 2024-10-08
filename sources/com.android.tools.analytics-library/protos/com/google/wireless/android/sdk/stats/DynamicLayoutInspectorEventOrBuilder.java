// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface DynamicLayoutInspectorEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.DynamicLayoutInspectorEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type of event
   * </pre>
   *
   * <code>optional .android_studio.DynamicLayoutInspectorEvent.DynamicLayoutInspectorEventType type = 1;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * Type of event
   * </pre>
   *
   * <code>optional .android_studio.DynamicLayoutInspectorEvent.DynamicLayoutInspectorEventType type = 1;</code>
   * @return The type.
   */
  com.google.wireless.android.sdk.stats.DynamicLayoutInspectorEvent.DynamicLayoutInspectorEventType getType();

  /**
   * <pre>
   * Data for the layout inspector session
   * </pre>
   *
   * <code>optional .android_studio.DynamicLayoutInspectorSession session = 2 [lazy = true];</code>
   * @return Whether the session field is set.
   */
  boolean hasSession();
  /**
   * <pre>
   * Data for the layout inspector session
   * </pre>
   *
   * <code>optional .android_studio.DynamicLayoutInspectorSession session = 2 [lazy = true];</code>
   * @return The session.
   */
  com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSession getSession();
  /**
   * <pre>
   * Data for the layout inspector session
   * </pre>
   *
   * <code>optional .android_studio.DynamicLayoutInspectorSession session = 2 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSessionOrBuilder getSessionOrBuilder();

  /**
   * <pre>
   * Additional information that will be available when looking at a snapshot
   * </pre>
   *
   * <code>optional .android_studio.DynamicLayoutInspectorSnapshotInfo snapshot_info = 3 [lazy = true];</code>
   * @return Whether the snapshotInfo field is set.
   */
  boolean hasSnapshotInfo();
  /**
   * <pre>
   * Additional information that will be available when looking at a snapshot
   * </pre>
   *
   * <code>optional .android_studio.DynamicLayoutInspectorSnapshotInfo snapshot_info = 3 [lazy = true];</code>
   * @return The snapshotInfo.
   */
  com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSnapshotInfo getSnapshotInfo();
  /**
   * <pre>
   * Additional information that will be available when looking at a snapshot
   * </pre>
   *
   * <code>optional .android_studio.DynamicLayoutInspectorSnapshotInfo snapshot_info = 3 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.DynamicLayoutInspectorSnapshotInfoOrBuilder getSnapshotInfoOrBuilder();

  /**
   * <pre>
   * Extra info for error-related events
   * </pre>
   *
   * <code>optional .android_studio.DynamicLayoutInspectorErrorInfo error_info = 4 [lazy = true];</code>
   * @return Whether the errorInfo field is set.
   */
  boolean hasErrorInfo();
  /**
   * <pre>
   * Extra info for error-related events
   * </pre>
   *
   * <code>optional .android_studio.DynamicLayoutInspectorErrorInfo error_info = 4 [lazy = true];</code>
   * @return The errorInfo.
   */
  com.google.wireless.android.sdk.stats.DynamicLayoutInspectorErrorInfo getErrorInfo();
  /**
   * <pre>
   * Extra info for error-related events
   * </pre>
   *
   * <code>optional .android_studio.DynamicLayoutInspectorErrorInfo error_info = 4 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.DynamicLayoutInspectorErrorInfoOrBuilder getErrorInfoOrBuilder();

  /**
   * <pre>
   * Extra info about auto connect to foreground process
   * </pre>
   *
   * <code>optional .android_studio.DynamicLayoutInspectorAutoConnectInfo auto_connect_info = 5 [lazy = true];</code>
   * @return Whether the autoConnectInfo field is set.
   */
  boolean hasAutoConnectInfo();
  /**
   * <pre>
   * Extra info about auto connect to foreground process
   * </pre>
   *
   * <code>optional .android_studio.DynamicLayoutInspectorAutoConnectInfo auto_connect_info = 5 [lazy = true];</code>
   * @return The autoConnectInfo.
   */
  com.google.wireless.android.sdk.stats.DynamicLayoutInspectorAutoConnectInfo getAutoConnectInfo();
  /**
   * <pre>
   * Extra info about auto connect to foreground process
   * </pre>
   *
   * <code>optional .android_studio.DynamicLayoutInspectorAutoConnectInfo auto_connect_info = 5 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.DynamicLayoutInspectorAutoConnectInfoOrBuilder getAutoConnectInfoOrBuilder();

  /**
   * <pre>
   * An error from the transport that prevents Layout Inspector from starting
   * </pre>
   *
   * <code>optional .android_studio.DynamicLayoutInspectorTransportError transport_error = 6 [lazy = true];</code>
   * @return Whether the transportError field is set.
   */
  boolean hasTransportError();
  /**
   * <pre>
   * An error from the transport that prevents Layout Inspector from starting
   * </pre>
   *
   * <code>optional .android_studio.DynamicLayoutInspectorTransportError transport_error = 6 [lazy = true];</code>
   * @return The transportError.
   */
  com.google.wireless.android.sdk.stats.DynamicLayoutInspectorTransportError getTransportError();
  /**
   * <pre>
   * An error from the transport that prevents Layout Inspector from starting
   * </pre>
   *
   * <code>optional .android_studio.DynamicLayoutInspectorTransportError transport_error = 6 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.DynamicLayoutInspectorTransportErrorOrBuilder getTransportErrorOrBuilder();
}
