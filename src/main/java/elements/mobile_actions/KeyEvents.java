package elements.mobile_actions;

import driver.DriverManager;
import exception_handling.ExceptionHandling;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class KeyEvents {
    public static void keyEnter() {
        try {
            DriverManager.androidDriver().getDriverInstance().pressKey(new KeyEvent(AndroidKey.ENTER));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
    }

    public static void keyHome() {
        try {
            DriverManager.androidDriver().getDriverInstance().pressKey(new KeyEvent(AndroidKey.HOME));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
    }

    public static void keyBack() {
        try {
            DriverManager.androidDriver().getDriverInstance().pressKey(new KeyEvent(AndroidKey.BACK));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
    }
}