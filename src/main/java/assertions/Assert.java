package assertions;

import elements.Elements;
import elements.element_actions.ElementActions;
import exceptions.ExceptionHandling;
import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import org.openqa.selenium.By;
import org.testng.asserts.Assertion;

public class Assert {
    public Assert() {
    }

    public Assert elementCheckable(@NotNull final By elementLocated) {
        try {
            new Assertion().assertTrue(Elements.elementState().isCheckable(elementLocated), "Element located with {" + elementLocated.toString() + "} is not checkable");
            System.out.println("Element located with {" + elementLocated + "} is checkable");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Assert elementChecked(@NotNull final By elementLocated) {
        try {
            new Assertion().assertTrue(Elements.elementState().isChecked(elementLocated), "Element located with {" + elementLocated.toString() + "} is not checked");
            System.out.println("Element located with {" + elementLocated + "} is checked");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Assert elementClickable(@NotNull final By elementLocated) {
        try {
            new Assertion().assertTrue(Elements.elementState().isClickable(elementLocated), "Element located with {" + elementLocated.toString() + "} is not clickable");
            System.out.println("Element located with {" + elementLocated + "} is clickable");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Assert elementEnabled(@NotNull final By elementLocated) {
        try {
            new Assertion().assertTrue(Elements.elementState().isEnabled(elementLocated), "Element located with {" + elementLocated.toString() + "} is not enabled");
            System.out.println("Element located with {" + elementLocated + "} is enabled");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Assert elementFocusable(@NotNull final By elementLocated) {
        try {
            new Assertion().assertTrue(Elements.elementState().isFocusable(elementLocated), "Element located with {" + elementLocated.toString() + "} is not focusable");
            System.out.println("Element located with {" + elementLocated + "} is focusable");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Assert elementFocused(@NotNull final By elementLocated) {
        try {
            new Assertion().assertTrue(Elements.elementState().isFocused(elementLocated), "Element located with {" + elementLocated.toString() + "} is not focused");
            System.out.println("Element located with {" + elementLocated + "} is focused");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Assert elementLongClickable(@NotNull final By elementLocated) {
        try {
            new Assertion().assertTrue(Elements.elementState().isLongClickable(elementLocated), "Element located with {" + elementLocated.toString() + "} is not long-clickable");
            System.out.println("Element located with {" + elementLocated + "} is long-clickable");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Assert elementPassword(@NotNull final By elementLocated) {
        try {
            new Assertion().assertTrue(Elements.elementState().isPassword(elementLocated), "Element located with {" + elementLocated.toString() + "} is not password");
            System.out.println("Element located with {" + elementLocated + "} is password");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Assert elementScrollable(@NotNull final By elementLocated) {
        try {
            new Assertion().assertTrue(Elements.elementState().isScrollable(elementLocated), "Element located with {" + elementLocated.toString() + "} is not scrollable");
            System.out.println("Element located with {" + elementLocated + "} is scrollable");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Assert elementSelected(@NotNull final By elementLocated) {
        try {
            new Assertion().assertTrue(Elements.elementState().isSelected(elementLocated), "Element located with {" + elementLocated.toString() + "} is not selected");
            System.out.println("Element located with {" + elementLocated + "} is selected");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Assert elementDisplayed(@NotNull final By elementLocated) {
        try {
            new Assertion().assertTrue(Elements.elementState().isDisplayed(elementLocated), "Element located with {" + elementLocated.toString() + "} is not displayed");
            System.out.println("Element located with {" + elementLocated + "} is displayed");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Assert elementNotDisplayed(@NotNull final By elementLocated) {
        try {
            new Assertion().assertFalse(Elements.elementState().isDisplayed(elementLocated), "Element located with {" + elementLocated.toString() + "} is displayed");
            System.out.println("Element located with {" + elementLocated + "} is displayed");
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Assert elementTextToBe(@NotNull final By elementLocated, final String expectedText) {
        try {
            new Assertion().assertEquals(ElementActions.getText(elementLocated).trim(), expectedText.trim());
            System.out.println("Element text {" + ElementActions.getText(elementLocated).trim() + "} located with {" + elementLocated.toString() + "} is equals to the expected text {" + expectedText.trim() + "}");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Assert elementTextContains(@NotNull final By elementLocated, final String expectedText) {
        try {
            new Assertion().assertTrue(ElementActions.getText(elementLocated).trim().contains(expectedText.trim()));
            System.out.println("Element text {" + ElementActions.getText(elementLocated).trim() + "} located with {" + elementLocated.toString() + "} contains the expected text {" + expectedText.trim() + "}");
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return this;
    }
    public Assert textToBe(@NotNull final String actualText, @NotNull final String expectedText) {
        try {
            new Assertion().assertEquals(actualText, expectedText);
            System.out.println("Actual text {" + actualText + "} is equals to the expected text {" + expectedText + "}");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Assert attributeToBe(@NotNull final String attribute, @NotNull final boolean expected) {
        try {
            new Assertion().assertEquals(attribute, expected);
            System.out.println("Attribute {" + attribute + "} is equals to the expected {" + expected + "}");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Assert attributeToBe(@NotNull final String attribute, @NotNull final String expected) {
        try {
            new Assertion().assertEquals(attribute, expected);
            System.out.println("Attribute {" + attribute + "} is equals to the expected {" + expected + "}");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Assert elementAttributeToBe(@NotNull final By elementLocated, @NotNull final String attribute, @NotNull final boolean expected) {
        try {
            new Assertion().assertEquals(ElementActions.getAttribute(elementLocated, attribute), expected);
            System.out.println("Attribute {" + attribute + "} is equals to the expected {" + expected + "}");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Assert elementAttributeToBe(@NotNull final By elementLocated, @NotNull final String attribute, @NotNull final String value) {
        try {
            new Assertion().assertEquals(ElementActions.getAttribute(elementLocated, attribute), value);
            System.out.println("Attribute {" + attribute + "} is equals to the expected {" + value + "}");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }
}