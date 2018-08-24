package Apichallenge.Feature;

import Apichallenge.Steps.genreSteps;
import Apichallenge.Steps.genreStepsBlue;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

//@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(features="src/test/resources/features")
@RunWith(SerenityRunner.class)
public class test {

    @Steps
    genreSteps gnrSteps;
    //topFiveSteps topfSteps;

    @Test
    public void getSongsByGenre() {

            gnrSteps.thatIWantToFilterTheSongsByGenre();
            gnrSteps.iRequestToSeeThePunkSongs();
            gnrSteps.sheShouldSeeTheSongs();


    }

//    @Test
//    public void getTopfive() {
//
//        try {
//            topfSteps.thatIAmConnectedToKafkaMusicApp();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }
//    }
}
