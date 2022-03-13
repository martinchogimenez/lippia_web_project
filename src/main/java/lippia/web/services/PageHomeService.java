package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.AutomationConstants;
import static com.crowdar.core.actions.WebActionManager.navigateTo;


public class PageHomeService extends ActionManager {

    public static void webNavigation() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }
    public static void enterSearchWord(String word) {
        setInput(AutomationConstants.INPUT_SEARCH_LOCATOR, word);
    }
    public static void clickSearchButton() {
        click(AutomationConstants.SEARCH_BUTTON_NAME);
    }
    public static void clickSigninButton() {
        click(AutomationConstants.BUTTON_SIGNIN_HOME);
    }
}