package LogicaNegocio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Dominio.Criatura;
import Dominio.CriaturaMovil;
import Dominio.CriaturaQuieta;
import Dominio.CriaturaReplica;
import Dominio.EstadoTablero;

/**
 * 
 * Clase encargada de simular un tablero determinado
 * 
 * @param t Tablero donde se aloja la simulacion
 * 
 */

public class Simulacion {
	private EstadoTablero tablero;
	private int maxInstantes;
	private static final int[] valores = { -1, 0, 1 };
	private Random r = new Random();

	public Simulacion(EstadoTablero t,int max) {
		tablero = t;
		maxInstantes=max;
	}

	/**
	 * Devuelve el estado del tablero
	 * 
	 * @param tokenSolicitud nuevo token de la solicitud
	 */
	public EstadoTablero getTablero() {
		return tablero;
	}

	/**
	 * Devuelve la lista de las criaturas del tablero
	 * 
	 * return lista de las criaturas
	 */
	public List<Criatura> getCriaturas() {
		return tablero.getCriaturas();
	}

	/**
	 * Devuelve true si una criatura b puede hacer algo y false en caso contrario
	 * 
	 * @param b criatura que se determina si podra hacer algo
	 * @param x nueva posicion x del tablero donde se puede actuar
	 * @param y nueva posicion y del tablero donde se puede actuar
	 */
	public boolean puedeActuar(Criatura b, int x, int y) {
		if (!(b instanceof CriaturaQuieta)) {
			if ((x < 0 && x >= tablero.getLongCuadrado()) || (y < 0 && y >= tablero.getLongCuadrado())) {
				return false;
			} else if (hayCriatura(x, y)) {
				return false;
			} else if (b.estaAlLado(x, y)) {
				return false;
			} else {
				return true;
			}
		} else {
			return false;
		}

	}

	/**
	 * Se realiza la accion de la criatura b
	 * 
	 * @param b criatura que se determina si podra hacer algo
	 * @param x nueva posicion x del tablero donde se puede actuar
	 * @param y nueva posicion y del tablero donde se puede actuar
	 */
	public void actuar(Criatura b, int x, int y) {
		if (b instanceof CriaturaMovil) {
			b.setX(x);
			b.setY(y);
		}
		if (b instanceof CriaturaReplica) {
			CriaturaReplica c = (CriaturaReplica) b;
			if(randomProbEvaluar(c.getProbabilidad())){
				List<Criatura> l = tablero.getCriaturas();
				l.add(new CriaturaReplica(x, y));

				tablero.setCriaturas(l);
			}
			
		}
	}

	/**
	 * Devuelve true si hay una criaura en las coordenadas(x,y) y falso en el
	 * contrario
	 * 
	 * @param x nueva posicion x del tablero donde se puede actuar
	 * @param y nueva posicion y del tablero donde se puede actuar
	 */
	public boolean hayCriatura(int x, int y) {

		for (Criatura c : tablero.getCriaturas()) {
			if (c.getX() == x && c.getY() == y) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Realiza la simulacion de un instante
	 * 
	 */
	public void simularInstante() {
		for (Criatura c : tablero.getCriaturas()) {
			int nX = c.getX() + valores[r.nextInt(3)];
			int nY = c.getY() + valores[r.nextInt(3)];
			if (puedeActuar(c, nX, nY)) {
				actuar(c, nX, nY);
			}
		}
		//TODO: guardar de alguna manera cada instante
		tablero.toString();
		tablero.avanzarInstante();
	}

	public void simular() {
		while (tablero.getInstante() < maxInstantes) {
			simularInstante();
		}
	}



	/**
	 * Devuelve true con probabilidad prob%
	 * 
	 */
	private boolean randomProbEvaluar(int prob) {
        Random r= new Random();
        int r1 = r.nextInt(99);
		return prob-1>=r1;
	}
}
