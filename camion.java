package practica_3;
public class camion extends Vehiculo_rodante {
	private double carga;
	public camion(int ruedas, int cargap, double carga) {
		super(ruedas, cargap);
		this.carga = carga;
	}
	public double getCarga() {
		return carga;
	}
	public void setCarga(double carga) {
		this.carga = carga;
	}
	public String toString(){
		return "Camion:\nNumero de ruedas:\t"+ruedas+"\nCapacidad de carga:\t"+carga+" kg\n";
	}
	
}