package segunda_actividad;
import java.util.*;
public class punto_18 {

	public static void main(String[] args) {
		double horastraba,valorhora,retefuentes;
		int codigoE;
		String nombre;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingrese el nombre del empleado:");
		nombre=entrada.nextLine();
		System.out.println("Ingrese el nombre el codigo del empleado:");
		codigoE=entrada.nextInt();
		System.out.println("Ingrese las horas trabajadas en el mes");
		horastraba=entrada.nextDouble();
		System.out.println("Ingrese valor de la hora");
		valorhora=entrada.nextDouble();
		System.out.println("Ingrese porcentaje de retencion de fuente");
		retefuentes=entrada.nextDouble();
		
		double salariobruto=horastraba*valorhora;
		double retiene=(retefuentes*salariobruto)/100;
		double salarioneto=salariobruto-retiene;
		
		System.out.println("El empleado "+nombre+" con codigo "+codigoE+" trabajo las siguientes horas: "+horastraba);
		System.out.println("tiene un salario bruto de: "+salariobruto+" y su salario neto es: "+salarioneto);
		
		
	}

}
