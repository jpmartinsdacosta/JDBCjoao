package expresscorreos.model;

public class Area_envio {
    private int id_ae;
    private String codigo_oficina;

    public Area_envio(int id_ae, String codigo_oficina) {
        this.id_ae = id_ae;
        this.codigo_oficina = codigo_oficina;
    }

    public int getId_ae() {
        return id_ae;
    }

    public String getCodigo_oficina() {
        return codigo_oficina;
    }

}