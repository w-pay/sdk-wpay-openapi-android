package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.matchers.isSuccessful
import au.com.woolworths.village.sdk.matchers.isSuccessfulWith
import au.com.woolworths.village.sdk.openapi.OpenApiSdkFactory
import org.hamcrest.Matchers.*
import org.hamcrest.text.IsBlankString
import org.junit.Assert.assertThat
import org.junit.Test

class OpenApiCustomerPreferencesRepositoryTest {
    private val apiFactory = OpenApiSdkFactory()
    private val api = apiFactory.createCustomerApi()

    @Test
    fun shouldRetrievePreferences() {
        val result = api.preferences.get()

        assertThat(
            result, isSuccessfulWith(
                hasEntry(
                    equalTo("payments"),
                    hasEntry(
                        equalTo("defaultInstrument"),
                        not(IsBlankString.blankOrNullString())
                    )
                )
            )
        )
    }

    @Test
    fun shouldSetPreferences() {
        val result = api.preferences.set(
            hashMapOf(
                "preferenceGroup" to hashMapOf(
                    "preference" to "value"
                )
            )
        )

        assertThat(result, isSuccessful())
    }
}