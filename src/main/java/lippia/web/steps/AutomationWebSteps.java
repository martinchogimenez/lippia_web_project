package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.constants.AutomationConstants;
import lippia.web.services.AutomationHomeService;
import lippia.web.services.AutomationSearchService;

public class AutomationWebSteps extends PageSteps {

    @Given("The client is in automationpractice page")
    public void theClientIsInAutomationpracticePage() {
        AutomationHomeService.navegarWeb();
    }

    @When("^The client search for word (.*)$")
    public void search(String criteria) {
        AutomationHomeService.enterSearchCriteria(criteria);
        AutomationHomeService.clickSearchButton();
    }

    @Then("The client verify that results are shown properly")
    public void statVerfication() {
        AutomationSearchService.verifyResults();
    }

        @And("The client fill the Email adress input")
            public void theClientFillTheEmailAdressInput() {
                AutomationSearchService.verifySignInPage();
                AutomationHomeService.enterSearchCriteriaa(AutomationConstants.MAIL);
            }

    @When("The client click the button \"(.*)\"$")
    public void theClientClickTheButton(String button) {
        AutomationHomeService.clickButton();
    }

    @And("The client fill the Password input")
    public void theClientFillThePasswordInput() {
        AutomationHomeService.enterSearchCriteriaaa(AutomationConstants.PASS);

    }


    @Then("The client verify that MY ACCOUNT page is shown")
    public void theClientVerifyThatMYACCOUNTPageIsShown() {
        AutomationSearchService.verifyMyAccountPage();
    }

    @And("The client click the button {string}.")
    public void theClientClicksTheButton(String arg0) {
        AutomationHomeService.clickbButton();

    }
    
    @And("The client select Sort by Price: Lowest first")
    public void theClientSelectSortByPriceLowestFirst() {
        AutomationHomeService.setSelect();
    }

    @Then("The client verify that results are shown properly.")
    public void theClientVerifyThatResultsAreShownProperly() {
        AutomationHomeService.verifyResults();
    }
}
