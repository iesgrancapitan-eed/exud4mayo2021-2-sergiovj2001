package pgn.exUD4;
/**
 * Exception de edad erronea
 * @author Sergio Vera Jurado
 *
 */
@SuppressWarnings("serial")
public class EdadErroneaException extends Exception {
/**
 * Contructor que muestra el mensaje que se le pasa como parametro
 * @param string mensaje que se le ha pasado
 */
	public EdadErroneaException(String string) {
		super(string);
	}

}
