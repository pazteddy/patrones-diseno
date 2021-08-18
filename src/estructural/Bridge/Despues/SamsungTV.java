package estructural.Bridge.Despues;

public class SamsungTV implements Device {

    @Override
    public void setChannel(int number) {
        System.out.println("Samsung: se cambio al canal " + number);
    }

    @Override
    public void turnOn() {
        System.out.println("Samsung: Encendido");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung: Apagado");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("Metodo no implementado");
    }

}
