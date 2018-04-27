import java.util.ArrayList;
import java.util.TreeMap;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Alumnos> listaAlumnos = new ArrayList<Alumnos>();

		TreeMap<Integer, ArrayList<String>> boletinPrimerT = new TreeMap<>();
		for (int i = 0; i < 11; i++) {
			boletinPrimerT.put(i, null);
		}
		TreeMap<Integer, ArrayList<String>> boletinSegundoT = new TreeMap<>();
		for (int i = 0; i < 11; i++) {
			boletinSegundoT.put(i, null);
		}
		TreeMap<Integer, ArrayList<String>> boletinTercerT = new TreeMap<>();
		for (int i = 0; i < 11; i++) {
			boletinTercerT.put(i, null);
		}

		for (int i = 1; i <= 50; i++) {
			Alumnos alumno = null;
			if (i < 10) {
				alumno = new Alumnos("Alum " + i, " Apell " + i, (int) (Math.random() * 11),
						(int) (Math.random() * 11), (int) (Math.random() * 11));
			} else {
				alumno = new Alumnos("Alum " + i, "Apell " + i, (int) (Math.random() * 11),
						(int) (Math.random() * 11), (int) (Math.random() * 11));
			}
			listaAlumnos.add(alumno);

			for (int j = 0; j < 11; j++) {
				ArrayList<String> alumnos = new ArrayList<>();
				if (alumno.getNota1() == j) {
					if (boletinPrimerT.get(j) != null) {
						alumnos = boletinPrimerT.get(j);
					}
					alumnos.add(alumno.getNombre());
					boletinPrimerT.put(j, alumnos);
					break;
				}
			}
			for (int j = 0; j < 11; j++) {
				ArrayList<String> alumnos = new ArrayList<>();
				if (alumno.getNota2() == j) {
					if (boletinSegundoT.get(j) != null) {
						alumnos = boletinSegundoT.get(j);
					}
					alumnos.add(alumno.getNombre());
					boletinSegundoT.put(j, alumnos);
					break;
				}
			}
			for (int j = 0; j < 11; j++) {
				ArrayList<String> alumnos = new ArrayList<>();
				if (alumno.getNota3() == j) {
					if (boletinTercerT.get(j) != null) {
						alumnos = boletinTercerT.get(j);
					}
					alumnos.add(alumno.getNombre());
					boletinTercerT.put(j, alumnos);
					break;
				}
			}

		}
		Integer opcion = 9;
		while (opcion != 0) {
			opcion = Leer.pedirEntero(
					"Que desea ver?\n1. Notas 1º Trimestre\n2. Notas 2º Trimestre\n3. Notas 3º Trimestre\n4. Mostrar Boletin General\n0. Salir");
			menu(boletinPrimerT, boletinSegundoT, boletinTercerT, opcion, listaAlumnos);
			Leer.mensaje("");
		}

	}

	private static void menu(TreeMap<Integer, ArrayList<String>> boletinPrimerT,
			TreeMap<Integer, ArrayList<String>> boletinSegundoT, TreeMap<Integer, ArrayList<String>> boletinTercerT,
			Integer opcion, ArrayList<Alumnos> listaAlumnos) {
		switch (opcion) {
		case 1:

			for (int i = 0; i < 11; i++) {
				if (boletinPrimerT.get(i) != null) {
					Leer.mensaje("Nota " + i + ":" + boletinPrimerT.get(i).toString());
				} else {
					Leer.mensaje("Nota " + i + ": Nadie ha obtenido esa nota");
				}
			}

			break;
		case 2:

			for (int i = 0; i < 11; i++) {
				if (boletinSegundoT.get(i) != null) {
					Leer.mensaje("Nota " + i + ":" + boletinSegundoT.get(i).toString());
				} else {
					Leer.mensaje("Nota " + i + ": Nadie ha obtenido esa nota");
				}
			}

			break;
		case 3:

			for (int i = 0; i < 11; i++) {
				if (boletinTercerT.get(i) != null) {
					Leer.mensaje("Nota " + i + ":" + boletinTercerT.get(i).toString());
				} else {
					Leer.mensaje("Nota " + i + ": Nadie ha obtenido esa nota");
				}
			}

			break;
		case 4:
			Leer.mensaje("Nombre    Apellido    1º Trimestre    2º Trimestre   3º Trimestre");
			for (Alumnos alumno : listaAlumnos) {
				Leer.mensaje(alumno.toString());
			}
			break;
		default:
			break;
		}
	}
}
