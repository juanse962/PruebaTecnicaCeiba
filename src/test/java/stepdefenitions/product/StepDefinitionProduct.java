package stepdefenitions.product;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import question.AnswerProduct;
import tasks.SelectProduct;

public class StepDefinitionProduct {


    @When("the user selects the product")
    public void the_user_selects_the_product(io.cucumber.datatable.DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectProduct.inPage(dataTable.asList()));

    }

    @Then("the user visualize the product in a shopping cart")
    public void the_user_visualize_the_product_in_a_shopping_cart() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerProduct.toThe()));
    }

}