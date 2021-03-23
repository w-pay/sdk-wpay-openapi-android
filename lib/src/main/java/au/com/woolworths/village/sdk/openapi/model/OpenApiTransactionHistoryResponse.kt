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
        get() = transactionHistoryResponse.transactions.map { OpenAiTransaction(it) }
}