package au.com.woolworths.village.sdk.openapi

import au.com.woolworths.village.sdk.RequestHeadersFactory
import au.com.woolworths.village.sdk.VillageMerchantApiRepository
import au.com.woolworths.village.sdk.VillageMerchantOptions
import au.com.woolworths.village.sdk.api.*
import au.com.woolworths.village.sdk.openapi.api.*

class OpenApiVillageMerchantApiRepository(
    requestHeadersFactory: RequestHeadersFactory,
    override val options: VillageMerchantOptions
) : VillageMerchantApiRepository {
    override val admin: AdministrationApiRepository =
        OpenApiAdministrationApiRepository(requestHeadersFactory, options)
    override val payments: MerchantPaymentsRepository =
        OpenApiMerchantPaymentsRepository(requestHeadersFactory, options)
    override val paymentSession: MerchantPaymentSessionsRepository =
        OpenApiMerchantPaymentSessionsRepository(requestHeadersFactory, options)
    override val preferences: MerchantPreferencesRepository =
        OpenApiMerchantPreferencesRepository(requestHeadersFactory, options)
    override val qr: QRCodeRepository = OpenApiQRCodeRepository(requestHeadersFactory, options)
    override val schemas: SchemasRepository =
        OpenApiSchemasRepository(requestHeadersFactory, options)
    override val transactions: MerchantTransactionsRepository =
        OpenApiMerchantTransactionsRepository(requestHeadersFactory, options)
}