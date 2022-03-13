package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.AutomationConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import java.util.List;



public class PageSearchResultService extends ActionManager{

    public static void verifyTheResults() {
        Assert.assertFalse(getStats().isEmpty());
    }
    private static WebElement stats() {
        return getElement(AutomationConstants.STATS_ID);
    }

    public static String getStats() {
        return stats().getText();
    }

    public static void verifyMyAccountPage() {
        waitVisibility(AutomationConstants.VERIFICATION_ACCOUNT);
        Assert.assertTrue(isVisible(AutomationConstants.VERIFICATION_ACCOUNT));
        waitVisibility(AutomationConstants.H1_TITULO_XPATHH);
        Assert.assertEquals(getText(AutomationConstants.H1_TITULO_XPATHH), "MY ACCOUNT", "Title has not been found");
    }
    public static void setSelect() {
        click(AutomationConstants.SELECT);
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

}
