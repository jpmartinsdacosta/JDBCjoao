package expresscorreos.model;

public class Segmento_calle {
    private int n_segmento;
    private int n_inicio;
    private int n_final;
    private String nombre_calle;

    public Segmento_calle(int n_segmento, int n_inicio, int n_final, String nombre_calle) {
        this.n_segmento = n_segmento;
        this.n_inicio = n_inicio;
        this.n_final = n_final;
        this.nombre_calle = nombre_calle;
    }

    public int getN_segmento() {
        return n_segmento;
    }

    public int getN_inicio() {
        return n_inicio;
    }

    public int getN_final() {
        return n_final;
    }

    public String getNombre_calle() {
        return nombre_calle;
    }
}