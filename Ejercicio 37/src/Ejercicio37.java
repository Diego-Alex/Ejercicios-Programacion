/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio37 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][]= new int[4][5];
		matrizorig(matriz);
		
		System.out.println();
		
		matriztras(matriz);
		
	}
	public static void matrizorig (int matriz[][]){
		int matriz2[][]=matriz;
		for (int fil = 0; fil < matriz.length; fil++) {
			for (int co = 0; co < matriz[0].length; co++) {
				matriz[fil][co]= (int) (Math.random()*100)+1;
				System.out.print(matriz[fil][co] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public static String matriztras (int matriz[][]){
		String comodin="";
		for (int co = 0; co < matriz[0].length; co++) {
			for (int fi = 0; fi < matriz.length; fi++) {
				System.out.print(matriz[fi][co] + "\t");
			}
			System.out.println();
		}
		return comodin;
	}
}
