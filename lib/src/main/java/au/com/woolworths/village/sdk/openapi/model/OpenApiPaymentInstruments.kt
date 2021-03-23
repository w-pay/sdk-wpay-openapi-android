package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.Wallet
import au.com.woolworths.village.sdk.model.*
import au.com.woolworths.village.sdk.openapi.dto.GetCustomerPaymentInstrumentsResultsDataEverydayPay
import org.threeten.bp.OffsetDateTime
import java.net.URL
import java.util.*

class OpenApiWalletContents(
    creditCards: List<au.com.woolworths.village.sdk.openapi.dto.CreditCard>,
    giftCards: List<au.com.woolworths.village.sdk.openapi.dto.GiftCard>,
    private val data: GetCustomerPaymentInstrumentsResultsDataEverydayPay?
) : OpenApiPaymentInstruments(creditCards, giftCards, Wallet.MERCHANT), WalletContents {
    override val everydayPay: PaymentInstruments?
        get() = data?.let {
            OpenApiPaymentInstruments(
                it.creditCards,
                it.giftCards,
                Wallet.EVERYDAY_PAY
            )
        }
}

open class OpenApiPaymentInstruments(
    private val creditCardsData: List<au.com.woolworths.village.sdk.openapi.dto.CreditCard>,
    private val giftCardsData: List<au.com.woolworths.village.sdk.openapi.dto.GiftCard>,
    private val wallet: Wallet
) : PaymentInstruments {
    override val creditCards: List<CreditCard>
        get() = creditCardsData.map { OpenApiCreditCard(it, wallet) }

    override val giftCards: List<GiftCard>
        get() = giftCardsData.map { OpenApiGiftCard(it, wallet) }
}

class OpenApiCreditCard(
    private val card: au.com.woolworths.village.sdk.openapi.dto.CreditCard,
    private val aWallet: Wallet
) : CreditCard {
    override val paymentInstrumentId: String
        get() = card.paymentInstrumentId

    override val paymentToken: String
        get() = card.paymentToken

    override val primary: Boolean
        get() = card.primary

    override val status: PaymentInstrument.InstrumentStatus
        get() = PaymentInstrument.InstrumentStatus.valueOf(card.status.value.toUpperCase(Locale.ROOT))

    override val wallet: Wallet
        get() = aWallet

    override val cardName: String
        get() = card.cardName

    override val cvvValidated: Boolean
        get() = card.cvvValidated

    override val expired: Boolean
        get() = card.expired

    override val expiryMonth: String
        get() = card.expiryMonth

    override val expiryYear: String
        get() = card.expiryYear

    override val requiresCVV: Boolean
        get() = card.requiresCVV

    override val scheme: String
        get() = card.scheme

    override val stepUp: CreditCardStepUp
        get() = OpenApiCreditCardStepUp(card.stepUp)

    override val updateURL: URL
        get() = URL(card.updateURL)

    override val allowed: Boolean
        get() = card.allowed

    override val cardSuffix: String
        get() = card.cardSuffix

    override val lastUpdated: OffsetDateTime
        get() = card.lastUpdated

    override val lastUsed: OffsetDateTime?
        get() = card.lastUsed
}

class OpenApiGiftCard(
    private val card: au.com.woolworths.village.sdk.openapi.dto.GiftCard,
    private val aWallet: Wallet
) : GiftCard {
    override val programName: String
        get() = card.programName

    override val allowed: Boolean
        get() = card.allowed

    override val cardSuffix: String
        get() = card.cardSuffix

    override val lastUpdated: OffsetDateTime
        get() = card.lastUpdated

    override val lastUsed: OffsetDateTime?
        get() = card.lastUsed

    override val paymentInstrumentId: String
        get() = card.paymentInstrumentId

    override val paymentToken: String
        get() = card.paymentToken

    override val primary: Boolean
        get() = card.primary

    override val status: PaymentInstrument.InstrumentStatus
        get() = PaymentInstrument.InstrumentStatus.valueOf(card.status.value)

    override val wallet: Wallet
        get() = aWallet

    override val stepUp: GiftCardStepUp?
        get() = card.stepUp?.let { OpenApiGiftCardStepUp(it) }
}

class OpenApiCreditCardStepUp(
    private val stepUp: au.com.woolworths.village.sdk.openapi.dto.CreditCardStepUp
) : CreditCardStepUp {
    override val type: String
        get() = stepUp.type

    override val mandatory: Boolean
        get() = stepUp.mandatory

    override val url: URL
        get() = URL(stepUp.url)
}

class OpenApiGiftCardStepUp(
    private val stepUp: au.com.woolworths.village.sdk.openapi.dto.GetCustomerPaymentInstrumentResultDataPaymentInstrumentDetailStepUp
) : GiftCardStepUp {
    override val type: String
        get() = stepUp.type

    override val mandatory: Boolean
        get() = stepUp.mandatory
}