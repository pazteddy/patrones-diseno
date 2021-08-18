package comportamiento.state.despues;

public class Brush implements Tool {

    @Override
    public void mouseUp() {
        System.out.println("Se dibuja la linea coloreada");
    }

    @Override
    public void mouseDown() {
        System.out.println("Se muestra el icono de pincel");
    }

}
