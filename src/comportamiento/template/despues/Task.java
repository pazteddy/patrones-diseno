package comportamiento.template.despues;

public abstract class Task {
    private AuditTrail auditTrail;

    public Task() {
        auditTrail = new AuditTrail();
    }

    public void execute() {
        doExecute();
        auditTrail.record("Luis");
    }

    protected abstract void doExecute();
}
