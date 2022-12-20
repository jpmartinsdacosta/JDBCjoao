package expresscorreos.model;

public class Puede_repartir {
    private String dni_cartero;
    private int id_ae;

    public Puede_repartir(String dni_cartero, int id_ae) {
        this.dni_cartero = dni_cartero;
        this.id_ae = id_ae;
    }

    public String getDni_cartero() {
        return dni_cartero;
    }

    public int getId_ae() {
        return id_ae;
    }
}