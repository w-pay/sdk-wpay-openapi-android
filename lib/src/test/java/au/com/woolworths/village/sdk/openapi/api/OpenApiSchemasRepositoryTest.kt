package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.data.aNewSchema
import au.com.woolworths.village.sdk.matchers.isSuccessfulWith
import au.com.woolworths.village.sdk.matchers.merchantSchema
import au.com.woolworths.village.sdk.matchers.merchantSchemaSummaries
import au.com.woolworths.village.sdk.matchers.merchantSchemaSummary
import au.com.woolworths.village.sdk.openapi.OpenApiSdkFactory
import org.junit.Assert.assertThat
import org.junit.Test

class OpenApiSchemasRepositoryTest {
    private val apiFactory = OpenApiSdkFactory()
    private val api = apiFactory.createMerchantApi()

    @Test
    fun shouldRetrieveSchemas() {
        val result = api.schemas.list()

        assertThat(result, isSuccessfulWith(merchantSchemaSummaries()))
    }

    @Test
    fun shouldRetrieveSchemaDetails() {
        val schemaId = "a5bbfe1a-c1b9-11ea-924f-33c96a9759eb"

        val result = api.schemas.getById(schemaId)

        assertThat(result, isSuccessfulWith(merchantSchema()))
    }

    @Test
    fun shouldCreateSchema() {
        val result = api.schemas.create(aNewSchema())

        assertThat(result, isSuccessfulWith(merchantSchemaSummary()))
    }
}