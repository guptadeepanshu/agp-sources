// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface IntellijIndexingStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.IntellijIndexingStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * How long the indexing operation took in milliseconds.
   * </pre>
   *
   * <code>optional int32 duration_ms = 1;</code>
   * @return Whether the durationMs field is set.
   */
  boolean hasDurationMs();
  /**
   * <pre>
   * How long the indexing operation took in milliseconds.
   * </pre>
   *
   * <code>optional int32 duration_ms = 1;</code>
   * @return The durationMs.
   */
  int getDurationMs();

  /**
   * <pre>
   * Number of files indexed during this indexing operation.
   * </pre>
   *
   * <code>optional int32 file_count = 2;</code>
   * @return Whether the fileCount field is set.
   */
  boolean hasFileCount();
  /**
   * <pre>
   * Number of files indexed during this indexing operation.
   * </pre>
   *
   * <code>optional int32 file_count = 2;</code>
   * @return The fileCount.
   */
  int getFileCount();

  /**
   * <pre>
   * Number of threads configured to run indexing tasks.
   * </pre>
   *
   * <code>optional int32 indexer_threads = 3;</code>
   * @return Whether the indexerThreads field is set.
   */
  boolean hasIndexerThreads();
  /**
   * <pre>
   * Number of threads configured to run indexing tasks.
   * </pre>
   *
   * <code>optional int32 indexer_threads = 3;</code>
   * @return The indexerThreads.
   */
  int getIndexerThreads();

  /**
   * <pre>
   * Indexing operation details for specific indexes.
   * </pre>
   *
   * <code>repeated .android_studio.IntellijIndexingStats.IndexStats index_stats = 4;</code>
   */
  java.util.List<com.google.wireless.android.sdk.stats.IntellijIndexingStats.IndexStats> 
      getIndexStatsList();
  /**
   * <pre>
   * Indexing operation details for specific indexes.
   * </pre>
   *
   * <code>repeated .android_studio.IntellijIndexingStats.IndexStats index_stats = 4;</code>
   */
  com.google.wireless.android.sdk.stats.IntellijIndexingStats.IndexStats getIndexStats(int index);
  /**
   * <pre>
   * Indexing operation details for specific indexes.
   * </pre>
   *
   * <code>repeated .android_studio.IntellijIndexingStats.IndexStats index_stats = 4;</code>
   */
  int getIndexStatsCount();
  /**
   * <pre>
   * Indexing operation details for specific indexes.
   * </pre>
   *
   * <code>repeated .android_studio.IntellijIndexingStats.IndexStats index_stats = 4;</code>
   */
  java.util.List<? extends com.google.wireless.android.sdk.stats.IntellijIndexingStats.IndexStatsOrBuilder> 
      getIndexStatsOrBuilderList();
  /**
   * <pre>
   * Indexing operation details for specific indexes.
   * </pre>
   *
   * <code>repeated .android_studio.IntellijIndexingStats.IndexStats index_stats = 4;</code>
   */
  com.google.wireless.android.sdk.stats.IntellijIndexingStats.IndexStatsOrBuilder getIndexStatsOrBuilder(
      int index);
}
