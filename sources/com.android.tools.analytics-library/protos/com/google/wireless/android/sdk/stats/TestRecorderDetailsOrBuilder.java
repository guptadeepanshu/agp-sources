// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface TestRecorderDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.TestRecorderDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The number of events in the test generated by the test recorder.
   * </pre>
   *
   * <code>optional int64 event_count = 1;</code>
   * @return Whether the eventCount field is set.
   */
  boolean hasEventCount();
  /**
   * <pre>
   * The number of events in the test generated by the test recorder.
   * </pre>
   *
   * <code>optional int64 event_count = 1;</code>
   * @return The eventCount.
   */
  long getEventCount();

  /**
   * <pre>
   * The number of assertions in the test generated by the test recorder.
   * </pre>
   *
   * <code>optional int64 assertion_count = 2;</code>
   * @return Whether the assertionCount field is set.
   */
  boolean hasAssertionCount();
  /**
   * <pre>
   * The number of assertions in the test generated by the test recorder.
   * </pre>
   *
   * <code>optional int64 assertion_count = 2;</code>
   * @return The assertionCount.
   */
  long getAssertionCount();
}
