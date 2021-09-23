package au.com.woolworths.village.sdk.openapi.api.digitalpay

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.RequestHeadersFactory
import au.com.woolworths.village.sdk.VillageOptions
import au.com.woolworths.village.sdk.X_API_KEY
import au.com.woolworths.village.sdk.api.digitalpay.GiftingRepository
import au.com.woolworths.village.sdk.model.ChallengeResponse
import au.com.woolworths.village.sdk.model.FraudPayload
import au.com.woolworths.village.sdk.model.digitalpay.*
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.api.fromFraudPayload
import au.com.woolworths.village.sdk.openapi.api.toChallengeResponse
import au.com.woolworths.village.sdk.openapi.dto.*
import au.com.woolworths.village.sdk.openapi.model.digitalpay.OpenApiDigitalPayGiftingOrderResponse
import au.com.woolworths.village.sdk.openapi.model.digitalpay.OpenApiDigitalPayGiftingProduct
import au.com.woolworths.village.sdk.openapi.model.digitalpay.OpenApiDigitalPayGiftingProductDetail
import au.com.woolworths.village.sdk.openapi.model.digitalpay.OpenApiDigitalPayGiftingQuoteResponse
import org.threeten.bp.OffsetDateTime

class OpenApiGiftingRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions
) : OpenApiClientFactory(requestHeadersFactory, options), GiftingRepository {
    override fun getProductById(productId: String): ApiResult<DigitalPayGiftingProductDetail> {
        return makeCall {
            val api = createGiftingApi()

            val data = api.giftingProductsProductIdGet(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                productId,
                "",
                "",
                ""
            ).data

            return@makeCall ApiResult.Success(OpenApiDigitalPayGiftingProductDetail(data))
        }
    }

    override fun getQuote(quoteRequest: DigitalPayGiftingQuoteRequest): ApiResult<DigitalPayGiftingQuoteResponse> {
        return makeCall {
            val api = createGiftingApi()

            val body = GiftingProductQuoteRequest().apply {
                orderItems = quoteRequest.orderItems.map { item ->
                    au.com.woolworths.village.sdk.openapi.dto.GiftingProductOrderItem().apply {
                        amount = item.amount
                        designId = item.designId
                        isGifting = item.isGifting
                        quantity = item.quantity
                        recipientDetails = toRecipientDetails(item.recipientDetails)
                    }
                }
            }

            val data = api.giftingProductsQuotePost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                body,
                "",
                "",
                ""
            ).data

            return@makeCall ApiResult.Success(OpenApiDigitalPayGiftingQuoteResponse(data))
        }
    }

    override fun listProducts(
        page: Int,
        pageSize: Int,
        lastUpdateDateTime: OffsetDateTime
    ): ApiResult<List<DigitalPayGiftingProduct>> {
        return makeCall {
            val api = createGiftingApi()

            val data = api.giftingProductsGet(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                "",
                "",
                lastUpdateDateTime,
                pageSize, page
            ).data

            return@makeCall ApiResult.Success(
                data.products.map { OpenApiDigitalPayGiftingProduct(it) }
            )
        }
    }

    override fun order(
        orderRequest: DigitalPayGiftingOrderRequest,
        challengeResponses: List<ChallengeResponse>?,
        fraudPayload: FraudPayload?
    ): ApiResult<DigitalPayGiftingOrderResponse> {
        return makeCall {
            val api = createGiftingApi()

            val body = GiftingProductOrderRequest()
            body.data = GiftingProductOrderRequestData().apply {
                billingContact = GiftingProductOrderRequestDataBillingContact().apply {
                    val billingContact = orderRequest.billingContact

                    countryCode = billingContact.countryCode
                    email = billingContact.email
                    extendedAddress = billingContact.extendedAddress
                    firstName = billingContact.firstName
                    lastName = billingContact.lastName
                    mobileNumber = billingContact.mobileNumber
                    postalCode = billingContact.postalCode
                    stateOrTerritory = billingContact.stateOrTerritory
                    streetAddress = billingContact.streetAddress
                    suburb = billingContact.suburb
                }
                discountAmount = orderRequest.discountAmount
                instrumentId = orderRequest.instrumentId
                referenceId = orderRequest.referenceId
                subTotalAmount = orderRequest.subTotalAmount
                totalOrderAmount = orderRequest.totalOrderAmount
                orderItems = orderRequest.orderItems.map { item ->
                    au.com.woolworths.village.sdk.openapi.dto.GiftingProductOrderItem().apply {
                        amount = item.amount
                        designId = item.designId
                        isGifting = item.isGifting
                        quantity = item.quantity
                        recipientDetails = toRecipientDetails(item.recipientDetails)
                    }
                }
            }

            body.meta = Meta().apply {
                this.challengeResponses =
                    challengeResponses?.map(::toChallengeResponse) ?: emptyList()
                fraud = fromFraudPayload(fraudPayload)
            }

            val data = api.giftingProductsOrderPost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                body,
                "",
                "",
                ""
            ).data

            return@makeCall ApiResult.Success(OpenApiDigitalPayGiftingOrderResponse(data))
        }
    }

    private fun toRecipientDetails(
        recipientDetail: RecipientDetail?
    ): GiftingProductOrderItemRecipientDetails? =
        recipientDetail?.let { detail ->
            GiftingProductOrderItemRecipientDetails().apply {
                fromName = detail.fromName
                imageUrl = detail.imageUrl
                message = detail.message
                mobileNumber = detail.mobileNumber
                toName = detail.toName
            }
        }
}