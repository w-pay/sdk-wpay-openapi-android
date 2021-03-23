package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.*
import java.math.BigDecimal
import java.util.*

class OpenApiMerchantProfileResponse(
    private val merchantProfileResponse: MerchantProfileResponse
) : au.com.woolworths.village.sdk.model.walletmanagement.MerchantProfileResponse {
    override val allowedPaymentMethods: au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethods
        get() = OpenApiAllowedPaymentMethods(merchantProfileResponse.allowedPaymentMethods)
}