package creacional.FactoryMethod;

public class ConexionVacia implements IConexion {

    @Override
    public void conectar() {
        // TODO Auto-generated method stub
        System.out.println("NO SE ESPECIFICÓ PROVEEDOR");
    }

    @Override
    public void desconectar() {
        // TODO Auto-generated method stub
        System.out.println("NO SE ESPECIFICÓ PROVEEDOR");
    }

}
