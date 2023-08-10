package elements;

public class Elements {
    public Elements() {
    }

    public static GestureActions gestureActions() {
        return new GestureActions();
    }
    public static TouchActions touchActions() {
        return new TouchActions();
    }

    public static ElementActions elementActions() {
        return new ElementActions();
    }

    public static ElementState elementState() {
        return new ElementState();
    }
}