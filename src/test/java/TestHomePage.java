import assertions.Assertions;
import driver_manager.DriverInitializer;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class TestHomePage extends DriverInitializer {

    @Test
    public void openApp() {
        Assertions.hardAssert().elementDisplayed(AppiumBy.xpath("//XCUIElementTypeStaticText[@name='UIKitCatalog']"));
    }
}
