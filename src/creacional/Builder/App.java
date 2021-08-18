package creacional.Builder;

public class App {
    public static void main(String[] args) {

        Cajero cajero = new Cajero();

        PedidoBuilder cajitaFeliz = new CajitaFeliz();
        cajero.hacerPedido(cajitaFeliz);
        cajero.armarPedido();
        Pedido primerPedido = cajero.entregarPedido();
        MostrarPedido(primerPedido);

        PedidoBuilder pedido2 = new ComboHamburguesa();
        cajero.hacerPedido(pedido2);
        cajero.armarPedido();
        Pedido segundoPedido = cajero.entregarPedido();
        MostrarPedido(segundoPedido);

        PedidoBuilder pedido3 = new ComboHamburguesa();
        cajero.hacerPedido(pedido3);
        cajero.armarPedido("Quarter Pound.", "Aros de Cebolla", "Sprite");
        Pedido tercerPedido = cajero.entregarPedido();
        MostrarPedido(tercerPedido);
    }

    private static void MostrarPedido(Pedido primerPedido) {
        System.out.println("________________________________________________________________");
        System.out.println("DESCRIPCION PEDIDO");
        System.out.println("Plato Principal: " + primerPedido.getPlatoPrincipal());
        System.out.println("Plato Acompaniamiento: " + primerPedido.getAcompanamiento());
        System.out.println("Plato Refresco: " + primerPedido.getRefresco());
        System.out.println("Plato Juguete: " + primerPedido.getJuguete());
    }
}
