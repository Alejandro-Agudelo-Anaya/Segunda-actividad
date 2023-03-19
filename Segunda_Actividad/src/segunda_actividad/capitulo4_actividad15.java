package segunda_actividad;
import java.util.Scanner;
public class capitulo4_actividad15 {
    
    public static void main(String[] args) {

        int peso1, peso2, peso3, peso4;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el peso de la esfera 1  ");
        peso1 = entrada.nextInt();
        
        System.out.println("Ingrese el peso de la esfera 2  ");
        peso2 = entrada.nextInt();
        
        System.out.println("Ingrese el peso de la esfera 3  ");
        peso3 = entrada.nextInt();
        
        System.out.println("Ingrese el peso de la esfera 4  ");
        peso4 = entrada.nextInt();
        
        if(peso1==peso2){
            if (peso2==peso3){
                if (peso3 < peso4 ){
                    System.out.println("La esfera 4 peso mas que las otras ");
                }
                else{
                    System.out.println("La esfera 4 peso menos que las otras ");
                }
            }
            else{
                if (peso3 > peso4 ){
                    System.out.println("La esfera 3 peso mas que las otras ");
                }
                else{
                    System.out.println("La esfera 3 peso menos que las otras ");
                }
            }
            
        }
        else{
            if(peso1 == peso3){
                if (peso2 < peso4 ){
                    System.out.println("La esfera 2 peso mas que las otras ");
                }
                else{
                    System.out.println("La esfera 2 peso menos que las otras ");
                }
            }
            else{
                if (peso1 < peso4 ){
                    System.out.println("La esfera 1 peso mas que las otras ");
                }
                else{
                    System.out.println("La esfera 1 peso menos que las otras ");
                }
            }
        }
    }
}
