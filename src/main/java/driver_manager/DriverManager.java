package driver_manager;

import io.appium.java_client.AppiumDriver;

public class DriverManager {
    public DriverManager() {
    }

    public static AppiumDriver getDriverInstance() {
        return DriverInitializer.getDriver();
    }

    public static driver_manager.AndroidDriver androidDriver() {
        return new driver_manager.AndroidDriver();
    }

    public static driver_manager.IOSDriver iosDriver() {
        return new driver_manager.IOSDriver();
    }


    protected static void quitDriver() {
        getDriverInstance().quit();
    }
}