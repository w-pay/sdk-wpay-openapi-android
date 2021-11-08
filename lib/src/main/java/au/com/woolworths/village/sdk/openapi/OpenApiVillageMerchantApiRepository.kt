package au.com.woolworths.village.sdk.openapi

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.api.*
import au.com.woolworths.village.sdk.api.digitalpay.DigitalPayRepository
import au.com.woolworths.village.sdk.auth.ApiAuthenticator
import au.com.woolworths.village.sdk.auth.HasAccessToken
import au.com.woolworths.village.sdk.openapi.api.*
import au.com.woolworths.village.sdk.openapi.api.digitalpay.OpenApiDigitalPayRepository

@Suppress("unused")
val OpenApiMerchantApiRepositoryFactory: MerchantApiRepositoryFactory =
    fun(options: VillageMerchantOptions,
        headers: RequestHeadersFactory,
        authenticator: ApiAuthenticator<HasAccessToken>
    ): VillageMerchantApiRepository {
        return OpenApiVillageMerchantApiRepository(headers, options, authenticator)
    }

class OpenApiVillageMerchantApiRepository(
    requestHeadersFactory: RequestHeadersFactory,
    override val options: VillageMerchantOptions,
    override var authenticator: ApiAuthenticator<HasAccessToken>,
    clientOptions: ClientOptions = ClientOptions()
) : VillageMerchantApiRepository {
    override val admin: AdministrationApiRepository =
        OpenApiAdministrationApiRepository(requestHeadersFactory, options, clientOptions)

    override val dp: DigitalPayRepository =
        OpenApiDigitalPayRepository(requestHeadersFactory, options, clientOptions)

    override val paymentAgreements: MerchantPaymentAgreementsRepository =
        OpenApiMerchantPaymentAgreementsApiRepository(requestHeadersFactory, options, clientOptions)

    override val payments: MerchantPaymentsRepository =
        OpenApiMerchantPaymentsRepository(requestHeadersFactory, options, clientOptions)

    override val paymentSession: MerchantPaymentSessionsRepository =
        OpenApiMerchantPaymentSessionsRepository(requestHeadersFactory, options, clientOptions)

    override val preferences: MerchantPreferencesRepository =
        OpenApiMerchantPreferencesRepository(requestHeadersFactory, options, clientOptions)

    override val qr: QRCodeRepository = OpenApiQRCodeRepository(requestHeadersFactory, options, clientOptions)

    override val schemas: SchemasRepository =
        OpenApiSchemasRepository(requestHeadersFactory, options, clientOptions)

    override val transactions: MerchantTransactionsRepository =
        OpenApiMerchantTransactionsRepository(requestHeadersFactory, options, clientOptions)
}