package Persistencia;

import Dominio.Respuesta;

public interface BD {
    public boolean createRespuesta(String token);
    public Respuesta readRespuesta(String token);
    public boolean updateRespuesta(Respuesta r);
    public boolean deleteRespuesta(String token); 
}
