package practica_3;
public class ProfesorHoraCatedra extends Docente{
	private int horasAsignadas;
	public ProfesorHoraCatedra(String nombre, String cedula, String dependencia, float calificacion, float salario,int horasAsignadas) {
		super(nombre, cedula, dependencia, calificacion, salario);
		this.horasAsignadas = horasAsignadas;
	}
	public float calcularSalario(){
		return 50*horasAsignadas;
	}
}
