package practica_3;
public class RecursosHumanos extends Administrativo{
	private String tipo;
	public RecursosHumanos(String nombre, String cedula, String dependencia, float salarioBase, String tipo) {
		super(nombre, cedula, dependencia, salarioBase);
		this.tipo = tipo;
	}
	public float calcularSalario(){
		return (tipo=="tesoreria")?(6000):(5700);
	}
}
