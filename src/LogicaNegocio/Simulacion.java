package LogicaNegocio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Dominio.Criatura;
import Dominio.CriaturaMovil;
import Dominio.CriaturaQuieta;
import Dominio.CriaturaReplica;
import Dominio.EstadoTablero;

//TODO: Darle una vuelta a esta interfaz
//TODO: Decidir si es interfaz
public class Simulacion {
	private EstadoTablero tablero;
	private static final int[] valores = { -1, 0, 1 };
	private Random r= new Random();

	public Simulacion(EstadoTablero t) {
		tablero = t;
	}

	public EstadoTablero getTablero() {
		return tablero;
	}

	public List<Criatura> getCriaturas() {
		return tablero.getCriaturas();
	}

	public boolean puedeActuar(Criatura b, int x, int y) {
		if (! (b instanceof CriaturaQuieta)) {
			if ((x < 0 && x >= tablero.getLongCuadrado()) || (y < 0 && y >= tablero.getLongCuadrado())) {
				return false;
			} else if (hayCriatura(x, y)) {
				return false;
			} else {
				return true;
			}
		} else {
			return false;
		}

	}

	public void actuar(Criatura b, int x, int y) {
		if(b instanceof CriaturaMovil) {
		b.setX(x);
		b.setY(y);
		}
		if(b instanceof CriaturaReplica) {
			
		}
	}

	

	public boolean hayCriatura(int x, int y) {

		for (Criatura c : tablero.getCriaturas()) {
			if (c.getX() == x && c.getY() == y) {
				return true;
			}
		}
		return false;
	}

	public void simular() {

	}
}
