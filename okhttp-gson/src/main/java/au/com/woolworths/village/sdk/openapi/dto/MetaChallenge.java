/*
 * Village Wallet
 * APIs for Village Wallet
 *
 * The version of the OpenAPI document: 0.0.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package au.com.woolworths.village.sdk.openapi.dto;

import java.util.Objects;
import java.util.Arrays;
import au.com.woolworths.village.sdk.openapi.dto.MetaChallengeChallengeResponses;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Meta Object containing responses to a step up challenges
 */
@ApiModel(description = "Meta Object containing responses to a step up challenges")

public class MetaChallenge implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CHALLENGE_RESPONSES = "challengeResponses";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_RESPONSES)
  private List<MetaChallengeChallengeResponses> challengeResponses = null;


  public MetaChallenge challengeResponses(List<MetaChallengeChallengeResponses> challengeResponses) {
    
    this.challengeResponses = challengeResponses;
    return this;
  }

  public MetaChallenge addChallengeResponsesItem(MetaChallengeChallengeResponses challengeResponsesItem) {
    if (this.challengeResponses == null) {
      this.challengeResponses = new ArrayList<MetaChallengeChallengeResponses>();
    }
    this.challengeResponses.add(challengeResponsesItem);
    return this;
  }

   /**
   * The collection of challenges
   * @return challengeResponses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The collection of challenges")

  public List<MetaChallengeChallengeResponses> getChallengeResponses() {
    return challengeResponses;
  }


  public void setChallengeResponses(List<MetaChallengeChallengeResponses> challengeResponses) {
    this.challengeResponses = challengeResponses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaChallenge metaChallenge = (MetaChallenge) o;
    return Objects.equals(this.challengeResponses, metaChallenge.challengeResponses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(challengeResponses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaChallenge {\n");
    sb.append("    challengeResponses: ").append(toIndentedString(challengeResponses)).append("\n");
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
