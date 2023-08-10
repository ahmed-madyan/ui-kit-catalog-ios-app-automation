package elements;

public class MobileActions {
    public MobileActions() {
    }

    public static AndroidActions androidActions() {
        return new AndroidActions();
    }

    public static IOSActions iosActions() {
        return new IOSActions();
    }
}