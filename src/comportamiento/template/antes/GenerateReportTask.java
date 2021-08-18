package comportamiento.template.antes;

public class GenerateReportTask {
    private AuditTrail auditTrail;

    public GenerateReportTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        System.out.println("Se realizo, la generacion del reporte...");
        auditTrail.record("GenerateReportTask", "Luis");
    }
}
