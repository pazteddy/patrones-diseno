package creacional.AbstractFactory;

public class FactoryRedondoVerde extends AbstractFactory {

    @Override
    public Shape getShape() {
        return new ShapeRedondo();
    }

    @Override
    public Color getColor() {
        return new ColorVerde();
    }

}
