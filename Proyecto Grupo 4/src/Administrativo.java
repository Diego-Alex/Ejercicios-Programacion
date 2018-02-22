/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Administrativo extends Empleado {
	private static float plusAntiguedad=20;
	private String departamento;
	private Responsable jefe;
	
	//Getters y Setters
	
	public static float getPlusAntiguedad() {
		return plusAntiguedad;
	}
	public static void setPlusAntiguedad(float plusAntiguedad) {
		Administrativo.plusAntiguedad = plusAntiguedad;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public Responsable getJefe() {
		return jefe;
	}
	public void setJefe(Responsable jefe) {
		this.jefe = jefe;
	}
	
	//Constructor
	public Administrativo(String nombre, Fecha fecha_nacimiento, Fecha fechaingreso, String departamento, Responsable jefe) {
		super(nombre, fecha_nacimiento, fechaingreso);
		this.departamento = departamento;
		this.jefe = jefe;
		jefe.personasacargo();
	}
	
	public float calculoNomina(){
		Fecha fecha_hoy = new Fecha(16, 02, 2018);
		Integer dias = fechaingreso.difFechas(fecha_hoy);
		float nomina=super.calculoNomina();
		nomina=nomina+(plusAntiguedad*(dias/365));
		return nomina;
	}
	
	//MostrarListado
	public String mostrarPlantilla(){
		
		return(super.mostrarPlantilla()+"\nAdministrativo [departamento=" + departamento + ", \njefe=" + jefe.getNombre() + "]");
	}
	
}
