package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.Basket
import au.com.woolworths.village.sdk.openapi.dto.BasketItems
import java.math.BigDecimal

class OpenApiBasket(
    private val basket: au.com.woolworths.village.sdk.openapi.dto.Basket
) : Basket {
    override val items: List<Basket.Items>
        get() = basket.items?.let { item -> item.map { OpenApiBasketItem(it) } } ?: emptyList()
}

class OpenApiBasketItem(
    private val item: BasketItems
) : Basket.Items {
    override val label: String
        get() = item.label

    override val description: String?
        get() = item.description

    override val quantity: BigDecimal?
        get() = item.quantity

    override val unitPrice: BigDecimal?
        get() = item.unitPrice

    override val unitMeasure: String?
        get() = item.unitMeasure

    override val totalPrice: BigDecimal?
        get() = item.totalPrice

    override val tags: Map<String, String>
        get() = item.tags?.let { item.tags as Map<String, String> } ?: emptyMap()
}