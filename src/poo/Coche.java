package poo;

public class Coche {
    //Caracteristicas comunes en varios tipos de coche
    private int ruedas; // Modificadores de acceso // Encapsular variale
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;

    //Propiedades que pueden variar en otro autos
    private String color;
    private int peso_total;
    private boolean asientosCuero, climatizador;

    //Void no devueñve ningun valor ((:
    public void estableceColor(String color_coche){ //METODO SETTER
        color = color_coche;
    }

    public String dimeColor(){ //METODO GETTER
        return "EL COLOR DEL COCHE ES: " +color;
    }
    // Nos ayuda a dar un estado inicial a nuestro objeto (:
    // Metodos nos ayudan a hacer que nuestras clases esten concectada
    // y funcionen como una unidad

    public Coche() { 
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
    }

    public String dime_datos_generaleString(){ 
        return "La plataforma tiene "   + ruedas +   " ruedas" +
        ". Mide "   +largo/1000+  " metros de ancho de " +ancho+
        " cm y un peso de plataforma de "+peso_plataforma+" kg";
    }
    
    public void configura_asientos(String asientosCuero){
        if(asientosCuero.equalsIgnoreCase("si")){
            this.asientosCuero=true;
        }else{
            this.asientosCuero=false;
        } //This hacer referencia a la propia clase
    }
    public String dime_asientos(){
        if(asientosCuero==true){
            return "EL COCHE TIENE ASIENTOS DE CUERO";
        }else{
            return "EL COCHE TIENE ASIENTOS DE SERIE";
        }
    }

    public void configura_climatizador(String climatizador){
        if(climatizador.equalsIgnoreCase("si")){
            this.climatizador=true;
        }else{
            this.climatizador=false;
        }
    }

    public String dime_aclimatizador(){
        if(climatizador==true){
            return "EL COCHE INCLUYE ACLIMATIZADOR";
        }else{
            return "EL COCHE INCLUYE AIRE ACONDICIONADO";
        }
    }

    //Metodo con getter y setter pero no es tan recomendable
    public String dime_peso_coche(){
        int peso_carroceria=500;
        peso_total = peso_plataforma + peso_carroceria;

        if(asientosCuero==true){
            peso_total=peso_total+50;
        }
        if(climatizador==true){
            peso_total=peso_total+20;
        }

        return ("EL peso del coche es: " +peso_total);
    }

    //Metodo que nos devuelve el precio del coche
    public int precio_coche(){//GETTER
        int precio_final=10000;

        if(asientosCuero==true){
            precio_final+=2000;
        }
        
        if (climatizador==true){
            precio_final+=1500;
        }

        return precio_final;
    }
}
