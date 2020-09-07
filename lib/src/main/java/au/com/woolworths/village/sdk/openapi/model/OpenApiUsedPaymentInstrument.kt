package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.CustomerTransactions
import au.com.woolworths.village.sdk.openapi.dto.CustomerTransactionSummaryAllOfInstruments
import java.math.BigDecimal

class OpenApiUsedPaymentInstrument(
    private val instrument: CustomerTransactionSummaryAllOfInstruments
) : CustomerTransactions.UsedPaymentInstrument {
    override val paymentInstrumentId: String
        get() = instrument.paymentInstrumentId

    override val amount: BigDecimal
        get() = instrument.amount

    override val paymentTransactionRef: String?
        get() = instrument.paymentTransactionRef
}