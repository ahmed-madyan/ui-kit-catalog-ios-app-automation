import driver_manager.DriverInitializer;
import driver_manager.DriverManager;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class TestIOSScroll extends DriverInitializer {

    private static final By Web_View_BUTTON = AppiumBy.accessibilityId("Web View");
    private static final By TEXT_ENTRY_ALERT_OK_BUTTON = AppiumBy.accessibilityId("OK");
    private static final By TEXT_ENTRY_ALERT_Cancel_BUTTON = AppiumBy.accessibilityId("Cancel");
    private static final By CONFIRM_CANCEL_ALERT_BUTTON = AppiumBy.accessibilityId("Confirm / Cancel");
    private static final By CONFIRM_CANCEL_ALERT_MESSAGE_TEXT = AppiumBy.iOSNsPredicateString("name BEGINSWITH[c] 'A message'");
    private static final By CONFIRM_CANCEL_ALERT_CONFIRM_BUTTON = AppiumBy.accessibilityId("Cancel");
    private static final By CONFIRM_CANCEL_ALERT_CANCEL_BUTTON = AppiumBy.accessibilityId("Confirm");
    @Test
    public void testIOSScroll() throws InterruptedException {
//        Actions
//                .gestureActions()
//                .scrollToElement(Web_View_BUTTON, GestureActions.Direction.DOWN)
//                .elementActions().click(Web_View_BUTTON);
//

//        Map<String, String> objectsMap = new HashMap<>();
//        objectsMap.put("element", ((RemoteWebElement) DriverManager.getDriverInstance().findElement(Web_View_BUTTON)).getId());
//        objectsMap.put("direction", "down");
//        DriverManager.getDriverInstance().executeScript("mobile: scroll", objectsMap);


        WebElement element = DriverManager.getDriverInstance().findElement(Web_View_BUTTON);

        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriverInstance();

        HashMap<String, String> scrollObjects = new HashMap<>();
        scrollObjects.put("element", ((RemoteWebElement) element).getId());
        scrollObjects.put("direction", "down");
        DriverManager.getDriverInstance().executeScript("mobile: scroll", scrollObjects);


        Thread.sleep(10000);
    }
}