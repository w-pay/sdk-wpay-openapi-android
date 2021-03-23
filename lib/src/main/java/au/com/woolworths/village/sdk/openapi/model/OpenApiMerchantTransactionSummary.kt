package au.com.woolworths.village.sdk.openapi.model

import org.threeten.bp.OffsetDateTime
import java.math.BigDecimal
import java.util.*
import au.com.woolworths.village.sdk.model.*


class OpenApiMerchantTransactionSummary(
    private val summary: au.com.woolworths.village.sdk.openapi.dto.MerchantTransactionSummary
) : MerchantTransactionSummary {
    override val walletId: String
        get() = summary.walletId

    override val transactionId: String
        get() = summary.transactionId

    override val type: TransactionSummary.PaymentType
        get() = TransactionSummary.PaymentType.valueOf(summary.type.value.toUpperCase(Locale.ROOT))

    override val executionTime: OffsetDateTime
        get() = summary.executionTime

    override val status: TransactionSummary.PaymentStatus
        get() = TransactionSummary.PaymentStatus.valueOf(summary.status.value.toUpperCase(Locale.ROOT))

    override val subTransactions: List<Any>?
        get() = summary.subTransactions

    override val refundReason: String?
        get() = summary.refundReason

    override val rollback: TransactionSummary.SummaryRollback?
        get() = summary.rollback?.let {
            TransactionSummary.SummaryRollback.valueOf(it.value.toUpperCase(Locale.ROOT))
        }

    override val paymentRequestId: String
        get() = summary.paymentRequestId

    override val merchantReferenceId: String
        get() = summary.merchantReferenceId

    override val grossAmount: BigDecimal
        get() = summary.grossAmount

    override val instruments: List<TransactionSummary.UsedPaymentInstrument>
        get() = summary.instruments.map { OpenApiUsedPaymentInstrument(it) }

    override val clientReference: String?
        get() = summary.clientReference
}