/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Tecnico extends Empleado {
	private String especialidad;
	private Float plusEspecialidad;
	private Responsable jefe;

	// Getters y Setters
	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public Float getPlusEspecialidad() {
		return plusEspecialidad;
	}

	public void setPlusEspecialidad(Float plusEspecialidad) {
		this.plusEspecialidad = plusEspecialidad;
	}

	public Responsable getJefe() {
		return jefe;
	}

	public void setJefe(Responsable jefe) {
		this.jefe = jefe;
	}

	// Constructor
	public Tecnico(String nombre, Fecha fecha_nacimiento, Fecha fechaingreso, String especialidad, Responsable jefe) {
		super(nombre, fecha_nacimiento, fechaingreso);
		this.especialidad = especialidad;
		this.plusEspecialidad = (float) 30;
		this.jefe = jefe;
		jefe.personasacargo();
	}

	public float calculoNomina() {
		float nomina = super.calculoNomina();
		nomina = nomina + plusEspecialidad;
		return nomina;
	}

	// MostrarListado
	public String mostrarPlantilla() {
		return (super.mostrarPlantilla() + "\nTecnico [especialidad=" + especialidad + ", plusEspecialidad="
				+ plusEspecialidad + ",\njefe=" + jefe.getNombre() + "]");
	}

}
