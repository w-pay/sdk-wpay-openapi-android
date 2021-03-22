package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.TokenizeGooglePayResponse
import java.util.*

class OpenApiTokenizeGooglePayResponse(
    private val tokenizeGooglePayResponse: TokenizeGooglePayResponse
) : au.com.woolworths.village.sdk.model.walletmanagement.TokenizeGooglePayResponse {
    override val paymentToken: String
        get() = tokenizeGooglePayResponse.paymentToken
}