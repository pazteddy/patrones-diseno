package estructural.DecoratorBasic;

import java.util.List;

public class NotifierFacebook extends Notifier {

    public NotifierFacebook(List<String> destinatarios) {
        super(destinatarios);
    }

    @Override
    public void send(String message) {
        super.send(message);
        SendFacebook(message);
    }

    private void SendFacebook(String message) {
        for (String destinatario : _destinatarios) {
            System.out.println("FACEBOOK: " + message + " TO " + destinatario);
        }
    }
}
