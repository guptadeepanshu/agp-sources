// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface SmlCompletionEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.SmlCompletionEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Historical: Not used starting with Android Studio 2023.2.1.11
   * </pre>
   *
   * <code>.android_studio.SmlCompletionEvent.CompletionRequest request = 1 [deprecated = true];</code>
   * @deprecated
   * @return Whether the request field is set.
   */
  @java.lang.Deprecated boolean hasRequest();
  /**
   * <pre>
   * Historical: Not used starting with Android Studio 2023.2.1.11
   * </pre>
   *
   * <code>.android_studio.SmlCompletionEvent.CompletionRequest request = 1 [deprecated = true];</code>
   * @deprecated
   * @return The request.
   */
  @java.lang.Deprecated com.google.wireless.android.sdk.stats.SmlCompletionEvent.CompletionRequest getRequest();
  /**
   * <pre>
   * Historical: Not used starting with Android Studio 2023.2.1.11
   * </pre>
   *
   * <code>.android_studio.SmlCompletionEvent.CompletionRequest request = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.wireless.android.sdk.stats.SmlCompletionEvent.CompletionRequestOrBuilder getRequestOrBuilder();

  /**
   * <pre>
   * Historical: Not used starting with Android Studio 2023.2.1.11
   * </pre>
   *
   * <code>.android_studio.SmlCompletionEvent.CompletionResponse response = 2 [deprecated = true];</code>
   * @deprecated
   * @return Whether the response field is set.
   */
  @java.lang.Deprecated boolean hasResponse();
  /**
   * <pre>
   * Historical: Not used starting with Android Studio 2023.2.1.11
   * </pre>
   *
   * <code>.android_studio.SmlCompletionEvent.CompletionResponse response = 2 [deprecated = true];</code>
   * @deprecated
   * @return The response.
   */
  @java.lang.Deprecated com.google.wireless.android.sdk.stats.SmlCompletionEvent.CompletionResponse getResponse();
  /**
   * <pre>
   * Historical: Not used starting with Android Studio 2023.2.1.11
   * </pre>
   *
   * <code>.android_studio.SmlCompletionEvent.CompletionResponse response = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.wireless.android.sdk.stats.SmlCompletionEvent.CompletionResponseOrBuilder getResponseOrBuilder();

  /**
   * <pre>
   * Historical: Not used starting with Android Studio 2023.2.1.11
   * </pre>
   *
   * <code>.android_studio.SmlCompletionEvent.CompletionShown shown = 3 [deprecated = true];</code>
   * @deprecated
   * @return Whether the shown field is set.
   */
  @java.lang.Deprecated boolean hasShown();
  /**
   * <pre>
   * Historical: Not used starting with Android Studio 2023.2.1.11
   * </pre>
   *
   * <code>.android_studio.SmlCompletionEvent.CompletionShown shown = 3 [deprecated = true];</code>
   * @deprecated
   * @return The shown.
   */
  @java.lang.Deprecated com.google.wireless.android.sdk.stats.SmlCompletionEvent.CompletionShown getShown();
  /**
   * <pre>
   * Historical: Not used starting with Android Studio 2023.2.1.11
   * </pre>
   *
   * <code>.android_studio.SmlCompletionEvent.CompletionShown shown = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.wireless.android.sdk.stats.SmlCompletionEvent.CompletionShownOrBuilder getShownOrBuilder();

  /**
   * <pre>
   * Historical: Not used starting with Android Studio 2023.2.1.11
   * </pre>
   *
   * <code>.android_studio.SmlCompletionEvent.CompletionAccepted accepted = 4 [deprecated = true];</code>
   * @deprecated
   * @return Whether the accepted field is set.
   */
  @java.lang.Deprecated boolean hasAccepted();
  /**
   * <pre>
   * Historical: Not used starting with Android Studio 2023.2.1.11
   * </pre>
   *
   * <code>.android_studio.SmlCompletionEvent.CompletionAccepted accepted = 4 [deprecated = true];</code>
   * @deprecated
   * @return The accepted.
   */
  @java.lang.Deprecated com.google.wireless.android.sdk.stats.SmlCompletionEvent.CompletionAccepted getAccepted();
  /**
   * <pre>
   * Historical: Not used starting with Android Studio 2023.2.1.11
   * </pre>
   *
   * <code>.android_studio.SmlCompletionEvent.CompletionAccepted accepted = 4 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.wireless.android.sdk.stats.SmlCompletionEvent.CompletionAcceptedOrBuilder getAcceptedOrBuilder();

  /**
   * <code>.android_studio.SmlCompletionEvent.CompletionAggregateEvent aggregate = 5;</code>
   * @return Whether the aggregate field is set.
   */
  boolean hasAggregate();
  /**
   * <code>.android_studio.SmlCompletionEvent.CompletionAggregateEvent aggregate = 5;</code>
   * @return The aggregate.
   */
  com.google.wireless.android.sdk.stats.SmlCompletionEvent.CompletionAggregateEvent getAggregate();
  /**
   * <code>.android_studio.SmlCompletionEvent.CompletionAggregateEvent aggregate = 5;</code>
   */
  com.google.wireless.android.sdk.stats.SmlCompletionEvent.CompletionAggregateEventOrBuilder getAggregateOrBuilder();

  public com.google.wireless.android.sdk.stats.SmlCompletionEvent.CompletionCase getCompletionCase();
}
