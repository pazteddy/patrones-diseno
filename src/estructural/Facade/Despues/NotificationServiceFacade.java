package estructural.Facade.Despues;

import estructural.Facade.Services.Rest.Notification.NotificationService;
import estructural.Facade.Services.Rest.Notification.Authentication.AuthToken;
import estructural.Facade.Services.Rest.Notification.Comunication.Connection;
import estructural.Facade.Services.Rest.Notification.Models.Message;

public class NotificationServiceFacade {
    public void Send(String message, String target) {
        var service = new NotificationService();
        // connect() -> Connection
        Connection connection = service.connect("10.1.1.125");
        // autenticate(idAplicacion, llave) -> AuthToken
        AuthToken authToken = service.authenticate("idApplication", "key");
        // Send(authToken, message, target)
        Message messageObject = new Message(message);
        service.send(authToken, messageObject, target);
        // conn.disconect()
        connection.disconnect();
    }
}
