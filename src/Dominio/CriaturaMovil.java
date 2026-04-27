package Dominio;

/**
 * Clase abstracta que representa a una criatura de tipo "Móvil" en el tablero
 */
public class CriaturaMovil extends Criatura {
			
	public CriaturaMovil(int x, int y) {
		super(x, y);
	}

	@Override
	public String getColor() {
		return "red";
	}
}
