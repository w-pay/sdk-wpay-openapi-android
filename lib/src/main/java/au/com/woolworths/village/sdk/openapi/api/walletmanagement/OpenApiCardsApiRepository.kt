package au.com.woolworths.village.sdk.openapi.api.walletmanagement

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.model.walletmanagement.InitiateCardCaptureRequest
import au.com.woolworths.village.sdk.model.walletmanagement.InitiateCardCaptureResponse

interface OpenApiCardsApiRepository {
    fun initCapture(
        initiateCardCaptureRequest: InitiateCardCaptureRequest
    ): ApiResult<InitiateCardCaptureResponse>

    fun guestInitCapture(
        initiateCardCaptureRequest: InitiateCardCaptureRequest
    ): ApiResult<InitiateCardCaptureResponse>
}
