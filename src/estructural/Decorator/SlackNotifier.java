package estructural.Decorator;

public class SlackNotifier extends BaseDecorator {

    public SlackNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void Send(String message) {
        super.Send(message);
        sendSlack(message);
    }

    private void sendSlack(String message) {
        System.out.println("Slack: " + message);
    }
}
