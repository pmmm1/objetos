package practica_3;

public class Mantenimiento extends Administrativo{
	private 
	String SalonesAsignados[]=new String[200];
	int HorasExtra;
	public Mantenimiento(String nombre, String cedula, String dependencia, float SalarioBase,int HorasExtra) {
		super(nombre, cedula, dependencia, SalarioBase);
		this.HorasExtra = HorasExtra;
	}
	public float calcularSalario(){
		return 5000+(HorasExtra*40);
	}
}
