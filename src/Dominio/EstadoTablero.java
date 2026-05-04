package Dominio;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Clase encargada de repesentar la situacion de un determinado tablero
 * 
 * @param instance instante de tiempo en el tablero
 * @param criaturas lsita de las criaturas que hay ene le tablero
 * 
 */
public class EstadoTablero {
	// Tablero de tamaño fijo 12x12 casillas
	private List<Criatura> criaturas;
	private int instante;

	public EstadoTablero(int instante) {
		this.criaturas = new ArrayList<Criatura>();
		this.instante = instante;
	}

	public EstadoTablero(List<Criatura> criaturas, int instante) {
		this.criaturas = criaturas;
		this.instante = instante;
	}

	/**
	 * Devuelve las criaturas
	 * 
	 * @return lista de la criaturas
	 */

	public List<Criatura> getCriaturas() {
		return criaturas;
	}

	/**
	 * Modifica la lista de las criaturas
	 * 
	 * @param criaturas nueva lista de criaturas
	 */
	public void setCriaturas(List<Criatura> criaturas) {
		this.criaturas = criaturas;
	}

	/**
	 * Devuelve la instancia de tiempo del tablero
	 * 
	 * @return instancia de teimpo del tablero
	 */
	public int getInstante() {
		return instante;
	}

	/**
	 * Modifica la insatncia de teimpo del tablero
	 * 
	 * @param criaturas nueva lista de criaturas
	 */
	public void setInstante(int instante) {
		this.instante = instante;
	}
	
	/**
	 * 
	 * Le suma 1 a la instancia de tiempo
	 * 
	 */
	public void avanzarInastance() {
		this.instante++;
	}

	/**
	 * 
	 * Obtenemos la longitud del tablero calculada segun el nº de craturas
	 * 
	 */
	public long getLongCuadrado() {
		return Math.round(1.25 * Math.sqrt(criaturas.size()));
	}

	/**
	 * 
	 * Muestra la situacion del tablero actualmente en texto
	 * 
	 */
	public String toString() {
		String res = "";
		for (Criatura c : this.criaturas) {
			res += this.instante + "," + c.getX() + " " + c.getY() + "," + c.getColor() + "\n";
		}
		return res;
	}

}
