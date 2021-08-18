package estructural.Decorator;

public abstract class BaseDecorator implements Notifier {

    private Notifier wrappee;

    public BaseDecorator(Notifier notifier) {
        this.wrappee = notifier;
    }

    @Override
    public void Send(String message) {
        wrappee.Send(message);
    }
}