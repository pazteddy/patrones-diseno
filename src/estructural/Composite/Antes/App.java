package estructural.Composite.Antes;

public class App {
    public static void main(String[] args) {
        var group1 = new Group();
        group1.Add(new Shape()); // Cuadrado
        group1.Add(new Shape()); // Cuadrado

        var group2 = new Group();
        group2.Add(new Shape()); // Circulo
        group2.Add(new Shape()); // Circulo

        var group = new Group();
        // Inicialmente no podemos añadir grupos dentro de otro grupo
        // vayamos a cambiar la calse group para que reciba cualquier objeto
        // group.Add(group1); // Cuadrados
        // group.Add(group2); // Circulos

        group.render();

    }
}
