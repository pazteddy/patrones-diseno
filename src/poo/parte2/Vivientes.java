package poo.parte2;

public interface Vivientes {

    // No se utiliza la palabra reservada abstract
    // sin embargo todos los metodos son abstract por defecto

    public void setNombre(String nuevoNombre);

    public String getNombre();

    public void setAltura(Double nuevaAltura);

    public Double getAltura();

    public void setPeso(Double nuevoPeso);

    public Double getPeso();

    public void setComidaFavorita(String nuevaComida);

    public String getComidaFavorita();

    public void setVelocidad(Double nuevaVelocidad);

    public Double getVelocidad();

    public void setSonido(String nuevoSonido);

    public String getSonido();

}
