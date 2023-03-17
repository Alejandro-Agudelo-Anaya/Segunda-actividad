import java.util.Scanner;
public class Inicio {
    
	public static void main(String[] args) {
            
		double valh, salario;
    String nombre;
    int htrab ;
    
		Scanner entrada= new Scanner(System.in);
		System.out.println("Nombre del trabajador");
		nombre = entrada.next();
		System.out.println("Numero de horas trabajadas");
		htrab = entrada.nextInt();
    System.out.println("Valor hora de trabajo");
		valh = entrada.nextDouble();
		if (htrab > 40) {
                        htrab = htrab - 40;
                        if (htrab > 8) {
                            htrab = htrab - 8;
                            salario = (40*valh) + (valh*2*8) + (valh*3*htrab);
                        }
                        else {
                            salario = (valh * 40) + (htrab*2*valh);  
                        }
		}
                else {
                    salario = (htrab * valh);
                }
                System.out.println("El trabajador " + nombre);
                System.out.println("Recibe un salario de $" + salario);
                
	}
}
