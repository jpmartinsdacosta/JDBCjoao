package expresscorreos.model;

public class Vive_en {
    public int numero;
    public String piso;
    public String letra;
    public String portal;
    public String dni_usuario;

    public Vive_en(int numero, String piso, String letra, String portal, String dni_usuario) {
        this.numero = numero;
        this.piso = piso;
        this.letra = letra;
        this.portal = portal;
        this.dni_usuario = dni_usuario;
    }

    public int getNumero() {
        return numero;
    }

    public String getPiso() {
        return piso;
    }

    public String getLetra() {
        return letra;
    }

    public String getPortal() {
        return portal;
    }

    public String getDni_usuario() {
        return dni_usuario;
    }
}