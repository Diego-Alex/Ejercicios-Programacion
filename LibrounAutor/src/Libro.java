/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Libro implements Comentable, Comparable{
	public String numero;
	public String titulo;
	public Autor autor;
	public Double precio;
	public Integer cantidad = 0;
	public static Integer siguiente = 1;
	public static Integer numLibros = 1;
	public String reseña;
	
	
	
	
	
	
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public static Integer getSiguiente() {
		return siguiente;
	}

	public static void setSiguiente(Integer siguiente) {
		Libro.siguiente = siguiente;
	}

	public String getReseña() {
		return reseña;
	}

	public void setReseña(String reseña) {
		this.reseña = reseña;
	}

	@Override
	public String toString() {
		return "Libro [numero=" + numero + ", titulo=" + titulo +" " +autor.toString() + ", \nprecio=" + precio
				+ ", cantidad=" + cantidad + "]\n";
	}

	public Libro(String titulo, Autor autor, Double precio, Integer cantidad) {
		String num = "0000" + numLibros;
		this.numero = num.substring(num.length() - 3);
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.cantidad = cantidad;
		siguiente++;
		numLibros++;
	}

	public Libro crearLibro(String titulo, Autor autor, double precio, Integer cantidad) {
		Libro libroNEW = null;
		libroNEW = new Libro(titulo, autor, precio, cantidad);
		return libroNEW;
	}

	public void modificarlibrotitulo(String newTitulo) {
		String texto = "";
		if (newTitulo.equals(this.titulo)) {
			Leer.mensaje("Lo sentimos, ese titulo es igual, no se ha cambiado");
		} else {
			Leer.mensaje("Se ha modificado el titulo del libro " + this.numero + " cuyo nombre era " + "\""
					+ this.titulo + "\" y se ha cambiado por \"" + newTitulo + "\"");
			this.titulo = newTitulo;
		}
	}

	public String modificarlibroautores(Autor autores2) {
		autor=autores2;		
		return "El autor se ha modificado correctamente";
	}

	public void modificarlibroprecio(Double newPrecio) {
		Leer.mensaje("Se ha modificado el precio del libro " + this.numero + " que anteriormente era \"" + this.precio
				+ "\" y se ha cambiado por \"" + newPrecio + "\"");
		this.precio = newPrecio + 0.0;
	}

	public void modificarlibrocantidad(Integer newCant) {
		Leer.mensaje("Se ha modificado la cantidad del libro " + this.numero + " de \"" + this.cantidad + "\" por \""
				+ newCant + "\"");
		this.cantidad = newCant;
	}

	public void eliminarAutor(Autor autor2) {
		if (autor==autor2) {
			autor=null;
		}
	}

	@Override
	public void comentar(String comentario) {
		// TODO Auto-generated method stub
		this.reseña=comentario;
		
	}

	@Override
	public String comentar() {
		// TODO Auto-generated method stub
		return "Titulo: "+this.titulo+"\nReseña: "+this.reseña;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Integer opcion=0;
		if (o instanceof Libro) {
			Libro a=(Libro) o;
			opcion=this.titulo.toUpperCase().compareTo(a.getTitulo().toUpperCase());
		} else {
			Autor a=(Autor) o;
			opcion=this.titulo.toUpperCase().compareTo(a.getNombre().toUpperCase());
		}
		return opcion;
	}
}