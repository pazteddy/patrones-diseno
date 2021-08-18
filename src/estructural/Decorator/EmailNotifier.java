package estructural.Decorator;

import java.util.List;

public class EmailNotifier implements Notifier {

    private List<String> targetList;

    public EmailNotifier(List<String> target) {
        super();
        this.targetList = target;
    }

    @Override
    public void Send(String message) {
        for (String receiver : targetList) {
            System.out.println("Sending email with message: " + message + " To " + receiver);
        }
    }

}
