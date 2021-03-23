package au.com.woolworths.village.sdk.openapi.api.walletmanagement

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.RequestHeadersFactory
import au.com.woolworths.village.sdk.VillageOptions
import au.com.woolworths.village.sdk.X_API_KEY
import au.com.woolworths.village.sdk.api.walletmanagement.CardsApiRepository
import au.com.woolworths.village.sdk.model.walletmanagement.InitiateCardCaptureRequest
import au.com.woolworths.village.sdk.model.walletmanagement.InitiateCardCaptureResponse
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.model.OpenApiInitiateCardCaptureResponse

class OpenApiCardsApiRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions
) : OpenApiClientFactory(requestHeadersFactory, options), CardsApiRepository {
    override fun initCapture(
        initiateCardCaptureRequest: au.com.woolworths.village.sdk.model.walletmanagement.InitiateCardCaptureRequest
    ): ApiResult<au.com.woolworths.village.sdk.model.walletmanagement.InitiateCardCaptureResponse> {
        return makeCall {
            val api = createWalletManagementApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.InitiateCardCaptureRequest()
            body.clientReference = initiateCardCaptureRequest.clientReference

            val response = api.cardsInitcapturePost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                body,
                "",
                "",
                ""
            )

            return@makeCall ApiResult.Success(
                OpenApiInitiateCardCaptureResponse(
                    response
                )
            )
        }
    }

    override fun guestInitCapture(
        initiateCardCaptureRequest: au.com.woolworths.village.sdk.model.walletmanagement.InitiateCardCaptureRequest
    ): ApiResult<au.com.woolworths.village.sdk.model.walletmanagement.InitiateCardCaptureResponse> {
        return makeCall {
            val api = createWalletManagementApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.InitiateCardCaptureRequest()
            body.clientReference = initiateCardCaptureRequest.clientReference


            val response = api.guestCardsInitcapturePost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                body,
                "",
                "",
                ""
            )

            return@makeCall ApiResult.Success(
                OpenApiInitiateCardCaptureResponse(
                    response
                )
            )
        }
    }
}
