package Dominio;

import java.io.File;

public class Respuesta {
    private String token;
    private File archivo;

    public Respuesta(String token, File archivo) {
        this.token = token;
        this.archivo = archivo;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
}
