package elements.touch_actions;

import driver.DriverManager;
import elements.Elements;
import exceptions.ExceptionHandling;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;

class Scroller {
    private static final TouchAction touchActions = new TouchAction((PerformsTouchActions) DriverManager.getDriverInstance());
    private static final Dimension dimension = DriverManager.getWindowSize();

    protected static void scrollToElement(By elementLocated, Direction direction) {
        boolean elementDisplayed = false;
        switch (direction) {
            case VERTICAL -> {
                try {
                    elementDisplayed = scrollDown(elementLocated);
                    if (!elementDisplayed) {
                        scrollUp(elementLocated);
                    } else System.out.println("The element does not exist on the whole page");
                } catch (Exception e) {
                    ExceptionHandling.handleException(e);
                }
            }
            case HORIZONTAL -> {
                try {
                    elementDisplayed = scrollRight(elementLocated);
                    if (!elementDisplayed) {
                        scrollLeft(elementLocated);
                    } else System.out.println("The element does not exist on the whole page");
                } catch (Exception e) {
                    ExceptionHandling.handleException(e);
                }
            }
        }
    }

    private static boolean scrollUp(By elementLocated) {
        boolean elementDisplayed = false;
        String startPageSource;
        String endPageSource;
        try {
            do {
                startPageSource = DriverManager.getPageSource();
                int scrollStart = (int) (dimension.getHeight() * 0.2);
                int scrollEnd = (int) (dimension.getHeight() * 0.8);
                touchActions.press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release()
                        .perform();
                endPageSource = DriverManager.getPageSource();
                elementDisplayed = Elements.elementState().isDisplayed(elementLocated);
            } while ((!Elements.elementState().isDisplayed(elementLocated)) && (!endPageSource.equals(startPageSource)));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return elementDisplayed;
    }

    private static boolean scrollDown(By elementLocated) {
        boolean elementDisplayed = false;
        String startPageSource;
        String endPageSource;
        try {
            do {
                startPageSource = DriverManager.getPageSource();
                int scrollStart = (int) (dimension.getHeight() * 0.8);
                int scrollEnd = (int) (dimension.getHeight() * 0.2);
                touchActions.press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release()
                        .perform();
                endPageSource = DriverManager.getPageSource();
                elementDisplayed = Elements.elementState().isDisplayed(elementLocated);
            } while ((!Elements.elementState().isDisplayed(elementLocated)) && (!endPageSource.equals(startPageSource)));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return elementDisplayed;
    }

    private static boolean scrollRight(By elementLocated) {
        boolean elementDisplayed = false;
        String startPageSource;
        String endPageSource;
        try {
            do {
                startPageSource = DriverManager.getPageSource();
                int scrollStart = (int) (dimension.getWidth() * 0.8);
                int scrollEnd = (int) (dimension.getWidth() * 0.2);
                touchActions.press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release()
                        .perform();
                endPageSource = DriverManager.getPageSource();
                elementDisplayed = Elements.elementState().isDisplayed(elementLocated);
            } while ((!Elements.elementState().isDisplayed(elementLocated)) && (!endPageSource.equals(startPageSource)));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return elementDisplayed;
    }

    private static boolean scrollLeft(By elementLocated) {
        boolean elementDisplayed = false;
        String startPageSource;
        String endPageSource;
        try {
            do {
                startPageSource = DriverManager.getPageSource();
                int scrollStart = (int) (dimension.getWidth() * 0.2);
                int scrollEnd = (int) (dimension.getWidth() * 0.8);
                touchActions.press(PointOption.point(0, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(0, scrollEnd))
                        .release()
                        .perform();
                endPageSource = DriverManager.getPageSource();
                elementDisplayed = Elements.elementState().isDisplayed(elementLocated);
            } while ((!Elements.elementState().isDisplayed(elementLocated)) && (!endPageSource.equals(startPageSource)));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return elementDisplayed;
    }
}