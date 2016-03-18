/*1.-  Sea la siguiente clase base:	
		Cuadrado:
		         lado (tipo real)
      y la clase derivada:
		Paralelepido:
			altura (tipo real)
Escriba los constructores de inicialización respectivos, funciones “getters”, 
una función que encuentre la superficie de cada clase y una función de salida 
que calcule el volumen del paralelepípedo.
*/
package practica_3;
import java.util.Scanner;
public class e1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Ingrese el lado: ");
		double l=in.nextDouble();
		System.out.println("Ingrese la altura: ");
		double h=in.nextDouble();
		Cuadrado c1=new Cuadrado(l);
		Paralelepipedo p1=new Paralelepipedo(l,h);
		System.out.println("Superficies:\nCuadrado:\t"+c1.superficie()+" u\nParalelepipedo:\t"+p1.superficie()+" u \nVolumen del paralelepipedo:\t"+p1.volumen()+" u2");
	}

}
