import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjerciciosS5 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		System.out.println("Inroduzca una palabra");
		String texto=teclado.nextLine();
		String letra="";
		System.out.println("Ahora se esta cambiando la primera letra por la ultima");
		System.out.println("Por favor espere");
		Thread.sleep(1000);
		letra = texto.substring(0,1);
		texto=texto.replaceFirst(texto.substring(0,1),texto.substring(texto.length()-1));
		texto=texto.substring(0, texto.length()-1)+letra;		
		System.out.print("La palabra resultante es: ");
		System.out.println(texto);
		
	}

}
