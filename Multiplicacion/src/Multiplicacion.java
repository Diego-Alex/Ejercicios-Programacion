import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Multiplicacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num1=0;
		int num2=0;
		int result;
		
		System.out.println("Introduce dos numeros por favor:");
		
		num1= teclado.nextInt();
		num2=teclado.nextInt();
		
		result=num1*num2;
		
		System.out.println(result);
		System.out.println("Gracias");
	}

}
