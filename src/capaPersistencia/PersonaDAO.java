package capaPersistencia;

import entidades.Persona;
import java.util.List;

/**
 * Interfaz DAO. Aqui vamos a definir el comportamiento de todas aquellas las
 * clases que lo implementen. Se va a definir como base un ABMC (Alta, Baja,
 * Modificacion, Consulta) de un Estudiante.
 *
 * @author Angonoa Franco
 * @since Octubre 2020
 * @version 1.0
 */
public interface PersonaDAO {

    /**
     * Agregar una persona (estudiante) a la recopilacion.
     *
     * @param per un objeto de tipo Persona.
     */
    public void agregar(Persona per);

    /**
     * Modificar los datos de una persona (estudiante). En este caso se trata de
     * primero buscar una persona por su DNI y si la encuentra poder modificar
     * sus datos (nombre, apellido, notas).
     *
     * @param documento un nro. entero que sirve para buscar al estudiante.
     * @param per un objeto de tipo Persona.
     */
    public void modificar(int documento, Persona per);

    /**
     * Dar de baja a una persona (estudiante). El metodo busca por dni a la
     * persona que se desea dar de baja para luego cambiar su estado. Por
     * último, se debe mostrar la informacion de la persona que se ha dado de
     * baja.
     *
     * @param documento un nro. entero que sirve para buscar al estudiante.
     * @return objeto de tipo Persona, con la informacion del estudiante que se
     * ha dado de baja.
     */
    public Persona baja(int documento);

    /**
     * Busca a una persona en la recopilación por su nro de DNI. Se debe
     * recorrer la recopilacion y buscar el documento que se ingresa por
     * parametro. Si lo encuentra se debe retornar el objeto, caso contrario
     * retornar un null.
     *
     * @param documento un nro. entero que sirve para buscar al estudiante.
     * @return Si se encuentra, el objeto estudiante. Caso contrario, null.
     */
    public Persona buscarPorDNI(int documento);

    /**
     * Devuelve a todas las personas(estudiantes) que forman parte de la
     * recopilacion. Lo interesante es que debe devolver con la interfaz List,
     * prestar atencion.
     *
     * @return recopilacion de tipo List para listar a las personas.
     */
    public List<Persona> obtenerTodasPersonas();
}
