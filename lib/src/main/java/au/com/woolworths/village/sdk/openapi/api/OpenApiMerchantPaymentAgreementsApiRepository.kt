package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.model.ChargePaymentAgreementRequest
import au.com.woolworths.village.sdk.model.digitalpay.DigitalPayPaymentAgreementResponse

interface OpenApiMerchantPaymentAgreementsApiRepository {
    fun charge(
        paymentToken: String,
        chargePaymentAgreementRequest: ChargePaymentAgreementRequest
    ): ApiResult<DigitalPayPaymentAgreementResponse>

    fun delete(paymentToken: String): ApiResult<Void>
}
