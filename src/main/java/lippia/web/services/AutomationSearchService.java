package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.AutomationConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class AutomationSearchService extends ActionManager {

    private static WebElement stats() {
        return getElement(AutomationConstants.STATS_ID);
    }

    public static String getStats() {
        return stats().getText();
    }


    public static void verifyResults(){
        Assert.assertFalse(getStats().isEmpty());
    }

    public static void verifySignInPage() {

        waitVisibility(AutomationConstants.INPUT_ADDRESS_XPATH);
        Assert.assertTrue(isVisible(AutomationConstants.INPUT_ADDRESS_XPATH));
        waitVisibility(AutomationConstants.H1_TITULO_XPATH);
        Assert.assertEquals(getText(AutomationConstants.H1_TITULO_XPATH),"AUTHENTICATION","No se encuentra el titulo");}
    public static void verifyMyAccountPage(){
        waitVisibility(AutomationConstants.VERIFICATION_ACCOUNT);
        Assert.assertTrue(isVisible(AutomationConstants.VERIFICATION_ACCOUNT));
        waitVisibility(AutomationConstants.H1_TITULO_XPATHH);
        Assert.assertEquals(getText(AutomationConstants.H1_TITULO_XPATHH),"MY ACCOUNT","No se encuentra el titulo");}
}
