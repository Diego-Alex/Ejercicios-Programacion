import java.lang.management.MemoryNotificationInfo;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Proyectogrupo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleados[] = new Empleado[20];
		Integer opcion = 30;
		base_Datos(empleados);
		while (opcion != 0) {

			Leer.mensaje("1. Añadir Empleado");
			Leer.mensaje("2. Lista de la plantilla");
			Leer.mensaje("3. Calcular nomina");
			Leer.mensaje("4. Calcular nomina total");
			Leer.mensaje("5. Mantener los valores Tipo Static");
			Leer.mensaje("0. Salir");
			opcion = Leer.pedirEntero("");
			menu(opcion, empleados);
		}
	}

	public static void menu(Integer opcion, Empleado[] empleados) {

		switch (opcion) {
		case 1:

			String nombre = Leer.pedirCadena("¿Cual es el nombre del empeado?");

			int dia, mes, anyo;
			Fecha fecha_nacimiento = null, fechaingreso = null;
			Boolean verificador_Fecha = false;
			while (!verificador_Fecha) {
				dia = Leer.pedirEntero("Introduce el dia de su nacimiento: ");
				mes = Leer.pedirEntero("Introduce el mes de su nacimiento: ");
				anyo = Leer.pedirEntero("Introduce el anyo de su nacimiento: ");
				fecha_nacimiento = new Fecha(dia, mes, anyo);
				dia = Leer.pedirEntero("Introduce el dia de su ingreso: ");
				mes = Leer.pedirEntero("Introduce el mes de su ingreso: ");
				anyo = Leer.pedirEntero("Introduce el anyo de su ingreso: ");
				fechaingreso = new Fecha(dia, mes, anyo);
				if (fecha_nacimiento.diasDesde() < fechaingreso.diasDesde()) {
					verificador_Fecha = true;
				} else {
					Leer.mensaje("la edad del trabajador no puede ser mayor a la de su ingreso");
				}
			}

			opcion = Leer.pedirEntero("¿De que tipo es este empleado?\n1. Administrativo \n2. Tecnico \n3. Jefe");
			String departamento = "";
			String especialidad = "";
			Boolean encontrado = false;
			switch (opcion) {
			case 1:
				departamento = Leer.pedirCadena("¿A que departamento pertenece?");
				for (int i = 0; i < empleados.length; i++) {
					if (empleados[i] == null) {
						break;
					}
					if (empleados[i] instanceof Responsable) {
						Leer.mensaje("Jefe " + i + " " + empleados[i].mostrarPlantilla());
					}
				}
				Integer numero = Leer.pedirEntero("¿Cual es su jefe?");

				encontrado = verificadorJefe(empleados, numero, encontrado);
				if (!encontrado) {
					Leer.mensaje("Error en el jefe");
					break;
				}

				empleados[Empleado.getSiguiente() - 1] = new Administrativo(nombre, fecha_nacimiento, fechaingreso,
						departamento, (Responsable) empleados[numero]);
				break;

			case 2:
				especialidad = Leer.pedirCadena("¿En que esta especializado el tecnico?");
				for (int i = 0; i < empleados.length; i++) {
					if (empleados[i] == null) {
						break;
					}
					if (empleados[i] instanceof Responsable) {
						Leer.mensaje(empleados[i].mostrarPlantilla());
					}
				}

				numero = Leer.pedirEntero("¿Cual es su jefe?");
				encontrado = verificadorJefe(empleados, numero, encontrado);
				if (!encontrado) {
					Leer.mensaje("Error en el jefe");
					break;
				}
				float plusEspecialidad=Leer.pedirFloat("De cuanto es su plus de especialidad");
				empleados[Empleado.getSiguiente() - 1] = new Tecnico(nombre, fecha_nacimiento, fechaingreso,
						especialidad, (Responsable) empleados[numero], plusEspecialidad);

				break;
			case 3:
				departamento = Leer.pedirCadena("¿A que departamento pertenece?");

				empleados[Empleado.getSiguiente() - 1] = new Responsable(nombre, fecha_nacimiento, fechaingreso,
						departamento, (float) 100);
				break;
			default:
				break;
			}

			break;
		case 2: // Mostrar plantilla
			for (int i = 0; i < empleados.length; i++) {
				if (empleados[i] == null) {
					break;
				}
				Leer.mensaje(empleados[i].mostrarPlantilla());
				Leer.mensaje("");
			}
			break;
		case 3:
			Leer.mensaje("A que empleado desea calcular su nomina?");
			int fin=0;
			for (int i = 0; i < empleados.length; i++) {
				if (empleados[i] == null) {
					fin=i;
					break;
				}
				Leer.mensaje(i + ". " + empleados[i].getNombre());
			}
			Integer emplNom = Leer.pedirEntero("");
			if (emplNom >= fin) {
				Leer.mensaje("No se ha encontrado ese empleado");
				break;
			}
			
			System.out.println("La nomina del empleado "+empleados[emplNom].getNombre()+" es de: "+empleados[emplNom].calculoNomina());
			
			break;
		case 4:
			float total=0;
			for (int i = 0; i < empleados.length; i++) {
				if (empleados[i] == null) {
					break;
				}
				total=total+empleados[i].calculoNomina();	
				Leer.mensaje("El empleado "+empleados[i].getNombre()+" tiene como nominda: "+empleados[i].calculoNomina());
			}
			System.out.println("La nomina total de la plantilla es: "+total);
			break;
		case 5:
			opcion=Leer.pedirEntero("Que desea modificar? \n1. Salario Base \n2. Plus Responsabilidad \n3. Plus Antiguedad");
			Integer cambio=0;
			float cambioF=0;
			switch (opcion) {
			case 1:
				Leer.mensaje("El salario base actual es "+Empleado.getSalario_base());
				cambioF=Leer.pedirFloat("Por cual desea cambiarlo?");
				Empleado.setSalario_base(cambioF);
				break;
			case 2:
				Leer.mensaje("El Plus Responsabilidad actual es "+Responsable.getPlusresponsabilidad());
				cambio=Leer.pedirEntero("Por cual desea cambiarlo?");
				Responsable.setPlusresponsabilidad(cambio);
				break;
			case 3:
				Leer.mensaje("El Plus Antiguedad actual es "+Administrativo.getPlusAntiguedad());
				cambioF=Leer.pedirFloat("Por cual desea cambiarlo?");
				Administrativo.setPlusAntiguedad(cambioF);
				break;
			default:
				break;
			}
			Leer.mensaje("");
			break;
		default:
			break;
		}

	}

	private static Boolean verificadorJefe(Empleado[] empleados, Integer numero, Boolean encontrado) {
		for (int i = 0; i < empleados.length; i++) {
			if (empleados[i] instanceof Responsable && i == numero) {
				encontrado = true;
			}
		}
		return encontrado;
	}

	public static void base_Datos(Empleado[] empleados) {
		for (int i = 0; i < 2; i++) {
			String nombre = "Jefe " + i;
			String departamento = "Jefe de " + i;
			Fecha fecha_nacimiento = new Fecha(29, 8, 1999);
			Fecha fechaingreso = new Fecha(02, 3, 2004);
			empleados[i] = new Responsable(nombre, fecha_nacimiento, fechaingreso, departamento, (float) 100);
		}
		for (int i = 2; i < 5; i++) {
			String nombre = "Administrativo " + i;
			String departamento = "Administrativo de " + i;
			Fecha fecha_nacimiento = new Fecha(29, 8, 1900+i*4);
			Fecha fechaingreso = new Fecha(02, 3, 2000+i);
			empleados[i] = new Administrativo(nombre, fecha_nacimiento, fechaingreso, departamento,
					(Responsable) empleados[0]);
		}
		for (int i = 5; i < 9; i++) {
			String nombre = "Tecnico " + i;
			String especialidad = "Especialidad de " + i;
			Fecha fecha_nacimiento = new Fecha(29, 8, 1999);
			Fecha fechaingreso = new Fecha(02, 3, 2004);
			empleados[i] = new Tecnico(nombre, fecha_nacimiento, fechaingreso, especialidad,
					(Responsable) empleados[1], ((float) 10*(int) (Math.random()*3)+1 ));
		}

	}
}
