package Apichallenge.Steps;

import Apichallenge.Entities.Song;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


import java.util.List;

import static net.serenitybdd.rest.SerenityRest.given;

public class genreSteps {

    private String url = "http://localhost:7070/kafka-music/charts/genre/";
    private RequestSpecification query;
    Response getting;



    @Given("^that I want to filter the songs by genre$")
    public void thatIWantToFilterTheSongsByGenre(){
        this.query = given().contentType("application/json");

        // Write code here that turns the phrase above into concrete actions

    }

    @When("^I request to see the punk songs$")
    public void iRequestToSeeThePunkSongs()  {
        this.url += "punk";
        getting = this.query.when().get(this.url);
        // Write code here that turns the phrase above into concrete actions
    }



        // Write code here that turns the phrase above into concrete actions

    @Then("^she should see the songs$")
    public void sheShouldSeeTheSongs() {
        getting.then().assertThat().statusCode(200);
    }



}
