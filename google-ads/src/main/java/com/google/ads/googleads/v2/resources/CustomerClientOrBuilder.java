// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/customer_client.proto

package com.google.ads.googleads.v2.resources;

public interface CustomerClientOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.resources.CustomerClient)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the customer client.
   * CustomerClient resource names have the form:
   * `customers/{customer_id}/customerClients/{client_customer_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the customer client.
   * CustomerClient resource names have the form:
   * `customers/{customer_id}/customerClients/{client_customer_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The resource name of the client-customer which is linked to
   * the given customer. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue client_customer = 3;</code>
   */
  boolean hasClientCustomer();
  /**
   * <pre>
   * The resource name of the client-customer which is linked to
   * the given customer. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue client_customer = 3;</code>
   */
  com.google.protobuf.StringValue getClientCustomer();
  /**
   * <pre>
   * The resource name of the client-customer which is linked to
   * the given customer. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue client_customer = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getClientCustomerOrBuilder();

  /**
   * <pre>
   * Specifies whether this is a
   * [hidden account](https://support.google.com/google-ads/answer/7519830).
   * Read only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue hidden = 4;</code>
   */
  boolean hasHidden();
  /**
   * <pre>
   * Specifies whether this is a
   * [hidden account](https://support.google.com/google-ads/answer/7519830).
   * Read only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue hidden = 4;</code>
   */
  com.google.protobuf.BoolValue getHidden();
  /**
   * <pre>
   * Specifies whether this is a
   * [hidden account](https://support.google.com/google-ads/answer/7519830).
   * Read only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue hidden = 4;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getHiddenOrBuilder();

  /**
   * <pre>
   * Distance between given customer and client. For self link, the level value
   * will be 0. Read only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value level = 5;</code>
   */
  boolean hasLevel();
  /**
   * <pre>
   * Distance between given customer and client. For self link, the level value
   * will be 0. Read only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value level = 5;</code>
   */
  com.google.protobuf.Int64Value getLevel();
  /**
   * <pre>
   * Distance between given customer and client. For self link, the level value
   * will be 0. Read only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value level = 5;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getLevelOrBuilder();

  /**
   * <pre>
   * Common Locale Data Repository (CLDR) string representation of the
   * time zone of the client, e.g. America/Los_Angeles. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue time_zone = 6;</code>
   */
  boolean hasTimeZone();
  /**
   * <pre>
   * Common Locale Data Repository (CLDR) string representation of the
   * time zone of the client, e.g. America/Los_Angeles. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue time_zone = 6;</code>
   */
  com.google.protobuf.StringValue getTimeZone();
  /**
   * <pre>
   * Common Locale Data Repository (CLDR) string representation of the
   * time zone of the client, e.g. America/Los_Angeles. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue time_zone = 6;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTimeZoneOrBuilder();

  /**
   * <pre>
   * Identifies if the client is a test account. Read only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue test_account = 7;</code>
   */
  boolean hasTestAccount();
  /**
   * <pre>
   * Identifies if the client is a test account. Read only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue test_account = 7;</code>
   */
  com.google.protobuf.BoolValue getTestAccount();
  /**
   * <pre>
   * Identifies if the client is a test account. Read only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue test_account = 7;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getTestAccountOrBuilder();

  /**
   * <pre>
   * Identifies if the client is a manager. Read only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue manager = 8;</code>
   */
  boolean hasManager();
  /**
   * <pre>
   * Identifies if the client is a manager. Read only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue manager = 8;</code>
   */
  com.google.protobuf.BoolValue getManager();
  /**
   * <pre>
   * Identifies if the client is a manager. Read only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue manager = 8;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getManagerOrBuilder();

  /**
   * <pre>
   * Descriptive name for the client. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue descriptive_name = 9;</code>
   */
  boolean hasDescriptiveName();
  /**
   * <pre>
   * Descriptive name for the client. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue descriptive_name = 9;</code>
   */
  com.google.protobuf.StringValue getDescriptiveName();
  /**
   * <pre>
   * Descriptive name for the client. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue descriptive_name = 9;</code>
   */
  com.google.protobuf.StringValueOrBuilder getDescriptiveNameOrBuilder();

  /**
   * <pre>
   * Currency code (e.g. 'USD', 'EUR') for the client. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 10;</code>
   */
  boolean hasCurrencyCode();
  /**
   * <pre>
   * Currency code (e.g. 'USD', 'EUR') for the client. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 10;</code>
   */
  com.google.protobuf.StringValue getCurrencyCode();
  /**
   * <pre>
   * Currency code (e.g. 'USD', 'EUR') for the client. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 10;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCurrencyCodeOrBuilder();

  /**
   * <pre>
   * The ID of the client customer. Read only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 11;</code>
   */
  boolean hasId();
  /**
   * <pre>
   * The ID of the client customer. Read only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 11;</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * The ID of the client customer. Read only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 11;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();
}
