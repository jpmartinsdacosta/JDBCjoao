package expresscorreos.model;

public class Usuario_noid {
    private int id_usuario;
    private String nombre;
    private String apellidos;
    private int numero;
    private String piso;
    private String letra;
    private String portal;

    public Usuario_noid(int id_usuario, String nombre, String apellidos, int numero, String piso, String letra, String portal) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numero = numero;
        this.piso = piso;
        this.letra = letra;
        this.portal = portal;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
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
}