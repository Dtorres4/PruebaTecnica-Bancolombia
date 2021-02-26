package co.com.choucair.certification.academy.stepdefinitions;


import co.com.choucair.certification.academy.model.AcademyChoucairData;
import co.com.choucair.certification.academy.questions.Answer;
import co.com.choucair.certification.academy.tasks.Login;
import co.com.choucair.certification.academy.tasks.OpenUp;
import co.com.choucair.certification.academy.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast()); }

//    @Given("^than brandon wants to learn automation at the academy Choucair$")
//    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair() {
//        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(),(Login.onThePage()));
//    }
//
//    @When("^he search for the course (.*) on the choucair academy platform$")
//    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(String course) {
//        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
//    }
//
//    @Then("^he finds the course called resources (.*)$")
//    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(String question) {
//        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
//    }

    @Given("^than Daniel want to learn automation at the Academy choucair$")
    public void thanDanielWantToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData)throws Exception{
        OnStage.theActorCalled("Daniel").wasAbleTo(OpenUp.thePage(), Login.
                onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword()));
    }

    @When("^he search for the course on the Choucair Academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData)
        throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^he finds the course called$")
    public void heFindsTheCourseCalledRecursosAutomatizacionBancolombia(List<AcademyChoucairData> academyChoucairData) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }

}