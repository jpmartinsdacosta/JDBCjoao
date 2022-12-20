package expresscorreos.model;

public class Coche {
    private String matricula;
    private int capacidad;
    private String codigo_oficina;

    public Coche(String matricula, int capacidad, String codigo_oficina) {
        this.matricula = matricula;
        this.capacidad = capacidad;
        this.codigo_oficina = codigo_oficina;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getCodigo_oficina() {
        return codigo_oficina;
    }
}