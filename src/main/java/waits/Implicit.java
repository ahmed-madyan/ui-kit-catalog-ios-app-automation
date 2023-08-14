package waits;

import driver.DriverManager;
import exceptions.ExceptionHandling;
import groovyjarjarantlr4.v4.runtime.misc.NotNull;

import java.time.Duration;

public class Implicit {
    public Implicit() {
    }

    public Implicit wait(@NotNull final Duration duration) {
        try {
            DriverManager.getDriverInstance().manage().timeouts().implicitlyWait(duration);
        } catch (Exception e) {
            ExceptionHandling.handleException(e);
        }
        return this;
    }
}