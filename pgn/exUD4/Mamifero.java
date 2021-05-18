package pgn.exUD4;


/**
 * Clase que representa a un mamifero
 * 
 * @author Sergio Vera Jurado
 *
 */
public class Mamifero {
  /**
   * edad del mamifero
   */
  private int edad;
  /**
   * nombre del mamifero
   */
  protected String nombre;

  /**
   * consctructor de mamifero
   */
  public Mamifero() {
    super();
  }
/**
 * Establece la edad del mamifero
 * @param edad edad del mamifero
 * @throws EdadErroneaException salta si la edad establecida es negativa
 */
  public void setAge(int edad) throws EdadErroneaException {
    if (edad < 0)
      throw new EdadErroneaException("La edad no puede ser negativa");
    this.edad = edad;
  }
/**
 * getter de la edad del mamifero
 * @return edad del mamifero
 */
  public int getEdad() {
    return this.edad;
  }
/**
 * getter de el nombre del mamifero
 * @return nombre del mamifero
 */
  public String getNombre() {
    return nombre;
  }

}
