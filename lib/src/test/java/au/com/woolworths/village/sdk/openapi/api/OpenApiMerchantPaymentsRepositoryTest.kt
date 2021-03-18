package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.data.aNewPaymentRequest
import au.com.woolworths.village.sdk.data.aNewTransactionRefund
import au.com.woolworths.village.sdk.matchers.*
import au.com.woolworths.village.sdk.openapi.OpenApiSdkFactory
import org.junit.Assert.assertThat
import org.junit.Test

class OpenApiMerchantPaymentsRepositoryTest {
    private val apiFactory = OpenApiSdkFactory()
    private val api = apiFactory.createMerchantApi()

    @Test
    fun shouldRetrievePaymentList() {
        val type = "ALL"
        val pageSize = 50
        val page = 2

        val result = api.payments.listPayments(type, page, pageSize)

        assertThat(result, isSuccessfulWith(merchantPaymentSummaries()))
    }

    @Test
    fun shouldCreateNewPaymentRequest() {
        val request = aNewPaymentRequest()

        val result = api.payments.createPaymentRequest(request)

        assertThat(result, isSuccessfulWith(paymentRequestCreated()))
    }

    @Test
    fun shouldRetrievePaymentRequestDetails() {
        val paymentRequestId = "a5bbfe1a-c1b9-11ea-924f-33c96a9759eb"

        val result = api.payments.getPaymentRequestDetailsBy(paymentRequestId)

        assertThat(result, isSuccessfulWith(merchantPaymentDetails()))
    }

    @Test
    fun shouldDeletePaymentRequest() {
        val paymentRequestId = "a5bbfe1a-c1b9-11ea-924f-33c96a9759eb"

        val result = api.payments.deletePaymentRequest(paymentRequestId)

        assertThat(result, isSuccessful())
    }

    @Test
    fun shouldRefundTransaction() {
        val transactionId = "a5bbfe1a-c1b9-11ea-924f-33c96a9759eb"

        val result = api.payments.refundTransaction(transactionId, aNewTransactionRefund())

        assertThat(result, isSuccessfulWith(merchantTransactionSummary()))
    }
}