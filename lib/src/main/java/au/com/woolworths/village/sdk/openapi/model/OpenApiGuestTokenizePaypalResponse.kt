package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.*
import java.util.*

class OpenApiGuestTokenizePaypalResponse(
    private val tokenizeGooglePayResponse: GuestTokenizePaypalResponse
)  : au.com.woolworths.village.sdk.model.TokenizePaypalResponse {
    override val payPal: au.com.woolworths.village.sdk.model.PaypalDetails
        get() = OpenApiGuestPaypalDetails(tokenizeGooglePayResponse.payPal)
}

class OpenApiGuestPaypalDetails(
    private val guestTokenizePaypalResponsePayPal: GuestTokenizePaypalResponsePayPal
) : au.com.woolworths.village.sdk.model.PaypalDetails{
    override val paymentInstrumentId: String
        get() = guestTokenizePaypalResponsePayPal.paymentInstrumentId
    override val status: au.com.woolworths.village.sdk.model.PaypalStatusEnum
        get() = au.com.woolworths.village.sdk.model.PaypalStatusEnum.valueOf(guestTokenizePaypalResponsePayPal.status.value)
    override val allowed: Boolean
        get() = guestTokenizePaypalResponsePayPal.allowed
    override val lastUpdated: String
        get() = Date().toString()
    override val lastUsed: String
        get() = Date().toString()
    override val primary: Boolean
        get() = false
    override val payPalId: String
        get() = ""
    override val customerId: String
        get() = ""
}