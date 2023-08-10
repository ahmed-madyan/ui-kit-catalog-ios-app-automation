package driver_manager;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;

import java.util.Set;

public class AndroidDriver {
    public AndroidDriver() {
    }

    public io.appium.java_client.android.AndroidDriver getAndroidDriver() {
        return ((io.appium.java_client.android.AndroidDriver) DriverManager.getDriverInstance());
    }

    public Set<String> getContextHandles() {
        return getAndroidDriver().getContextHandles();
    }

    public String getCurrentContextHandle() {
        return getAndroidDriver().getContext();
    }

    public void switchContext(@NotNull final String context) {
        getAndroidDriver().context(context);
    }
}