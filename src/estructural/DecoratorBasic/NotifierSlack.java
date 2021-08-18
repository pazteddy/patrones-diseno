package estructural.DecoratorBasic;

import java.util.List;

public class NotifierSlack extends Notifier {

    public NotifierSlack(List<String> destinatarios) {
        super(destinatarios);
    }

    @Override
    public void send(String message) {
        super.send(message);
        SendSlack(message);
    }

    private void SendSlack(String message) {
        for (String destinatario : _destinatarios) {
            System.out.println("SLACK: " + message + " TO " + destinatario);
        }
    }
}
