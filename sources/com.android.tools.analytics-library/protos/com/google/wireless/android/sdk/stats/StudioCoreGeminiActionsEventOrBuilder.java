// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface StudioCoreGeminiActionsEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.StudioCoreGeminiActionsEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .android_studio.StudioCoreGeminiActionsEvent.Action action = 1;</code>
   * @return Whether the action field is set.
   */
  boolean hasAction();
  /**
   * <code>optional .android_studio.StudioCoreGeminiActionsEvent.Action action = 1;</code>
   * @return The action.
   */
  com.google.wireless.android.sdk.stats.StudioCoreGeminiActionsEvent.Action getAction();

  /**
   * <code>optional uint32 prompt_hash = 2;</code>
   * @return Whether the promptHash field is set.
   */
  boolean hasPromptHash();
  /**
   * <code>optional uint32 prompt_hash = 2;</code>
   * @return The promptHash.
   */
  int getPromptHash();

  /**
   * <code>optional uint32 prompt_size = 3;</code>
   * @return Whether the promptSize field is set.
   */
  boolean hasPromptSize();
  /**
   * <code>optional uint32 prompt_size = 3;</code>
   * @return The promptSize.
   */
  int getPromptSize();

  /**
   * <code>optional uint32 latency_ms = 4;</code>
   * @return Whether the latencyMs field is set.
   */
  boolean hasLatencyMs();
  /**
   * <code>optional uint32 latency_ms = 4;</code>
   * @return The latencyMs.
   */
  int getLatencyMs();

  /**
   * <code>optional uint32 results_count = 5;</code>
   * @return Whether the resultsCount field is set.
   */
  boolean hasResultsCount();
  /**
   * <code>optional uint32 results_count = 5;</code>
   * @return The resultsCount.
   */
  int getResultsCount();

  /**
   * <code>optional uint32 results_taken = 6;</code>
   * @return Whether the resultsTaken field is set.
   */
  boolean hasResultsTaken();
  /**
   * <code>optional uint32 results_taken = 6;</code>
   * @return The resultsTaken.
   */
  int getResultsTaken();
}
