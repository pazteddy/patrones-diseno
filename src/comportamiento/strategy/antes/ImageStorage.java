package comportamiento.strategy.antes;

public class ImageStorage {

    private String compressor;
    private String filter;

    public ImageStorage(String compressor, String filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName) {
        // JPEG, PNG ....
        if (compressor == "jpeg") {
            System.out.println("Se comprimio la imagen usando JPEG");
        } else if (compressor == "png") {
            System.out.println("Se comprimio la imagen usando PNG");
        }

        // Aplicar los filtros: B&N o high-contrast
        if (filter == "b&w") {
            System.out.println("Se aplico el filtro B&N");
        } else if (filter == "high-contrast") {
            System.out.println("Se aplico el filtro alto-contraste");
        }
    }

}
