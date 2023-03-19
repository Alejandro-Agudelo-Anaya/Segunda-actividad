package segunda_actividad;
import java.util.Scanner;
public class capitulo4_actividad14 {
    public static void main(String[] args) {

        int ventas1, ventas2, ventas3, ventasgeneral,salario;
        double porcentaje;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese las ventas del primer departamento ");
        ventas1 = entrada.nextInt();
        
        System.out.println("Ingrese las ventas del segundo departamento ");
        ventas2 = entrada.nextInt();
        System.out.println("Ingrese las ventas del tercer departamento ");
        ventas3 = entrada.nextInt();
        
        System.out.println("Ingrese el salario de los vendedores ");
        salario = entrada.nextInt();
        
        ventasgeneral = ventas1 +ventas2+ventas3;
        
        porcentaje = ventasgeneral*33/100;
        
        if(ventas1>porcentaje) {
		System.out.println("El salario de los vendedores de departamento 1 es: "+salario*1.2);
        }
	else {
		System.out.println("El salario de los vendedores de departamento 1 es: "+salario);
	}
		
	if(ventas2>porcentaje) {
		System.out.println("El salario de los vendedores de departamento 2 es: "+salario*1.2);
        }
	else {
		System.out.println("El salario de los vendedores de departamento 2 es: "+salario);
	}
		
	if(ventas3>porcentaje) {
		System.out.println("El salario de los vendedores de departamento 3 es: "+salario*1.2);
        }
	else {
		System.out.println("El salario de los vendedores de departamento 3 es: "+salario);
		}
    }
}
