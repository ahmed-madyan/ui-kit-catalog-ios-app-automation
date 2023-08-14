package elements.touch_actions;

import driver.DriverManager;
import elements.element_actions.ElementActions;
import elements.element_actions.ElementState;
import exceptions.ExceptionHandling;
import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;

import java.time.Duration;

public class TouchActions {
    public TouchActions() {
    }

    public ElementActions elementActions() {
        return new ElementActions();
    }

    public ElementState elementState() {
        return new ElementState();
    }

    private static final TouchAction touchActions = new TouchAction((PerformsTouchActions) DriverManager.getDriverInstance());

    public TouchActions tap(final By elementLocated) {
        try {
            touchActions.tap(ElementOption.element(ElementActions.findElement(elementLocated))).perform();
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return this;
    }

    public TouchActions longPress(@NotNull final By elementLocated, @NotNull final int durationOfSeconds) {
        try {
            touchActions
                    .longPress(ElementOption.element(ElementActions.findElement(elementLocated)))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(durationOfSeconds)))
                    .perform();
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return this;
    }

    public TouchActions scrollToElement(@NotNull final By elementLocated, @NotNull final Direction direction) {
        Scroller.scrollToElement(elementLocated, direction);
        return this;
    }
}