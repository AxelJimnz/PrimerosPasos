package poo;

import javax.swing.JOptionPane;

public class UsoCoche {
    public static void main(String[] args) {
        Coche Tesla = new Coche();


        Tesla.estableceColor(JOptionPane.showInputDialog(null, "INGRESE EL COLOR DEL AUTO"));
        System.out.println(Tesla.dime_datos_generaleString());
        System.out.println(Tesla.dimeColor());

        Tesla.configura_asientos(JOptionPane.showInputDialog(null, "¿TIENE ASIENTOS DE CUERO? \n SI/NO"));
        System.out.println(Tesla.dime_asientos());  

        Tesla.configura_climatizador(JOptionPane.showInputDialog(null, "¿TIENE ACLIMATIZADOR? \n SI/NO"));
        System.out.println(Tesla.dime_aclimatizador());

        System.out.println(Tesla.dime_peso_coche());

        System.out.println("EL PRECIO FINAL DEL AUTOMOVIL ES: " +Tesla.precio_coche());


    }
}
