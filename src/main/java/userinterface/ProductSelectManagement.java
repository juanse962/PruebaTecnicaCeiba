package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ProductSelectManagement {

    public static final Target SELECT_PRODUCT = Target.the("Selecciona el producto")
            .locatedBy("//div[text()= '{0}']");
    public static final Target PRICE = Target.the("visualiza el precio")
            .locatedBy("//div[4]//div[@class='inventory_item_price']");
    public static final Target SHOPPING_CART_BUTTON = Target.the("Hace click en el carrito de compra")
            .locatedBy("#add-to-cart-sauce-labs-fleece-jacket");
    public static final Target SHOPPING_CART_NUMBER = Target.the("Visualiza que el producto fue agregado")
            .locatedBy("//span[contains(text(),'1')]");
}