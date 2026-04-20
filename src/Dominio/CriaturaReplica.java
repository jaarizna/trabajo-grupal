package Dominio;

public class CriaturaReplica extends Criatura{

	private int probablilidad =30;
	
	public CriaturaReplica(int x, int y) {
		super(x, y);
	}

	public int getProbabilidad(){
		return this.probablilidad;
	}
	
	public void setProbabilidad(int prob){
		this.probablilidad=prob;
	}

	@Override
	public String getColor() {
		return "green";
	}
}
