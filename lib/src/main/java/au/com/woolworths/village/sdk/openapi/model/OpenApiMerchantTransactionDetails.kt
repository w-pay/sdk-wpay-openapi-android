package au.com.woolworths.village.sdk.openapi.model

import org.threeten.bp.OffsetDateTime
import java.math.BigDecimal
import java.util.*
import au.com.woolworths.village.sdk.model.*


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