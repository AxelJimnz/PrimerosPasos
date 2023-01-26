import javax.swing.*;
public class AccesoAplicacion {
    public static void main(String[] args) {
        String clave="ALEXA";

        String password="";

        while(clave.equals(password)==false){
            password= JOptionPane.showInputDialog(null, "INTRODUCE LA CONTRASEÑA");
            if(clave.equals(password)==false){
                System.out.println("CONTRASEÑA INCORRECTA. VUELVA A INTENTARLO ");
            }                     
        
        }
        System.out.println("CONTRASEÑA CORRECTA. ACCESO PERMITIDO");
    }
}
