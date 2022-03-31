package stepdefenitions.login;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import question.Answer;
import tasks.Login;
import tasks.OpenTask;


public class StepDefinitionLoginUser {


    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the user wishes to login an account on the website")
    public void the_user_wishes_to_login_an_account_on_the_website() {
        OnStage.theActor("User").wasAbleTo(OpenTask.theHomePage());
    }

    @When("the user enters his or her data for the creation of a new system")
    public void the_user_enters_his_or_her_data_for_the_creation_of_a_new_system(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.inPage(dataTable.asList()));
    }

    @Then("he must display a message (.*)$")
    public void he_must_display_a_messagee(String string) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(string)));
    }
}
