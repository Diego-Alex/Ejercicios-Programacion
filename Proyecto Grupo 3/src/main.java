/**
 * 
 */

/**
 * @author usuario
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baraja="1C2C3C4C5C6C7C8C9CJCQCKCAC"
					+ "1D2D3D4D5D6D7D8D9DJDQDKDAD"
					+ "1T2T3T4T5T6T7T8T9TJTQTKTAT"
					+ "1P2P3P4P5P6P7P8P9PJPQPKPAP";
		String carta="";
		int num=0;
		for (int i = 0; i < 52 ; i++) {
			num = (int) (Math.random()*baraja.length());
			if (num%2!=0) {
				num--;
			}
			carta=baraja.substring(num, num+2);
			if(carta.endsWith("C")){
				carta=carta.replace('C', (char) 3);
			}
			if (carta.equals("1♥")) {
				carta="10♥";
			}else if(carta.equals("1♦")){
				carta="10♦";
			}else if(carta.equals("1♣")){
				carta="10♣";
			}
			else if(carta.equals("1♠")){
				carta="10♠";
			}
			System.out.print(carta+" ");
			if (i%13==0) {
				System.out.println();
			}
			baraja=baraja.substring(0,num)+baraja.substring(num+2);
		}
		
	}

}
