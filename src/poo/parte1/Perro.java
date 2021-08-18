package poo.parte1;

public class Perro extends Animal {

    public void hacerHuecos() {
        System.out.println("hoyo cavado...");
    }

    public Perro() {
        super();

        setSonido("Guauu, Guau");
    }

    public void cambiarValorVariable(int randNum) {
        randNum = 12;
        System.out.println("El valor de randNum en el metodo es: " + randNum);
    }
}