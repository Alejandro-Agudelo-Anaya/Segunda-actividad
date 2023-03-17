import java.util.Scanner;
public class Inicio {
    
    public static void main(String[] args) {
            
	double a, b ,c;
        String mayor;

	Scanner entrada= new Scanner(System.in);
	System.out.println("El peso de la bola a es: ");
	a = entrada.nextDouble();
	System.out.println("El peso de la bola b es: ");
	b = entrada.nextDouble();
        System.out.println("El peso de la bola c es: ");
	c = entrada.nextDouble();
                
        if (a > b){
            if (a > c){
                mayor = "a";
            }
            else {
                mayor = "c";
            }
        }
        else{
            if(b > c){
                mayor = "b";
            }
            else {
                mayor = "c";
            }
        }    
        System.out.println("La bola de mayor peso es la " + mayor);

    }
}
