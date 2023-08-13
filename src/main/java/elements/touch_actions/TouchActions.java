package elements.touch_actions;

import driver.DriverManager;
import elements.Elements;
import elements.element_actions.ElementActions;
import elements.element_actions.ElementState;
import exceptions.ExceptionHandling;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
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
    private static final Dimension dimension = DriverManager.getWindowSize();

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
//            touchActions
//                    .longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(ElementActions.findElement(elementLocated))).withDuration(Duration.ofSeconds(duration))).perform();

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
        switch (direction) {
            case VERTICAL -> {
                String startPageSource;
                String endPageSource;
                try {
                    do {
                        startPageSource = DriverManager.getPageSource();
                        scrollDown();
                        endPageSource = DriverManager.getPageSource();
                    } while ((!Elements.elementState().isDisplayed(elementLocated)) && (!endPageSource.equals(startPageSource)));
                    if ((!Elements.elementState().isDisplayed(elementLocated))) {
                        do {
                            startPageSource = DriverManager.getPageSource();
                            scrollUp();
                            endPageSource = DriverManager.getPageSource();
                        } while ((!Elements.elementState().isDisplayed(elementLocated)) && (!endPageSource.equals(startPageSource)));
                    } else System.out.println("The element does not exist on the whole page");
                } catch (Exception e) {
                    ExceptionHandling.handleException(e);
                }
            }
            case HORIZONTAL -> {
                String startPageSource;
                String endPageSource;
                try {
                    do {
                        startPageSource = DriverManager.getPageSource();
                        scrollRight();
                        endPageSource = DriverManager.getPageSource();
                    } while ((!Elements.elementState().isDisplayed(elementLocated)) && (!endPageSource.equals(startPageSource)));
                    if ((!Elements.elementState().isDisplayed(elementLocated))) {
                        do {
                            startPageSource = DriverManager.getPageSource();
                            scrollLeft();
                            endPageSource = DriverManager.getPageSource();
                        } while ((!Elements.elementState().isDisplayed(elementLocated)) && (!endPageSource.equals(startPageSource)));
                    } else System.out.println("The element does not exist on the whole page");
                } catch (Exception e) {
                    ExceptionHandling.handleException(e);
                }
            }
        }
        return this;
    }

    private static void scrollUp() {
        int scrollStart = (int) (dimension.getHeight() * 0.2);
        int scrollEnd = (int) (dimension.getHeight() * 0.8);
        touchActions.press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(0, scrollEnd))
                .release()
                .perform();
    }

    private static void scrollDown() {
        int scrollStart = (int) (dimension.getHeight() * 0.8);
        int scrollEnd = (int) (dimension.getHeight() * 0.2);
        touchActions.press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(0, scrollEnd))
                .release()
                .perform();
    }

    private static void scrollRight() {
        int scrollStart = (int) (dimension.getWidth() * 0.8);
        int scrollEnd = (int) (dimension.getWidth() * 0.2);
        touchActions.press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(0, scrollEnd))
                .release()
                .perform();
    }

    private static void scrollLeft() {
        int scrollStart = (int) (dimension.getWidth() * 0.2);
        int scrollEnd = (int) (dimension.getWidth() * 0.8);
        touchActions.press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(0, scrollEnd))
                .release()
                .perform();
    }
}