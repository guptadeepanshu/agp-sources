// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: studio_stats.proto

package com.google.wireless.android.sdk.stats;

public interface SmlGeolocationEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:android_studio.SmlGeolocationEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string model_id = 1;</code>
   * @return Whether the modelId field is set.
   */
  boolean hasModelId();
  /**
   * <code>optional string model_id = 1;</code>
   * @return The modelId.
   */
  java.lang.String getModelId();
  /**
   * <code>optional string model_id = 1;</code>
   * @return The bytes for modelId.
   */
  com.google.protobuf.ByteString
      getModelIdBytes();

  /**
   * <code>optional bool check_successful = 2;</code>
   * @return Whether the checkSuccessful field is set.
   */
  boolean hasCheckSuccessful();
  /**
   * <code>optional bool check_successful = 2;</code>
   * @return The checkSuccessful.
   */
  boolean getCheckSuccessful();

  /**
   * <code>optional int32 grpc_error_response_code = 3;</code>
   * @return Whether the grpcErrorResponseCode field is set.
   */
  boolean hasGrpcErrorResponseCode();
  /**
   * <code>optional int32 grpc_error_response_code = 3;</code>
   * @return The grpcErrorResponseCode.
   */
  int getGrpcErrorResponseCode();
}
