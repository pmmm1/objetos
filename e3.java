package practica_3;
public class e3 {
	public static void main(String[] args) {
		float e=0,t=0,l=0;
		Electrodomestico d[]=new Electrodomestico[10];
		d[0]=new Lavadora();
		d[1]=new Lavadora(150.0f,45);
		d[2]=new Lavadora(118,34,"negro","D",15.0f);
		d[3]=new Lavadora(116,20,"amarillo","Y",15.0f);
		d[7]=new Electrodomestico();
		d[8]=new Electrodomestico(200,38);
		d[9]=new Electrodomestico(130,60,"gris","A");
		d[4]=new Television();
		d[5]=new Television(300,10);
		d[6]=new Television(320,9,"negro","C",50,true);
		for(int i=0;i<=9;i++){
			System.out.println((i+1)+" - "+d[i].precioFinal()+"$us");
			if(i<=3)l+=d[i].precioFinal();
			if(i>=4 && i<=6)t+=d[i].precioFinal();
			e+=d[i].precioFinal();
			if(i==3)System.out.println("Precio total lavadoras:	"+l+"$us");
			if(i==6)System.out.println("Precio total televisores:  "+t+"$us");
		}
		System.out.println("Precio total electrodomesticos:	"+e+"$us");
	}
}
