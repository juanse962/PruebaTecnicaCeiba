package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterface.LoginManagement.HOME_PAGE;
import static userinterface.ProductSelectManagement.SHOPPING_CART_Number;

public class AnswerProduct implements Question<Boolean> {
    public static AnswerProduct toThe() {
        return new AnswerProduct();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
            return SHOPPING_CART_Number.resolveFor(actor).isPresent();
    }
}