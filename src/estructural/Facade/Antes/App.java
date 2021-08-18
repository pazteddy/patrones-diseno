package estructural.Facade.Antes;

import estructural.Facade.Services.Rest.Notification.NotificationService;
import estructural.Facade.Services.Rest.Notification.Authentication.AuthToken;
import estructural.Facade.Services.Rest.Notification.Comunication.Connection;
import estructural.Facade.Services.Rest.Notification.Models.Message;

public class App {
    public static void main(String[] args) {
        var service = new NotificationService();
        // connect() -> Connection
        Connection connection = service.connect("10.1.1.125");
        // autenticate(idAplicacion, llave) -> AuthToken
        AuthToken authToken = service.authenticate("idApplication", "key");
        // Send(authToken, message, target)
        Message message = new Message("Saludos Alumnos no se duerman");
        service.send(authToken, message, "Alumnos curso");
        // conn.disconect()
        connection.disconnect();
    }
}
