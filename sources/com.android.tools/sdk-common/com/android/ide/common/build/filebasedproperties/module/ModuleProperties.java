// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/module_properties.proto

package com.android.ide.common.build.filebasedproperties.module;

public final class ModuleProperties {
  private ModuleProperties() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AppIdListSync_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AppIdListSync_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AppIdSync_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AppIdSync_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&src/main/proto/module_properties.proto" +
      "\"+\n\rAppIdListSync\022\032\n\006appIds\030\001 \003(\0132\n.AppI" +
      "dSync\"0\n\tAppIdSync\022\014\n\004name\030\001 \001(\t\022\025\n\rappl" +
      "icationId\030\002 \001(\tB;\n7com.android.ide.commo" +
      "n.build.filebasedproperties.moduleP\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AppIdListSync_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AppIdListSync_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AppIdListSync_descriptor,
        new java.lang.String[] { "AppIds", });
    internal_static_AppIdSync_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_AppIdSync_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AppIdSync_descriptor,
        new java.lang.String[] { "Name", "ApplicationId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
