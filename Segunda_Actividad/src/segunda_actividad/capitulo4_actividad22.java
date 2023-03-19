package segunda_actividad;
import java.util.Scanner;
public class capitulo4_actividad22 {
    
    public static void main(String[] args) {

        int hora, horasTrabajadas;
        String nombre;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del empleado ");
        nombre = entrada.next();
        System.out.println("Numero de horas trabajadas");
		horasTrabajadas = entrada.nextInt();
        System.out.println("Valor hora de trabajo");
		hora = entrada.nextInt();
        
        System.out.println("El nombre del trabajador es: "+nombre);
        
        if(horasTrabajadas*hora > 450000){
            System.out.println("Y su salario mensual es: "+ horasTrabajadas*hora);
        }
    }

}
