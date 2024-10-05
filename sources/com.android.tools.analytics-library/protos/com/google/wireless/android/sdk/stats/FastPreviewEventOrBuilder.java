// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface FastPreviewEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.FastPreviewEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Result of the LiveEdit device push
   * </pre>
   *
   * <code>optional .android_studio.FastPreviewEvent.Type type = 1;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * Result of the LiveEdit device push
   * </pre>
   *
   * <code>optional .android_studio.FastPreviewEvent.Type type = 1;</code>
   * @return The type.
   */
  com.google.wireless.android.sdk.stats.FastPreviewEvent.Type getType();

  /**
   * <pre>
   * The compilation result when type = COMPILE
   * </pre>
   *
   * <code>optional .android_studio.FastPreviewEvent.CompilationResult compilation_result = 2 [lazy = true];</code>
   * @return Whether the compilationResult field is set.
   */
  boolean hasCompilationResult();
  /**
   * <pre>
   * The compilation result when type = COMPILE
   * </pre>
   *
   * <code>optional .android_studio.FastPreviewEvent.CompilationResult compilation_result = 2 [lazy = true];</code>
   * @return The compilationResult.
   */
  com.google.wireless.android.sdk.stats.FastPreviewEvent.CompilationResult getCompilationResult();
  /**
   * <pre>
   * The compilation result when type = COMPILE
   * </pre>
   *
   * <code>optional .android_studio.FastPreviewEvent.CompilationResult compilation_result = 2 [lazy = true];</code>
   */
  com.google.wireless.android.sdk.stats.FastPreviewEvent.CompilationResultOrBuilder getCompilationResultOrBuilder();
}
