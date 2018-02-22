/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Empleado {
	private String nombre;
	private Fecha fecha_nacimiento;
	private Integer numero_empleado;
	private static Integer siguiente=1;
	private static float Salario_base=(float) 736.70;
	protected Fecha fechaingreso;
	
	//Getter y Setters 
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Fecha getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Fecha fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public Integer getNumero_empleado() {
		return numero_empleado;
	}
	public void setNumero_empleado(Integer numero_empleado) {
		this.numero_empleado = numero_empleado;
	}
	public static Integer getSiguiente() {
		return siguiente;
	}
	public static void setSiguiente(Integer siguiente) {
		Empleado.siguiente = siguiente;
	}
	public static float getSalario_base() {
		return Salario_base;
	}
	public static void setSalario_base(float salario_base) {
		Salario_base = salario_base;
	}
	public Fecha getFechaingreso() {
		return fechaingreso;
	}
	public void setFechaingreso(Fecha fechaingreso) {
		this.fechaingreso = fechaingreso;
	}
	

	//Constructor

	
	public Empleado(String nombre, Fecha fecha_nacimiento, Fecha fechaingreso) {
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.numero_empleado = this.siguiente;
		this.fechaingreso = fechaingreso;
		siguiente++;
	}
	
	//Metodos
	public Integer edadEmpleado(){
		Integer edad;
		Fecha fecha_hoy = new Fecha(16, 02, 2018);
		Integer dias = fecha_nacimiento.difFechas(fecha_hoy);
		edad=dias/365;
		return edad;
	}
	public float calculoNomina(){
		return this.Salario_base;
	}
	
	//MostrarListado
	public String mostrarPlantilla(){
		return("Empleado [nombre=" + nombre + ", fecha_nacimiento=" + fecha_nacimiento + ", numero_empleado="
				+ numero_empleado + ", fechaingreso=" + fechaingreso + "]");
	}
	
}
