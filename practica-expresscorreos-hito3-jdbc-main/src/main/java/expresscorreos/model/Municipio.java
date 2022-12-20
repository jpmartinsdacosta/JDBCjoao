package expresscorreos.model;

public class Municipio {
    private String nombre_municipio;
    private String nombre_provincia;


    public Municipio(String nombre_municipio,String provincia){
        this.nombre_municipio = nombre_municipio;
        this.nombre_provincia = nombre_provincia;
    }

    public String getNombre_provincia() {
        return nombre_provincia;
    }

    public String getNombre_municipio() {
        return nombre_municipio;
    }
}