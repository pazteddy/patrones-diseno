package creacional.Singleton;

public class App {

    public static void main(String[] args) {
        Database foo = Database.getInstancia("Instancia 1: Foo");
        foo.conectar();
        foo.ejecutarQuery("SELECT ... from Foo" + "\n\n");

        Database bar = Database.getInstancia("Instancia 2: Bar");
        bar.conectar();
        bar.ejecutarQuery("SELECT ... from bar" + "\n\n");

        System.out.println("bar");
        bar.desconectar();
        System.out.println("foo");
        foo.desconectar();
        System.out.println("\n\n");

        System.out.println("Si ves el mismo valor, entonces el singleton fue reutilizado (¡yay!)" + "\n"
                + "Si ves valores diferentes, entonces se crearon 2 instancias (¡buuu!)" + "\n\n" + "RESULTADO:"
                + "\n");
        System.out.println(foo.identificador);
        System.out.println(bar.identificador);
    }
}
