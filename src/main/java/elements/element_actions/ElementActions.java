package elements.element_actions;

import driver.DriverManager;
import elements.Elements;
import elements.gesture_actions.GestureActions;
import elements.mobile_actions.MobileActions;
import exception_handling.ExceptionHandling;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import waits.Waits;

import java.util.List;

public class ElementActions {
    public ElementActions() {
    }

    public static Elements actions() {
        return new Elements();
    }
    public GestureActions gestureActions() {
        return new GestureActions();
    }

    public MobileActions mobileActions() {
        return new MobileActions();
    }

    public static WebElement findElement(final By elementLocated) {
        WebElement element = null;
        try {
            Waits.fluentlyWait().visibilityOfElementLocated(elementLocated);
            element = DriverManager.getDriverInstance().findElement(elementLocated);
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return element;
    }

    public static List<WebElement> findElements(final By elementLocated) {
        List<WebElement> element = null;
        try {
            Waits.fluentlyWait().visibilityOfElementLocated(elementLocated);
            element = DriverManager.getDriverInstance().findElements(elementLocated);
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return element;
    }

    public ElementActions click(final By elementLocated) {
        try {
            findElement(elementLocated).click();
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return this;
    }

    public ElementActions sendKeys(final By elementLocated, final String keyToSend) {
        try {
            findElement(elementLocated).sendKeys(keyToSend);
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return this;
    }

    public static String getText(final By elementLocated) {
        String elementText = null;
        try {
            elementText = findElement(elementLocated).getText();
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return elementText;
    }

    public static String getAttribute(final By elementLocated, String attribute) {
        String attributeValue = null;
        try {
            attributeValue = findElement(elementLocated).getAttribute(attribute);
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return attributeValue;
    }

    public static int getMiddleLocationX(final By elementLocated) {
        int leftLocationX;
        int rightLocationX;
        int middleLocationX = 0;
        try {
            Waits.fluentlyWait().visibilityOfElementLocated(elementLocated);
            leftLocationX = getElementLocationX(elementLocated);
            rightLocationX = getElementWidth(elementLocated);
            middleLocationX = ((leftLocationX + rightLocationX) / 2);
            System.out.println
                    ("Left Location X: " + leftLocationX +
                            "\nRight Location X: " + rightLocationX +
                            "\nMiddle Location X: " + middleLocationX);
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return middleLocationX;
    }

    public static int getMiddleLocationY(final By elementLocated) {
        int upperLocationY;
        int lowerLocationY;
        int middleLocationY = 0;
        try {
            Waits.fluentlyWait().visibilityOfElementLocated(elementLocated);
            upperLocationY = getElementLocationY(elementLocated);
            lowerLocationY = getElementHeight(elementLocated);
            middleLocationY = ((upperLocationY + lowerLocationY) / 2);
            System.out.println
                    ("Upper Location Y: " + upperLocationY +
                            "\nLower Location Y: " + lowerLocationY +
                            "\nMiddle Location Y: " + middleLocationY);
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return middleLocationY;
    }

    public static int getElementLocationX(final By elementLocated) {
        int elementLocationX = 0;
        try {
            Waits.fluentlyWait().visibilityOfElementLocated(elementLocated);
            elementLocationX = findElement(elementLocated).getLocation().getX();
            System.out.println("Element Location X: " + elementLocationX);
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return elementLocationX;
    }

    public static int getElementWidth(final By elementLocated) {
        int elementWidth = 0;
        try {
            elementWidth = findElement(elementLocated).getSize().getWidth();
            System.out.println("Element width: " + elementWidth);
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return elementWidth;
    }

    public static int getElementLocationY(final By elementLocated) {
        int elementLocationY = 0;
        try {
            elementLocationY = findElement(elementLocated).getLocation().getY();
            System.out.println("Element Location Y: " + elementLocationY);
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return elementLocationY;
    }

    public static int getElementHeight(final By elementLocated) {
        int elementHeight = 0;
        try {
            elementHeight = findElement(elementLocated).getSize().getHeight();
            System.out.println("Element height: " + elementHeight);
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return elementHeight;
    }

    public static void selectByVisibleText(final By elementLocated, final String visibleText) {
        try {
            new Select(findElement(elementLocated)).selectByVisibleText(visibleText);
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
    }

    public static void highlightWebElementLocated(final By elementLocated) {
        try {
            ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("arguments[0].style.border='3px solid red'", ElementActions.findElement(elementLocated));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
    }
}