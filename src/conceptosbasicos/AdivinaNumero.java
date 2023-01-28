package conceptosbasicos;

import java.util.*;
public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int aleatorio= (int) (Math.random()*100);

        int numero=0;
        int intentos=0;

        do{
            System.out.println("INTRODUCE UN NUMERO: ");
            numero = in.nextInt();
            
            if(aleatorio<numero){
                System.out.println("BAJA MAS");
            }else if(numero<aleatorio){
                System.out.println("SUBE MAS");
            }
            intentos++;
        }while(numero!=aleatorio);
        
        System.out.println("NUMERO ADIVINADO");
        System.out.println("HICISTE "+intentos+ " INTENTOS");

    }
}
