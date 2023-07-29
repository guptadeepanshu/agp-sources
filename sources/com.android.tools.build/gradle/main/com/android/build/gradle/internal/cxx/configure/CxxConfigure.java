// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cxx_configure.proto

package com.android.build.gradle.internal.cxx.configure;

public final class CxxConfigure {
  private CxxConfigure() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ConfigureInvalidationState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ConfigureInvalidationState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EncodedConfigureInvalidationState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EncodedConfigureInvalidationState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChangedFile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChangedFile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EncodedChangedFile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EncodedChangedFile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NativeModelBuilderOutcome_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NativeModelBuilderOutcome_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EncodedNativeModelBuilderOutcome_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EncodedNativeModelBuilderOutcome_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreateCxxModel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreateCxxModel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EncodedCreateCxxModel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EncodedCreateCxxModel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023cxx_configure.proto\"\227\004\n\032ConfigureInval" +
      "idationState\022\027\n\017force_configure\030\001 \001(\010\022\031\n" +
      "\021finger_print_file\030\002 \001(\t\022\023\n\013input_files\030" +
      "\003 \003(\t\022\035\n\025required_output_files\030\004 \003(\t\022\035\n\025" +
      "optional_output_files\030\005 \003(\t\022\034\n\024hard_conf" +
      "igure_files\030\006 \003(\t\022!\n\031finger_print_file_e" +
      "xisted\030\007 \001(\010\022)\n!removed_since_finger_pri" +
      "nts_files\030\010 \003(\t\022\'\n\037added_since_finger_pr" +
      "ints_files\030\t \003(\t\0223\n\035changes_to_finger_pr" +
      "int_files\030\n \003(\0132\014.ChangedFile\022$\n\034unchang" +
      "ed_finger_print_files\030\013 \003(\t\022&\n\016configure" +
      "_type\030\014 \001(\0162\016.ConfigureType\022,\n\026soft_conf" +
      "igure_reasons\030\r \003(\0132\014.ChangedFile\022,\n\026har" +
      "d_configure_reasons\030\016 \003(\0132\014.ChangedFile\"" +
      "\263\004\n!EncodedConfigureInvalidationState\022\027\n" +
      "\017force_configure\030\001 \001(\010\022\031\n\021finger_print_f" +
      "ile\030\002 \001(\005\022\023\n\013input_files\030\003 \001(\005\022\035\n\025requir" +
      "ed_output_files\030\004 \001(\005\022\035\n\025optional_output" +
      "_files\030\005 \001(\005\022\034\n\024hard_configure_files\030\006 \001" +
      "(\005\022!\n\031finger_print_file_existed\030\007 \001(\010\022)\n" +
      "!removed_since_finger_prints_files\030\010 \001(\005" +
      "\022\'\n\037added_since_finger_prints_files\030\t \001(" +
      "\005\022:\n\035changes_to_finger_print_files\030\n \003(\013" +
      "2\023.EncodedChangedFile\022$\n\034unchanged_finge" +
      "r_print_files\030\013 \001(\005\022&\n\016configure_type\030\014 " +
      "\001(\0162\016.ConfigureType\0223\n\026soft_configure_re" +
      "asons\030\r \003(\0132\023.EncodedChangedFile\0223\n\026hard" +
      "_configure_reasons\030\016 \003(\0132\023.EncodedChange" +
      "dFile\"\237\001\n\013ChangedFile\022\021\n\tfile_name\030\001 \001(\t" +
      "\022\037\n\004type\030\002 \001(\0162\021.ChangedFile.Type\"\\\n\004Typ" +
      "e\022\013\n\007UNKNOWN\020\000\022\013\n\007CREATED\020\001\022\013\n\007DELETED\020\002" +
      "\022\031\n\025LAST_MODIFIED_CHANGED\020\003\022\022\n\016LENGTH_CH" +
      "ANGED\020\004\"H\n\022EncodedChangedFile\022\021\n\tfile_na" +
      "me\030\001 \001(\005\022\037\n\004type\030\002 \001(\0162\021.ChangedFile.Typ" +
      "e\"\217\003\n\031NativeModelBuilderOutcome\0223\n\007outco" +
      "me\030\001 \001(\0162\".NativeModelBuilderOutcome.Out" +
      "come\022\023\n\013gradle_path\030\002 \001(\t\022\026\n\016requested_a" +
      "bis\030\003 \003(\t\022\032\n\022requested_variants\030\004 \003(\t\022\036\n" +
      "\026available_variant_abis\030\005 \003(\t\022,\n$success" +
      "fully_configured_variant_abis\030\006 \003(\t\022%\n\035f" +
      "ailed_configure_variant_abis\030\007 \003(\t\022!\n\031fa" +
      "iled_configure_messages\030\010 \003(\t\"\\\n\007Outcome" +
      "\022\013\n\007UNKNOWN\020\000\022\013\n\007SUCCESS\020\001\022\032\n\026FAILED_DUR" +
      "ING_GENERATE\020\002\022\033\n\027NO_CONFIGURATION_MODEL" +
      "S\020\003\"\270\002\n EncodedNativeModelBuilderOutcome" +
      "\0223\n\007outcome\030\001 \001(\0162\".NativeModelBuilderOu" +
      "tcome.Outcome\022\023\n\013gradle_path\030\002 \001(\005\022\026\n\016re" +
      "quested_abis\030\003 \001(\005\022\032\n\022requested_variants" +
      "\030\004 \001(\005\022\036\n\026available_variant_abis\030\005 \001(\005\022," +
      "\n$successfully_configured_variant_abis\030\006" +
      " \001(\005\022%\n\035failed_configure_variant_abis\030\007 " +
      "\001(\005\022!\n\031failed_configure_messages\030\010 \001(\005\";" +
      "\n\016CreateCxxModel\022\023\n\013gradle_path\030\001 \001(\t\022\024\n" +
      "\014variant_name\030\002 \001(\t\"B\n\025EncodedCreateCxxM" +
      "odel\022\023\n\013gradle_path\030\001 \001(\005\022\024\n\014variant_nam" +
      "e\030\002 \001(\005*e\n\rConfigureType\022\032\n\026UNKNOWN_CONF" +
      "IGURE_TYPE\020\000\022\020\n\014NO_CONFIGURE\020\001\022\022\n\016SOFT_C" +
      "ONFIGURE\020\002\022\022\n\016HARD_CONFIGURE\020\003B3\n/com.an" +
      "droid.build.gradle.internal.cxx.configur" +
      "eP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ConfigureInvalidationState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ConfigureInvalidationState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ConfigureInvalidationState_descriptor,
        new java.lang.String[] { "ForceConfigure", "FingerPrintFile", "InputFiles", "RequiredOutputFiles", "OptionalOutputFiles", "HardConfigureFiles", "FingerPrintFileExisted", "RemovedSinceFingerPrintsFiles", "AddedSinceFingerPrintsFiles", "ChangesToFingerPrintFiles", "UnchangedFingerPrintFiles", "ConfigureType", "SoftConfigureReasons", "HardConfigureReasons", });
    internal_static_EncodedConfigureInvalidationState_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_EncodedConfigureInvalidationState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EncodedConfigureInvalidationState_descriptor,
        new java.lang.String[] { "ForceConfigure", "FingerPrintFile", "InputFiles", "RequiredOutputFiles", "OptionalOutputFiles", "HardConfigureFiles", "FingerPrintFileExisted", "RemovedSinceFingerPrintsFiles", "AddedSinceFingerPrintsFiles", "ChangesToFingerPrintFiles", "UnchangedFingerPrintFiles", "ConfigureType", "SoftConfigureReasons", "HardConfigureReasons", });
    internal_static_ChangedFile_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ChangedFile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChangedFile_descriptor,
        new java.lang.String[] { "FileName", "Type", });
    internal_static_EncodedChangedFile_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_EncodedChangedFile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EncodedChangedFile_descriptor,
        new java.lang.String[] { "FileName", "Type", });
    internal_static_NativeModelBuilderOutcome_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_NativeModelBuilderOutcome_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NativeModelBuilderOutcome_descriptor,
        new java.lang.String[] { "Outcome", "GradlePath", "RequestedAbis", "RequestedVariants", "AvailableVariantAbis", "SuccessfullyConfiguredVariantAbis", "FailedConfigureVariantAbis", "FailedConfigureMessages", });
    internal_static_EncodedNativeModelBuilderOutcome_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_EncodedNativeModelBuilderOutcome_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EncodedNativeModelBuilderOutcome_descriptor,
        new java.lang.String[] { "Outcome", "GradlePath", "RequestedAbis", "RequestedVariants", "AvailableVariantAbis", "SuccessfullyConfiguredVariantAbis", "FailedConfigureVariantAbis", "FailedConfigureMessages", });
    internal_static_CreateCxxModel_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_CreateCxxModel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreateCxxModel_descriptor,
        new java.lang.String[] { "GradlePath", "VariantName", });
    internal_static_EncodedCreateCxxModel_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_EncodedCreateCxxModel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EncodedCreateCxxModel_descriptor,
        new java.lang.String[] { "GradlePath", "VariantName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
