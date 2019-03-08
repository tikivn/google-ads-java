// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/mobile_app_category_constant.proto

package com.google.ads.googleads.v1.resources;

public interface MobileAppCategoryConstantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.resources.MobileAppCategoryConstant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the mobile app category constant.
   * Mobile app category constant resource names have the form:
   * `mobileAppCategoryConstants/{mobile_app_category_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the mobile app category constant.
   * Mobile app category constant resource names have the form:
   * `mobileAppCategoryConstants/{mobile_app_category_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The ID of the mobile app category constant.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value id = 2;</code>
   */
  boolean hasId();
  /**
   * <pre>
   * The ID of the mobile app category constant.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value id = 2;</code>
   */
  com.google.protobuf.Int32Value getId();
  /**
   * <pre>
   * The ID of the mobile app category constant.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value id = 2;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Mobile app category name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  boolean hasName();
  /**
   * <pre>
   * Mobile app category name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * Mobile app category name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();
}