import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Probando {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
	/*	System.out.println("CONVERSOR A LCD. Introduzca una frase:");
		String frase=teclado.nextLine();
		Letras_LCD letras= new Letras_LCD(frase);		*/	
		
		
		System.out.println("Ponga una fecha");
		System.out.println("Dia");
		int dia=teclado.nextInt();
		System.out.println("Mes");
		int mes=teclado.nextInt();
		System.out.println("Año");
		int año=teclado.nextInt();
		Fecha fecha=new Fecha(dia,mes,año);
	}

}
