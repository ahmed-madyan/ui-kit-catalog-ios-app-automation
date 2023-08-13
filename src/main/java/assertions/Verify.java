package assertions;

import elements.Elements;
import elements.element_actions.ElementActions;
import exceptions.ExceptionHandling;
import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import org.openqa.selenium.By;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class Verify {
    public Verify() {
    }

    static SoftAssert softAssert = new SoftAssert();

    public Verify elementCheckable(@NotNull final By elementLocated) {
        try {
            softAssert.assertTrue(Elements.elementState().isCheckable(elementLocated), "Element located with {" + elementLocated.toString() + "} is not checkable");
            softAssert.assertAll();
            System.out.println("Element located with {" + elementLocated + "} is checkable");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Verify elementChecked(@NotNull final By elementLocated) {
        try {
            softAssert.assertTrue(Elements.elementState().isChecked(elementLocated), "Element located with {" + elementLocated.toString() + "} is not checked");
            softAssert.assertAll();
            System.out.println("Element located with {" + elementLocated + "} is checked");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Verify elementClickable(@NotNull final By elementLocated) {
        try {
            softAssert.assertTrue(Elements.elementState().isClickable(elementLocated), "Element located with {" + elementLocated.toString() + "} is not clickable");
            softAssert.assertAll();
            System.out.println("Element located with {" + elementLocated + "} is clickable");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Verify elementEnabled(@NotNull final By elementLocated) {
        try {
            softAssert.assertTrue(Elements.elementState().isEnabled(elementLocated), "Element located with {" + elementLocated.toString() + "} is not enabled");
            softAssert.assertAll();
            System.out.println("Element located with {" + elementLocated + "} is enabled");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Verify elementFocusable(@NotNull final By elementLocated) {
        try {
            softAssert.assertTrue(Elements.elementState().isFocusable(elementLocated), "Element located with {" + elementLocated.toString() + "} is not focusable");
            softAssert.assertAll();
            System.out.println("Element located with {" + elementLocated + "} is focusable");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Verify elementFocused(@NotNull final By elementLocated) {
        try {
            softAssert.assertTrue(Elements.elementState().isFocused(elementLocated), "Element located with {" + elementLocated.toString() + "} is not focused");
            softAssert.assertAll();
            System.out.println("Element located with {" + elementLocated + "} is focused");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Verify elementLongClickable(@NotNull final By elementLocated) {
        try {
            softAssert.assertTrue(Elements.elementState().isLongClickable(elementLocated), "Element located with {" + elementLocated.toString() + "} is not long-clickable");
            softAssert.assertAll();
            System.out.println("Element located with {" + elementLocated + "} is long-clickable");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Verify elementPassword(@NotNull final By elementLocated) {
        try {
            softAssert.assertTrue(Elements.elementState().isPassword(elementLocated), "Element located with {" + elementLocated.toString() + "} is not password");
            softAssert.assertAll();
            System.out.println("Element located with {" + elementLocated + "} is password");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Verify elementScrollable(@NotNull final By elementLocated) {
        try {
            softAssert.assertTrue(Elements.elementState().isScrollable(elementLocated), "Element located with {" + elementLocated.toString() + "} is not scrollable");
            softAssert.assertAll();
            System.out.println("Element located with {" + elementLocated + "} is scrollable");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Verify elementSelected(@NotNull final By elementLocated) {
        try {
            softAssert.assertTrue(Elements.elementState().isSelected(elementLocated), "Element located with {" + elementLocated.toString() + "} is not selected");
            softAssert.assertAll();
            System.out.println("Element located with {" + elementLocated + "} is selected");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Verify elementDisplayed(@NotNull final By elementLocated) {
        try {
            softAssert.assertTrue(Elements.elementState().isDisplayed(elementLocated), "Element located with {" + elementLocated.toString() + "} is not displayed");
            softAssert.assertAll();
            System.out.println("Element located with {" + elementLocated + "} is displayed");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Verify elementNotDisplayed(@NotNull final By elementLocated) {
        try {
            new Assertion().assertFalse(Elements.elementState().isDisplayed(elementLocated), "Element located with {" + elementLocated.toString() + "} is displayed");
            System.out.println("Element located with {" + elementLocated + "} is displayed");
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Verify elementText(@NotNull final By elementLocated, final String expectedText) {
        try {
            softAssert.assertEquals(ElementActions.getText(elementLocated).trim(), expectedText.trim());
            softAssert.assertAll();
            System.out.println("Element text {" + ElementActions.getText(elementLocated).trim() + "} located with {" + elementLocated.toString() + "} is equals to the expected text {" + expectedText.trim() + "}");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Verify textToBe(@NotNull final String actualText, @NotNull final String expectedText) {
        try {
            softAssert.assertEquals(actualText, expectedText);
            softAssert.assertAll();
            System.out.println("Actual text {" + actualText + "} is equals to the expected text {" + expectedText + "}");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Verify attributeToBe(@NotNull final String attribute, @NotNull final boolean expected) {
        try {
            softAssert.assertEquals(attribute, expected);
            softAssert.assertAll();
            System.out.println("Attribute {" + attribute + "} is equals to the expected {" + expected + "}");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Verify attributeToBe(@NotNull final String attribute, @NotNull final String expected) {
        try {
            softAssert.assertEquals(attribute, expected);
            softAssert.assertAll();
            System.out.println("Attribute {" + attribute + "} is equals to the expected {" + expected + "}");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Verify elementAttributeToBe(@NotNull final By elementLocated, @NotNull final String attribute, @NotNull final boolean expected) {
        try {
            softAssert.assertEquals(ElementActions.getAttribute(elementLocated, attribute), expected);
            softAssert.assertAll();
            System.out.println("Attribute {" + attribute + "} is equals to the expected {" + expected + "}");
        } catch (Exception e) {
           ExceptionHandling.handleException(e);
        }
        return this;
    }

    public Verify elementAttributeToBe(@NotNull final By elementLocated, @NotNull final String attribute, @NotNull final String value) {
        try {
            softAssert.assertEquals(ElementActions.getAttribute(elementLocated, attribute), value);
            softAssert.assertAll();
            System.out.println("Attribute {" + attribute + "} is equals to the expected {" + value + "}");
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return this;
    }
}