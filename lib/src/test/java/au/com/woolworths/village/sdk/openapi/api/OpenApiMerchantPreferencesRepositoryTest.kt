package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.matchers.isSuccessful
import au.com.woolworths.village.sdk.matchers.isSuccessfulWith
import au.com.woolworths.village.sdk.openapi.OpenApiSdkFactory
import org.hamcrest.Matchers.*
import org.hamcrest.text.IsBlankString
import org.junit.Assert.assertThat
import org.junit.Test

class OpenApiMerchantPreferencesRepositoryTest {
    private val apiFactory = OpenApiSdkFactory()
    private val api = apiFactory.createMerchantApi()

    @Test
    fun shouldRetrievePreferences() {
        val result = api.preferences.get()

        assertThat(
            result, isSuccessfulWith(
                hasEntry(
                    equalTo("qrTemplates"), allOf(
                        hasEntry(
                            equalTo("PAYMENT_REQUEST"),
                            not(IsBlankString.blankOrNullString())
                        ),
                        hasEntry(
                            equalTo("PAYMENT_SESSION"),
                            not(IsBlankString.blankOrNullString())
                        )
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