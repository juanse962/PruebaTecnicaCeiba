package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static userinterface.ProductSelectManagement.*;

public class SelectProduct implements Task {


    private final List<String> list;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(SELECT_PRODUCT.of(list.get(1))).afterWaitingUntilPresent(),
                Click.on(SHOPPING_CART_BUTTON).afterWaitingUntilPresent()

        );
    }

    public SelectProduct(List<String> list) {
        this.list = list;
    }

    public static SelectProduct inPage(List<String> list) {
        return Tasks.instrumented(SelectProduct.class, list);
    }
}