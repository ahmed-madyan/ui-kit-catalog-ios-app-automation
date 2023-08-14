package elements.mobile_actions;

import assertions.Assertions;
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
        Assertions
                .hardAssert()
                .elementTextToBe(elementLocated, value);
        return this;
    }
}