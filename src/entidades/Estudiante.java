package entidades;

import java.util.List;

/**
 * Clase Estudiante: Representa a los estudiantes que forman parte de la
 * facultad. Cada uno tiene como identificador unico su dni y lo que
 * caracterizan a los estudiante son su estado y sus notas.
 *
 * @author Angonoa Franco
 * @since Octubre 2020
 * @version 1.0
 */
public class Estudiante extends Persona {

    private char estado;
    private List<Integer> notas;

    public Estudiante(List<Integer> notas, int documento, String nombre, String apellido) {
        super(documento, nombre, apellido);
        this.notas = notas;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }        

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }
    
    /**
     * Genera el estado del estudiante de acuerdo a sus notas o condicion.
     * Promedio de notas mayor o igual 7 y notas minima de 6 -- Promocionado (P)
     * Solo notas mayores a 4 -- Regular (R)
     * Si no cumple con ninguna de la anteriores -- Libre (L)     
     */
    public void generarEstado(){
        //Completar
    }

    @Override
    public String toString() {
        return super.toString() + ", Estado: " + estado + ", Notas: " + notas;
    }

}
