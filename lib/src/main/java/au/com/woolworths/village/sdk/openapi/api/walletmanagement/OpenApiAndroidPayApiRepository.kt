package au.com.woolworths.village.sdk.openapi.api.walletmanagement

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.model.walletmanagement.TokenizeAndroidPayRequest
import au.com.woolworths.village.sdk.model.walletmanagement.TokenizeAndroidPayResponse
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.dto.TokenizeAndroidPayRequest

class OpenApiAndroidPayApiRepository  (
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions
) : OpenApiClientFactory(requestHeadersFactory, options), AndroidPayApiRepository {
    override fun tokenize(
        tokenizeAndroidPayRequest: au.com.woolworths.village.sdk.model.walletmanagement.TokenizeAndroidPayRequest
    ): ApiResult<TokenizeAndroidPayResponse> {
        return makeCall {
            val api = createWalletManagementApi()

            val body = TokenizeAndroidPayRequest()
            body.encryptedMessage = tokenizeAndroidPayRequest.encryptedMessage
            body.ephemeralPublicKey = tokenizeAndroidPayRequest.ephemeralPublicKey
            body.tag = tokenizeAndroidPayRequest.tag
            body.publicKeyHash = tokenizeAndroidPayRequest.publicKeyHash
            body.instrumentType = tokenizeAndroidPayRequest.instrumentType
            body.primary = tokenizeAndroidPayRequest.primary
            body.comment = tokenizeAndroidPayRequest.comment

            api.androidpayTokenizePost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                body,
                "",
                "",
                "")

            return@makeCall ApiResult.Success(object : TokenizeAndroidPayResponse {})
        }
    }

    override fun update(
        paymentInstrumentId: String,
        tokenizeAndroidPayRequest: au.com.woolworths.village.sdk.model.walletmanagement.TokenizeAndroidPayRequest
    ): ApiResult<TokenizeAndroidPayResponse> {
        return makeCall {
            val api = createWalletManagementApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.TokenizeAndroidPayRequest()
            body.encryptedMessage = tokenizeAndroidPayRequest.encryptedMessage
            body.ephemeralPublicKey = tokenizeAndroidPayRequest.ephemeralPublicKey
            body.tag = tokenizeAndroidPayRequest.tag
            body.publicKeyHash = tokenizeAndroidPayRequest.publicKeyHash
            body.instrumentType = tokenizeAndroidPayRequest.instrumentType
            body.primary = tokenizeAndroidPayRequest.primary
            body.comment = tokenizeAndroidPayRequest.comment

            api.androidpayTokenizePaymentInstrumentIdPost(
                paymentInstrumentId,
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                body,
                "",
                "",
                "")

            return@makeCall ApiResult.Success(object : TokenizeAndroidPayResponse {})
        }
    }
}
