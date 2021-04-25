package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.api.CustomerPaymentSessionsRepository
import au.com.woolworths.village.sdk.model.*
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.dto.InstoreCustomerPaymentSessionPaymentSessionIdData
import au.com.woolworths.village.sdk.openapi.dto.InstoreCustomerPaymentsPaymentRequestIdData
import au.com.woolworths.village.sdk.openapi.dto.MetaChallenge
import au.com.woolworths.village.sdk.openapi.model.OpenApiPaymentSession

class OpenApiCustomerPaymentSessionsRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions
) : OpenApiClientFactory(requestHeadersFactory, options), CustomerPaymentSessionsRepository {
    override fun getById(paymentSessionId: String): ApiResult<PaymentSession> {
        return makeCall {
            val api = createCustomerApi()

            val data = api.getCustomerPaymentSession(
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

    override fun getByQRCodeId(qrCodeId: String): ApiResult<PaymentSession> {
        return makeCall {
            val api = createCustomerApi()

            val data = api.getCustomerPaymentSessionByQRCodeId(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                qrCodeId,
                "",
                "",
                ""
            ).data

            ApiResult.Success(OpenApiPaymentSession(data))
        }
    }

    override fun update(
        paymentSessionId: String,
        session: CustomerUpdatePaymentSessionRequest
    ): ApiResult<Unit> {
        return makeCall {
            val api = createCustomerApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.UpdatePaymentSessionRequest()
            body.data = InstoreCustomerPaymentSessionPaymentSessionIdData()
            body.data.customerInfo = toDynamicPayload(session.customerInfo)

            api.customerUpdatePaymentSession(
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
            val api = createCustomerApi()

            api.deleteCustomerPaymentSession(
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

    override fun preApprove(
        paymentSessionId: String,
        primaryInstrument: String?,
        secondaryInstruments: List<SecondaryPaymentInstrument>?,
        clientReference: String?,
        preferences: PaymentPreferences?,
        challengeResponses: List<ChallengeResponse>?
    ): ApiResult<Unit> {
        return makeCall {
            val api = createCustomerApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.CustomerPaymentDetails1()
            body.data = InstoreCustomerPaymentsPaymentRequestIdData().apply {
                this.primaryInstrumentId = primaryInstrument
                this.secondaryInstruments =
                    secondaryInstruments?.map(::toSecondaryInstrument)
                this.clientReference = clientReference

                this.preferences = preferences?.let {
                    fromPaymentPreferences(it)
                }
            }

            body.meta = MetaChallenge().apply {
                this.challengeResponses =
                    challengeResponses?.map(::toChallengeResponse) ?: emptyList()
            }

            api.preApprovePaymentSession(
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
}