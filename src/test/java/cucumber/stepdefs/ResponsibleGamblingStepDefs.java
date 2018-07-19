package cucumber.stepdefs;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.BaseTests;


public class ResponsibleGamblingStepDefs {

    BaseTests stepData;

    public ResponsibleGamblingStepDefs(BaseTests stepData){
        this.stepData=stepData;

    }

    @Given("^Navigate to home page$" )
    public void navigateToHomePage(){
        stepData.launchApplication();

    }

    @When("^I check responsible gambling link is present on the home page$")
    public void checkResponsibleGamblingIsOnPage(){}

    @Then("^I click on link$")
    public void clickOnLink(){}

    @And("^I verify \"([^\"]*)\" link is showed on the page$")
    public void verifyLinkShowedOnThePage(String link){}

}