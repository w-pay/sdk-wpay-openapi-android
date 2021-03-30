/*
 * Wpay APIs
 * Wpay APIs for payments and gifting
 *
 * The version of the OpenAPI document: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package au.com.woolworths.village.sdk.openapi.dto;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The JSON request structure of the Tokenize Google Pay endpoint.
 */
@ApiModel(description = "The JSON request structure of the Tokenize Google Pay endpoint.")

public class TokenizeGooglePayRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_INSTRUMENT_TYPE = "instrumentType";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_TYPE)
  private String instrumentType;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_TOKEN_DATA = "tokenData";
  @SerializedName(SERIALIZED_NAME_TOKEN_DATA)
  private String tokenData;


  public TokenizeGooglePayRequest instrumentType(String instrumentType) {
    
    this.instrumentType = instrumentType;
    return this;
  }

   /**
   * The type/schema value from the Google Pay wallet.
   * @return instrumentType
  **/
  @ApiModelProperty(example = "AMEX", required = true, value = "The type/schema value from the Google Pay wallet.")

  public String getInstrumentType() {
    return instrumentType;
  }


  public void setInstrumentType(String instrumentType) {
    this.instrumentType = instrumentType;
  }


  public TokenizeGooglePayRequest comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * The display text returned by the Google Pay wallet.
   * @return comment
  **/
  @ApiModelProperty(example = "AMEX-5232", required = true, value = "The display text returned by the Google Pay wallet.")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public TokenizeGooglePayRequest tokenData(String tokenData) {
    
    this.tokenData = tokenData;
    return this;
  }

   /**
   * The \&quot;tokenData\&quot; payload from the Google Pay wallet.
   * @return tokenData
  **/
  @ApiModelProperty(example = "{\\\"protocolVersion\\\":\\\"ECv2\\\",\\\"signature\\\":\\\"MEQCIBec51ti5KFs==\\\",\\\"intermediateSigningKey\\\":{\\\"signatures\\\":[\\\"MEUCIEvA6rkOlThv=\\\"],\\\"signedKey\\\":\\\"{\\\\\\\"keyValue\\\\\\\":\\\\\\\"MFkwEwYHKoZIzj0CAQYI\\\\\\\",\\\\\\\"keyExpiration\\\\\\\":\\\\\\\"1601448494595\\\\\\\"}\\\"},\\\"signedMessage\\\":\\\"{\\\\\\\"encryptedMessage\\\\\\\":\\\\\\\"o7raQeRaPE8NxOQuZPro6u\\\\\\\",\\\\\\\"ephemeralPublicKey\\\\\\\":\\\\\\\"BMEuZ4HsiNh\\\\\\\",\\\\\\\"tag\\\\\\\":\\\\\\\"kfFQwoP5evLtDoh5fTq\\\\\\\"}\\\"}", required = true, value = "The \"tokenData\" payload from the Google Pay wallet.")

  public String getTokenData() {
    return tokenData;
  }


  public void setTokenData(String tokenData) {
    this.tokenData = tokenData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenizeGooglePayRequest tokenizeGooglePayRequest = (TokenizeGooglePayRequest) o;
    return Objects.equals(this.instrumentType, tokenizeGooglePayRequest.instrumentType) &&
        Objects.equals(this.comment, tokenizeGooglePayRequest.comment) &&
        Objects.equals(this.tokenData, tokenizeGooglePayRequest.tokenData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrumentType, comment, tokenData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenizeGooglePayRequest {\n");
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    tokenData: ").append(toIndentedString(tokenData)).append("\n");
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

