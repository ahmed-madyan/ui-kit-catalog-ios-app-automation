package waits;

import driver_manager.DriverManager;
import exception_handling.ExceptionHandling;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Explicit {
    public Explicit() {
    }

    private final WebDriverWait driverWait = new WebDriverWait(DriverManager.getDriverInstance(), Duration.ofMinutes(1));

    public Explicit visibilityOfElementLocated(By elementLocated) {
        try {
            driverWait.until(ExpectedConditions.visibilityOfElementLocated(elementLocated));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Explicit elementToBeClickable(By elementLocated) {
        try {
            visibilityOfElementLocated(elementLocated);
            driverWait.until(ExpectedConditions.elementToBeClickable(elementLocated));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return this;

    }

    public Explicit elementToBeSelected(By elementLocated) {
        try {
            visibilityOfElementLocated(elementLocated);
            driverWait.until(ExpectedConditions.elementToBeSelected(elementLocated));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return this;

    }

    public Explicit elementToBeUnSelected(By elementLocated) {
        try {
            visibilityOfElementLocated(elementLocated);
            driverWait.until(ExpectedConditions.elementSelectionStateToBe(elementLocated, false));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return this;

    }

    public Explicit elementSelectionStateToBe(By elementLocated, boolean state) {
        try {
            visibilityOfElementLocated(elementLocated);
            driverWait.until(ExpectedConditions.elementSelectionStateToBe(elementLocated, state));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return this;

    }

    public Explicit textToBePresentInElementLocated(By elementLocated, String expectedText) {
        try {
            visibilityOfElementLocated(elementLocated);
            driverWait.until(ExpectedConditions.textToBePresentInElementLocated(elementLocated, expectedText));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return this;

    }

    public Explicit textToBe(By elementLocated, String expectedText) {
        try {
            visibilityOfElementLocated(elementLocated);
            driverWait.until(ExpectedConditions.textToBe(elementLocated, expectedText));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return this;

    }

    public Explicit contextToBe(String context) {
        String currentContext;
        try {
            do {
                currentContext = DriverManager.getCurrentContextHandle();
            } while (!currentContext.equalsIgnoreCase(context));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return this;

    }
}