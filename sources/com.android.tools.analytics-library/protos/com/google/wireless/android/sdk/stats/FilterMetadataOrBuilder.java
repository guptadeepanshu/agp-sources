// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface FilterMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.FilterMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The view that is active when opening / using the filter.
   * </pre>
   *
   * <code>optional .android_studio.FilterMetadata.View active_view = 1;</code>
   * @return Whether the activeView field is set.
   */
  boolean hasActiveView();
  /**
   * <pre>
   * The view that is active when opening / using the filter.
   * </pre>
   *
   * <code>optional .android_studio.FilterMetadata.View active_view = 1;</code>
   * @return The activeView.
   */
  com.google.wireless.android.sdk.stats.FilterMetadata.View getActiveView();

  /**
   * <pre>
   * Bitwise field used to store features used derived from
   * FilterMetadata.FeaturesFlags enum.
   * </pre>
   *
   * <code>optional uint64 features_used = 2;</code>
   * @return Whether the featuresUsed field is set.
   */
  boolean hasFeaturesUsed();
  /**
   * <pre>
   * Bitwise field used to store features used derived from
   * FilterMetadata.FeaturesFlags enum.
   * </pre>
   *
   * <code>optional uint64 features_used = 2;</code>
   * @return The featuresUsed.
   */
  long getFeaturesUsed();

  /**
   * <pre>
   * The count of elements matched.
   * </pre>
   *
   * <code>optional uint32 matched_elements = 3;</code>
   * @return Whether the matchedElements field is set.
   */
  boolean hasMatchedElements();
  /**
   * <pre>
   * The count of elements matched.
   * </pre>
   *
   * <code>optional uint32 matched_elements = 3;</code>
   * @return The matchedElements.
   */
  int getMatchedElements();

  /**
   * <pre>
   * The number of total elements to be searched.
   * </pre>
   *
   * <code>optional uint32 total_elements = 4;</code>
   * @return Whether the totalElements field is set.
   */
  boolean hasTotalElements();
  /**
   * <pre>
   * The number of total elements to be searched.
   * </pre>
   *
   * <code>optional uint32 total_elements = 4;</code>
   * @return The totalElements.
   */
  int getTotalElements();

  /**
   * <pre>
   * The length of the string used to filter.
   * </pre>
   *
   * <code>optional uint32 search_length = 5;</code>
   * @return Whether the searchLength field is set.
   */
  boolean hasSearchLength();
  /**
   * <pre>
   * The length of the string used to filter.
   * </pre>
   *
   * <code>optional uint32 search_length = 5;</code>
   * @return The searchLength.
   */
  int getSearchLength();
}
