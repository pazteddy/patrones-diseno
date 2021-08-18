package comportamiento.template.antes;

public class Demo {

    public static void main(String[] args) {

        AuditTrail auditTrail = new AuditTrail();

        // TransferMoney
        TransferMoneyTask transferMoneyTask = new TransferMoneyTask(auditTrail);
        transferMoneyTask.execute();

        // GenerateReport
        GenerateReportTask generateReportTask = new GenerateReportTask(auditTrail);
        generateReportTask.execute();
    }
}
