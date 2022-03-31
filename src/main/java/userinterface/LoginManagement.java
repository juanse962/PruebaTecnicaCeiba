package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class LoginManagement {
    public static final Target INPUT_EMAIL = Target.the("Seleccioanr el login")
            .locatedBy("#user-name");
    public static final Target INPUT_PASS= Target.the("Seleccioanr el login")
            .locatedBy("#password");
    public static final Target LOGIN_BUTTON= Target.the("Seleccioanr el login")
            .locatedBy("#login-button");
    public static final Target HOME_PAGE= Target.the("Visualiza el texto Home Page de bienvenida")
            .locatedBy(".title");
}