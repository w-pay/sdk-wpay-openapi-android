package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.RequestHeadersFactory
import au.com.woolworths.village.sdk.VillageOptions
import au.com.woolworths.village.sdk.X_API_KEY
import au.com.woolworths.village.sdk.api.CustomerTransactionsRepository
import au.com.woolworths.village.sdk.model.CustomerTransactionDetails
import au.com.woolworths.village.sdk.model.CustomerTransactionSummaries
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.model.OpenApiCustomerTransactionDetails
import au.com.woolworths.village.sdk.openapi.model.OpenApiCustomerTransactionSummaries
import org.threeten.bp.OffsetDateTime

class OpenApiCustomerTransactionsRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions
) : OpenApiClientFactory(requestHeadersFactory, options), CustomerTransactionsRepository {
    override fun list(
        paymentRequestId: String?,
        page: Int?,
        pageSize: Int?,
        endTime: OffsetDateTime?,
        startTime: OffsetDateTime?
    ): ApiResult<CustomerTransactionSummaries> {
        return makeCall {
            val api = createCustomerApi()

            val data = api.getCustomerTransactions(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                "",
                "",
                "",
                paymentRequestId,
                startTime,
                endTime,
                pageSize,
                page
            ).data

            ApiResult.Success(OpenApiCustomerTransactionSummaries(data.transactions))
        }
    }

    override fun getById(transactionId: String): ApiResult<CustomerTransactionDetails> {
        return makeCall {
            val api = createCustomerApi()

            val data = api.getCustomerTransactionDetails(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                transactionId,
                "",
                "",
                ""
            ).data

            ApiResult.Success(OpenApiCustomerTransactionDetails(data))
        }
    }
}