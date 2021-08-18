package comportamiento.visitor.antes;

public class AnchorNode implements HtmlNode {

    @Override
    public void highlight() {
        System.out.println("Highlight - Anchor node.");
    }

}
