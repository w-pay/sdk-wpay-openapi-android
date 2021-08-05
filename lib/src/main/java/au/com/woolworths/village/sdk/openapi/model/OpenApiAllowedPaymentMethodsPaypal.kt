package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.MerchantProfileResponseAllowedPaymentMethodsPayPal


class OpenApiAllowedPaymentMethodsPaypal(
    private val payPal: MerchantProfileResponseAllowedPaymentMethodsPayPal
) : au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethodsPaypal {
    override val clientToken: String
        get() = payPal.clientToken

    override val serviceStatus: au.com.woolworths.village.sdk.model.walletmanagement.ServiceStatus
        get() = au.com.woolworths.village.sdk.model.walletmanagement.ServiceStatus.valueOf(
            payPal.serviceStatus.value
        )
}