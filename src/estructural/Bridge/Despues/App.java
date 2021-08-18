package estructural.Bridge.Despues;

public class App {
    public static void main(String[] args) {

        Device myDevice = new SonyTV();

        RemoteControl remoteControl = new RemoteControl(myDevice);
        remoteControl.turnOn();
        remoteControl.turnOff();

        AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(myDevice);
        advancedRemoteControl.turnOn();
        advancedRemoteControl.turnOff();
        advancedRemoteControl.setChannel(20);

        VCRRemoteControl vcrRemoteControl = new VCRRemoteControl(myDevice);
        vcrRemoteControl.turnOn();
        vcrRemoteControl.turnOff();
        vcrRemoteControl.detener();

    }
}