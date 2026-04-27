package CapaAccesoDatos;

import Dominio.Respuesta;
import Persistencia.BD;

public class CAD {

    private BD bd;

    public CAD(BD bd) {
        this.bd = bd;
    }

    public boolean createRespuesta(Respuesta r) {
        boolean res=bd.createRespuesta(r.getToken());
        if (res){
            res= bd.updateRespuesta(r) && res;
        }
        return res;
    }

    public Respuesta readRespuesta(String token) {
        return bd.readRespuesta(token);
    }

    public boolean updateRespuesta(Respuesta r) {
        return bd.updateRespuesta(r);
    }

    public boolean deleteRespuesta(String token) {
        return bd.deleteRespuesta(token);
    }
}
