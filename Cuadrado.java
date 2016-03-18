package practica_3;
public class Cuadrado {
	protected double lado;
	public Cuadrado(double lado) {
		this.lado = lado;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double superficie(){
		return lado*lado;
	}
	public static void main(String[] args) {
		
	}

}
