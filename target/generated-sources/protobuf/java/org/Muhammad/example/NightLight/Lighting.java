// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: nightLight.proto

package org.Muhammad.example.NightLight;

/**
 * Protobuf type {@code NightLight.Lighting}
 */
public  final class Lighting extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:NightLight.Lighting)
    LightingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Lighting.newBuilder() to construct.
  private Lighting(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Lighting() {
    lightOn_ = "";
    lightOff_ = "";
    changeColour_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Lighting(
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

            lightOn_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            lightOff_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            changeColour_ = s;
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
    return org.Muhammad.example.NightLight.NightLightProto.internal_static_NightLight_Lighting_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.Muhammad.example.NightLight.NightLightProto.internal_static_NightLight_Lighting_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.Muhammad.example.NightLight.Lighting.class, org.Muhammad.example.NightLight.Lighting.Builder.class);
  }

  public static final int LIGHT_ON_FIELD_NUMBER = 1;
  private volatile java.lang.Object lightOn_;
  /**
   * <code>string light_on = 1;</code>
   */
  public java.lang.String getLightOn() {
    java.lang.Object ref = lightOn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lightOn_ = s;
      return s;
    }
  }
  /**
   * <code>string light_on = 1;</code>
   */
  public com.google.protobuf.ByteString
      getLightOnBytes() {
    java.lang.Object ref = lightOn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lightOn_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LIGHT_OFF_FIELD_NUMBER = 2;
  private volatile java.lang.Object lightOff_;
  /**
   * <code>string light_off = 2;</code>
   */
  public java.lang.String getLightOff() {
    java.lang.Object ref = lightOff_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lightOff_ = s;
      return s;
    }
  }
  /**
   * <code>string light_off = 2;</code>
   */
  public com.google.protobuf.ByteString
      getLightOffBytes() {
    java.lang.Object ref = lightOff_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lightOff_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHANGE_COLOUR_FIELD_NUMBER = 3;
  private volatile java.lang.Object changeColour_;
  /**
   * <code>string change_colour = 3;</code>
   */
  public java.lang.String getChangeColour() {
    java.lang.Object ref = changeColour_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      changeColour_ = s;
      return s;
    }
  }
  /**
   * <code>string change_colour = 3;</code>
   */
  public com.google.protobuf.ByteString
      getChangeColourBytes() {
    java.lang.Object ref = changeColour_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      changeColour_ = b;
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
    if (!getLightOnBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, lightOn_);
    }
    if (!getLightOffBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, lightOff_);
    }
    if (!getChangeColourBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, changeColour_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLightOnBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, lightOn_);
    }
    if (!getLightOffBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, lightOff_);
    }
    if (!getChangeColourBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, changeColour_);
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
    if (!(obj instanceof org.Muhammad.example.NightLight.Lighting)) {
      return super.equals(obj);
    }
    org.Muhammad.example.NightLight.Lighting other = (org.Muhammad.example.NightLight.Lighting) obj;

    boolean result = true;
    result = result && getLightOn()
        .equals(other.getLightOn());
    result = result && getLightOff()
        .equals(other.getLightOff());
    result = result && getChangeColour()
        .equals(other.getChangeColour());
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
    hash = (37 * hash) + LIGHT_ON_FIELD_NUMBER;
    hash = (53 * hash) + getLightOn().hashCode();
    hash = (37 * hash) + LIGHT_OFF_FIELD_NUMBER;
    hash = (53 * hash) + getLightOff().hashCode();
    hash = (37 * hash) + CHANGE_COLOUR_FIELD_NUMBER;
    hash = (53 * hash) + getChangeColour().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.Muhammad.example.NightLight.Lighting parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.Muhammad.example.NightLight.Lighting parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.Muhammad.example.NightLight.Lighting parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.Muhammad.example.NightLight.Lighting parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.Muhammad.example.NightLight.Lighting parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.Muhammad.example.NightLight.Lighting parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.Muhammad.example.NightLight.Lighting parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.Muhammad.example.NightLight.Lighting parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.Muhammad.example.NightLight.Lighting parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.Muhammad.example.NightLight.Lighting parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.Muhammad.example.NightLight.Lighting parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.Muhammad.example.NightLight.Lighting parseFrom(
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
  public static Builder newBuilder(org.Muhammad.example.NightLight.Lighting prototype) {
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
   * Protobuf type {@code NightLight.Lighting}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:NightLight.Lighting)
      org.Muhammad.example.NightLight.LightingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.Muhammad.example.NightLight.NightLightProto.internal_static_NightLight_Lighting_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.Muhammad.example.NightLight.NightLightProto.internal_static_NightLight_Lighting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.Muhammad.example.NightLight.Lighting.class, org.Muhammad.example.NightLight.Lighting.Builder.class);
    }

    // Construct using org.Muhammad.example.NightLight.Lighting.newBuilder()
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
      lightOn_ = "";

      lightOff_ = "";

      changeColour_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.Muhammad.example.NightLight.NightLightProto.internal_static_NightLight_Lighting_descriptor;
    }

    @java.lang.Override
    public org.Muhammad.example.NightLight.Lighting getDefaultInstanceForType() {
      return org.Muhammad.example.NightLight.Lighting.getDefaultInstance();
    }

    @java.lang.Override
    public org.Muhammad.example.NightLight.Lighting build() {
      org.Muhammad.example.NightLight.Lighting result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.Muhammad.example.NightLight.Lighting buildPartial() {
      org.Muhammad.example.NightLight.Lighting result = new org.Muhammad.example.NightLight.Lighting(this);
      result.lightOn_ = lightOn_;
      result.lightOff_ = lightOff_;
      result.changeColour_ = changeColour_;
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
      if (other instanceof org.Muhammad.example.NightLight.Lighting) {
        return mergeFrom((org.Muhammad.example.NightLight.Lighting)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.Muhammad.example.NightLight.Lighting other) {
      if (other == org.Muhammad.example.NightLight.Lighting.getDefaultInstance()) return this;
      if (!other.getLightOn().isEmpty()) {
        lightOn_ = other.lightOn_;
        onChanged();
      }
      if (!other.getLightOff().isEmpty()) {
        lightOff_ = other.lightOff_;
        onChanged();
      }
      if (!other.getChangeColour().isEmpty()) {
        changeColour_ = other.changeColour_;
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
      org.Muhammad.example.NightLight.Lighting parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.Muhammad.example.NightLight.Lighting) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object lightOn_ = "";
    /**
     * <code>string light_on = 1;</code>
     */
    public java.lang.String getLightOn() {
      java.lang.Object ref = lightOn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lightOn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string light_on = 1;</code>
     */
    public com.google.protobuf.ByteString
        getLightOnBytes() {
      java.lang.Object ref = lightOn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lightOn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string light_on = 1;</code>
     */
    public Builder setLightOn(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lightOn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string light_on = 1;</code>
     */
    public Builder clearLightOn() {
      
      lightOn_ = getDefaultInstance().getLightOn();
      onChanged();
      return this;
    }
    /**
     * <code>string light_on = 1;</code>
     */
    public Builder setLightOnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lightOn_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object lightOff_ = "";
    /**
     * <code>string light_off = 2;</code>
     */
    public java.lang.String getLightOff() {
      java.lang.Object ref = lightOff_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lightOff_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string light_off = 2;</code>
     */
    public com.google.protobuf.ByteString
        getLightOffBytes() {
      java.lang.Object ref = lightOff_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lightOff_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string light_off = 2;</code>
     */
    public Builder setLightOff(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lightOff_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string light_off = 2;</code>
     */
    public Builder clearLightOff() {
      
      lightOff_ = getDefaultInstance().getLightOff();
      onChanged();
      return this;
    }
    /**
     * <code>string light_off = 2;</code>
     */
    public Builder setLightOffBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lightOff_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object changeColour_ = "";
    /**
     * <code>string change_colour = 3;</code>
     */
    public java.lang.String getChangeColour() {
      java.lang.Object ref = changeColour_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        changeColour_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string change_colour = 3;</code>
     */
    public com.google.protobuf.ByteString
        getChangeColourBytes() {
      java.lang.Object ref = changeColour_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        changeColour_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string change_colour = 3;</code>
     */
    public Builder setChangeColour(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      changeColour_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string change_colour = 3;</code>
     */
    public Builder clearChangeColour() {
      
      changeColour_ = getDefaultInstance().getChangeColour();
      onChanged();
      return this;
    }
    /**
     * <code>string change_colour = 3;</code>
     */
    public Builder setChangeColourBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      changeColour_ = value;
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


    // @@protoc_insertion_point(builder_scope:NightLight.Lighting)
  }

  // @@protoc_insertion_point(class_scope:NightLight.Lighting)
  private static final org.Muhammad.example.NightLight.Lighting DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.Muhammad.example.NightLight.Lighting();
  }

  public static org.Muhammad.example.NightLight.Lighting getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Lighting>
      PARSER = new com.google.protobuf.AbstractParser<Lighting>() {
    @java.lang.Override
    public Lighting parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Lighting(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Lighting> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Lighting> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.Muhammad.example.NightLight.Lighting getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

