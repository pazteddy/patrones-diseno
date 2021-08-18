package creacional.FactoryMethod;

public class ConexionPostgreSQL implements IConexion {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionPostgreSQL() {
        this.host = "localhost";
        this.puerto = "5433";
        this.usuario = "postgres";
        this.contrasena = "123";
    }

    @Override
    public void conectar() {
        // Aquí puede ir código JDBC
        System.out.println("Se conectó a PostgreSQL");

    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó de PostgreSQL");

    }

}
