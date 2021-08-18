package comportamiento.state.despues;

public class Canvas {
    private Tool curreToolType;

    public void mouseDown() {
        curreToolType.mouseDown();
    }

    public void mouseUp() {
        curreToolType.mouseUp();
    }

    public void setCurreToolType(Tool curreToolType) {
        this.curreToolType = curreToolType;
    }
}
