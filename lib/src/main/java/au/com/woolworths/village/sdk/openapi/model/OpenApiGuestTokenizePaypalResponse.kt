package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.*
import java.util.*

class OpenApiGuestTokenizePaypalResponse(
    private val tokenizeGooglePayResponse: GuestTokenizePaypalResponse
)  : au.com.woolworths.village.sdk.model.TokenizePaypalResponse {
    override val payPal: au.com.woolworths.village.sdk.model.PaypalDetails
        get() = OpenApiGuestPaypalDetails(tokenizeGooglePayResponse.payPal)
}