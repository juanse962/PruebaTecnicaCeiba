package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ProductSelectManagement {

    public static final Target SELECT_PRODUCT= Target.the("Selecciona el producto")
            .locatedBy("//div[text()= '{0}']");
    public static final Target SHOPPING_CART_BUTTON = Target.the("Selecciona el producto")
            .locatedBy("#add-to-cart-sauce-labs-fleece-jacket");
    public static final Target SHOPPING_CART_Number = Target.the("Selecciona el producto")
            .locatedBy("//span[contains(text(),'1')]");
}