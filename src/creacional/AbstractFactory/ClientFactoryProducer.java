package creacional.AbstractFactory;

public class ClientFactoryProducer {

	private Color paleta;
	private Shape figura;

	public ClientFactoryProducer(AbstractFactory factory) {
		paleta = factory.getColor();
		figura = factory.getShape();
	}

	public void dibujarFigura() {
		// ....
		figura.dibujar(paleta);
		// ....
	}

}
