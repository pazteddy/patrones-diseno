package estructural.Flyweight.Despues;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PointIconFactory {

    private Map<PointType, PointIcon> icons = new HashMap<>();

    public PointIcon getPointIcon(PointType type) {
        // key -> value
        // PointType -> PointIcon
        if (!icons.containsKey(type)) {
            byte[] icon = getIconByType(type);
            var pointIcon = new PointIcon(type, icon);
            icons.put(type, pointIcon);
        }

        return icons.get(type);
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
}
