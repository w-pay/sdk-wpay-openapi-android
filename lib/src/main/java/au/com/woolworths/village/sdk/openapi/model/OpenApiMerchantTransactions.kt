package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.*
import org.threeten.bp.OffsetDateTime
import java.math.BigDecimal
import java.util.*

class OpenApiMerchantTransactionSummaries(
    private val summaries: List<au.com.woolworths.village.sdk.openapi.dto.MerchantTransactionSummary>
) : MerchantTransactionSummaries {
    override val transactions: List<MerchantTransactionSummary>
        get() = summaries.map { OpenApiMerchantTransactionSummary(it) }
}

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

class OpenApiMerchantTransactionDetails(
    private val details: au.com.woolworths.village.sdk.openapi.dto.MerchantTransactionDetail
) : MerchantTransactionDetails {
    override val basket: Basket?
        get() = details.basket?.let { OpenApiBasket(it) }

    override val posPayload: PosPayload?
        get() = details.posPayload?.let { OpenApiPosPayload(it) }

    override val merchantPayload: MerchantPayload?
        get() = details.merchantPayload?.let { OpenApiMerchantPayload(it) }

    override val walletId: String
        get() = details.walletId

    override val transactionId: String
        get() = details.transactionId

    override val type: TransactionSummary.PaymentType
        get() = TransactionSummary.PaymentType.valueOf(details.type.value)

    override val executionTime: OffsetDateTime
        get() = details.executionTime

    override val status: TransactionSummary.PaymentStatus
        get() = TransactionSummary.PaymentStatus.valueOf(details.status.value)

    override val subTransactions: List<Any>?
        get() = details.subTransactions

    override val refundReason: String?
        get() = details.refundReason

    override val rollback: TransactionSummary.SummaryRollback?
        get() = details.rollback?.let {
            TransactionSummary.SummaryRollback.valueOf(it.value.toUpperCase(Locale.ROOT))
        }

    override val paymentRequestId: String
        get() = details.paymentRequestId

    override val merchantReferenceId: String
        get() = details.merchantReferenceId

    override val grossAmount: BigDecimal
        get() = details.grossAmount

    override val instruments: List<TransactionSummary.UsedPaymentInstrument>
        get() = details.instruments.map { OpenApiUsedPaymentInstrument(it) }

    override val clientReference: String?
        get() = details.clientReference
}