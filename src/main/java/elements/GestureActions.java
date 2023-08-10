package elements;

public class GestureActions {
    public GestureActions() {
    }

    public ElementActions elementActions() {
        return new ElementActions();
    }

    public IOSGestures iosGestures() {
        return new IOSGestures();
    }

    public AndroidGestures androidGestures() {
        return new AndroidGestures();
    }
}