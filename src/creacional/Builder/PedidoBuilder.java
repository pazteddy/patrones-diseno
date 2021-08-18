package creacional.Builder;

// CajitaFelizBuilder

public interface PedidoBuilder {

    public void PreparaPlatoPrincipal();

    public void PreparaAcompanamiento();

    public void ServirRefresco();

    public void IncluirJuguete();

    public void reset();

    public Pedido getPedido();
}
