package creacional.AbstractFactory;

public class ShapeCuadrado implements Shape {

    @Override
    public void dibujar(Color color) {
        System.out.println("Dibujando el Cuadrado");
        color.rellenar();
    }
}
