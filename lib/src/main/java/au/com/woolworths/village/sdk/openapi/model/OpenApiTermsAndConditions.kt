package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.TermsAndConditionsAcceptance
import au.com.woolworths.village.sdk.model.TermsAndConditionsAcceptances
import au.com.woolworths.village.sdk.openapi.dto.CustomerTermsAndConditionsAcceptance
import au.com.woolworths.village.sdk.openapi.dto.CustomerTermsAndConditionsResultData
import java.math.BigDecimal

class OpenApiTermsAndConditionsAcceptances(
    private val data: CustomerTermsAndConditionsResultData
) : TermsAndConditionsAcceptances {
    override val termsAndConditionsAcceptances: List<TermsAndConditionsAcceptance>
        get() = data.termsAndConditionsAcceptances?.map { OpenApiTermsAndConditionsAcceptance(it) } ?: emptyList()
}

class OpenApiTermsAndConditionsAcceptance(
    private val data: CustomerTermsAndConditionsAcceptance
) : TermsAndConditionsAcceptance {
    override val type: String
        get() = data.type

    override val version: String
        get() = data.version

    override val timestamp: BigDecimal
        get() = data.timestamp
}