package conceptosbasicos;
import java.util.*;
public class EntradaEjemplo1 {
    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Introduce tu nombre, por favor");
            String nombre_usuario=entrada.nextLine();

            System.out.println("Introduce tu edad");
            int edad_usuario=entrada.nextInt();

            System.out.println("Hola usuario: "+nombre_usuario+". El siguiente año tendras "+(edad_usuario+1)+ " años.");
        }
    }
}
