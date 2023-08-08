import actions.ElementActions;
import driver_manager.DriverInitializer;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestAlerts extends DriverInitializer {
    private static final By ALERT_VIEWS_BUTTON = AppiumBy.accessibilityId("Alert Views");
    @Test
    public void testAlert(){
        ElementActions.click(ALERT_VIEWS_BUTTON);
    }
}
