package au.com.woolworths.village.sdk.openapi.api.walletmanagement

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.model.walletmanagement.TransactionHistoryRequest
import au.com.woolworths.village.sdk.model.walletmanagement.TransactionHistoryResponse

interface OpenApiTransactionsApiRepository {
    fun history(
        transactionHistoryRequest: TransactionHistoryRequest
    ): ApiResult<TransactionHistoryResponse>
}
