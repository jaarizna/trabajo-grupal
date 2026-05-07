import Dominio.Respuesta;
import Persistencia.BD;
import Persistencia.BDMock;

import static org.junit.jupiter.api.Assertions.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CRUDTest {
    private BD bd;

    @BeforeEach
    void setUp() {
        this.bd = new BDMock();
    }

    @Test
    void createAndRead(){
        assertEquals(null, bd.readRespuesta("tokenTEST1"));

        Respuesta r = new Respuesta("tokenTEST1", "");

        assertEquals(true,bd.createRespuesta("tokenTEST1"));
        assertEquals(r, bd.readRespuesta("tokenTEST1"));
        assertEquals(false,bd.createRespuesta("tokenTEST1"));
    }

    @Test
    void update(){
        Respuesta r = new Respuesta("tokenTEST2", "contenidoTEST2");

        assertEquals(false,bd.updateRespuesta(r));

        bd.createRespuesta("tokenTEST2");

        assertEquals(true,bd.updateRespuesta(r));
        assertEquals(r, bd.readRespuesta("tokenTEST2"));
    }

    @Test
    void delete(){
        Respuesta r = new Respuesta("tokenTEST3", "contenidoTEST3");

        assertEquals(false, bd.deleteRespuesta("tokenTEST3"));

        bd.createRespuesta("tokenTEST3");
        bd.updateRespuesta(r);

        assertEquals(true, bd.deleteRespuesta("tokenTEST3"));
        assertEquals(null, bd.readRespuesta("tokenTEST3"));
    }
}
