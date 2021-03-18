package au.com.woolworths.village.sdk.openapi.api.walletmanagement

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.RequestHeadersFactory
import au.com.woolworths.village.sdk.VillageOptions
import au.com.woolworths.village.sdk.X_API_KEY
import au.com.woolworths.village.sdk.api.walletmanagement.ApplePayApiRepository
import au.com.woolworths.village.sdk.model.walletmanagement.TokenizeApplePayRequest
import au.com.woolworths.village.sdk.model.walletmanagement.TokenizeApplePayResponse
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.model.OpenApiTokenizeApplePayResponse

class OpenApiApplePayApiRepository (
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions
) : OpenApiClientFactory(requestHeadersFactory, options), ApplePayApiRepository {
    override fun tokenize(tokenizeApplePayRequest: au.com.woolworths.village.sdk.model.walletmanagement.TokenizeApplePayRequest):
            ApiResult<au.com.woolworths.village.sdk.model.walletmanagement.TokenizeApplePayResponse>{
        return makeCall {
            val api = createWalletManagementApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.TokenizeApplePayRequest()
            body.data = tokenizeApplePayRequest.data
            body.ephemeralPublicKey = tokenizeApplePayRequest.ephemeralPublicKey
            body.publicKeyHash = tokenizeApplePayRequest.publicKeyHash
            body.transactionId = tokenizeApplePayRequest.transactionId
            body.instrumentType = tokenizeApplePayRequest.instrumentType
            body.signature = tokenizeApplePayRequest.signature
            body.version = tokenizeApplePayRequest.version
            body.instrumentType = tokenizeApplePayRequest.instrumentType
            body.primary = tokenizeApplePayRequest.primary
            body.comment = tokenizeApplePayRequest.comment
            body.applicationData = tokenizeApplePayRequest.applicationData

            val response = api.applepayTokenizePost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                body,
                "",
                "",
                "")

            return@makeCall ApiResult.Success(
                OpenApiTokenizeApplePayResponse(
                response
            )
            )
        }
    }

    override fun guestTokenize(
        tokenizeApplePayRequest: au.com.woolworths.village.sdk.model.walletmanagement.TokenizeApplePayRequest
    ): ApiResult<au.com.woolworths.village.sdk.model.walletmanagement.TokenizeApplePayResponse>{
        return makeCall {
            val api = createWalletManagementApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.GuestTokenizeApplePayRequest()
            body.data = tokenizeApplePayRequest.data
            body.ephemeralPublicKey = tokenizeApplePayRequest.ephemeralPublicKey
            body.publicKeyHash = tokenizeApplePayRequest.publicKeyHash
            body.transactionId = tokenizeApplePayRequest.transactionId
            body.instrumentType = tokenizeApplePayRequest.instrumentType
            body.signature = tokenizeApplePayRequest.signature
            body.version = tokenizeApplePayRequest.version
            body.instrumentType = tokenizeApplePayRequest.instrumentType
            body.comment = tokenizeApplePayRequest.comment
            body.applicationData = tokenizeApplePayRequest.applicationData

            val response = api.guestApplepayTokenizePost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                body,
                "",
                "",
                "")

            return@makeCall ApiResult.Success(
                OpenApiTokenizeApplePayResponse(
                    response
                )
            )
        }
    }

    override fun update(
        paymentInstrumentId: String,
        tokenizeApplePayRequest: TokenizeApplePayRequest
    ): ApiResult<TokenizeApplePayResponse>{
        return makeCall {
            val api = createWalletManagementApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.TokenizeApplePayRequest()
            body.data = tokenizeApplePayRequest.data
            body.ephemeralPublicKey = tokenizeApplePayRequest.ephemeralPublicKey
            body.publicKeyHash = tokenizeApplePayRequest.publicKeyHash
            body.transactionId = tokenizeApplePayRequest.transactionId
            body.instrumentType = tokenizeApplePayRequest.instrumentType
            body.signature = tokenizeApplePayRequest.signature
            body.version = tokenizeApplePayRequest.version
            body.instrumentType = tokenizeApplePayRequest.instrumentType
            body.primary = tokenizeApplePayRequest.primary
            body.comment = tokenizeApplePayRequest.comment
            body.applicationData = tokenizeApplePayRequest.applicationData

            val response = api.applepayTokenizePaymentInstrumentIdPost(
                paymentInstrumentId,
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                body,
                "",
                "",
                "")

            return@makeCall ApiResult.Success(OpenApiTokenizeApplePayResponse(
                response
            ))
        }
    }
}
