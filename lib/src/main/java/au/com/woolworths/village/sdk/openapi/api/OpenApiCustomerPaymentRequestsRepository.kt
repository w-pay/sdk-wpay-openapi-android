package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.api.CustomerPaymentRequestsRepository
import au.com.woolworths.village.sdk.model.*
import au.com.woolworths.village.sdk.model.CustomerTransactionSummary
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.dto.*
import au.com.woolworths.village.sdk.openapi.model.OpenApiCustomerPaymentRequest
import au.com.woolworths.village.sdk.openapi.model.OpenApiCustomerTransactionSummary

class OpenApiCustomerPaymentRequestsRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions
) : OpenApiClientFactory(requestHeadersFactory, options), CustomerPaymentRequestsRepository {
    override fun getById(paymentRequestId: String): ApiResult<CustomerPaymentRequest> {
        return makeCall {
            val api = createCustomerApi()

            val data = api.getCustomerPaymentRequestDetailsByPaymentId(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                paymentRequestId,
                "",
                "",
                ""
            ).data

            ApiResult.Success(OpenApiCustomerPaymentRequest(data))
        }
    }

    override fun getByQRCodeId(qrCodeId: String): ApiResult<CustomerPaymentRequest> {
        return makeCall {
            val api = createCustomerApi()

            val data = api.getCustomerPaymentRequestDetailsByQRCodeId(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                qrCodeId,
                "",
                "",
                ""
            ).data

            ApiResult.Success(OpenApiCustomerPaymentRequest(data))
        }
    }

    override fun makePayment(
        paymentRequestId: String,
        primaryInstrument: String?,
        secondaryInstruments: List<SecondaryPaymentInstrument>?,
        clientReference: String?,
        preferences: PaymentPreferences?,
        challengeResponses: List<ChallengeResponse>?,
        fraudPayload: FraudPayload?
    ): ApiResult<CustomerTransactionSummary> {
        return makeCall {
            val api = createCustomerApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.CustomerPaymentDetails()
            body.data = CustomerPaymentDetailsData().apply {
                this.primaryInstrumentId = primaryInstrument
                this.secondaryInstruments = secondaryInstruments?.map(::toSecondaryInstrument)
                this.clientReference = clientReference

                this.preferences = preferences?.let {
                    fromPaymentPreferences(it)
                }
            }

            body.meta = Meta().apply {
                this.challengeResponses =
                    challengeResponses?.map(::toChallengeResponse) ?: emptyList()
                fraud = fromFraudPayload(fraudPayload)
            }

            val data = api.makeCustomerPayment(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                paymentRequestId,
                body,
                "",
                "",
                "",
                getDefaultHeader(api.apiClient, X_EVERYDAY_PAY_WALLET)!!.toBoolean()
            ).data

            ApiResult.Success(OpenApiCustomerTransactionSummary(data))
        }
    }
}

fun toSecondaryInstrument(instrument: SecondaryPaymentInstrument): CustomerPaymentDetailsDataSecondaryInstruments {
    val i = CustomerPaymentDetailsDataSecondaryInstruments()
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

fun fromFraudPayload(payload: FraudPayload?): MetaFraudPayload? =
    payload?.let {
        val fraud = MetaFraudPayload()

        fraud.message = it.message
        fraud.provider = it.provider
        fraud.format = MetaFraudPayload.FormatEnum.valueOf(it.format.toString())
        fraud.responseFormat = MetaFraudPayload.ResponseFormatEnum.valueOf(it.responseFormat.toString())
        fraud.version = it.version

        return@let fraud
    }