package Dominio;

/**
 * Clase  que representa a una criatura de tipo "Móvil" en el tablero
 */
public class CriaturaMovil extends Criatura {
			
	public CriaturaMovil(int x, int y) {
		super(x, y);
	}
	/**
     * Devuelve el color de la criatura
     * 
     * @return color de la criatura
     */
	@Override
	public String getColor() {
		return "red";
	}
}
