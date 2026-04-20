package Dominio;

public class CriaturaQuieta extends Criatura{

	public CriaturaQuieta(int x, int y) {
		super(x, y);
	}

	@Override
	public String getColor() {
		return "blue";
	}

}
