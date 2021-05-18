package pgn.exUD4;
/**
 * clase que representa el comportamiento de un gato
 * 
 * @author Sergio Vera Jurado
 *
 */
public class Gato extends Mamifero {
  
  /**
   * Maullido de un gato
   */
  
	private static final String MIAUUUUUUUUUUUUU = "Miauuuuuuuuuuuuu";
/**
 * Constructor de la clase gato
 * @param nombre Nombre del gato
 * @param edad Edad del gato 
 * @throws EdadErroneaException Se lanza si el gato tiene una edad erronea
 */
	
	public Gato(String nombre, int edad) throws EdadErroneaException {
		setAge(edad);
		this.nombre = nombre;
	}

	/**
	 * Hace maullar al gato
	 * @return String con un maullido de un gato
	 */
	public String maullar() {
		return MIAUUUUUUUUUUUUU;
	}

}
