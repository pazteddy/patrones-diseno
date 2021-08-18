package poo.parte1;

public class App {
    public static void main(String[] args) {
        Perro peluchin = new Perro();
        peluchin.setNombre("Peluchin");
        System.out.println(peluchin.getNombre());
        peluchin.hacerHuecos();
        peluchin.setAltura(-1);

        int randNum = 10;
        peluchin.cambiarValorVariable(randNum);
        System.out.println("El valor de randNum fuera del metodo es: " + randNum);

        cambiarNombreObjeto(peluchin);
        System.out.println("El nombre del perro despues de llamar al metodo es: " + peluchin.getNombre());
    }

    public static void cambiarNombreObjeto(Perro fido) {
        fido.setNombre("fido");
    }

}
