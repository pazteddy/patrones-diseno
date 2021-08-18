package estructural.Bridge.Despues;

public class SonyTV implements Device {

    @Override
    public void setChannel(int number) {
        System.out.println("Sony: se cambio al canal " + number);
    }

    @Override
    public void turnOn() {
        System.out.println("Sony: Encendido");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: Apagado");
    }

    @Override
    public void stop() {
        System.out.println("Sony: detener multimedia");
    }

}
