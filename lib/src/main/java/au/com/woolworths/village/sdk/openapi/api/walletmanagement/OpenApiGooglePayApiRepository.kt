package au.com.woolworths.village.sdk.openapi.api.walletmanagement

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.model.walletmanagement.TokenizeGooglePayRequest
import au.com.woolworths.village.sdk.model.walletmanagement.TokenizeGooglePayResponse
import au.com.woolworths.village.sdk.openapi.ClientOptions
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.model.OpenApiTokenizeGooglePayResponse

class OpenApiGooglePayApiRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions,
    clientOptions: ClientOptions = ClientOptions()
) : OpenApiClientFactory(requestHeadersFactory, options, clientOptions),
    au.com.woolworths.village.sdk.api.walletmanagement.GooglePayApiRepository {
    override fun tokenize(
        tokenizeGooglePayRequest: au.com.woolworths.village.sdk.model.walletmanagement.TokenizeGooglePayRequest
    ): ApiResult<au.com.woolworths.village.sdk.model.walletmanagement.TokenizeGooglePayResponse> {
        return makeCall {
            val api = createWalletManagementApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.TokenizeGooglePayRequest()
            body.instrumentType = tokenizeGooglePayRequest.instrumentType
            body.comment = tokenizeGooglePayRequest.comment
            body.tokenData = tokenizeGooglePayRequest.tokenData

            val response = api.googlepayTokenizePost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                body,
                "",
                "",
                ""
            )

            return@makeCall ApiResult.Success(
                OpenApiTokenizeGooglePayResponse(
                    response
                )
            )
        }
    }

    override fun guestTokenize(
        tokenizeGooglePayRequest: au.com.woolworths.village.sdk.model.walletmanagement.TokenizeGooglePayRequest
    ): ApiResult<au.com.woolworths.village.sdk.model.walletmanagement.TokenizeGooglePayResponse> {
        return makeCall {
            val api = createWalletManagementApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.TokenizeGooglePayRequest()
            body.instrumentType = tokenizeGooglePayRequest.instrumentType
            body.comment = tokenizeGooglePayRequest.comment
            body.tokenData = tokenizeGooglePayRequest.tokenData

            val response = api.guestGooglepayTokenizePost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                body,
                "",
                "",
                ""
            )

            return@makeCall ApiResult.Success(
                OpenApiTokenizeGooglePayResponse(
                    response
                )
            )
        }
    }

    override fun update(
        paymentToken: String,
        tokenizeGooglePayRequest: au.com.woolworths.village.sdk.model.walletmanagement.TokenizeGooglePayRequest
    ): ApiResult<au.com.woolworths.village.sdk.model.walletmanagement.TokenizeGooglePayResponse> {
        return makeCall {
            val api = createWalletManagementApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.TokenizeGooglePayRequest()
            body.instrumentType = tokenizeGooglePayRequest.instrumentType
            body.comment = tokenizeGooglePayRequest.comment
            body.tokenData = tokenizeGooglePayRequest.tokenData

            val response = api.googlepayTokenizePaymentTokenPost(
                tokenizeGooglePayRequest.tokenData,
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                body,
                "",
                "",
                ""
            )

            return@makeCall ApiResult.Success(
                OpenApiTokenizeGooglePayResponse(
                    response
                )
            )
        }
    }
}
