package estructural.Composite.Antes;

import java.util.ArrayList;
import java.util.List;

public class Group {
    // private List<Object> objects = new ArrayList<>();
    private List<Shape> shapes = new ArrayList<>();

    // public void Add(Object object) {
    // objects.add(object);
    public void Add(Shape shape) {
        shapes.add(shape);
    }

    public void render() {
        /*
         * for (var objeto : objects) { if (objeto instanceof Shape) ((Shape)
         * objeto).render(); else ((Group) objeto).render(); }
         */

        for (var shape : shapes)
            shape.render();
    }
}
