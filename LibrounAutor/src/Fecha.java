import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Fecha {
	private Integer dia;
	private Integer mes;
	private Integer año;


	
//31 dias Enero (1), Marzo(3), Mayo (5), Julio (7), Agosto (8), Octubre (10), Diciembre (12)
//30 dias Abril (4), Junio (6), Septiembre (9), Noviembre (11)
//29/28 dias Febrero (2)
	
	public Fecha() {
			
	}

	
	@Override
	public String toString() {
		return "Has introducido el dia=" + dia + ", del mes=" + mes + ", del año=" + año;
	}

	public String verificadorFecha(){
		String fecha="";
		Boolean correcto=false;
		while(!correcto){
			int dia=Leer.pedirEntero("Dia");
			int mes=Leer.pedirEntero("Mes");
			int año=Leer.pedirEntero("Año");
			if (escorrecta(esbisiesto(año), mes, dia)) {
				this.año = año;
				this.dia = dia;
				this.mes = mes;
				Leer.mensaje("La fecha es correcta");
				fecha=dia+"/"+mes+"/"+año+"/";
				correcto=true;
			}else {
				Leer.mensaje("La fecha es erronea");
			}
		}
		return fecha;
	}
	
	private void verificadorBisiesto() throws InterruptedException{
		Thread.sleep(1000);
		if (esbisiesto(this.año)) {
			System.out.println("El año es bisiesto");
		} else {
			System.out.println("No es bisiesto");
		}
		
	}
	
	private void mostrarFecha() throws InterruptedException{
		Thread.sleep(1000);
		System.out.print("Ha introducido el mes: ");
		transformadorMeses();
		Thread.sleep(1000);
		System.out.println();
	}

	private void menu4() throws InterruptedException{
		Thread.sleep(1000);
		System.out.print("El mes introducido tiene ");
		System.out.print(calculadordias());
		System.out.println(" dias");
	}
	
	private void menu5 () throws InterruptedException{
		Scanner teclado=new Scanner(System.in);
		Thread.sleep(1000);
		System.out.println("De que forma desea imprimirlo?");
		System.out.println("1- dd-mm-yyyy");
		System.out.println("2- 5 de Mayo de 2016(Ejemplo)");
		Integer opcion1=teclado.nextInt();
		impresion(opcion1);
		System.out.println();
	}
	
	private void menu6 () throws InterruptedException{
		
	}
	
	private void menu7 () throws InterruptedException{
		Scanner teclado=new Scanner(System.in);
		Thread.sleep(1000);
		Integer diasmas=0;
		System.out.println("Cuantos dias desea aumentar a su fecha anteriormente introducida?");
		diasmas=teclado.nextInt();
		Thread.sleep(1000);
		System.out.println("Ahora se realizara la suma");
		sumadordedias(diasmas);;
		
	}
	
	
	
	
	
	
	
	
	private String calculadordias() {
		String comodin=""; 
		if (this.mes==1||this.mes==3||this.mes==5||this.mes==7||this.mes==8||this.mes==10||this.mes==12) {
			comodin="31";
		}else{
			comodin="30";
		}		
		if (esbisiesto(this.año) && this.mes==2) {
			comodin="29";
		}else if (this.mes==2) {
			comodin="28";
		}
		return comodin;
	}
	
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
			System.out.printf("%02d-%02d-"+año,dia, mes);
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
		switch (this.mes) {
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
	
	private void sumadordedias(Integer masdias){
		int dia2=this.dia;
		int mes2=this.mes;
		int año2=this.año;
			
		Integer mesesV[]={31,28,31,30,31,30,31,31,30,31,30,31};
		while (masdias<0) {
			if (esbisiesto(mes2)) {
				mesesV[1]=29;
			}else{
				mesesV[1]=28;
			}
			dia2++;
			
			if (dia2==mesesV[mes2-1]) {
				dia2=1;
				mes2=mes2++;
			}
			if (mes2>12) {
				mes2=1;
				año2++;
			}
			
			
			masdias--;
			
		}
		System.out.println("La fecha final es "+dia2+"-"+mes2+"-"+año2);
				
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
