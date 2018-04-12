import java.util.ArrayList;
import java.util.TreeMap;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer numPartidos = Leer.pedirEntero("Cuantos partidos hay?");
		Integer numEscanios = Leer.pedirEntero("Cuantos escaños hay?");
		Integer escanios, votos = 100;
		TreeMap<String, ArrayList<Integer>> tablaParaRepartir = new TreeMap<>();
		votos = insercionVotos(numPartidos, numEscanios, votos, tablaParaRepartir);
		mostrarVotos(numPartidos, tablaParaRepartir);
		
		System.out.println();
		TreeMap<String, Integer> tablaDeEscanios = new TreeMap<>();
		
		creacionTablaescaños(numPartidos, tablaDeEscanios);
		insercionEscanios(numPartidos, numEscanios, tablaParaRepartir, tablaDeEscanios);
		mostrarescanios(numPartidos, tablaDeEscanios);
	}


	private static void creacionTablaescaños(Integer numPartidos, TreeMap<String, Integer> tablaDeEscanios) {
		for (int i = 1; i <= numPartidos; i++) {
			tablaDeEscanios.put("Part" + i, 0);
		}
	}
	
	private static void insercionEscanios(Integer numPartidos, Integer numEscanios,
			TreeMap<String, ArrayList<Integer>> tablaParaRepartir, TreeMap<String, Integer> tablaDeEscanios) {
		for (int i = 0; i < numEscanios; i++) {
			String Pmayor="Part1";
			Integer Vmayor=tablaParaRepartir.get(Pmayor).get(0);
			for (int j = 2; j <= numPartidos; j++) {
				if (Vmayor<tablaParaRepartir.get("Part"+j).get(0)) {
					Pmayor="Part"+j;
					Vmayor=tablaParaRepartir.get(Pmayor).get(0);
				}
			}
			tablaDeEscanios.put(Pmayor, tablaDeEscanios.get(Pmayor)+1);
			tablaParaRepartir.get(Pmayor).remove(0);
		}
	}

	private static void mostrarescanios(Integer numPartidos, TreeMap<String, Integer> tablaDeEscanios) {
		for (int i = 1; i <= numPartidos; i++) {
			Leer.mensaje("Part" + i + "= " + tablaDeEscanios.get("Part" + i) + " escaños");
		}
	}

	private static void mostrarVotos(Integer numPartidos, TreeMap<String, ArrayList<Integer>> tablaParaRepartir) {
		for (int i = 1; i <= numPartidos; i++) {
			Leer.mensaje("Part" + i + "= " + tablaParaRepartir.get("Part" + i).toString());
		}
	}

	private static Integer insercionVotos(Integer numPartidos, Integer numEscanios, Integer votos,
			TreeMap<String, ArrayList<Integer>> tablaParaRepartir) {
		Integer escanios;
		for (int i = 1; i <= numPartidos; i++) {
			ArrayList<Integer> listaNumEscanios = new ArrayList<>();
			if (i < numPartidos) {
				escanios = ((int) (Math.random() * ((votos / 3.5) + 1)));
				votos = votos - escanios;
				if (escanios==0) {
					escanios=1;
				}
				escanios = escanios * 1000;
			} else {
				escanios = votos * 1000;
			}
			for (int j = 1; j <= numEscanios; j++) {
				listaNumEscanios.add(escanios / j);
			}
			tablaParaRepartir.put("Part" + i, listaNumEscanios);
		}
		return votos;
	}
}
