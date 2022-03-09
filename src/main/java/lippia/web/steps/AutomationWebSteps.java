package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.constants.AutomationData;
import lippia.web.services.AutomationService;

public class AutomationWebSteps extends PageSteps {

    @Given("The client is in automationpractice page")
    public void theClientIsInAutomationpracticePage() {
        AutomationService.webNavigation();
    }

    @When("^The client search for word (.*)$")
    public void search(String criteria) {
        AutomationService.enterSearchCriteria(criteria);
        AutomationService.clickSearchButton();
    }

    @Then("The client verify that results are shown properly")
    public void statVerfication(){
        AutomationService.verifyTheResults();
    }

    @And("The client fill the Email adress input")
    public void theClientFillTheEmailAdressInput() {
        AutomationService.verifySignInPage();
        AutomationService.enterSearchCriteriaa(AutomationData.MAIL);
    }

    @When("The client click the button \"(.*)\"$")
    public void theClientClickTheButton() {
        AutomationService.clickButton();
    }

    @And("The client fill the Password input")
    public void theClientFillThePasswordInput() {
        AutomationService.enterSearchCriteriaaa(AutomationData.PASS);
    }

    @Then("The client verify that MY ACCOUNT page is shown")
    public void theClientVerifyThatMYACCOUNTPageIsShown() {
        AutomationService.verifyMyAccountPage();
    }

    @And("The client click the button {string}.")
    public void theClientClicksTheButton(String arg0) {
        AutomationService.clickbButton();
    }

    @And("The client select Sort by Price: Lowest first")
    public void theClientSelectSortByPriceLowestFirst() {
        AutomationService.setSelect();
    }

    @Then("The client verify that results are shown properly.")
    public void theClientVerifyThatResultsAreShownProperly() {
        AutomationService.verifyResults();
    }
}
