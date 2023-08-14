import driver.DriverInitializer;
import elements.Elements;
import elements.gesture_actions.Direction;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestIOSScrollWithGestures extends DriverInitializer {

    private static final By WEB_VIEW_BUTTON = AppiumBy.accessibilityId("Web View");
    private static final By TEXT_ENTRY_ALERT_OK_BUTTON = AppiumBy.accessibilityId("OK");
    private static final By TEXT_ENTRY_ALERT_Cancel_BUTTON = AppiumBy.accessibilityId("Cancel");
    private static final By CONFIRM_CANCEL_ALERT_BUTTON = AppiumBy.accessibilityId("Confirm / Cancel");
    private static final By CONFIRM_CANCEL_ALERT_MESSAGE_TEXT = AppiumBy.iOSNsPredicateString("name BEGINSWITH[c] 'A message'");
    private static final By CONFIRM_CANCEL_ALERT_CONFIRM_BUTTON = AppiumBy.accessibilityId("Cancel");
    private static final By CONFIRM_CANCEL_ALERT_CANCEL_BUTTON = AppiumBy.accessibilityId("Confirm");
    private static final By ALERT_VIEWS_BUTTON = AppiumBy.accessibilityId("Alert Views");

    @Test
    public void testIOSScroll() throws InterruptedException {
        Elements
                .gestureActions()
                .iosGestures()
                .scrollWithCoordinates(WEB_VIEW_BUTTON, Direction.DOWN)
                .elementActions()
                .click(WEB_VIEW_BUTTON);
    }
}