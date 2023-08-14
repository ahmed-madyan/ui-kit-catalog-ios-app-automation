package elements.mobile_actions;

import elements.Elements;
import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import org.openqa.selenium.By;

public class IOSActions {
    public IOSActions() {
    }

    public IOSActions setPicker(@NotNull final By elementLocated, @NotNull final String value) {
        Elements
                .elementActions()
                .sendKeys(elementLocated, value);
        System.out.println("Picker value changed to be: " + Elements.elementActions().getText(elementLocated));
        return this;
    }

    public IOSActions setSlider(@NotNull final By elementLocated, @NotNull final String value) {
        Elements
                .elementActions()
                .sendKeys(elementLocated, value);
        System.out.println("Slider value changed to be: " + Elements.elementActions().getAttribute(elementLocated, "value"));
        return this;
    }
}