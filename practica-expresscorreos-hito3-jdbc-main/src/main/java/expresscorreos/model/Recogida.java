package expresscorreos.model;
import java.util.Date;

public class Recogida{
    private String id_recogida;
    private Date fecha_recogida;
    private String dni_cartero;
    private String dni_usuario;
    public int numero;
    public String piso;
    public String letra;
    public String portal;

    public Recogida(String id_recogida,Date fecha_recogida,String dni_cartero,String dni_usuario,int numero,String piso,String letra,String portal){
        this.id_recogida = id_recogida;
        this.fecha_recogida = fecha_recogida;
        this.dni_cartero = dni_cartero;
        this.dni_usuario = dni_usuario;
        this.numero = numero;
        this.piso = piso;
        this.letra = letra;
        this.portal = portal;
    }

    public String getDni_cartero() {
        return dni_cartero;
    }

    public String getPortal() {
        return portal;
    }

    public String getPiso() {
        return piso;
    }

    public String getLetra() {
        return letra;
    }

    public int getNumero() {
        return numero;
    }

    public String getDni_usuario() {
        return dni_usuario;
    }

    public String getId_recogida() {
        return id_recogida;
    }

    public Date getFecha_recogida() {
        return fecha_recogida;
    }
}