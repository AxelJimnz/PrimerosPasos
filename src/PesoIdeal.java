import javax.swing.*;
public class PesoIdeal {
    public static void main(String[] args) {
        String genero= "";

        do {
            genero=JOptionPane.showInputDialog(null, "INTRODUCE TU GENERO (H/M)");


        } while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);

        int altura=Integer.parseInt(JOptionPane.showInputDialog(null, "INTRODUCE ALTURA EN CM"));

        int pesoideal=0;
        
        if(genero.equalsIgnoreCase("H")){
            pesoideal= altura-110;
        }else if(genero.equalsIgnoreCase("M")){
            pesoideal= altura-120;
        }

        System.out.println("TU PESO IDEAL ES: "+pesoideal+ " kg");

    }
}
