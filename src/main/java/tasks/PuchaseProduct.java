package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import utils.Random;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static userinterface.ProductSelectManagement.SHOPPING_CART_NUMBER;
import static userinterface.PurchaseManagement.*;

public class PuchaseProduct implements Task {


    private final List<String> list;
    private final String last;
    private final String first;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(SHOPPING_CART_NUMBER.of(list.get(1))).afterWaitingUntilPresent(),
                WaitUntil.the(SHOPPING_CART, isClickable()).forNoMoreThan(3).seconds(),
                Click.on(SHOPPING_CART).afterWaitingUntilPresent(),
                Click.on(CHECKOUT_BUTTON).afterWaitingUntilPresent(),
                Enter.theValue(first).into(FIRST_NAME_INPUT),
                Enter.theValue(last).into(LAST_NAME_INPUT),
                Enter.theValue(Random.generate()).into(ZIP_CODE_INPUT),
                Click.on(CONTINUE_BUTTON).afterWaitingUntilPresent(),
                Click.on(FINISH_BUTTON).afterWaitingUntilPresent()
        );
    }

    public PuchaseProduct(List<String> list, String first, String last) {
        this.list = list;
        this.first = first;
        this.last = last;
    }

    public static PuchaseProduct inPage(List<String> list, String first, String last) {
        return Tasks.instrumented(PuchaseProduct.class, list, first, last);
    }
}