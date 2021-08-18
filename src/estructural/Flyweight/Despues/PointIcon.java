package estructural.Flyweight.Despues;

public class PointIcon {

    private final estructural.Flyweight.Despues.PointType type; // 4 bytes
    private final byte[] icon; // 20 kbytes -> 20 MB

    public PointIcon(PointType type, byte[] icon) {
        this.type = type;
        this.icon = icon;
    }

    public estructural.Flyweight.Despues.PointType getType() {
        return type;
    }
}
