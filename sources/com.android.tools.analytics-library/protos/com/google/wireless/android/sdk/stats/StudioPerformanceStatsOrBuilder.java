// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface StudioPerformanceStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.StudioPerformanceStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Time for which the UI was blocked in milliseconds
   * </pre>
   *
   * <code>optional int32 ui_freeze_time_ms = 1;</code>
   * @return Whether the uiFreezeTimeMs field is set.
   */
  boolean hasUiFreezeTimeMs();
  /**
   * <pre>
   * Time for which the UI was blocked in milliseconds
   * </pre>
   *
   * <code>optional int32 ui_freeze_time_ms = 1;</code>
   * @return The uiFreezeTimeMs.
   */
  int getUiFreezeTimeMs();

  /**
   * <pre>
   * Distribution of times taken to process events in the main event loop,
   * in milliseconds. The number of samples is approximately equal to the
   * number of events handled, quantized by event_service_time_sample_period.
   * For example, if the 10-20ms bin contains 100 samples, it means that
   * approximately 100 events took between 10 and 20 milliseconds to process.
   * </pre>
   *
   * <code>optional .android_studio.Histogram event_service_time_ms = 2 [lazy = true];</code>
   * @return Whether the eventServiceTimeMs field is set.
   */
  boolean hasEventServiceTimeMs();
  /**
   * <pre>
   * Distribution of times taken to process events in the main event loop,
   * in milliseconds. The number of samples is approximately equal to the
   * number of events handled, quantized by event_service_time_sample_period.
   * For example, if the 10-20ms bin contains 100 samples, it means that
   * approximately 100 events took between 10 and 20 milliseconds to process.
   * </pre>
   *
   * <code>optional .android_studio.Histogram event_service_time_ms = 2 [lazy = true];</code>
   * @return The eventServiceTimeMs.
   */
  com.google.wireless.android.sdk.stats.Histogram getEventServiceTimeMs();
  /**
   * <pre>
   * Distribution of times taken to process events in the main event loop,
   * in milliseconds. The number of samples is approximately equal to the
   * number of events handled, quantized by event_service_time_sample_period.
   * For example, if the 10-20ms bin contains 100 samples, it means that
   * approximately 100 events took between 10 and 20 milliseconds to process.
   * </pre>
   *
   * <code>optional .android_studio.Histogram event_service_time_ms = 2 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.HistogramOrBuilder getEventServiceTimeMsOrBuilder();

  /**
   * <pre>
   * Sample period used to compute the event_service_time_ms histogram. For
   * example, if this is set to 10 then the service time was measured for
   * every 10th event, and each measurement counted for 10 samples in
   * the histogram. This is mainly intended for computing error bars
   * and is not needed for interpreting the histogram itself.
   * </pre>
   *
   * <code>optional int32 event_service_time_sample_period = 3;</code>
   * @return Whether the eventServiceTimeSamplePeriod field is set.
   */
  boolean hasEventServiceTimeSamplePeriod();
  /**
   * <pre>
   * Sample period used to compute the event_service_time_ms histogram. For
   * example, if this is set to 10 then the service time was measured for
   * every 10th event, and each measurement counted for 10 samples in
   * the histogram. This is mainly intended for computing error bars
   * and is not needed for interpreting the histogram itself.
   * </pre>
   *
   * <code>optional int32 event_service_time_sample_period = 3;</code>
   * @return The eventServiceTimeSamplePeriod.
   */
  int getEventServiceTimeSamplePeriod();

  /**
   * <pre>
   * Histogram of wait times for the global write lock
   * </pre>
   *
   * <code>optional .android_studio.Histogram write_lock_wait_time_ms = 4 [lazy = true];</code>
   * @return Whether the writeLockWaitTimeMs field is set.
   */
  boolean hasWriteLockWaitTimeMs();
  /**
   * <pre>
   * Histogram of wait times for the global write lock
   * </pre>
   *
   * <code>optional .android_studio.Histogram write_lock_wait_time_ms = 4 [lazy = true];</code>
   * @return The writeLockWaitTimeMs.
   */
  com.google.wireless.android.sdk.stats.Histogram getWriteLockWaitTimeMs();
  /**
   * <pre>
   * Histogram of wait times for the global write lock
   * </pre>
   *
   * <code>optional .android_studio.Histogram write_lock_wait_time_ms = 4 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.HistogramOrBuilder getWriteLockWaitTimeMsOrBuilder();

  /**
   * <pre>
   * Information about GC pause time distributions, one for each collector that
   * is active.
   * </pre>
   *
   * <code>repeated .android_studio.GcPauseInfo gc_pause_info = 5;</code>
   */
  java.util.List<com.google.wireless.android.sdk.stats.GcPauseInfo> 
      getGcPauseInfoList();
  /**
   * <pre>
   * Information about GC pause time distributions, one for each collector that
   * is active.
   * </pre>
   *
   * <code>repeated .android_studio.GcPauseInfo gc_pause_info = 5;</code>
   */
  com.google.wireless.android.sdk.stats.GcPauseInfo getGcPauseInfo(int index);
  /**
   * <pre>
   * Information about GC pause time distributions, one for each collector that
   * is active.
   * </pre>
   *
   * <code>repeated .android_studio.GcPauseInfo gc_pause_info = 5;</code>
   */
  int getGcPauseInfoCount();
  /**
   * <pre>
   * Information about GC pause time distributions, one for each collector that
   * is active.
   * </pre>
   *
   * <code>repeated .android_studio.GcPauseInfo gc_pause_info = 5;</code>
   */
  java.util.List<? extends com.google.wireless.android.sdk.stats.GcPauseInfoOrBuilder> 
      getGcPauseInfoOrBuilderList();
  /**
   * <pre>
   * Information about GC pause time distributions, one for each collector that
   * is active.
   * </pre>
   *
   * <code>repeated .android_studio.GcPauseInfo gc_pause_info = 5;</code>
   */
  com.google.wireless.android.sdk.stats.GcPauseInfoOrBuilder getGcPauseInfoOrBuilder(
      int index);
}
