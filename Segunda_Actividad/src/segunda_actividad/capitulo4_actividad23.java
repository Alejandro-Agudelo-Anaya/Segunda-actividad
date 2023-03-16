package segunda_actividad;
import java.util.*;
public class capitulo4_actividad23 {

	public static void main(String[] args) {
		double A,B,C;
		Scanner entrada= new Scanner(System.in);
		System.out.println("Tenemos la siguiente ecuacion AX^2+BX+C");
		System.out.println("Ingrese el valor de A");
		A=entrada.nextDouble();
		System.out.println("Ingrese el valor de B");
		B=entrada.nextDouble();
		System.out.println("Ingrese el valor de C");
		C=entrada.nextDouble();
		double raiz=(B*B)-4*A*C;
		if(raiz>0) {
			double x1=((-B+Math.sqrt(raiz))/(2*A));
			double x2=((-B-Math.sqrt(raiz))/(2*A));
			System.out.println("La ecuación tiene dos soluciones: " + x1 + " y " + x2);
			
			
		}
		else if(raiz==0) {
			double x=-B/(2*A);
			System.out.println("La ecuación tiene una solución: " + x);
		}
		else {
			System.out.println("La ecuación tiene no tiene solución real ");
		}

	}

}
