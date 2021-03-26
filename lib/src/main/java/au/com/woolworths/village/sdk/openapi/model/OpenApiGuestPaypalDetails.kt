package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.GuestTokenizePaypalResponsePayPal
import java.util.*


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