// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface SmlTransformEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.SmlTransformEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.android_studio.SmlTransformEvent.TransformRequest request = 1;</code>
   * @return Whether the request field is set.
   */
  boolean hasRequest();
  /**
   * <code>.android_studio.SmlTransformEvent.TransformRequest request = 1;</code>
   * @return The request.
   */
  com.google.wireless.android.sdk.stats.SmlTransformEvent.TransformRequest getRequest();
  /**
   * <code>.android_studio.SmlTransformEvent.TransformRequest request = 1;</code>
   */
  com.google.wireless.android.sdk.stats.SmlTransformEvent.TransformRequestOrBuilder getRequestOrBuilder();

  /**
   * <code>.android_studio.SmlTransformEvent.TransformResponse response = 2;</code>
   * @return Whether the response field is set.
   */
  boolean hasResponse();
  /**
   * <code>.android_studio.SmlTransformEvent.TransformResponse response = 2;</code>
   * @return The response.
   */
  com.google.wireless.android.sdk.stats.SmlTransformEvent.TransformResponse getResponse();
  /**
   * <code>.android_studio.SmlTransformEvent.TransformResponse response = 2;</code>
   */
  com.google.wireless.android.sdk.stats.SmlTransformEvent.TransformResponseOrBuilder getResponseOrBuilder();

  /**
   * <code>.android_studio.SmlTransformEvent.TransformShown shown = 3;</code>
   * @return Whether the shown field is set.
   */
  boolean hasShown();
  /**
   * <code>.android_studio.SmlTransformEvent.TransformShown shown = 3;</code>
   * @return The shown.
   */
  com.google.wireless.android.sdk.stats.SmlTransformEvent.TransformShown getShown();
  /**
   * <code>.android_studio.SmlTransformEvent.TransformShown shown = 3;</code>
   */
  com.google.wireless.android.sdk.stats.SmlTransformEvent.TransformShownOrBuilder getShownOrBuilder();

  /**
   * <code>.android_studio.SmlTransformEvent.TransformAccepted accepted = 4;</code>
   * @return Whether the accepted field is set.
   */
  boolean hasAccepted();
  /**
   * <code>.android_studio.SmlTransformEvent.TransformAccepted accepted = 4;</code>
   * @return The accepted.
   */
  com.google.wireless.android.sdk.stats.SmlTransformEvent.TransformAccepted getAccepted();
  /**
   * <code>.android_studio.SmlTransformEvent.TransformAccepted accepted = 4;</code>
   */
  com.google.wireless.android.sdk.stats.SmlTransformEvent.TransformAcceptedOrBuilder getAcceptedOrBuilder();

  /**
   * <pre>
   * The kind of transform, which will be used to differentiate
   * metrics for Document action, Custom transforms etc.
   * </pre>
   *
   * <code>optional .android_studio.SmlTransformEvent.TransformKind transform_kind = 5;</code>
   * @return Whether the transformKind field is set.
   */
  boolean hasTransformKind();
  /**
   * <pre>
   * The kind of transform, which will be used to differentiate
   * metrics for Document action, Custom transforms etc.
   * </pre>
   *
   * <code>optional .android_studio.SmlTransformEvent.TransformKind transform_kind = 5;</code>
   * @return The transformKind.
   */
  com.google.wireless.android.sdk.stats.SmlTransformEvent.TransformKind getTransformKind();

  public com.google.wireless.android.sdk.stats.SmlTransformEvent.TransformCase getTransformCase();
}
