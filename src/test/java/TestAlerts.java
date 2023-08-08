import actions.ElementActions;
import driver_manager.DriverInitializer;
import driver_manager.DriverManager;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import javax.swing.*;

public class TestAlerts extends DriverInitializer {
    private static final By ALERT_VIEWS_BUTTON = AppiumBy.accessibilityId("Alert Views");
    @Test
    public void testAlert(){
        ElementActions.click(ALERT_VIEWS_BUTTON);
    }
}
