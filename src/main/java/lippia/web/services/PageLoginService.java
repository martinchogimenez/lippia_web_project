package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.AutomationConstants;
import lippia.web.constants.AutomationData;
import org.testng.Assert;



public class PageLoginService extends ActionManager{

    public static void verifySignInPage() {
        waitVisibility(AutomationConstants.INPUT_EMAIL_LOCATOR);
        Assert.assertTrue(isVisible(AutomationConstants.INPUT_EMAIL_LOCATOR));
        waitVisibility(AutomationConstants.H1_TITULO_XPATH);
        Assert.assertEquals(getText(AutomationConstants.H1_TITULO_XPATH), "AUTHENTICATION", "Title has not been found");
    }
    public static void enterMail() {
        setInput(AutomationConstants.INPUT_EMAIL_LOCATOR, AutomationData.MAIL);
    }
    public static void enterPassw(String text) {
        setInput(AutomationConstants.INPUT_PASS_XPATH, text);
    }
    public static void clickConfirmButton() {
        click(AutomationConstants.BUTTON_SIGNIN_CONFIRM);
    }
}
