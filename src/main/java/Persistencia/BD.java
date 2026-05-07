package main.java.Persistencia;

import main.java.Dominio.Respuesta;

public interface BD {
    /**
     * Crea una nueva respuesta vacía para el token indicado.
     * 
     * @param token Identificador único de la respuesta.
     * @return true si se creó exitosamente, false si el archivo ya existía o hubo un error.
     */
    public boolean createRespuesta(String token);

    /**
     * Lee el contenido de la respuesta asociada a un token.
     * 
     * @param token Identificador de la respuesta a buscar.
     * @return Un objeto Respuesta con el contenido leído, string vacía si está vacío, o null si no se encontró el archivo.
     */
    public Respuesta readRespuesta(String token);

    /**
     * Actualiza el contenido de la respuesta con los nuevos datos.
     * 
     * @param r Objeto Respuesta que contiene el token a actualizar y el nuevo contenido.
     * @return true si la actualización fue exitosa, false en caso de fallo.
     */
    public boolean updateRespuesta(Respuesta r);

    /**
     * Elimina la respuesta asociada al token indicado.
     * 
     * @param token Identificador de la respuesta a eliminar.
     * @return true si se borró correctamente, false si no se pudo eliminar o no existía.
     */
    public boolean deleteRespuesta(String token); 
}
