import java.util.Scanner;

/**
 * 
 */

/**
 * @author (usuario) Sergio Martinez, Sergio Ruberte, Lucia Serrano, Deac Alexandru
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribir un numero y pasalo a LCD
		/*
		 *   _     _  _     _  _  _  _  _ 
			| |  | _| _||_||_ |_   ||_||_|
			|_|  ||_  _|  | _||_|  ||_| _|
		 */
		Scanner teclado= new Scanner(System.in);
		String cadena; //numero Introducido
		boolean permitido=false; //Variable de control
		String valores="0123456789"; //Un Patron de Valores Permitidos
		int comodin=0; //COMODIN
		do{//filtrar el numero para que sea valido
			comodin=0;
			System.out.println("Escribe un n�mero entero mayor que 0");
			cadena=teclado.nextLine();
			for(int i=0; i<cadena.length(); i++){//mira cada caracter para que no haya valores no permitidos.
				if(valores.indexOf(cadena.substring(i, i+1))==-1){
					comodin++;
				}
			}
			if (comodin==0) {//Si todos los valores est�n permitidos, cambiamos la variable a true
				permitido=true;
			}else{
				System.out.println("Valor no permitido");
			}
		}while (permitido==false);
			for(int i=0; i<cadena.length(); i++){//Escribimos la primera fila de cada n�mero
				if(cadena.charAt(i)=='1' ||cadena.charAt(i)=='4'){//Numeros 1,4
					System.out.print("   ");
				}else if(cadena.charAt(i)!='1' ||cadena.charAt(i)!='4'){//Numeros 2,3,5,6,7,8,9,0
					System.out.print(" _ ");
				}
			}
			System.out.println();//Salto de linea para separar filas
			
			for(int i=0; i<cadena.length(); i++){//Escribimos la segunda fila de cada n�mero
				if(cadena.charAt(i)=='4' ||cadena.charAt(i)=='8'|| cadena.charAt(i)=='9'){//Numeros 4,8,9
					System.out.print("|_|");
				}else if(cadena.charAt(i)=='2' ||cadena.charAt(i)=='3'){//Numeros 2,3
					System.out.print(" _|");
				}else if (cadena.charAt(i)=='5' ||cadena.charAt(i)=='6'){//Numeros 5,6
					System.out.print("|_ ");
				}else if (cadena.charAt(i)=='1' ||cadena.charAt(i)=='7'){//Numeros 1,7
					System.out.print("  |");
				}else{
					System.out.print("| |");//Numero 0
				}
			}
			System.out.println();//Salto de linea para separar filas
			
			for(int i=0; i<cadena.length(); i++){//Escribimos la tercera fila de cada n�mero
				if (cadena.charAt(i)=='1' ||cadena.charAt(i)=='4'||cadena.charAt(i)=='7') {//Numeros 1,4,7
					System.out.print("  |");
				}else if (cadena.charAt(i)=='3' ||cadena.charAt(i)=='5'||cadena.charAt(i)=='9') {//Numeros 3,5,9
					System.out.print(" _|");
				}else if (cadena.charAt(i)=='6' ||cadena.charAt(i)=='8'||cadena.charAt(i)=='0'){//Numeros 6,8,0
					System.out.print("|_|");
				}else {
					System.out.print("|_ ");//Numero 2
				}
			}		
		
	}

}
