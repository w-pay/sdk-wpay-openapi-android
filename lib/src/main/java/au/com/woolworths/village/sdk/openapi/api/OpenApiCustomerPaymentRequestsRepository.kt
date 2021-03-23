package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.Wallet
import au.com.woolworths.village.sdk.api.CustomerPaymentRequestsRepository
import au.com.woolworths.village.sdk.model.*
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.dto.InstoreCustomerPaymentsPaymentRequestIdData
import au.com.woolworths.village.sdk.openapi.dto.InstoreCustomerPaymentsPaymentRequestIdDataSecondaryInstruments
import au.com.woolworths.village.sdk.openapi.dto.MetaChallenge
import au.com.woolworths.village.sdk.openapi.dto.MetaChallengeChallengeResponses
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

    override fun getByQRCodeId(qrCodeId: String): ApiResult<CustomerPaymentRequest> {
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

    override fun makePayment(
        paymentRequestId: String,
        primaryInstrument: PaymentInstrumentIdentifier,
        secondaryInstruments: List<SecondaryPaymentInstrument>?,
        clientReference: String?,
        challengeResponses: List<ChallengeResponse>?
    ): ApiResult<CustomerTransactionSummary> {
        return makeCall {
            val api = createCustomerApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.CustomerPaymentDetails()
            body.data = InstoreCustomerPaymentsPaymentRequestIdData().apply {
                this.primaryInstrumentId = primaryInstrument.paymentInstrumentId
                this.secondaryInstruments =
                    secondaryInstruments?.map(::toSecondaryInstrument) ?: emptyList()
                this.clientReference = clientReference
            }

            body.meta = MetaChallenge().apply {
                this.challengeResponses =
                    challengeResponses?.map(::toChallengeResponse) ?: emptyList()
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
                primaryInstrument.wallet == Wallet.EVERYDAY_PAY
            ).data

            ApiResult.Success(OpenApiCustomerTransactionSummary(data))
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