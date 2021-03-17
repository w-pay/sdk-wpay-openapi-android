package au.com.woolworths.village.sdk.openapi.api.walletmanagement

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.model.walletmanagement.*

interface OpenApiInstrumentsApiRepository {
    fun import(
        importPaymentInstrumentsRequest: ImportPaymentInstrumentsRequest
    ): ApiResult<ImportPaymentInstrumentsResponse>

    fun verify(
        verifyPaymentInstrumentsRequest: VerifyPaymentInstrumentsRequest
    ): ApiResult<VerifyPaymentInstrumentsSuccessResponse>

    fun getList(): ApiResult<ListPaymentInstrumentsResponse>

    fun postList(
        listPaymentInstrumentsRequest: ListPaymentInstrumentsRequest
    ): ApiResult<ListPaymentInstrumentsResponse>

    fun delete(paymentInstrumentId: String): ApiResult<Map<String, Any>>
}
