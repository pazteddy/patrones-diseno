package comportamiento.strategy.despues;

public class ImageStorage {
    public void store(String fileName, Filter filter, Compressor compressor) {
        compressor.compress(fileName);
        filter.apply(fileName);
    }
}
