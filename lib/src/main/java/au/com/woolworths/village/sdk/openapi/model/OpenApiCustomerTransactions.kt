package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.*
import au.com.woolworths.village.sdk.openapi.dto.CustomerTransactionDetail
import au.com.woolworths.village.sdk.openapi.dto.CustomerTransactionSummary
import org.threeten.bp.OffsetDateTime
import java.math.BigDecimal

class OpenApiCustomerTransactionSummaries(
    private val summaries: List<CustomerTransactionSummary>
): CustomerTransactionSummaries {
    override val transactions: List<au.com.woolworths.village.sdk.model.CustomerTransactionSummary>
        get() = summaries.map { OpenApiCustomerTransactionSummary(it) }
}

class OpenApiCustomerTransactionSummary(
    private val summary: CustomerTransactionSummary
): au.com.woolworths.village.sdk.model.CustomerTransactionSummary {
    override val merchantId: String
        get() = summary.merchantId

    override val instruments: List<CustomerTransactions.UsedPaymentInstrument>
        get() = summary.instruments.map { OpenApiUsedPaymentInstrument(it) }

    override val transactionId: String
        get() = summary.transactionId

    override val type: TransactionSummary.PaymentType
        get() = TransactionSummary.PaymentType.valueOf(summary.type.value)

    override val executionTime: OffsetDateTime
        get() = summary.executionTime

    override val status: TransactionSummary.PaymentStatus
        get() = TransactionSummary.PaymentStatus.valueOf(summary.status.value)

    override val statusDetail: Any?
        get() = summary.statusDetail

    override val refundReason: String?
        get() = summary.refundReason

    override val paymentRequestId: String
        get() = summary.paymentRequestId

    override val merchantReferenceId: String
        get() = summary.merchantReferenceId

    override val grossAmount: BigDecimal
        get() = summary.grossAmount

    override val clientReference: String?
        get() = summary.clientReference
}

class OpenApiCustomerTransactionDetails(
    private val details: CustomerTransactionDetail
): CustomerTransactionDetails {
    override val basket: Basket?
        get() = details.basket?.let { OpenApiBasket(it) }

    override val merchantId: String
        get() = details.merchantId

    override val instruments: List<CustomerTransactions.UsedPaymentInstrument>
        get() = details.instruments.map { OpenApiUsedPaymentInstrument(it) }

    override val transactionId: String
        get() = details.transactionId

    override val type: TransactionSummary.PaymentType
        get() = TransactionSummary.PaymentType.valueOf(details.type.value)

    override val executionTime: OffsetDateTime
        get() = details.executionTime

    override val status: TransactionSummary.PaymentStatus
        get() = TransactionSummary.PaymentStatus.valueOf(details.status.value)

    override val statusDetail: Any?
        get() = details.statusDetail

    override val refundReason: String?
        get() = details.refundReason

    override val paymentRequestId: String
        get() = details.paymentRequestId

    override val merchantReferenceId: String
        get() = details.merchantReferenceId

    override val grossAmount: BigDecimal
        get() = details.grossAmount

    override val clientReference: String?
       get() = details.clientReference
}