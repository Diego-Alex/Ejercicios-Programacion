import java.security.KeyStore.Entry;
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

		while (opcion > 0) {

			Leer.mensaje("1. Insertar Usuario");
			Leer.mensaje("2. Borrar Usuario");
			Leer.mensaje("3. Modificar Claves");
			Leer.mensaje("4. Validar Usuario");
			opcion = Leer.pedirEntero("0. Salir");

			if (listaUsuarios.isEmpty() && (opcion == 2 || opcion == 3 || opcion == 4)) {
				Leer.mensaje("Actualmente no se ha insertado ningun usuario, porfavor, primero inserta algun usuario");
			} else {
				menu(opcion, listaUsuarios);
				Leer.mensaje("");
			}

		}
	}

	// Metodo Menu
	private static void menu(Integer opcion, TreeMap<String, String> listaUsuarios) {
		Boolean verificador = false;
		switch (opcion) {
		case 1:
			anadirUsuario(listaUsuarios, verificador, opcion);
			break;
		case 2:
			borrarUsuario(listaUsuarios, verificador, opcion);
			break;
		case 3:
			modificarContra(listaUsuarios, verificador, opcion);
			break;
		case 4:
			verificarUsuario(listaUsuarios, verificador, opcion);
			break;
		case 5:
			mostrarUsuarios(listaUsuarios);
			break;
		default:
			opcion--;
			break;
		}
	}

	// Metodos Principales
	private static void anadirUsuario(TreeMap<String, String> listaUsuarios, Boolean verificador, Integer opcion) {
		String usuario, contraseña, contraCodificado = "";

		usuario = Leer.pedirCadena("Introduzca el nombre de usuario");

		usuario = verificarExistenciaUsuario(listaUsuarios, verificador, usuario, opcion);

		contraseña = verificadorContra();
		contraCodificado = codificadorContra(contraseña);

		listaUsuarios.put(usuario, contraCodificado);
	}

	private static void borrarUsuario(TreeMap<String, String> listaUsuarios, Boolean verificador, Integer opcion) {
		String usuario;
		usuario = Leer.pedirCadena("Que usuario desea borrar?");
		usuario = verificarExistenciaUsuario(listaUsuarios, verificador, usuario, opcion);

		verificadorContraUsuario(listaUsuarios, usuario, opcion);

		listaUsuarios.remove(usuario);
	}

	private static void modificarContra(TreeMap<String, String> listaUsuarios, Boolean verificador, Integer opcion) {
		String usuario, contraseña, contraCodificado = "";

		usuario = Leer.pedirCadena("Que usuario desea modificar?");
		usuario = verificarExistenciaUsuario(listaUsuarios, verificador, usuario, opcion);

		verificadorContraUsuario(listaUsuarios, usuario, opcion);

		String newContra = Leer.pedirCadena("Cual es la nueva contraseña de " + usuario);
		String newCodificado = codificadorContra(newContra);

		while (!verificador) {
			if (listaUsuarios.get(usuario).equals(newCodificado)) {
				newContra = Leer.pedirCadena("La contraseña es la misma, por favor introduzca una nueva contraseña");
				newCodificado = codificadorContra(newContra);
			} else {
				verificador = true;
			}
		}
		listaUsuarios.put(usuario, newCodificado);
	}

	private static void verificarUsuario(TreeMap<String, String> listaUsuarios, Boolean verificador, Integer opcion) {
		String usuario;
		usuario = Leer.pedirCadena("Introduzca el nombre del usuario");
		usuario = verificarExistenciaUsuario(listaUsuarios, verificador, usuario, opcion);
		verificadorContraUsuario(listaUsuarios, usuario, opcion);
	}

	// Metodo extra
	private static void mostrarUsuarios(TreeMap<String, String> listaUsuarios) {
		for (java.util.Map.Entry<String, String> usuario : listaUsuarios.entrySet()) {
			Leer.mensaje(usuario.getKey() + " " + usuario.getValue());
		}
	}
	
	// Metodos Reutilizables

	private static String codificadorContra(String contraseña) {
		String contraCodificado = "";
		int num;
		char codigo;
		for (int i = 0; i < contraseña.length(); i++) {
			num = contraseña.codePointAt(i) + 2;
			codigo = (char) num;
			contraCodificado = contraCodificado + codigo;
		}
		return contraCodificado;
	}

	private static String verificadorContra() {
		String CARACTERESVALIDOS = "QWERTYUIOPLKJHGFDSAZXCVBNMqwertyuioplkjhgfdsazxcvbnm1234567890";
		Boolean verificador;
		String contraseña;
		verificador = false;
		contraseña = Leer.pedirCadena("Introduzca su contraseña");
		while (!verificador) {
			for (int i = 0; i < contraseña.length(); i++) {
				if (CARACTERESVALIDOS.indexOf(contraseña.substring(i, i + 1)) != -1) {
					verificador = true;
				} else {
					verificador = false;
					break;
				}
			}
			if (!verificador) {
				contraseña = Leer.pedirCadena("Valores incorrectos, vuelva a introducir una nueva contraseña");
			}
		}
		return contraseña;
	}

	private static String verificarExistenciaUsuario(TreeMap<String, String> listaUsuarios, Boolean verificador,
			String usuario, Integer opcion) {
		if (!(listaUsuarios.isEmpty())) {
			while (!verificador) {
				if (listaUsuarios.containsKey(usuario) && opcion == 1) {
					usuario = Leer.pedirCadena("Usuario existente, Por favor vuelva a introducir un usuario");
					verificador = false;

				} else if (listaUsuarios.containsKey(usuario)) {
					verificador = true;
				} else {
					usuario = Leer.pedirCadena(
							"Usuario inexistente, Por favor vuelva a introducir un nuevo nombre de usuario");
				}
			}
		}
		return usuario;
	}

	private static void verificadorContraUsuario(TreeMap<String, String> listaUsuarios, String usuario,
			Integer opcion) {
		String contraCodificado = "";
		Boolean verificador;
		String contraseña;
		verificador = false;
		while (!verificador) {
			contraseña = verificadorContra();
			contraCodificado = codificadorContra(contraseña);
			if (contraCodificado.equals(listaUsuarios.get(usuario))) {
				if (opcion == 2) {
					Leer.mensaje("Usuario eliminado");
					verificador = true;
				} else {
					Leer.mensaje("Usuario validado");
					verificador = true;
				}

			} else {
				Leer.mensaje("Contraseña incorrecta");
				contraCodificado = "";
			}
		}
	}

}
