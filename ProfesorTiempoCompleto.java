package practica_3;
import java.util.Scanner;
public class ProfesorTiempoCompleto extends Docente{
	private int horas;
	public ProfesorTiempoCompleto(String nombre, String cedula, String dependencia, float calificacion, float salario,int horas) {
		super(nombre, cedula, dependencia, calificacion, salario);
		this.horas = horas;
	}
	public float calcularSalario(){
		Scanner in=new Scanner(System.in);
		System.out.println("Nivel de estudio:\n1.Pregrado\n2.Maestria\n3.Doctorado\nOpcion:");
		int o=in.nextInt();
		switch(o){
		case 1:return (calificacion>4.5)?12000.0f:10000.0f;
		case 2:return (calificacion>4.5)?20000.0f:18000.0f;
		case 3:return (calificacion>4.5)?27000.0f:25000.0f;
		default: System.out.println("Esta opcion no existe"); 
		}
		return 0;
	}
}
