package au.com.woolworths.village.sdk.model.ext

import au.com.woolworths.village.sdk.model.FraudPayload
import au.com.woolworths.village.sdk.openapi.dto.MetaFraudPayload

fun FraudPayload.fromFraudPayload(): MetaFraudPayload =
    MetaFraudPayload().apply {
        this.message = this@fromFraudPayload.message
        this.provider = this@fromFraudPayload.provider
        this.format = MetaFraudPayload.FormatEnum.valueOf(this@fromFraudPayload.format.toString())
        this.responseFormat = MetaFraudPayload.ResponseFormatEnum.valueOf(this@fromFraudPayload.responseFormat.toString())
        this.version = this@fromFraudPayload.version
    }