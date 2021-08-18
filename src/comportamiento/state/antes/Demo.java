package comportamiento.state.antes;

public class Demo {
    public static void main(String[] args) {

        Canvas canvas = new Canvas();

        canvas.setCurreToolType(ToolType.SELECTION);
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurreToolType(ToolType.BRUSH);
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurreToolType(ToolType.ERASER);
        canvas.mouseDown();
        canvas.mouseUp();

    }
}
