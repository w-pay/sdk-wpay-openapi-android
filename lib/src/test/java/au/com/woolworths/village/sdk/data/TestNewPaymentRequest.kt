package au.com.woolworths.village.sdk.data

import au.com.woolworths.village.sdk.model.Basket
import au.com.woolworths.village.sdk.model.MerchantPayload
import au.com.woolworths.village.sdk.model.NewPaymentRequest
import au.com.woolworths.village.sdk.model.PosPayload
import java.math.BigDecimal

fun aNewPaymentRequest(): NewPaymentRequest {
    return TestNewPaymentRequest()
}

class TestNewPaymentRequest : NewPaymentRequest {
    override val merchantReferenceId: String
        get() = "123456"

    override val grossAmount: BigDecimal
        get() = BigDecimal(12000)

    override val generateQR: Boolean
        get() = true

    override val maxUses: Int?
        get() = 1

    override val timeToLivePayment: Int?
        get() = 300

    override val timeToLiveQR: Int?
        get() = 60

    override val specificWalletId: String?
        get() = ""

    override val basket: Basket?
        get() = aNewBasket()

    override val posPayload: PosPayload?
        get() = aNewPosPayload()

    override val merchantPayload: MerchantPayload?
        get() = aNewMerchantPayload()
}