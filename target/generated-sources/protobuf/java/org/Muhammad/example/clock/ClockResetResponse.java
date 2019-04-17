// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: clock.proto

package org.Muhammad.example.clock;

/**
 * Protobuf type {@code clock.ClockResetResponse}
 */
public  final class ClockResetResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:clock.ClockResetResponse)
    ClockResetResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClockResetResponse.newBuilder() to construct.
  private ClockResetResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClockResetResponse() {
    clockResetResponse_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClockResetResponse(
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

            clockResetResponse_ = s;
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
    return org.Muhammad.example.clock.ClockProto.internal_static_clock_ClockResetResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.Muhammad.example.clock.ClockProto.internal_static_clock_ClockResetResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.Muhammad.example.clock.ClockResetResponse.class, org.Muhammad.example.clock.ClockResetResponse.Builder.class);
  }

  public static final int CLOCKRESETRESPONSE_FIELD_NUMBER = 1;
  private volatile java.lang.Object clockResetResponse_;
  /**
   * <code>string clockResetResponse = 1;</code>
   */
  public java.lang.String getClockResetResponse() {
    java.lang.Object ref = clockResetResponse_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clockResetResponse_ = s;
      return s;
    }
  }
  /**
   * <code>string clockResetResponse = 1;</code>
   */
  public com.google.protobuf.ByteString
      getClockResetResponseBytes() {
    java.lang.Object ref = clockResetResponse_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clockResetResponse_ = b;
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
    if (!getClockResetResponseBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, clockResetResponse_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getClockResetResponseBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clockResetResponse_);
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
    if (!(obj instanceof org.Muhammad.example.clock.ClockResetResponse)) {
      return super.equals(obj);
    }
    org.Muhammad.example.clock.ClockResetResponse other = (org.Muhammad.example.clock.ClockResetResponse) obj;

    boolean result = true;
    result = result && getClockResetResponse()
        .equals(other.getClockResetResponse());
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
    hash = (37 * hash) + CLOCKRESETRESPONSE_FIELD_NUMBER;
    hash = (53 * hash) + getClockResetResponse().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.Muhammad.example.clock.ClockResetResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.Muhammad.example.clock.ClockResetResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.Muhammad.example.clock.ClockResetResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.Muhammad.example.clock.ClockResetResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.Muhammad.example.clock.ClockResetResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.Muhammad.example.clock.ClockResetResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.Muhammad.example.clock.ClockResetResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.Muhammad.example.clock.ClockResetResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.Muhammad.example.clock.ClockResetResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.Muhammad.example.clock.ClockResetResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.Muhammad.example.clock.ClockResetResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.Muhammad.example.clock.ClockResetResponse parseFrom(
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
  public static Builder newBuilder(org.Muhammad.example.clock.ClockResetResponse prototype) {
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
   * Protobuf type {@code clock.ClockResetResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:clock.ClockResetResponse)
      org.Muhammad.example.clock.ClockResetResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.Muhammad.example.clock.ClockProto.internal_static_clock_ClockResetResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.Muhammad.example.clock.ClockProto.internal_static_clock_ClockResetResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.Muhammad.example.clock.ClockResetResponse.class, org.Muhammad.example.clock.ClockResetResponse.Builder.class);
    }

    // Construct using org.Muhammad.example.clock.ClockResetResponse.newBuilder()
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
      clockResetResponse_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.Muhammad.example.clock.ClockProto.internal_static_clock_ClockResetResponse_descriptor;
    }

    @java.lang.Override
    public org.Muhammad.example.clock.ClockResetResponse getDefaultInstanceForType() {
      return org.Muhammad.example.clock.ClockResetResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.Muhammad.example.clock.ClockResetResponse build() {
      org.Muhammad.example.clock.ClockResetResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.Muhammad.example.clock.ClockResetResponse buildPartial() {
      org.Muhammad.example.clock.ClockResetResponse result = new org.Muhammad.example.clock.ClockResetResponse(this);
      result.clockResetResponse_ = clockResetResponse_;
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
      if (other instanceof org.Muhammad.example.clock.ClockResetResponse) {
        return mergeFrom((org.Muhammad.example.clock.ClockResetResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.Muhammad.example.clock.ClockResetResponse other) {
      if (other == org.Muhammad.example.clock.ClockResetResponse.getDefaultInstance()) return this;
      if (!other.getClockResetResponse().isEmpty()) {
        clockResetResponse_ = other.clockResetResponse_;
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
      org.Muhammad.example.clock.ClockResetResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.Muhammad.example.clock.ClockResetResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object clockResetResponse_ = "";
    /**
     * <code>string clockResetResponse = 1;</code>
     */
    public java.lang.String getClockResetResponse() {
      java.lang.Object ref = clockResetResponse_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clockResetResponse_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string clockResetResponse = 1;</code>
     */
    public com.google.protobuf.ByteString
        getClockResetResponseBytes() {
      java.lang.Object ref = clockResetResponse_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clockResetResponse_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string clockResetResponse = 1;</code>
     */
    public Builder setClockResetResponse(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      clockResetResponse_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string clockResetResponse = 1;</code>
     */
    public Builder clearClockResetResponse() {
      
      clockResetResponse_ = getDefaultInstance().getClockResetResponse();
      onChanged();
      return this;
    }
    /**
     * <code>string clockResetResponse = 1;</code>
     */
    public Builder setClockResetResponseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      clockResetResponse_ = value;
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


    // @@protoc_insertion_point(builder_scope:clock.ClockResetResponse)
  }

  // @@protoc_insertion_point(class_scope:clock.ClockResetResponse)
  private static final org.Muhammad.example.clock.ClockResetResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.Muhammad.example.clock.ClockResetResponse();
  }

  public static org.Muhammad.example.clock.ClockResetResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClockResetResponse>
      PARSER = new com.google.protobuf.AbstractParser<ClockResetResponse>() {
    @java.lang.Override
    public ClockResetResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClockResetResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClockResetResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClockResetResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.Muhammad.example.clock.ClockResetResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
