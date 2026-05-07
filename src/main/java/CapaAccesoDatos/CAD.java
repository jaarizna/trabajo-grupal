package main.java.CapaAccesoDatos;

import main.java.Dominio.Respuesta;
import main.java.Persistencia.BD;
/**
 * Clase destinada a combinar el create y update del
 * @param bd Base de datos donde se almacena los tokens
 
 */
public class CAD {

    private BD bd;

    public CAD(BD bd) {
        this.bd = bd;
    }
    /**
     * Crea una nueva respuesta con su contenido para el token indicado.
     * 
     * @param r respuestacon la informacion.
     * @return true si se creó exitosamente, false si el archivo ya existía o hubo un error.
     */
    public boolean createRespuesta(Respuesta r) {
        boolean res=bd.createRespuesta(r.getToken());
        if (res){
            res= bd.updateRespuesta(r) && res;
        }
        return res;
    }
    /**
     * Lee el contenido de la respuesta asociada a un token.
     * 
     * @param token Identificador de la respuesta a buscar.
     * @return Un objeto Respuesta con el contenido leído, string vacía si está vacío, o null si no se encontró el archivo.
     */
    public Respuesta readRespuesta(String token) {
        return bd.readRespuesta(token);
    }
    /**
     * Actualiza el contenido de la respuesta con los nuevos datos.
     * 
     * @param r Objeto Respuesta que contiene el token a actualizar y el nuevo contenido.
     * @return true si la actualización fue exitosa, false en caso de fallo.
     */
    public boolean updateRespuesta(Respuesta r) {
        return bd.updateRespuesta(r);
    }
    /**
     * Elimina la respuesta asociada al token indicado.
     * 
     * @param token Identificador de la respuesta a eliminar.
     * @return true si se borró correctamente, false si no se pudo eliminar o no existía.
     */
    public boolean deleteRespuesta(String token) {
        return bd.deleteRespuesta(token);
    }
}
