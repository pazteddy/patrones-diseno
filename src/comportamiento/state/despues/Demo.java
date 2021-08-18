package comportamiento.state.despues;

public class Demo {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();

        Tool tool = new Selection();

        canvas.setCurreToolType(tool);
        canvas.mouseDown();
        canvas.mouseUp();

        tool = new Brush();
        canvas.setCurreToolType(tool);
        canvas.mouseDown();
        canvas.mouseUp();

        tool = new Eraser();
        canvas.setCurreToolType(tool);
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
