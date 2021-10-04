package au.com.woolworths.village.sdk.model.ext.digitalpay

import au.com.woolworths.village.sdk.model.digitalpay.*
import au.com.woolworths.village.sdk.openapi.api.digitalpay.*
import au.com.woolworths.village.sdk.openapi.dto.*

fun DigitalPayPaymentRequest.fromDigitalPayPaymentRequest(): PaymentsRequest =
    PaymentsRequest().apply {
        this.transactionType = this@fromDigitalPayPaymentRequest.transactionType.fromPaymentTransactionType()
        this.clientReference = this@fromDigitalPayPaymentRequest.clientReference
        this.orderNumber = this@fromDigitalPayPaymentRequest.orderNumber
        this.shippingAddress = this@fromDigitalPayPaymentRequest.shippingAddress.fromShippingAddress()
        this.payments = this@fromDigitalPayPaymentRequest.payments.map {
            it.fromPaymentsRequestPayments()
        }

        this.extendedMerchantData = this@fromDigitalPayPaymentRequest.extendedMerchantData?.map {
            it.fromExtendedMerchantData()
        }

        this.storeData = this@fromDigitalPayPaymentRequest.storeData?.fromDigitalPayStoreData()
        this.fraudPayload = this@fromDigitalPayPaymentRequest.fraudPayload?.fromDigitalPayFraudPayload()
    }

fun DigitalPayStoreData.fromDigitalPayStoreData(): PaymentsRequestStoreData =
    PaymentsRequestStoreData().apply {
        groupId = this@fromDigitalPayStoreData.groupId
        laneId = this@fromDigitalPayStoreData.laneId
        rrn = this@fromDigitalPayStoreData.rrn
        stan = this@fromDigitalPayStoreData.stan
        storeId = this@fromDigitalPayStoreData.storeId
        terminalId = this@fromDigitalPayStoreData.terminalId
        transactionTimestamp = this@fromDigitalPayStoreData.transactionTimestamp
    }

fun ExtendedMerchantData.fromExtendedMerchantData(): PaymentsRequestExtendedMerchantData =
    PaymentsRequestExtendedMerchantData().apply {
        field = PaymentsRequestExtendedMerchantData.FieldEnum.valueOf(
            this@fromExtendedMerchantData.field.toString()
        )
        value = this@fromExtendedMerchantData.value
    }

fun DigitalPayThreeDS.fromDigitalPayThreeDS(): PaymentsRequestThreeDS =
    PaymentsRequestThreeDS().apply {
        aresStatus = PaymentsRequestThreeDS.AresStatusEnum.fromValue(
            this@fromDigitalPayThreeDS.aresStatus.statusCode
        )
        authenticationValue = this@fromDigitalPayThreeDS.authenticationValue
        dsTransID = this@fromDigitalPayThreeDS.dsTransID
        eci = this@fromDigitalPayThreeDS.eci
        messageVersion = this@fromDigitalPayThreeDS.messageVersion
        sli = this@fromDigitalPayThreeDS.sli
        transStatus = PaymentsRequestThreeDS.TransStatusEnum.fromValue(
            this@fromDigitalPayThreeDS.transStatus.statusCode
        )
        veresEnrolled = PaymentsRequestThreeDS.VeresEnrolledEnum.fromValue(
            this@fromDigitalPayThreeDS.veresEnrolled.statusCode
        )
        xid = this@fromDigitalPayThreeDS.xid
    }

fun DigitalPayPayment.fromPaymentsRequestPayments(): PaymentsRequestPayments =
    PaymentsRequestPayments().apply {
        amount = this@fromPaymentsRequestPayments.amount

        this@fromPaymentsRequestPayments.controlData?.let { data ->
            controlData = PaymentsRequestControlData().apply {
                tokenType = PaymentsRequestControlData.TokenTypeEnum.fromValue(data.tokenType.toString())
            }
        }

        passcode = this@fromPaymentsRequestPayments.passcode
        paymentInstrumentId = this@fromPaymentsRequestPayments.paymentInstrumentId
        paymentToken = this@fromPaymentsRequestPayments.paymentToken
        stepUpToken = this@fromPaymentsRequestPayments.stepUpToken
        threeDS = this@fromPaymentsRequestPayments.threeDS?.fromDigitalPayThreeDS()
    }