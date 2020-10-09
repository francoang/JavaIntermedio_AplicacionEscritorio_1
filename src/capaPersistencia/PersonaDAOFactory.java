package capaPersistencia;

/**
 * Clase que representa al patron Factory.
 * @author Angonoa Franco
 * @since Octubre 2020
 * @version 1.0
 */
public class PersonaDAOFactory {
    
    public PersonaDAO crearPersona(){
        return new PersonaDAOenTreeSet();
    }
}
