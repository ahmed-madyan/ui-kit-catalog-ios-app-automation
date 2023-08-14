import driver.DriverInitializer;
import elements.Elements;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestIOSLongPress extends DriverInitializer {
    private static final By Steppers_BUTTON = AppiumBy.accessibilityId("Steppers");
    private static final By CUSTOM_INCREMENT_BUTTON = AppiumBy.xpath("//XCUIElementTypeOther[@name='CUSTOM']//following::XCUIElementTypeCell/XCUIElementTypeButton");
    private static final By TEXT_ENTRY_ALERT_TEXT_BOX = AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeTextField'");
    private static final By TEXT_ENTRY_ALERT_OK_BUTTON = AppiumBy.accessibilityId("OK");
    private static final By TEXT_ENTRY_ALERT_Cancel_BUTTON = AppiumBy.accessibilityId("Cancel");
    private static final By CONFIRM_CANCEL_ALERT_BUTTON = AppiumBy.accessibilityId("Confirm / Cancel");
    private static final By CONFIRM_CANCEL_ALERT_MESSAGE_TEXT = AppiumBy.iOSNsPredicateString("name BEGINSWITH[c] 'A message'");
    private static final By CONFIRM_CANCEL_ALERT_CONFIRM_BUTTON = AppiumBy.accessibilityId("Cancel");
    private static final By CONFIRM_CANCEL_ALERT_CANCEL_BUTTON = AppiumBy.accessibilityId("Confirm");
    @Test
    public void testIOSLongPress() {
        Elements
                .elementActions()
                .click(Steppers_BUTTON)
                .click(CUSTOM_INCREMENT_BUTTON)
                .gestureActions()
                .iosGestures()
                .longClick(CUSTOM_INCREMENT_BUTTON, 10);

//        Elements
//                .elementActions()
//                .click(Steppers_BUTTON)
//                .click(CUSTOM_INCREMENT_BUTTON)
//                .touchActions()
//                .longPress(CUSTOM_INCREMENT_BUTTON, 10);
    }
}