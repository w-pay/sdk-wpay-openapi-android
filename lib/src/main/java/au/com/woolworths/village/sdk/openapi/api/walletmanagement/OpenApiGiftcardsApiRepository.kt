package au.com.woolworths.village.sdk.openapi.api.walletmanagement

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.api.walletmanagement.GiftcardsApiRepository
import au.com.woolworths.village.sdk.model.walletmanagement.GiftcardsBalanceRequest
import au.com.woolworths.village.sdk.model.walletmanagement.GiftcardsBalanceResponse
import au.com.woolworths.village.sdk.model.walletmanagement.TokenizeGiftcardRequest
import au.com.woolworths.village.sdk.model.walletmanagement.TokenizeGiftcardResponse
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.dto.*
import au.com.woolworths.village.sdk.openapi.model.OpenApiGiftcardsBalanceResponse
import au.com.woolworths.village.sdk.openapi.model.OpenApiGuestTokenizeGiftcardResponse
import au.com.woolworths.village.sdk.openapi.model.OpenApiTokenizeGiftcardResponse

class OpenApiGiftcardsApiRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions
) : OpenApiClientFactory(requestHeadersFactory, options), GiftcardsApiRepository {
    override fun tokenize(tokenizeGiftcardRequest: au.com.woolworths.village.sdk.model.walletmanagement.TokenizeGiftcardRequest):
            ApiResult<au.com.woolworths.village.sdk.model.walletmanagement.TokenizeGiftcardResponse> {
        return makeCall {
            val api = createWalletManagementApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.TokenizeGiftcardRequest()
            body.cardNumber = tokenizeGiftcardRequest.cardNumber
            body.pinCode = tokenizeGiftcardRequest.pinCode
            body.primary = tokenizeGiftcardRequest.primary
            body.save = tokenizeGiftcardRequest.save

            val response = api.giftcardsTokenizePost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                body,
                "",
                "",
                "",
                ""
            )

            return@makeCall ApiResult.Success(
                OpenApiTokenizeGiftcardResponse(
                    response
                )
            )
        }
    }

    override fun guestTokenize(
        tokenizeGiftcardRequest: au.com.woolworths.village.sdk.model.walletmanagement.TokenizeGiftcardRequest
    ): ApiResult<au.com.woolworths.village.sdk.model.walletmanagement.TokenizeGiftcardResponse> {
        return makeCall {
            val api = createWalletManagementApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.GuestTokenizeGiftcardRequest()
            body.cardNumber = tokenizeGiftcardRequest.cardNumber
            body.pinCode = tokenizeGiftcardRequest.pinCode

            val response = api.guestGiftcardsTokenizePost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                body,
                "",
                "",
                ""
            )

            return@makeCall ApiResult.Success(
                OpenApiGuestTokenizeGiftcardResponse(
                    response
                )
            )
        }
    }

    override fun balance(giftcardsBalanceRequest: au.com.woolworths.village.sdk.model.walletmanagement.GiftcardsBalanceRequest):
            ApiResult<au.com.woolworths.village.sdk.model.walletmanagement.GiftcardsBalanceResponse> {
        return makeCall {
            val api = createWalletManagementApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.GiftcardsBalanceRequest()
            body.giftCards =
                giftcardsBalanceRequest.giftCards.map(::toGiftCards)
            body.giftCardInstruments =
                giftcardsBalanceRequest.giftCardInstruments.map(::toGiftCardInstruments)

            val response = api.giftcardsBalancePost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                body,
                "",
                "",
                "",
                ""
            )

            return@makeCall ApiResult.Success(
                OpenApiGiftcardsBalanceResponse(
                    response
                )
            )
        }
    }


    fun toGiftCards(card: au.com.woolworths.village.sdk.model.walletmanagement.GiftCardBalenceGiftCard): GiftcardsBalanceRequestGiftCards {
        val i = GiftcardsBalanceRequestGiftCards()
        i.cardNumber = card.cardNumber
        i.pinCode = card.pinCode

        return i
    }


    fun toGiftCardInstruments(instrument: au.com.woolworths.village.sdk.model.walletmanagement.GiftCardInstrument): GiftcardsBalanceRequestGiftCardInstruments {
        val i = GiftcardsBalanceRequestGiftCardInstruments()
        i.paymentInstrumentId = instrument.paymentInstrumentId
        return i
    }
}
