package elements.mobile_actions;

import assertions.Assertions;
import elements.Elements;
import org.openqa.selenium.By;

public class IOSActions {
    public IOSActions() {
    }

    public IOSActions setPicker(By elementLocated, String value) {
        Elements
                .elementActions()
                .sendKeys(elementLocated, value);
        Assertions
                .hardAssert()
                .elementTextToBe(elementLocated, value);
        return this;
    }
}
