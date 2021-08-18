package comportamiento.observer.despues;

public class Demo {
    public static void main(String[] args) {
        var dataSource = new DataSource();

        var chart = new Chart(dataSource);
        var sheet = new SpreadSheet(dataSource);
        var sheet2 = new SpreadSheet(dataSource);

        dataSource.addObserver(chart);
        dataSource.addObserver(sheet);
        dataSource.addObserver(sheet2);

        dataSource.setValue(1);

        dataSource.removeObserver(sheet);
        dataSource.setValue(2);

    }

}
