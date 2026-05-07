package main.java.Dominio;

/**
 * Clase abstracta que representa a una criatura en el tablero
 * 
 * @param x posicion horizontal en el tablero
 * @param y posicion vertical en el tablero
 */
public abstract class Criatura {
	private int x;
	private int y;

	public Criatura(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Devuelve la posición x de la criatura
	 * 
	 * @return posición x de la criatura
	 */
	public int getX() {
		return this.x;
	}

	/**
	 * Cambia la posición x de la criatura
	 * 
	 * @param x nueva posición x de la criatura
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Devuelve la posición y de la criatura
	 * 
	 * @return posición y de la criatura
	 */
	public int getY() {
		return this.y;
	}

	/**
	 * Cambia la posición y de la criatura
	 * 
	 * @param y nueva posición y de la criatura
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Devuelve el color de la criatura
	 * 
	 * @return color de la criatura
	 */
	public abstract String getColor();

	/**
	 * * Devuelve si una criatura está al lado de una posición * * @return true si
	 * está al lado, false si no
	 */
	public boolean estaAlLado(int x, int y) {
		if (this.x != x && this.y != y) {
			return false;
		} else if (this.x == x && this.y == y) {
			return false;
		} else if (this.x == x) {
			return this.y - y == 1 || this.y - y == -1;
		} else if (this.y == y) {
			return this.x - x == 1 || this.x - x == -1;
		} else {
			return false;
		}
	}
}
