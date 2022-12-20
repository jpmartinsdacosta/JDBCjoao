import expresscorreos.model.Cartero;

public class Seg_incluye_ruta {
    private int n_segmento;
    private int id_ruta;
    private int n_orden;

    public Seg_incluye_ruta(int n_segmento, int id_ruta, int n_orden) {
        this.n_segmento = n_segmento;
        this.id_ruta = id_ruta;
        this.n_orden = n_orden;
    }

    public int getN_segmento() {
        return n_segmento;
    }

    public int getId_ruta() {
        return id_ruta;
    }

    public int getN_orden() {
        return n_orden;
    }
}