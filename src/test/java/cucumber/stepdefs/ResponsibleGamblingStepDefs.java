package cucumber.stepdefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageobject.ResponsableGamblingPage;
import utils.BaseTests;


public class ResponsibleGamblingStepDefs {

    BaseTests stepData;
    ResponsableGamblingPage responsableGambling ;

    public ResponsibleGamblingStepDefs(BaseTests stepData) {
        this.stepData = stepData;
    }

    @Given("^Navigate to home page \"([^\"]*)\"$")
    public void navigateToHomePage(String url) {
        stepData.launchApplication(url);
        responsableGambling = new ResponsableGamblingPage(stepData.getWebDriver());
    }

    @When("^I check responsible gambling link is present on the home page$")
    public void checkResponsibleGamblingIsOnPage() {
        Assert.assertTrue(responsableGambling.checkresponsableGambling());
    }

    @Then("^I click on link$")
    public void clickOnLink() {
    }

    @And("^I verify \"([^\"]*)\" link is showed on the page$")
    public void verifyLinkShowedOnThePage(String link) {
    }
}