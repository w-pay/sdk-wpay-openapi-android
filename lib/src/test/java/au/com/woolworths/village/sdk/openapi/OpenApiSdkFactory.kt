package au.com.woolworths.village.sdk.openapi

import au.com.woolworths.village.sdk.*

class OpenApiSdkFactory : SdkFactory {
    override fun createCustomerApi(): VillageCustomerApiRepository {
        return OpenApiVillageCustomerApiRepository(
            TestRequestHeadersFactory(), VillageCustomerOptions(
                baseUrl = "http://localhost:8080/wow/v1/pay",
                apiKey = "abc123"
            )
        )
    }

    override fun createMerchantApi(): VillageMerchantApiRepository {
        return OpenApiVillageMerchantApiRepository(
            TestRequestHeadersFactory(), VillageMerchantOptions(
                baseUrl = "http://localhost:8080/wow/v1/pay",
                apiKey = "abc123"
            )
        )
    }
}

class TestRequestHeadersFactory : RequestHeadersFactory {
    override fun createHeaders(): Map<String, String> {
        return hashMapOf(
            X_WALLET_ID to "a value",
            X_MERCHANT_ID to "a value",
            X_API_KEY to "abc123",
            X_EVERYDAY_PAY_WALLET to "true"
        )
    }
}