package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.MerchantProfileResponseAllowedPaymentMethods


class OpenApiAllowedPaymentMethods(
    private val allowedPaymentMethods: MerchantProfileResponseAllowedPaymentMethods
) : au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethods {
    override val giftCard: au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethodsGiftCard
        get() = OpenApiAllowedPaymentMethodsGiftCard(allowedPaymentMethods.giftCard)
    override val creditCard: au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethodsCreditCard
        get() = OpenApiAllowedPaymentMethodsCreditCard(allowedPaymentMethods.creditCard)
    override val paypal: au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethodsPaypal
        get() = OpenApiAllowedPaymentMethodsPaypal(allowedPaymentMethods.payPal)
    override val googlePay: au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethodsGooglePay
        get() = OpenApiAllowedPaymentMethodsGooglePay(allowedPaymentMethods.googlePay)
    override val applePay: au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethodsApplePay
        get() = OpenApiAllowedPaymentMethodsApplePay(allowedPaymentMethods.applePay)
}