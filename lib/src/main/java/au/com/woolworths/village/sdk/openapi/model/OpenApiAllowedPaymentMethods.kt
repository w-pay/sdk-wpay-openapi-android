package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.MerchantProfileResponseAllowedPaymentMethods

class OpenApiAllowedPaymentMethods(
    private val allowedPaymentMethods: MerchantProfileResponseAllowedPaymentMethods
) : au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethods {
    override val giftCard: au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethodsGiftCard?
        get() = allowedPaymentMethods.giftCard?.let { OpenApiAllowedPaymentMethodsGiftCard(it) }

    override val creditCard: au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethodsCreditCard?
        get() = allowedPaymentMethods.creditCard?.let { OpenApiAllowedPaymentMethodsCreditCard(it) }

    override val paypal: au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethodsPaypal?
        get() = allowedPaymentMethods.payPal?.let { OpenApiAllowedPaymentMethodsPaypal(it) }

    override val googlePay: au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethodsGooglePay?
        get() = allowedPaymentMethods.googlePay?.let { OpenApiAllowedPaymentMethodsGooglePay(it) }

    override val applePay: au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethodsApplePay?
        get() = allowedPaymentMethods.applePay?.let { OpenApiAllowedPaymentMethodsApplePay(it) }
}