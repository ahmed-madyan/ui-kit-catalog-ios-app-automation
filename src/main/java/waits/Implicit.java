package waits;

import driver.DriverManager;
import exceptions.ExceptionHandling;

import java.time.Duration;

public class Implicit {
    public Implicit() {
    }

    public Implicit wait(Duration duration) {
        try {
            DriverManager.getDriverInstance().manage().timeouts().implicitlyWait(duration);
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return this;
    }
}