import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 * @version 2.0
 */
public class Ejercicio33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		System.out.println("Ejercicio 33");
		String alumno[]= new String[20];
		for (int i = 0; i < alumno.length; i++) {
			alumno[i] = teclado.nextLine();
		}
		
		imprimir(alumno);
	
	}
	
	public static String imprimir(String alumno[]){
		String comodin="";
		for (int i = 0; i < alumno.length; i++) {
		System.out.println(alumno[i]);
		}
		return comodin;		
	}
}
