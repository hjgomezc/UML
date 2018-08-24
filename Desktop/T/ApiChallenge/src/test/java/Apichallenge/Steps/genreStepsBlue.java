package Apichallenge.Steps;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.when;


public class genreStepsBlue {

    @Step
    @Given("^That I am connected to kafka music app$")
    public void thatIAmConnectedToKafkaMusicApp() {


        // Write code here that turns the phrase above into concrete actions

    }

    @When("^I requests to see the songs from \"([^\"]*)\"$")
    public void IRequestsToSeeTheSongsFrom(String arg0) {

        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I can see the songs that belong to this genre$")
    public void iCanSeeTheSongsThatBelongToThisGenre() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @Given("^Alejandra wants to get Punk songs$")
    public void alejandraWantsToGetPunkSongs() {

    }

    @When("^she requests to see her song$")
    public void sheRequestsToSeeHerSong() {

    }

    @Then("^she should see the songs$")
    public void sheShouldSeeTheSongs() {

    }
}
