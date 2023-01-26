import javax.swing.JOptionPane;
public class EntradaNumeros {
    public static void main(String[] args) {
        //double x=10000.0;
        //System.out.printf("%1.2f", x/3);
        
        String num1=JOptionPane.showInputDialog(null, "INTRODUCE UN NUMERO: ");
        double num2=Double.parseDouble(num1);

        System.out.println("LA RAIZ DE "+num2+ " ES: " );
        System.out.printf("%1.2f", Math.sqrt(num2));        
    }
}
