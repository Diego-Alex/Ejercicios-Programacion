import java.util.Scanner;

/**
 * Ejercicio que realiza la tabla de multiplicar, verifica si es primo, y realiza el factorial de ese numero
 * @author usuario
 *
 */
public class Ejercicio32 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ejercicio 32");
		int x = teclado.nextInt();
		x=Integer.parseInt(verificador(x));
		primo(x,1,0);
		multiplicacion(x,0,0);
		Thread.sleep(1000);
		factorial(x);
		System.out.println("FIN");
		
	}
	/**
	 * Verifica si el numero no es igual a 0
	 * @param x Numero introducido
	 * @return comodin El numero verificado para que no sea 0
	 */
	public static String verificador(int x){
		Scanner teclado = new Scanner(System.in);
		String comodin="";
		while (x==0) {
			System.out.println("Por favor introduzca un numero que no sea 0");
			x = teclado.nextInt();
		}
		comodin=Integer.toString(x);
		return comodin;
	}
	/**
	 * Averigua si el numero introducido es primo
	 * @param x Numero introducido
	 * @param a Recorre todos los numeros desde el 1 hasta el anterior introducido
	 * @param cont Si es igual a 0 el numero es primo, si es distinto a 0 no es primo
	 * @return comodin no tiene valor
	 */
	public static String primo(int x,int a, int cont){
		String comodin="";
		while (a < x) {
			if (x % a ==0) {
				cont++;
			}
		a++;
		}
		if (cont ==0) {
			System.out.println("El " + x + " es primo");
		}else{
			System.out.println("El " + x + " no es primo");
		}
		return comodin;
	}
	/**
	 * Realiza la tabla de multiplicación
	 * @param x Numero introducido
	 * @param a Numero por el cual se multiplica
	 * @param cont El resultado de la multiplicacion entre el numero y la variable a
	 * @return comodin no tiene valor
	 * @throws InterruptedException
	 */
	public static String multiplicacion(int x,int a, int cont) throws InterruptedException{
		String comodin="";
		System.out.println("Tabla de multiplicar");
		while (a <=10) {
			cont = x * a;
			Thread.sleep(1000);
			System.out.println(x + "*" + a + "=" + cont);
			a++;
		}
		return comodin;
	}
	/**
	 * Realiza el factorial del numero
	 * @param x Numero introducido
	 * @return comodin no tiene valor
	 */
	public static String factorial(int x){
	String comodin="";
	long factorial=1, cont=1;
	while(cont<=x){
		factorial=factorial*cont;
		cont++;
	}
	System.out.println("El factorial del numero "+x+" es "+factorial);
	return comodin;
	}
}