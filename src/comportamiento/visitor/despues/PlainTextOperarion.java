package comportamiento.visitor.despues;

public class PlainTextOperarion implements Operation {

    @Override
    public void apply(HeadingNode heading) {
        System.out.println("Text - Heading node");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("Text - Anchor node");
    }

}
