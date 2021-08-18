package comportamiento.visitor.despues;

public class HighlightOperation implements Operation {

    @Override
    public void apply(HeadingNode heading) {
        System.out.println("Highlight - Heading node.");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("Highlight - Anchor node.");
    }

}
