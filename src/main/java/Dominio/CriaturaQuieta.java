package main.java.Dominio;

/**
 * Clase  que representa a una criatura de tipo "Quieta" en el tablero
 */
public class CriaturaQuieta extends Criatura{

	public CriaturaQuieta(int x, int y) {
		super(x, y);
	}
	/**
     * Devuelve el color de la criatura
     * 
     * @return color de la criatura
     */
	@Override
	public String getColor() {
		return "blue";
	}

}
