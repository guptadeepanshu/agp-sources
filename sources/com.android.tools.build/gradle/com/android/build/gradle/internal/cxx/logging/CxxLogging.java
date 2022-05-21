// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cxx_logging.proto

package com.android.build.gradle.internal.cxx.logging;

public final class CxxLogging {
  private CxxLogging() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StructuredLogRecord_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StructuredLogRecord_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NewString_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NewString_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NewList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NewList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PayloadHeader_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PayloadHeader_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UnknownMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UnknownMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LoggingMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LoggingMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EncodedLoggingMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EncodedLoggingMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021cxx_logging.proto\"\211\001\n\023StructuredLogRec" +
      "ord\022 \n\nnew_string\030\001 \001(\0132\n.NewStringH\000\022\034\n" +
      "\010new_list\030\002 \001(\0132\010.NewListH\000\022(\n\016payload_h" +
      "eader\030\003 \001(\0132\016.PayloadHeaderH\000B\010\n\006Record\"" +
      "\031\n\tNewString\022\014\n\004data\030\001 \001(\t\"\027\n\007NewList\022\014\n" +
      "\004data\030\001 \003(\005\"7\n\rPayloadHeader\022\025\n\rtime_sta" +
      "mp_ms\030\001 \001(\003\022\017\n\007type_id\030\002 \001(\005\"5\n\016UnknownM" +
      "essage\022\017\n\007type_id\030\001 \001(\005\022\022\n\nsize_bytes\030\002 " +
      "\001(\005\"\311\001\n\016LoggingMessage\022+\n\005level\030\001 \001(\0162\034." +
      "LoggingMessage.LoggingLevel\022\017\n\007message\030\002" +
      " \001(\t\022\014\n\004file\030\003 \001(\t\022\013\n\003tag\030\004 \001(\t\022\027\n\017diagn" +
      "ostic_code\030\005 \001(\005\"E\n\014LoggingLevel\022\010\n\004INFO" +
      "\020\000\022\r\n\tLIFECYCLE\020\001\022\010\n\004WARN\020\002\022\t\n\005ERROR\020\003\022\007" +
      "\n\003BUG\020\004\"\222\001\n\025EncodedLoggingMessage\022+\n\005lev" +
      "el\030\001 \001(\0162\034.LoggingMessage.LoggingLevel\022\022" +
      "\n\nmessage_id\030\002 \001(\005\022\017\n\007file_id\030\003 \001(\005\022\016\n\006t" +
      "ag_id\030\004 \001(\005\022\027\n\017diagnostic_code\030\005 \001(\005B1\n-" +
      "com.android.build.gradle.internal.cxx.lo" +
      "ggingP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_StructuredLogRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StructuredLogRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StructuredLogRecord_descriptor,
        new java.lang.String[] { "NewString", "NewList", "PayloadHeader", "Record", });
    internal_static_NewString_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_NewString_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NewString_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_NewList_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_NewList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NewList_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_PayloadHeader_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_PayloadHeader_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PayloadHeader_descriptor,
        new java.lang.String[] { "TimeStampMs", "TypeId", });
    internal_static_UnknownMessage_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_UnknownMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UnknownMessage_descriptor,
        new java.lang.String[] { "TypeId", "SizeBytes", });
    internal_static_LoggingMessage_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_LoggingMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LoggingMessage_descriptor,
        new java.lang.String[] { "Level", "Message", "File", "Tag", "DiagnosticCode", });
    internal_static_EncodedLoggingMessage_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_EncodedLoggingMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EncodedLoggingMessage_descriptor,
        new java.lang.String[] { "Level", "MessageId", "FileId", "TagId", "DiagnosticCode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
