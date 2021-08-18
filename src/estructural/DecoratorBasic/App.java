package estructural.DecoratorBasic;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        boolean facebook = true;
        boolean sms = true;
        boolean slack = true;

        List<String> destinatarios = new ArrayList<String>();
        destinatarios.add("Teddy");
        destinatarios.add("Ronald");
        destinatarios.add("Arturo");

        Notifier notifier = new Notifier(destinatarios);
        notifier.send("Alerta!!!");

        if (sms) {
            notifier = new NotifierSMS(destinatarios);
            notifier.send("Alerta!!!");
        }
        if (facebook) {
            notifier = new NotifierFacebook(destinatarios);
            notifier.send("Alerta!!!");
        }
        if (slack) {
            notifier = new NotifierSlack(destinatarios);
            notifier.send("Alerta!!!");
        }

    }

}
