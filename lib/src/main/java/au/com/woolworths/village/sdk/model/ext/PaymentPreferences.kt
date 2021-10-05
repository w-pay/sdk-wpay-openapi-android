package au.com.woolworths.village.sdk.model.ext

import au.com.woolworths.village.sdk.model.PaymentPreferences
import au.com.woolworths.village.sdk.openapi.dto.PreferencePayments
import au.com.woolworths.village.sdk.openapi.dto.PreferencePaymentsSecondaryInstruments
import java.util.*

fun PaymentPreferences.fromPaymentPreferences(): PreferencePayments =
    PreferencePayments().apply {
        primaryInstrumentId = this@fromPaymentPreferences.primaryInstrumentId
        secondaryInstruments = this@fromPaymentPreferences.secondaryInstruments?.let {
            PreferencePaymentsSecondaryInstruments().apply {
                enableSecondaryInstruments = it.enableSecondaryInstruments
                exclude = it.exclude
                include = it.include
                order = it.order?.let {
                    PreferencePaymentsSecondaryInstruments.OrderEnum.valueOf(
                        it.toString().toUpperCase(Locale.ROOT)
                    )
                }
            }
        }
    }