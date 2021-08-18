package estructural.Bridge.Despues;

public class VCRRemoteControl extends RemoteControl {

    public VCRRemoteControl(Device device) {
        super(device);
        // TODO Auto-generated constructor stub
    }

    public void detener() {
        device.stop();
    }

}
