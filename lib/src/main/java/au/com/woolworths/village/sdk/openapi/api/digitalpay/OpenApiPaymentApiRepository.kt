package au.com.woolworths.village.sdk.openapi.api.digitalpay

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.model.digitalpay.*

interface OpenApiPaymentApiRepository {
    fun pay(paymentRequest: DigitalPayPaymentRequest): ApiResult<DigitalPayPaymentResponse>

    fun guestPayment(paymentRequest: DigitalPayPaymentRequest): ApiResult<DigitalPayPaymentResponse>

    fun complete(
        completionRequest: DigitalPayCompletionRequest
    ): ApiResult<DigitalPayCompletionResponse>

    fun voidPayment(voidRequest: DigitalPayVoidRequest): ApiResult<DigitalPayVoidResponse>

    fun refund(refundRequest: DigitalPayRefundRequest): ApiResult<DigitalPayRefundResponse>
}
