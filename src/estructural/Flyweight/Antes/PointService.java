package estructural.Flyweight.Antes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PointService {
    Random rnd = new Random();

    public List<Point> getPoints() {
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            var type = getRandType();
            var icon = getIconByType(type);

            var point = new Point(getRandX(), getRandY(), type, icon);
            points.add(point);
        }
        return points;
    }

    private byte[] getIconByType(PointType type) {
        byte[] icon = null;
        String path = "C:\\Users\\BAIRESDEV\\Pictures\\Backgrounds\\unnamed.jpg";
        try {
            icon = Files.readAllBytes(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // byte[] icon = type.toString().getBytes();
        return icon;
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
