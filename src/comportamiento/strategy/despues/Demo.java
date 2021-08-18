package comportamiento.strategy.despues;

public class Demo {
    public static void main(String[] args) {
        Compressor compressor = new CompressorJpeg();
        Filter filter = new FilterHighContrast();
        ImageStorage imageStorage = new ImageStorage();
        imageStorage.store("c://mifoto.abc", filter, compressor);
    }

}
