package waits;

import driver_manager.DriverManager;
import exception_handling.ExceptionHandling;

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