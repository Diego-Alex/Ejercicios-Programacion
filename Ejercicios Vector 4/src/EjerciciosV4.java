/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjerciciosV4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vector[][]=new int [5][5];
		int mayor=0,menor=0;
		String ubim="",ubiM="";
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[0].length; j++) {
				vector[i][j]=(int)(Math.random()*200)-100;
				System.out.printf("%4d ",vector[i][j]);
			}
			System.out.println();
		}
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[0].length; j++) {
				if (vector[i][j]>mayor) {
					mayor=vector[i][j];
					ubiM=" y esta en la posicion "+(j+1)+"x"+(i+1);
				}else if (vector[i][j]<menor) {
					menor=vector[i][j];
					ubim=" y esta en la posicion "+(j+1)+"x"+(i+1);
				}
			}
		}
		System.out.println();
		System.out.println("El numero mas grande es "+mayor+ubiM);
		System.out.println("El numero mas pequeño es "+menor+ubim);
	}

}
