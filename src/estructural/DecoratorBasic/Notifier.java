package estructural.DecoratorBasic;

import java.util.List;

public class Notifier {

    List<String> _destinatarios;

    public Notifier(List<String> destinatarios) {
        super();
        this._destinatarios = destinatarios;
    }

    public void send(String message) {
        for (String destinatario : _destinatarios) {
            System.out.println("Email: " + message + " TO " + destinatario);
        }
    }
}
