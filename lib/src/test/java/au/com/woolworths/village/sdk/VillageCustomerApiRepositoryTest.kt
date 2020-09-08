package au.com.woolworths.village.sdk

import au.com.woolworths.village.sdk.data.TestCustomerUpdatePaymentSessionRequest
import au.com.woolworths.village.sdk.data.aNewPaymentInstrument
import au.com.woolworths.village.sdk.data.aSelectedPaymentInstrument
import au.com.woolworths.village.sdk.matchers.*
import au.com.woolworths.village.sdk.openapi.OpenApiSdkFactory
import org.hamcrest.Matchers.*
import org.hamcrest.text.IsBlankString.blankOrNullString
import org.junit.Assert.assertThat
import org.junit.Test
import org.threeten.bp.OffsetDateTime

class VillageCustomerApiRepositoryTest {
    private val apiFactory = OpenApiSdkFactory()
    private val api = apiFactory.createCustomerApi().apply {
        setHost("http://localhost:8080")
    }

    @Test
    fun shouldRetrieveTransactions() {
        val paymentRequestId = "75ba5b0b-7e5d-47fe-9508-29ca69fdb1d5"
        val startTime = OffsetDateTime.parse("2017-11-06T19:38:09.890+11:00")
        val endTime = OffsetDateTime.parse("2017-11-06T19:38:09.890+11:00")
        val pageSize = 20
        val page = 2

        val result = api.retrieveTransactions(paymentRequestId, page, pageSize, endTime, startTime)

        assertThat(result, isSuccessfulWith(customerTransactionSummaries()))
    }

    @Test
    fun shouldRetrieveTransactionDetails() {
        val transactionId = "75ba5b0b-7e5d-47fe-9508-29ca69fdb1d5"

        val result = api.retrieveTransactionDetails(transactionId)

        assertThat(result, isSuccessfulWith(customerTransactionDetails()))
    }

    @Test
    fun shouldRetrievePaymentRequestDetailsByQRCode() {
        val qrCodeId = "75ba5b0b-7e5d-47fe-9508-29ca69fdb1d5"

        val result = api.retrievePaymentRequestDetailsByQRCodeId(qrCodeId)

        assertThat(result, isSuccessfulWith(customerPaymentRequest()))
    }

    @Test
    fun shouldRetrievePaymentRequestDetailsByRequestId() {
        val qrCodeId = "75ba5b0b-7e5d-47fe-9508-29ca69fdb1d5"

        val result = api.retrievePaymentRequestDetailsById(qrCodeId)

        assertThat(result, isSuccessfulWith(customerPaymentRequest()))
    }

    @Test
    fun shouldMakePayment() {
        val paymentRequestId = "75ba5b0b-7e5d-47fe-9508-29ca69fdb1d5"

        val result = api.makePayment(
            paymentRequestId,
            aSelectedPaymentInstrument(),
            null,
            null,
            null
        )

        assertThat(result, isSuccessfulWith(customerTransactionSummary()))
    }

    @Test
    fun shouldRetrievePaymentInstruments() {
        val result = api.retrievePaymentInstruments(Wallet.MERCHANT)

        assertThat(result, isSuccessfulWith(allPaymentInstruments()))
    }

    @Test
    fun shouldDeletePaymentInstrument() {
        val result = api.deletePaymentInstrument(aSelectedPaymentInstrument())

        assertThat(result, isSuccessful())
    }

    @Test
    fun shouldInitiatePaymentInstrumentAddition() {
        val instrument = aNewPaymentInstrument()

        val result = api.initiatePaymentInstrumentAddition(instrument)

        assertThat(result, isSuccessfulWith(paymentInstrumentAdded()))
    }

    @Test
    fun shouldRetrievePreferences() {
        val result = api.retrievePreferences()

        assertThat(result, isSuccessfulWith(
            hasEntry(equalTo("payments"),
                hasEntry(equalTo("defaultInstrument"), not(blankOrNullString()))
            )
        ))
    }

    @Test
    fun shouldSetPreferences() {
        val result = api.setPreferences(hashMapOf(
            "preferenceGroup" to hashMapOf(
                "preference" to "value"
            )
        ))

        assertThat(result, isSuccessful())
    }

    @Test
    fun shouldRetrieveCustomerPaymentSession() {
        val paymentSessionId = "75ba5b0b-7e5d-47fe-9508-29ca69fdb1d5"

        val result = api.retrievePaymentSessionById(paymentSessionId)

        assertThat(result, isSuccessfulWith(paymentSession()))
    }

    @Test
    fun shouldRetrieveCustomerPaymentSessionByQR() {
        val qrCodeId = "75ba5b0b-7e5d-47fe-9508-29ca69fdb1d5"

        val result = api.retrievePaymentSessionByQRCodeId(qrCodeId)

        assertThat(result, isSuccessfulWith(paymentSession()))
    }

    @Test
    fun shouldUpdateCustomerPaymentSession() {
        val paymentSessionId = "75ba5b0b-7e5d-47fe-9508-29ca69fdb1d5"

        val result = api.updatePaymentSession(
            paymentSessionId,
            TestCustomerUpdatePaymentSessionRequest()
        )

        assertThat(result, isSuccessful())
    }

    @Test
    fun shouldDeletePaymentSession() {
        val paymentSessionId = "75ba5b0b-7e5d-47fe-9508-29ca69fdb1d5"

        val result = api.deletePaymentSession(paymentSessionId)

        assertThat(result, isSuccessful())
    }

    @Test
    fun shouldPreApprovePaymentSession() {
        val paymentSessionId = "75ba5b0b-7e5d-47fe-9508-29ca69fdb1d5"

        val result = api.preApprovePaymentSession(
            paymentSessionId,
            aSelectedPaymentInstrument(),
            null,
            null,
            null
        )

        assertThat(result, isSuccessful())
    }

    @Test
    fun shouldCheckHealth() {
        val result = api.checkHealth()

        assertThat(result, isSuccessfulWith(healthyService()))
    }
}