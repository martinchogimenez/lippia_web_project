package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.AutomationConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class AutomationService extends ActionManager {

    public static void webNavigation() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void enterSearchCriteria(String text) {
        setInput(AutomationConstants.INPUT_SEARCH_XPATH, text);
    }

    public static void enterSearchCriteriaa(String text) {
        setInput(AutomationConstants.INPUT_ADDRESS_XPATH, text);
    }

    public static void setSelect() {
        click(AutomationConstants.SELECT);
    }

    public static void enterPassw(String text) {
        setInput(AutomationConstants.INPUT_PASS_XPATH, text);
    }

    public static void clickSearchButton() {
        click(AutomationConstants.SEARCH_BUTTON_NAME);
    }

    public static void clickConfirmButton() {
        click(AutomationConstants.BUTTON_SIGNIN_CONFIRM);
    }

    public static void clickHomeButton() {
        click(AutomationConstants.BUTTON_SIGNIN_HOME);
    }

//In verifyResults method we verify the list is sorted by price

    public static void verifyResults() {
        int listSize;
        boolean flag;
        double smallest = 0;
        flag = true;
        List<WebElement> listPrice = getElements(AutomationConstants.PRICE);
        listSize = listPrice.size();
        for (int i = 0; i < listSize; i++) {
            String lista = listPrice.get(i).getText();
            double price = Double.parseDouble(lista.replace("$", ""));
            if (i == 0) {
                smallest = price;
            } else {
                if (price < smallest) {
                    flag = false;
                }
            }
        }
        Assert.assertTrue(flag);
    }

    private static WebElement stats() {
        return getElement(AutomationConstants.STATS_ID);
    }

    public static String getStats() {
        return stats().getText();
    }

    public static void verifyTheResults() {
        Assert.assertFalse(getStats().isEmpty());
    }

    public static void verifySignInPage() {
        waitVisibility(AutomationConstants.INPUT_ADDRESS_XPATH);
        Assert.assertTrue(isVisible(AutomationConstants.INPUT_ADDRESS_XPATH));
        waitVisibility(AutomationConstants.H1_TITULO_XPATH);
        Assert.assertEquals(getText(AutomationConstants.H1_TITULO_XPATH), "AUTHENTICATION", "Title has not been found");
    }

    public static void verifyMyAccountPage() {
        waitVisibility(AutomationConstants.VERIFICATION_ACCOUNT);
        Assert.assertTrue(isVisible(AutomationConstants.VERIFICATION_ACCOUNT));
        waitVisibility(AutomationConstants.H1_TITULO_XPATHH);
        Assert.assertEquals(getText(AutomationConstants.H1_TITULO_XPATHH), "MY ACCOUNT", "Title has not been found");
    }
}
