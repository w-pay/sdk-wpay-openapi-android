package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.digitalpay.*

class OpenApiRefundsResponse(
        private val refundsSuccessResponse: au.com.woolworths.village.sdk.openapi.dto.RefundsSuccessResponse
) : DigitalPayRefundResponse {

    override val transactionReceipt: String
        get() = refundsSuccessResponse.transactionReceipt

    override val partialSuccess: Boolean
        get() = refundsSuccessResponse.partialSuccess

    override val refundResponses: List<DigitalPayRefundTransactionResponse>
        get() = refundsSuccessResponse.refundResponses as List<DigitalPayRefundTransactionResponse>
}