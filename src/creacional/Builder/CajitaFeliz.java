package creacional.Builder;

// Ejemplo Concrete Builder
public class CajitaFeliz implements PedidoBuilder {

    private Pedido cajitaFeliz;

    public CajitaFeliz() {
        this.cajitaFeliz = new Pedido();
    }

    @Override
    public void reset() {
        this.cajitaFeliz = new Pedido();

    }

    @Override
    public void PreparaPlatoPrincipal() {
        cajitaFeliz.setPlatoPrincipal("Hamburguesa con queso");
    }

    @Override
    public void PreparaAcompanamiento() {
        cajitaFeliz.setAcompanamiento("Papas fritas");
    }

    @Override
    public void ServirRefresco() {
        cajitaFeliz.setRefresco("Coca cola");
    }

    @Override
    public void IncluirJuguete() {
        cajitaFeliz.setJuguete("Juguete Snoopy");
    }

    @Override
    public Pedido getPedido() {
        return this.cajitaFeliz;
    }

}
