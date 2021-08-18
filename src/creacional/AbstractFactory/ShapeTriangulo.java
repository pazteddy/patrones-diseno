package creacional.AbstractFactory;

public class ShapeTriangulo implements Shape {

    @Override
    public void dibujar(Color color) {
        System.out.println("Dibujando el Triangulo");
        color.rellenar();
    }
}
