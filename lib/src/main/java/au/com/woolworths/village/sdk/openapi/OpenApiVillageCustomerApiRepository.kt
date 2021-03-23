package au.com.woolworths.village.sdk.openapi

import au.com.woolworths.village.sdk.RequestHeadersFactory
import au.com.woolworths.village.sdk.VillageCustomerApiRepository
import au.com.woolworths.village.sdk.VillageCustomerOptions
import au.com.woolworths.village.sdk.api.*
import au.com.woolworths.village.sdk.api.CustomerPreferencesRepository
import au.com.woolworths.village.sdk.openapi.api.*

/**
 * Uses an Open API generator client to interact with the Village API
 */
class OpenApiVillageCustomerApiRepository(
    requestHeadersFactory: RequestHeadersFactory,
    override val options: VillageCustomerOptions
) : VillageCustomerApiRepository {
    override val admin: AdministrationApiRepository =
        OpenApiAdministrationApiRepository(requestHeadersFactory, options)
    override val instruments: PaymentInstrumentsRepository =
        OpenApiPaymentInstrumentsRepository(requestHeadersFactory, options)
    override val paymentRequests: CustomerPaymentRequestsRepository =
        OpenApiCustomerPaymentRequestsRepository(requestHeadersFactory, options)
    override val paymentSessions: CustomerPaymentSessionsRepository =
        OpenApiCustomerPaymentSessionsRepository(requestHeadersFactory, options)
    override val preferences: CustomerPreferencesRepository =
        OpenApiCustomerPreferencesRepository(requestHeadersFactory, options)
    override val transactions: CustomerTransactionsRepository =
        OpenApiCustomerTransactionsRepository(requestHeadersFactory, options)
}
