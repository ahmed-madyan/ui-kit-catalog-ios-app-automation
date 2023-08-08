package mobile_gestures;

import actions.ElementActions;
import com.google.common.collect.ImmutableMap;
import driver_manager.DriverManager;
import waits.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;

public class MobileGestures {

    public static void longClick(final By elementLocated, final int durationOfSeconds) {
        Waits.fluentlyWait().elementToBeClickable(elementLocated);
        try {
            ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("mobile: longClickGesture", ImmutableMap.of(
                    "elementId", ((RemoteWebElement) ElementActions.findElement(elementLocated)).getId(),
                    "duration", (durationOfSeconds * 1000)
            ));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void doubleClick(final By elementLocated) {
        Waits.fluentlyWait().elementToBeClickable(elementLocated);
        try {
            ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("mobile: doubleClickGesture", ImmutableMap.of(
                    "elementId", ((RemoteWebElement) ElementActions.findElement(elementLocated)).getId()
            ));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void click(final By elementLocated) {
        Waits.fluentlyWait().elementToBeClickable(elementLocated);
        try {
            DriverManager.getDriverInstance().executeScript("mobile: clickGesture", ImmutableMap.of(
                    "elementId", ((RemoteWebElement) ElementActions.findElement(elementLocated)).getId()
            ));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void click(final WebElement element) {
        try {
            DriverManager.getDriverInstance().executeScript("mobile: clickGesture", ImmutableMap.of(
                    "elementId", ((RemoteWebElement) element).getId()
            ));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void swipe(final By elementLocated, final Direction direction) {
        try {
            ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("mobile: swipeGesture", ImmutableMap.of(
                    "elementId", ((RemoteWebElement) ElementActions.findElement(elementLocated)).getId(),
                    "direction", direction.toString(),
                    "percent", 0.75
            ));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void swipe(final WebElement element, final Direction direction) {
        try {
            ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("mobile: swipeGesture", ImmutableMap.of(
                    "elementId", ((RemoteWebElement) element).getId(),
                    "direction", direction.toString(),
                    "percent", 0.75
            ));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void scrollToElement(final By elementLocated, final Direction direction) {
        boolean canScrollMore = false;
        try {
            ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "elementId", ((RemoteWebElement) ElementActions.findElement(elementLocated)).getId(),
                    "direction", direction.toString(),
                    "percent", 3.0
            ));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean scrollWithCoordinates(final By elementLocated, final Direction direction) {
        boolean canScrollMore = false;
        boolean elementDisplayed = false;
        try {
            do {
                canScrollMore = (Boolean) ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("mobile: scrollGesture", ImmutableMap.of(
                        "left", 100, "top", 100, "width", 200, "height", 200,
                        "direction", direction.toString(),
                        "percent", 3.0
                ));
                elementDisplayed = ElementActions.findElement(elementLocated).isDisplayed();
            } while (canScrollMore && !elementDisplayed);
            {
                Assert.assertTrue(ElementActions.findElement(elementLocated).isDisplayed());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return canScrollMore;
    }

    public static void scrollWithCoordinates(final Direction direction) {
        try {

            ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 200, "height", 200,
                    "direction", direction.toString(),
                    "percent", 3.0
            ));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void drag(final By elementLocated, final int xEndCoordinate, final int yEndCoordinate) {
        Waits.fluentlyWait().elementToBeClickable(elementLocated);
        try {
            ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("mobile: dragGesture", ImmutableMap.of(
                    "elementId", ((RemoteWebElement) ElementActions.findElement(elementLocated)).getId(),
                    "endX", xEndCoordinate,
                    "endY", yEndCoordinate
            ));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public enum Direction {
        UP,
        DOWN,
        RIGHT,
        LEFT
    }
}