package poo.parte3;

public class Perro extends Animal {

    public Perro() {
        super();
        setSonido("Guauu, Guau");
    }

    public void hacerHuecos() {
        System.out.println("hoyo cavado...");
    }

    public void cambiarValorVariable(int randNum) {
        randNum = 12;
        System.out.println("El valor de randNum en el metodo es: " + randNum);
    }
}