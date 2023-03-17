import java.util.Scanner;
public class Inicio {
    
    public static void main(String[] args) {

        double lado, perimetro, area, altura;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del lado del triangulo en metros ");
        lado = entrada.nextInt();
        perimetro = lado*3;
        altura = (lado * Math.sqrt(3))/2;
        area = (lado*altura)/2 ;

        System.out.println("El perimetro es de " + perimetro + " metros");
        System.out.println("La altura es de " + altura + " metros");
        System.out.println("El area es de " + area + " metros cuadrados");

    }
}
