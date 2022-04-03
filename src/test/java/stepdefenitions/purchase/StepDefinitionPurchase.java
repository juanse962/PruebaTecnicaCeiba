package stepdefenitions.purchase;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import question.AnswerPurchase;
import tasks.PuchaseProduct;
import tasks.SelectProduct;

public class StepDefinitionPurchase {


    @When("the user (.*) (.*) selects the product and confirm purchase$")
    public void the_user_selects_the_product_and_confirm_purchase(String first, String last, DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectProduct.inPage(dataTable.asList()));
        OnStage.theActorInTheSpotlight().attemptsTo(PuchaseProduct.inPage(dataTable.asList(), first, last));

    }

    @Then("the user visualize the purchase succesfull with the message (.*)$")
    public void the_user_visualize_the_purchase_succesfull(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerPurchase.toThe(message)));
    }

}