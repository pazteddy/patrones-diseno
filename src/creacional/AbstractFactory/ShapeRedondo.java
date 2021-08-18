package creacional.AbstractFactory;

public class ShapeRedondo implements Shape {

    @Override
    public void dibujar(Color color) {
        System.out.println("Dibujando el Redondo");
        color.rellenar();
    }
}
