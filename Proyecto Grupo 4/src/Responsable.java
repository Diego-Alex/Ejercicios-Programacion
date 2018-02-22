/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Responsable extends Empleado {
	private float bono;
	private String departamento;
	private Integer personas_acargo;
	private static float plusresponsabilidad=100;
	
	//Getters y Setters

	public float getBono() {
		return bono;
	}
	public void setBono(float bono) {
		this.bono = bono;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public Integer getPersonas_acargo() {
		return personas_acargo;
	}
	public void setPersonas_acargo(Integer personas_acargo) {
		this.personas_acargo = personas_acargo;
	}
	public static float getPlusresponsabilidad() {
		return plusresponsabilidad;
	}
	public static void setPlusresponsabilidad(float plusresponsabilidad) {
		Responsable.plusresponsabilidad = plusresponsabilidad;
	}

	
	//Constructor
	
	public Responsable(String nombre, Fecha fecha_nacimiento, Fecha fechaingreso, String departamento, float bono) {
		super(nombre, fecha_nacimiento, fechaingreso);
		this.departamento = departamento;
		this.personas_acargo = 0;
		this.bono = bono;
	} 
	
	//Metodos
	public void personasacargo(){
		this.personas_acargo++;
	}
	
	public float calculoNomina(){
		float nomina=super.calculoNomina();
		nomina=nomina+bono+(plusresponsabilidad*personas_acargo);
		return nomina;
	}
	
	//MostrarListado
	public String mostrarPlantilla(){
		return(super.mostrarPlantilla()+"\nResponsable [bono=" + bono + ", departamento=" + departamento + ", personas_acargo=" + personas_acargo
				+ "]");
	}
	
}
