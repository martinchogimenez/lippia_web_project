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

    public static void enterSearchCriteriaaa(String text) {
        setInput(AutomationConstants.INPUT_PASS_XPATH, text);
    }

    public static void clickSearchButton() {
        click(AutomationConstants.SEARCH_BUTTON_NAME);
    }

    public static void clickButton() {
        click(AutomationConstants.BUTTON_SIGNIN_XPATH);
    }

    public static void clickbButton() {
        click(AutomationConstants.BUTTON_SIGNINB_XPATH);
    }

    public static void verifyResults() {
        int tamanioLista;
        boolean flag;
        double menor = 0;
        flag = true;
        List<WebElement> listaPrecio = getElements(AutomationConstants.PRICE);
        tamanioLista = listaPrecio.size();
        for (int i = 0; i < tamanioLista; i++) {
            String lista = listaPrecio.get(i).getText();
            double price = Double.parseDouble(lista.replace("$", ""));
            if (i == 0) {
                menor = price;
            } else {
                if (price < menor) {
                    flag = false;
                }
            }
        }
        Assert.assertTrue(c);
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
