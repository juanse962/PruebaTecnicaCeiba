package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterface.PurchaseManagement.THANKS_TEXT;

public class AnswerPurchase implements Question<Boolean> {
    private static String question;

    public static AnswerPurchase toThe(String message) {
        return new AnswerPurchase(message);

    }


    public AnswerPurchase(String message) {
        question = message;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String finish = Text.of(THANKS_TEXT).viewedBy(actor).asString();
        return question.equals(finish);
    }
}
