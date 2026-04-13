package Dominio;

import java.util.List;

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
	

public int getTokenSolicitud() {
        return tokenSolicitud;
    }

    public void setTokenSolicitud(int tokenSolicitud) {
        this.tokenSolicitud = tokenSolicitud;
    }

    public List<Integer> getCantidadesIniciales() {
        return cantidadesIniciales;
    }

    public void setCantidadesIniciales(List<Integer> cantidadesIniciales) {
        this.cantidadesIniciales = cantidadesIniciales;
    }

    public List<String> getNombreEntidades() {
        return nombreEntidades;
    }

    public void setNombreEntidades(List<String> nombreEntidades) {
        this.nombreEntidades = nombreEntidades;
    }


}
