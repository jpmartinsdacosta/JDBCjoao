package expresscorreos.model;

public class Oficina {
    private String codigo_oficina;
    private String nombre_municipio;
    private String codigo_cc;

    public Oficina(String codigo_oficina, String nombre_municipio, String codigo_cc) {
        this.codigo_oficina = codigo_oficina;
        this.nombre_municipio = nombre_municipio;
        this.codigo_cc = codigo_cc;
    }

    public String getCodigo_oficina() {
        return codigo_oficina;
    }

    public String getNombre_municipio() {
        return nombre_municipio;
    }

    public String getCodigo_cc() {
        return codigo_cc;
    }
}