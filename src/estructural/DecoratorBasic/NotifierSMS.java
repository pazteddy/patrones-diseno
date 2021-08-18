package estructural.DecoratorBasic;

import java.util.List;

public class NotifierSMS extends Notifier {

    public NotifierSMS(List<String> destinatarios) {
        super(destinatarios);
    }

    @Override
    public void send(String message) {
        super.send(message);
        SendSms(message);
    }

    private void SendSms(String message) {
        for (String destinatario : _destinatarios) {
            System.out.println("SMS: " + message + " TO " + destinatario);
        }
    }
}
