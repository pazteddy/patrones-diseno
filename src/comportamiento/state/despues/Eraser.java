package comportamiento.state.despues;

public class Eraser implements Tool {

    @Override
    public void mouseUp() {
        System.out.println("Se elimina el area seleccionada");
    }

    @Override
    public void mouseDown() {
        System.out.println("Se muestra el icono de borrador");
    }

}
