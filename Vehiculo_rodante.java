package practica_3;
public class Vehiculo_rodante {
	protected int ruedas, cargap;
	public Vehiculo_rodante(int ruedas, int cargap) {
		this.ruedas = ruedas;
		this.cargap = cargap;
	}
	public int getRuedas() {
		return ruedas;
	}
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	public int getCargap() {
		return cargap;
	}
	public void setCargap(int cargap) {
		this.cargap = cargap;
	}
}
