package comportamiento.template.despues;

public class Demo {
    public static void main(String[] args) {
        TransferMoneyTask transferMoneyTask = new TransferMoneyTask();
        transferMoneyTask.execute();

        GenerateReportTask generateReportTask = new GenerateReportTask();
        generateReportTask.execute();
    }
}
