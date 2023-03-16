package segunda_actividad;
import java.util.*;
public class capitulo4_actividad10 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int numeroinsc,estracto;
		double patrimonio,pago;
		String nombre;
		System.out.println("Ingrese el numero de inscripcion:");
		numeroinsc=entrada.nextInt();
		System.out.println("Ingrese el PRIMER nombre:");
		nombre=entrada.next();
		System.out.println("Ingrese el patrimonio:");
		patrimonio=entrada.nextDouble();
		System.out.println("Ingrese el estracto social:");
		estracto=entrada.nextInt();
		if(patrimonio>2000000 && estracto>3 ) {
			pago=50000+0.03*patrimonio;
		}
		else {
			pago=50000;
		}
		System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION "+ numeroinsc+" Y NOMBRE "+nombre+" DEBE PAGAR "+pago);
		
		
		
	
	}

}
