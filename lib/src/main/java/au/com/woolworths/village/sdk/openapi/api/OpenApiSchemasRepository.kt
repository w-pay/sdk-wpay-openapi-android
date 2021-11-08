package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.api.SchemasRepository
import au.com.woolworths.village.sdk.model.MerchantSchema
import au.com.woolworths.village.sdk.model.MerchantSchemaSummaries
import au.com.woolworths.village.sdk.model.MerchantSchemaSummary
import au.com.woolworths.village.sdk.openapi.ClientOptions
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.dto.InstoreMerchantSchemaData
import au.com.woolworths.village.sdk.openapi.model.OpenApiMerchantSchema
import au.com.woolworths.village.sdk.openapi.model.OpenApiMerchantSchemaSummaries
import au.com.woolworths.village.sdk.openapi.model.OpenApiMerchantSchemaSummary

class OpenApiSchemasRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions,
    clientOptions: ClientOptions = ClientOptions()
) : OpenApiClientFactory(requestHeadersFactory, options, clientOptions), SchemasRepository {
    override fun list(): ApiResult<MerchantSchemaSummaries> {
        return makeCall {
            val api = createMerchantApi()

            val data = api.getMerchantSchemas(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                "",
                "",
                ""
            ).data

            ApiResult.Success(OpenApiMerchantSchemaSummaries(data.schemas))
        }
    }

    override fun getById(schemaId: String): ApiResult<MerchantSchema> {
        return makeCall {
            val api = createMerchantApi()

            val data = api.getMerchantSchemaDetails(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                schemaId,
                "",
                "",
                ""
            ).data

            ApiResult.Success(OpenApiMerchantSchema(data))
        }
    }

    override fun create(schema: MerchantSchema): ApiResult<MerchantSchemaSummary> {
        return makeCall {
            val api = createMerchantApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.MerchantSchema()
            body.data = InstoreMerchantSchemaData().apply {
                this.schema = schema.schema
                schema.type?.let { type = it }
                schema.description?.let { description = it }
            }

            val data = api.createMerchantSchema(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                body,
                "",
                "",
                ""
            ).data

            ApiResult.Success(OpenApiMerchantSchemaSummary(data))
        }
    }
}