// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speaker.proto

package org.Muhammad.example.speaker;

public final class SpeakerProto {
  private SpeakerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speaker_SpeakerFunction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speaker_SpeakerFunction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speaker_SpeakerModeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speaker_SpeakerModeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speaker_SpeakerModeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speaker_SpeakerModeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speaker_SpeakerActionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speaker_SpeakerActionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speaker_SpeakerActionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speaker_SpeakerActionResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rspeaker.proto\022\007speaker\"p\n\017SpeakerFunct" +
      "ion\022\021\n\tVolume_Up\030\001 \001(\t\022\023\n\013Volume_Down\030\002 " +
      "\001(\t\022\014\n\004Mute\030\003 \001(\t\022\022\n\nSpeaker_On\030\004 \001(\t\022\023\n" +
      "\013Speaker_Off\030\005 \001(\t\"G\n\022SpeakerModeRequest" +
      "\0221\n\017speakerFunction\030\001 \001(\0132\030.speaker.Spea" +
      "kerFunction\"#\n\023SpeakerModeResponse\022\014\n\004mo" +
      "de\030\001 \001(\t\"I\n\024SpeakerActionRequest\0221\n\017spea" +
      "kerFunction\030\001 \001(\0132\030.speaker.SpeakerFunct" +
      "ion\"\'\n\025SpeakerActionResponse\022\016\n\006action\030\001" +
      " \001(\t2\247\001\n\007Speaker\022J\n\013SpeakerMode\022\033.speake" +
      "r.SpeakerModeRequest\032\034.speaker.SpeakerMo" +
      "deResponse\"\000\022P\n\rSpeakerAction\022\035.speaker." +
      "SpeakerActionRequest\032\036.speaker.SpeakerAc" +
      "tionResponse\"\000B.\n\034org.Muhammad.example.s" +
      "peakerB\014SpeakerProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_speaker_SpeakerFunction_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_speaker_SpeakerFunction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speaker_SpeakerFunction_descriptor,
        new java.lang.String[] { "VolumeUp", "VolumeDown", "Mute", "SpeakerOn", "SpeakerOff", });
    internal_static_speaker_SpeakerModeRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_speaker_SpeakerModeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speaker_SpeakerModeRequest_descriptor,
        new java.lang.String[] { "SpeakerFunction", });
    internal_static_speaker_SpeakerModeResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_speaker_SpeakerModeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speaker_SpeakerModeResponse_descriptor,
        new java.lang.String[] { "Mode", });
    internal_static_speaker_SpeakerActionRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_speaker_SpeakerActionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speaker_SpeakerActionRequest_descriptor,
        new java.lang.String[] { "SpeakerFunction", });
    internal_static_speaker_SpeakerActionResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_speaker_SpeakerActionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speaker_SpeakerActionResponse_descriptor,
        new java.lang.String[] { "Action", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
