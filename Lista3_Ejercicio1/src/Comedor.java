import java.util.TreeMap;

import javax.swing.RowFilter.Entry;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Comedor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> ingredientes=bIngredientes();
		
		mostrar_ingredientes(ingredientes);
		Leer.mensaje("");
		TreeMap<String, TreeMap<String, Integer>> platos=bPlatos(ingredientes);
		
		mostrar_plato(platos);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	private static void mostrar_ingredientes(TreeMap<String, Integer> ingredientes){
		for (java.util.Map.Entry<String, Integer> ingre : ingredientes.entrySet()) {
			Leer.mensaje("Ingrediente: "+ingre.getKey()+"\tPrecio: "+ingre.getValue());
		}
	}
	
	private static void mostrar_plato( TreeMap<String, TreeMap<String, Integer>> platos){
		for (java.util.Map.Entry<String, TreeMap<String, Integer>> plato : platos.entrySet()) {
			Leer.mensaje(plato.getKey()+"\tPrecio: "+precio_total(plato.getValue()));
			Leer.mensaje("Ingredientes:");
			mostrar_ingredientes(plato.getValue());
			Leer.mensaje("\t\t");
		}
	}
	
	private static Integer precio_total(TreeMap<String, Integer> ingredientes){
		Integer precio=0;
		for (java.util.Map.Entry<String, Integer> ingre : ingredientes.entrySet()) {
			precio=precio+ingre.getValue();
		}
		return precio;
	}
	
	private static TreeMap<String, Integer> bIngredientes(){
		TreeMap<String, Integer> ingredientes= new TreeMap<>();
		ingredientes.put("Ingre 7", 5);
		ingredientes.put("Ingre 10", 10);
		ingredientes.put("Ingre 6", 9);
		ingredientes.put("Ingre 9", 3);
		ingredientes.put("Ingre 5", 6);
		return ingredientes;
	}
	
	private static TreeMap<String, TreeMap<String, Integer>> bPlatos(TreeMap<String, Integer> ingredientes){
		TreeMap<String, TreeMap<String, Integer>> platos= new TreeMap<>();
		TreeMap <String, Integer> ingredientesplato=new TreeMap<>();
		ingredientesplato.put("Ingre 10", ingredientes.get("Ingre 10"));
		ingredientesplato.put("Ingre 7", ingredientes.get("Ingre 7"));
		platos.put("Plato 5", ingredientesplato);
		
		ingredientesplato=new TreeMap<>();
		ingredientesplato.put("Ingre 5", ingredientes.get("Ingre 5"));
		ingredientesplato.put("Ingre 7", ingredientes.get("Ingre 7"));
		platos.put("Plato 2", ingredientesplato);
		
		ingredientesplato=new TreeMap<>();
		ingredientesplato.put("Ingre 5", ingredientes.get("Ingre 5"));
		ingredientesplato.put("Ingre 6", ingredientes.get("Ingre 6"));
		platos.put("Plato 3", ingredientesplato);
		
		ingredientesplato=new TreeMap<>();
		ingredientesplato.put("Ingre 5", ingredientes.get("Ingre 5"));
		ingredientesplato.put("Ingre 10", ingredientes.get("Ingre 10"));
		platos.put("Plato 1", ingredientesplato);
		
		ingredientesplato=new TreeMap<>();
		ingredientesplato.put("Ingre 9", ingredientes.get("Ingre 9"));
		ingredientesplato.put("Ingre 7", ingredientes.get("Ingre 7"));
		platos.put("Plato 6", ingredientesplato);
		
		ingredientesplato=new TreeMap<>();
		ingredientesplato.put("Ingre 10", ingredientes.get("Ingre 10"));
		ingredientesplato.put("Ingre 9", ingredientes.get("Ingre 9"));
		platos.put("Plato 4", ingredientesplato);
		
		return platos;
	}
}
