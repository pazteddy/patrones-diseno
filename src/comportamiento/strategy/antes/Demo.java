package comportamiento.strategy.antes;

public class Demo {
    public static void main(String[] args) {
        String compressor = "jpeg";
        String filter = "high-contrast";
        ImageStorage imageStorage = new ImageStorage(compressor, filter);
        imageStorage.store("c://mifoto.abc");
    }

}
