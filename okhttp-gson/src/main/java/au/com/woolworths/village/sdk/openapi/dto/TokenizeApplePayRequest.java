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
 * The JSON request structure of the Tokenize Apple Pay endpoint.
 */
@ApiModel(description = "The JSON request structure of the Tokenize Apple Pay endpoint.")

public class TokenizeApplePayRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_EPHEMERAL_PUBLIC_KEY = "ephemeralPublicKey";
  @SerializedName(SERIALIZED_NAME_EPHEMERAL_PUBLIC_KEY)
  private String ephemeralPublicKey;

  public static final String SERIALIZED_NAME_PUBLIC_KEY_HASH = "publicKeyHash";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY_HASH)
  private String publicKeyHash;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_INSTRUMENT_TYPE = "instrumentType";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_TYPE)
  private String instrumentType;

  public static final String SERIALIZED_NAME_PRIMARY = "primary";
  @SerializedName(SERIALIZED_NAME_PRIMARY)
  private Boolean primary;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_APPLICATION_DATA = "applicationData";
  @SerializedName(SERIALIZED_NAME_APPLICATION_DATA)
  private String applicationData;


  public TokenizeApplePayRequest data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * The \&quot;data\&quot; value from the Apple Pay wallet.
   * @return data
  **/
  @ApiModelProperty(example = "a15owFtcCC6xUY3S9R9qGetYgD0iEW7", required = true, value = "The \"data\" value from the Apple Pay wallet.")

  public String getData() {
    return data;
  }


  public void setData(String data) {
    this.data = data;
  }


  public TokenizeApplePayRequest ephemeralPublicKey(String ephemeralPublicKey) {
    
    this.ephemeralPublicKey = ephemeralPublicKey;
    return this;
  }

   /**
   * The \&quot;ephemeralPublicKey\&quot; value from the Apple Pay wallet.
   * @return ephemeralPublicKey
  **/
  @ApiModelProperty(example = "MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEbLF8=", required = true, value = "The \"ephemeralPublicKey\" value from the Apple Pay wallet.")

  public String getEphemeralPublicKey() {
    return ephemeralPublicKey;
  }


  public void setEphemeralPublicKey(String ephemeralPublicKey) {
    this.ephemeralPublicKey = ephemeralPublicKey;
  }


  public TokenizeApplePayRequest publicKeyHash(String publicKeyHash) {
    
    this.publicKeyHash = publicKeyHash;
    return this;
  }

   /**
   * The \&quot;publicKeyHash\&quot; value from the Apple Pay wallet.
   * @return publicKeyHash
  **/
  @ApiModelProperty(example = "AwqjNEgX2nTIQ9zIbCcA+G9iHOWU4RQ56SrYM=", required = true, value = "The \"publicKeyHash\" value from the Apple Pay wallet.")

  public String getPublicKeyHash() {
    return publicKeyHash;
  }


  public void setPublicKeyHash(String publicKeyHash) {
    this.publicKeyHash = publicKeyHash;
  }


  public TokenizeApplePayRequest transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The \&quot;transactionId\&quot; value from the Apple Pay wallet.
   * @return transactionId
  **/
  @ApiModelProperty(example = "87a124b4d59d3819c666555ef411c", required = true, value = "The \"transactionId\" value from the Apple Pay wallet.")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public TokenizeApplePayRequest signature(String signature) {
    
    this.signature = signature;
    return this;
  }

   /**
   * The \&quot;signature\&quot; value from the Apple Pay wallet.
   * @return signature
  **/
  @ApiModelProperty(example = "MIAGCSqGSIb3DQEHAqCAMIACAQExDzANBglghk=", required = true, value = "The \"signature\" value from the Apple Pay wallet.")

  public String getSignature() {
    return signature;
  }


  public void setSignature(String signature) {
    this.signature = signature;
  }


  public TokenizeApplePayRequest version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * The \&quot;version\&quot; value from the Apple Pay wallet.
   * @return version
  **/
  @ApiModelProperty(example = "EC_V1", required = true, value = "The \"version\" value from the Apple Pay wallet.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public TokenizeApplePayRequest instrumentType(String instrumentType) {
    
    this.instrumentType = instrumentType;
    return this;
  }

   /**
   * The type/schema value from the Apple Pay wallet.
   * @return instrumentType
  **/
  @ApiModelProperty(example = "AMEX", required = true, value = "The type/schema value from the Apple Pay wallet.")

  public String getInstrumentType() {
    return instrumentType;
  }


  public void setInstrumentType(String instrumentType) {
    this.instrumentType = instrumentType;
  }


  public TokenizeApplePayRequest primary(Boolean primary) {
    
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


  public TokenizeApplePayRequest comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * The display text returned by the Apple Pay wallet.
   * @return comment
  **/
  @ApiModelProperty(example = "AMEX-0001", required = true, value = "The display text returned by the Apple Pay wallet.")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public TokenizeApplePayRequest applicationData(String applicationData) {
    
    this.applicationData = applicationData;
    return this;
  }

   /**
   * The \&quot;applicationData\&quot; value from the Apple Pay wallet.
   * @return applicationData
  **/
  @ApiModelProperty(example = "666555ef411bf515621f", required = true, value = "The \"applicationData\" value from the Apple Pay wallet.")

  public String getApplicationData() {
    return applicationData;
  }


  public void setApplicationData(String applicationData) {
    this.applicationData = applicationData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenizeApplePayRequest tokenizeApplePayRequest = (TokenizeApplePayRequest) o;
    return Objects.equals(this.data, tokenizeApplePayRequest.data) &&
        Objects.equals(this.ephemeralPublicKey, tokenizeApplePayRequest.ephemeralPublicKey) &&
        Objects.equals(this.publicKeyHash, tokenizeApplePayRequest.publicKeyHash) &&
        Objects.equals(this.transactionId, tokenizeApplePayRequest.transactionId) &&
        Objects.equals(this.signature, tokenizeApplePayRequest.signature) &&
        Objects.equals(this.version, tokenizeApplePayRequest.version) &&
        Objects.equals(this.instrumentType, tokenizeApplePayRequest.instrumentType) &&
        Objects.equals(this.primary, tokenizeApplePayRequest.primary) &&
        Objects.equals(this.comment, tokenizeApplePayRequest.comment) &&
        Objects.equals(this.applicationData, tokenizeApplePayRequest.applicationData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, ephemeralPublicKey, publicKeyHash, transactionId, signature, version, instrumentType, primary, comment, applicationData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenizeApplePayRequest {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    ephemeralPublicKey: ").append(toIndentedString(ephemeralPublicKey)).append("\n");
    sb.append("    publicKeyHash: ").append(toIndentedString(publicKeyHash)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    applicationData: ").append(toIndentedString(applicationData)).append("\n");
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
