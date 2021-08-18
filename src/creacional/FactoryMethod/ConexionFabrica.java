package creacional.FactoryMethod;

public class ConexionFabrica {

    public IConexion getConexion(String motor) {
        if (motor == null) {
            return new ConexionVacia();
        } else if (motor.equalsIgnoreCase("MySQL")) {
            return new ConexionMySQL();

        } else if (motor.equalsIgnoreCase("ORACLE")) {
            return new ConexionOracle();

        } else if (motor.equalsIgnoreCase("POSTGRES")) {
            return new ConexionPostgreSQL();

        } else if (motor.equalsIgnoreCase("SQL")) {
            return new ConexionSQLServer();

        }
        return new ConexionVacia();
    }

}
