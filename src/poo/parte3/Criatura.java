package poo.parte3;

abstract public class Criatura {
    // los campos protegidos son como las campos privados
    // excepto que otras clases pueden heredarlos
    protected String nombre;
    protected int altura;
    protected String sonido;

    // Metodos
    public abstract void setNombre(String nuevoNombre);

    public abstract String getNombre();

    public abstract void setAltura(int nuevoNombre);

    public abstract int getAltura();

}
