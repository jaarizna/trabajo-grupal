#TODO: Poner bien los import y el package
import static org.junit.jupiter.api.Assertions.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Simulacion;


class SimulacionTest {

    private Simulacion simulacion;


    @BeforeEach
    void setUp() {
        ArrayList<Criatura> criaturas;
        simulacion = new Simulacion(criaturas);
    }

    @Test
    void puedeMoverQuieta(){
        Criatura c=new CriaturaQuieta(0,1);
        assertEquals(false, simulacion.puedeMover(c,1,1));
    }

    @Test
    void puedeMoverMovil(){
        Criatura c=new CriaturaMovil(0,1);
        assertEquals(true, simulacion.puedeMover(c,1,1));
    }

    @Test
    void puedeMoverMovil2(){
        Criatura c=new CriaturaMovil(0,0);
        assertEquals(false, simulacion.puedeMover(c,1,1));
    }

    @Test
    void puedeMoverDuplicada(){
        Criatura c=new CriaturaDuplicada(0,1);
        assertEquals(false, simulacion.puedeMover(c,1,1));
    }
    
    
    @Test
    void puedeDuplicarQuieta(){
        Criatura c=new CriaturaQuieta(0,1);
        assertEquals(false, simulacion.puedeDuplicar(c,1,1));
    }

    @Test
    void puedeDuplicarMovil(){
        Criatura c=new CriaturaMovil(0,1);
        assertEquals(true, simulacion.puedeMover(c,1,1));
    }

    

    @Test
    void puedeDuplicarDuplicada(){
        Criatura c=new CriaturaDuplicada(0,1);
        assertEquals(false, simulacion.puedeMover(c,1,1));
    }

    @Test
    void puedeDuplicarDuplicada2(){
        Criatura c=new CriaturaDuplicada(0,0);
        assertEquals(false, simulacion.puedeMover(c,1,1));
    }
    #TODO: Testear resto de metodos
}