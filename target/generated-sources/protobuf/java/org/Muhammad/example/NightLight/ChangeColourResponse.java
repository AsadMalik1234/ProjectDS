// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: nightLight.proto

package org.Muhammad.example.NightLight;

/**
 * Protobuf type {@code NightLight.ChangeColourResponse}
 */
public  final class ChangeColourResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:NightLight.ChangeColourResponse)
    ChangeColourResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChangeColourResponse.newBuilder() to construct.
  private ChangeColourResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChangeColourResponse() {
    changecolour_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChangeColourResponse(
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

            changecolour_ = s;
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
    return org.Muhammad.example.NightLight.NightLightProto.internal_static_NightLight_ChangeColourResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.Muhammad.example.NightLight.NightLightProto.internal_static_NightLight_ChangeColourResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.Muhammad.example.NightLight.ChangeColourResponse.class, org.Muhammad.example.NightLight.ChangeColourResponse.Builder.class);
  }

  public static final int CHANGECOLOUR_FIELD_NUMBER = 1;
  private volatile java.lang.Object changecolour_;
  /**
   * <code>string changecolour = 1;</code>
   */
  public java.lang.String getChangecolour() {
    java.lang.Object ref = changecolour_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      changecolour_ = s;
      return s;
    }
  }
  /**
   * <code>string changecolour = 1;</code>
   */
  public com.google.protobuf.ByteString
      getChangecolourBytes() {
    java.lang.Object ref = changecolour_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      changecolour_ = b;
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
    if (!getChangecolourBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, changecolour_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getChangecolourBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, changecolour_);
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
    if (!(obj instanceof org.Muhammad.example.NightLight.ChangeColourResponse)) {
      return super.equals(obj);
    }
    org.Muhammad.example.NightLight.ChangeColourResponse other = (org.Muhammad.example.NightLight.ChangeColourResponse) obj;

    boolean result = true;
    result = result && getChangecolour()
        .equals(other.getChangecolour());
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
    hash = (37 * hash) + CHANGECOLOUR_FIELD_NUMBER;
    hash = (53 * hash) + getChangecolour().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.Muhammad.example.NightLight.ChangeColourResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.Muhammad.example.NightLight.ChangeColourResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.Muhammad.example.NightLight.ChangeColourResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.Muhammad.example.NightLight.ChangeColourResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.Muhammad.example.NightLight.ChangeColourResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.Muhammad.example.NightLight.ChangeColourResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.Muhammad.example.NightLight.ChangeColourResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.Muhammad.example.NightLight.ChangeColourResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.Muhammad.example.NightLight.ChangeColourResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.Muhammad.example.NightLight.ChangeColourResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.Muhammad.example.NightLight.ChangeColourResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.Muhammad.example.NightLight.ChangeColourResponse parseFrom(
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
  public static Builder newBuilder(org.Muhammad.example.NightLight.ChangeColourResponse prototype) {
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
   * Protobuf type {@code NightLight.ChangeColourResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:NightLight.ChangeColourResponse)
      org.Muhammad.example.NightLight.ChangeColourResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.Muhammad.example.NightLight.NightLightProto.internal_static_NightLight_ChangeColourResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.Muhammad.example.NightLight.NightLightProto.internal_static_NightLight_ChangeColourResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.Muhammad.example.NightLight.ChangeColourResponse.class, org.Muhammad.example.NightLight.ChangeColourResponse.Builder.class);
    }

    // Construct using org.Muhammad.example.NightLight.ChangeColourResponse.newBuilder()
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
      changecolour_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.Muhammad.example.NightLight.NightLightProto.internal_static_NightLight_ChangeColourResponse_descriptor;
    }

    @java.lang.Override
    public org.Muhammad.example.NightLight.ChangeColourResponse getDefaultInstanceForType() {
      return org.Muhammad.example.NightLight.ChangeColourResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.Muhammad.example.NightLight.ChangeColourResponse build() {
      org.Muhammad.example.NightLight.ChangeColourResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.Muhammad.example.NightLight.ChangeColourResponse buildPartial() {
      org.Muhammad.example.NightLight.ChangeColourResponse result = new org.Muhammad.example.NightLight.ChangeColourResponse(this);
      result.changecolour_ = changecolour_;
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
      if (other instanceof org.Muhammad.example.NightLight.ChangeColourResponse) {
        return mergeFrom((org.Muhammad.example.NightLight.ChangeColourResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.Muhammad.example.NightLight.ChangeColourResponse other) {
      if (other == org.Muhammad.example.NightLight.ChangeColourResponse.getDefaultInstance()) return this;
      if (!other.getChangecolour().isEmpty()) {
        changecolour_ = other.changecolour_;
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
      org.Muhammad.example.NightLight.ChangeColourResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.Muhammad.example.NightLight.ChangeColourResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object changecolour_ = "";
    /**
     * <code>string changecolour = 1;</code>
     */
    public java.lang.String getChangecolour() {
      java.lang.Object ref = changecolour_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        changecolour_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string changecolour = 1;</code>
     */
    public com.google.protobuf.ByteString
        getChangecolourBytes() {
      java.lang.Object ref = changecolour_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        changecolour_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string changecolour = 1;</code>
     */
    public Builder setChangecolour(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      changecolour_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string changecolour = 1;</code>
     */
    public Builder clearChangecolour() {
      
      changecolour_ = getDefaultInstance().getChangecolour();
      onChanged();
      return this;
    }
    /**
     * <code>string changecolour = 1;</code>
     */
    public Builder setChangecolourBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      changecolour_ = value;
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


    // @@protoc_insertion_point(builder_scope:NightLight.ChangeColourResponse)
  }

  // @@protoc_insertion_point(class_scope:NightLight.ChangeColourResponse)
  private static final org.Muhammad.example.NightLight.ChangeColourResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.Muhammad.example.NightLight.ChangeColourResponse();
  }

  public static org.Muhammad.example.NightLight.ChangeColourResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChangeColourResponse>
      PARSER = new com.google.protobuf.AbstractParser<ChangeColourResponse>() {
    @java.lang.Override
    public ChangeColourResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChangeColourResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChangeColourResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChangeColourResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.Muhammad.example.NightLight.ChangeColourResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

