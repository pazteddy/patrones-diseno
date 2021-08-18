package estructural.Facade.Despues;

public class App {
    public static void main(String[] args) {
        var notificationServiceFacade = new NotificationServiceFacade();
        notificationServiceFacade.Send("Siguen despiertos muchachos?", "Alumnos");
    }
}
