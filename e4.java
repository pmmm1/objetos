package practica_3;
import java.util.Scanner;
public class e4 {
	public static void main(String[] args) {
		String nombre,dependencia,cedula,tipo;
		float calificacion,st;
		int hi;
		Scanner in=new Scanner(System.in);
		System.out.println("Ingrese el nombre: ");
		nombre=in.nextLine();
		System.out.println("Ingrese el CI: ");
		cedula=in.nextLine();
		System.out.println("Ingrese la dependencia: ");
		dependencia=in.nextLine();
		System.out.println("Elija una opcion:\n1.Docente\n2.Administrativo\nOpcion:");
		int o=in.nextInt();
		if(o==1){
			System.out.println("Ingrese la calificacion del docente: ");
			calificacion=in.nextFloat();
			System.out.println("Elija una opcion:\n1.Docente Tiempo Completo\n2.Docente Horas Catedra\nOpcion:");
			int o1=in.nextInt();
			if(o1==1){
				System.out.println("Ingrese las horas de investigacion: ");
				hi=in.nextInt();
				ProfesorTiempoCompleto p1=new ProfesorTiempoCompleto(nombre,cedula,dependencia,calificacion,0,hi);
				st=p1.calcularSalario();
			}else{
				System.out.println("Ingrese la cantidad de horas  asignadas:");
				hi=in.nextInt();
				ProfesorHoraCatedra p1=new ProfesorHoraCatedra(nombre,cedula,dependencia,calificacion,0,hi);
				st=p1.calcularSalario();
			}
		}
		else{
			System.out.println("Elija una opcion:\n1.Recursos Humanos\n2.Mantenimiento\nOpcion:");
			int o1=in.nextInt();
			if(o1==1){
				System.out.println("Elja una opcion:\n1.Tesoreria\n2.Secretaria\nOpcion:");
				int o3=in.nextInt();
				RecursosHumanos a1=new RecursosHumanos(nombre,cedula,dependencia,5000,((o3==1)?"tesoreria":"secretaria"));
				st=a1.calcularSalario();
			}else{
				System.out.println("Ingrese la cantidad de horas extra:");
				hi=in.nextInt();
				Mantenimiento a1=new Mantenimiento(nombre,cedula,dependencia,5000,hi);
				st=a1.calcularSalario();
			}
		}
		System.out.println(nombre+"\n"+cedula+"\n"+dependencia+"\n"+"Salario: "+st+" Bs.");
	}
}
