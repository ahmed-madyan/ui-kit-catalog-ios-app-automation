package driver;

import io.appium.java_client.AppiumDriver;

public class DriverManager {
    public DriverManager() {
    }

    public static AppiumDriver getDriverInstance() {
        return DriverInitializer.getDriver();
    }

    public static Android androidDriver() {
        return new Android();
    }

    public static IOS iosDriver() {
        return new IOS();
    }

    protected static void quitDriver() {
        getDriverInstance().quit();
    }
}