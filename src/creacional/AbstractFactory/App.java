package creacional.AbstractFactory;

public class App {
    public static void main(String[] args) throws Exception {
        // Abstract factory #1
        AbstractFactory factory1 = new FactoryCuadradoRojo();
        ClientFactoryProducer client1 = new ClientFactoryProducer(factory1);
        client1.dibujarFigura();

        // Abstract factory #2
        AbstractFactory factory2 = new FactoryRedondoVerde();
        ClientFactoryProducer client2 = new ClientFactoryProducer(factory2);
        client2.dibujarFigura();
    }
}
