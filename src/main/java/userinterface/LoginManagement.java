package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class LoginManagement {
    public static final Target INPUT_EMAIL = Target.the("Seleccioanr el input de login")
            .locatedBy("#user-name");
    public static final Target INPUT_PASS = Target.the("Selecciona el input password")
            .locatedBy("#password");
    public static final Target LOGIN_BUTTON = Target.the("Seleccioanr el boton")
            .locatedBy("#login-button");
    public static final Target HOME_PAGE = Target.the("Visualiza el texto de bienvenida a mis productos")
            .locatedBy(".title");
}