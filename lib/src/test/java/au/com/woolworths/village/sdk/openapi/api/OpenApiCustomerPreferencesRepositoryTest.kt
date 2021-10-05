package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.data.TestCustomerPreferences
import au.com.woolworths.village.sdk.matchers.isSuccessful
import au.com.woolworths.village.sdk.matchers.isSuccessfulWith
import au.com.woolworths.village.sdk.openapi.OpenApiSdkFactory
import org.hamcrest.Matchers.anything
import org.junit.Assert.assertThat
import org.junit.Test

class OpenApiCustomerPreferencesRepositoryTest {
    private val apiFactory = OpenApiSdkFactory()
    private val api = apiFactory.createCustomerApi()

    @Test
    fun shouldRetrievePreferences() {
        val result = api.preferences.get()

        assertThat(result, isSuccessfulWith(anything()))
    }

    @Test
    fun shouldSetPreferences() {
        val result = api.preferences.set(TestCustomerPreferences())

        assertThat(result, isSuccessful())
    }
}