package conceptosbasicos;
import java.util.*;
public class EvaluaEdad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("INTRODUCE TU EDAD: ");
        int edad = in.nextInt();

        if(edad<18){
            System.out.println("ERES ADOLESCENTE");
        } else if(edad<40){
            System.out.println("ERES JOVEN");
        }else if(edad<65){
            System.out.println("ERES MADURO");
        }else{
            System.out.println("CUIDATE XD");
        }
    
    }
}
