package comportamiento.state.despues;

public class Selection implements Tool {

    @Override
    public void mouseUp() {
        System.out.println("se dibuja el rectangulo segmentado...");
    }

    @Override
    public void mouseDown() {
        System.out.println("Se muestra el icono de seleccion");
    }

}
