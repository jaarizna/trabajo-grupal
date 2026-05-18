package test.java.com.LogicaNegocio;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import main.java.LogicaNegocio.Simulacion;
import main.java.Dominio.Criatura;
import main.java.Dominio.CriaturaMovil;
import main.java.Dominio.CriaturaQuieta;
import main.java.Dominio.CriaturaReplica;
import main.java.Dominio.EstadoTablero;


class SimulacionTest {

    private Simulacion simulacion;


    @BeforeEach
    void setUp() {
        ArrayList<Integer> criaturas = new ArrayList<>();
        simulacion = new Simulacion(10,criaturas);
    }

    //puedeActuar()
    @Test
    void puedeActuarQuieta(){
        Criatura c=new CriaturaQuieta(0,1);
        assertEquals(false, simulacion.puedeActuar(c,1,1));
    }

    @Test
    void puedeActuarMovil(){
        Criatura c=new CriaturaMovil(0,1);
        assertEquals(true, simulacion.puedeActuar(c,1,1));
    }

    @Test
    void puedeActuarMovil2(){
        Criatura c=new CriaturaMovil(0,0);
        assertEquals(false, simulacion.puedeActuar(c,1,1));
    }

    @Test
    void puedeActuarReplica(){
        Criatura c=new CriaturaReplica(0,1);
        assertEquals(true, simulacion.puedeActuar(c,1,1));
    }

    //actuar()
    @Test
    void actuarMovil(){
        Criatura c = new CriaturaMovil(0,0);
        simulacion.actuar(c, 1, 1);
        assertEquals(1, c.getX());
        assertEquals(1, c.getY());
    }

    @Test
    void actuarQuieta(){
        Criatura c = new CriaturaQuieta(0,0);
        simulacion.actuar(c, 1, 1);
        assertEquals(0, c.getX());
        assertEquals(0, c.getY());
    }

    @Test
    void actuarReplica(){
        Criatura c = new CriaturaReplica(0,0);
        simulacion.actuar(c, 1, 1);
        assertEquals(0, c.getX());
        assertEquals(0, c.getY());
    }

    //hayCriatura()
    @Test
    void hayCriatura(){
        Criatura c = new CriaturaReplica(0,0);
        ArrayList<Criatura> criaturas = new ArrayList<Criatura>();
        EstadoTablero tablero = new EstadoTablero(criaturas, 0);
        simulacion = new Simulacion(tablero,10);

        simulacion.getCriaturas().add(c);
        assertEquals(true, simulacion.hayCriatura(0, 0));
        assertEquals(false, simulacion.hayCriatura(0, 1));
    }

    //simular()

}