// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface DefaultActivityLocatorStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.DefaultActivityLocatorStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Whether getting information from the merged manifest blocked the UI thread.
   * </pre>
   *
   * <code>optional bool blocks_ui_thread = 1;</code>
   * @return Whether the blocksUiThread field is set.
   */
  boolean hasBlocksUiThread();
  /**
   * <pre>
   * Whether getting information from the merged manifest blocked the UI thread.
   * </pre>
   *
   * <code>optional bool blocks_ui_thread = 1;</code>
   * @return The blocksUiThread.
   */
  boolean getBlocksUiThread();

  /**
   * <pre>
   * Whether we're leveraging an index to determine the module's activities.
   * </pre>
   *
   * <code>optional bool index_based = 2;</code>
   * @return Whether the indexBased field is set.
   */
  boolean hasIndexBased();
  /**
   * <pre>
   * Whether we're leveraging an index to determine the module's activities.
   * </pre>
   *
   * <code>optional bool index_based = 2;</code>
   * @return The indexBased.
   */
  boolean getIndexBased();

  /**
   * <pre>
   * Whether DefaultActivityLocator used a potentially stale manifest (as
   * opposed to blocking on a fresh view of the merged manifest).
   * </pre>
   *
   * <code>optional bool used_potentially_stale_manifest = 3;</code>
   * @return Whether the usedPotentiallyStaleManifest field is set.
   */
  boolean hasUsedPotentiallyStaleManifest();
  /**
   * <pre>
   * Whether DefaultActivityLocator used a potentially stale manifest (as
   * opposed to blocking on a fresh view of the merged manifest).
   * </pre>
   *
   * <code>optional bool used_potentially_stale_manifest = 3;</code>
   * @return The usedPotentiallyStaleManifest.
   */
  boolean getUsedPotentiallyStaleManifest();

  /**
   * <pre>
   * How long it took us to obtain the list of activiteis
   * from the merged manifest.
   * </pre>
   *
   * <code>optional uint64 latency_ms = 4;</code>
   * @return Whether the latencyMs field is set.
   */
  boolean hasLatencyMs();
  /**
   * <pre>
   * How long it took us to obtain the list of activiteis
   * from the merged manifest.
   * </pre>
   *
   * <code>optional uint64 latency_ms = 4;</code>
   * @return The latencyMs.
   */
  long getLatencyMs();
}
