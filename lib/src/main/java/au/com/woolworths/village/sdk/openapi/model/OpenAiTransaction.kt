package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.TransactionHistoryResponseTransactions
import java.math.BigDecimal


class OpenAiTransaction(
    private val transactionHistoryResponseTransactions: TransactionHistoryResponseTransactions
) : au.com.woolworths.village.sdk.model.walletmanagement.Transaction {
    override val transactionType: au.com.woolworths.village.sdk.model.walletmanagement.ContainerTransactionType
        get() = au.com.woolworths.village.sdk.model.walletmanagement.ContainerTransactionType.valueOf(transactionHistoryResponseTransactions.transactionType.value)
    override val transactionRef: String
        get() = transactionHistoryResponseTransactions.transactionRef
    override val transactionTimestamp: String
        get() = transactionHistoryResponseTransactions.transactionTimestamp
    override val applicationRef: String
        get() = transactionHistoryResponseTransactions.applicationRef
    override val applicationName: String
        get() = transactionHistoryResponseTransactions.applicationName
    override val clientReference: String
        get() = transactionHistoryResponseTransactions.clientReference
    override val orderNumber: String
        get() = transactionHistoryResponseTransactions.orderNumber
    override val bin: String
        get() = transactionHistoryResponseTransactions.bin
    override val cardSuffix: String
        get() = transactionHistoryResponseTransactions.cardSuffix
    override val comment: String
        get() = transactionHistoryResponseTransactions.comment
    override val network: String
        get() = transactionHistoryResponseTransactions.network
    override val paymentInstrumentType: String
        get() = transactionHistoryResponseTransactions.paymentInstrumentType
    override val amount: BigDecimal
        get() = transactionHistoryResponseTransactions.amount
}