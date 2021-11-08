package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.api.CustomerPaymentRequestsRepository
import au.com.woolworths.village.sdk.model.*
import au.com.woolworths.village.sdk.model.CustomerTransactionSummary
import au.com.woolworths.village.sdk.model.ImmediatePaymentRequest
import au.com.woolworths.village.sdk.model.ext.digitalpay.fromPaymentTransactionType
import au.com.woolworths.village.sdk.model.ext.fromFraudPayload
import au.com.woolworths.village.sdk.model.ext.fromMerchantPayload
import au.com.woolworths.village.sdk.model.ext.fromPaymentPreferences
import au.com.woolworths.village.sdk.model.ext.fromPosPayload
import au.com.woolworths.village.sdk.openapi.ClientOptions
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.dto.*
import au.com.woolworths.village.sdk.openapi.model.OpenApiCustomerPaymentRequest
import au.com.woolworths.village.sdk.openapi.model.OpenApiCustomerTransactionSummary

class OpenApiCustomerPaymentRequestsRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions,
    clientOptions: ClientOptions = ClientOptions()
) : OpenApiClientFactory(requestHeadersFactory, options, clientOptions),
    CustomerPaymentRequestsRepository
{
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
        fraudPayload: FraudPayload?,
        transactionType: au.com.woolworths.village.sdk.model.digitalpay.PaymentTransactionType?,
        allowPartialSuccess: Boolean?
    ): ApiResult<CustomerTransactionSummary> {
        return makeCall {
            val api = createCustomerApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.CustomerPaymentDetails()
            body.data = CustomerPaymentDetailsData().apply {
                this.primaryInstrumentId = primaryInstrument
                this.secondaryInstruments = secondaryInstruments?.map(::toSecondaryInstrument)
                this.clientReference = clientReference
                this.allowPartialSuccess = allowPartialSuccess
                this.transactionType = transactionType?.fromPaymentTransactionType()
                this.preferences = preferences?.fromPaymentPreferences()
            }

            body.meta = Meta().apply {
                this.challengeResponses =
                    challengeResponses?.map(::toChallengeResponse) ?: emptyList()
                fraud = fraudPayload?.fromFraudPayload()
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

    override fun makeImmediatePayment(
        immediatePaymentRequest: ImmediatePaymentRequest,
        challengeResponses: List<ChallengeResponse>?,
        fraudPayload: FraudPayload?
    ): ApiResult<CustomerTransactionSummary> {
        return makeCall {
            val api = createCustomerApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.ImmediatePaymentRequest()
            body.data = ImmediatePaymentRequestData().apply {
                clientReference = immediatePaymentRequest.clientReference
                orderNumber = immediatePaymentRequest.orderNumber
                skipRollback = immediatePaymentRequest.skipRollback
                allowPartialSuccess = immediatePaymentRequest.allowPartialSuccess
                payments = immediatePaymentRequest.payments.map { item ->
                    ImmediatePaymentRequestDataPayments().apply {
                        paymentInstrumentId = item.paymentInstrumentId
                        amount = item.amount
                    }
                }
                posPayload = immediatePaymentRequest.posPayload?.fromPosPayload()
                merchantPayload = immediatePaymentRequest.merchantPayload?.fromMerchantPayload()
                transactionType = immediatePaymentRequest.transactionType?.fromPaymentTransactionType()
            }

            body.meta = Meta().apply {
                this.challengeResponses =
                    challengeResponses?.map(::toChallengeResponse) ?: emptyList()
                fraud = fraudPayload?.fromFraudPayload()
            }

            val data = api.makeImmediateCustomerPayments(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
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
    cr.type = MetaChallengeChallengeResponses.TypeEnum.valueOf(challengeResponse.type.value)

    return cr
}