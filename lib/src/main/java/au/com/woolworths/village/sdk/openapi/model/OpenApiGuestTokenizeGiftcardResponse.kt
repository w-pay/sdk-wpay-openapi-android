package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.walletmanagement.TokenizedGiftCard
import au.com.woolworths.village.sdk.openapi.dto.*
import java.math.BigDecimal
import java.util.*

class OpenApiGuestTokenizeGiftcardResponse(
    private val tokenizeGiftcardResponse: GuestTokenizeGiftcardResponse
) : au.com.woolworths.village.sdk.model.walletmanagement.TokenizeGiftcardResponse {
    override val giftCard: au.com.woolworths.village.sdk.model.walletmanagement.TokenizedGiftCard
        get() = toGiftCard(tokenizeGiftcardResponse.giftCard)

    override val balance: BigDecimal
        get() = tokenizeGiftcardResponse.balance
    override val expiryDay: String
        get() = tokenizeGiftcardResponse.expiryDay
    override val expiryMonth: String
        get() = tokenizeGiftcardResponse.expiryMonth
    override val expiryYear: String
        get() = tokenizeGiftcardResponse.expiryYear
    override val expired: Boolean
        get() = tokenizeGiftcardResponse.expired

    fun toGiftCard(card: GuestTokenizeGiftcardResponseGiftCard): au.com.woolworths.village.sdk.model.walletmanagement.TokenizedGiftCard {
        return OpenApiGuestTokenizedGiftCard(card)
    }
}


class OpenApiGuestTokenizedGiftCard(
    private val card: GuestTokenizeGiftcardResponseGiftCard
) : au.com.woolworths.village.sdk.model.walletmanagement.TokenizedGiftCard {

    override val paymentInstrumentId: String
        get() = card.paymentInstrumentId.toString()
    override val status: au.com.woolworths.village.sdk.model.walletmanagement.Status
        get() = au.com.woolworths.village.sdk.model.walletmanagement.Status.valueOf(card.status.value)
    override val lastUpdated: String
        get() = Date().toString()
    override val lastUsed: String
        get() = Date().toString()
    override val allowed: Boolean
        get() = card.allowed
    override val primary: Boolean
        get() = false
    override val programName: String
        get() = card.programName
    override val cardSuffix: String
        get() = card.cardSuffix
}
