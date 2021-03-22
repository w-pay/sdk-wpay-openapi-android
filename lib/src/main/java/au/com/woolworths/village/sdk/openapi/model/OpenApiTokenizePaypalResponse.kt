package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.TokenizePaypalResponse
import au.com.woolworths.village.sdk.openapi.dto.TokenizePaypalResponsePayPal
import java.util.*

class OpenApiTokenizePaypalResponse(
    private val tokenizeGooglePayResponse: TokenizePaypalResponse
) : au.com.woolworths.village.sdk.model.TokenizePaypalResponse {
    override val payPal: au.com.woolworths.village.sdk.model.PaypalDetails
        get() = OpenApiPaypalDetails(tokenizeGooglePayResponse.payPal)
}

class OpenApiPaypalDetails(
    private val tokenizePaypalResponsePayPal: TokenizePaypalResponsePayPal
) : au.com.woolworths.village.sdk.model.PaypalDetails{
    override val paymentInstrumentId: String
        get() = tokenizePaypalResponsePayPal.paymentInstrumentId
    override val status: au.com.woolworths.village.sdk.model.PaypalStatusEnum
        get() = au.com.woolworths.village.sdk.model.PaypalStatusEnum.valueOf(tokenizePaypalResponsePayPal.status.value)
    override val lastUpdated: String
        get() = tokenizePaypalResponsePayPal.lastUpdated
    override val lastUsed: String
        get() = tokenizePaypalResponsePayPal.lastUsed
    override val primary: Boolean
        get() = tokenizePaypalResponsePayPal.primary
    override val allowed: Boolean
        get() = tokenizePaypalResponsePayPal.allowed
    override val payPalId: String
        get() = tokenizePaypalResponsePayPal.payPalId
    override val customerId: String
        get() = tokenizePaypalResponsePayPal.customerId
}