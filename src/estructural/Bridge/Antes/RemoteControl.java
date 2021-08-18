package estructural.Bridge.Antes;

//Tipos Controles

// - ControlRemotoBasico (turnOn, turnOff)
//      - ControlRemotoSony
//      - ControlRemotoSamsung
//      - ControlRemotoAvanzado (setChannel)

public abstract class RemoteControl {

    public abstract void turnOn();

    public abstract void turnOff();

}
