package driver;

import io.appium.java_client.AppiumDriver;

public class DriverManager {
    public DriverManager() {
    }

    public static AppiumDriver getDriverInstance() {
        return DriverInitializer.getDriver();
    }

    public static driver.AndroidDriver androidDriver() {
        return new driver.AndroidDriver();
    }

    public static driver.IOSDriver iosDriver() {
        return new driver.IOSDriver();
    }
    
    protected static void quitDriver() {
        getDriverInstance().quit();
    }
}