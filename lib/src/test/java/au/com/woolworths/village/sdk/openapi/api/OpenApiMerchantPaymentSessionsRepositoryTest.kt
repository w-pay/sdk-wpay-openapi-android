package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.data.TestCreatePaymentSessionRequest
import au.com.woolworths.village.sdk.data.TestMerchantUpdatePaymentSessionRequest
import au.com.woolworths.village.sdk.matchers.isSuccessful
import au.com.woolworths.village.sdk.matchers.isSuccessfulWith
import au.com.woolworths.village.sdk.matchers.paymentSession
import au.com.woolworths.village.sdk.matchers.paymentSessionCreated
import au.com.woolworths.village.sdk.openapi.OpenApiSdkFactory
import org.junit.Assert.assertThat
import org.junit.Test

class OpenApiMerchantPaymentSessionsRepositoryTest {
    private val apiFactory = OpenApiSdkFactory()
    private val api = apiFactory.createMerchantApi()

    @Test
    fun shouldCreatePaymentSession() {
        val result = api.paymentSession.create(TestCreatePaymentSessionRequest())

        assertThat(result, isSuccessfulWith(paymentSessionCreated()))
    }

    @Test
    fun shouldRetrievePaymentSession() {
        val paymentSessionId = "a5bbfe1a-c1b9-11ea-924f-33c96a9759eb"

        val result = api.paymentSession.getById(paymentSessionId)

        assertThat(result, isSuccessfulWith(paymentSession()))
    }

    @Test
    fun shouldUpdatePaymentSession() {
        val paymentSessionId = "a5bbfe1a-c1b9-11ea-924f-33c96a9759eb"

        val result = api.paymentSession.update(
            paymentSessionId,
            TestMerchantUpdatePaymentSessionRequest()
        )

        assertThat(result, isSuccessful())
    }

    @Test
    fun shouldDeletePaymentSession() {
        val paymentSessionId = "a5bbfe1a-c1b9-11ea-924f-33c96a9759eb"

        val result = api.paymentSession.delete(paymentSessionId)

        assertThat(result, isSuccessful())
    }
}