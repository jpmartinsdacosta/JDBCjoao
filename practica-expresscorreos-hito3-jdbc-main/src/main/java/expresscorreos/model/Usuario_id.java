package expresscorreos.model;

public class Usuario_id{
    private String dni_usuario;
    private String dni_autorizado;
    private String nombre;
    private String apellidos;
    private String correo;

    public Usuario_id(String dni_usuario, String dni_autorizado, String nombre, String apellidos, String correo) {
        this.dni_usuario = dni_usuario;
        this.dni_autorizado = dni_autorizado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
    }

    public String getDni_usuario() {
        return dni_usuario;
    }

    public String getDni_autorizado() {
        return dni_autorizado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreo() {
        return correo;
    }
}