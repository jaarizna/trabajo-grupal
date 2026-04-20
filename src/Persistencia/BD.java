package Persistencia;

import Dominio.Respuesta;

public interface BD {
    public boolean createRespuesta();
    public Respuesta readRespuesta();
    public boolean updateRespuesta();
    public boolean deleteRespuesta(); 
}
