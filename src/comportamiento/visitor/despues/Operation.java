package comportamiento.visitor.despues;

public interface Operation {
    void apply(HeadingNode heading);

    void apply(AnchorNode anchor);
}
