package capaPersistencia;

import java.util.List;
import entidades.Persona;

/**
 * Clase que representa la persistencia de los datos. En este caso, los datos se
 * van a guardar en una recopilacion de tipo TreeSet. Quiere decir que se va
 * agregar personas a dicha recopilacion.
 *
 * @author suNombre
 * @since Octubre 2020
 * @version 1.0
 */
public class PersonaDAOenTreeSet implements PersonaDAO {

    @Override
    public void agregar(Persona per) {
        //Programar
    }

    @Override
    public void modificar(int documento, Persona per) {
        //Programar
    }

    @Override
    public Persona baja(int documento) {
        //Programar
        return null;
    }

    @Override
    public Persona buscarPorDNI(int documento) {
        //Programar
        return null;
    }

    @Override
    public List<Persona> obtenerTodasPersonas() {
        //Programar

        return null;
    }

}
