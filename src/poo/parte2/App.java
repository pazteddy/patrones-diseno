package poo.parte2;

public class App {
    public static void main(String[] args) {

        Perro peluchin = new Perro();
        peluchin.setNombre("Peluchin");
        System.out.println(peluchin.getNombre());
        peluchin.hacerHuecos();
        peluchin.setAltura(-1);

        // Ejemplo de paso por valor
        int randNum = 10;
        peluchin.cambiarValorVariable(randNum);
        System.out.println("El valor de randNum fuera del metodo es: " + randNum);

        // Ejemplo paso por referencia
        cambiarNombreObjeto(peluchin);
        System.out.println("El nombre del perro despues de llamar al metodo es: " + peluchin.getNombre());

        // Ejemplo de Polimorfismo
        Animal perrito = new Perro();
        Animal gatito = new Gato();

        System.out.println("El perrito dice " + perrito.getSonido()); // Ejecuta el método de la clase Perro
        System.out.println("El gatito dice " + gatito.getSonido()); // Ejecuta el método de la clase Gato

        // Ejemplo de Polimorfismo con arrays
        Animal[] animals = new Animal[4];
        animals[0] = perrito;
        animals[1] = gatito;

        System.out.println("El perrito dice " + animals[0].getSonido()); // Ejecuta el método de la clase Perro
        System.out.println("El gatito dice " + animals[1].getSonido()); // Ejecuta el método de la clase Gato

        // Ejemplo de Metodos estaticos
        animalDice(perrito);

        // perrito.hacerHuecos(); // no se puede
        ((Perro) perrito).hacerHuecos();

        // Ejemplo de clases abstractas - jirafa
        Jirafa jirafa = new Jirafa();
        jirafa.setNombre("Bridget");
        System.out.println(jirafa.getNombre());

    }

    public static void cambiarNombreObjeto(Perro fido) {
        fido.setNombre("fido");
    }

    public static void animalDice(Animal animal) {
        System.out.println("El animal dice " + animal.getSonido());
    }

}
