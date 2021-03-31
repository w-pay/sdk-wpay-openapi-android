package au.com.woolworths.village.sdk.data

import au.com.woolworths.village.sdk.Wallet
import au.com.woolworths.village.sdk.model.PaymentInstrument
import au.com.woolworths.village.sdk.model.PaymentInstrumentAddition
import org.threeten.bp.OffsetDateTime

fun aSelectedPaymentInstrument(): PaymentInstrument = TestPaymentInstrument()
fun aNewPaymentInstrument(): PaymentInstrumentAddition = TestPaymentInstrumentAddition()

class TestPaymentInstrument : PaymentInstrument {
    override val allowed: Boolean
        get() = true

    override val lastUpdated: OffsetDateTime
        get() = OffsetDateTime.now()

    override val lastUsed: OffsetDateTime
        get() = OffsetDateTime.now()

    override val paymentInstrumentId: String
        get() = "abc123"

    override val paymentToken: String
        get() = "def123fgh"

    override val primary: Boolean
        get() = true

    override val status: PaymentInstrument.InstrumentStatus
        get() = PaymentInstrument.InstrumentStatus.VERIFIED
}

class TestPaymentInstrumentAddition : PaymentInstrumentAddition {
    override val clientReference: String
        get() = "abc123"

    override val wallet: Wallet
        get() = Wallet.EVERYDAY_PAY
}