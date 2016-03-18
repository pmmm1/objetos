package practica_3;

public class Lavadora extends Electrodomestico{
	private float carga;
	final float cte=5.00f;
	public Lavadora() {
		carga = cte;
		preciobase=100;
		peso=5;
		color="blanco";
		energia="F";
	}
	public Lavadora(float preciobase, float peso) {
		carga = cte;
		this.preciobase=preciobase;
		this.peso=peso;
		color="blanco";
		energia="F";
	}
	public Lavadora(float preciobase, float peso, String color, String energia,float carga) {
		super(preciobase, peso, color, energia);
		this.carga = carga;
	}
	public float getCarga() {
		return carga;
	}
	public void setCarga(float carga) {
		this.carga = carga;
	}
	public float precioFinal(){
		return (carga>30)?(super.precioFinal()+50.00f):super.precioFinal();
	}
}
