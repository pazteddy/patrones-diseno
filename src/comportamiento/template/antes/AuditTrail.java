package comportamiento.template.antes;

public class AuditTrail {
    public void record(String proceso, String quien) {
        System.out.println(
                "Se esta generando la pista de auditoria para el proceso: " + proceso + " para el usuario: " + quien);
    }
}
