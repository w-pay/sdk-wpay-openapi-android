package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.matchers.isSuccessfulWith
import au.com.woolworths.village.sdk.matchers.merchantTransactionDetails
import au.com.woolworths.village.sdk.matchers.merchantTransactionSummaries
import au.com.woolworths.village.sdk.openapi.OpenApiSdkFactory
import org.junit.Assert.assertThat
import org.junit.Test
import org.threeten.bp.OffsetDateTime

class OpenApiMerchantTransactionsRepositoryTest {
    private val apiFactory = OpenApiSdkFactory()
    private val api = apiFactory.createMerchantApi()

    @Test
    fun shouldRetrieveTransactions() {
        val startTime = OffsetDateTime.parse("2017-11-06T19:38:09.890+11:00")
        val endTime = OffsetDateTime.parse("2017-11-06T19:38:09.890+11:00")
        val pageSize = 20
        val page = 2

        val result = api.transactions.list(page, pageSize, endTime, startTime)

        assertThat(result, isSuccessfulWith(merchantTransactionSummaries()))
    }

    @Test
    fun shouldRetrieveTransactionDetails() {
        val transactionId = "a5bbfe1a-c1b9-11ea-924f-33c96a9759eb"

        val result = api.transactions.getById(transactionId)

        assertThat(result, isSuccessfulWith(merchantTransactionDetails()))
    }
}