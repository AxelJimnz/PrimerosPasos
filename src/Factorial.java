import java.util.concurrent.RecursiveTask;

import javax.swing.*;
public class Factorial {
    public static void main(String[] args) {
        
        Long resultado=1L;
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL NUMERO DEL CUAL QUIERE SABER EL FACTORIAL"));

        for(int i=numero; i>0;i--){
            resultado=resultado+i;
        }

        System.out.println("EL FACTORIAL DE "+numero+ " ES: " +resultado);
        
    }
}
