// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kotlin_multiplatform_android_models.proto

package com.android.kotlin.multiplatform.models;

public final class KotlinMultiplatformAndroidModelsProto {
  private KotlinMultiplatformAndroidModelsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AndroidTarget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AndroidTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SourceProvider_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SourceProvider_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GeneratedSources_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GeneratedSources_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MainVariantInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MainVariantInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UnitTestInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UnitTestInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InstrumentedTestInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InstrumentedTestInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InstrumentedTestInfo_TestInstrumentationRunnerArgumentsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InstrumentedTestInfo_TestInstrumentationRunnerArgumentsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AndroidCompilation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AndroidCompilation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AndroidSourceSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AndroidSourceSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DependencyInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DependencyInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)kotlin_multiplatform_android_models.pr" +
      "oto\032\020ide_models.proto\"\312\005\n\rAndroidTarget\022" +
      "\030\n\013agp_version\030\001 \001(\tH\000\210\001\001\022\031\n\014project_pat" +
      "h\030\002 \001(\tH\001\210\001\001\022\035\n\tbuild_dir\030\003 \001(\0132\005.FileH\002" +
      "\210\001\001\022\035\n\016boot_classpath\030\004 \003(\0132\005.File\022!\n\tte" +
      "st_info\030\005 \001(\0132\t.TestInfoH\003\210\001\001\0224\n\005flags\030\006" +
      " \001(\0132 .AndroidGradlePluginProjectFlagsH\004" +
      "\210\001\001\022\037\n\020lint_checks_jars\030\007 \003(\0132\005.File\022/\n\"" +
      "is_core_library_desugaring_enabled\030\010 \001(\010" +
      "H\005\210\001\001\022!\n\022desugar_lib_config\030\t \003(\0132\005.File" +
      "\022\025\n\010group_id\030\n \001(\tH\006\210\001\001\022 \n\023build_tools_v" +
      "ersion\030\013 \001(\tH\007\210\001\001\022&\n\027desugared_methods_f" +
      "iles\030\014 \003(\0132\005.File\022!\n\rroot_build_id\030\r \001(\013" +
      "2\005.FileH\010\210\001\001\022\034\n\010build_id\030\016 \001(\0132\005.FileH\t\210" +
      "\001\001\022\026\n\twith_java\030\017 \001(\010H\n\210\001\001B\016\n\014_agp_versi" +
      "onB\017\n\r_project_pathB\014\n\n_build_dirB\014\n\n_te" +
      "st_infoB\010\n\006_flagsB%\n#_is_core_library_de" +
      "sugaring_enabledB\013\n\t_group_idB\026\n\024_build_" +
      "tools_versionB\020\n\016_root_build_idB\013\n\t_buil" +
      "d_idB\014\n\n_with_java\"E\n\016SourceProvider\022!\n\r" +
      "manifest_file\030\001 \001(\0132\005.FileH\000\210\001\001B\020\n\016_mani" +
      "fest_file\"1\n\020GeneratedSources\022\035\n\016source_" +
      "folders\030\001 \003(\0132\005.File\"\347\002\n\017MainVariantInfo" +
      "\022\026\n\tnamespace\030\001 \001(\tH\000\210\001\001\022\037\n\022compile_sdk_" +
      "target\030\002 \001(\tH\001\210\001\001\022-\n\017min_sdk_version\030\003 \001" +
      "(\0132\017.AndroidVersionH\002\210\001\001\022\034\n\017max_sdk_vers" +
      "ion\030\004 \001(\005H\003\210\001\001\022\035\n\016proguard_files\030\005 \003(\0132\005" +
      ".File\022&\n\027consumer_proguard_files\030\006 \003(\0132\005" +
      ".File\022!\n\024minification_enabled\030\007 \001(\010H\004\210\001\001" +
      "B\014\n\n_namespaceB\025\n\023_compile_sdk_targetB\022\n" +
      "\020_min_sdk_versionB\022\n\020_max_sdk_versionB\027\n" +
      "\025_minification_enabled\"\263\001\n\014UnitTestInfo\022" +
      "\026\n\tnamespace\030\001 \001(\tH\000\210\001\001\022)\n\025mockable_plat" +
      "form_jar\030\002 \001(\0132\005.FileH\001\210\001\001\022 \n\023unit_test_" +
      "task_name\030\003 \001(\tH\002\210\001\001B\014\n\n_namespaceB\030\n\026_m" +
      "ockable_platform_jarB\026\n\024_unit_test_task_" +
      "name\"\334\003\n\024InstrumentedTestInfo\022\026\n\tnamespa" +
      "ce\030\001 \001(\tH\000\210\001\001\022(\n\033test_instrumentation_ru" +
      "nner\030\002 \001(\tH\001\210\001\001\022l\n%test_instrumentation_" +
      "runner_arguments\030\003 \003(\0132=.InstrumentedTes" +
      "tInfo.TestInstrumentationRunnerArguments" +
      "Entry\022+\n\016signing_config\030\004 \001(\0132\016.SigningC" +
      "onfigH\002\210\001\001\0225\n!assemble_task_output_listi" +
      "ng_file\030\005 \001(\0132\005.FileH\003\210\001\001\032I\n\'TestInstrum" +
      "entationRunnerArgumentsEntry\022\013\n\003key\030\001 \001(" +
      "\t\022\r\n\005value\030\002 \001(\t:\0028\001B\014\n\n_namespaceB\036\n\034_t" +
      "est_instrumentation_runnerB\021\n\017_signing_c" +
      "onfigB$\n\"_assemble_task_output_listing_f" +
      "ile\"\244\004\n\022AndroidCompilation\0226\n\004type\030\001 \001(\016" +
      "2#.AndroidCompilation.CompilationTypeH\000\210" +
      "\001\001\022(\n\tmain_info\030\002 \001(\0132\020.MainVariantInfoH" +
      "\001\210\001\001\022*\n\016unit_test_info\030\003 \001(\0132\r.UnitTestI" +
      "nfoH\002\210\001\001\022:\n\026instrumented_test_info\030\004 \001(\013" +
      "2\025.InstrumentedTestInfoH\003\210\001\001\022$\n\027default_" +
      "source_set_name\030\005 \001(\tH\004\210\001\001\022\037\n\022assemble_t" +
      "ask_name\030\006 \001(\tH\005\210\001\001\022%\n\030kotlin_compile_ta" +
      "sk_name\030\007 \001(\tH\006\210\001\001\"A\n\017CompilationType\022\010\n" +
      "\004MAIN\020\000\022\r\n\tUNIT_TEST\020\001\022\025\n\021INSTRUMENTED_T" +
      "EST\020\002B\007\n\005_typeB\014\n\n_main_infoB\021\n\017_unit_te" +
      "st_infoB\031\n\027_instrumented_test_infoB\032\n\030_d" +
      "efault_source_set_nameB\025\n\023_assemble_task" +
      "_nameB\033\n\031_kotlin_compile_task_name\"U\n\020An" +
      "droidSourceSet\022-\n\017source_provider\030\001 \001(\0132" +
      "\017.SourceProviderH\000\210\001\001B\022\n\020_source_provide" +
      "r\"<\n\016DependencyInfo\022\036\n\007library\030\001 \001(\0132\010.L" +
      "ibraryH\000\210\001\001B\n\n\010_libraryBR\n\'com.android.k" +
      "otlin.multiplatform.modelsB%KotlinMultip" +
      "latformAndroidModelsProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.android.builder.model.proto.ide.IdeModelsProto.getDescriptor(),
        });
    internal_static_AndroidTarget_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AndroidTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AndroidTarget_descriptor,
        new java.lang.String[] { "AgpVersion", "ProjectPath", "BuildDir", "BootClasspath", "TestInfo", "Flags", "LintChecksJars", "IsCoreLibraryDesugaringEnabled", "DesugarLibConfig", "GroupId", "BuildToolsVersion", "DesugaredMethodsFiles", "RootBuildId", "BuildId", "WithJava", "AgpVersion", "ProjectPath", "BuildDir", "TestInfo", "Flags", "IsCoreLibraryDesugaringEnabled", "GroupId", "BuildToolsVersion", "RootBuildId", "BuildId", "WithJava", });
    internal_static_SourceProvider_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_SourceProvider_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SourceProvider_descriptor,
        new java.lang.String[] { "ManifestFile", "ManifestFile", });
    internal_static_GeneratedSources_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_GeneratedSources_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GeneratedSources_descriptor,
        new java.lang.String[] { "SourceFolders", });
    internal_static_MainVariantInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_MainVariantInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MainVariantInfo_descriptor,
        new java.lang.String[] { "Namespace", "CompileSdkTarget", "MinSdkVersion", "MaxSdkVersion", "ProguardFiles", "ConsumerProguardFiles", "MinificationEnabled", "Namespace", "CompileSdkTarget", "MinSdkVersion", "MaxSdkVersion", "MinificationEnabled", });
    internal_static_UnitTestInfo_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_UnitTestInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UnitTestInfo_descriptor,
        new java.lang.String[] { "Namespace", "MockablePlatformJar", "UnitTestTaskName", "Namespace", "MockablePlatformJar", "UnitTestTaskName", });
    internal_static_InstrumentedTestInfo_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_InstrumentedTestInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InstrumentedTestInfo_descriptor,
        new java.lang.String[] { "Namespace", "TestInstrumentationRunner", "TestInstrumentationRunnerArguments", "SigningConfig", "AssembleTaskOutputListingFile", "Namespace", "TestInstrumentationRunner", "SigningConfig", "AssembleTaskOutputListingFile", });
    internal_static_InstrumentedTestInfo_TestInstrumentationRunnerArgumentsEntry_descriptor =
      internal_static_InstrumentedTestInfo_descriptor.getNestedTypes().get(0);
    internal_static_InstrumentedTestInfo_TestInstrumentationRunnerArgumentsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InstrumentedTestInfo_TestInstrumentationRunnerArgumentsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_AndroidCompilation_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_AndroidCompilation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AndroidCompilation_descriptor,
        new java.lang.String[] { "Type", "MainInfo", "UnitTestInfo", "InstrumentedTestInfo", "DefaultSourceSetName", "AssembleTaskName", "KotlinCompileTaskName", "Type", "MainInfo", "UnitTestInfo", "InstrumentedTestInfo", "DefaultSourceSetName", "AssembleTaskName", "KotlinCompileTaskName", });
    internal_static_AndroidSourceSet_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_AndroidSourceSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AndroidSourceSet_descriptor,
        new java.lang.String[] { "SourceProvider", "SourceProvider", });
    internal_static_DependencyInfo_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_DependencyInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DependencyInfo_descriptor,
        new java.lang.String[] { "Library", "Library", });
    com.android.builder.model.proto.ide.IdeModelsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
