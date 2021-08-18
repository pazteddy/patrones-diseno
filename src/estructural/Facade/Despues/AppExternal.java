package estructural.Facade.Despues;

public class AppExternal {
    public static void main(String[] args) {
        var notificationServiceFacade = new NotificationServiceFacade();
        notificationServiceFacade.Send("llamando desde otra clase, se entiende?", "Alumnos");
    }

}
