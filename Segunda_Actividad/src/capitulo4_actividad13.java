import java.util.Scanner;
public class Inicio {
    
	public static void main(String[] args) {
            
		double valor;
                String color;

		Scanner entrada= new Scanner(System.in);
		System.out.println("El valor de la compra es de $: ");
		valor = entrada.nextDouble();
		System.out.println("El color de la bolita es: ");
		color = entrada.next();
                if ("blanco".equals(color)){
                }
                else if("verde".equals(color)) {
                    valor = 0.90*valor;
		}
                else if ("amarillo".equals(color)){
                    valor = 0.75*valor;
                }
                else if ("azul".equals(color)){
                    valor = 0.50*valor;
                }
                else {
                    valor = 0*valor;
                }
                System.out.println("El cliente debe pagar $: " + valor);
	}
}
