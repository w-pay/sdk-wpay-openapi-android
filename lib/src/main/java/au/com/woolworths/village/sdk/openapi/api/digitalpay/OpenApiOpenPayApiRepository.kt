package au.com.woolworths.village.sdk.openapi.api.digitalpay

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.model.digitalpay.*

interface OpenApiOpenPayApiRepository {
    fun pay(paymentRequest: OpenPayPaymentRequest): ApiResult<OpenPayPaymentResponse>

    fun complete(completionRequest: OpenPayCompletionRequest): ApiResult<OpenPayCompletionResponse>

    fun voidPayment(voidRequest: OpenPayVoidRequest): ApiResult<OpenPayVoidResponse>

    fun refund(refundRequest: OpenPayRefundRequest): ApiResult<OpenPayRefundResponse>
}
