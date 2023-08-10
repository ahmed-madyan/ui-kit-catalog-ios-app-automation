package elements;

import driver.DriverManager;
import exception_handling.ExceptionHandling;
import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.ScreenOrientation;
import waits.Waits;

public class AndroidActions {
    public static void startActivity(@NotNull final String appPackage, @NotNull final String appActivity) {
        try {
            DriverManager.androidDriver().getAndroidDriver().startActivity(new Activity(appPackage.trim(), appActivity.trim()));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
    }

    public static void scrollIntoView(@NotNull final String elementText) {
        try {
            ElementActions.findElement(AppiumBy.ByAndroidUIAutomator.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + elementText + "\").instance(0))"));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
    }

    public static void scrollIntoElementView(@NotNull final By elementLocated, final String elementText) {
        try {
            ElementActions.findElement(AppiumBy.ByAndroidUIAutomator.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + elementText + "\").instance(0))"));
            Waits.fluentlyWait().visibilityOfElementLocated(elementLocated);
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
    }

    public static void setClipboardText(@NotNull final String text) {
        try {
            DriverManager.androidDriver().getAndroidDriver().setClipboardText(text);
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
    }

    public static String getClipboardText() {
        String clipboardText = null;
        try {
            clipboardText = DriverManager.androidDriver().getAndroidDriver().getClipboardText();
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return clipboardText;
    }

    public static void rotateRight() {
        try {
            DriverManager.androidDriver().getAndroidDriver().rotate(new DeviceRotation(0, 0, 90));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
    }

    public static void rotateLeft() {
        try {
            DriverManager.androidDriver().getAndroidDriver().rotate(new DeviceRotation(0, 0, 270));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
    }

    public static void rotateCustomAngle(@NotNull final int angle) {
        try {
            DriverManager.androidDriver().getAndroidDriver().rotate(new DeviceRotation(0, 0, angle));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
    }

    public static void setPortraitMode() {
        try {
            DriverManager.androidDriver().getAndroidDriver().rotate(ScreenOrientation.PORTRAIT);
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
    }

    public static void setLandscapeMode() {
        try {
            DriverManager.androidDriver().getAndroidDriver().rotate(ScreenOrientation.LANDSCAPE);
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
    }

    public static String getToastMessage() {
        String text = null;
        try {
            text = DriverManager.androidDriver().getAndroidDriver().findElement(AppiumBy.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return text;
    }
}
