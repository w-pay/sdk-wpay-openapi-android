package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.MerchantProfileResponseAllowedPaymentMethodsApplePay


class OpenApiAllowedPaymentMethodsApplePay(
    private val applePay: MerchantProfileResponseAllowedPaymentMethodsApplePay
) : au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethodsApplePay {
    override val creditCard: au.com.woolworths.village.sdk.model.walletmanagement.Card
        get() = OpenApiGooglePayCreditCard(applePay.creditCard)
    override val debitCard: au.com.woolworths.village.sdk.model.walletmanagement.Card
        get() = OpenApiGooglePayDebitCard(applePay.debitCard)
    override val serviceStatus: au.com.woolworths.village.sdk.model.walletmanagement.ServiceStatus
        get() = au.com.woolworths.village.sdk.model.walletmanagement.ServiceStatus.valueOf(applePay.serviceStatus.value)
}