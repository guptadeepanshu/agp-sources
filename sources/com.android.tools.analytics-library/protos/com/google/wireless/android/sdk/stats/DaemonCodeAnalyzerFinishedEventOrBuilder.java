// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface DaemonCodeAnalyzerFinishedEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.DaemonCodeAnalyzerFinishedEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Daemon highlighting segment duration until it was finished or restarted for
   * some reason.
   * </pre>
   *
   * <code>optional uint64 segment_duration_ms = 1;</code>
   * @return Whether the segmentDurationMs field is set.
   */
  boolean hasSegmentDurationMs();
  /**
   * <pre>
   * Daemon highlighting segment duration until it was finished or restarted for
   * some reason.
   * </pre>
   *
   * <code>optional uint64 segment_duration_ms = 1;</code>
   * @return The segmentDurationMs.
   */
  long getSegmentDurationMs();

  /**
   * <pre>
   * Full highlighting duration since the file was modified and/or dumb mode
   * status changed. It should be equal to the sum of segments.
   * </pre>
   *
   * <code>optional uint64 full_duration_since_started_ms = 2;</code>
   * @return Whether the fullDurationSinceStartedMs field is set.
   */
  boolean hasFullDurationSinceStartedMs();
  /**
   * <pre>
   * Full highlighting duration since the file was modified and/or dumb mode
   * status changed. It should be equal to the sum of segments.
   * </pre>
   *
   * <code>optional uint64 full_duration_since_started_ms = 2;</code>
   * @return The fullDurationSinceStartedMs.
   */
  long getFullDurationSinceStartedMs();

  /**
   * <pre>
   * Number of errors found by the DaemonCodeAnalyzer.
   * </pre>
   *
   * <code>optional uint32 errors = 3;</code>
   * @return Whether the errors field is set.
   */
  boolean hasErrors();
  /**
   * <pre>
   * Number of errors found by the DaemonCodeAnalyzer.
   * </pre>
   *
   * <code>optional uint32 errors = 3;</code>
   * @return The errors.
   */
  int getErrors();

  /**
   * <pre>
   * Number of warnings found by the DaemonCodeAnalyzer.
   * </pre>
   *
   * <code>optional uint32 warnings = 4;</code>
   * @return Whether the warnings field is set.
   */
  boolean hasWarnings();
  /**
   * <pre>
   * Number of warnings found by the DaemonCodeAnalyzer.
   * </pre>
   *
   * <code>optional uint32 warnings = 4;</code>
   * @return The warnings.
   */
  int getWarnings();

  /**
   * <pre>
   * Total number of lines analyzed by the DaemonCodeAnalyzer.
   * </pre>
   *
   * <code>optional uint32 lines = 5;</code>
   * @return Whether the lines field is set.
   */
  boolean hasLines();
  /**
   * <pre>
   * Total number of lines analyzed by the DaemonCodeAnalyzer.
   * </pre>
   *
   * <code>optional uint32 lines = 5;</code>
   * @return The lines.
   */
  int getLines();

  /**
   * <pre>
   * Type of the file that was analyzed.
   * </pre>
   *
   * <code>optional string file_type = 6;</code>
   * @return Whether the fileType field is set.
   */
  boolean hasFileType();
  /**
   * <pre>
   * Type of the file that was analyzed.
   * </pre>
   *
   * <code>optional string file_type = 6;</code>
   * @return The fileType.
   */
  java.lang.String getFileType();
  /**
   * <pre>
   * Type of the file that was analyzed.
   * </pre>
   *
   * <code>optional string file_type = 6;</code>
   * @return The bytes for fileType.
   */
  com.google.protobuf.ByteString
      getFileTypeBytes();

  /**
   * <pre>
   * Was the highlighting completed.
   * </pre>
   *
   * <code>optional bool highlighting_completed = 7;</code>
   * @return Whether the highlightingCompleted field is set.
   */
  boolean hasHighlightingCompleted();
  /**
   * <pre>
   * Was the highlighting completed.
   * </pre>
   *
   * <code>optional bool highlighting_completed = 7;</code>
   * @return The highlightingCompleted.
   */
  boolean getHighlightingCompleted();

  /**
   * <pre>
   * Did the iteration happened while the IDE was in the dumb mode.
   * </pre>
   *
   * <code>optional bool dumb_mode = 8;</code>
   * @return Whether the dumbMode field is set.
   */
  boolean hasDumbMode();
  /**
   * <pre>
   * Did the iteration happened while the IDE was in the dumb mode.
   * </pre>
   *
   * <code>optional bool dumb_mode = 8;</code>
   * @return The dumbMode.
   */
  boolean getDumbMode();
}
