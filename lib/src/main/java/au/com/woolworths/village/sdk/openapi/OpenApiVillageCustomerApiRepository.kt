package au.com.woolworths.village.sdk.openapi

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.api.*
import au.com.woolworths.village.sdk.api.CustomerPreferencesRepository
import au.com.woolworths.village.sdk.api.digitalpay.DigitalPayRepository
import au.com.woolworths.village.sdk.auth.ApiAuthenticator
import au.com.woolworths.village.sdk.auth.HasAccessToken
import au.com.woolworths.village.sdk.openapi.api.*
import au.com.woolworths.village.sdk.openapi.api.digitalpay.OpenApiDigitalPayRepository

@Suppress("unused")
val OpenApiCustomerApiRepositoryFactory: CustomerApiRepositoryFactory =
    fun(options: VillageCustomerOptions,
        headers: RequestHeadersFactory,
        authenticator: ApiAuthenticator<HasAccessToken>
    ): VillageCustomerApiRepository {
        return OpenApiVillageCustomerApiRepository(headers, options, authenticator)
    }

/**
 * Uses an Open API generator client to interact with the Village API
 */
class OpenApiVillageCustomerApiRepository(
    requestHeadersFactory: RequestHeadersFactory,
    override val options: VillageCustomerOptions,
    override var authenticator: ApiAuthenticator<HasAccessToken>,
    clientOptions: ClientOptions = ClientOptions()
) : VillageCustomerApiRepository {
    override val admin: AdministrationApiRepository =
        OpenApiAdministrationApiRepository(requestHeadersFactory, options, clientOptions)

    override val dp: DigitalPayRepository =
        OpenApiDigitalPayRepository(requestHeadersFactory, options, clientOptions)

    override val instruments: PaymentInstrumentsRepository =
        OpenApiPaymentInstrumentsRepository(requestHeadersFactory, options, clientOptions)

    override val paymentAgreements: CustomerPaymentAgreementsApiRepository =
        OpenApiCustomerPaymentAgreementsApiRepository(requestHeadersFactory, options, clientOptions)

    override val paymentRequests: CustomerPaymentRequestsRepository =
        OpenApiCustomerPaymentRequestsRepository(requestHeadersFactory, options, clientOptions)

    override val paymentSessions: CustomerPaymentSessionsRepository =
        OpenApiCustomerPaymentSessionsRepository(requestHeadersFactory, options, clientOptions)

    override val preferences: CustomerPreferencesRepository =
        OpenApiCustomerPreferencesRepository(requestHeadersFactory, options, clientOptions)

    override val termsAndConditions: CustomerTermsAndConditionsApiRepository =
        OpenApiCustomerTermsAndConditionsApiRepository(requestHeadersFactory, options, clientOptions)

    override val transactions: CustomerTransactionsRepository =
        OpenApiCustomerTransactionsRepository(requestHeadersFactory, options, clientOptions)
}
