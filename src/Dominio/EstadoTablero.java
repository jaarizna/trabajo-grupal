package Dominio;

import java.util.ArrayList;
import java.util.List;

public class EstadoTablero{
    //Tablero de tamaño fijo 12x12 casillas
	private List<Criatura> criaturas;
    private int instante;
    
	public EstadoTablero(int instante){
        this.criaturas = new ArrayList<Criatura>();
        this.instante = instante;
    }

    public EstadoTablero(List<Criatura> criaturas, int instante){
        this.criaturas = criaturas;
        this.instante = instante;
    }

    public List<Criatura> getCriaturas() {
        return criaturas;
    }

    public void setCriaturas(List<Criatura> criaturas) {
        this.criaturas = criaturas;
    }

    public int getInstante() {
        return instante;
    }

    public void setInstante(int instante) {
        this.instante = instante;
    }
	
    public String toString(){
        String res="12";
        for(Criatura c:this.criaturas){
            res+="\n";
            res+=this.instante+","+c.getX()+" "+c.getY()+",";
            if(c instanceof CriaturaMovil){
                res+="red";
            }else if(c instanceof CriaturaReplica){
                res+="blue";
            }else if(c instanceof CriaturaQuieta){
                res+="green";
            }
        }
        return res;
    }

}
