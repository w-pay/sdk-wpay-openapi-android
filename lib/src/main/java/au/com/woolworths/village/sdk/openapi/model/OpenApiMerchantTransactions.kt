package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.*
import org.threeten.bp.OffsetDateTime
import java.math.BigDecimal
import java.util.*

class OpenApiMerchantTransactionSummaries(
    private val summaries: List<au.com.woolworths.village.sdk.openapi.dto.MerchantTransactionSummary>
) : MerchantTransactionSummaries {
    override val transactions: List<MerchantTransactionSummary>
        get() = summaries.map { OpenApiMerchantTransactionSummary(it) }
}