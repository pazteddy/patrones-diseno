package estructural.Bridge.Antes;

public class SamsungRemoteControl extends RemoteControl {

    @Override
    public void turnOn() {
        System.out.println("Samsung: Encendido");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung: Apagado");
    }

}
