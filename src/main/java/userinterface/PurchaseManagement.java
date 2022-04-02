package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class PurchaseManagement {

    public static final Target S= Target.the("Selecciona el producto")
            .locatedBy("//div[text()= '{0}']");
    public static final Target SHOPPING_CART_BUTTON = Target.the("Selecciona el producto")
            .locatedBy("#add-to-cart-sauce-labs-fleece-jacket");
}//span[contains(text(),'1')]