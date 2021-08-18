package creacional.Singleton;

public final class Database {
    private static Database instancia;
    public String identificador;

    private Database(String value) {
        // Emulamos una inicializacion lenta
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.identificador = value;
    }

    public static Database getInstancia(String value) {
        if (instancia == null) {
            instancia = new Database(value);
        }
        return instancia;
    }

    public void conectar() {
        System.out.println("Se conecto a la BD");
    }

    public void desconectar() {
        System.out.println("Se desconecto de la base de datos");
    }

    public void ejecutarQuery(String sqlQuery) {
        System.out.println("Se ejecuto la consulta: " + sqlQuery);
    }
}