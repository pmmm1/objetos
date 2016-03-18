package practica_3;
public class Television extends Electrodomestico{
	private 
	float resolucion;
	boolean TDT;
	public Television() {
		resolucion = 20.0f;
		TDT = false;
		preciobase=100;
		peso=5;
		color="blanco";
		energia="F";
	}
	public Television(float preciobase, float peso) {
		resolucion = 20.0f;
		TDT = false;
		this.preciobase=preciobase;
		this.peso=peso;
		color="blanco";
		energia="F";
	}
	public Television(float preciobase, float peso, String color, String energia,float resolucion, boolean TDT) {
		super(preciobase, peso, color, energia);
		resolucion = 20.0f;
		TDT = false;
	}
	public float getResolucion() {
		return resolucion;
	}
	public void setResolucion(float resolucion) {
		this.resolucion = resolucion;
	}
	public boolean isTDT() {
		return TDT;
	}
	public void setTDT(boolean tDT) {
		TDT = tDT;
	}
	public float precioFinal(){
		float t=super.precioFinal();
		return ((resolucion>40)?(t+t*0.3f):t)+((TDT==true)?50:0);
	}
}
