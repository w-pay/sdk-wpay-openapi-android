package au.com.woolworths.village.sdk.openapi.api.walletmanagement

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.api.walletmanagement.TransactionsApiRepository
import au.com.woolworths.village.sdk.model.walletmanagement.TransactionHistoryRequest
import au.com.woolworths.village.sdk.model.walletmanagement.TransactionHistoryResponse
import au.com.woolworths.village.sdk.openapi.dto.TransactionHistoryRequest.TransactionTypesEnum
import au.com.woolworths.village.sdk.openapi.model.OpenApiTransactionHistoryResponse
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory

class OpenApiTransactionsApiRepository (
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions
) : OpenApiClientFactory(requestHeadersFactory, options), TransactionsApiRepository {

    override fun history(transactionHistoryRequest: TransactionHistoryRequest): ApiResult<TransactionHistoryResponse> {
        return makeCall {
            val api = createWalletManagementApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.TransactionHistoryRequest()
            body.clientReference = transactionHistoryRequest.clientReference
            body.endDate = transactionHistoryRequest.endDate
            body.maxRecords = transactionHistoryRequest.maxRecords
            body.orderNumber = transactionHistoryRequest.orderNumber
            body.paymentInstrumentIds = transactionHistoryRequest.paymentInstrumentIds
            body.startDate = transactionHistoryRequest.startDate
            body.transactionRef = transactionHistoryRequest.transactionRef
            body.transactionTypes = transactionHistoryRequest.transactionTypes as List<TransactionTypesEnum>

            val response = api.transactionsPost(
                "",
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                body,
                "",
                "",
                "",
                "")

            return@makeCall ApiResult.Success(OpenApiTransactionHistoryResponse(response))
        }
    }
}