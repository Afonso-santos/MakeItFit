package MakeItFit.exceptions;

/**
 * The EntityDoesNotExistException class.
 *
 * @author  Afonso Santos (a104276), Hélder Gomes (a104100) and Pedro Pereira (a104082)
 * @version (a version number or a date)
 */
public class EntityDoesNotExistException extends RuntimeException {

    /**
     * The empty constructor for EntityDoesNotExistException.
     */
    public EntityDoesNotExistException() { super(); }

    /**
     * The parameterized constructor for EntityDoesNotExistException.
     */
    public EntityDoesNotExistException(String exception) { super(exception); }
}
