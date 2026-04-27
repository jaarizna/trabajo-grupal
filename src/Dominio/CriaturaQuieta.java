package Dominio;

/**
 * Clase abstracta que representa a una criatura de tipo "Quieta" en el tablero
 */
public class CriaturaQuieta extends Criatura{

	public CriaturaQuieta(int x, int y) {
		super(x, y);
	}

	@Override
	public String getColor() {
		return "blue";
	}

}
