package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.walletmanagement.Transaction
import au.com.woolworths.village.sdk.openapi.dto.TransactionHistoryResponse
import java.math.BigDecimal

class OpenApiTransactionHistoryResponse(
        private val transactionHistoryResponse: TransactionHistoryResponse
) : au.com.woolworths.village.sdk.model.walletmanagement.TransactionHistoryResponse {

    override val returned: BigDecimal
        get() = transactionHistoryResponse.returned

    override val total: BigDecimal
        get() = transactionHistoryResponse.total

    override val transactions: List<Transaction>
        get() = transactionHistoryResponse.transactions as List<Transaction>
}