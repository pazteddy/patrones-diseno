package estructural.Facade.Services.Rest.Notification;

import estructural.Facade.Services.Rest.Notification.Authentication.AuthToken;
import estructural.Facade.Services.Rest.Notification.Comunication.Connection;
import estructural.Facade.Services.Rest.Notification.Models.Message;

public class NotificationService {

    public Connection connect(String ipAddress) {
        return new Connection(ipAddress);
    }

    public AuthToken authenticate(String idApplication, String key) {
        return new AuthToken(idApplication, key);
    }

    public void send(AuthToken authToken, Message message, String target) {
        System.out.println("Enviando un mensaje");
        message.show();
        System.out.println("a: " + target);
        System.out.println("usando el token valido" + authToken.getToken());
    }

}
