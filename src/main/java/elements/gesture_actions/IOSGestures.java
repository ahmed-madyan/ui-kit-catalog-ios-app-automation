package elements.gesture_actions;

import com.google.common.collect.ImmutableMap;
import driver.DriverManager;
import elements.Elements;
import elements.element_actions.ElementActions;
import elements.element_actions.ElementState;
import exceptions.Exceptions;
import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import waits.Waits;

public class IOSGestures {
    public IOSGestures() {
    }

    public ElementActions elementActions() {
        return new ElementActions();
    }

    public ElementState elementState() {
        return new ElementState();
    }

    public IOSGestures longClick(@NotNull final By elementLocated, @NotNull final int durationOfSeconds) {
        Waits.fluentlyWait().elementToBeClickable(elementLocated);
        try {
            ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("mobile: touchAndHold", ImmutableMap.of(
                    "element", ((RemoteWebElement) Elements.elementActions().findElement(elementLocated)).getId(),
                    "duration", (durationOfSeconds * 1000)
            ));
        } catch (Exception e) {
            Exceptions.handle(e);
        }
        return this;
    }

    public IOSGestures doubleClick(@NotNull final By elementLocated) {
        Waits.fluentlyWait().elementToBeClickable(elementLocated);
        try {
            ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("mobile: doubleClickGesture", ImmutableMap.of(
                    "element", ((RemoteWebElement) Elements.elementActions().findElement(elementLocated)).getId()
            ));
        } catch (Exception e) {
            Exceptions.handle(e);
        }
        return this;
    }

    public IOSGestures tap(@NotNull final By elementLocated) {
        Waits.fluentlyWait().elementToBeClickable(elementLocated);
        try {
            DriverManager.getDriverInstance().executeScript("mobile: tap", ImmutableMap.of(
                    "element", ((RemoteWebElement) Elements.elementActions().findElement(elementLocated)).getId()
            ));
        } catch (Exception e) {
            Exceptions.handle(e);
        }
        return this;

    }

    public IOSGestures tap(@NotNull final WebElement element) {
        try {
            DriverManager.getDriverInstance().executeScript("mobile: tap", ImmutableMap.of(
                    "element", ((RemoteWebElement) element).getId()
            ));
        } catch (Exception e) {
            Exceptions.handle(e);
        }
        return this;

    }

    public IOSGestures swipe(@NotNull final By elementLocated, @NotNull final Direction direction) {
        try {
            ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("mobile: swipe", ImmutableMap.of(
                    "element", ((RemoteWebElement) Elements.elementActions().findElement(elementLocated)).getId(),
                    "direction", direction.toString(),
                    "percent", 0.75
            ));
        } catch (Exception e) {
            Exceptions.handle(e);
        }
        return this;

    }

    public IOSGestures swipe(@NotNull final WebElement element, @NotNull final Direction direction) {
        try {
            ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("mobile: swipe", ImmutableMap.of(
                    "element", ((RemoteWebElement) element).getId(),
                    "direction", direction.toString().toLowerCase()
            ));
        } catch (Exception e) {
            Exceptions.handle(e);
        }
        return this;

    }

    public IOSGestures scrollToElement(@NotNull final By elementLocated, @NotNull final Direction direction) {
        boolean canScrollMore = false;
        try {
            ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("mobile: scroll", ImmutableMap.of(
                    "element", ((RemoteWebElement) DriverManager.getDriverInstance().findElement(elementLocated)).getId(),
                    "direction", direction.toString().toLowerCase()
            ));
        } catch (Exception e) {
            Exceptions.handle(e);
        }
        return this;

    }

    public IOSGestures scrollWithCoordinates(@NotNull final By elementLocated, @NotNull final Direction direction) {
        boolean canScrollMore = false;
        boolean elementDisplayed = false;
        try {
            do {
                canScrollMore = (Boolean) ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("mobile: scroll", ImmutableMap.of(
                        "left", 100, "top", 100, "width", 200, "height", 200,
                        "direction", direction.toString().toLowerCase(),
                        "percent", 1.0
                ));
                elementDisplayed = Elements.elementState().isDisplayed(elementLocated);
            } while (canScrollMore && !elementDisplayed);
            {
                Assert.assertTrue(Elements.elementActions().findElement(elementLocated).isDisplayed());
            }
        } catch (Exception e) {
            Exceptions.handle(e);
        }
        return this;
    }

    public IOSGestures scrollWithCoordinates(@NotNull final Direction direction) {
        try {

            ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("mobile: scroll", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 200, "height", 200,
                    "direction", direction.toString(),
                    "percent", 3.0
            ));
        } catch (Exception e) {
            Exceptions.handle(e);
        }
        return this;

    }

    public IOSGestures drag(@NotNull final By elementLocated, @NotNull final int xEndCoordinate, @NotNull final int yEndCoordinate) {
        Waits.fluentlyWait().elementToBeClickable(elementLocated);
        try {
            ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("mobile: dragGesture", ImmutableMap.of(
                    "element", ((RemoteWebElement) Elements.elementActions().findElement(elementLocated)).getId(),
                    "endX", xEndCoordinate,
                    "endY", yEndCoordinate
            ));
        } catch (Exception e) {
            Exceptions.handle(e);
        }
        return this;

    }
}