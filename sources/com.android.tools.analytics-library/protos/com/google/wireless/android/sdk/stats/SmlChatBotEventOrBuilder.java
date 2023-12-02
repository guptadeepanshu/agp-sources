// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface SmlChatBotEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.SmlChatBotEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.android_studio.SmlChatBotEvent.BotResponse response = 1;</code>
   * @return Whether the response field is set.
   */
  boolean hasResponse();
  /**
   * <code>.android_studio.SmlChatBotEvent.BotResponse response = 1;</code>
   * @return The response.
   */
  com.google.wireless.android.sdk.stats.SmlChatBotEvent.BotResponse getResponse();
  /**
   * <code>.android_studio.SmlChatBotEvent.BotResponse response = 1;</code>
   */
  com.google.wireless.android.sdk.stats.SmlChatBotEvent.BotResponseOrBuilder getResponseOrBuilder();

  /**
   * <code>.android_studio.SmlChatBotEvent.UserFeedback user_feedback = 2;</code>
   * @return Whether the userFeedback field is set.
   */
  boolean hasUserFeedback();
  /**
   * <code>.android_studio.SmlChatBotEvent.UserFeedback user_feedback = 2;</code>
   * @return The userFeedback.
   */
  com.google.wireless.android.sdk.stats.SmlChatBotEvent.UserFeedback getUserFeedback();
  /**
   * <code>.android_studio.SmlChatBotEvent.UserFeedback user_feedback = 2;</code>
   */
  com.google.wireless.android.sdk.stats.SmlChatBotEvent.UserFeedbackOrBuilder getUserFeedbackOrBuilder();

  /**
   * <code>.android_studio.SmlChatBotEvent.ActionInvoked action_invoked = 3;</code>
   * @return Whether the actionInvoked field is set.
   */
  boolean hasActionInvoked();
  /**
   * <code>.android_studio.SmlChatBotEvent.ActionInvoked action_invoked = 3;</code>
   * @return The actionInvoked.
   */
  com.google.wireless.android.sdk.stats.SmlChatBotEvent.ActionInvoked getActionInvoked();
  /**
   * <code>.android_studio.SmlChatBotEvent.ActionInvoked action_invoked = 3;</code>
   */
  com.google.wireless.android.sdk.stats.SmlChatBotEvent.ActionInvokedOrBuilder getActionInvokedOrBuilder();

  /**
   * <code>.android_studio.SmlChatBotEvent.ActionResult action_result = 4;</code>
   * @return Whether the actionResult field is set.
   */
  boolean hasActionResult();
  /**
   * <code>.android_studio.SmlChatBotEvent.ActionResult action_result = 4;</code>
   * @return The actionResult.
   */
  com.google.wireless.android.sdk.stats.SmlChatBotEvent.ActionResult getActionResult();
  /**
   * <code>.android_studio.SmlChatBotEvent.ActionResult action_result = 4;</code>
   */
  com.google.wireless.android.sdk.stats.SmlChatBotEvent.ActionResultOrBuilder getActionResultOrBuilder();

  /**
   * <code>.android_studio.SmlChatBotEvent.ParseResult parse_result = 5;</code>
   * @return Whether the parseResult field is set.
   */
  boolean hasParseResult();
  /**
   * <code>.android_studio.SmlChatBotEvent.ParseResult parse_result = 5;</code>
   * @return The parseResult.
   */
  com.google.wireless.android.sdk.stats.SmlChatBotEvent.ParseResult getParseResult();
  /**
   * <code>.android_studio.SmlChatBotEvent.ParseResult parse_result = 5;</code>
   */
  com.google.wireless.android.sdk.stats.SmlChatBotEvent.ParseResultOrBuilder getParseResultOrBuilder();

  /**
   * <code>.android_studio.SmlChatBotEvent.BotInvoked bot_invoked = 6;</code>
   * @return Whether the botInvoked field is set.
   */
  boolean hasBotInvoked();
  /**
   * <code>.android_studio.SmlChatBotEvent.BotInvoked bot_invoked = 6;</code>
   * @return The botInvoked.
   */
  com.google.wireless.android.sdk.stats.SmlChatBotEvent.BotInvoked getBotInvoked();
  /**
   * <code>.android_studio.SmlChatBotEvent.BotInvoked bot_invoked = 6;</code>
   */
  com.google.wireless.android.sdk.stats.SmlChatBotEvent.BotInvokedOrBuilder getBotInvokedOrBuilder();

  public com.google.wireless.android.sdk.stats.SmlChatBotEvent.ContentCase getContentCase();
}
