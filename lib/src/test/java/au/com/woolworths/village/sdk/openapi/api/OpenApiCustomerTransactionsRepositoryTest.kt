package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.matchers.customerTransactionDetails
import au.com.woolworths.village.sdk.matchers.customerTransactionSummaries
import au.com.woolworths.village.sdk.matchers.isSuccessfulWith
import au.com.woolworths.village.sdk.openapi.OpenApiSdkFactory
import org.junit.Assert.assertThat
import org.junit.Test
import org.threeten.bp.OffsetDateTime

class OpenApiCustomerTransactionsRepositoryTest {
    private val apiFactory = OpenApiSdkFactory()
    private val api = apiFactory.createCustomerApi()

    @Test
    fun shouldRetrieveTransactions() {
        val paymentRequestId = "75ba5b0b-7e5d-47fe-9508-29ca69fdb1d5"
        val startTime = OffsetDateTime.parse("2017-11-06T19:38:09.890+11:00")
        val endTime = OffsetDateTime.parse("2017-11-06T19:38:09.890+11:00")
        val pageSize = 20
        val page = 2

        val result = api.transactions.list(paymentRequestId, page, pageSize, endTime, startTime)

        assertThat(result, isSuccessfulWith(customerTransactionSummaries()))
    }

    @Test
    fun shouldRetrieveTransactionDetails() {
        val transactionId = "75ba5b0b-7e5d-47fe-9508-29ca69fdb1d5"

        val result = api.transactions.getById(transactionId)

        assertThat(result, isSuccessfulWith(customerTransactionDetails()))
    }
}