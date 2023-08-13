import driver.DriverInitializer;
import elements.Elements;
import elements.gesture_actions.IOSGestures;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

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
        Elements
                .gestureActions()
                .iosGestures()
                .scrollWithCoordinates(Web_View_BUTTON, IOSGestures.Direction.DOWN)
                .elementActions()
                .click(Web_View_BUTTON);
        Thread.sleep(10000);
    }
}