package driver;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

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

    public static Dimension getWindowSize() {
        return DriverManager.getDriverInstance().manage().window().getSize();
    }

    public static Point getPosition() {
        return DriverManager.getDriverInstance().manage().window().getPosition();
    }

    public static String getPageSource() {
        return DriverManager.getDriverInstance().getPageSource();
    }
}