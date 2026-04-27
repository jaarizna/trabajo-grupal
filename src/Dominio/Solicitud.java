package Dominio;

import java.util.List;


/**
 * Clase encargada de representar una solicitud del cliente
 * @param tokenSolicitud token asignado a la solicitud
 * @param cantidadesIniciales lista con cantidades iniciales de cada entidad
 * @param nombreEntidades lista con los nombres de las entidades
 */
public class Solicitud {
		
	private int tokenSolicitud;
	private List<Integer> cantidadesIniciales;
	private List<String> nombreEntidades;
	
	public Solicitud(int token, 
			 List<Integer> nIniciales,
             List<String> nombres) {
		this.tokenSolicitud=token;
		this.cantidadesIniciales=nIniciales;
		this.nombreEntidades=nombres;
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
     * @param cantidadesIniciales nueva lista de cantidades iniciales de la solicitud
     */
    public void setCantidadesIniciales(List<Integer> cantidadesIniciales) {
        this.cantidadesIniciales = cantidadesIniciales;
    }

    /**
     * Devuelve los nombres de entidades de la solicitud
     * 
     * @return lista de nombres de entidades de la solicitud
     */
    public List<String> getNombreEntidades() {
        return nombreEntidades;
    }

    /**
     * Cambia los los nombres de entidades de la solicitud
     * 
     * @param nombreEntidades nueva lista de los nombres de entidades de la solicitud
     */
    public void setNombreEntidades(List<String> nombreEntidades) {
        this.nombreEntidades = nombreEntidades;
    }


}
