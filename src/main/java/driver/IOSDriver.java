package driver;

public class IOSDriver {
    public IOSDriver() {
    }

    public io.appium.java_client.ios.IOSDriver getIOSDriver() {
        return ((io.appium.java_client.ios.IOSDriver) DriverInitializer.getDriver());
    }
}