package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.RequestHeadersFactory
import au.com.woolworths.village.sdk.VillageOptions
import au.com.woolworths.village.sdk.X_API_KEY
import au.com.woolworths.village.sdk.api.MerchantTransactionsRepository
import au.com.woolworths.village.sdk.model.MerchantTransactionDetails
import au.com.woolworths.village.sdk.model.MerchantTransactionSummaries
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.model.OpenApiMerchantTransactionDetails
import au.com.woolworths.village.sdk.openapi.model.OpenApiMerchantTransactionSummaries
import org.threeten.bp.OffsetDateTime

class OpenApiMerchantTransactionsRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions
) : OpenApiClientFactory(requestHeadersFactory, options), MerchantTransactionsRepository {
    override fun list(
        page: Int?,
        pageSize: Int?,
        endTime: OffsetDateTime?,
        startTime: OffsetDateTime?
    ): ApiResult<MerchantTransactionSummaries> {
        return makeCall {
            val api = createMerchantApi()

            val data = api.getMerchantTransactions(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                "",
                "",
                "",
                startTime,
                endTime,
                pageSize,
                page
            ).data

            ApiResult.Success(OpenApiMerchantTransactionSummaries(data.transactions))
        }
    }

    override fun getById(transactionId: String): ApiResult<MerchantTransactionDetails> {
        return makeCall {
            val api = createMerchantApi()

            val data = api.getMerchantTransactionDetails(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                transactionId,
                "",
                "",
                ""
            ).data

            ApiResult.Success(OpenApiMerchantTransactionDetails(data))
        }
    }
}