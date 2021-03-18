package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.matchers.healthyService
import au.com.woolworths.village.sdk.matchers.isSuccessfulWith
import au.com.woolworths.village.sdk.openapi.OpenApiSdkFactory
import org.junit.Assert.assertThat
import org.junit.Test

class OpenApiAdministrationApiRepositoryTest {
    private val apiFactory = OpenApiSdkFactory()
    private val api = apiFactory.createCustomerApi()

    @Test
    fun shouldCheckHealth() {
        val result = api.admin.checkHealth()

        assertThat(result, isSuccessfulWith(healthyService()))
    }
}