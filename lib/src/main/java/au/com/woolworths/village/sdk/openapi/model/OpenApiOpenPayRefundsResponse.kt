package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.digitalpay.OpenPayRefundResponse
import au.com.woolworths.village.sdk.model.digitalpay.OpenPayRefundTransactionResponse
import au.com.woolworths.village.sdk.openapi.dto.OpenpayRefundsSuccessResponse

class OpenApiOpenPayRefundsResponse(
        private val openpayRefundsSuccessResponse: OpenpayRefundsSuccessResponse
) : OpenPayRefundResponse {

    override val transactionReceipt: String
        get() = openpayRefundsSuccessResponse.transactionReceipt

    override val refundResponses: List<OpenPayRefundTransactionResponse>
        get() = openpayRefundsSuccessResponse.refundResponses as List<OpenPayRefundTransactionResponse>
}