package LogicaNegocio;

import java.util.ArrayList;
import java.util.List;

import Dominio.Criatura;
//TODO: Darle una vuelta a esta interfaz
//TODO: Decidir si es interfaz
public class Simulacion {
    private ArrayList<Criatura> criaturas;
    
    public Simulacion(List<Criatura> l) {
    	
    }
    
    public List<Criatura> getCriaturas(){
		return criaturas;
    }
    public boolean puedeMover(Criatura b, int x, int y) {
		return false;}
    public void mover(Criatura b, int x, int y) {}
    public boolean puedeDuplicar(Criatura b, int x, int y) {
		return false;}
    public void duplicar(Criatura b, int x, int y) {}
}
