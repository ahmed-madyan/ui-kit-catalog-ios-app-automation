package actions;

import com.google.common.collect.ImmutableMap;
import driver_manager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import waits.Waits;

public class GestureActions {
    public GestureActions() {
    }

    public ElementActions elementActions() {
        return new ElementActions();
    }

    public GestureActions longClick(final By elementLocated, final int durationOfSeconds) {
        Waits.fluentlyWait().elementToBeClickable(elementLocated);
        try {
            ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("mobile: touchAndHold", ImmutableMap.of(
                    "element", ((RemoteWebElement) ElementActions.findElement(elementLocated)).getId(),
                    "duration", (durationOfSeconds * 1000)
            ));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    public GestureActions doubleClick(final By elementLocated) {
        Waits.fluentlyWait().elementToBeClickable(elementLocated);
        try {
            ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("mobile: doubleClickGesture", ImmutableMap.of(
                    "element", ((RemoteWebElement) ElementActions.findElement(elementLocated)).getId()
            ));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    public GestureActions tap(final By elementLocated) {
        Waits.fluentlyWait().elementToBeClickable(elementLocated);
        try {
            DriverManager.getDriverInstance().executeScript("mobile: tap", ImmutableMap.of(
                    "element", ((RemoteWebElement) ElementActions.findElement(elementLocated)).getId()
            ));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;

    }

    public GestureActions tap(final WebElement element) {
        try {
            DriverManager.getDriverInstance().executeScript("mobile: tap", ImmutableMap.of(
                    "element", ((RemoteWebElement) element).getId()
            ));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;

    }

    public GestureActions swipe(final By elementLocated, final Direction direction) {
        try {
            ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("mobile: swipe", ImmutableMap.of(
                    "element", ((RemoteWebElement) ElementActions.findElement(elementLocated)).getId(),
                    "direction", direction.toString(),
                    "percent", 0.75
            ));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;

    }

    public GestureActions swipe(final WebElement element, final Direction direction) {
        try {
            ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("mobile: swipe", ImmutableMap.of(
                    "element", ((RemoteWebElement) element).getId(),
                    "direction", direction.toString(),
                    "percent", 0.75
            ));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;

    }

    public GestureActions scrollToElement(final By elementLocated, final Direction direction) {
        boolean canScrollMore = false;
        try {
            ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("mobile: scroll", ImmutableMap.of(
                    "element", ((RemoteWebElement) DriverManager.getDriverInstance().findElement(elementLocated)).getId(),
                    "direction", direction.toString().toLowerCase()
            ));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;

    }

    public static boolean scrollWithCoordinates(final By elementLocated, final Direction direction) {
        boolean canScrollMore = false;
        boolean elementDisplayed = false;
        try {
            do {
                canScrollMore = (Boolean) ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("mobile: scroll", ImmutableMap.of(
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

    public GestureActions scrollWithCoordinates(final Direction direction) {
        try {

            ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("mobile: scroll", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 200, "height", 200,
                    "direction", direction.toString(),
                    "percent", 3.0
            ));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;

    }

    public GestureActions drag(final By elementLocated, final int xEndCoordinate, final int yEndCoordinate) {
        Waits.fluentlyWait().elementToBeClickable(elementLocated);
        try {
            ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("mobile: dragGesture", ImmutableMap.of(
                    "element", ((RemoteWebElement) ElementActions.findElement(elementLocated)).getId(),
                    "endX", xEndCoordinate,
                    "endY", yEndCoordinate
            ));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;

    }

    public enum Direction {
        UP,
        DOWN,
        RIGHT,
        LEFT
    }
}