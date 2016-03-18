package practica_3;
public class Docente extends Empleado{
	protected float calificacion,salario;
	public Docente(String nombre, String cedula, String dependencia, float calificacion, float salario) {
		super(nombre, cedula, dependencia);
		this.calificacion = calificacion;
		this.salario = salario;
	}
	public float calcularSalario(){
		return 0;
	}
}
