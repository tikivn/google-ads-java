// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/common/matching_function.proto

package com.google.ads.googleads.v3.common;

public final class MatchingFunctionProto {
  private MatchingFunctionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_common_MatchingFunction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_common_MatchingFunction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_common_Operand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_common_Operand_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_common_Operand_ConstantOperand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_common_Operand_ConstantOperand_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_common_Operand_FeedAttributeOperand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_common_Operand_FeedAttributeOperand_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_common_Operand_FunctionOperand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_common_Operand_FunctionOperand_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_common_Operand_RequestContextOperand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_common_Operand_RequestContextOperand_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v3/common/matchin" +
      "g_function.proto\022\036google.ads.googleads.v" +
      "3.common\032Bgoogle/ads/googleads/v3/enums/" +
      "matching_function_context_type.proto\032>go" +
      "ogle/ads/googleads/v3/enums/matching_fun" +
      "ction_operator.proto\032\036google/protobuf/wr" +
      "appers.proto\032\034google/api/annotations.pro" +
      "to\"\262\002\n\020MatchingFunction\0225\n\017function_stri" +
      "ng\030\001 \001(\0132\034.google.protobuf.StringValue\022f" +
      "\n\010operator\030\004 \001(\0162T.google.ads.googleads." +
      "v3.enums.MatchingFunctionOperatorEnum.Ma" +
      "tchingFunctionOperator\022>\n\rleft_operands\030" +
      "\002 \003(\0132\'.google.ads.googleads.v3.common.O" +
      "perand\022?\n\016right_operands\030\003 \003(\0132\'.google." +
      "ads.googleads.v3.common.Operand\"\376\007\n\007Oper" +
      "and\022S\n\020constant_operand\030\001 \001(\01327.google.a" +
      "ds.googleads.v3.common.Operand.ConstantO" +
      "perandH\000\022^\n\026feed_attribute_operand\030\002 \001(\013" +
      "2<.google.ads.googleads.v3.common.Operan" +
      "d.FeedAttributeOperandH\000\022S\n\020function_ope" +
      "rand\030\003 \001(\01327.google.ads.googleads.v3.com" +
      "mon.Operand.FunctionOperandH\000\022`\n\027request" +
      "_context_operand\030\004 \001(\0132=.google.ads.goog" +
      "leads.v3.common.Operand.RequestContextOp" +
      "erandH\000\032\377\001\n\017ConstantOperand\0224\n\014string_va" +
      "lue\030\001 \001(\0132\034.google.protobuf.StringValueH" +
      "\000\0221\n\nlong_value\030\002 \001(\0132\033.google.protobuf." +
      "Int64ValueH\000\0223\n\rboolean_value\030\003 \001(\0132\032.go" +
      "ogle.protobuf.BoolValueH\000\0224\n\014double_valu" +
      "e\030\004 \001(\0132\034.google.protobuf.DoubleValueH\000B" +
      "\030\n\026constant_operand_value\032|\n\024FeedAttribu" +
      "teOperand\022,\n\007feed_id\030\001 \001(\0132\033.google.prot" +
      "obuf.Int64Value\0226\n\021feed_attribute_id\030\002 \001" +
      "(\0132\033.google.protobuf.Int64Value\032^\n\017Funct" +
      "ionOperand\022K\n\021matching_function\030\001 \001(\01320." +
      "google.ads.googleads.v3.common.MatchingF" +
      "unction\032\211\001\n\025RequestContextOperand\022p\n\014con" +
      "text_type\030\001 \001(\0162Z.google.ads.googleads.v" +
      "3.enums.MatchingFunctionContextTypeEnum." +
      "MatchingFunctionContextTypeB\033\n\031function_" +
      "argument_operandB\360\001\n\"com.google.ads.goog" +
      "leads.v3.commonB\025MatchingFunctionProtoP\001" +
      "ZDgoogle.golang.org/genproto/googleapis/" +
      "ads/googleads/v3/common;common\242\002\003GAA\252\002\036G" +
      "oogle.Ads.GoogleAds.V3.Common\312\002\036Google\\A" +
      "ds\\GoogleAds\\V3\\Common\352\002\"Google::Ads::Go" +
      "ogleAds::V3::Commonb\006proto3"
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
          com.google.ads.googleads.v3.enums.MatchingFunctionContextTypeProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.MatchingFunctionOperatorProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_common_MatchingFunction_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_common_MatchingFunction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_common_MatchingFunction_descriptor,
        new java.lang.String[] { "FunctionString", "Operator", "LeftOperands", "RightOperands", });
    internal_static_google_ads_googleads_v3_common_Operand_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v3_common_Operand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_common_Operand_descriptor,
        new java.lang.String[] { "ConstantOperand", "FeedAttributeOperand", "FunctionOperand", "RequestContextOperand", "FunctionArgumentOperand", });
    internal_static_google_ads_googleads_v3_common_Operand_ConstantOperand_descriptor =
      internal_static_google_ads_googleads_v3_common_Operand_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v3_common_Operand_ConstantOperand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_common_Operand_ConstantOperand_descriptor,
        new java.lang.String[] { "StringValue", "LongValue", "BooleanValue", "DoubleValue", "ConstantOperandValue", });
    internal_static_google_ads_googleads_v3_common_Operand_FeedAttributeOperand_descriptor =
      internal_static_google_ads_googleads_v3_common_Operand_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v3_common_Operand_FeedAttributeOperand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_common_Operand_FeedAttributeOperand_descriptor,
        new java.lang.String[] { "FeedId", "FeedAttributeId", });
    internal_static_google_ads_googleads_v3_common_Operand_FunctionOperand_descriptor =
      internal_static_google_ads_googleads_v3_common_Operand_descriptor.getNestedTypes().get(2);
    internal_static_google_ads_googleads_v3_common_Operand_FunctionOperand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_common_Operand_FunctionOperand_descriptor,
        new java.lang.String[] { "MatchingFunction", });
    internal_static_google_ads_googleads_v3_common_Operand_RequestContextOperand_descriptor =
      internal_static_google_ads_googleads_v3_common_Operand_descriptor.getNestedTypes().get(3);
    internal_static_google_ads_googleads_v3_common_Operand_RequestContextOperand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_common_Operand_RequestContextOperand_descriptor,
        new java.lang.String[] { "ContextType", });
    com.google.ads.googleads.v3.enums.MatchingFunctionContextTypeProto.getDescriptor();
    com.google.ads.googleads.v3.enums.MatchingFunctionOperatorProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
