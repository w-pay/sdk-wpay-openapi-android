package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.GuestTokenizeGiftcardResponseGiftCard
import java.util.*

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