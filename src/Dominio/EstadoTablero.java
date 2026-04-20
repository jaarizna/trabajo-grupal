package Dominio;

import java.util.ArrayList;
import java.util.List;

public class EstadoTablero{

	private List<Criatura> criaturas;
    
	public EstadoTablero(){
        this.criaturas = new ArrayList<Criatura>();
    }

    public EstadoTablero(List<Criatura> criaturas){
        this.criaturas = criaturas;
    }

    public List<Criatura> getCriaturas() {
        return criaturas;
    }

    public void setCriaturas(List<Criatura> criaturas) {
        this.criaturas = criaturas;
    }
	
    public String toString(){
        //TODO: Implementar como lo que se devuelve al final

    }

}
