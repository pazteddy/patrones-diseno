package estructural.Adapter;

public class App {
    public static void main(String[] args) {
        Motor motor = new MotorEconomico();
        motor.encender();
        motor.acelerar();
        motor.apagar();

        motor = new MotorGaston();
        motor.encender();
        motor.acelerar();
        motor.apagar();

        motor = new MotorElectricoAdapter();
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }
}