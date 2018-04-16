import java.util.TreeMap;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer opcion = 9;
		TreeMap<String, String> listaUsuarios = new TreeMap<String, String>();

		while (opcion != 0) {

			Leer.mensaje("1. Insertar Usuario");
			Leer.mensaje("2. Borrar Usuario");
			Leer.mensaje("3. Modificar Claves");
			Leer.mensaje("4. Validar Usuario");
			opcion = Leer.pedirEntero("0. Salir");
			menu(opcion, listaUsuarios);
			Leer.mensaje("");
		}
	}

	private static void menu(Integer opcion, TreeMap<String, String> listaUsuarios) {
		String usuario, contraseña, contraCodificado="";
		String caracteresValidos = "QWERTYUIOPLKJHGFDSAZXCVBNMqwertyuioplkjhgfdsazxcvbnm1234567890";
		Boolean verificador = false;
		switch (opcion) {
		case 1:
			usuario = Leer.pedirCadena("Introduzca el nombre de usuario");
			
			if (listaUsuarios.get(0) != null) {
				while (!verificador) {
					if (!listaUsuarios.containsKey(usuario)) {
						verificador = true;
					} else {
						usuario=Leer.pedirCadena("Usuario existente, Por favor vuelva a introducir un nuevo nombre de usuario");
					}
				}
			}
			
			verificador = false;
			contraseña = Leer.pedirCadena("Introduzca su contraseña");
			while (!verificador) {
				for (int i = 0; i < contraseña.length(); i++) {
					if (caracteresValidos.indexOf(contraseña.substring(i, i + 1)) == -1) {
						verificador = true;
					} else {
						verificador = false;
						break;
					}
				}
				if (!verificador) {
					contraseña = Leer.pedirCadena("Contraseña incorrecta, vuelva a introducir una nueva contraseña");
				}
			}
			
			for (int i = 0; i < contraseña.length(); i++) {
				contraCodificado=contraCodificado+(contraseña.substring(i,i+1));
				
				
				
			}
			break;
		case 2:

			break;
		case 3:

			break;
		case 4:

			break;
		default:
			break;
		}
	}

}
