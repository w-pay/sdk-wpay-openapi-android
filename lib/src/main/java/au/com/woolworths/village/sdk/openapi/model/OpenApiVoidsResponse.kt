package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.digitalpay.*

class OpenApiVoidsResponse(
        private val voidsSuccessResponse: au.com.woolworths.village.sdk.openapi.dto.VoidsSuccessResponse
) : DigitalPayVoidResponse {

    override val transactionReceipt: String
        get() = voidsSuccessResponse.transactionReceipt

    override val partialSuccess: Boolean
        get() = voidsSuccessResponse.partialSuccess

    override val voidResponses: List<DigitalPayVoidTransactionResponse>
        get() = voidsSuccessResponse.voidResponses as List<DigitalPayVoidTransactionResponse>
}