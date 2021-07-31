// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface GcPauseInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.GcPauseInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The type of the garbage collector
   * </pre>
   *
   * <code>optional .android_studio.GcPauseInfo.GcType collector_type = 1;</code>
   * @return Whether the collectorType field is set.
   */
  boolean hasCollectorType();
  /**
   * <pre>
   * The type of the garbage collector
   * </pre>
   *
   * <code>optional .android_studio.GcPauseInfo.GcType collector_type = 1;</code>
   * @return The collectorType.
   */
  com.google.wireless.android.sdk.stats.GcPauseInfo.GcType getCollectorType();

  /**
   * <pre>
   * Distribution of pause times for this collector
   * </pre>
   *
   * <code>optional .android_studio.Histogram pause_times_ms = 2;</code>
   * @return Whether the pauseTimesMs field is set.
   */
  boolean hasPauseTimesMs();
  /**
   * <pre>
   * Distribution of pause times for this collector
   * </pre>
   *
   * <code>optional .android_studio.Histogram pause_times_ms = 2;</code>
   * @return The pauseTimesMs.
   */
  com.google.wireless.android.sdk.stats.Histogram getPauseTimesMs();
  /**
   * <pre>
   * Distribution of pause times for this collector
   * </pre>
   *
   * <code>optional .android_studio.Histogram pause_times_ms = 2;</code>
   */
  com.google.wireless.android.sdk.stats.HistogramOrBuilder getPauseTimesMsOrBuilder();
}
