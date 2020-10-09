package entidades;

/**
 * Clase Persona: representa una generalizacion de las personas que forman parte
 * de la facultad. Cada una de las personas poseen un documento como
 * identificador unico, además de un nombre y un apellido.
 *
 * @author Angonoa Franco
 * @since Octubre 2020
 * @version 1.0
 */
public class Persona {

    private int documento;
    private String nombre;
    private String apellido;

    public Persona(int documento, String nombre, String apellido) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    

    @Override
    public String toString() {
        return "\nDocumento: " + documento + ", Nombre y apellido: " + nombre + " " + apellido;
    }

}
