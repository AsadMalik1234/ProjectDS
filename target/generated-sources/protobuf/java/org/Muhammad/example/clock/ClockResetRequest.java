// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: clock.proto

package org.Muhammad.example.clock;

/**
 * Protobuf type {@code clock.ClockResetRequest}
 */
public  final class ClockResetRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clock.ClockResetRequest)
    ClockResetRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClockResetRequest.newBuilder() to construct.
  private ClockResetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClockResetRequest() {
    clockResetRequest_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClockResetRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            clockResetRequest_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.Muhammad.example.clock.ClockProto.internal_static_clock_ClockResetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.Muhammad.example.clock.ClockProto.internal_static_clock_ClockResetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.Muhammad.example.clock.ClockResetRequest.class, org.Muhammad.example.clock.ClockResetRequest.Builder.class);
  }

  public static final int CLOCKRESETREQUEST_FIELD_NUMBER = 1;
  private volatile java.lang.Object clockResetRequest_;
  /**
   * <code>string clockResetRequest = 1;</code>
   */
  public java.lang.String getClockResetRequest() {
    java.lang.Object ref = clockResetRequest_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clockResetRequest_ = s;
      return s;
    }
  }
  /**
   * <code>string clockResetRequest = 1;</code>
   */
  public com.google.protobuf.ByteString
      getClockResetRequestBytes() {
    java.lang.Object ref = clockResetRequest_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clockResetRequest_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getClockResetRequestBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, clockResetRequest_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getClockResetRequestBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clockResetRequest_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.Muhammad.example.clock.ClockResetRequest)) {
      return super.equals(obj);
    }
    org.Muhammad.example.clock.ClockResetRequest other = (org.Muhammad.example.clock.ClockResetRequest) obj;

    boolean result = true;
    result = result && getClockResetRequest()
        .equals(other.getClockResetRequest());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CLOCKRESETREQUEST_FIELD_NUMBER;
    hash = (53 * hash) + getClockResetRequest().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.Muhammad.example.clock.ClockResetRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.Muhammad.example.clock.ClockResetRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.Muhammad.example.clock.ClockResetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.Muhammad.example.clock.ClockResetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.Muhammad.example.clock.ClockResetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.Muhammad.example.clock.ClockResetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.Muhammad.example.clock.ClockResetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.Muhammad.example.clock.ClockResetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.Muhammad.example.clock.ClockResetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.Muhammad.example.clock.ClockResetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.Muhammad.example.clock.ClockResetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.Muhammad.example.clock.ClockResetRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.Muhammad.example.clock.ClockResetRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code clock.ClockResetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clock.ClockResetRequest)
      org.Muhammad.example.clock.ClockResetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.Muhammad.example.clock.ClockProto.internal_static_clock_ClockResetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.Muhammad.example.clock.ClockProto.internal_static_clock_ClockResetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.Muhammad.example.clock.ClockResetRequest.class, org.Muhammad.example.clock.ClockResetRequest.Builder.class);
    }

    // Construct using org.Muhammad.example.clock.ClockResetRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      clockResetRequest_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.Muhammad.example.clock.ClockProto.internal_static_clock_ClockResetRequest_descriptor;
    }

    @java.lang.Override
    public org.Muhammad.example.clock.ClockResetRequest getDefaultInstanceForType() {
      return org.Muhammad.example.clock.ClockResetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.Muhammad.example.clock.ClockResetRequest build() {
      org.Muhammad.example.clock.ClockResetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.Muhammad.example.clock.ClockResetRequest buildPartial() {
      org.Muhammad.example.clock.ClockResetRequest result = new org.Muhammad.example.clock.ClockResetRequest(this);
      result.clockResetRequest_ = clockResetRequest_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.Muhammad.example.clock.ClockResetRequest) {
        return mergeFrom((org.Muhammad.example.clock.ClockResetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.Muhammad.example.clock.ClockResetRequest other) {
      if (other == org.Muhammad.example.clock.ClockResetRequest.getDefaultInstance()) return this;
      if (!other.getClockResetRequest().isEmpty()) {
        clockResetRequest_ = other.clockResetRequest_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.Muhammad.example.clock.ClockResetRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.Muhammad.example.clock.ClockResetRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object clockResetRequest_ = "";
    /**
     * <code>string clockResetRequest = 1;</code>
     */
    public java.lang.String getClockResetRequest() {
      java.lang.Object ref = clockResetRequest_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clockResetRequest_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string clockResetRequest = 1;</code>
     */
    public com.google.protobuf.ByteString
        getClockResetRequestBytes() {
      java.lang.Object ref = clockResetRequest_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clockResetRequest_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string clockResetRequest = 1;</code>
     */
    public Builder setClockResetRequest(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      clockResetRequest_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string clockResetRequest = 1;</code>
     */
    public Builder clearClockResetRequest() {
      
      clockResetRequest_ = getDefaultInstance().getClockResetRequest();
      onChanged();
      return this;
    }
    /**
     * <code>string clockResetRequest = 1;</code>
     */
    public Builder setClockResetRequestBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      clockResetRequest_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:clock.ClockResetRequest)
  }

  // @@protoc_insertion_point(class_scope:clock.ClockResetRequest)
  private static final org.Muhammad.example.clock.ClockResetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.Muhammad.example.clock.ClockResetRequest();
  }

  public static org.Muhammad.example.clock.ClockResetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClockResetRequest>
      PARSER = new com.google.protobuf.AbstractParser<ClockResetRequest>() {
    @java.lang.Override
    public ClockResetRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClockResetRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClockResetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClockResetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.Muhammad.example.clock.ClockResetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
