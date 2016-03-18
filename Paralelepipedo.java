package practica_3;

public class Paralelepipedo extends Cuadrado{
	private double altura;
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public Paralelepipedo(double lado, double altura) {
		super(lado);
		this.altura = altura;
	}
	public double superficie(){
		return 4*lado*altura+2*lado*lado;
	}
	public double volumen(){
		return lado*lado*altura;
	}
}
