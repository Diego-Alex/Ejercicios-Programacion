/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Jefes extends Empleados{
	public String titulo;
	public String departamento;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public Jefes(String nombre, Integer saldo, String titulo, String departamento) {
		super(nombre, saldo);
		this.titulo = titulo;
		this.departamento = departamento;
	}
	public void mostrardatos(){
		super.mostrardatos();
		System.out.print("Posee el titulo "+titulo);
		System.out.println(", es el jefe del departamento "+departamento);
	}
}
