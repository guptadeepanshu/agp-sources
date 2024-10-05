// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface CpuCaptureMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.CpuCaptureMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The result of a CPU capture
   * </pre>
   *
   * <code>optional .android_studio.CpuCaptureMetadata.CaptureStatus capture_status = 1;</code>
   * @return Whether the captureStatus field is set.
   */
  boolean hasCaptureStatus();
  /**
   * <pre>
   * The result of a CPU capture
   * </pre>
   *
   * <code>optional .android_studio.CpuCaptureMetadata.CaptureStatus capture_status = 1;</code>
   * @return The captureStatus.
   */
  com.google.wireless.android.sdk.stats.CpuCaptureMetadata.CaptureStatus getCaptureStatus();

  /**
   * <pre>
   * Duration from user pressing "Record" to pressing "Stop"
   * Not set if |capture_status| is not set to |SUCCESS|
   * </pre>
   *
   * <code>optional uint64 capture_duration_ms = 2;</code>
   * @return Whether the captureDurationMs field is set.
   */
  boolean hasCaptureDurationMs();
  /**
   * <pre>
   * Duration from user pressing "Record" to pressing "Stop"
   * Not set if |capture_status| is not set to |SUCCESS|
   * </pre>
   *
   * <code>optional uint64 capture_duration_ms = 2;</code>
   * @return The captureDurationMs.
   */
  long getCaptureDurationMs();

  /**
   * <pre>
   * Duration from the first trace data timestamp to the last one.
   * Not set if |capture_status| is not set to |SUCCESS|
   * </pre>
   *
   * <code>optional uint64 record_duration_ms = 3;</code>
   * @return Whether the recordDurationMs field is set.
   */
  boolean hasRecordDurationMs();
  /**
   * <pre>
   * Duration from the first trace data timestamp to the last one.
   * Not set if |capture_status| is not set to |SUCCESS|
   * </pre>
   *
   * <code>optional uint64 record_duration_ms = 3;</code>
   * @return The recordDurationMs.
   */
  long getRecordDurationMs();

  /**
   * <pre>
   * Size of the trace file generated by the capture.
   * Not set if |capture_status| is set to |STOP_CAPTURING_FAILURE|
   * </pre>
   *
   * <code>optional uint32 trace_file_size_bytes = 4;</code>
   * @return Whether the traceFileSizeBytes field is set.
   */
  boolean hasTraceFileSizeBytes();
  /**
   * <pre>
   * Size of the trace file generated by the capture.
   * Not set if |capture_status| is set to |STOP_CAPTURING_FAILURE|
   * </pre>
   *
   * <code>optional uint32 trace_file_size_bytes = 4;</code>
   * @return The traceFileSizeBytes.
   */
  int getTraceFileSizeBytes();

  /**
   * <pre>
   * How much time it took to parse the trace file
   * Not set if |capture_status| is not set to |SUCCESS|
   * </pre>
   *
   * <code>optional uint64 parsing_time_ms = 5;</code>
   * @return Whether the parsingTimeMs field is set.
   */
  boolean hasParsingTimeMs();
  /**
   * <pre>
   * How much time it took to parse the trace file
   * Not set if |capture_status| is not set to |SUCCESS|
   * </pre>
   *
   * <code>optional uint64 parsing_time_ms = 5;</code>
   * @return The parsingTimeMs.
   */
  long getParsingTimeMs();

  /**
   * <pre>
   * The user's configuration used to generate this capture
   * </pre>
   *
   * <code>optional .android_studio.CpuProfilingConfig profiling_config = 6 [lazy = true];</code>
   * @return Whether the profilingConfig field is set.
   */
  boolean hasProfilingConfig();
  /**
   * <pre>
   * The user's configuration used to generate this capture
   * </pre>
   *
   * <code>optional .android_studio.CpuProfilingConfig profiling_config = 6 [lazy = true];</code>
   * @return The profilingConfig.
   */
  com.google.wireless.android.sdk.stats.CpuProfilingConfig getProfilingConfig();
  /**
   * <pre>
   * The user's configuration used to generate this capture
   * </pre>
   *
   * <code>optional .android_studio.CpuProfilingConfig profiling_config = 6 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.CpuProfilingConfigOrBuilder getProfilingConfigOrBuilder();

  /**
   * <pre>
   * Timeout set by the user for the system "profiler.cpu.art.stop.timeout.sec"
   * property. Set if |profiling_config.type| is |ART|.
   * </pre>
   *
   * <code>optional int32 art_stop_timeout_sec = 7;</code>
   * @return Whether the artStopTimeoutSec field is set.
   */
  boolean hasArtStopTimeoutSec();
  /**
   * <pre>
   * Timeout set by the user for the system "profiler.cpu.art.stop.timeout.sec"
   * property. Set if |profiling_config.type| is |ART|.
   * </pre>
   *
   * <code>optional int32 art_stop_timeout_sec = 7;</code>
   * @return The artStopTimeoutSec.
   */
  int getArtStopTimeoutSec();

  /**
   * <pre>
   * How much time it took to stop CPU recording.
   * </pre>
   *
   * <code>optional int32 stopping_time_ms = 8;</code>
   * @return Whether the stoppingTimeMs field is set.
   */
  boolean hasStoppingTimeMs();
  /**
   * <pre>
   * How much time it took to stop CPU recording.
   * </pre>
   *
   * <code>optional int32 stopping_time_ms = 8;</code>
   * @return The stoppingTimeMs.
   */
  int getStoppingTimeMs();

  /**
   * <pre>
   * Whether the trace contains Compose Tracing nodes
   * </pre>
   *
   * <code>optional bool has_compose_tracing_nodes = 9;</code>
   * @return Whether the hasComposeTracingNodes field is set.
   */
  boolean hasHasComposeTracingNodes();
  /**
   * <pre>
   * Whether the trace contains Compose Tracing nodes
   * </pre>
   *
   * <code>optional bool has_compose_tracing_nodes = 9;</code>
   * @return The hasComposeTracingNodes.
   */
  boolean getHasComposeTracingNodes();

  /**
   * <pre>
   * The entry point to the cpu profiling stage (cpu profiler)
   * </pre>
   *
   * <code>optional .android_studio.CpuCaptureMetadata.CpuProfilerEntryPoint cpu_profiler_entry_point = 10;</code>
   * @return Whether the cpuProfilerEntryPoint field is set.
   */
  boolean hasCpuProfilerEntryPoint();
  /**
   * <pre>
   * The entry point to the cpu profiling stage (cpu profiler)
   * </pre>
   *
   * <code>optional .android_studio.CpuCaptureMetadata.CpuProfilerEntryPoint cpu_profiler_entry_point = 10;</code>
   * @return The cpuProfilerEntryPoint.
   */
  com.google.wireless.android.sdk.stats.CpuCaptureMetadata.CpuProfilerEntryPoint getCpuProfilerEntryPoint();
}
