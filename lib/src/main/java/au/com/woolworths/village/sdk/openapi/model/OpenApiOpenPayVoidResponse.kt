package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.digitalpay.OpenPayVoidResponse
import au.com.woolworths.village.sdk.model.digitalpay.OpenPayVoidTransactionResponse
import au.com.woolworths.village.sdk.openapi.dto.OpenpayVoidsSuccessResponse

class OpenApiOpenPayVoidResponse(
        private val openpayVoidsSuccessResponse: OpenpayVoidsSuccessResponse
) : OpenPayVoidResponse {

    override val transactionReceipt: String
        get() = openpayVoidsSuccessResponse.transactionReceipt

    override val voidResponses: List<OpenPayVoidTransactionResponse>
        get() = openpayVoidsSuccessResponse.voidResponses as List<OpenPayVoidTransactionResponse>
}