package au.com.woolworths.village.sdk.openapi.api.digitalpay

import au.com.woolworths.village.sdk.RequestHeadersFactory
import au.com.woolworths.village.sdk.VillageOptions
import au.com.woolworths.village.sdk.api.digitalpay.*
import au.com.woolworths.village.sdk.api.walletmanagement.*
import au.com.woolworths.village.sdk.openapi.ClientOptions
import au.com.woolworths.village.sdk.openapi.api.walletmanagement.*

class OpenApiDigitalPayRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions,
    clientOptions: ClientOptions = ClientOptions()
) : DigitalPayRepository {
    override val androidPay: AndroidPayApiRepository =
        OpenApiAndroidPayApiRepository(requestHeadersFactory, options, clientOptions)

    override val applePay: ApplePayApiRepository =
        OpenApiApplePayApiRepository(requestHeadersFactory, options, clientOptions)

    override val cards: CardsApiRepository =
        OpenApiCardsApiRepository(requestHeadersFactory, options, clientOptions)

    override val giftcards: GiftcardsApiRepository =
        OpenApiGiftcardsApiRepository(requestHeadersFactory, options, clientOptions)

    override val gifting: GiftingRepository =
        OpenApiGiftingRepository(requestHeadersFactory, options, clientOptions)

    override val googlePay: GooglePayApiRepository =
        OpenApiGooglePayApiRepository(requestHeadersFactory, options, clientOptions)

    override val instruments: InstrumentsApiRepository =
        OpenApiInstrumentsApiRepository(requestHeadersFactory, options, clientOptions)

    override val merchants: MerchantsApiRepository =
        OpenApiMerchantsApiRepository(requestHeadersFactory, options, clientOptions)

    override val openPay: OpenPayApiRepository =
        OpenApiOpenPayApiRepository(requestHeadersFactory, options, clientOptions)

    override val paymentAgreements: PaymentAgreementApiRepository =
        OpenApiPaymentAgreementApiRepository(requestHeadersFactory, options, clientOptions)

    override val payments: PaymentApiRepository =
       OpenApiPaymentApiRepository(requestHeadersFactory, options, clientOptions)

    override val paypal: PayPalApiRepository =
        OpenApiPayPalApiRepository(requestHeadersFactory, options, clientOptions)

    override val transactions: TransactionsApiRepository =
        OpenApiTransactionsApiRepository(requestHeadersFactory, options, clientOptions)

    override val wallet: WalletApiRepository =
        OpenApiWalletApiRepository(requestHeadersFactory, options, clientOptions)
}