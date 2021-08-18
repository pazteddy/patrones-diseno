package estructural.Facade.Services.Rest.Notification.Comunication;

public class Connection {
    String ipAddress;

    public Connection(String ipAddress) {
        this.ipAddress = ipAddress;
        System.out.println("Se conecto al servidor: " + ipAddress);
    }

    public void disconnect() {
        System.out.println("Se desconecto del servidor: " + ipAddress);
    }

}
