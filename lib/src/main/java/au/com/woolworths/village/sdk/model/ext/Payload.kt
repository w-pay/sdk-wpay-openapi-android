package au.com.woolworths.village.sdk.model.ext

import au.com.woolworths.village.sdk.model.MerchantPayload
import au.com.woolworths.village.sdk.model.PosPayload

fun PosPayload.fromPosPayload(): au.com.woolworths.village.sdk.openapi.dto.PosPayload =
    au.com.woolworths.village.sdk.openapi.dto.PosPayload().apply {
        this.schemaId(this@fromPosPayload.schemaId)
        this.payload(this@fromPosPayload.payload)
    }

fun MerchantPayload.fromMerchantPayload(): au.com.woolworths.village.sdk.openapi.dto.MerchantPayload =
    au.com.woolworths.village.sdk.openapi.dto.MerchantPayload().apply {
        this.schemaId(this@fromMerchantPayload.schemaId)
        this.payload(this@fromMerchantPayload.payload)
    }
