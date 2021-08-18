package estructural.Decorator;

public class SMSNotifier extends BaseDecorator {

    public SMSNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void Send(String message) {
        super.Send(message);
        sendSMS(message);
    }

    private void sendSMS(String message) {
        System.out.println("SMS: " + message);
    }
}
