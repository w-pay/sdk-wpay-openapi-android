package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.api.MerchantPaymentSessionsRepository
import au.com.woolworths.village.sdk.model.CreatePaymentSessionRequest
import au.com.woolworths.village.sdk.model.CreatePaymentSessionResult
import au.com.woolworths.village.sdk.model.MerchantUpdatePaymentSessionRequest
import au.com.woolworths.village.sdk.model.PaymentSession
import au.com.woolworths.village.sdk.openapi.ClientOptions
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.dto.InstoreMerchantPaymentSessionData
import au.com.woolworths.village.sdk.openapi.dto.InstoreMerchantPaymentSessionPaymentSessionIdData
import au.com.woolworths.village.sdk.openapi.dto.UpdatePaymentSessionRequest1
import au.com.woolworths.village.sdk.openapi.model.OpenApiCreatePaymentSessionResult
import au.com.woolworths.village.sdk.openapi.model.OpenApiPaymentSession

class OpenApiMerchantPaymentSessionsRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions,
    clientOptions: ClientOptions = ClientOptions()
) : OpenApiClientFactory(requestHeadersFactory, options, clientOptions),
    MerchantPaymentSessionsRepository
{
    override fun create(
        request: CreatePaymentSessionRequest
    ): ApiResult<CreatePaymentSessionResult> {
        return makeCall {
            val api = createMerchantApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.CreatePaymentSessionRequest()
            body.data = InstoreMerchantPaymentSessionData().apply {
                location = request.location
                merchantInfo = toDynamicPayload(request.merchantInfo)
                generateQR = request.generateQR
                timeToLivePaymentSession = request.timeToLivePaymentSession
                timeToLiveQR = request.timeToLiveQR
            }

            val data = api.createPaymentSession(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                body,
                "",
                "",
                ""
            ).data

            ApiResult.Success(OpenApiCreatePaymentSessionResult(data))
        }
    }

    override fun getById(paymentSessionId: String): ApiResult<PaymentSession> {
        return makeCall {
            val api = createMerchantApi()

            val data = api.getPaymentSession(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                paymentSessionId,
                "",
                "",
                ""
            ).data

            ApiResult.Success(OpenApiPaymentSession(data))
        }
    }

    override fun update(
        paymentSessionId: String,
        session: MerchantUpdatePaymentSessionRequest
    ): ApiResult<Unit> {
        return makeCall {
            val api = createMerchantApi()

            val body = UpdatePaymentSessionRequest1().apply {
                data = InstoreMerchantPaymentSessionPaymentSessionIdData().apply {
                    paymentRequestId = session.paymentRequestId
                    merchantInfo = toDynamicPayload(session.merchantInfo)
                }
            }

            api.merchantUpdatePaymentSession(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                paymentSessionId,
                body,
                "",
                "",
                ""
            )

            ApiResult.Success(Unit)
        }
    }

    override fun delete(paymentSessionId: String): ApiResult<Unit> {
        return makeCall {
            val api = createMerchantApi()

            api.deletePaymentSession(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                paymentSessionId,
                "",
                "",
                ""
            )

            ApiResult.Success(Unit)
        }
    }
}