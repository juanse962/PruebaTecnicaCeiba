package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import utils.Random;

import java.util.List;

import static java.lang.Integer.parseInt;
import static userinterface.LoginManagement.*;

public class Login implements Task {


    private final List<String> list;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String EMAIL_DOMAIN = "@gmail.com";
        Integer parOrInpar = parseInt(Random.generate());
        actor.attemptsTo(
                Click.on(INPUT_EMAIL).afterWaitingUntilPresent(),
                Enter.theValue(list.get(2)).into(INPUT_EMAIL),
                Click.on(INPUT_PASS).afterWaitingUntilPresent(),
                Enter.theValue(list.get(3)).into(INPUT_PASS),
                Click.on(LOGIN_BUTTON).afterWaitingUntilPresent()

//                Click.on(BUTTON_LOGIN).afterWaitingUntilPresent(),
//                (parOrInpar % 2 == 0) ? Click.on(SELECT_MR).afterWaitingUntilPresent() : Click.on(SELECT_MRS).afterWaitingUntilPresent(),
//                Enter.theValue(list.get(20)).into(INPUT_NAME),
//                Enter.theValue(list.get(21)).into(INPUT_LAST_NAME),
//                Enter.theValue(list.get(16) + Random.generate() + EMAIL_DOMAIN).into(INPUT_CONFIRM_EMAIL),
//                Enter.theValue(list.get(22)).into(INPUT_PASS),
//                Click.on(SELECT_DAY.of(String.valueOf(parseInt(list.get(23)) + 1))).afterWaitingUntilPresent(),
//                Click.on(SELECT_MONTH.of(list.get(24))).afterWaitingUntilPresent(),
//                Click.on(SELECT_YEAR.of(list.get(25))).afterWaitingUntilPresent(),
//                Click.on(SELECT_CHECK_NEWSLETTER).afterWaitingUntilPresent(),
//                Click.on(SELECT_CHECK_PARTNERS).afterWaitingUntilPresent(),
//                Enter.theValue(list.get(26)).into(INPUT_FIRST_NAME_ADDRESS),
//                Enter.theValue(list.get(27)).into(INPUT_LAST_NAME_ADDRESS),
//                Enter.theValue(list.get(28)).into(INPUT_COMPANY),
//                Enter.theValue(list.get(29)).into(INPUT_ADDRESS_1),
//                Enter.theValue(list.get(30)).into(INPUT_ADDRESS_2),
//                Enter.theValue(list.get(31)).into(INPUT_CITY),
//                Click.on(STATE_LIST).afterWaitingUntilPresent(),
//                Click.on(STATE_SELECT.of(list.get(32))).afterWaitingUntilPresent(),
//                Enter.theValue(list.get(33)).into(POSTAL_CODE_ZIP),
//                Click.on(COUNTRY_LIST).afterWaitingUntilPresent(),
//                Click.on(COUNTRY_USA).afterWaitingUntilPresent(),
//                Enter.theValue(list.get(34)).into(OTHER_INPUT),
//                Enter.theValue(list.get(35)).into(HOME_PHONE_INPUT),
//                Enter.theValue(list.get(36)).into(PHONE_MOBILE_INPUT),
//                Enter.theValue(list.get(37)).into(ALIAS_ADDRESS_INPUT),
//                WaitUntil.the(REGISTRY_BUTTON, isClickable()).forNoMoreThan(3).seconds(),
//                Click.on(REGISTRY_BUTTON).afterWaitingUntilPresent()
        );
    }

    public Login(List<String> list) {
        this.list = list;
    }

    public static Login inPage(List<String> list) {
        return Tasks.instrumented(Login.class, list);
    }
}