package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.TokenizeApplePayResponse
import java.util.*

class OpenApiTokenizeApplePayResponse(
    private val tokenizeApplePayResponse: TokenizeApplePayResponse
) : au.com.woolworths.village.sdk.model.walletmanagement.TokenizeApplePayResponse {
    override val paymentInstrumentId: String
        get() = tokenizeApplePayResponse.paymentInstrumentId
    override val stepUpToken: String
        get() = tokenizeApplePayResponse.stepUpToken
}