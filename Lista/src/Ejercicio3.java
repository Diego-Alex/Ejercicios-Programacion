import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

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
		ArrayList listaArray=new ArrayList<>();
		LinkedList listaLinked=new LinkedList<>();
		String numerosArray="";
		String numerosLinked="";
		Integer NumAleat=0;
		for (int i = 1; i < 15; i++) {
			NumAleat=(int) (Math.random()*15)+1;
			listaLinked.add(NumAleat);
			numerosLinked=numerosLinked+NumAleat+" * ";
			
			NumAleat=(int) (Math.random()*15)+1;
			listaArray.add(NumAleat);
			numerosArray=numerosArray+NumAleat+" * ";
		}
		
		Leer.mensaje("Se van a generar 14 datos para la lista Linked \nInsertando:\n"+numerosLinked);
		Leer.mensaje("");
		Leer.mensaje("Se van a generar 14 datos para la lista Array \nInsertando:\n"+numerosArray);
		Leer.mensaje("");
		String listaLinkedNum="";
		for (Object i : listaLinked) {
			listaLinkedNum=listaLinkedNum+i+" ";
		}
		String listaArrayNum="";
		for (Object i : listaArray) {
			listaArrayNum=listaArrayNum+i+" ";
		}
		Leer.mensaje("Valores de objLinkedList: "+listaLinkedNum);
		Leer.mensaje("");
		Leer.mensaje("Valores de objArrayList: "+listaArrayNum);
		Leer.mensaje("");
		Leer.mensaje("Valores de objLinkedList: "+listaLinked.toString());
		Leer.mensaje("Valores de objArrayList: "+listaArray.toString());
	}
}
