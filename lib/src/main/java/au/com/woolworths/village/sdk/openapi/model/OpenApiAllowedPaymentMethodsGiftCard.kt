package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.MerchantProfileResponseAllowedPaymentMethodsGiftCard

class OpenApiAllowedPaymentMethodsGiftCard(
    private val giftCard: MerchantProfileResponseAllowedPaymentMethodsGiftCard
) : au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethodsGiftCard {
    override val allowedBins: List<String>
        get() = giftCard.allowedBins

    override val serviceStatus: au.com.woolworths.village.sdk.model.walletmanagement.ServiceStatus
        get() = au.com.woolworths.village.sdk.model.walletmanagement.ServiceStatus.valueOf(giftCard.serviceStatus.value)

    override val pinAlwaysRequired: Boolean?
        get() = giftCard.pinAlwaysRequired
}