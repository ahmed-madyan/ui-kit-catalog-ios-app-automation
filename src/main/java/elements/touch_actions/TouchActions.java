package elements.touch_actions;

import driver.DriverManager;
import elements.element_actions.ElementActions;
import elements.element_actions.ElementState;
import exceptions.ExceptionHandling;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

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

    public TouchActions tap(By elementLocated) {
        try {
            touchActions.tap(ElementOption.element(ElementActions.findElement(elementLocated))).perform();
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return this;
    }

    public TouchActions longPress(By elementLocated, int duration) {
        try {
            touchActions
                    .longPress(ElementOption.element(ElementActions.findElement(elementLocated)))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(duration)))
                    .perform();
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return this;
    }

    public TouchActions scrollToElement(By elementLocated, Direction direction) {
        Scroller.scrollToElement(elementLocated, direction);
        return this;
    }
}