// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ide_models.proto

package com.android.builder.model.proto.ide;

public interface SigningConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SigningConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Returns the name of the Signing config
   * </pre>
   *
   * <code>optional string name = 1;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Returns the name of the Signing config
   * </pre>
   *
   * <code>optional string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Returns the name of the Signing config
   * </pre>
   *
   * <code>optional string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The keystore file.
   * </pre>
   *
   * <code>optional .File store_file = 2;</code>
   * @return Whether the storeFile field is set.
   */
  boolean hasStoreFile();
  /**
   * <pre>
   * The keystore file.
   * </pre>
   *
   * <code>optional .File store_file = 2;</code>
   * @return The storeFile.
   */
  com.android.builder.model.proto.ide.File getStoreFile();
  /**
   * <pre>
   * The keystore file.
   * </pre>
   *
   * <code>optional .File store_file = 2;</code>
   */
  com.android.builder.model.proto.ide.FileOrBuilder getStoreFileOrBuilder();

  /**
   * <pre>
   * The keystore password.
   * </pre>
   *
   * <code>optional string store_password = 3;</code>
   * @return Whether the storePassword field is set.
   */
  boolean hasStorePassword();
  /**
   * <pre>
   * The keystore password.
   * </pre>
   *
   * <code>optional string store_password = 3;</code>
   * @return The storePassword.
   */
  java.lang.String getStorePassword();
  /**
   * <pre>
   * The keystore password.
   * </pre>
   *
   * <code>optional string store_password = 3;</code>
   * @return The bytes for storePassword.
   */
  com.google.protobuf.ByteString
      getStorePasswordBytes();

  /**
   * <pre>
   * The key alias name.
   * </pre>
   *
   * <code>optional string key_alias = 4;</code>
   * @return Whether the keyAlias field is set.
   */
  boolean hasKeyAlias();
  /**
   * <pre>
   * The key alias name.
   * </pre>
   *
   * <code>optional string key_alias = 4;</code>
   * @return The keyAlias.
   */
  java.lang.String getKeyAlias();
  /**
   * <pre>
   * The key alias name.
   * </pre>
   *
   * <code>optional string key_alias = 4;</code>
   * @return The bytes for keyAlias.
   */
  com.google.protobuf.ByteString
      getKeyAliasBytes();

  /**
   * <pre>
   * The key password.
   * </pre>
   *
   * <code>optional string key_password = 5;</code>
   * @return Whether the keyPassword field is set.
   */
  boolean hasKeyPassword();
  /**
   * <pre>
   * The key password.
   * </pre>
   *
   * <code>optional string key_password = 5;</code>
   * @return The keyPassword.
   */
  java.lang.String getKeyPassword();
  /**
   * <pre>
   * The key password.
   * </pre>
   *
   * <code>optional string key_password = 5;</code>
   * @return The bytes for keyPassword.
   */
  com.google.protobuf.ByteString
      getKeyPasswordBytes();

  /**
   * <pre>
   * Signing using JAR Signature Scheme (aka v1 scheme) is enabled.
   * </pre>
   *
   * <code>optional bool enable_v1_signing = 6;</code>
   * @return Whether the enableV1Signing field is set.
   */
  boolean hasEnableV1Signing();
  /**
   * <pre>
   * Signing using JAR Signature Scheme (aka v1 scheme) is enabled.
   * </pre>
   *
   * <code>optional bool enable_v1_signing = 6;</code>
   * @return The enableV1Signing.
   */
  boolean getEnableV1Signing();

  /**
   * <pre>
   * Signing using APK Signature Scheme v2 (aka v2 scheme) is enabled.
   * </pre>
   *
   * <code>optional bool enable_v2_signing = 7;</code>
   * @return Whether the enableV2Signing field is set.
   */
  boolean hasEnableV2Signing();
  /**
   * <pre>
   * Signing using APK Signature Scheme v2 (aka v2 scheme) is enabled.
   * </pre>
   *
   * <code>optional bool enable_v2_signing = 7;</code>
   * @return The enableV2Signing.
   */
  boolean getEnableV2Signing();

  /**
   * <pre>
   * Signing using JAR Signature Scheme v3 (aka v3 scheme) is enabled.
   * </pre>
   *
   * <code>optional bool enable_v3_signing = 8;</code>
   * @return Whether the enableV3Signing field is set.
   */
  boolean hasEnableV3Signing();
  /**
   * <pre>
   * Signing using JAR Signature Scheme v3 (aka v3 scheme) is enabled.
   * </pre>
   *
   * <code>optional bool enable_v3_signing = 8;</code>
   * @return The enableV3Signing.
   */
  boolean getEnableV3Signing();

  /**
   * <pre>
   * Signing using JAR Signature Scheme v4 (aka v4 scheme) is enabled.
   * </pre>
   *
   * <code>optional bool enable_v4_signing = 9;</code>
   * @return Whether the enableV4Signing field is set.
   */
  boolean hasEnableV4Signing();
  /**
   * <pre>
   * Signing using JAR Signature Scheme v4 (aka v4 scheme) is enabled.
   * </pre>
   *
   * <code>optional bool enable_v4_signing = 9;</code>
   * @return The enableV4Signing.
   */
  boolean getEnableV4Signing();

  /**
   * <pre>
   * Whether the config is fully configured for signing.
   * i.e. all the required information are present.
   * </pre>
   *
   * <code>bool is_signing_ready = 10;</code>
   * @return The isSigningReady.
   */
  boolean getIsSigningReady();
}