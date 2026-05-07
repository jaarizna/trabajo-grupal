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
	private ArrayList<String> resultados = new ArrayList<>();
	private int longCuadrado;

	public Simulacion(EstadoTablero t, int max) {
		tablero = t;
		maxInstantes = max;
	}

	public Simulacion(int max, List<Integer> numCriaturas) {
		tablero = new EstadoTablero(0);
		maxInstantes = max;
		int numTot = 0;
		for (int n : numCriaturas) {
			numTot += n;
		}
		longCuadrado = numTot;
		tablero.setCriaturas(getCriaturas());

	}

	/**
	 * Puebla el tablero con las criaturas y devuelve como lista
	 * 
	 * @param numCriaturas lista con la cantidad de criaturas de cada tipo
	 *                     (QUIETA,MOVIL,REPLICA)
	 */

	public List<Criatura> poblar(List<Integer> numCriaturas) {
		List<Criatura> l = new ArrayList<>();


		crearCriaturas(l, numCriaturas.get(0),  "quieta");
		crearCriaturas(l, numCriaturas.get(1),  "movil");
		crearCriaturas(l, numCriaturas.get(2),  "replica");

		return l;
	}

	/**
	 * Crea crituras a segun una cantidad y un tipo y lo añade a una lista
	 * 
	 * @param l  lista de las criaturas
	 * @param cantidad  numero de criaturas a crear
	 * @param tipo  tipo de criatura a crear
	 */
	private void crearCriaturas(List<Criatura> l, int cantidad, String tipo) {
		int i = 0;
		Random r = new Random();

		while (i < cantidad) {
			int x = r.nextInt(longCuadrado - 1);
			int y = r.nextInt(longCuadrado - 1);

			while (hayCriatura(x, y)) {
				x = r.nextInt(longCuadrado - 1);
				y = r.nextInt(longCuadrado - 1);
			}

			switch (tipo) {
			case "quieta":
				l.add(new CriaturaQuieta(x, y));
				break;
			case "movil":
				l.add(new CriaturaMovil(x, y));
				break;
			case "replica":
				l.add(new CriaturaReplica(x, y));
				break;
			}

			i++;
		}
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
			if ((x < 0 && x >= longCuadrado) || (y < 0 && y >= longCuadrado)) {
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
			if (randomProbEvaluar(c.getProbabilidad())) {
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
		resultados.add(tablero.toString());
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
		Random r = new Random();
		int r1 = r.nextInt(99);
		return prob - 1 >= r1;
	}

	/**
	 * 
	 * Obtenemos la longitud del tablero calculada según el nº de criaturas
	 * 
	 */
	public long getLongCuadrado() {
		return Math.round(1.25 * Math.sqrt(longCuadrado));
	}
}
