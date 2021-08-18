package estructural.Bridge.Antes;

public class SonyAdvancedRemoteControl extends AdvancedRemoteControl {

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
}
