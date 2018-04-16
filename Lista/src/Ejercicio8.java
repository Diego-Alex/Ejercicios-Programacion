import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Double> boletin=new TreeMap<>();
		String texto="";
		double numero=0;
		TreeMap<Integer,ArrayList<String>> boletinOrdenadoNota= new TreeMap<>();
		
		for (int i = 0; i < 11; i++) {
			boletinOrdenadoNota.put(i, null);
		}
		
		while(!texto.equals("*")){
			texto=Leer.pedirCadena("Introduce el apellidos del alumno");
			if (texto.equals("*")) {
				break;
			}
			numero=Leer.pedirEntero("Introduce la nota del alumno: "+texto);
			while (numero<0||numero>10) {
				numero=Leer.pedirEntero("Vuelvea introducir la nota del alumno: "+texto);
			}
			boletin.put(texto, numero);

			for (int i = 0; i < 11; i++) {
				ArrayList<String> alumnos=new ArrayList<>();
				if (numero == i) {
					if (boletinOrdenadoNota.get(i)!=null) {
							alumnos = boletinOrdenadoNota.get(i);
					}				
					alumnos.add(texto);
					boletinOrdenadoNota.put(i, alumnos);
					break;
				}
			}
		}
		
		Leer.mensaje(boletin.toString());
		Leer.mensaje("");
		
		for (int i = 0; i < 11; i++) {
			if (boletinOrdenadoNota.get(i)!=null) {
				Leer.mensaje("Nota "+i+":"+boletinOrdenadoNota.get(i).toString());
			}else{
				Leer.mensaje("Nota "+i+": Nadie ha obtenido esa nota");
			}
		}
	}
}
