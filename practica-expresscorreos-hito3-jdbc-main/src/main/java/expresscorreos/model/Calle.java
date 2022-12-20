package expresscorreos.model;

public class Calle {
    private String nombre_calle;
    private String nombre_municipio;

    public Calle (String nombre_calle, String nombre_municipio){
        this.nombre_municipio = nombre_municipio;
        this.nombre_calle = nombre_calle;
    }

    public String getNombre_municipio() {
        return nombre_municipio;
    }

    public String getNombre_calle() {
        return nombre_calle;
    }

}