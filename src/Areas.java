import java.util.*;
import javax.swing.*;
public class Areas {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Elige una opcion: \n1: CUADRADO  \n2: RECTANGULO  \n3: TRIANGULO \n4: CIRCULO \n5: SALIR");
        int figura = in.nextInt();
        
        switch(figura){
            case 1:
                int lado =Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL LADO"));
                System.out.println("EL AREA DEL CUADRADO ES: " +Math.pow(lado, 2));
                break;

            case 2:
                int base=Integer.parseInt(JOptionPane.showInputDialog(null, "INTRODUCE LA BASE"));
                int altura=Integer.parseInt(JOptionPane.showInputDialog(null, "INTRODUZCA LA ALTURA"));
                System.out.println("EL AREA DEL RECTANGULO ES: " +(base*altura));
                break;

            case 3:
                base = Integer.parseInt(JOptionPane.showInputDialog(null, "INTRODUCE LA BASE: "));
                altura = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESA LA ALTURA: "));
                System.out.println("EL AREA DEL RECTANGULO ES: " +((base*altura)/2));
                break;
            
            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog(null, "INTRODUCE EL RADIO "));
                System.out.print("EL AREA DEL CIRCULO ES: ");
                System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
                break;

            default:
            System.out.println("OPCION NO VALIDA");
            
        }
    }
}
