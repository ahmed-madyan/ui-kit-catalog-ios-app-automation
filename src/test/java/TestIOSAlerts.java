import elements.Elements;
import assertions.Assertions;
import driver_manager.DriverInitializer;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestIOSAlerts extends DriverInitializer {
    private static final By ALERT_VIEWS_BUTTON = AppiumBy.accessibilityId("Alert Views");
    private static final By TEXT_ENTRY_BUTTON = AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name=='Text Entry'`]");
    private static final By TEXT_ENTRY_ALERT_TEXT_BOX = AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeTextField'");
    private static final By TEXT_ENTRY_ALERT_OK_BUTTON = AppiumBy.accessibilityId("OK");
    private static final By TEXT_ENTRY_ALERT_Cancel_BUTTON = AppiumBy.accessibilityId("Cancel");
    private static final By CONFIRM_CANCEL_ALERT_BUTTON = AppiumBy.accessibilityId("Confirm / Cancel");
    private static final By CONFIRM_CANCEL_ALERT_MESSAGE_TEXT = AppiumBy.iOSNsPredicateString("name BEGINSWITH[c] 'A message'");
    private static final By CONFIRM_CANCEL_ALERT_CONFIRM_BUTTON = AppiumBy.accessibilityId("Cancel");
    private static final By CONFIRM_CANCEL_ALERT_CANCEL_BUTTON = AppiumBy.accessibilityId("Confirm");

    @Test
    public void testIOSAlerts() {
        Elements
                .elementActions()
                .click(ALERT_VIEWS_BUTTON)
                .click(TEXT_ENTRY_BUTTON)
                .click(TEXT_ENTRY_ALERT_Cancel_BUTTON)
                .click(TEXT_ENTRY_BUTTON)
                .sendKeys(TEXT_ENTRY_ALERT_TEXT_BOX, "Ahmed")
                .click(TEXT_ENTRY_ALERT_OK_BUTTON);

        Elements.elementActions()
                .click(CONFIRM_CANCEL_ALERT_BUTTON);
        Assertions.hardAssert()
                .elementDisplayed(CONFIRM_CANCEL_ALERT_MESSAGE_TEXT)
                .elementTextToBe(CONFIRM_CANCEL_ALERT_MESSAGE_TEXT, "A message should be a short, complete sentence.");
        Elements.elementActions()
                .click(CONFIRM_CANCEL_ALERT_CANCEL_BUTTON);
        Assertions.hardAssert().elementNotDisplayed(CONFIRM_CANCEL_ALERT_MESSAGE_TEXT);
        Elements.elementActions()
                .click(CONFIRM_CANCEL_ALERT_BUTTON)
                .click(CONFIRM_CANCEL_ALERT_CONFIRM_BUTTON);
    }
}