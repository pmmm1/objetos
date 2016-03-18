package practica_3;
public class automovil extends Vehiculo_rodante{
	private String tipo;
	public automovil(int ruedas, int cargap, String tipo) {
		super(ruedas, cargap);
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String toString(){
		return "Automovil:\nTipo de automovil:\t"+tipo+"\nCapacidad de carga de pasajeros:\t"+cargap+"\n";
	}
}