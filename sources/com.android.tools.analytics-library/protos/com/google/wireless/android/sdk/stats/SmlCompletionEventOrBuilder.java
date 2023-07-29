// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface SmlCompletionEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.SmlCompletionEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.android_studio.SmlCompletionEvent.CompletionRequest request = 1;</code>
   * @return Whether the request field is set.
   */
  boolean hasRequest();
  /**
   * <code>.android_studio.SmlCompletionEvent.CompletionRequest request = 1;</code>
   * @return The request.
   */
  com.google.wireless.android.sdk.stats.SmlCompletionEvent.CompletionRequest getRequest();
  /**
   * <code>.android_studio.SmlCompletionEvent.CompletionRequest request = 1;</code>
   */
  com.google.wireless.android.sdk.stats.SmlCompletionEvent.CompletionRequestOrBuilder getRequestOrBuilder();

  /**
   * <code>.android_studio.SmlCompletionEvent.CompletionResponse response = 2;</code>
   * @return Whether the response field is set.
   */
  boolean hasResponse();
  /**
   * <code>.android_studio.SmlCompletionEvent.CompletionResponse response = 2;</code>
   * @return The response.
   */
  com.google.wireless.android.sdk.stats.SmlCompletionEvent.CompletionResponse getResponse();
  /**
   * <code>.android_studio.SmlCompletionEvent.CompletionResponse response = 2;</code>
   */
  com.google.wireless.android.sdk.stats.SmlCompletionEvent.CompletionResponseOrBuilder getResponseOrBuilder();

  /**
   * <code>.android_studio.SmlCompletionEvent.CompletionShown shown = 3;</code>
   * @return Whether the shown field is set.
   */
  boolean hasShown();
  /**
   * <code>.android_studio.SmlCompletionEvent.CompletionShown shown = 3;</code>
   * @return The shown.
   */
  com.google.wireless.android.sdk.stats.SmlCompletionEvent.CompletionShown getShown();
  /**
   * <code>.android_studio.SmlCompletionEvent.CompletionShown shown = 3;</code>
   */
  com.google.wireless.android.sdk.stats.SmlCompletionEvent.CompletionShownOrBuilder getShownOrBuilder();

  /**
   * <code>.android_studio.SmlCompletionEvent.CompletionAccepted accepted = 4;</code>
   * @return Whether the accepted field is set.
   */
  boolean hasAccepted();
  /**
   * <code>.android_studio.SmlCompletionEvent.CompletionAccepted accepted = 4;</code>
   * @return The accepted.
   */
  com.google.wireless.android.sdk.stats.SmlCompletionEvent.CompletionAccepted getAccepted();
  /**
   * <code>.android_studio.SmlCompletionEvent.CompletionAccepted accepted = 4;</code>
   */
  com.google.wireless.android.sdk.stats.SmlCompletionEvent.CompletionAcceptedOrBuilder getAcceptedOrBuilder();

  public com.google.wireless.android.sdk.stats.SmlCompletionEvent.CompletionCase getCompletionCase();
}
