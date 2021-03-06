// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tv.proto

package org.Muhammad.example.tv;

/**
 * Protobuf type {@code TvFunction}
 */
public  final class TvFunction extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TvFunction)
    TvFunctionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TvFunction.newBuilder() to construct.
  private TvFunction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TvFunction() {
    tvOn_ = "";
    tvOff_ = "";
    channel_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TvFunction(
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

            tvOn_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            tvOff_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            channel_ = s;
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
    return org.Muhammad.example.tv.TvProto.internal_static_TvFunction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.Muhammad.example.tv.TvProto.internal_static_TvFunction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.Muhammad.example.tv.TvFunction.class, org.Muhammad.example.tv.TvFunction.Builder.class);
  }

  public static final int TVON_FIELD_NUMBER = 1;
  private volatile java.lang.Object tvOn_;
  /**
   * <code>string TvOn = 1;</code>
   */
  public java.lang.String getTvOn() {
    java.lang.Object ref = tvOn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tvOn_ = s;
      return s;
    }
  }
  /**
   * <code>string TvOn = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTvOnBytes() {
    java.lang.Object ref = tvOn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tvOn_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TVOFF_FIELD_NUMBER = 2;
  private volatile java.lang.Object tvOff_;
  /**
   * <code>string TvOff = 2;</code>
   */
  public java.lang.String getTvOff() {
    java.lang.Object ref = tvOff_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tvOff_ = s;
      return s;
    }
  }
  /**
   * <code>string TvOff = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTvOffBytes() {
    java.lang.Object ref = tvOff_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tvOff_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHANNEL_FIELD_NUMBER = 3;
  private volatile java.lang.Object channel_;
  /**
   * <code>string Channel = 3;</code>
   */
  public java.lang.String getChannel() {
    java.lang.Object ref = channel_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      channel_ = s;
      return s;
    }
  }
  /**
   * <code>string Channel = 3;</code>
   */
  public com.google.protobuf.ByteString
      getChannelBytes() {
    java.lang.Object ref = channel_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      channel_ = b;
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
    if (!getTvOnBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tvOn_);
    }
    if (!getTvOffBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, tvOff_);
    }
    if (!getChannelBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, channel_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTvOnBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tvOn_);
    }
    if (!getTvOffBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, tvOff_);
    }
    if (!getChannelBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, channel_);
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
    if (!(obj instanceof org.Muhammad.example.tv.TvFunction)) {
      return super.equals(obj);
    }
    org.Muhammad.example.tv.TvFunction other = (org.Muhammad.example.tv.TvFunction) obj;

    boolean result = true;
    result = result && getTvOn()
        .equals(other.getTvOn());
    result = result && getTvOff()
        .equals(other.getTvOff());
    result = result && getChannel()
        .equals(other.getChannel());
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
    hash = (37 * hash) + TVON_FIELD_NUMBER;
    hash = (53 * hash) + getTvOn().hashCode();
    hash = (37 * hash) + TVOFF_FIELD_NUMBER;
    hash = (53 * hash) + getTvOff().hashCode();
    hash = (37 * hash) + CHANNEL_FIELD_NUMBER;
    hash = (53 * hash) + getChannel().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.Muhammad.example.tv.TvFunction parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.Muhammad.example.tv.TvFunction parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.Muhammad.example.tv.TvFunction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.Muhammad.example.tv.TvFunction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.Muhammad.example.tv.TvFunction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.Muhammad.example.tv.TvFunction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.Muhammad.example.tv.TvFunction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.Muhammad.example.tv.TvFunction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.Muhammad.example.tv.TvFunction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.Muhammad.example.tv.TvFunction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.Muhammad.example.tv.TvFunction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.Muhammad.example.tv.TvFunction parseFrom(
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
  public static Builder newBuilder(org.Muhammad.example.tv.TvFunction prototype) {
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
   * Protobuf type {@code TvFunction}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TvFunction)
      org.Muhammad.example.tv.TvFunctionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.Muhammad.example.tv.TvProto.internal_static_TvFunction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.Muhammad.example.tv.TvProto.internal_static_TvFunction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.Muhammad.example.tv.TvFunction.class, org.Muhammad.example.tv.TvFunction.Builder.class);
    }

    // Construct using org.Muhammad.example.tv.TvFunction.newBuilder()
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
      tvOn_ = "";

      tvOff_ = "";

      channel_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.Muhammad.example.tv.TvProto.internal_static_TvFunction_descriptor;
    }

    @java.lang.Override
    public org.Muhammad.example.tv.TvFunction getDefaultInstanceForType() {
      return org.Muhammad.example.tv.TvFunction.getDefaultInstance();
    }

    @java.lang.Override
    public org.Muhammad.example.tv.TvFunction build() {
      org.Muhammad.example.tv.TvFunction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.Muhammad.example.tv.TvFunction buildPartial() {
      org.Muhammad.example.tv.TvFunction result = new org.Muhammad.example.tv.TvFunction(this);
      result.tvOn_ = tvOn_;
      result.tvOff_ = tvOff_;
      result.channel_ = channel_;
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
      if (other instanceof org.Muhammad.example.tv.TvFunction) {
        return mergeFrom((org.Muhammad.example.tv.TvFunction)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.Muhammad.example.tv.TvFunction other) {
      if (other == org.Muhammad.example.tv.TvFunction.getDefaultInstance()) return this;
      if (!other.getTvOn().isEmpty()) {
        tvOn_ = other.tvOn_;
        onChanged();
      }
      if (!other.getTvOff().isEmpty()) {
        tvOff_ = other.tvOff_;
        onChanged();
      }
      if (!other.getChannel().isEmpty()) {
        channel_ = other.channel_;
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
      org.Muhammad.example.tv.TvFunction parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.Muhammad.example.tv.TvFunction) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object tvOn_ = "";
    /**
     * <code>string TvOn = 1;</code>
     */
    public java.lang.String getTvOn() {
      java.lang.Object ref = tvOn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tvOn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string TvOn = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTvOnBytes() {
      java.lang.Object ref = tvOn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tvOn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string TvOn = 1;</code>
     */
    public Builder setTvOn(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tvOn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string TvOn = 1;</code>
     */
    public Builder clearTvOn() {
      
      tvOn_ = getDefaultInstance().getTvOn();
      onChanged();
      return this;
    }
    /**
     * <code>string TvOn = 1;</code>
     */
    public Builder setTvOnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tvOn_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object tvOff_ = "";
    /**
     * <code>string TvOff = 2;</code>
     */
    public java.lang.String getTvOff() {
      java.lang.Object ref = tvOff_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tvOff_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string TvOff = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTvOffBytes() {
      java.lang.Object ref = tvOff_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tvOff_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string TvOff = 2;</code>
     */
    public Builder setTvOff(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tvOff_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string TvOff = 2;</code>
     */
    public Builder clearTvOff() {
      
      tvOff_ = getDefaultInstance().getTvOff();
      onChanged();
      return this;
    }
    /**
     * <code>string TvOff = 2;</code>
     */
    public Builder setTvOffBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tvOff_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object channel_ = "";
    /**
     * <code>string Channel = 3;</code>
     */
    public java.lang.String getChannel() {
      java.lang.Object ref = channel_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        channel_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Channel = 3;</code>
     */
    public com.google.protobuf.ByteString
        getChannelBytes() {
      java.lang.Object ref = channel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        channel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Channel = 3;</code>
     */
    public Builder setChannel(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      channel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Channel = 3;</code>
     */
    public Builder clearChannel() {
      
      channel_ = getDefaultInstance().getChannel();
      onChanged();
      return this;
    }
    /**
     * <code>string Channel = 3;</code>
     */
    public Builder setChannelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      channel_ = value;
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


    // @@protoc_insertion_point(builder_scope:TvFunction)
  }

  // @@protoc_insertion_point(class_scope:TvFunction)
  private static final org.Muhammad.example.tv.TvFunction DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.Muhammad.example.tv.TvFunction();
  }

  public static org.Muhammad.example.tv.TvFunction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TvFunction>
      PARSER = new com.google.protobuf.AbstractParser<TvFunction>() {
    @java.lang.Override
    public TvFunction parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TvFunction(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TvFunction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TvFunction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.Muhammad.example.tv.TvFunction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

