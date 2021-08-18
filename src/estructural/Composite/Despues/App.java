package estructural.Composite.Despues;

public class App {
    public static void main(String[] args) {
        var group1 = new Group();
        group1.add(new Shape()); // Cuadrado
        group1.add(new Shape()); // Cuadrado

        var group2 = new Group();
        group2.add(new Shape()); // Circulo
        group2.add(new Shape()); // Circulo

        var group = new Group();
        group.add(group1); // Cuadrados
        group.add(group2); // Circulos

        group.render();
        group.move();
    }
}
