package elements;

import driver.DriverManager;
import exception_handling.ExceptionHandling;
import org.openqa.selenium.By;
import waits.Waits;

public class ElementState {
    public ElementState() {
    }

    public  boolean isCheckable(final By elementLocated) {
        boolean isCheckable = false;
        try {
            Waits.fluentlyWait().visibilityOfElementLocated(elementLocated);
            if (ElementActions.getAttribute(elementLocated, "checkable").equals("true")) {
                isCheckable = true;
            }
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return isCheckable;
    }

    public  boolean isChecked(final By elementLocated) {
        boolean isChecked = false;
        try {
            Waits.fluentlyWait().visibilityOfElementLocated(elementLocated);
            if (ElementActions.getAttribute(elementLocated, "checked").equals("true")) {
                isChecked = true;
            }
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return isChecked;
    }

    public  boolean isClickable(final By elementLocated) {
        boolean isClickable = false;
        try {
            Waits.fluentlyWait().visibilityOfElementLocated(elementLocated);
            if (ElementActions.getAttribute(elementLocated, "clickable").equals("true")) {
                isClickable = true;
            }
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return isClickable;
    }

    public  boolean isEnabled(final By elementLocated) {
        boolean isEnabled = false;
        try {
            Waits.fluentlyWait().visibilityOfElementLocated(elementLocated);
            if (ElementActions.findElement(elementLocated).isEnabled()) {
                isEnabled = true;
            }
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return isEnabled;
    }

    public  boolean isFocusable(final By elementLocated) {
        boolean isFocusable = false;
        try {
            Waits.fluentlyWait().visibilityOfElementLocated(elementLocated);
            if (ElementActions.findElement(elementLocated).getAttribute("focusable").equals("true")) {
                isFocusable = true;
            }
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return isFocusable;
    }

    public  boolean isFocused(final By elementLocated) {
        boolean isFocused = false;
        try {
            Waits.fluentlyWait().visibilityOfElementLocated(elementLocated);
            if (ElementActions.findElement(elementLocated).getAttribute("focused").equals("true")) {
                isFocused = true;
            }
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return isFocused;
    }

    public  boolean isLongClickable(final By elementLocated) {
        boolean isLongClickable = false;
        try {
            Waits.fluentlyWait().visibilityOfElementLocated(elementLocated);
            if (ElementActions.findElement(elementLocated).getAttribute("long-clickable").equals("true")) {
                isLongClickable = true;
            }
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return isLongClickable;
    }

    public  boolean isPassword(final By elementLocated) {
        boolean isPassword = false;
        try {
            Waits.fluentlyWait().visibilityOfElementLocated(elementLocated);
            if (ElementActions.findElement(elementLocated).getAttribute("password").equals("true")) {
                isPassword = true;
            }
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return isPassword;
    }

    public  boolean isScrollable(final By elementLocated) {
        boolean isScrollable = false;
        try {
            Waits.fluentlyWait().visibilityOfElementLocated(elementLocated);
            if (ElementActions.findElement(elementLocated).getAttribute("scrollable").equals("true")) {
                isScrollable = true;
            }
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return isScrollable;
    }

    public  boolean isSelected(final By elementLocated) {
        boolean isSelected = false;
        try {
            Waits.fluentlyWait().visibilityOfElementLocated(elementLocated);
            if (ElementActions.findElement(elementLocated).isSelected()) {
                isSelected = true;
            }
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return isSelected;
    }

    public  boolean isDisplayed(final By elementLocated) {
        boolean isDisplayed = false;
        try {
            if (DriverManager.getDriverInstance().findElement(elementLocated).isDisplayed()) {
                isDisplayed = true;
            }
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return isDisplayed;
    }
}