import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Fecha {
	Integer dia;
	Integer mes;
	Integer año;
	
	public Fecha(Integer dia, Integer mes, Integer año) throws InterruptedException {
		Scanner teclado=new Scanner(System.in);
		
		if (escorrecta(esbisiesto(año), mes, dia)==true) {
			this.año = año;
			this.dia = dia;
			this.mes = mes;
			System.out.println("Correcto");
		}else {
			System.out.println("Error");
			return;
		}
		Thread.sleep(1000);
		System.out.print("Estas en el mes ");
		transformadorMeses();
		System.out.println();
		Thread.sleep(1000);
		System.out.println("Desea imprimirlo?");
		String opcion=teclado.nextLine();
		opcion=opcion.toLowerCase();
		opcion=verificadorSN(opcion);
		if (opcion.equals("si")) {
			System.out.println("De que forma desea imprimirlo?");
			System.out.println("1- dd-mm-yyyy");
			System.out.println("2- 5 de Mayo de 2016(Ejemplo)");
			Integer opcion1=teclado.nextInt();
			impresion(opcion1);
		}else {
		}
		
	}
//31 dias Enero (1), Marzo(3), Mayo (5), Julio (7), Agosto (8), Octubre (10), Diciembre (12)
//30 dias Abril (4), Junio (6), Septiembre (9), Noviembre (11)
//29/28 dias Febrero (2)
	
	
	
	
	
	private boolean esbisiesto (Integer año){
		return año % 4 == 0 && año % 100 != 0 || año % 400 == 0;
	}
	private boolean escorrecta (boolean bisiesto, Integer mes,Integer dia){
		boolean respuesta=false;
		if (bisiesto==true) {
			respuesta= meses30I31(mes, dia);
			if (mes == 2) {
				if (dia<=29) {
					respuesta= true;
				} else {
					respuesta= false;
				}
			}
		} else{
			respuesta= meses30I31(mes, dia);
			if (mes == 2) {
				if (dia<=28) {
					respuesta= true;
				} else {
					respuesta= false;
				}
			}
		}
		return respuesta;
		
	}
	private boolean meses30I31(Integer mes, Integer dia) {
		if (mes == 1 ||mes == 3 ||mes == 5 ||mes == 7 ||mes == 8 ||mes == 10 ||mes == 12) {
			if (dia>31 || dia<0) {
				return false;
			} else {
				return true;
			}
		}
		if (mes == 4 ||mes == 6 ||mes == 9 ||mes == 11) {
			if (dia>30 || dia<0) {
				return false;
			} else {
				return true;
			}
		}
		return false;
	}
	
	private String verificadorSN (String opcion){
		Scanner teclado=new Scanner(System.in);
		while (!(opcion.equals("si")||opcion.equals("no")||opcion.equals("noup"))) {
			System.out.println("Por favor, introduca un si o una no");
			opcion=teclado.nextLine();
			opcion=opcion.toLowerCase();
		}
		return opcion;
	}
	
	public void impresion(Integer opcion){
		Scanner teclado=new Scanner(System.in);
		while (!(opcion==1||opcion==2)) {
			System.out.println("Por favor introduzca un 1 o un 2");
			opcion=teclado.nextInt();
		}
		if (opcion==1) {
			System.out.println(dia+"-"+mes+"-"+año);
		}else {
			impresion2F();
		}
	}
	
	public void impresion2F(){
		System.out.print(dia+" de ");
		transformadorMeses();
		System.out.print(" de "+año);
	}
	
	private void transformadorMeses() {
		switch (mes) {
		case 1:
			System.out.print("Enero");
			break;
		case 2:
			System.out.print("Febrero");
			break;
		case 3:
			System.out.print("Marzo");
			break;
		case 4:
			System.out.print("Abril");
			break;
		case 5:
			System.out.print("Mayo");
			break;
		case 6:
			System.out.print("Junio");
			break;
		case 7:
			System.out.print("Julio");
			break;
		case 8:
			System.out.print("Agosto");
			break;
		case 9:
			System.out.print("Septiembre");
			break;
		case 10:
			System.out.print("Octubre");	
			break;
		case 11:
			System.out.print("Noviembre");			
			break;
		case 12:
			System.out.print("Diciembre");			
			break;
		}
	}
	
	private Integer getDia() {
		return dia;
	}

	private void setDia(Integer dia) {
		this.dia = dia;
	}

	private Integer getMes() {
		return mes;
	}

	private void setMes(Integer mes) {
		this.mes = mes;
	}

	private Integer getAño() {
		return año;
	}

	private void setAño(Integer año) {
		this.año = año;
	}	
	
	
}
