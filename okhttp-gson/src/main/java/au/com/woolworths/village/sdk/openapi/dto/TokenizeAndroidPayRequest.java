/*
 * Wpay APIs
 * Wpay APIs for payments and gifting
 *
 * The version of the OpenAPI document: 1.0.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package au.com.woolworths.village.sdk.openapi.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * The JSON request structure of the Tokenize Android Pay endpoint.
 */
@ApiModel(description = "The JSON request structure of the Tokenize Android Pay endpoint.")

public class TokenizeAndroidPayRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ENCRYPTED_MESSAGE = "encryptedMessage";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED_MESSAGE)
  private String encryptedMessage;

  public static final String SERIALIZED_NAME_EPHEMERAL_PUBLIC_KEY = "ephemeralPublicKey";
  @SerializedName(SERIALIZED_NAME_EPHEMERAL_PUBLIC_KEY)
  private String ephemeralPublicKey;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_PUBLIC_KEY_HASH = "publicKeyHash";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY_HASH)
  private String publicKeyHash;

  public static final String SERIALIZED_NAME_INSTRUMENT_TYPE = "instrumentType";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_TYPE)
  private String instrumentType;

  public static final String SERIALIZED_NAME_PRIMARY = "primary";
  @SerializedName(SERIALIZED_NAME_PRIMARY)
  private Boolean primary;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;


  public TokenizeAndroidPayRequest encryptedMessage(String encryptedMessage) {
    
    this.encryptedMessage = encryptedMessage;
    return this;
  }

   /**
   * The \&quot;encryptedMessage\&quot; value from the Android Pay wallet.
   * @return encryptedMessage
  **/
  @ApiModelProperty(example = "AkG06mqN9YuZKY6gWtXFdOAJUkJtCByrj9boK1UEWIbz", required = true, value = "The \"encryptedMessage\" value from the Android Pay wallet.")

  public String getEncryptedMessage() {
    return encryptedMessage;
  }


  public void setEncryptedMessage(String encryptedMessage) {
    this.encryptedMessage = encryptedMessage;
  }


  public TokenizeAndroidPayRequest ephemeralPublicKey(String ephemeralPublicKey) {
    
    this.ephemeralPublicKey = ephemeralPublicKey;
    return this;
  }

   /**
   * The \&quot;ephemeralPublicKey\&quot; value from the Android Pay wallet.
   * @return ephemeralPublicKey
  **/
  @ApiModelProperty(example = "BP38r9n4rE6PtYruJV2IUv2y6ztU10o7=", required = true, value = "The \"ephemeralPublicKey\" value from the Android Pay wallet.")

  public String getEphemeralPublicKey() {
    return ephemeralPublicKey;
  }


  public void setEphemeralPublicKey(String ephemeralPublicKey) {
    this.ephemeralPublicKey = ephemeralPublicKey;
  }


  public TokenizeAndroidPayRequest tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * The \&quot;tag\&quot; value from the Android Pay wallet.
   * @return tag
  **/
  @ApiModelProperty(example = "oUjJxWs0SbHy4t1P6KETS34xGLr3ZkbJv=", required = true, value = "The \"tag\" value from the Android Pay wallet.")

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }


  public TokenizeAndroidPayRequest publicKeyHash(String publicKeyHash) {
    
    this.publicKeyHash = publicKeyHash;
    return this;
  }

   /**
   * The \&quot;publicKeyHash\&quot; value from the merchant profile response.
   * @return publicKeyHash
  **/
  @ApiModelProperty(example = "L121Yu2YU6ApskgvSMWg7H0=", required = true, value = "The \"publicKeyHash\" value from the merchant profile response.")

  public String getPublicKeyHash() {
    return publicKeyHash;
  }


  public void setPublicKeyHash(String publicKeyHash) {
    this.publicKeyHash = publicKeyHash;
  }


  public TokenizeAndroidPayRequest instrumentType(String instrumentType) {
    
    this.instrumentType = instrumentType;
    return this;
  }

   /**
   * The type/schema value from the Android Pay wallet.
   * @return instrumentType
  **/
  @ApiModelProperty(example = "MASTERCARD", required = true, value = "The type/schema value from the Android Pay wallet.")

  public String getInstrumentType() {
    return instrumentType;
  }


  public void setInstrumentType(String instrumentType) {
    this.instrumentType = instrumentType;
  }


  public TokenizeAndroidPayRequest primary(Boolean primary) {
    
    this.primary = primary;
    return this;
  }

   /**
   * A flag to indicate if this payment instrument has to be set as the primary instrument.
   * @return primary
  **/
  @ApiModelProperty(example = "true", required = true, value = "A flag to indicate if this payment instrument has to be set as the primary instrument.")

  public Boolean getPrimary() {
    return primary;
  }


  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }


  public TokenizeAndroidPayRequest comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * The display text returned by the Android Pay wallet.
   * @return comment
  **/
  @ApiModelProperty(example = "MASTER-5803", required = true, value = "The display text returned by the Android Pay wallet.")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenizeAndroidPayRequest tokenizeAndroidPayRequest = (TokenizeAndroidPayRequest) o;
    return Objects.equals(this.encryptedMessage, tokenizeAndroidPayRequest.encryptedMessage) &&
        Objects.equals(this.ephemeralPublicKey, tokenizeAndroidPayRequest.ephemeralPublicKey) &&
        Objects.equals(this.tag, tokenizeAndroidPayRequest.tag) &&
        Objects.equals(this.publicKeyHash, tokenizeAndroidPayRequest.publicKeyHash) &&
        Objects.equals(this.instrumentType, tokenizeAndroidPayRequest.instrumentType) &&
        Objects.equals(this.primary, tokenizeAndroidPayRequest.primary) &&
        Objects.equals(this.comment, tokenizeAndroidPayRequest.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptedMessage, ephemeralPublicKey, tag, publicKeyHash, instrumentType, primary, comment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenizeAndroidPayRequest {\n");
    sb.append("    encryptedMessage: ").append(toIndentedString(encryptedMessage)).append("\n");
    sb.append("    ephemeralPublicKey: ").append(toIndentedString(ephemeralPublicKey)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    publicKeyHash: ").append(toIndentedString(publicKeyHash)).append("\n");
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

