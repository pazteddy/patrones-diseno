package comportamiento.observer.despues;

public class SpreadSheet implements Observer {

    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        System.out.println("SpreadSheet got notified with the value:" + dataSource.getValue());
    }

}
