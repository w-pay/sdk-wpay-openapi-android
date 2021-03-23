package au.com.woolworths.village.sdk.openapi.api.digitalpay

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.model.DigitalPayUpdatePaymentAgreementRequest
import au.com.woolworths.village.sdk.model.digitalpay.DigitalPayChargePaymentAgreementRequest
import au.com.woolworths.village.sdk.model.digitalpay.DigitalPayCreatePaymentAgreementRequest
import au.com.woolworths.village.sdk.model.digitalpay.DigitalPayPaymentAgreementResponse

interface OpenApiPaymentAgreementApiRepository {
    fun create(
        paymentAgreementRequest: DigitalPayCreatePaymentAgreementRequest
    ): ApiResult<DigitalPayPaymentAgreementResponse>

    fun update(
        paymentToken: String,
        paymentAgreementRequest: DigitalPayUpdatePaymentAgreementRequest
    ): ApiResult<DigitalPayPaymentAgreementResponse>

    fun charge(
        chargeRequest: DigitalPayChargePaymentAgreementRequest
    ): ApiResult<DigitalPayPaymentAgreementResponse>

    fun delete(paymentToken: String): ApiResult<Void>
}
