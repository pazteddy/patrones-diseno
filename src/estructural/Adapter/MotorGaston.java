package estructural.Adapter;

public class MotorGaston extends Motor {
    public MotorGaston() {
        super();
        System.out.println("Creando el motor gaston");
    }

    public void encender() {
        System.out.println("Bum, bum....encendiendo motor gaston");
    }

    public void acelerar() {
        System.out.println("Buuuuuuuuuuuum, acelerando y gastando muuuucha gas");
    }

    public void apagar() {
        System.out.println("Apagando motor gaston");
    }

}