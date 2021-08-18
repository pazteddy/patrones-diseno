package poo.parte3;

public class Animal {
	private String nombre;
	private double altura;
	// private int peso;
	private String sonido;

	public void setNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setAltura(int nuevaAltura) {
		if (nuevaAltura > 0) {
			altura = nuevaAltura;
		} else {
			System.out.println("El peso debe ser mayor a 0.");
		}
	}

	public double getAltura() {
		return altura;
	}

	public void setSonido(String nuevoSonido) {
		sonido = nuevoSonido;
	}

	public String getSonido() {
		return sonido;
	}

}