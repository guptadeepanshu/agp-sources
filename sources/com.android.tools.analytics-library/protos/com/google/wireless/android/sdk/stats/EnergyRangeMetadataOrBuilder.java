// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface EnergyRangeMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.EnergyRangeMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .android_studio.EnergyEventCount event_counts = 1;</code>
   */
  java.util.List<com.google.wireless.android.sdk.stats.EnergyEventCount> 
      getEventCountsList();
  /**
   * <code>repeated .android_studio.EnergyEventCount event_counts = 1;</code>
   */
  com.google.wireless.android.sdk.stats.EnergyEventCount getEventCounts(int index);
  /**
   * <code>repeated .android_studio.EnergyEventCount event_counts = 1;</code>
   */
  int getEventCountsCount();
  /**
   * <code>repeated .android_studio.EnergyEventCount event_counts = 1;</code>
   */
  java.util.List<? extends com.google.wireless.android.sdk.stats.EnergyEventCountOrBuilder> 
      getEventCountsOrBuilderList();
  /**
   * <code>repeated .android_studio.EnergyEventCount event_counts = 1;</code>
   */
  com.google.wireless.android.sdk.stats.EnergyEventCountOrBuilder getEventCountsOrBuilder(
      int index);
}
