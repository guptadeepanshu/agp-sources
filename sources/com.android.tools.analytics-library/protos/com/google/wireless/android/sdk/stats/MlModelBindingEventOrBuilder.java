// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface MlModelBindingEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.MlModelBindingEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The detailed type of this event.
   * </pre>
   *
   * <code>optional .android_studio.MlModelBindingEvent.EventType event_type = 1;</code>
   * @return Whether the eventType field is set.
   */
  boolean hasEventType();
  /**
   * <pre>
   * The detailed type of this event.
   * </pre>
   *
   * <code>optional .android_studio.MlModelBindingEvent.EventType event_type = 1;</code>
   * @return The eventType.
   */
  com.google.wireless.android.sdk.stats.MlModelBindingEvent.EventType getEventType();

  /**
   * <pre>
   * Related ML models information.
   * </pre>
   *
   * <code>repeated .android_studio.MlModelBindingEvent.ModelMetadata model_metadatas = 2;</code>
   */
  java.util.List<com.google.wireless.android.sdk.stats.MlModelBindingEvent.ModelMetadata> 
      getModelMetadatasList();
  /**
   * <pre>
   * Related ML models information.
   * </pre>
   *
   * <code>repeated .android_studio.MlModelBindingEvent.ModelMetadata model_metadatas = 2;</code>
   */
  com.google.wireless.android.sdk.stats.MlModelBindingEvent.ModelMetadata getModelMetadatas(int index);
  /**
   * <pre>
   * Related ML models information.
   * </pre>
   *
   * <code>repeated .android_studio.MlModelBindingEvent.ModelMetadata model_metadatas = 2;</code>
   */
  int getModelMetadatasCount();
  /**
   * <pre>
   * Related ML models information.
   * </pre>
   *
   * <code>repeated .android_studio.MlModelBindingEvent.ModelMetadata model_metadatas = 2;</code>
   */
  java.util.List<? extends com.google.wireless.android.sdk.stats.MlModelBindingEvent.ModelMetadataOrBuilder> 
      getModelMetadatasOrBuilderList();
  /**
   * <pre>
   * Related ML models information.
   * </pre>
   *
   * <code>repeated .android_studio.MlModelBindingEvent.ModelMetadata model_metadatas = 2;</code>
   */
  com.google.wireless.android.sdk.stats.MlModelBindingEvent.ModelMetadataOrBuilder getModelMetadatasOrBuilder(
      int index);

  /**
   * <pre>
   * Set only when the event contains failure.
   * </pre>
   *
   * <code>optional .android_studio.MlModelBindingEvent.ErrorCode error_code = 3;</code>
   * @return Whether the errorCode field is set.
   */
  boolean hasErrorCode();
  /**
   * <pre>
   * Set only when the event contains failure.
   * </pre>
   *
   * <code>optional .android_studio.MlModelBindingEvent.ErrorCode error_code = 3;</code>
   * @return The errorCode.
   */
  com.google.wireless.android.sdk.stats.MlModelBindingEvent.ErrorCode getErrorCode();
}
