import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados empleados[]=new Empleados[10];
		String nombre="";
		Integer saldo=0;
		String titulo="";
		String departamento="";
		for (int i = 0; i < 5; i++) {
			nombre=Leer.pedirCadena("Nombre del empleado");
			saldo=Leer.pedirEntero("Saldo del empleado");
			empleados[i]=new Empleados(nombre, saldo);
		}
		for (int i = 5; i < 10; i++) {
			nombre=Leer.pedirCadena("Nombre del jefe");
			saldo=Leer.pedirEntero("Saldo del jefe");			
			titulo=Leer.pedirCadena("Titulo del jefe");			
			departamento=Leer.pedirCadena("Departamento que controla");
			empleados[i]=new Jefes(nombre, saldo, titulo, departamento);
		}
		for (int i = 0; i < empleados.length; i++) {
			empleados[i].mostrardatos();
			System.out.println();
		}
	}

}
