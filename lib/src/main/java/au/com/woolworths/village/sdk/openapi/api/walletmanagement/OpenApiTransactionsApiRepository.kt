package au.com.woolworths.village.sdk.openapi.api.walletmanagement

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.RequestHeadersFactory
import au.com.woolworths.village.sdk.VillageOptions
import au.com.woolworths.village.sdk.X_API_KEY
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.dto.TransactionHistoryRequest
import au.com.woolworths.village.sdk.openapi.model.OpenApiTransactionHistoryResponse

class OpenApiTransactionsApiRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions
) : OpenApiClientFactory(requestHeadersFactory, options),
    au.com.woolworths.village.sdk.api.walletmanagement.TransactionsApiRepository  {
    override fun history(
        transactionHistoryRequest: au.com.woolworths.village.sdk.model.walletmanagement.TransactionHistoryRequest
    ): ApiResult<au.com.woolworths.village.sdk.model.walletmanagement.TransactionHistoryResponse> {
        return makeCall {
            val api = createWalletManagementApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.TransactionHistoryRequest()
            body.transactionTypes = transactionHistoryRequest.transactionTypes.map(::toTransactionTypes)
            body.paymentInstrumentIds = transactionHistoryRequest.paymentInstrumentIds
            body.clientReference = transactionHistoryRequest.clientReference
            body.transactionRef = transactionHistoryRequest.transactionRef
            body.orderNumber = transactionHistoryRequest.orderNumber
            body.startDate = transactionHistoryRequest.startDate
            body.endDate = transactionHistoryRequest.endDate
            body.maxRecords = transactionHistoryRequest.maxRecords

            val response = api.transactionsPost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                body,
                "",
                "",
                "",
                getDefaultHeader(api.apiClient, X_EVERYDAY_PAY_WALLET)
            )
            return@makeCall ApiResult.Success(
                OpenApiTransactionHistoryResponse(
                    response
                )
            )
        }
    }

    private fun toTransactionTypes(transactionType: au.com.woolworths.village.sdk.model.walletmanagement.TransactionClass): TransactionHistoryRequest.TransactionTypesEnum {
        return TransactionHistoryRequest.TransactionTypesEnum.valueOf(transactionType.toString())
    }
}
