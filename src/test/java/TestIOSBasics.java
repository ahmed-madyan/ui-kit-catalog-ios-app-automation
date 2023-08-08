import driver_manager.DriverInitializer;
import io.appium.java_client.AppiumBy;
import mobile_gestures.MobileGestures;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestIOSBasics extends DriverInitializer {

    private static final By BUTTONS_BUTTON = AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"Buttons\"]");

    @Test
    public void basicTest() {
        MobileGestures.click(BUTTONS_BUTTON);
    }
}