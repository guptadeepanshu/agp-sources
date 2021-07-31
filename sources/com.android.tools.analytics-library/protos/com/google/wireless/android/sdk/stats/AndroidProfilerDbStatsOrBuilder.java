// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface AndroidProfilerDbStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.AndroidProfilerDbStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The amount of time the database has been running (in seconds)
   * </pre>
   *
   * <code>optional uint32 age_sec = 1;</code>
   * @return Whether the ageSec field is set.
   */
  boolean hasAgeSec();
  /**
   * <pre>
   * The amount of time the database has been running (in seconds)
   * </pre>
   *
   * <code>optional uint32 age_sec = 1;</code>
   * @return The ageSec.
   */
  int getAgeSec();

  /**
   * <pre>
   * DB cache on disk (in MB)
   * </pre>
   *
   * <code>optional uint32 total_disk_mb = 2;</code>
   * @return Whether the totalDiskMb field is set.
   */
  boolean hasTotalDiskMb();
  /**
   * <pre>
   * DB cache on disk (in MB)
   * </pre>
   *
   * <code>optional uint32 total_disk_mb = 2;</code>
   * @return The totalDiskMb.
   */
  int getTotalDiskMb();

  /**
   * <pre>
   * Entries for each table in our DB
   * </pre>
   *
   * <code>repeated .android_studio.AndroidProfilerDbTable tables = 3;</code>
   */
  java.util.List<com.google.wireless.android.sdk.stats.AndroidProfilerDbTable> 
      getTablesList();
  /**
   * <pre>
   * Entries for each table in our DB
   * </pre>
   *
   * <code>repeated .android_studio.AndroidProfilerDbTable tables = 3;</code>
   */
  com.google.wireless.android.sdk.stats.AndroidProfilerDbTable getTables(int index);
  /**
   * <pre>
   * Entries for each table in our DB
   * </pre>
   *
   * <code>repeated .android_studio.AndroidProfilerDbTable tables = 3;</code>
   */
  int getTablesCount();
  /**
   * <pre>
   * Entries for each table in our DB
   * </pre>
   *
   * <code>repeated .android_studio.AndroidProfilerDbTable tables = 3;</code>
   */
  java.util.List<? extends com.google.wireless.android.sdk.stats.AndroidProfilerDbTableOrBuilder> 
      getTablesOrBuilderList();
  /**
   * <pre>
   * Entries for each table in our DB
   * </pre>
   *
   * <code>repeated .android_studio.AndroidProfilerDbTable tables = 3;</code>
   */
  com.google.wireless.android.sdk.stats.AndroidProfilerDbTableOrBuilder getTablesOrBuilder(
      int index);
}
