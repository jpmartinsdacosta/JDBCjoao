package expresscorreos.model;

/**
 * Modela un cartero. No es necesario modificar esta clase. Pero debe crear tantas clases como entidades
 * necesite para llevar a cabo esta parte del hito 3. Inclúyalas en el paquete "expresscorreos.model"
 */
public class Cartero {

    private String dni_cartero;
    private String nombre;
    private String apellidos;

    public Cartero(String dni_cartero, String nombre, String apellidos) {
        this.dni_cartero = dni_cartero;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getDni_cartero() {
        return dni_cartero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }
}
