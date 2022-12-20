package expresscorreos.model;

public class Centro_clasif {
    private String codigo_cc;
    private String nombre;
    private int capacidad_paquetes;
    private int capacidad_cartas;
    private String nombre_municipio;

    public Centro_clasif(String codigo_cc, String nombre, int capacidad_paquetes, int capacidad_cartas, String nombre_municipio) {
        this.codigo_cc = codigo_cc;
        this.nombre = nombre;
        this.capacidad_paquetes = capacidad_paquetes;
        this.capacidad_cartas = capacidad_cartas;
        this.nombre_municipio = nombre_municipio;
    }

    public String getNombre_municipio() {
        return nombre_municipio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad_cartas() {
        return capacidad_cartas;
    }

    public int getCapacidad_paquetes() {
        return capacidad_paquetes;
    }

    public String getCodigo_cc() {
        return codigo_cc;
    }

}