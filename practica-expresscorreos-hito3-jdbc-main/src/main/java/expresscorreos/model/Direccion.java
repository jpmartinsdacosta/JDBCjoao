package expresscorreos.model;

public class Direccion {
    public int numero;
    public String piso;
    public String letra;
    public String portal;
    public String nombre_calle;

    public Direccion(int numero, String piso, String letra, String portal, String nombre_calle) {
        this.numero = numero;
        this.piso = piso;
        this.letra = letra;
        this.portal = portal;
        this.nombre_calle = nombre_calle;
    }

    public String getNombre_calle() {
        return nombre_calle;
    }

    public int getNumero() {
        return numero;
    }

    public String getLetra() {
        return letra;
    }

    public String getPiso() {
        return piso;
    }

    public String getPortal() {
        return portal;
    }

}