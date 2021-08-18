package comportamiento.observer.despues;

public class Chart implements Observer {
    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        System.out.println("Chart got updated with the value:" + dataSource.getValue());
    }

}
