// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/sync_variant.proto

package com.android.ide.model.sync;

public interface ApplicationVariantModelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ApplicationVariantModel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.ModuleVariantModel moduleCommonModel = 1;</code>
   * @return Whether the moduleCommonModel field is set.
   */
  boolean hasModuleCommonModel();
  /**
   * <code>.ModuleVariantModel moduleCommonModel = 1;</code>
   * @return The moduleCommonModel.
   */
  com.android.ide.model.sync.ModuleVariantModel getModuleCommonModel();
  /**
   * <code>.ModuleVariantModel moduleCommonModel = 1;</code>
   */
  com.android.ide.model.sync.ModuleVariantModelOrBuilder getModuleCommonModelOrBuilder();

  /**
   * <code>string applicationId = 2;</code>
   * @return The applicationId.
   */
  java.lang.String getApplicationId();
  /**
   * <code>string applicationId = 2;</code>
   * @return The bytes for applicationId.
   */
  com.google.protobuf.ByteString
      getApplicationIdBytes();
}
