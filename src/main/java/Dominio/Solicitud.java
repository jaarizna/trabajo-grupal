package main.java.Dominio;

import java.util.List;

/**
 * Clase encargada de representar una solicitud del cliente
 * 
 * @param tokenSolicitud      token asignado a la solicitud
 * @param cantidadesIniciales lista con cantidades iniciales de cada entidad
 * @param maxInstantes tiempo que taradara en simular
 */
public class Solicitud {

	private int tokenSolicitud;
	private List<Integer> cantidadesIniciales;
	private int  maxInstantes;

	public Solicitud(int token, List<Integer> nIniciales, int maxInstantes) {
		this.tokenSolicitud = token;
		this.cantidadesIniciales = nIniciales;
		this.maxInstantes = maxInstantes;
	}

	/**
	 * Devuelve el token de la solicitud
	 * 
	 * @return token de la solicitud
	 */
	public int getTokenSolicitud() {
		return tokenSolicitud;
	}

	/**
	 * Cambia el token de la solicitud
	 * 
	 * @param tokenSolicitud nuevo token de la solicitud
	 */
	public void setTokenSolicitud(int tokenSolicitud) {
		this.tokenSolicitud = tokenSolicitud;
	}

	/**
	 * Devuelve las cantidades iniciales de la solicitud
	 * 
	 * @return lista de cantidades iniciales de la solicitud
	 */
	public List<Integer> getCantidadesIniciales() {
		return cantidadesIniciales;
	}

	/**
	 * Cambia las cantidades iniciales de la solicitud
	 * 
	 * @param cantidadesIniciales nueva lista de cantidades iniciales de la
	 *                            solicitud
	 */
	public void setCantidadesIniciales(List<Integer> cantidadesIniciales) {
		this.cantidadesIniciales = cantidadesIniciales;
	}

	/**
	 * Devuelve el tiempo que se simula
	 * 
	 * @return lista de nombres de entidades de la solicitud
	 */
	public int getmaxInstantes() {
		return this.maxInstantes;
	}

	/**
	 * Cambia  el tiempo que se simula
	 * 
	 * @param maxInstantes nuevo tiempo que se simula
	 */
	public void setmaxInstantes(int maxInstantes) {
		this.maxInstantes = maxInstantes;
	}

}
