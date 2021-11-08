package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.RequestHeadersFactory
import au.com.woolworths.village.sdk.VillageOptions
import au.com.woolworths.village.sdk.X_WALLET_ID
import au.com.woolworths.village.sdk.api.CustomerPaymentAgreementsApiRepository
import au.com.woolworths.village.sdk.model.ChallengeResponse
import au.com.woolworths.village.sdk.model.CreatePaymentAgreementRequest
import au.com.woolworths.village.sdk.model.FraudPayload
import au.com.woolworths.village.sdk.model.UpdatePaymentAgreementRequest
import au.com.woolworths.village.sdk.model.ext.fromFraudPayload
import au.com.woolworths.village.sdk.openapi.ClientOptions
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.dto.*
import au.com.woolworths.village.sdk.openapi.model.OpenApiPaymentAgreementResponse
import au.com.woolworths.village.sdk.openapi.model.OpenApiPaymentAgreements

class OpenApiCustomerPaymentAgreementsApiRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions,
    clientOptions: ClientOptions = ClientOptions()
) : OpenApiClientFactory(requestHeadersFactory, options, clientOptions),
    CustomerPaymentAgreementsApiRepository
{
    override fun list(): ApiResult<OpenApiPaymentAgreements> {
        return makeCall {
            val api = createCustomerApi()

            val data = api.getPaymentAgreementList(
                getDefaultHeader(api.apiClient, X_WALLET_ID)
            ).data

            ApiResult.Success(OpenApiPaymentAgreements(data))
        }
    }

   override fun getById(paymentToken: String): ApiResult<OpenApiPaymentAgreementResponse> {
       return makeCall {
           val api = createCustomerApi()

           val data = api.getPaymentAgreement(
               getDefaultHeader(api.apiClient, X_WALLET_ID),
               paymentToken
           ).data

           ApiResult.Success(OpenApiPaymentAgreementResponse(data))
       }
   }

    override fun create(
        paymentAgreement: CreatePaymentAgreementRequest,
        challengeResponses: List<ChallengeResponse>?,
        fraudPayload: FraudPayload?
    ): ApiResult<OpenApiPaymentAgreementResponse> {
        return makeCall {
            val api = createCustomerApi()

            val body = CustomerCreatePaymentAgreementRequest()
            body.data = InstoreCustomerPaymentsAgreementsData().apply {
                clientReference = paymentAgreement.clientReference
                customerRef = paymentAgreement.customerRef
                orderNumber = paymentAgreement.orderNumber
                billingAddress = paymentAgreement.billingAddress as BillingAddress
                this.paymentAgreement = paymentAgreement.paymentAgreement as au.com.woolworths.village.sdk.openapi.dto.PaymentAgreement
            }

            body.meta = Meta().apply {
                this.challengeResponses = challengeResponses?.map(::toChallengeResponse) ?: emptyList()
                fraud = fraudPayload?.fromFraudPayload()
            }

            val data = api.createCustomerPaymentAgreement(
                getDefaultHeader(api.apiClient, X_WALLET_ID),
                body
            ).data

            ApiResult.Success(OpenApiPaymentAgreementResponse(data))
        }
    }

    override fun update(
        paymentToken: String,
        paymentAgreement: UpdatePaymentAgreementRequest,
        challengeResponses: List<ChallengeResponse>?,
        fraudPayload: FraudPayload?
    ): ApiResult<OpenApiPaymentAgreementResponse> {
        return makeCall {
            val api = createCustomerApi()

            val body = CustomerUpdatePaymentAgreementRequest()
            body.data = InstoreCustomerPaymentsAgreementsPaymentTokenData().apply {
                clientReference = paymentAgreement.clientReference
                customerRef = paymentAgreement.customerRef
                billingAddress = paymentAgreement.billingAddress as BillingAddress
                this.paymentAgreement = paymentAgreement.paymentAgreement as PaymentAgreement
            }

            body.meta = Meta().apply {
                this.challengeResponses = challengeResponses?.map(::toChallengeResponse) ?: emptyList()
                fraud = fraudPayload?.fromFraudPayload()
            }

            val data = api.updateCustomerPaymentAgreement(
                getDefaultHeader(api.apiClient, X_WALLET_ID),
                paymentToken,
                body
            ).data

            ApiResult.Success(OpenApiPaymentAgreementResponse(data))
        }
    }
}
