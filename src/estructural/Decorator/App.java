package estructural.Decorator;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Notifier notifier = SetNotifier(true, true, true);

        notifier.Send("!Alerta¡");
    }

    private static Notifier SetNotifier(boolean facebookEnabled, boolean slackEnabled, boolean smsEnabled) {
        List<String> target = GetMailRecipients();
        Notifier stack = new EmailNotifier(target);

        if (facebookEnabled)
            stack = new FacebookNotifier(stack);
        if (slackEnabled)
            stack = new SlackNotifier(stack);
        if (smsEnabled)
            stack = new SMSNotifier(stack);

        return stack;
    }

    private static List<String> GetMailRecipients() {
        List<String> target = new ArrayList<String>() {
            {
                add("Lucho");
                add("Arturo");
                add("Ronald");
            }
        };
        return target;
    }

}
