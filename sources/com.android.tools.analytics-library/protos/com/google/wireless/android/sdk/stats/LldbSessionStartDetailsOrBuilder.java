// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface LldbSessionStartDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.LldbSessionStartDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A UUID used to relate start and end of a native debug session.
   * </pre>
   *
   * <code>optional string debug_session_id = 1;</code>
   * @return Whether the debugSessionId field is set.
   */
  boolean hasDebugSessionId();
  /**
   * <pre>
   * A UUID used to relate start and end of a native debug session.
   * </pre>
   *
   * <code>optional string debug_session_id = 1;</code>
   * @return The debugSessionId.
   */
  java.lang.String getDebugSessionId();
  /**
   * <pre>
   * A UUID used to relate start and end of a native debug session.
   * </pre>
   *
   * <code>optional string debug_session_id = 1;</code>
   * @return The bytes for debugSessionId.
   */
  com.google.protobuf.ByteString
      getDebugSessionIdBytes();

  /**
   * <pre>
   * Debugger type for this session
   * </pre>
   *
   * <code>optional .android_studio.AndroidStudioEvent.DebuggerType debugger_type = 2;</code>
   * @return Whether the debuggerType field is set.
   */
  boolean hasDebuggerType();
  /**
   * <pre>
   * Debugger type for this session
   * </pre>
   *
   * <code>optional .android_studio.AndroidStudioEvent.DebuggerType debugger_type = 2;</code>
   * @return The debuggerType.
   */
  com.google.wireless.android.sdk.stats.AndroidStudioEvent.DebuggerType getDebuggerType();

  /**
   * <pre>
   * Run configuration that was used to start this session.
   * </pre>
   *
   * <code>optional .android_studio.AndroidStudioEvent.RunConfigurationType run_configuration_type = 3;</code>
   * @return Whether the runConfigurationType field is set.
   */
  boolean hasRunConfigurationType();
  /**
   * <pre>
   * Run configuration that was used to start this session.
   * </pre>
   *
   * <code>optional .android_studio.AndroidStudioEvent.RunConfigurationType run_configuration_type = 3;</code>
   * @return The runConfigurationType.
   */
  com.google.wireless.android.sdk.stats.AndroidStudioEvent.RunConfigurationType getRunConfigurationType();

  /**
   * <pre>
   * True if debugger_type was chosen via the Auto debugger type.
   * </pre>
   *
   * <code>optional bool auto_debugger = 4;</code>
   * @return Whether the autoDebugger field is set.
   */
  boolean hasAutoDebugger();
  /**
   * <pre>
   * True if debugger_type was chosen via the Auto debugger type.
   * </pre>
   *
   * <code>optional bool auto_debugger = 4;</code>
   * @return The autoDebugger.
   */
  boolean getAutoDebugger();

  /**
   * <pre>
   * Device on which the debuggable app is running.
   * </pre>
   *
   * <code>optional .android_studio.DeviceInfo device_info = 5 [lazy = true];</code>
   * @return Whether the deviceInfo field is set.
   */
  boolean hasDeviceInfo();
  /**
   * <pre>
   * Device on which the debuggable app is running.
   * </pre>
   *
   * <code>optional .android_studio.DeviceInfo device_info = 5 [lazy = true];</code>
   * @return The deviceInfo.
   */
  com.google.wireless.android.sdk.stats.DeviceInfo getDeviceInfo();
  /**
   * <pre>
   * Device on which the debuggable app is running.
   * </pre>
   *
   * <code>optional .android_studio.DeviceInfo device_info = 5 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.DeviceInfoOrBuilder getDeviceInfoOrBuilder();

  /**
   * <pre>
   * Version of the native debugger.
   * </pre>
   *
   * <code>optional string lldb_version = 6;</code>
   * @return Whether the lldbVersion field is set.
   */
  boolean hasLldbVersion();
  /**
   * <pre>
   * Version of the native debugger.
   * </pre>
   *
   * <code>optional string lldb_version = 6;</code>
   * @return The lldbVersion.
   */
  java.lang.String getLldbVersion();
  /**
   * <pre>
   * Version of the native debugger.
   * </pre>
   *
   * <code>optional string lldb_version = 6;</code>
   * @return The bytes for lldbVersion.
   */
  com.google.protobuf.ByteString
      getLldbVersionBytes();

  /**
   * <pre>
   * Type of starter used to start this session.
   * </pre>
   *
   * <code>optional .android_studio.LldbSessionStartDetails.StarterType starter_type = 7;</code>
   * @return Whether the starterType field is set.
   */
  boolean hasStarterType();
  /**
   * <pre>
   * Type of starter used to start this session.
   * </pre>
   *
   * <code>optional .android_studio.LldbSessionStartDetails.StarterType starter_type = 7;</code>
   * @return The starterType.
   */
  com.google.wireless.android.sdk.stats.LldbSessionStartDetails.StarterType getStarterType();
}
