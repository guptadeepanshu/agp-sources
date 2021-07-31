// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface LldbSessionEndDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.LldbSessionEndDetails)
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
   * If the session ended with a failure, the related message.
   * e.g. 'failed to get reply to handshake packet'
   * </pre>
   *
   * <code>optional string failure_message = 2;</code>
   * @return Whether the failureMessage field is set.
   */
  boolean hasFailureMessage();
  /**
   * <pre>
   * If the session ended with a failure, the related message.
   * e.g. 'failed to get reply to handshake packet'
   * </pre>
   *
   * <code>optional string failure_message = 2;</code>
   * @return The failureMessage.
   */
  java.lang.String getFailureMessage();
  /**
   * <pre>
   * If the session ended with a failure, the related message.
   * e.g. 'failed to get reply to handshake packet'
   * </pre>
   *
   * <code>optional string failure_message = 2;</code>
   * @return The bytes for failureMessage.
   */
  com.google.protobuf.ByteString
      getFailureMessageBytes();

  /**
   * <pre>
   * Number of times the program was stopped by the debugger.
   * Proxy for use of the session to compute error rates.
   * </pre>
   *
   * <code>optional uint64 stops = 3;</code>
   * @return Whether the stops field is set.
   */
  boolean hasStops();
  /**
   * <pre>
   * Number of times the program was stopped by the debugger.
   * Proxy for use of the session to compute error rates.
   * </pre>
   *
   * <code>optional uint64 stops = 3;</code>
   * @return The stops.
   */
  long getStops();

  /**
   * <pre>
   * Number of errors encountered during the session.
   * Includes both fatal and non-fatal errors.
   * </pre>
   *
   * <code>optional uint64 errors = 4;</code>
   * @return Whether the errors field is set.
   */
  boolean hasErrors();
  /**
   * <pre>
   * Number of errors encountered during the session.
   * Includes both fatal and non-fatal errors.
   * </pre>
   *
   * <code>optional uint64 errors = 4;</code>
   * @return The errors.
   */
  long getErrors();
}
