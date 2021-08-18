package estructural.Flyweight.Despues;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PointService {

    private PointIconFactory iconFactory;
    private Random rnd;

    public PointService(PointIconFactory iconFactory) {
        this.iconFactory = iconFactory;
        this.rnd = new Random();
    }

    public List<Point> getPoints() {
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            var point = new Point(getRandX(), getRandY(), iconFactory.getPointIcon(getRandType()));
            // var point = new Point(getRandX(), getRandY(),
            // iconFactory.getPointIcon(getRandType()));
            points.add(point);
        }
        return points;
    }

    private PointType getRandType() {
        int rndInt = rnd.nextInt(4);
        return PointType.values()[rndInt];
    }

    private int getRandX() {
        return rnd.nextInt(1000);
    }

    private int getRandY() {
        return rnd.nextInt(200);
    }
}
