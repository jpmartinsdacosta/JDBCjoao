package expresscorreos.model;

public class Provincia{
    private String nombre_provincia;
    private String nombre_municipio;

    public Provincia(String nombre_provincia,String nombre_municipio){
        this.nombre_provincia = nombre_provincia;
        this.nombre_municipio = nombre_municipio;
    }

    public String getNombre_provincia() {
        return nombre_provincia;
    }

    public String getNombre_municipios() {
        return nombre_municipio;
    }
}