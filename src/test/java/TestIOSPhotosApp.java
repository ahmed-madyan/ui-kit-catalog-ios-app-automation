import assertions.Assertions;
import driver.DriverInitializer;
import elements.Elements;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestIOSPhotosApp extends DriverInitializer {
    private static final By LIBRARY_BUTTON = AppiumBy.accessibilityId("Library");
    private static final By IMAGES_LIST = AppiumBy.iOSClassChain("**/XCUIElementTypeImage");
    private static final By TEXT_ENTRY_ALERT_TEXT_BOX = AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeTextField'");
    private static final By TEXT_ENTRY_ALERT_OK_BUTTON = AppiumBy.accessibilityId("OK");
    private static final By TEXT_ENTRY_ALERT_Cancel_BUTTON = AppiumBy.accessibilityId("Cancel");
    private static final By CONFIRM_CANCEL_ALERT_BUTTON = AppiumBy.accessibilityId("Confirm / Cancel");
    private static final By CONFIRM_CANCEL_ALERT_MESSAGE_TEXT = AppiumBy.iOSNsPredicateString("name BEGINSWITH[c] 'A message'");
    private static final By CONFIRM_CANCEL_ALERT_CONFIRM_BUTTON = AppiumBy.accessibilityId("Cancel");
    private static final By CONFIRM_CANCEL_ALERT_CANCEL_BUTTON = AppiumBy.accessibilityId("Confirm");

    @Test
    public void testIOSPhotosApp() {
        Elements
                .mobileActions()
                .iosActions()
                .startActivity("com.apple.mobileslideshow")
                .elementActions().click(LIBRARY_BUTTON);
        Assertions
                .hardAssert()
                .equals(getListOfImages(IMAGES_LIST), 9);
    }

    private int getListOfImages(By elementLocated) {
        return Elements.elementActions().findElements(elementLocated).size();
    }
}