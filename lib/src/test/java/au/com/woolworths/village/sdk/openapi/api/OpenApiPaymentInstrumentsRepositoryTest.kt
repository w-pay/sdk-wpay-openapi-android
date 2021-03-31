package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.data.aNewPaymentInstrument
import au.com.woolworths.village.sdk.matchers.allPaymentInstruments
import au.com.woolworths.village.sdk.matchers.isSuccessful
import au.com.woolworths.village.sdk.matchers.isSuccessfulWith
import au.com.woolworths.village.sdk.matchers.paymentInstrumentAdded
import au.com.woolworths.village.sdk.openapi.OpenApiSdkFactory
import org.junit.Assert.assertThat
import org.junit.Test

class OpenApiPaymentInstrumentsRepositoryTest {
    private val apiFactory = OpenApiSdkFactory()
    private val api = apiFactory.createCustomerApi()

    @Test
    fun shouldRetrievePaymentInstruments() {
        val result = api.instruments.list()

        assertThat(result, isSuccessfulWith(allPaymentInstruments()))
    }

    @Test
    fun shouldDeletePaymentInstrument() {
        val result = api.instruments.delete("abc123")

        assertThat(result, isSuccessful())
    }

    @Test
    fun shouldInitiatePaymentInstrumentAddition() {
        val instrument = aNewPaymentInstrument()

        val result = api.instruments.initiateAddition(instrument)

        assertThat(result, isSuccessfulWith(paymentInstrumentAdded()))
    }
}