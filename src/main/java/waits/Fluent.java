package waits;

import driver_manager.DriverManager;
import exception_handling.ExceptionHandling;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Fluent {
    public Fluent() {
    }

    private static final FluentWait<WebDriver> driverWait = new FluentWait<WebDriver>(DriverManager.getDriverInstance())
            .withTimeout(Duration.ofSeconds(60))
            .pollingEvery(Duration.ofSeconds(5))
            .ignoring(NoSuchElementException.class);

    public Fluent visibilityOfElementLocated(By elementLocated) {
        try {
            driverWait.until(ExpectedConditions.visibilityOfElementLocated(elementLocated));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Fluent elementToBeClickable(By elementLocated) {
        try {
            visibilityOfElementLocated(elementLocated);
            driverWait.until(ExpectedConditions.elementToBeClickable(elementLocated));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return this;

    }

    public Fluent elementToBeSelected(By elementLocated) {
        try {
            visibilityOfElementLocated(elementLocated);
            driverWait.until(ExpectedConditions.elementToBeSelected(elementLocated));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return this;

    }

    public Fluent elementToBeUnSelected(By elementLocated) {
        try {
            visibilityOfElementLocated(elementLocated);
            driverWait.until(ExpectedConditions.elementSelectionStateToBe(elementLocated, false));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return this;

    }

    public Fluent elementSelectionStateToBe(By elementLocated, boolean state) {
        try {
            visibilityOfElementLocated(elementLocated);
            driverWait.until(ExpectedConditions.elementSelectionStateToBe(elementLocated, state));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return this;

    }

    public Fluent textToBePresentInElementLocated(By elementLocated, String expectedText) {
        try {
            visibilityOfElementLocated(elementLocated);
            driverWait.until(ExpectedConditions.textToBePresentInElementLocated(elementLocated, expectedText));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return this;

    }

    public Fluent textToBe(By elementLocated, String expectedText) {
        try {
            visibilityOfElementLocated(elementLocated);
            driverWait.until(ExpectedConditions.textToBe(elementLocated, expectedText));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return this;

    }

    public Fluent contextToBe(String context) {
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

    public Fluent urlContains(String expectedURL) {
        try {
            driverWait.until(ExpectedConditions.urlContains(expectedURL));
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return this;

    }
}