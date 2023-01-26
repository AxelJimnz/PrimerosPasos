import javax.swing.*;
public class EntradaEjemplo2 {
    public static void main(String[] args) {
        String nombre_ususario =JOptionPane.showInputDialog(null, "INTRODUCE TU NOMBRE: ");
        
        String edad=JOptionPane.showInputDialog(null, "INTRODUCE TU EDAD: ");
        int edad_usuario=Integer.parseInt(edad);

        edad_usuario++;

        System.out.println("HOLA " +nombre_ususario+". El año que viene tendras "+(edad_usuario)+ " años");

    }
}
