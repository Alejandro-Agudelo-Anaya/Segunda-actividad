package segunda_actividad;
import java.util.*;
public class capitulo4_actividad11 {

	public static void main(String[] args) {
		double a,b,c;
		Scanner entrada= new Scanner(System.in);
		System.out.println("ingresa 3 numeros distintos");
		System.out.println("ingresa el primer numero: ");
		a=entrada.nextDouble();
		System.out.println("ingresa el segundo numero: ");
		b=entrada.nextDouble();
		System.out.println("ingresa el tercero numero: ");
		c=entrada.nextDouble();
		if(a>b && a>c){
			System.out.println("el primer numero es mayor: "+a);		
		}
		else if(b>a &&b>c) {
			System.out.println("el segundo numero es mayor: "+b);
			
		}
		else {
			System.out.println("el tercer numero es mayor: "+c);
		}
		
		

	}

}
