// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocol.proto

// Protobuf Java Version: 3.25.3
package com.skycalm.analyzer.analyzergrpc;

public interface RequestAirlineTicketOrBuilder extends
    // @@protoc_insertion_point(interface_extends:flightanalyzer.protocol.RequestAirlineTicket)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * "2025-04-11"
   * </pre>
   *
   * <code>string departureDate = 1;</code>
   * @return The departureDate.
   */
  java.lang.String getDepartureDate();
  /**
   * <pre>
   * "2025-04-11"
   * </pre>
   *
   * <code>string departureDate = 1;</code>
   * @return The bytes for departureDate.
   */
  com.google.protobuf.ByteString
      getDepartureDateBytes();

  /**
   * <pre>
   * "15:30"
   * </pre>
   *
   * <code>string departureTime = 2;</code>
   * @return The departureTime.
   */
  java.lang.String getDepartureTime();
  /**
   * <pre>
   * "15:30"
   * </pre>
   *
   * <code>string departureTime = 2;</code>
   * @return The bytes for departureTime.
   */
  com.google.protobuf.ByteString
      getDepartureTimeBytes();

  /**
   * <code>string from = 3;</code>
   * @return The from.
   */
  java.lang.String getFrom();
  /**
   * <code>string from = 3;</code>
   * @return The bytes for from.
   */
  com.google.protobuf.ByteString
      getFromBytes();

  /**
   * <code>string to = 4;</code>
   * @return The to.
   */
  java.lang.String getTo();
  /**
   * <code>string to = 4;</code>
   * @return The bytes for to.
   */
  com.google.protobuf.ByteString
      getToBytes();

  /**
   * <code>string airline = 5;</code>
   * @return The airline.
   */
  java.lang.String getAirline();
  /**
   * <code>string airline = 5;</code>
   * @return The bytes for airline.
   */
  com.google.protobuf.ByteString
      getAirlineBytes();
}
