package estructural.Bridge.Antes;

public class SonyRemoteControl extends RemoteControl {

    @Override
    public void turnOn() {
        System.out.println("Sony: Encendido");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: Apagado");
    }

}
