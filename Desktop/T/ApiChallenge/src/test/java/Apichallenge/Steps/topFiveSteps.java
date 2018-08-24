package Apichallenge.Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.rest.SerenityRest.given;

public class topFiveSteps {

    @Given("^That I am connected to kafka music$")
    public void thatIAmConnectedToKafkaMusicApp(){
        given().contentType("application/json")
                .when().get("http://localhost:7070/kafka-music/charts/top-five")
                .then().assertThat().statusCode(200)
                .extract().response().body().print();
        // Write code here that turns the phrase above into concrete actionsthrow new PendingException();
    }

    @When("^I request to see the five most played songs$")
    public void iRequestToSeeTheFiveMostPlayedSongs() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I can see the five top songs$")
    public void iCanSeeTheFiveTopSongs() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
