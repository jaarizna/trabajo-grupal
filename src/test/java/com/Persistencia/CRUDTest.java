package test.java.com.Persistencia;

import main.java.Dominio.Respuesta;
import main.java.Persistencia.BD;
import main.java.Persistencia.BDMock;

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

        
        assertEquals(true,bd.createRespuesta("tokenTEST1"));
        
        assertEquals("", bd.readRespuesta("tokenTEST1"));
        assertEquals(false,bd.createRespuesta("tokenTEST1"));
        bd.deleteRespuesta("tokenTEST1");
    }

    @Test
    void update(){
        Respuesta r = new Respuesta("tokenTEST2", "contenidoTEST2");
        bd.createRespuesta("tokenTEST2");
        assertEquals(true,bd.updateRespuesta(r));

     
        assertEquals("contenidoTEST2", bd.readRespuesta("tokenTEST2"));
        bd.deleteRespuesta("tokenTEST2");
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
