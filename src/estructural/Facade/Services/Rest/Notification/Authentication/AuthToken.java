package estructural.Facade.Services.Rest.Notification.Authentication;

public class AuthToken {

    private static String TOKEN = "ASDH!123QADAS";

    public AuthToken(String idApplication, String key) {
        System.out.println("Token generado para " + idApplication + " con la llave " + key);
    }

    public String getToken() {
        return TOKEN;
    }
}
