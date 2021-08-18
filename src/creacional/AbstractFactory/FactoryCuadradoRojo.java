package creacional.AbstractFactory;

public class FactoryCuadradoRojo extends AbstractFactory {

    @Override
    public Shape getShape() {
        return new ShapeCuadrado();
    }

    @Override
    public Color getColor() {
        return new ColorRojo();
    }

}
