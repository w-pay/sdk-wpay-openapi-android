package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.TransactionSummary
import au.com.woolworths.village.sdk.openapi.dto.InstrumentAllocation
import au.com.woolworths.village.sdk.openapi.dto.InstrumentAllocationTransactions
import org.threeten.bp.OffsetDateTime
import java.math.BigDecimal
import java.util.*

class OpenApiUsedPaymentInstrument(
    private val instrument: InstrumentAllocation
) : TransactionSummary.UsedPaymentInstrument {
    override val paymentInstrumentId: String
        get() = instrument.paymentInstrumentId

    override val instrumentType: String
        get() = instrument.instrumentType

    override val transactions: List<TransactionSummary.UsedPaymentInstrumentTransaction>
        get() = instrument.transactions.map { OpenApiUsedPaymentInstrumentTransaction(it) }
}

class OpenApiUsedPaymentInstrumentTransaction(
    private val transaction: InstrumentAllocationTransactions
) : TransactionSummary.UsedPaymentInstrumentTransaction {
    override val amount: BigDecimal?
        get() = transaction.amount

    override val executionTime: OffsetDateTime?
        get() = transaction.executionTime

    override val paymentTransactionRef: String?
        get() = transaction.paymentTransactionRef

    override val status: TransactionSummary.PaymentStatus?
        get() = transaction.status?.let {
            TransactionSummary.PaymentStatus.valueOf(it.value.toUpperCase(Locale.ROOT))
        }

    override val type: TransactionSummary.PaymentType?
        get() = transaction.type?.let {
            TransactionSummary.PaymentType.valueOf(it.value.toUpperCase(Locale.ROOT))
        }
}