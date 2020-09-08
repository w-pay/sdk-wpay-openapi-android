package au.com.woolworths.village.sdk.data

import au.com.woolworths.village.sdk.model.TransactionRefundDetails

fun aNewTransactionRefund(): TransactionRefundDetails {
    return TestTransactionRefundDetails()
}

class TestTransactionRefundDetails : TransactionRefundDetails {
    override val reason: String
        get() = "no reason"

    override val clientReference: String?
        get() = null
}