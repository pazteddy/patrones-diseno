package estructural.Bridge.Antes;

public class App {
    public static void main(String[] args) {

        RemoteControl remoteControl = new SamsungRemoteControl();
        remoteControl.turnOn();
        remoteControl.turnOff();

        AdvancedRemoteControl advancedRemoteControl = new SamsungAdvanceRemoteControl();
        advancedRemoteControl.turnOn();
        advancedRemoteControl.turnOff();
        advancedRemoteControl.setChannel(20);

    }
}
