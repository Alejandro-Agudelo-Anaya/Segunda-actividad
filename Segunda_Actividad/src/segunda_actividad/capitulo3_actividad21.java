package segunda_actividad;
import java.util.Scanner;

public class capitulo3_actividad21 {
    public static void main(String[] args) {

        double a,b,c, perimetro,semiperimetro, area;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del primer lado del triangulo en metros ");
        a = entrada.nextInt();
        System.out.println("Ingrese el valor del segundo lado del triangulo en metros ");
        b = entrada.nextInt();
        System.out.println("Ingrese el valor del tercer lado del triangulo en metros ");
        c = entrada.nextInt();
        perimetro = a+b+c;
        semiperimetro = perimetro/2;
        area = Math.sqrt(semiperimetro*(semiperimetro-a)*(semiperimetro-b)*(semiperimetro-c)) ;

        System.out.println("El perimetro es de " + perimetro + " metros");
        System.out.println("El semiperimetro es de " + semiperimetro + " metros");
        System.out.println("El area es de " + area + " metros cuadrados");

    }
}    

