package comportamiento.template.despues;

public class AuditTrail {
    public void record(String quien) {
        System.out.println("Se esta generando la pista de auditoria para el usuario: " + quien);
    }
}
