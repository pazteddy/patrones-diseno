package estructural.Adapter;

public class MotorEconomico extends Motor {

    public MotorEconomico() {
        super();
        System.out.println("Creando motor economico");
    }

    public void encender() {
        System.out.println("Encendiendo motor economico.");
    }

    public void acelerar() {
        System.out.println("Acelerando motor economico.");
    }

    public void apagar() {
        System.out.println("Apagando motor economico.");
    }

}