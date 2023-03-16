package segunda_actividad;
import java.util.*;
public class capitulo4_actividad7 {

	public static void main(String[] args) {
		double A,B;
		Scanner entrada= new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		A=entrada.nextInt();
		System.out.println("Ingrese el segundo numero");
		B=entrada.nextInt();
		if(A>B) {
			System.out.println("el primer numero es mayor");
		}
		else if(A<B) {
			System.out.println("el segundo numero es mayor");
			
		}
		else {
			System.out.println("los numeros son iguales");
			
		}
		
			
		

	}

}
