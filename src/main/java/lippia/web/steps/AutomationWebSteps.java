package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.constants.AutomationData;
import lippia.web.services.PageHomeService;
import lippia.web.services.PageLoginService;
import lippia.web.services.PageSearchResultService;

public class AutomationWebSteps extends PageSteps {

    @Given("The client is in Home page")
    public void theClientIsInHomePage() {
        PageHomeService.webNavigation();
    }

    @When("^The client search for word (.*)$")
    public void search(String word) {
        PageHomeService.enterSearchWord(word);
        PageHomeService.clickSearchButton();
    }

    @Then("The client verify that results are shown properly")
    public void statVerfication(){
        PageSearchResultService.verifyTheResults();
    }

    @And("The client fill the Password input")
    public void theClientFillThePasswordInput() {
        PageLoginService.enterPassw(AutomationData.PASS);
    }

    @Then("The client verify that MY ACCOUNT page is shown")
    public void theClientVerifyThatMYACCOUNTPageIsShown() {
        PageSearchResultService.verifyMyAccountPage();
    }

    @And("The client select Sort by Price: Lowest first")
    public void theClientSelectSortByPriceLowestFirst() {
        PageSearchResultService.setSelect();
    }

    @Then("The client verify that results are shown properly.")
    public void theClientVerifyThatResultsAreShownProperly() {
        PageSearchResultService.verifyResults();
    }

    @And("The client fill the Email address input")
    public void theClientFillTheEmailAddressInput() {
        PageLoginService.verifySignInPage();
        PageLoginService.enterMail();
    }

    @When("The client click the button Sign in")
    public void theClientClickTheButtonSignIn() {
        PageHomeService.clickSigninButton();
    }

    @And("The client click the button Sign in to confirm the data")
    public void theClientClickTheButtonSignInToConfirmTheData() {
        PageLoginService.clickConfirmButton();
    }
}
