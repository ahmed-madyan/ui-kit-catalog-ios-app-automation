import driver.DriverInitializer;
import elements.Elements;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestIOSBundleID extends DriverInitializer {

    @Test
    public void testIOSBundleID() {
        Elements
                .mobileActions()
                .iosActions()
                .startActivity("com.apple.mobileslideshow");
    }
}