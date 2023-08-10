package elements;

import driver.DriverManager;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

public class TouchActions {
    public TouchActions() {
    }


    public void scrollToElement(By elementLocator) {
//        touchActions.scrollToElement(DriverManager.getDriverInstance().findElement(elementLocator)).build().perform();
    }

    public void scroll() {
        int startX = 0; // Define the starting X-coordinate
        int startY = 0; // Define the starting Y-coordinate
        int endX = 0;   // Define the ending X-coordinate
        int endY = 0;   // Define the ending Y-coordinate
        TouchAction touchActions = new TouchAction((PerformsTouchActions) DriverManager.getDriverInstance());
        touchActions.press(PointOption.point(startX, startY))
                .waitAction()
                .moveTo(PointOption.point(endX, endY))
                .release()
                .perform();
    }
}