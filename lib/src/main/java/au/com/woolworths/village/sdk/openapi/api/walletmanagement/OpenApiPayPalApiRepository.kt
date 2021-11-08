package au.com.woolworths.village.sdk.openapi.api.walletmanagement

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.openapi.ClientOptions
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.model.OpenApiGuestTokenizePaypalResponse
import au.com.woolworths.village.sdk.openapi.model.OpenApiTokenizePaypalResponse

class OpenApiPayPalApiRepository (
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions,
    clientOptions: ClientOptions = ClientOptions()
) : OpenApiClientFactory(requestHeadersFactory, options, clientOptions),
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
                getDefaultHeader(api.apiClient, AUTHORISATION),
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
                getDefaultHeader(api.apiClient, AUTHORISATION),
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
