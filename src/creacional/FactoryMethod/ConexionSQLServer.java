package creacional.FactoryMethod;

public class ConexionSQLServer implements IConexion {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionSQLServer() {
        this.host = "localhost";
        this.puerto = "1433";
        this.usuario = "sa";
        this.contrasena = "123";
    }

    @Override
    public void conectar() {
        // Aquí puede ir código JDBC
        System.out.println("Se conectó a SQLServer");

    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó de SQLServer");

    }

}
