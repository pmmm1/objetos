package practica_3;

public class Electrodomestico {
	protected 
	float preciobase,peso;
	String color,energia;
	public Electrodomestico() {
		preciobase = 100;
		peso = 5;
		color ="blanco";
		energia ="F";
	}
	public Electrodomestico(float preciobase, float peso){
		this.preciobase=preciobase;
		this.peso=peso;
		color ="blanco";
		energia ="F";
	}
	public Electrodomestico(float preciobase, float peso, String color, String energia) {
		this.preciobase = preciobase;
		this.peso = peso;
		this.color = color;
		this.energia = energia;
	}
	public float getPreciobase() {
		return preciobase;
	}
	public void setPreciobase(float preciobase) {
		this.preciobase = preciobase;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getEnergia() {
		return energia;
	}
	public void setEnergia(String energia) {
		this.energia = energia;
	}
	public char ComprobarConsumoEnergetico(char a){
		return (a=='A' || a=='B' ||a=='C' ||a=='D' ||a=='E' ||a=='F')?a:'F';
	}
	public String ComprobarColor(String c){
		return (c=="blanco" ||  c=="negro" ||  c=="rojo" || c=="azul" || c=="gris")?c:"blanco";
	}
	public float precioFinal(){
		float r=preciobase;
		if(energia=="A")r+=100;
		if(energia=="B")r+=80;
		if(energia=="C")r+=60;
		if(energia=="D")r+=50;
		if(energia=="E")r+=30;
		if(energia=="F")r+=10;
		if(peso>0 && peso<=19)r+=10;
		if(peso>20 && peso<=49)r+=50;
		if(peso>50 && peso<=79)r+=80;
		if(peso>80)r+=100;
		return r;
	}
}
