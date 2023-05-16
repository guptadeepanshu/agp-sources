// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface ComposeMultiPreviewEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.ComposeMultiPreviewEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * One for each new or modified node in the MultiPreview graph, in terms of
   * annotation relations, detected when the process of finding preview
   * elements is executed in a file.
   * </pre>
   *
   * <code>repeated .android_studio.ComposeMultiPreviewEvent.ComposeMultiPreviewNodeInfo multi_preview_nodes = 1;</code>
   */
  java.util.List<com.google.wireless.android.sdk.stats.ComposeMultiPreviewEvent.ComposeMultiPreviewNodeInfo> 
      getMultiPreviewNodesList();
  /**
   * <pre>
   * One for each new or modified node in the MultiPreview graph, in terms of
   * annotation relations, detected when the process of finding preview
   * elements is executed in a file.
   * </pre>
   *
   * <code>repeated .android_studio.ComposeMultiPreviewEvent.ComposeMultiPreviewNodeInfo multi_preview_nodes = 1;</code>
   */
  com.google.wireless.android.sdk.stats.ComposeMultiPreviewEvent.ComposeMultiPreviewNodeInfo getMultiPreviewNodes(int index);
  /**
   * <pre>
   * One for each new or modified node in the MultiPreview graph, in terms of
   * annotation relations, detected when the process of finding preview
   * elements is executed in a file.
   * </pre>
   *
   * <code>repeated .android_studio.ComposeMultiPreviewEvent.ComposeMultiPreviewNodeInfo multi_preview_nodes = 1;</code>
   */
  int getMultiPreviewNodesCount();
  /**
   * <pre>
   * One for each new or modified node in the MultiPreview graph, in terms of
   * annotation relations, detected when the process of finding preview
   * elements is executed in a file.
   * </pre>
   *
   * <code>repeated .android_studio.ComposeMultiPreviewEvent.ComposeMultiPreviewNodeInfo multi_preview_nodes = 1;</code>
   */
  java.util.List<? extends com.google.wireless.android.sdk.stats.ComposeMultiPreviewEvent.ComposeMultiPreviewNodeInfoOrBuilder> 
      getMultiPreviewNodesOrBuilderList();
  /**
   * <pre>
   * One for each new or modified node in the MultiPreview graph, in terms of
   * annotation relations, detected when the process of finding preview
   * elements is executed in a file.
   * </pre>
   *
   * <code>repeated .android_studio.ComposeMultiPreviewEvent.ComposeMultiPreviewNodeInfo multi_preview_nodes = 1;</code>
   */
  com.google.wireless.android.sdk.stats.ComposeMultiPreviewEvent.ComposeMultiPreviewNodeInfoOrBuilder getMultiPreviewNodesOrBuilder(
      int index);
}
