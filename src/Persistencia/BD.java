package Persistencia;

import Dominio.Respuesta;

public interface BD {
    public boolean createRespuesta(Respuesta r);
    public Respuesta readRespuesta(String token);
    public boolean updateRespuesta(Respuesta r);
    public boolean deleteRespuesta(Respuesta r); 
}
