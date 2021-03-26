package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.digitalpay.*

class OpenApiCompletionsResponse(
        private val completionsSuccessResponse: au.com.woolworths.village.sdk.openapi.dto.CompletionsSuccessResponse
) : DigitalPayCompletionResponse {

    override val transactionReceipt: String
        get() = completionsSuccessResponse.transactionReceipt

    override val partialSuccess: Boolean
        get() = completionsSuccessResponse.partialSuccess

    override val completionResponses: List<DigitalPayTransactionCompletionResponse>
        get() = completionsSuccessResponse.completionResponses as List<DigitalPayTransactionCompletionResponse>
}