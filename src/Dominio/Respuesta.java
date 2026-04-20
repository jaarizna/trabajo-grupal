package Dominio;

public class Respuesta {
    private String token;
    private String contenido;

    public Respuesta(String token, String contenido) {
        this.token = token;
        this.contenido = contenido;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
