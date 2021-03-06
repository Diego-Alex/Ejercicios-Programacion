/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Nodo {
	private Integer valor;
	private Nodo siguiente;
	
	//Getter y Setters
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	public Nodo getsiguiente() {
		return siguiente;
	}
	public void setsiguiente(Nodo nodo) {
		this.siguiente = nodo;
	}
	
	//Constructor
	public Nodo(Integer valor) {
		this.valor = valor;
		this.siguiente = null;
	}
	
	@Override
	public String toString() {
		String texto="";
		Nodo aux=this.siguiente;
		while (aux!=null){;
			texto="\n"+this.siguiente.toString();
			aux=aux.getsiguiente();
		}
		return "Nodo valor=" + valor + texto;
	}
	
	
}
