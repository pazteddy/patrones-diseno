package estructural.Decorator;

public class FacebookNotifier extends BaseDecorator {

    public FacebookNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void Send(String message) {
        super.Send(message);
        sendFacebook(message);
    }

    private void sendFacebook(String message) {
        System.out.println("Facebook: " + message);
    }
}
