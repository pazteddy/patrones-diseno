package estructural.Flyweight.Antes;

public class App {
    public static void main(String[] args) {
        var service = new PointService();
        long beginTime = System.currentTimeMillis();
        for (var point : service.getPoints()) {
            point.draw();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total Time: " + (endTime - beginTime));
    }
}
