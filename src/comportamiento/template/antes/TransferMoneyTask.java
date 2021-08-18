package comportamiento.template.antes;

public class TransferMoneyTask {

    private AuditTrail auditTrail;

    public TransferMoneyTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        System.out.println("Se realizo, la transferencia de dinero...");
        auditTrail.record("TransferMoneyTask", "Luis");
    }
}
