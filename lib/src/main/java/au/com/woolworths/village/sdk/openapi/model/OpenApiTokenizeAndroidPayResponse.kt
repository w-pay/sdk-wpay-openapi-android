package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.TokenizeAndroidPayResponse
import java.util.*

class OpenApiTokenizeAndroidPayResponse(
    private val tokenizeAndroidPayResponse: TokenizeAndroidPayResponse
) : au.com.woolworths.village.sdk.model.walletmanagement.TokenizeAndroidPayResponse {
    override val paymentInstrumentId: String
        get() = tokenizeAndroidPayResponse.paymentInstrumentId
    override val stepUpToken: String
        get() = tokenizeAndroidPayResponse.stepUpToken
}