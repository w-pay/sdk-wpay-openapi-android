package au.com.woolworths.village.sdk.model.ext.digitalpay

import au.com.woolworths.village.sdk.model.digitalpay.DigitalPayAddress
import au.com.woolworths.village.sdk.openapi.dto.CreatePaymentAgreementRequestBillingAddress
import au.com.woolworths.village.sdk.openapi.dto.PaymentsRequestShippingAddress

fun DigitalPayAddress.fromDigitalPayAddress(): CreatePaymentAgreementRequestBillingAddress =
    CreatePaymentAgreementRequestBillingAddress().apply {
        firstName = this@fromDigitalPayAddress.firstName
        lastName = this@fromDigitalPayAddress.lastName
        email = this@fromDigitalPayAddress.email
        company = this@fromDigitalPayAddress.company
        extendedAddress = this@fromDigitalPayAddress.extendedAddress
        streetAddress = this@fromDigitalPayAddress.streetAddress
        suburb = this@fromDigitalPayAddress.suburb
        stateOrTerritory = this@fromDigitalPayAddress.stateOrTerritory
        postalCode = this@fromDigitalPayAddress.postalCode
        countryCode = this@fromDigitalPayAddress.countryCode
        firstName = this@fromDigitalPayAddress.firstName
        firstName = this@fromDigitalPayAddress.firstName
    }

fun DigitalPayAddress.fromShippingAddress(): PaymentsRequestShippingAddress =
    PaymentsRequestShippingAddress().apply {
        company = this@fromShippingAddress.company
        countryCode = this@fromShippingAddress.countryCode
        email = this@fromShippingAddress.email
        extendedAddress = this@fromShippingAddress.extendedAddress
        firstName = this@fromShippingAddress.firstName
        lastName = this@fromShippingAddress.lastName
        postalCode = this@fromShippingAddress.postalCode
        stateOrTerritory = this@fromShippingAddress.stateOrTerritory
        streetAddress = this@fromShippingAddress.streetAddress
        suburb = this@fromShippingAddress.suburb
    }