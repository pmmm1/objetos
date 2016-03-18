/*2.- Una clase base denominada “Vehiculo_rodante”, tiene como datos 
 * miembro el número de ruedas  y la capacidad de carga en pasajeros, 
 * una clase derivada llamada camión contiene la capacidad de carga, 
 * una segunda clase derivada llamada automóvil tiene como datos el tipo 
 * de automóvil, escribir una función “toString” que despliegue los 
 * datos de cada clase, agregando funciones para acceder a número de ruedas, 
 * a la cantidad de pasajeros y la capacidad de carga de las clases. 
 * En el programa principal defina objetos para las tres clases y active estas funciones.
 */
package practica_3;
import java.util.*;
public class e2 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Ingrese el numero de ruedas: ");
		int ruedas=in.nextInt();
		System.out.println("Ingrese la capacidad de carga del camion: ");
		double carga=in.nextDouble();
		System.out.println("Ingrese el tipo de automovil: ");
		String tipo1=in.nextLine();
		String tipo=in.nextLine();
		System.out.println("Ingrese la capacidad de carga de pasajeros: ");
		int cargap=in.nextInt();
		camion c1=new camion(ruedas,cargap,carga);
		automovil a1=new automovil(ruedas,cargap,tipo);
		System.out.println(c1.toString()+"\n"+a1.toString());
	}

}
