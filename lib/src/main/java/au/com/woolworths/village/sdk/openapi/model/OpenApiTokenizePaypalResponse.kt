package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.TokenizePaypalResponse
import java.util.*

class OpenApiTokenizePaypalResponse(
    private val tokenizeGooglePayResponse: TokenizePaypalResponse
) : au.com.woolworths.village.sdk.model.TokenizePaypalResponse {
    override val payPal: au.com.woolworths.village.sdk.model.PaypalDetails
        get() = OpenApiPaypalDetails(tokenizeGooglePayResponse.payPal)
}