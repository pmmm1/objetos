package practica_3;
public class Administrativo extends Empleado{
	protected float SalarioBase;
	public Administrativo(String nombre, String cedula, String dependencia, float SalarioBase) {
		super(nombre, cedula, dependencia);
		SalarioBase =5000;
	}
	public float calcularSalario(){
		return SalarioBase;
	}
}
