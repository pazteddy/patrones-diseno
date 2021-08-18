package comportamiento.memento;

public class Editor {

    /*********************
     * FUNCIONES PROPIAS DEL EDITOR
     *******************************/
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    /*********************
     * FUNCIONES PARA INTERACTUAR CON LOS ESTADOS
     *******************************/
    public void restore(EditorState state) {
        content = state.getContent();
    }

    public EditorState createState() {
        return new EditorState(content);
    }

}
