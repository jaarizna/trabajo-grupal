package Dominio;

/**
 * Clase  que representa a una criatura de tipo "Replica" en el tablero
 */
public class CriaturaReplica extends Criatura{

	private int probablilidad =30;
	
	public CriaturaReplica(int x, int y) {
		super(x, y);
	}
	/**
     * Devuelve la probabilidad  de la criatura
     * 
     * @return probabilidad de la criatura
     */
	public int getProbabilidad(){
		return this.probablilidad;
	}
	/**
     * Cambia la probabilidad de la criatura
     * 
     * @param prob probabilidad de la criatura
     */
	public void setProbabilidad(int prob){
		this.probablilidad=prob;
	}
	/**
     * Devuelve el color de la criatura
     * 
     * @return color de la criatura
     */
	@Override
	public String getColor() {
		return "green";
	}
}
