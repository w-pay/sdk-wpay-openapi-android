package au.com.woolworths.village.sdk.openapi.api.digitalpay

import au.com.woolworths.village.sdk.RequestHeadersFactory
import au.com.woolworths.village.sdk.VillageOptions
import au.com.woolworths.village.sdk.api.digitalpay.*
import au.com.woolworths.village.sdk.api.walletmanagement.*
import au.com.woolworths.village.sdk.openapi.api.walletmanagement.*

class OpenApiDigitalPayRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions
) : DigitalPayRepository {
    override val androidPay: AndroidPayApiRepository =
        OpenApiAndroidPayApiRepository(requestHeadersFactory, options)

    override val applePay: ApplePayApiRepository =
        OpenApiApplePayApiRepository(requestHeadersFactory, options)

    override val cards: CardsApiRepository =
        OpenApiCardsApiRepository(requestHeadersFactory, options)

    override val giftcards: GiftcardsApiRepository =
        OpenApiGiftcardsApiRepository(requestHeadersFactory, options)

    override val gifting: GiftingRepository =
        OpenApiGiftingRepository(requestHeadersFactory, options)

    override val googlePay: GooglePayApiRepository =
        OpenApiGooglePayApiRepository(requestHeadersFactory, options)

    override val instruments: InstrumentsApiRepository =
        OpenApiInstrumentsApiRepository(requestHeadersFactory, options)

    override val merchants: MerchantsApiRepository =
        OpenApiMerchantsApiRepository(requestHeadersFactory, options)

    override val openPay: OpenPayApiRepository =
        OpenApiOpenPayApiRepository(requestHeadersFactory, options)

    override val paymentAgreements: PaymentAgreementApiRepository =
        OpenApiPaymentAgreementApiRepository(requestHeadersFactory, options)

    override val payments: PaymentApiRepository =
       OpenApiPaymentApiRepository(requestHeadersFactory, options)

    override val paypal: PayPalApiRepository =
        OpenApiPayPalApiRepository(requestHeadersFactory, options)

    override val transactions: TransactionsApiRepository =
        OpenApiTransactionsApiRepository(requestHeadersFactory, options)

    override val wallet: WalletApiRepository =
        OpenApiWalletApiRepository(requestHeadersFactory, options)
}