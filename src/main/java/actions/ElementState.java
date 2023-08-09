package actions;

import driver_manager.DriverManager;
import org.openqa.selenium.By;
import waits.Waits;

public class ElementState {

    public static boolean isCheckable(final By elementLocated) {
        boolean isCheckable = false;
        try {
            Waits.fluentlyWait().visibilityOfElementLocated(elementLocated);
            if (ElementActions.getAttribute(elementLocated, "checkable").equals("true")) {
                isCheckable = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isCheckable;
    }

    public static boolean isChecked(final By elementLocated) {
        boolean isChecked = false;
        try {
            Waits.fluentlyWait().visibilityOfElementLocated(elementLocated);
            if (ElementActions.getAttribute(elementLocated, "checked").equals("true")) {
                isChecked = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isChecked;
    }

    public static boolean isClickable(final By elementLocated) {
        boolean isClickable = false;
        try {
            Waits.fluentlyWait().visibilityOfElementLocated(elementLocated);
            if (ElementActions.getAttribute(elementLocated, "clickable").equals("true")) {
                isClickable = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isClickable;
    }

    public static boolean isEnabled(final By elementLocated) {
        boolean isEnabled = false;
        try {
            Waits.fluentlyWait().visibilityOfElementLocated(elementLocated);
            if (ElementActions.findElement(elementLocated).isEnabled()) {
                isEnabled = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isEnabled;
    }

    public static boolean isFocusable(final By elementLocated) {
        boolean isFocusable = false;
        try {
            Waits.fluentlyWait().visibilityOfElementLocated(elementLocated);
            if (ElementActions.findElement(elementLocated).getAttribute("focusable").equals("true")) {
                isFocusable = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isFocusable;
    }

    public static boolean isFocused(final By elementLocated) {
        boolean isFocused = false;
        try {
            Waits.fluentlyWait().visibilityOfElementLocated(elementLocated);
            if (ElementActions.findElement(elementLocated).getAttribute("focused").equals("true")) {
                isFocused = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isFocused;
    }

    public static boolean isLongClickable(final By elementLocated) {
        boolean isLongClickable = false;
        try {
            Waits.fluentlyWait().visibilityOfElementLocated(elementLocated);
            if (ElementActions.findElement(elementLocated).getAttribute("long-clickable").equals("true")) {
                isLongClickable = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isLongClickable;
    }

    public static boolean isPassword(final By elementLocated) {
        boolean isPassword = false;
        try {
            Waits.fluentlyWait().visibilityOfElementLocated(elementLocated);
            if (ElementActions.findElement(elementLocated).getAttribute("password").equals("true")) {
                isPassword = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isPassword;
    }

    public static boolean isScrollable(final By elementLocated) {
        boolean isScrollable = false;
        try {
            Waits.fluentlyWait().visibilityOfElementLocated(elementLocated);
            if (ElementActions.findElement(elementLocated).getAttribute("scrollable").equals("true")) {
                isScrollable = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isScrollable;
    }

    public static boolean isSelected(final By elementLocated) {
        boolean isSelected = false;
        try {
            Waits.fluentlyWait().visibilityOfElementLocated(elementLocated);
            if (ElementActions.findElement(elementLocated).isSelected()) {
                isSelected = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isSelected;
    }

    public static boolean isDisplayed(final By elementLocated) {
        boolean isDisplayed = false;
        try {
            if (DriverManager.getDriverInstance().findElement(elementLocated).isDisplayed()) {
                isDisplayed = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isDisplayed;
    }
}