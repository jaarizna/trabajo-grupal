package Dominio;

public class CriaturaMovil extends Criatura {
			
	public CriaturaMovil(int x, int y) {
		super(x, y);
	}

	@Override
	public String getColor() {
		return "red";
	}
}
