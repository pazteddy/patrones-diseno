package comportamiento.strategy.despues;

public class CompressorJpeg implements Compressor {

    @Override
    public void compress(String fileName) {
        // TODO Auto-generated method stub
        System.out.println("Se comprimio la imagen usando JPEG");
    }

}
