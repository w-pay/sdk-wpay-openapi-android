package au.com.woolworths.village.sdk.openapi.api.walletmanagement

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.openapi.ClientOptions
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.dto.TransactionHistoryRequest
import au.com.woolworths.village.sdk.openapi.model.OpenApiTransactionHistoryResponse

class OpenApiTransactionsApiRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions,
    clientOptions: ClientOptions = ClientOptions()
) : OpenApiClientFactory(requestHeadersFactory, options, clientOptions),
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
                getDefaultHeader(api.apiClient, AUTHORISATION),
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
