/**
 * 
 */

/**
 * @author usuario
 *
 */
public class GestionarListas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista lista=new Lista ();
		
		lista.añadirnodo(2);
		
		Leer.mensaje(lista.listar());
		Leer.mensaje("");
		lista.añadirnodo(5);
		lista.añadirnodo(6);
		lista.añadirnodo(7);
		lista.añadirnodo(1);
		lista.añadirnodo(5);
		lista.añadirnodo(7);
		lista.añadirnodo(6);
		
		
		Leer.mensaje(lista.listar());
		Leer.mensaje("");
		Integer valor=Leer.pedirEntero("Introduce que numeros desea borrar en la lista");
		if (!lista.buscadorNodo(valor)) {
			Leer.mensaje("No esta");
		} else {
				while (lista.buscadorNodo(valor)) {
					Leer.mensaje(lista.borrarnodo(valor));
				}
		}		
		Leer.mensaje("");
		Leer.mensaje(lista.listar());
		
	}

}
