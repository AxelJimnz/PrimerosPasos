import java.net.http.HttpResponse.ResponseInfo;

//import java.math.*;
public class Calculos_Math {
    public static void main(String[] args) {
        
    //double raiz=Math.sqrt(9); //Funcion para encontrar raiz cuadrada
    double base=5;
    double exponente=3;

    int resultado=(int)Math.pow(base, exponente);
    System.out.println("El resultado de "+base+ " elevado a "+exponente+ " es: " + resultado);       

    }
}