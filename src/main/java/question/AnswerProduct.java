package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterface.ProductSelectManagement.SHOPPING_CART_NUMBER;

public class AnswerProduct implements Question<Boolean> {
    public static AnswerProduct toThe() {
        return new AnswerProduct();
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        return SHOPPING_CART_NUMBER.resolveFor(actor).isPresent();
    }
}