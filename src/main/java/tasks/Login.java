package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static userinterface.LoginManagement.*;

public class Login implements Task {


    private final List<String> list;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(INPUT_EMAIL).afterWaitingUntilPresent(),
                Enter.theValue(list.get(2)).into(INPUT_EMAIL),
                Click.on(INPUT_PASS).afterWaitingUntilPresent(),
                Enter.theValue(list.get(3)).into(INPUT_PASS),
                Click.on(LOGIN_BUTTON).afterWaitingUntilPresent()
        );
    }

    public Login(List<String> list) {
        this.list = list;
    }

    public static Login inPage(List<String> list) {
        return Tasks.instrumented(Login.class, list);
    }
}