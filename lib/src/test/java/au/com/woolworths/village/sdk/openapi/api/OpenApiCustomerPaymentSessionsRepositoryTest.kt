package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.data.TestCustomerUpdatePaymentSessionRequest
import au.com.woolworths.village.sdk.data.aSelectedPaymentInstrument
import au.com.woolworths.village.sdk.matchers.isSuccessful
import au.com.woolworths.village.sdk.matchers.isSuccessfulWith
import au.com.woolworths.village.sdk.matchers.paymentSession
import au.com.woolworths.village.sdk.openapi.OpenApiSdkFactory
import org.junit.Assert.assertThat
import org.junit.Test

class OpenApiCustomerPaymentSessionsRepositoryTest {
    private val apiFactory = OpenApiSdkFactory()
    private val api = apiFactory.createCustomerApi()

    @Test
    fun shouldRetrieveCustomerPaymentSession() {
        val paymentSessionId = "75ba5b0b-7e5d-47fe-9508-29ca69fdb1d5"

        val result = api.paymentSessions.getById(paymentSessionId)

        assertThat(result, isSuccessfulWith(paymentSession()))
    }

    @Test
    fun shouldRetrieveCustomerPaymentSessionByQR() {
        val qrCodeId = "75ba5b0b-7e5d-47fe-9508-29ca69fdb1d5"

        val result = api.paymentSessions.getByQRCodeId(qrCodeId)

        assertThat(result, isSuccessfulWith(paymentSession()))
    }

    @Test
    fun shouldUpdateCustomerPaymentSession() {
        val paymentSessionId = "75ba5b0b-7e5d-47fe-9508-29ca69fdb1d5"

        val result = api.paymentSessions.update(
            paymentSessionId,
            TestCustomerUpdatePaymentSessionRequest()
        )

        assertThat(result, isSuccessful())
    }

    @Test
    fun shouldDeletePaymentSession() {
        val paymentSessionId = "75ba5b0b-7e5d-47fe-9508-29ca69fdb1d5"

        val result = api.paymentSessions.delete(paymentSessionId)

        assertThat(result, isSuccessful())
    }

    @Test
    fun shouldPreApprovePaymentSession() {
        val paymentSessionId = "75ba5b0b-7e5d-47fe-9508-29ca69fdb1d5"

        val result = api.paymentSessions.preApprove(
            paymentSessionId,
            aSelectedPaymentInstrument(),
            null,
            null,
            null
        )

        assertThat(result, isSuccessful())
    }
}