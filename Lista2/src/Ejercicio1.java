import java.util.ArrayList;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer opcion = 1;
		ArrayList<Integer> cima = new ArrayList<Integer>();
		while (opcion != 0) {
			opcion = Leer.pedirEntero("1. Apilar \n" + "2. Desapilar \n" + "3. Numero de elementos \n"
					+ "4. Visualizar \n" + "0. Salir \n" + "Introduce una opcion");
			cima = menu(opcion, cima);
		}

	}

	public static ArrayList menu(Integer opcion, ArrayList<Integer> listaArray) {

		switch (opcion) {
		case 1:
			Integer valor = Leer.pedirEntero("Introduce un valor");
			listaArray.add(0, valor);
			;
			break;
		case 2:
			if (listaArray.size() == 0) {
				Leer.mensaje("La Pila esta vacia");
			} else {
				Leer.mensaje("Se ha borrado el elemento " + listaArray.get(0));
				listaArray.remove(0);

			}
			break;
		case 3:
			Leer.mensaje("" + listaArray.size());

			break;
		case 4:
			for (int i = 0; i <= listaArray.size(); i++) {
				i = 0;
				Leer.mensaje("" + listaArray.get(i));
				listaArray.remove(0);
			}

			break;
		default:
			Leer.mensaje("Opcion Inexistente");
			break;
		}
		return listaArray;

	}
}
