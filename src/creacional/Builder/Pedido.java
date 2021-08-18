package creacional.Builder;

public class Pedido {

    private String plato;
    private String acompanamiento;
    private String refresco;
    private String juguete;

    public void setPlatoPrincipal(String plato) {
        this.plato = plato;
    }

    public String getPlatoPrincipal() {
        return plato;
    }

    public void setAcompanamiento(String acompanamiento) {
        this.acompanamiento = acompanamiento;
    }

    public String getAcompanamiento() {
        return acompanamiento;
    }

    public void setRefresco(String refresco) {
        this.refresco = refresco;
    }

    public String getRefresco() {
        return refresco;
    }

    public void setJuguete(String juguete) {
        this.juguete = juguete;
    }

    public String getJuguete() {
        return juguete;
    }

}
