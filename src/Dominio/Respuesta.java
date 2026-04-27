package Dominio;

/**
 * Clase encargada de representar una respuesta (token,contenido)
 * @param tokenSolicitud token de la respuesta
 * @param contenido texto que sirve como respuesta al token
 */
public class Respuesta {
    private String token;
    private String contenido;

    public Respuesta(String token, String contenido) {
        this.token = token;
        this.contenido = contenido;
    }

    /**
     * Devuelve el token de la respuesta
     * 
     * @return token de la respuesta
     */
    public String getToken() {
        return token;
    }

    /**
     * Cambia el token de la respuesta
     * 
     * @param token nuevo token de la respuesta
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Devuelve el contenido de la respuesta
     * 
     * @return contenido de la respuesta
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * Cambia el contenido de la respuesta
     * 
     * @param contenido nuevo contenido de la respuesta
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
