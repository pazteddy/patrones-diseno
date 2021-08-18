package estructural.Bridge.Antes;

public class SamsungAdvanceRemoteControl extends AdvancedRemoteControl {

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
}
