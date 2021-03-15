package au.com.woolworths.village.sdk.openapi

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.CustomerPreferences
import au.com.woolworths.village.sdk.model.*
import au.com.woolworths.village.sdk.model.CustomerTransactionSummary
import au.com.woolworths.village.sdk.model.PaymentSession
import au.com.woolworths.village.sdk.openapi.model.*
import au.com.woolworths.village.sdk.openapi.dto.*
import org.threeten.bp.OffsetDateTime

/**
 * Uses an Open API generator client to interact with the Village API
 */
class OpenApiVillageCustomerApiRepository(
    requestHeadersFactory: RequestHeadersFactory,
    contextRoot: String
) : OpenApiClientFactory(requestHeadersFactory, contextRoot),
    VillageCustomerApiRepository
{
    override fun checkHealth(): ApiResult<HealthCheck> {
        return makeCall {
            val api = createAdministrationApi()

            val data = api.checkHealth().data

            ApiResult.Success(OpenApiHealthCheck(data))
        }
    }

    override fun retrieveTransactions(
        paymentRequestId: String?,
        page: Int?,
        pageSize: Int?,
        endTime: OffsetDateTime?,
        startTime: OffsetDateTime?
    ): ApiResult<CustomerTransactionSummaries> {
        return makeCall {
            val api = createCustomerApi()

            val data = api.getCustomerTransactions(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                "",
                "",
                "",
                paymentRequestId,
                startTime,
                endTime,
                pageSize,
                page
            ).data

            ApiResult.Success(OpenApiCustomerTransactionSummaries(data.transactions))
        }
    }

    override fun retrieveTransactionDetails(transactionId: String): ApiResult<CustomerTransactionDetails> {
        return makeCall {
            val api = createCustomerApi()

            val data = api.getCustomerTransactionDetails(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                transactionId,
                "",
                "",
                ""
            ).data

            ApiResult.Success(OpenApiCustomerTransactionDetails(data))
        }
    }

    override fun retrievePaymentRequestDetailsByQRCodeId(qrCodeId: String): ApiResult<CustomerPaymentRequest> {
        return makeCall {
            val api = createCustomerApi()

            val data = api.getCustomerPaymentRequestDetailsByQRCodeId(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                qrCodeId,
                "",
                "",
                ""
            ).data

            ApiResult.Success(OpenApiCustomerPaymentRequest(data))
        }
    }

    override fun retrievePaymentRequestDetailsById(paymentRequestId: String): ApiResult<CustomerPaymentRequest> {
        return makeCall {
            val api = createCustomerApi()

            val data = api.getCustomerPaymentRequestDetailsByPaymentId(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                paymentRequestId,
                "",
                "",
                ""
            ).data

            ApiResult.Success(OpenApiCustomerPaymentRequest(data))
        }
    }

    override fun retrievePaymentInstruments(wallet: Wallet): ApiResult<AllPaymentInstruments> {
        return makeCall {
            val api = createCustomerApi()

            val data = api.getCustomerPaymentInstruments(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                "",
                "",
                ""
            ).data

            ApiResult.Success(OpenApiAllPaymentInstruments(
                data.creditCards,
                data.giftCards,
                data.everydayPay
            ))
        }
    }

    override fun deletePaymentInstrument(instrument: PaymentInstrumentIdentifier): ApiResult<Unit> {
        return makeCall {
            val api = createCustomerApi()

            api.deletePaymentInstrument(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                instrument.paymentInstrumentId,
                "",
                "",
                ""
            )

            ApiResult.Success(Unit)
        }
    }

    override fun initiatePaymentInstrumentAddition(
        instrument: PaymentInstrumentAddition
    ): ApiResult<PaymentInstrumentAdditionResult> {
        return makeCall {
            val api = createCustomerApi()

            val body = InstrumentAdditionDetails()
            body.data = InstoreCustomerInstrumentsData().apply {
                clientReference = instrument.clientReference
            }

            val data = api.initiatePaymentInstrumentAddition(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                body,
                "",
                "",
                ""
            ).data

            ApiResult.Success(OpenApiPaymentInstrumentAdditionResult(data))
        }
    }

    override fun retrievePreferences(): ApiResult<CustomerPreferences> {
        return makeCall {
            val api = createCustomerApi()

            val data: Map<String, Map<String, String>> = api.getCustomerPreferences(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                "",
                "",
                ""
            ).data.general as Map<String, Map<String, String>>

            ApiResult.Success(data)
        }
    }

    override fun setPreferences(preferences: CustomerPreferences): ApiResult<Unit> {
        return makeCall {
            val api = createCustomerApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.CustomerPreferences()
            body.data = PreferencesCustomer()
            body.data.general = preferences

            api.setCustomerPreferences(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                body,
                "",
                "",
                ""
            )

            ApiResult.Success(Unit)
        }
    }

    override fun retrievePaymentSessionById(paymentSessionId: String): ApiResult<PaymentSession> {
        return makeCall {
            val api = createCustomerApi()

            val data = api.getCustomerPaymentSession(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                paymentSessionId,
                "",
                "",
                ""
            ).data

            ApiResult.Success(OpenApiPaymentSession(data))
        }
    }

    override fun retrievePaymentSessionByQRCodeId(qrCodeId: String): ApiResult<PaymentSession> {
        return makeCall {
            val api = createCustomerApi()

            val data = api.getCustomerPaymentSessionByQRCodeId(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                qrCodeId,
                "",
                "",
                ""
            ).data

            ApiResult.Success(OpenApiPaymentSession(data))
        }
    }

    override fun updatePaymentSession(
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
                "",
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

    override fun makePayment(
        paymentRequestId: String,
        instrument: PaymentInstrumentIdentifier,
        secondaryInstruments: List<SecondaryPaymentInstrument>?,
        clientReference: String?,
        challengeResponses: List<ChallengeResponse>?
    ): ApiResult<CustomerTransactionSummary> {
        return makeCall {
            val api = createCustomerApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.CustomerPaymentDetails()
            body.data = InstoreCustomerPaymentsPaymentRequestIdData().apply {
                this.primaryInstrumentId = instrument.paymentInstrumentId
                this.secondaryInstruments = secondaryInstruments?.map(::toSecondaryInstrument) ?: emptyList()
                this.clientReference = clientReference
            }

            body.meta = MetaChallenge().apply {
                this.challengeResponses = challengeResponses?.map(::toChallengeResponse) ?: emptyList()
            }

            val data = api.makeCustomerPayment(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                paymentRequestId,
                body,
                "",
                "",
                "",
                instrument.wallet == Wallet.EVERYDAY_PAY
            ).data

            ApiResult.Success(OpenApiCustomerTransactionSummary(data))
        }
    }

    override fun deletePaymentSession(paymentSessionId: String): ApiResult<Unit> {
        return makeCall {
            val api = createCustomerApi()

            api.deleteCustomerPaymentSession(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                paymentSessionId,
                "",
                "",
                ""
            )

            ApiResult.Success(Unit)
        }
    }

    override fun preApprovePaymentSession(
        paymentSessionId: String,
        primaryInstrument: PaymentInstrumentIdentifier,
        secondaryInstruments: List<SecondaryPaymentInstrument>?,
        clientReference: String?,
        challengeResponses: List<ChallengeResponse>?
    ): ApiResult<Unit> {
        return makeCall {
            val api = createCustomerApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.CustomerPaymentDetails1()
            body.data = InstoreCustomerPaymentsPaymentRequestIdData().apply {
                this.primaryInstrumentId = primaryInstrument.paymentInstrumentId
                this.secondaryInstruments = secondaryInstruments?.map(::toSecondaryInstrument) ?: emptyList()
                this.clientReference = clientReference
            }

            body.meta = MetaChallenge().apply {
                this.challengeResponses = challengeResponses?.map(::toChallengeResponse) ?: emptyList()
            }

            api.preApprovePaymentSession(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
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

fun toSecondaryInstrument(instrument: SecondaryPaymentInstrument): InstoreCustomerPaymentsPaymentRequestIdDataSecondaryInstruments {
    val i = InstoreCustomerPaymentsPaymentRequestIdDataSecondaryInstruments()
    i.amount = instrument.amount
    i.instrumentId = instrument.paymentInstrumentId

    return i
}

fun toChallengeResponse(challengeResponse: ChallengeResponse): MetaChallengeChallengeResponses {
    val cr = MetaChallengeChallengeResponses()
    cr.instrumentId = challengeResponse.instrumentId
    cr.reference = challengeResponse.reference
    cr.token = challengeResponse.token
    cr.type = MetaChallengeChallengeResponses.TypeEnum.valueOf(challengeResponse.type.toString())

    return cr
}
