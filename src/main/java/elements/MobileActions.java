package elements;

public class MobileActions {
    public MobileActions() {
    }

    public AndroidActions androidActions() {
        return new AndroidActions();
    }

    public IOSActions iosActions() {
        return new IOSActions();
    }
}