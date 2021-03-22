package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.TransactionHistoryResponse
import au.com.woolworths.village.sdk.openapi.dto.TransactionHistoryResponseTransactions
import java.math.BigDecimal
import java.util.*

class OpenApiTransactionHistoryResponse(
    private val transactionHistoryResponse: TransactionHistoryResponse
) : au.com.woolworths.village.sdk.model.walletmanagement.TransactionHistoryResponse {
    override val returned: BigDecimal
        get() = transactionHistoryResponse.returned
    override val total: BigDecimal
        get() = transactionHistoryResponse.total
    override val transactions: List<au.com.woolworths.village.sdk.model.walletmanagement.Transaction>
        get() = transactionHistoryResponse.transactions.map(::toTransactions)

    private fun toTransactions(transactionHistoryResponseTransactions: TransactionHistoryResponseTransactions?): au.com.woolworths.village.sdk.model.walletmanagement.Transaction {
        return OpenAiTransaction(transactionHistoryResponseTransactions!!)
    }
}

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