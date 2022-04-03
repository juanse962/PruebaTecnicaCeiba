package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static userinterface.ProductSelectManagement.*;

public class SelectProduct implements Task {
    private static String priceValue;
    private static Double priceDouble;


    private final List<String> list;

    @Override
    public <T extends Actor> void performAs(T actor) {
        priceValue = Text.of(PRICE).viewedBy(actor).asString().replace("$", "");
        priceDouble = Double.valueOf(list.get(3).replace("$", ""));

        actor.attemptsTo(
                Ensure.that(PRICE).textValues().contains(list.get(3)),
                Click.on(SELECT_PRODUCT.of(list.get(2))).afterWaitingUntilPresent(),
                Click.on(SHOPPING_CART_BUTTON).afterWaitingUntilPresent(),
                Ensure.that(priceValue).asADouble().isEqualTo(priceDouble),
                Ensure.that(priceValue).matches("(.*).(.*)")
        );
    }

    public SelectProduct(List<String> list) {
        this.list = list;
    }

    public static SelectProduct inPage(List<String> list) {
        return Tasks.instrumented(SelectProduct.class, list);
    }
}