/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjerciciosV5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vector1[]=new int [10];
		int vector2[]=new int [10];
		int contador[]=new int [10];
		for (int i = 0; i < vector1.length; i++) {
				vector1[i]=(int) (Math.random()*10)+1;
				vector2[i]=(int) (Math.random()*10)+1;
		}
		
		for (int i = 0; i < vector1.length; i++) {
			for (int j = 0; j < vector2.length; j++) {
				if (vector1[i]==vector2[j]) {
					contador[i]=contador[i]+1;
				}
			}
				System.out.printf("Se repite "+contador[i]+" el numero %2d del vector 1 en el vector 2",vector1[i]);
				
				System.out.println();
				
		}
		
	}

}
