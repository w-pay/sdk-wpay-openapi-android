/*
 * Wpay APIs
 * Wpay APIs for payments and gifting
 *
 * The version of the OpenAPI document: 1.0.2
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

import io.swagger.annotations.ApiModelProperty;

/**
 * PaymentAgreementStepUp
 */

public class PaymentAgreementStepUp implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private String type;

    public static final String SERIALIZED_NAME_MANDATORY = "mandatory";
    @SerializedName(SERIALIZED_NAME_MANDATORY)
    private Boolean mandatory;

    public static final String SERIALIZED_NAME_URL = "url";
    @SerializedName(SERIALIZED_NAME_URL)
    private String url;


    public PaymentAgreementStepUp type(String type) {

        this.type = type;
        return this;
    }

    /**
     * The type of the step up action. For gift cards this will be REQUIRE_PASSCODE which identifies that the consumer must capture the PIN prior to payment.
     * @return type
     **/
    @ApiModelProperty(example = "REQUIRE_PASSCODE", required = true, value = "The type of the step up action. For gift cards this will be REQUIRE_PASSCODE which identifies that the consumer must capture the PIN prior to payment.")

    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public PaymentAgreementStepUp mandatory(Boolean mandatory) {

        this.mandatory = mandatory;
        return this;
    }

    /**
     * A flag to indicate if this step up (action) is mandatory.
     * @return mandatory
     **/
    @ApiModelProperty(example = "true", required = true, value = "A flag to indicate if this step up (action) is mandatory.")

    public Boolean getMandatory() {
        return mandatory;
    }


    public void setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
    }


    public PaymentAgreementStepUp url(String url) {

        this.url = url;
        return this;
    }

    /**
     * TBD
     * @return url
     **/
    @ApiModelProperty(example = "https://uat.woolworthspay.com.au/container-ws/tbd", required = true, value = "TBD")

    public String getUrl() {
        return url;
    }


    public void setUrl(String url) {
        this.url = url;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentAgreementStepUp paymentAgreementStepUp = (PaymentAgreementStepUp) o;
        return Objects.equals(this.type, paymentAgreementStepUp.type) &&
                Objects.equals(this.mandatory, paymentAgreementStepUp.mandatory) &&
                Objects.equals(this.url, paymentAgreementStepUp.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, mandatory, url);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentAgreementStepUp {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

