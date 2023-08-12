package elements;

public class Elements {
    public Elements() {
    }

    public static ElementActions elementActions() {
        return new ElementActions();
    }

    public static ElementState elementState() {
        return new ElementState();
    }

    public static GestureActions gestureActions() {
        return new GestureActions();
    }

    public static MobileActions mobileActions() {
        return new MobileActions();
    }
}