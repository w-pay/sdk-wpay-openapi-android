package au.com.woolworths.village.sdk.openapi.api.walletmanagement

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.RequestHeadersFactory
import au.com.woolworths.village.sdk.VillageOptions
import au.com.woolworths.village.sdk.X_API_KEY
import au.com.woolworths.village.sdk.model.TokenizePaypalResponse
import au.com.woolworths.village.sdk.model.walletmanagement.TokenizePaypalRequest
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.model.OpenApiGuestTokenizePaypalResponse
import au.com.woolworths.village.sdk.openapi.model.OpenApiTokenizePaypalResponse

class OpenApiPayPalApiRepository (
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions
) : OpenApiClientFactory(requestHeadersFactory, options),
    au.com.woolworths.village.sdk.api.walletmanagement.PayPalApiRepository {
    override fun tokenize(tokenizePaypalRequest: au.com.woolworths.village.sdk.model.walletmanagement.TokenizePaypalRequest):
            ApiResult<au.com.woolworths.village.sdk.model.TokenizePaypalResponse> {
        return makeCall {
            val api = createWalletManagementApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.TokenizePaypalRequest()
            body.nonce = tokenizePaypalRequest.nonce
            body.primary = tokenizePaypalRequest.primary

            val response = api.paypalTokenizePost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                body,
                "",
                "",
                ""
            )
            return@makeCall ApiResult.Success(
                OpenApiTokenizePaypalResponse(
                    response
                )
            )
        }
    }

    override fun guestTokenize(tokenizePaypalRequest: au.com.woolworths.village.sdk.model.walletmanagement.TokenizePaypalRequest):
            ApiResult<au.com.woolworths.village.sdk.model.TokenizePaypalResponse> {
        return makeCall {
            val api = createWalletManagementApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.GuestTokenizePaypalRequest()
            body.nonce = tokenizePaypalRequest.nonce

            val response = api.guestPaypalTokenizePost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                body,
                "",
                "",
                ""
            )
            return@makeCall ApiResult.Success(
                OpenApiGuestTokenizePaypalResponse(
                    response
                )
            )
        }
    }
}
