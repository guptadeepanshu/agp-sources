// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface MemorySettingsEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.MemorySettingsEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Kind of the event.
   * </pre>
   *
   * <code>optional .android_studio.MemorySettingsEvent.EventKind kind = 1;</code>
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   * <pre>
   * Kind of the event.
   * </pre>
   *
   * <code>optional .android_studio.MemorySettingsEvent.EventKind kind = 1;</code>
   * @return The kind.
   */
  com.google.wireless.android.sdk.stats.MemorySettingsEvent.EventKind getKind();

  /**
   * <pre>
   * Current memory settings.
   * </pre>
   *
   * <code>optional .android_studio.MemorySettings current = 2;</code>
   * @return Whether the current field is set.
   */
  boolean hasCurrent();
  /**
   * <pre>
   * Current memory settings.
   * </pre>
   *
   * <code>optional .android_studio.MemorySettings current = 2;</code>
   * @return The current.
   */
  com.google.wireless.android.sdk.stats.MemorySettings getCurrent();
  /**
   * <pre>
   * Current memory settings.
   * </pre>
   *
   * <code>optional .android_studio.MemorySettings current = 2;</code>
   */
  com.google.wireless.android.sdk.stats.MemorySettingsOrBuilder getCurrentOrBuilder();

  /**
   * <pre>
   * Recommended memory settings.
   * </pre>
   *
   * <code>optional .android_studio.MemorySettings recommended = 3;</code>
   * @return Whether the recommended field is set.
   */
  boolean hasRecommended();
  /**
   * <pre>
   * Recommended memory settings.
   * </pre>
   *
   * <code>optional .android_studio.MemorySettings recommended = 3;</code>
   * @return The recommended.
   */
  com.google.wireless.android.sdk.stats.MemorySettings getRecommended();
  /**
   * <pre>
   * Recommended memory settings.
   * </pre>
   *
   * <code>optional .android_studio.MemorySettings recommended = 3;</code>
   */
  com.google.wireless.android.sdk.stats.MemorySettingsOrBuilder getRecommendedOrBuilder();

  /**
   * <pre>
   * New memory settings changed by users (may or may not be saved yet).
   * </pre>
   *
   * <code>optional .android_studio.MemorySettings changed = 4;</code>
   * @return Whether the changed field is set.
   */
  boolean hasChanged();
  /**
   * <pre>
   * New memory settings changed by users (may or may not be saved yet).
   * </pre>
   *
   * <code>optional .android_studio.MemorySettings changed = 4;</code>
   * @return The changed.
   */
  com.google.wireless.android.sdk.stats.MemorySettings getChanged();
  /**
   * <pre>
   * New memory settings changed by users (may or may not be saved yet).
   * </pre>
   *
   * <code>optional .android_studio.MemorySettings changed = 4;</code>
   */
  com.google.wireless.android.sdk.stats.MemorySettingsOrBuilder getChangedOrBuilder();
}
