package driver_manager;

import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import readers.properties_reader.PropertiesConfigurations;

public class DriverInitializer {
    private static IOSDriver iosDriver;

    @BeforeClass(alwaysRun = true)
    protected void initializeDriver() {
        PropertiesConfigurations.setConfigProperties();
        System.out.println("Execution Platform: " + PropertiesConfigurations.getExecution_Platform());
        setDriver(BrowserStackInitializer.browserStackInitialization());
    }

    @AfterClass(alwaysRun = true)
    protected void tearDownDriver() {
        //Tear the driver instance down
        DriverManager.quitDriver();
    }

    protected static IOSDriver getDriver() {
        return iosDriver;
    }

    private static void setDriver(IOSDriver iosDriver) {
        DriverInitializer.iosDriver = iosDriver;
    }
}