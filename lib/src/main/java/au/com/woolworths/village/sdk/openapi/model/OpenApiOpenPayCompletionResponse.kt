package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.digitalpay.OpenPayCompletionResponse
import au.com.woolworths.village.sdk.model.digitalpay.OpenPayTransactionCompletionResponse
import au.com.woolworths.village.sdk.openapi.dto.OpenpayCompletionsSuccessResponse

class OpenApiOpenPayCompletionResponse(
        private val openpayCompletionsSuccessResponse: OpenpayCompletionsSuccessResponse
) : OpenPayCompletionResponse {

    override val transactionReceipt: String
        get() = openpayCompletionsSuccessResponse.transactionReceipt

    override val completionResponses: List<OpenPayTransactionCompletionResponse>
        get() = openpayCompletionsSuccessResponse.completionResponses as List<OpenPayTransactionCompletionResponse>
}