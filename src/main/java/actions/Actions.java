package actions;

public class Actions {
    public Actions() {
    }

    public static GestureActions gestureActions() {
        return new GestureActions();
    }

    public static ElementActions elementActions() {
        return new ElementActions();
    }

    public static ElementState elementState() {
        return new ElementState();
    }
}
