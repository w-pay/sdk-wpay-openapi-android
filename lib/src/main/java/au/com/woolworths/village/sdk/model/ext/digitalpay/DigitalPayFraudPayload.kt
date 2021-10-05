package au.com.woolworths.village.sdk.model.ext.digitalpay

import au.com.woolworths.village.sdk.model.digitalpay.DigitalPayFraudPayload
import au.com.woolworths.village.sdk.openapi.dto.PaymentsRequestFraudPayload

fun DigitalPayFraudPayload.fromDigitalPayFraudPayload(): PaymentsRequestFraudPayload =
    PaymentsRequestFraudPayload().apply {
        format = PaymentsRequestFraudPayload.FormatEnum.valueOf(
            this@fromDigitalPayFraudPayload.format.toString()
        )
        message = this@fromDigitalPayFraudPayload.message
        provider = this@fromDigitalPayFraudPayload.provider
        responseFormat =
            PaymentsRequestFraudPayload.ResponseFormatEnum.valueOf(
                this@fromDigitalPayFraudPayload.responseFormat.toString()
            )
        version = this@fromDigitalPayFraudPayload.version
    }