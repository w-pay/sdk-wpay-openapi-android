package au.com.woolworths.village.sdk.data

import au.com.woolworths.village.sdk.model.Basket
import java.math.BigDecimal

fun aNewBasket(): Basket = TestBasket()

class TestBasket : Basket {
    override val items: List<Basket.Items>
        get() = arrayListOf(TestBasketItem())
}

class TestBasketItem : Basket.Items {
    override val label: String
        get() = "Item 1"

    override val description: String?
        get() = "This is item 1"

    override val quantity: BigDecimal?
        get() = BigDecimal(3)

    override val unitPrice: BigDecimal?
        get() = BigDecimal(2.1)

    override val unitMeasure: String?
        get() = "EACH"

    override val totalPrice: BigDecimal?
        get() = BigDecimal(6.3)

    override val tags: Map<String, String>
        get() = hashMapOf(
            "property1" to "string",
            "property2" to "string"
        )
}