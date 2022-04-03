package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class PurchaseManagement {

    public static final Target CHECKOUT_BUTTON = Target.the("hace click en el boton checkout")
            .locatedBy("#checkout");
    public static final Target FIRST_NAME_INPUT = Target.the("Ingresa el primer nombre")
            .locatedBy("#first-name");
    public static final Target LAST_NAME_INPUT = Target.the("Ingresa su apellido")
            .locatedBy("#last-name");
    public static final Target ZIP_CODE_INPUT = Target.the("Ingresa su codigo postal")
            .locatedBy("#postal-code");
    public static final Target SHOPPING_CART = Target.the("Hace click en el carrito de compra")
            .locatedBy("#shopping_cart_container ");
    public static final Target CONTINUE_BUTTON = Target.the("Hace click en bnoton continue")
            .locatedBy("//input[@id='continue']");
    public static final Target FINISH_BUTTON = Target.the("Hace click en el boton finalizar compra")
            .locatedBy("#finish");
    public static final Target THANKS_TEXT = Target.the("Visualiza el texto de agredecimiento")
            .locatedBy("//h2");
}