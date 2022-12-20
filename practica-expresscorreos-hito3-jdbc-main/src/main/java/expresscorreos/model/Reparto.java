package expresscorreos.model;
import java.util.Date;

public class Reparto {
    private String id_reparto;
    private Date fecha_creacion;
    private int id_ruta;
    private String matricula;
    private String dni_cartero;

    public Reparto(String id_reparto, Date fecha_creacion, int id_ruta, String matricula, String dni_cartero) {
        this.id_reparto = id_reparto;
        this.fecha_creacion = fecha_creacion;
        this.id_ruta = id_ruta;
        this.matricula = matricula;
        this.dni_cartero = dni_cartero;
    }

    public String getId_reparto() {
        return id_reparto;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public int getId_ruta() {
        return id_ruta;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDni_cartero() {
        return dni_cartero;
    }
}