import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String buscar, numero, palo;
		
		/*System.out.println("Introduce una carta");
		buscar= teclado.nextLine();*/
		
		int cont=0, pos=0;
		String baraja="1C2C3C4C5C6C7C8C9CJCQCKCAC" //Todas las cartas de la baraja
				+ "1D2D3D4D5D6D7D8D9DJDQDKDAD"
				+ "1T2T3T4T5T6T7T8T9TJTQTKTAT"
				+ "1P2P3P4P5P6P7P8P9PJPQPKPAP";
	String carta=""; //Carta aleatoria
	int num=0; //Numero en la carta
		for (int i = 1; i <= 52 ; i++) {
		num = (int) (Math.random()*baraja.length());
		if (num%2!=0) {
			num--;
		}
		carta=baraja.substring(num, num+2);
		if (carta.equals("1C")) {
			carta="10C";
		}else if(carta.equals("1D")){
			carta="10D";
		}else if(carta.equals("1T")){
			carta="10T";
		}
		else if(carta.equals("1P")){
			carta="10P";
		}
		
		if(carta.endsWith("C")){
			carta=carta.replace('C', '♥'); //Corazones 
		
		}else if (carta.endsWith("D")){
			carta=carta.replace('D', '♦'); //Diamantes 
		
		}else if (carta.endsWith("T")){
			carta=carta.replace('T', '♣'); //Treboles 
		
		}else if (carta.endsWith("P")){
			carta=carta.replace('P', '♠');//Picas 
		
		}
		cont++;
		
		System.out.print(carta+" ");
		/*if(carta.equals(buscar)){
			pos=cont;
		}*/
		if (i%13==0) {
			System.out.println();
		}
		baraja=baraja.substring(0,num)+baraja.substring(num+2);
	}
		//System.out.println("La carta esta en la posicion "+pos);
	}

}
