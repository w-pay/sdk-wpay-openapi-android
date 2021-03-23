package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.api.CustomerPaymentAgreementsApiRepository
import au.com.woolworths.village.sdk.model.CreatePaymentAgreementRequest
import au.com.woolworths.village.sdk.model.UpdatePaymentAgreementRequest
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.dto.*
import au.com.woolworths.village.sdk.openapi.model.OpenApiPaymentAgreementResponse
import au.com.woolworths.village.sdk.openapi.model.OpenApiPaymentAgreementsResponse

class OpenApiCustomerPaymentAgreementsApiRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions
) : OpenApiClientFactory(requestHeadersFactory, options), CustomerPaymentAgreementsApiRepository {
    override fun list(): ApiResult<OpenApiPaymentAgreementsResponse> {
        return makeCall {
            val api = createCustomerApi()

            val data = api.getPaymentAgreementList(
                getDefaultHeader(api.apiClient, X_WALLET_ID)
            ).data

            ApiResult.Success(OpenApiPaymentAgreementsResponse(data))
        }
    }

   override fun getById(paymentToken: String): ApiResult<OpenApiPaymentAgreementResponse> {
       return makeCall {
           val api = CustomerApi()

           val data = api.getPaymentAgreement(
               getDefaultHeader(api.apiClient, X_WALLET_ID),
               paymentToken
           ).data

           ApiResult.Success(OpenApiPaymentAgreementResponse(data))
       }
   }

    override fun create(paymentAgreement: CreatePaymentAgreementRequest): ApiResult<OpenApiPaymentAgreementResponse> {
        return makeCall {
            val api = CustomerApi()

            val body = CustomerCreatePaymentAgreementRequest()
            body.data = InstoreCustomerPaymentsAgreementsData().apply {
                clientReference = paymentAgreement.clientReference
                customerRef = paymentAgreement.customerRef
                orderNumber = paymentAgreement.orderNumber
                billingAddress = paymentAgreement.billingAddress as BillingAddress
                this.paymentAgreement = paymentAgreement.paymentAgreement as au.com.woolworths.village.sdk.openapi.dto.PaymentAgreement
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
        paymentAgreementRequest: UpdatePaymentAgreementRequest
    ): ApiResult<OpenApiPaymentAgreementResponse> {
        return makeCall {
            val api = CustomerApi()

            val body = CustomerUpdatePaymentAgreementRequest()
            body.data = InstoreCustomerPaymentsAgreementsPaymentTokenData().apply {
                clientReference = paymentAgreementRequest.clientReference
                customerRef = paymentAgreementRequest.customerRef
                billingAddress = paymentAgreementRequest.billingAddress as BillingAddress
                paymentAgreement = paymentAgreementRequest.paymentAgreement as PaymentAgreement
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
