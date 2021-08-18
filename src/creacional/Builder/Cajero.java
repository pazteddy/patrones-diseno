package creacional.Builder;

// Esta es la clase Director
public class Cajero {

    private PedidoBuilder pedido;

    public Cajero() {
    }

    public void hacerPedido(PedidoBuilder pedido) {
        this.pedido = pedido;
    }

    public void armarPedido() {
        pedido.reset();
        this.pedido.PreparaPlatoPrincipal();
        this.pedido.PreparaAcompanamiento();
        this.pedido.ServirRefresco();
        if (pedido instanceof CajitaFeliz)
            this.pedido.IncluirJuguete();
    }

    public void armarPedido(String comida, String acompaniamiento, String refresco) {
        armarPedido();
        pedido.getPedido().setPlatoPrincipal(comida);
        pedido.getPedido().setAcompanamiento(acompaniamiento);
        pedido.getPedido().setRefresco(refresco);
    }

    public Pedido entregarPedido() {
        return this.pedido.getPedido();
    }
}
