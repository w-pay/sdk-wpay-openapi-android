package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.*
import au.com.woolworths.village.sdk.openapi.dto.MerchantPaymentDetail
import org.threeten.bp.OffsetDateTime
import java.math.BigDecimal

class OpenApiMerchantPaymentSummaries(
    private val summaries: List<au.com.woolworths.village.sdk.openapi.dto.MerchantPaymentSummary>
) : MerchantPaymentSummaries {
    override val payments: List<MerchantPaymentSummary>
        get() = summaries.map { OpenApiMerchantPaymentSummary(it) }
}

class OpenApiMerchantPaymentSummary(
    private val payment: au.com.woolworths.village.sdk.openapi.dto.MerchantPaymentSummary
) : MerchantPaymentSummary {
    override val usesRemaining: Int?
        get() = payment.usesRemaining

    override val expiryTime: OffsetDateTime?
        get() = payment.expiryTime

    override val specificWalletId: String?
        get() = payment.specificWalletId

    override val paymentRequestId: String
        get() = payment.paymentRequestId

    override val merchantReferenceId: String
        get() = payment.merchantReferenceId

    override val grossAmount: BigDecimal
        get() = payment.grossAmount
}

class OpenApiMerchantPaymentDetails(
    private val details: MerchantPaymentDetail
) : MerchantPaymentDetails {
    override val basket: Basket?
        get() = details.basket?.let { OpenApiBasket(it) }

    override val posPayload: PosPayload?
        get() = details.posPayload?.let { OpenApiPosPayload(it) }

    override val merchantPayload: MerchantPayload?
        get() = details.merchantPayload?.let { OpenApiMerchantPayload(it) }

    override val usesRemaining: Int?
        get() = details.usesRemaining

    override val expiryTime: OffsetDateTime?
        get() = details.expiryTime

    override val specificWalletId: String?
        get() = details.specificWalletId

    override val paymentRequestId: String
        get() = details.paymentRequestId

    override val merchantReferenceId: String
        get() = details.merchantReferenceId

    override val grossAmount: BigDecimal
        get() = details.grossAmount
}