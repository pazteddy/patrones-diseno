package creacional.Builder;

public class ComboHamburguesa implements PedidoBuilder {

    private Pedido combo1;

    public ComboHamburguesa() {
        this.combo1 = new Pedido();
    }

    @Override
    public void reset() {
        this.combo1 = new Pedido();

    }

    @Override
    public void PreparaPlatoPrincipal() {
        combo1.setPlatoPrincipal("Big Mac");
    }

    @Override
    public void PreparaAcompanamiento() {
        combo1.setAcompanamiento("Papas fritas Grandes");
    }

    @Override
    public void ServirRefresco() {
        combo1.setRefresco("Coca cola Grande");
    }

    @Override
    public Pedido getPedido() {
        return this.combo1;
    }

    @Override
    public void IncluirJuguete() {
        // TODO Auto-generated method stub

    }

}
