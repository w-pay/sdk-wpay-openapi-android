package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.matchers.customerPaymentRequest
import au.com.woolworths.village.sdk.matchers.customerTransactionSummary
import au.com.woolworths.village.sdk.matchers.isSuccessfulWith
import au.com.woolworths.village.sdk.openapi.OpenApiSdkFactory
import org.junit.Assert.assertThat
import org.junit.Test

class OpenApiCustomerPaymentRequestsRepositoryTest {
    private val apiFactory = OpenApiSdkFactory()
    private val api = apiFactory.createCustomerApi()

    @Test
    fun shouldRetrievePaymentRequestDetailsByQRCode() {
        val qrCodeId = "75ba5b0b-7e5d-47fe-9508-29ca69fdb1d5"

        val result = api.paymentRequests.getByQRCodeId(qrCodeId)

        assertThat(result, isSuccessfulWith(customerPaymentRequest()))
    }

    @Test
    fun shouldRetrievePaymentRequestDetailsByRequestId() {
        val qrCodeId = "75ba5b0b-7e5d-47fe-9508-29ca69fdb1d5"

        val result = api.paymentRequests.getById(qrCodeId)

        assertThat(result, isSuccessfulWith(customerPaymentRequest()))
    }

    @Test
    fun shouldMakePayment() {
        val paymentRequestId = "75ba5b0b-7e5d-47fe-9508-29ca69fdb1d5"

        val result = api.paymentRequests.makePayment(
            paymentRequestId,
            "abc123",
            null,
            null,
            null,
            null,
            null
        )

        assertThat(result, isSuccessfulWith(customerTransactionSummary()))
    }
}