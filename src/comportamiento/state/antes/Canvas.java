package comportamiento.state.antes;

public class Canvas {

    private ToolType curreToolType;

    public void mouseDown() {
        if (curreToolType == ToolType.SELECTION) {
            System.out.println("Se muestra el icono de seleccion");
        } else if (curreToolType == ToolType.BRUSH) {
            System.out.println("Se muestra el icono de pincel");
        } else if (curreToolType == ToolType.ERASER) {
            System.out.println("Se muestra el icono de borrador");
        }
    }

    public void mouseUp() {
        if (curreToolType == ToolType.SELECTION) {
            System.out.println("se dibuja el rectangulo segmentado...");
        } else if (curreToolType == ToolType.BRUSH) {
            System.out.println("Se dibuja la linea coloreada");
        } else if (curreToolType == ToolType.ERASER) {
            System.out.println("Se elimina el area seleccionada");
        }
    }

    public ToolType getCurreToolType() {
        return curreToolType;
    }

    public void setCurreToolType(ToolType curreToolType) {
        this.curreToolType = curreToolType;
    }

}
